package net.iaconic.iaconicsmod;

import net.fabricmc.api.ModInitializer;

import net.iaconic.iaconicsmod.blocks.Blocks;
import net.iaconic.iaconicsmod.items.CustomItemGroups;
import net.iaconic.iaconicsmod.items.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IaconicsMod implements ModInitializer {
	public static final String MOD_ID = "iaconicsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Items.initialiseAllItems();
		Blocks.initialiseAllBlocks();
		CustomItemGroups.registerAllItemGroups();
	}
}