package betterelectrics.main.blocks;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class Blocks {
	

	public static Block LiCoO2BatteryBank;
    

	public static void initBlocks() {
		LiCoO2BatteryBank = new BatteryBank(2000, 0, 8192, 20000000);
	}
	public static void registerBlocks() {
		GameRegistry.registerBlock(LiCoO2BatteryBank, "LiCoO2BatteryBank");
	}

	public static void registerLanguages() {
		LanguageRegistry.addName(LiCoO2BatteryBank, "Lithium-Cobalt Battery Bank");
	}
}
