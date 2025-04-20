package net.cyber.newweapons.item;

import net.cyber.newweapons.NewWeapons;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TITANIUM = registerItem( "titanium", new Item(new Item.Settings()));
    public static final Item RAW_TITANIUM = registerItem("raw_titanium", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(NewWeapons.MOD_ID, name), item);
    }


    public static void registerModItems() {
        NewWeapons.LOGGER.info("Registering Mod Items for " + NewWeapons.MOD_ID);

    }
}
