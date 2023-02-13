package zeusperipherals.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import railcraft.common.api.core.items.ItemRegistry;
import net.minecraft.item.ItemStack;
import zeusperipherals.utils.BuildCraftCompat;

public class Blocks {
    public static Block fluidExtractor;

    public static void init() {
        fluidExtractor = new BlockFluidMeter(1200, Material.iron);
    }

    public static void registerBlocks() throws ClassNotFoundException {
        GameRegistry.registerBlock(fluidExtractor, "fluidExtractor");
        LanguageRegistry.addName(fluidExtractor, "Precision Fluid Meter");
        GameRegistry.addShapedRecipe(new ItemStack(fluidExtractor),
                "IGI",
                "LTR",
                "VIV",
                'I', new ItemStack(Item.ingotIron),
                'G', new ItemStack(Block.thinGlass),
                'L', new ItemStack(Block.lever),
                'T', new ItemStack(BuildCraftCompat.getBlock(BuildCraftCompat.BuildCraftModule.Factory, "tankBlock")),
                'R', new ItemStack(Item.redstone),
                'V', ItemRegistry.getItem("machine.beta.tank.iron.valve", 1));
    }
}
