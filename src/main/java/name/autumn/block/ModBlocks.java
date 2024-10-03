package name.autumn.block;

import name.autumn.RedStoneExtend;
import name.autumn.item.ModItemGroup;
import name.autumn.item.ModItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block IRONSTONE_BLOCK = registerBlock("ironstone_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()),
            ModItemGroup.EXTEND);

    public static Block registerBlock(String name, Block block, ItemGroup... itemGroups) {
        ModItems.registerItem(name, new BlockItem(block, new FabricItemSettings()), itemGroups);
        return Registry.register(Registries.BLOCK, new Identifier(RedStoneExtend.MOD_ID, name), block);
    }
    public static void registerModBlocks() {
        RedStoneExtend.LOGGER.debug("Registering Blocks for" + RedStoneExtend.MOD_ID);
    }
}
