package net.iaconic.iaconicsmod.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.iaconic.iaconicsmod.IaconicsMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;


public class BaseItems{
    private final Item pItem;

    public BaseItems(String name, RegistryKey<ItemGroup> itemGroup, Item item)
    {
        IaconicsMod.LOGGER.info("Registering Item-->{}:{}", IaconicsMod.MOD_ID, name);
        pItem = Registry.register(Registries.ITEM, Identifier.of(IaconicsMod.MOD_ID, name), item);

        //ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries ->{
        //    entries.add(pItem);
        //});

    }

    public Item getItem()
    {
        return pItem;
    }
}
