package net.iaconic.iaconicsmod.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.iaconic.iaconicsmod.IaconicsMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class BaseItems{
    private static Item item;

    public BaseItems(String name)
    {
        item = Registry.register(Registries.ITEM, Identifier.of(IaconicsMod.MOD_ID, name), new Item(new Item.Settings()));



        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(item);
        });

    }

    public Item getItem()
    {
        return item;
    }
}
