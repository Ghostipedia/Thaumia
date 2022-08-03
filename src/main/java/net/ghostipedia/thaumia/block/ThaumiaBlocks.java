package net.ghostipedia.thaumia.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.ghostipedia.thaumia.Thaumia;
import net.ghostipedia.thaumia.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ThaumiaBlocks {

    public static final Block AURACITE_CORE = registerBlock("auracite_core",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(2f).requiresTool()), ModItemGroup.AURACITE);


    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Thaumia.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(Thaumia.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));

    }

    public static void registerModBlocks() {
        Thaumia.LOGGER.debug("Registering Blocks for " + Thaumia.MOD_ID);
    }

}
