package betterelectrics.main.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
/*
 * Blocco batteria
 * Fai quel che vuoi fabri io ti ho messo questi, ma usali come vuoi
 * @param id ID del blocco
 * @param textureID ID della Texture del blocco
 * @param output EU/t uscita
 * @param storage EU contenuti
 */

public class BatteryBank extends Block {


	
	
	private static final Material material = Material.iron;
	public BatteryBank(int id, int textureID, int output, int storage) {
		super(id, textureID, material);
		this.setTextureFile("/com/rgbcraft/nfe/textures/blocks.png");
		this.setHardness(1.0f);
		this.setBurnProperties(this.blockID, 20, 20);
	}
	

}
