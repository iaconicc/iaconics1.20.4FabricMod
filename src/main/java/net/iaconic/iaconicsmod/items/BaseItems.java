package net.iaconic.iaconicsmod.items;

import net.iaconic.iaconicsmod.IaconicsMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class BaseItems extends Item{

    public BaseItems(Settings settings, String name) {
        super(settings);

        Registry.register(Registries.ITEM, Identifier.of(IaconicsMod.MOD_ID, name), this);
    }

}
