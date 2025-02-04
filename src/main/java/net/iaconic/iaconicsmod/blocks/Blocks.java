package net.iaconic.iaconicsmod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.item.Item;

public class Blocks {
    public static BaseBlock newBlock;

    public static void initialiseAllBlocks() {
        newBlock = new BaseBlock(AbstractBlock.Settings.create(), new Item.Settings(),"newblock");

    }
}
