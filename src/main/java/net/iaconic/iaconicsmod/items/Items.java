package net.iaconic.iaconicsmod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

public class Items {

    public static void registerAllItems()
    {
       BaseItems newItem = new BaseItems("newitem", ItemGroups.INGREDIENTS, new Item(new Item.Settings()));
    }

}
