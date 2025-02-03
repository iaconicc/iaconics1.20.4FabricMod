package net.iaconic.iaconicsmod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.sound.BlockSoundGroup;

public class Blocks {
    public static BaseBlock newBlock;

    public static void initialiseAllBlocks()
    {
        newBlock = new BaseBlock("newblock", ItemGroups.BUILDING_BLOCKS, new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK)),
                   new Item.Settings().fireproof());

    }

}
