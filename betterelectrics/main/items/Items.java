package betterelectrics.main.items;

import betterelectrics.main.blocks.BatteryBank;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Items {
	// elementari
	public static Item MgMnO2Cell, HgOCell, AlkalineCell, Ag2OCell, LiSOCl2Cell, LiFeS2Cell;
	// serie di 2
	public static Item MgMnO2Battery2s1p, HgOBattery2s1p, AlkalineBattery2s1p, Ag2OBattery2s1p, LiSOCl2Battery2s1p, LiFeS2Battery2s1p;
	
	// parallelo di 2
	public static Item MgMnO2Battery1s2p, HgOBattery1s2p, AlkalineBattery1s2p, Ag2OBattery1s2p, LiSOCl2Battery1s2p, LiFeS2Battery1s2p;
	
	// serie e parallelo di 2
	public static Item MgMnO2Battery2s2p, HgOBattery2s2p, AlkalineBattery2s2p, Ag2OBattery2s2p, LiSOCl2Battery2s2p, LiFeS2Battery2s2p;
	
	
    public static Item deadBattery;

	public static void initItems() {
		deadBattery = new ItemGeneric(15000, 15, "deadBattery", 64, "Throw it in the trash"); 
		MgMnO2Cell = new ItemPrimaryCell(15001, "MgMnO2Cell", 0, 7800, 1, 1, 30, "MgMnO₂");
		HgOCell = new ItemPrimaryCell(15002, "HgOCell", 1, 51000, 1, 1, 40, "HgO");
		AlkalineCell = new ItemPrimaryCell(15003, "AlkalineCell", 2, 10500, 1, 1, 50, "MnO₂");
		Ag2OCell = new ItemPrimaryCell(15004, "Ag2OCell", 3, 15000, 1, 1, 250, "Ag₂O");
		LiSOCl2Cell = new ItemPrimaryCell(15005, "LiSOCl2Cell", 4, 46500, 1, 1, 3000, "LiSOCl₂");
		LiFeS2Cell = new ItemPrimaryCell(15006, " LiFeS2Cell", 5, 18600, 1, 1, 500, "LiFeS₂");
		
		MgMnO2Battery2s1p = new ItemPrimaryCell(15011, "MgMnO2Battery2s1p", 16, 7800, 2, 1, 30, "MgMnO₂");
		HgOBattery2s1p = new ItemPrimaryCell(15012, "HgOBattery2s1p", 17, 51000, 2, 1, 40, "HgO");
		AlkalineBattery2s1p = new ItemPrimaryCell(15013, "AlkalineBattery2s1p", 18, 10500, 2, 1, 50, "MnO₂");
		Ag2OBattery2s1p = new ItemPrimaryCell(15014, "Ag2OBattery2s1p", 19, 15000, 2, 1, 250, "Ag₂O");
		LiSOCl2Battery2s1p = new ItemPrimaryCell(15015, "LiSOCl2Battery2s1p", 20, 46500, 2, 1, 3000, "LiSOCl₂");
		LiFeS2Battery2s1p = new ItemPrimaryCell(15016, " LiFeS2Battery2s1p", 21, 18600, 2, 1, 500, "LiFeS₂");
		
		MgMnO2Battery1s2p = new ItemPrimaryCell(15021, "MgMnO2Battery1s2p", 32, 7800, 1, 2, 30, "MgMnO₂");
		HgOBattery1s2p = new ItemPrimaryCell(15022, "HgOBattery1s2p", 33, 51000, 1,21, 40, "HgO");
		AlkalineBattery1s2p = new ItemPrimaryCell(15023, "AlkalineBattery1s2p", 34, 10500, 2, 1, 50, "MnO₂");
		Ag2OBattery1s2p = new ItemPrimaryCell(15024, "Ag2OBattery1s2p", 35, 15000, 2, 1, 250, "Ag₂O");
		LiSOCl2Battery1s2p = new ItemPrimaryCell(15025, "LiSOCl2Battery1s2p", 36, 46500, 2, 1, 3000, "LiSOCl₂");
		LiFeS2Battery1s2p = new ItemPrimaryCell(15026, " LiFeS2Battery1s2p", 37, 18600, 2, 1, 500, "LiFeS₂");
		
		MgMnO2Battery2s2p = new ItemPrimaryCell(15031, "MgMnO2Battery2s2p", 48, 7800, 2, 2, 30, "MgMnO₂");
		HgOBattery2s2p = new ItemPrimaryCell(15032, "HgOBattery2s2p", 49, 51000, 2, 2, 40, "HgO");
		AlkalineBattery2s2p = new ItemPrimaryCell(15033, "AlkalineBattery2s2p", 50, 10500, 2, 2, 50, "MnO₂");
		Ag2OBattery2s2p = new ItemPrimaryCell(15034, "Ag2OBattery2s2p", 51, 15000, 2, 2, 250, "Ag₂O");
		LiSOCl2Battery2s2p = new ItemPrimaryCell(15035, "LiSOCl2Battery2s2p", 52, 46500, 2, 2, 3000, "LiSOCl₂");
		LiFeS2Battery2s2p = new ItemPrimaryCell(15036, " LiFeS2Battery2s2p", 53, 18600, 2, 2, 500, "LiFeS₂");
		 
	}
	
	public static void registerLanguages() {
		LanguageRegistry.addName(deadBattery, "Spent Battery");
		LanguageRegistry.addName(MgMnO2Cell, "Magnesium Oxide Battery");
		LanguageRegistry.addName(HgOCell, "Mercury Oxide Battery");
		LanguageRegistry.addName(AlkalineCell, "Alkaline Battery");
		LanguageRegistry.addName(Ag2OCell, "Silver Oxide Battery");
		LanguageRegistry.addName(LiSOCl2Cell, "Lithium Thionyl Chloride Battery");
		LanguageRegistry.addName(LiFeS2Cell, "Lithium Iron Disulphide Battery");
		
		LanguageRegistry.addName(MgMnO2Battery2s1p, "Magnesium Oxide Battery Pack (2s1p)");
		LanguageRegistry.addName(HgOBattery2s1p, "Mercury Oxide Battery Pack (2s1p)");
		LanguageRegistry.addName(AlkalineBattery2s1p, "Alkaline Battery Pack (2s1p)");
		LanguageRegistry.addName(Ag2OBattery2s1p, "Silver Oxide Battery Pack (2s1p)");
		LanguageRegistry.addName(LiSOCl2Battery2s1p, "Lithium Thionyl Chloride Battery Pack (2s1p)");
		LanguageRegistry.addName(LiFeS2Battery2s1p, "Lithium Iron Disulphide Battery Pack (2s1p)");
		
		LanguageRegistry.addName(MgMnO2Battery1s2p, "Magnesium Oxide Battery Pack (1s2p)");
		LanguageRegistry.addName(HgOBattery1s2p, "Mercury Oxide Battery Pack (1s2p)");
		LanguageRegistry.addName(AlkalineBattery1s2p, "Alkaline Battery Pack (1s2p)");
		LanguageRegistry.addName(Ag2OBattery1s2p, "Silver Oxide Battery Pack (1s2p)");
		LanguageRegistry.addName(LiSOCl2Battery1s2p, "Lithium Thionyl Chloride Battery Pack (1s2p)");
		LanguageRegistry.addName(LiFeS2Battery1s2p, "Lithium Iron Disulphide Battery Pack (1s2p)");
		
		LanguageRegistry.addName(MgMnO2Battery2s2p, "Magnesium Oxide Battery Pack (2s2p)");
		LanguageRegistry.addName(HgOBattery2s2p, "Mercury Oxide Battery Pack (2s2p)");
		LanguageRegistry.addName(AlkalineBattery2s2p, "Alkaline Battery Pack (2s2p)");
		LanguageRegistry.addName(Ag2OBattery2s2p, "Silver Oxide Battery Pack (2s2p)");
		LanguageRegistry.addName(LiSOCl2Battery2s2p, "Lithium Thionyl Chloride Battery Pack (2s2p)");
		LanguageRegistry.addName(LiFeS2Battery2s2p, "Lithium Iron Disulphide Battery Pack (2s2p)");
	}
}
