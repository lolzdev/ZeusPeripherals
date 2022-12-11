package betterelectrics.main.tileentities;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntities {
	public static void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityBatteryBank.class, "TileEntityBatteryBank");
	}
}
