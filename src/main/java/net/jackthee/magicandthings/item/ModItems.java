package net.jackthee.magicandthings.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jackthee.magicandthings.MagicAndThings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = RegisterItem("ruby",new Item(new FabricItemSettings()));

    private static void AddItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(RUBY);
    }


    private static Item RegisterItem(String Name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(MagicAndThings.MOD_ID,Name),item);
    }

    public static void registerModItems(){
        MagicAndThings.LOGGER.info("RegisteringModItems" + MagicAndThings.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::AddItemsToIngredientItemGroup);

    }
}