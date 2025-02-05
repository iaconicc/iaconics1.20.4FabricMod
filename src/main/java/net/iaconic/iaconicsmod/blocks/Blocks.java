package net.iaconic.iaconicsmod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.item.Item;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class Blocks {
    public static BaseBlock sapphire_block;
    public static CustomExperienceDroppingBlock sapphire_ore_block;

    public static void initialiseAllBlocks() {
        sapphire_block = new BaseBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.EMERALD_BLOCK), new Item.Settings(),"sapphire_block");
        sapphire_ore_block = new CustomExperienceDroppingBlock(UniformIntProvider.create(3,7), AbstractBlock.Settings.copy(net.minecraft.block.Blocks.EMERALD_ORE), new Item.Settings(), "sapphire_ore_block");

    }
}
