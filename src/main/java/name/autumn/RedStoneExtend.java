package name.autumn;

import name.autumn.block.ModBlocks;
import name.autumn.item.ModItemGroup;
import name.autumn.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedStoneExtend implements ModInitializer {
	public static final String MOD_ID = "autumn";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("RedStoneExtend Start! awa");
		ModItemGroup.registerModItemGroup();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}