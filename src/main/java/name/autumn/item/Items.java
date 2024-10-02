package name.autumn.item;

import name.autumn.RedStoneExtend;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Items {
    public static final Item IRONSTONE = register("ironstone", new Item(new Item.Settings()));

    public static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RedStoneExtend.MOD_ID, name), item);
    }
    public static void itemItems() {
        RedStoneExtend.LOGGER.debug("Registering Items for" + RedStoneExtend.MOD_ID);
    }
}
