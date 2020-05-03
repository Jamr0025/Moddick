package com.github.jamr0025.dickmod;
//src/main/resources/assets/examplemod/models/item/

import com.github.jamr0025.init.ModItemGroups;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.block.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistryEntry;

@EventBusSubscriber(modid = dickModMain.MODID,bus = EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {

    //para registrar ITEM
    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "dick_item")
        );

    }



    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(dickModMain.MODID, name));
    }


    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }
    //para registrar Bloques
    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                setup(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)), "dick_block")
        );
    }
}
