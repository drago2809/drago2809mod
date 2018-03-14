package com.drago2809.ModNaam.items;

import com.drago2809.ModNaam.Main;
import com.drago2809.ModNaam.blocks.ModBlocks;

import net.minecraft.item.ItemHoe;

public class ItemModHoe extends ItemHoe{

	public ItemModHoe(String unlocalizedName, ToolMaterial material) {
	
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(ModBlocks.tabHandleiding); // placing the item in creative tab
	}

	private void setTextureName(String string) {
		
		
	}
}
