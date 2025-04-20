package net.cyber.newweapons.item;

import net.cyber.newweapons.NewWeapons;
import net.cyber.newweapons.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup TITANIUM_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(NewWeapons.MOD_ID, "titanium_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.TITANIUM_BLOCK))
                    .displayName(Text.translatable("itemgroup.newweapons.titanium_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);
                    }).build());

    public static final ItemGroup TITANIUM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(NewWeapons.MOD_ID, "titanium_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TITANIUM))
                    .displayName(Text.translatable("itemgroup.newweapons.titanium_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TITANIUM);
                        entries.add(ModItems.RAW_TITANIUM);
                    }).build());


    public static void registerItemGroups() {
        NewWeapons.LOGGER.info("Registering Item Groups for " + NewWeapons.MOD_ID);
    }
}
