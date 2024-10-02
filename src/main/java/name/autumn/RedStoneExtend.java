package name.autumn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import name.autumn.item.Items;
import net.fabricmc.api.ModInitializer;

public class RedStoneExtend implements ModInitializer {
	public static final String MOD_ID = "autumn";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		Items.itemItems();
	}
}