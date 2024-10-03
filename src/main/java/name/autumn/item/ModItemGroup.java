package name.autumn.item;

import name.autumn.RedStoneExtend;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup EXTEND = FabricItemGroup.builder(new Identifier(RedStoneExtend.MOD_ID,"extend"))
            .displayName(Text.translatable("itemgroup.autumn.extend"))
            .icon(() -> new ItemStack(ModItems.IRONSTONE))
            .build();
    public static void registerModItemGroup() {
        RedStoneExtend.LOGGER.debug("Registering ItemGroup for" + RedStoneExtend.MOD_ID);
    }
}
