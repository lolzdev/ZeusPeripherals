package betterelectrics.main.items;

import java.util.List;

import betterelectrics.main.CreativeTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ic2.api.ElectricItem;
import ic2.api.IBoxable;
import ic2.api.IElectricItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPrimaryCell extends Item implements IBoxable, IElectricItem {
	
    /**
	 * Pila non ricaricabile
	 * @param id ID item
	 * @param itemName Nome dell'oggetto
	 * @param iconIndex ID della Texture
	 * @param capacity EU contenuti
	 * @param series Celle in serie (aka tier) aumenta la tensione (1, 2 o 3)
	 * @param parallel Celle in parallelo (moltiplica la capacità)
	 * @param specificPower (quanto veloce si scarica)
	 * @param chemistry Chimica della cella (tooltip)
	 * @return una pila non ricaricabile
	 */

    public int capacity;
    public int series;
    public int totalCapacity;
    public int dischargeSpeed;
    public String chemistry;
   
    
    public ItemPrimaryCell(int id, String itemName, int iconIndex, int capacity, int series, int parallel, int specificPower, String chemistry) {
	    	    	
    	super(id-256);
        this.setIconIndex(iconIndex);
        this.setItemName(itemName);
        this.setCreativeTab(CreativeTab.tabBetterElectrics);
        this.setTextureFile("/betterelectrics/main/textures/items.png");
        this.setMaxStackSize(1);
        this.setMaxDamage(100);
        this.setNoRepair();
        this.totalCapacity = capacity * parallel;
        this.dischargeSpeed = specificPower * parallel; 
        this.chemistry = chemistry;


	}
    
	@Override
    public boolean canBeStoredInToolbox(final ItemStack itemstack) {
        return true;
    }


	@Override
	public boolean canProvideEnergy() {
		return true;
	}


	@Override
	public int getChargedItemId() {
		return super.itemID;
	}


	@Override
	public int getEmptyItemId() {
		return Items.deadBattery.itemID;
	}


	@Override
	public int getMaxCharge() {
		return totalCapacity;
	}


	@Override
	public int getTier() {
		return series;
	}


	@Override
	public int getTransferLimit() {
		return dischargeSpeed;
	}
	
	public boolean getIsRepairable(final ItemStack par1ItemStack, final ItemStack par2ItemStack) {
		return false;
	}

	public void getSubItems(final int i, final CreativeTabs tabs, final List itemList) {
		final ItemStack charged = new ItemStack((Item) this, 1);
		ElectricItem.charge(charged, Integer.MAX_VALUE, Integer.MAX_VALUE, true, false);
		itemList.add(charged);
	}
	
	@Override
	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		ElectricItem.charge(par1ItemStack, Integer.MAX_VALUE, Integer.MAX_VALUE, true, false);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
		par3List.add("\247bType: \247eNon-rechargeable");
		par3List.add("\247bChemistry: \247e" + chemistry);
	}
}
