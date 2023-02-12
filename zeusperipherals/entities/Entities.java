package zeusperipherals.entities;

import cpw.mods.fml.common.registry.GameRegistry;

public class Entities {
    public static void init() {
        GameRegistry.registerTileEntity(TileEntityFluidMeter.class, "tileEntityFluidExtractor");
    }
}
