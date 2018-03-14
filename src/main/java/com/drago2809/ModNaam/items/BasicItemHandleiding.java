package com.drago2809.ModNaam.items;

import com.drago2809.ModNaam.blocks.ModBlocks;

import net.minecraft.item.Item;

public class BasicItemHandleiding extends Item {
	
	public BasicItemHandleiding(String unlocalizedName) {
		super();
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(ModBlocks.tabHandleiding); // placing the item in creative tab
	}
}