package com.drago2809.ModNaam.items;

import com.drago2809.ModNaam.Main;

import net.minecraft.item.ItemHoe;

public class ItemModHoe extends ItemHoe{

	public ItemModHoe(String unlocalizedName, ToolMaterial material) {
	
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(ModItems.tabModNaam); // placing the item in creative tab
	}

	private void setTextureName(String string) {
		
		
	}
}
