package net.nvckxwsky.endplusplus;

import net.fabricmc.api.ModInitializer;
import net.nvckxwsky.endplusplus.block.ModBlocks;
import net.nvckxwsky.endplusplus.block.ModFlammableBlockRegistry;
import net.nvckxwsky.endplusplus.item.ModItemGroup;
import net.nvckxwsky.endplusplus.item.ModItems;
import net.nvckxwsky.endplusplus.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndPlusPlus implements ModInitializer {
	public static final String MOD_ID = "endplusplus";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroup.registerItemGroup();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
		ModFlammableBlockRegistry.registerFlammableBlocks();



	}
}
