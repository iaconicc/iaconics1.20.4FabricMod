package net.iaconic.iaconicsmod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

public class Items{
    public static BaseItems newItem;

    public static void initialiseAllItems()
    {
        newItem = new BaseItems("newitem", ItemGroups.INGREDIENTS, new Item(new Item.Settings().fireproof().maxCount(16)));
    }

}
