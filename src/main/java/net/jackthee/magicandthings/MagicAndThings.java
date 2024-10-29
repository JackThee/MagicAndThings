package net.jackthee.magicandthings;

import net.fabricmc.api.ModInitializer;

import net.jackthee.magicandthings.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagicAndThings implements ModInitializer {


	public static final String MOD_ID = "magicandthings";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}