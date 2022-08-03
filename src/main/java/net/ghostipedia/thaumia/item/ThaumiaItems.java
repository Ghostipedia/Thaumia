package net.ghostipedia.thaumia.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.ghostipedia.thaumia.Thaumia;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ThaumiaItems {

    public static final Item RAW_AURACITE = registerItem("raw_auracite",
            new Item(new FabricItemSettings().group(ModItemGroup.AURACITE)));
public static final Item AURACITE = registerItem("auracite",
            new Item(new FabricItemSettings().group(ModItemGroup.AURACITE)));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Thaumia.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Thaumia.LOGGER.debug("Registering Items for " + Thaumia.MOD_ID);
    }







}
