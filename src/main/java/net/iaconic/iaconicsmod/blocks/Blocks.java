package net.iaconic.iaconicsmod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class Blocks {
    public static BaseBlock newBlock;

    public static void initialiseAllBlocks() {

        newBlock = new BaseBlock("newblock", ItemGroups.BUILDING_BLOCKS, new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).hardness(2.0f)),
                new Item.Settings().fireproof());


    }
}
