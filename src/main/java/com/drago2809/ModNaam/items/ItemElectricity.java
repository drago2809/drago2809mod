package com.drago2809.ModNaam.items;

import com.drago2809.ModNaam.Main;

import net.minecraft.item.ItemPickaxe;

public class ItemElectricity extends ItemPickaxe{

	public ItemElectricity(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(ModItems.tabModNaam); // placing the item in creative tab
		this.hasEffect(null);
	}

	private void setTextureName(String string) {
		
		
	}
}
