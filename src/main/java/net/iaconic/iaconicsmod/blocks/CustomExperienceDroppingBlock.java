package net.iaconic.iaconicsmod.blocks;

import net.iaconic.iaconicsmod.IaconicsMod;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.IntProvider;

public class CustomExperienceDroppingBlock extends ExperienceDroppingBlock {
    public CustomExperienceDroppingBlock(IntProvider experienceDropped, Settings settings, Item.Settings itemSettings, String name) {
        super(experienceDropped, settings);

        IaconicsMod.LOGGER.info("Registering experience block-->{}:{}", IaconicsMod.MOD_ID, name);

        Registry.register(Registries.ITEM, Identifier.of(IaconicsMod.MOD_ID, name), new BlockItem(this, itemSettings));
        Registry.register(Registries.BLOCK, Identifier.of(IaconicsMod.MOD_ID, name), this);
    }
}
