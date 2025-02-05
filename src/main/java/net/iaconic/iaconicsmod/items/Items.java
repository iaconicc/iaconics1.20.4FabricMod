package net.iaconic.iaconicsmod.items;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class Items{
    public static BaseItems sapphire_item;

    public static void initialiseAllItems()
    {
        sapphire_item = new BaseItems(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(10.0f).build()), "sapphire_item");
    }

}
