package betterelectrics.main.tileentities;

import ic2.api.Direction;
import ic2.api.IEnergyStorage;
import ic2.api.energy.tile.IEnergySink;
import ic2.api.energy.tile.IEnergySource;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBatteryBank extends TileEntity implements IEnergySink, IEnergySource, IEnergyStorage {

	@Override
	public boolean acceptsEnergyFrom(TileEntity emitter, Direction direction) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAddedToEnergyNet() {
		return false;
	}

	@Override
	public boolean emitsEnergyTo(TileEntity receiver, Direction direction) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getStored() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setStored(int energy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int addEnergy(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCapacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getOutput() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isTeleporterCompatible(Direction side) {
		return true;
	}

	@Override
	public int getMaxEnergyOutput() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int demandsEnergy() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int injectEnergy(Direction directionFrom, int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxSafeInput() {
		return 8192;
	}

}
