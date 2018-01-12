package com.drago2809.ModNaam.items;

import com.drago2809.ModNaam.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ItemModChainsaw extends ItemAxe{

	public ItemModChainsaw(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(ModItems.tabModNaam); // placing the item in creative tab
	}

	private void setTextureName(String string) {
		
		
	}
}
