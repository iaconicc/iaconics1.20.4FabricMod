package net.iaconic.iaconicsmod.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.iaconic.iaconicsmod.IaconicsMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class BaseBlock {
    private final Block pBlock;
    private final BlockItem pBlockItem;

    public BaseBlock(String name, RegistryKey<ItemGroup> itemGroup, Block block, Item.Settings itemSettings)
    {
        IaconicsMod.LOGGER.info("Registering block-->{}:{}", IaconicsMod.MOD_ID, name);
        pBlockItem = Registry.register(Registries.ITEM, Identifier.of(IaconicsMod.MOD_ID, name), new BlockItem(block, itemSettings));
        pBlock = Registry.register(Registries.BLOCK, Identifier.of(IaconicsMod.MOD_ID, name), block);

        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries ->{
            entries.add(pBlockItem);
            }
        );
    }

    public Block getBlock()
    {
        return pBlock;
    }

    public BlockItem getBlockItem()
    {
        return pBlockItem;
    }
}
