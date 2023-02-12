package zeusperipherals.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.src.BaseMod;
import zeusperipherals.blocks.Blocks;
import zeusperipherals.entities.Entities;

@Mod(name = "ZeusPeripherals", version = "1.0", modid = "zeusperipherals")
public class Main extends BaseMod {
    public static final String MODID = "zeusperipherals";

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public void load() {}

    @Mod.PreInit
    public void preInit(FMLPreInitializationEvent event) {
        Blocks.init();
        Entities.init();
    }

    @Mod.Init
    public void init(FMLInitializationEvent event) {}
}
