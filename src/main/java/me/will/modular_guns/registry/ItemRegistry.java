package me.will.modular_guns.registry;

import java.util.function.Supplier;

import me.will.modular_guns.ModularGuns;
import me.will.modular_guns.item.gunComponent.GunComponentRifleReceiverItem;
import me.will.modular_guns.item.gunComponent.GunComponentShortBarrelItem;
import net.minecraft.world.item.Item;

public class ItemRegistry {
    public static void init() {}

    private static final Supplier<GunComponentRifleReceiverItem> GUN_COMPONENT_RIFLE_RECEIVER_ITEM =
        registerItem("gun_component_rifle_receiver", () -> new GunComponentRifleReceiverItem(new Item.Properties()));

    private static final Supplier<GunComponentShortBarrelItem> GUN_COMPONENT_SHORT_BARREL_ITEM =
        registerItem("gun_component_short_barrel", () -> new GunComponentShortBarrelItem(new Item.Properties()));

    private static <T extends Item> Supplier<T> registerItem(String id, Supplier<T> item) {
        return ModularGuns.ITEMS.register(id, item);
    }
}
