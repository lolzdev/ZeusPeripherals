package zeusperipherals.entities;

import dan200.computer.api.IComputerAccess;
import dan200.computer.api.IPeripheral;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.liquids.ILiquidTank;
import net.minecraftforge.liquids.ITankContainer;
import net.minecraftforge.liquids.LiquidStack;
import net.minecraftforge.liquids.LiquidTank;
import zeusperipherals.utils.BlockUtils;

public class TileEntityFluidMeter extends TileEntity implements IPeripheral, ITankContainer {
    private final LiquidTank tank;
    private final LiquidTank excess;
    private boolean input = true;
    private boolean output = false;

    public TileEntityFluidMeter() {
        this.tank = new LiquidTank(0);
        this.excess = new LiquidTank(200000);
    }

    private ForgeDirection getSide() {
        return ForgeDirection.getOrientation(this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord));
    }

    @Override
    public String getType() {
        return "fluidMeter";
    }

    @Override
    public String[] getMethodNames() {
        return new String[] {"extract", "switchMode", "getAmount"};
    }

    @Override
    public Object[] callMethod(IComputerAccess computer, int method, Object[] args) throws Exception {
        switch (method) {
            case 0:
                if (args.length == 1) {
                    if (args[0] instanceof Double) {
                        this.tank.setCapacity(((Double) args[0]).intValue());
                        return new Object[0];
                    } else {
                        throw new IllegalArgumentException("Argument must be a number");
                    }
                } else {
                    throw new IllegalArgumentException("Too few arguments. Expected 1");
                }
            case 1:
                this.input = !input;
                this.output = !output;
                return new Object[0];
            case 3:
                return this.tank.getLiquid() == null ? new Object[] {0} : new Object[] {this.tank.getLiquid().amount};
        }

        return new Object[0];
    }

    @Override
    public boolean canAttachToSide(int var1) {
        return true;
    }

    @Override
    public void attach(IComputerAccess var1) {

    }

    @Override
    public void detach(IComputerAccess var1) {

    }

    @Override
    public int fill(ForgeDirection from, LiquidStack resource, boolean doFill) {
        if ((this.getSide() == from && input && this.tank.getLiquid() == null) || (this.tank.getLiquid() != null && this.tank.getCapacity() - this.tank.getLiquid().amount != 0 && input)) {
            return this.fill(0, resource, doFill);
        } else if (this.getSide() == from) {
            return this.fill(1, resource, doFill);
        }

        return 0;
    }

    @Override
    public int fill(int tankIndex, LiquidStack resource, boolean doFill) {
        if (tankIndex == 0) {
            if ((this.tank.getLiquid() == null || resource.isLiquidEqual(this.tank.getLiquid()) && (this.tank.getCapacity() - this.tank.getLiquid().amount) >= resource.amount)) {
                this.tank.fill(resource, doFill);
                return resource.amount;
            } else if ((this.tank.getCapacity() - this.tank.getLiquid().amount) <= resource.amount && (resource.isLiquidEqual(this.tank.getLiquid()) || this.tank.getLiquid() == null)) {
                LiquidStack stack = new LiquidStack(resource.itemID, resource.amount - (resource.amount - (this.tank.getCapacity() - this.tank.getLiquid().amount)));
                this.tank.fill(stack, doFill);
                return resource.amount - (resource.amount - (this.tank.getCapacity() - this.tank.getLiquid().amount));
            }
        } else if (tankIndex == 1) {
            if ((this.excess.getLiquid() == null || resource.isLiquidEqual(this.excess.getLiquid()) && (this.excess.getCapacity() - this.excess.getLiquid().amount) >= resource.amount)) {
                this.excess.fill(resource, doFill);
                return resource.amount;
            } else if ((this.excess.getCapacity() - this.excess.getLiquid().amount) <= resource.amount && (resource.isLiquidEqual(this.excess.getLiquid()) || this.excess.getLiquid() == null)) {
                LiquidStack stack = new LiquidStack(resource.itemID, resource.amount - (resource.amount - (this.excess.getCapacity() - this.excess.getLiquid().amount)));
                this.excess.fill(stack, doFill);
                return resource.amount - (resource.amount - (this.excess.getCapacity() - this.excess.getLiquid().amount));
            }
        }

        return 0;
    }

    @Override
    public LiquidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
        if (this.getSide().getOpposite() == from && output) {
            if (this.tank.getLiquid() != null) {
                return this.drain(0, maxDrain, doDrain);
            }
        } else if (ForgeDirection.getOrientation(BlockUtils.getAdjacent(this.getSide()).ordinal()) == from) {
            if (this.excess.getLiquid() != null) {
                return this.drain(1, maxDrain, doDrain);
            }
        }
        return null;
    }

    @Override
    public LiquidStack drain(int tankIndex, int maxDrain, boolean doDrain) {
        if (tankIndex == 0) {
            return this.tank.drain(maxDrain, doDrain);
        } else if (tankIndex == 1) {
            return this.excess.drain(maxDrain, doDrain);
        }
        return null;
    }

    @Override
    public ILiquidTank[] getTanks(ForgeDirection direction) {
        if (this.getSide() == direction || this.getSide().getOpposite() == direction) {
            return new ILiquidTank[] {this.tank, this.excess};
        } else if (ForgeDirection.getOrientation(BlockUtils.getAdjacent(this.getSide()).ordinal()) == direction) {
            return new ILiquidTank[] {this.excess};
        }
        return new ILiquidTank[0];
    }

    @Override
    public ILiquidTank getTank(ForgeDirection direction, LiquidStack type) {
        if (this.getSide() == direction || this.getSide().getOpposite() == direction) {
            return this.tank;
        } else if (ForgeDirection.getOrientation(BlockUtils.getAdjacent(this.getSide()).ordinal()) == direction) {
            return this.excess;
        }
        return null;
    }

    @Override
    public void writeToNBT(final NBTTagCompound compound) {
        super.writeToNBT(compound);

        if (this.tank.getLiquid() != null) {
            NBTTagCompound tag = new NBTTagCompound();
            this.tank.getLiquid().writeToNBT(tag);
            compound.setCompoundTag("tank", tag);
        }
    }

    @Override
    public void readFromNBT(final NBTTagCompound compound) {
        super.readFromNBT(compound);

        this.tank.setLiquid(LiquidStack.loadLiquidStackFromNBT(compound.getCompoundTag("tank")));
    }
}
