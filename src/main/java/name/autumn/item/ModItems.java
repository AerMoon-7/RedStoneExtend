package name.autumn.item;

import name.autumn.RedStoneExtend;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item IRONSTONE = registerItem("ironstone", new Item(new Item.Settings()), ModItemGroup.EXTEND);

    public static Item registerItem(String name, Item item, ItemGroup... itemGroups) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(RedStoneExtend.MOD_ID, name), item);
        for (ItemGroup itemGroup: itemGroups) {
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(registeredItem));
        }
        return registeredItem;
    }
    public static void registerModItems() {
        RedStoneExtend.LOGGER.debug("Registering Items for" + RedStoneExtend.MOD_ID);
    }
}
