package net.iaconic.iaconicsmod.items;

import net.minecraft.item.Item;

public class Items{
    public static BaseItems newItem;

    public static void initialiseAllItems()
    {
        newItem = new BaseItems(new Item.Settings().fireproof().maxCount(16), "newitem");
    }

}
