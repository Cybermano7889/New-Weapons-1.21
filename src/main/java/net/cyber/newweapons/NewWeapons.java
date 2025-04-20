package net.cyber.newweapons;

import net.cyber.newweapons.block.ModBlocks;
import net.cyber.newweapons.item.ModItemGroups;
import net.cyber.newweapons.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewWeapons implements ModInitializer {
	public static final String MOD_ID = "newweapons";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}