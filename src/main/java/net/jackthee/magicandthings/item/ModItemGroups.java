package net.jackthee.magicandthings.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jackthee.magicandthings.MagicAndThings;
import net.jackthee.magicandthings.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,new Identifier(MagicAndThings.MOD_ID,
            "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                    entries.add(ModItems.RUBY);
                    entries.add(ModItems.RAW_RUBY);

                    entries.add(ModItems.JEWEL_FINDER);

                    entries.add(ModBlocks.RUBY_BLOCK);
                    entries.add(ModBlocks.RAW_RUBY_BLOCK);
                    entries.add(ModBlocks.CINNABAR_ORE);
                    entries.add(ModBlocks.DEEPSLATE_CINNABAR_ORE);


                    }).build());

    public static void RegisterItemGroups(){
        MagicAndThings.LOGGER.info("Registering Item Groups Of: " + MagicAndThings.MOD_ID);
    }
}