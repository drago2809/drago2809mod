package com.drago2809.ModNaam.items;

import com.drago2809.ModNaam.Main;

import net.minecraft.item.ItemPickaxe;

public class ItemModPickaxe extends ItemPickaxe{

	public ItemModPickaxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(ModItems.tabModNaam); // placing the item in creative tab
	}

	private void setTextureName(String string) {
		
		
	}
}
