package net.uranium_kitty.stratosol.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.uranium_kitty.stratosol.Stratosol;

public class ModItems {
    public static final DeferredRegister<Item> ITEM =
            DeferredRegister.create(ForgeRegistries.ITEMS, Stratosol.MOD_ID);

    public static final RegistryObject<Item> SIGMA = ITEM.register("sigma",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEM.register(eventBus);
    }
}
