package com.github.jamr0025.init;

import com.github.jamr0025.dickmod.dickModMain;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.function.Supplier;

public class ModItemGroups extends ItemGroup {

    private final Supplier<ItemStack> iconSupplier;
    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroups(dickModMain.MODID, () -> new ItemStack(ModItems.dick_item));

    public ModItemGroups(final String name, final Supplier<ItemStack> iconSupplier) {
        super(name);
        this.iconSupplier = iconSupplier;
    }

    @Override
    public ItemStack createIcon() {
        return iconSupplier.get();
    }

}
