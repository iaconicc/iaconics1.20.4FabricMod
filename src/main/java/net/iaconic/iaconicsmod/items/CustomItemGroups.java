package net.iaconic.iaconicsmod.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.iaconic.iaconicsmod.IaconicsMod;
import net.iaconic.iaconicsmod.blocks.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CustomItemGroups {
    public static ItemGroup NewGroup;

    public static void registerAllItemGroups()
    {
       NewGroup = Registry.register(Registries.ITEM_GROUP, Identifier.of(IaconicsMod.MOD_ID, "newgroup"), FabricItemGroup.builder()
                        .displayName(Text.translatable("itemgroup.iaconicsmod.newgroup"))
                        .icon(() -> new ItemStack(Items.newItem))
                        .entries((displayContext, entries) ->{
                            entries.add(Items.newItem);
                            entries.add(Blocks.newBlock);
                        } )
                        .build());

    }

}
