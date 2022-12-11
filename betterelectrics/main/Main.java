package betterelectrics.main;
import betterelectrics.main.blocks.Blocks;
import betterelectrics.main.handlers.CraftingHandler;
import betterelectrics.main.items.Items;
import betterelectrics.main.proxies.CommonProxy;
import betterelectrics.main.tileentities.TileEntities;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.src.BaseMod;

@Mod(name="BetterElectrics", version="1.0", modid="betterelectrics", dependencies="required-after:IC2; after:factorization; after:Railcraft; after:ThermalExpansion; after:ThermalExpansion|Transport; after:ThermalExpansion|Energy; after:ThermalExpansion|Factory; after:XyCraft; after:MetallurgyCore; after:MetallurgyBase; after:MetallurgyEnder; after:MetallurgyFantasy; after:MetallurgyNether; after:MetallurgyPrecious; after:MetallurgyUtility; after:BuildCraft|Silicon; after:BuildCraft|Core; after:BuildCraft|Transport; after:BuildCraft|Factory; after:BuildCraft|Energy; after:BuildCraft|Builders;")
public class Main extends BaseMod{
	
	//@SidedProxy(clientSide="betterelectrics.main.proxies.ClientProxy", serverSide="betterelectrics.main.proxies.ServerProxy")
	//public static CommonProxy proxy;
	
	@Override
	public String getVersion() {
		return "1.0";
	}

	@Override
	public void load() {

		
	}
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
	}
	
	
	@Init
	public void init(FMLInitializationEvent event) {
		//proxy.init(event);
		//Blocks.initBlocks();
		//Blocks.registerBlocks();
		//Blocks.registerLanguages();
		Items.initItems();
		Items.registerLanguages();
		CraftingHandler.AddCraftings();
		//TileEntities.registerTileEntities();
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
	    //proxy.postInit(event);
	}
}
