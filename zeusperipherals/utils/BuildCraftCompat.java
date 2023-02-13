package zeusperipherals.utils;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BuildCraftCompat {

    public enum BuildCraftModule {
        Factory("BuildCraftFactory"), Transport("BuildCraftTransport"), Energy("BuildCraftEnergy");

        private String fullName;

        BuildCraftModule(String fullName) {
            this.fullName = fullName;
        }

        public String getFullName() {
            return this.fullName;
        }

    }
    public static Item getItem(BuildCraftModule module, String itemName) {
        try {
            return (Item) Class.forName("buildcraft." + module.getFullName()).getField(itemName).get(null);
        } catch (Exception ex) {
        }
        return null;
    }

    public static Block getBlock(BuildCraftModule module, String blockName) {
        try {
            return (Block) Class.forName("buildcraft." + module.getFullName()).getField(blockName).get(null);
        } catch (Exception ex) {
        }
        return null;
    }

}
