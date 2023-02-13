package zeusperipherals.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import zeusperipherals.CreativeTab;
import zeusperipherals.entities.TileEntityFluidMeter;
import zeusperipherals.utils.BlockUtils;

public class BlockFluidMeter extends BlockContainer {

    protected BlockFluidMeter(int id, Material material) {
        super(id, material);

        setBlockName("fluidExtractor");
        setCreativeTab(CreativeTab.tabZeusPeripherals);
        setTextureFile("/zeusperipherals/textures/textures.png");
        setHardness(1.5F);
        setResistance(10.0F);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public int getBlockTextureFromSideAndMetadata(int side, int meta) {
        if (meta == 0) {
            if (side == ForgeDirection.DOWN.ordinal()) {
                return 4;
            } else if (side == ForgeDirection.UP.ordinal()) {
                return 5;
            } else if (side == ForgeDirection.WEST.ordinal()) {
                return 0;
            } else if (side == ForgeDirection.SOUTH.ordinal()) {
                return 2;
            } else if (side == ForgeDirection.EAST.ordinal()) {
                return 3;
            } else if (side == ForgeDirection.NORTH.ordinal()) {
                return 1;
            } else {
                return 4;
            }
        }

        if (side == meta) {
            return 2;
        } else if (side == ForgeDirection.getOrientation(meta).getOpposite().ordinal()) {
            return 1;
        } else if (side == BlockUtils.getAdjacent(ForgeDirection.getOrientation(meta)).ordinal()) {
            return 3;
        } else if (side == BlockUtils.getAdjacent(ForgeDirection.getOrientation(meta)).getOpposite().ordinal()) {
            return 0;
        } else if (side == ForgeDirection.DOWN.ordinal()){
            return 4;
        } else {
            return 5;
        }
    }

    @Override
    public TileEntity createNewTileEntity(World var1) {
        return new TileEntityFluidMeter();
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving entity) {
        super.onBlockPlacedBy(world, x, y, z, entity);

        world.setBlockMetadataWithNotify(x, y, z, BlockUtils.getAdjacent(BlockUtils.getBlockDirection(entity.rotationYaw)).ordinal());
    }
}
