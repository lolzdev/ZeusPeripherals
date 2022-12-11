package betterelectrics.main.items;

import java.util.List;

import betterelectrics.main.CreativeTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemGeneric extends Item {
	
	String toolTip;
	
	/**
	 * Registra un oggetto generico
	 * @param id ID dell'oggetto
	 * @param textureId ID della texture
	 * @param itemName nome oggetto
	 * @param maxStackSize Max stack size
	 * @return Item.
	 */

	public ItemGeneric(int id, int textureId, String itemName, int maxStackSize, String toolTip) {
		super(id-256);
		this.setTextureFile("/betterelectrics/main/textures/items.png");
		this.setIconIndex(textureId);
		this.setCreativeTab(CreativeTab.tabBetterElectrics);
		this.setItemName(itemName);
		this.setMaxStackSize(maxStackSize);
		this.toolTip = toolTip;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
		par3List.add("\247b" + this.toolTip);
	}

}
