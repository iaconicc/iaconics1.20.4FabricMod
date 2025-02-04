package net.iaconic.iaconicsmod.blocks;

import net.iaconic.iaconicsmod.IaconicsMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BaseBlock extends Block{

    public BaseBlock(AbstractBlock.Settings blockSettings, Item.Settings itemSettings, String name) {
        super(blockSettings);

        IaconicsMod.LOGGER.info("Registering base block-->{}:{}", IaconicsMod.MOD_ID, name);

        Registry.register(Registries.ITEM, Identifier.of(IaconicsMod.MOD_ID, name), new BlockItem(this, itemSettings));
        Registry.register(Registries.BLOCK, Identifier.of(IaconicsMod.MOD_ID, name), this);

    }


}
