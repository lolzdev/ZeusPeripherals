package betterelectrics.main.handlers;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import betterelectrics.main.blocks.Blocks;
import betterelectrics.main.items.Items;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CraftingHandler {

	public static void AddCraftings() {
		try {
		CraftingHelpers.addShapedOreRecipe(new ItemStack(Items.MgMnO2Cell, 1), 
				new Object [] {" W ", "IMI", "IGI",
						'W', ic2.api.Items.getItem("copperCableItem"),
						'I', "ingotRefinedIron",
						'M', "dustMagnesium",
						'G', "dustManganese"
						});
		
		CraftingHelpers.addShapedOreRecipe(new ItemStack(Items.HgOCell, 1), 
				new Object [] {" W ", "ZHZ", "ZHZ",
						'W', ic2.api.Items.getItem("copperCableItem"),
						'H', "molecule_1hg",
						'Z', "ingotZinc"
						});
		
		CraftingHelpers.addShapedOreRecipe(new ItemStack(Items.AlkalineCell, 1), 
				new Object [] {" W ", "IZI", "IGI",
						'W', ic2.api.Items.getItem("copperCableItem"),
						'I', "ingotRefinedIron",
						'Z', "ingotZinc",
						'G', "dustManganese"
						});
		
		CraftingHelpers.addShapedOreRecipe(new ItemStack(Items.Ag2OCell, 1), 
				new Object [] {" W ", "IZI", "ISI",
						'W', ic2.api.Items.getItem("copperCableItem"),
						'I', "ingotRefinedIron",
						'Z', "ingotZinc",
						'S', "ingotSilver"
						});
		
		CraftingHelpers.addShapedOreRecipe(new ItemStack(Items.LiSOCl2Cell, 1), 
				new Object [] {" W ", "CSC", "ILI",
						'W', ic2.api.Items.getItem("copperCableItem"),
						'I', "ingotRefinedIron",
						'C', "molecule_1cl",
						'S', "molecule_1s",
						'L', "molecule_1li"
						});
		
		CraftingHelpers.addShapedOreRecipe(new ItemStack(Items.LiFeS2Cell, 1), 
				new Object [] {" W ", "FSF", "ILI",
						'W', ic2.api.Items.getItem("copperCableItem"),
						'I', "ingotRefinedIron",
						'F', "ingotIron",
						'S', "molecule_1s",
						'L', "molecule_1li"
						});
		
		} catch(Exception e) {
			System.out.println("Errore durante l'aggiunta di ricette di celle primarie: " + e);
		}
		
		try {
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.MgMnO2Battery1s2p),
					new Object[] { "WW ", "BB ", "WW ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.MgMnO2Cell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.HgOBattery1s2p),
					new Object[] { "WW ", "BB ", "WW ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.HgOCell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.AlkalineBattery1s2p),
					new Object[] { "WW ", "BB ", "WW ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.AlkalineCell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.Ag2OBattery1s2p),
					new Object[] { "WW ", "BB ", "WW ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.Ag2OCell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.LiSOCl2Battery1s2p),
					new Object[] { "WW ", "BB ", "WW ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.LiSOCl2Cell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.LiFeS2Battery1s2p),
					new Object[] { "WW ", "BB ", "WW ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.LiFeS2Cell)
					});
			
			
		} catch(Exception e) {
			System.out.println("Errore durante l'aggiunta di ricette di configurazione 1s2p: " + e);
		}
		
		try {
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.MgMnO2Battery2s1p),
					new Object[] { "WB ", "WB ", "   ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.MgMnO2Cell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.HgOBattery2s1p),
					new Object[] { "WB ", "WB ", "   ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.HgOCell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.AlkalineBattery2s1p),
					new Object[] { "WB ", "WB ", "   ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.AlkalineCell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.Ag2OBattery2s1p),
					new Object[] { "WB ", "WB ", "   ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.Ag2OCell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.LiSOCl2Battery2s1p),
					new Object[] { "WB ", "WB ", "   ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.LiSOCl2Cell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.LiFeS2Battery2s1p),
					new Object[] { "WB ", "WB ", "   ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.LiFeS2Cell)
					});
			
		} catch(Exception e) {
			System.out.println("Errore durante l'aggiunta di ricette di configurazione 2s1p: " + e);
		}
		
		try {
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.MgMnO2Battery2s2p),
					new Object[] { "BB ", "BB ", "   ",
							'B', new ItemStack(Items.MgMnO2Cell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.HgOBattery2s2p),
					new Object[] { "BB ", "BB ", "   ",
							'B', new ItemStack(Items.HgOCell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.AlkalineBattery2s2p),
					new Object[] { "BB ", "BB ", "   ",
							'B', new ItemStack(Items.AlkalineCell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.Ag2OBattery2s2p),
					new Object[] { "BB ", "BB ", "   ",
							'B', new ItemStack(Items.Ag2OCell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.LiSOCl2Battery2s2p),
					new Object[] { "BB ", "BB ", "   ",
							'B', new ItemStack(Items.LiSOCl2Cell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.LiFeS2Battery2s2p),
					new Object[] { "BB ", "BB ", "   ",
							'B', new ItemStack(Items.LiFeS2Cell)
					});
			
		} catch(Exception e) {
			System.out.println("Errore durante l'aggiunta di ricette di configurazione 2s2p: " + e);
		}
	}
}
