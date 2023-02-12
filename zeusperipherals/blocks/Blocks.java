package zeusperipherals.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks {
    public static Block fluidExtractor;

    public static void init() {
        fluidExtractor = new FluidMeter(1200, Material.iron);

        GameRegistry.registerBlock(fluidExtractor, "fluidExtractor");
        LanguageRegistry.addName(fluidExtractor, "Precision Fluid Meter");
    }
}
