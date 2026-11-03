package me.will.modular_guns.client.renderer.item;

import me.will.modular_guns.ModularGuns;
import me.will.modular_guns.item.gunComponent.GunComponentShortBarrelItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class GunComponentShortBarrelItemRenderer extends GeoItemRenderer<GunComponentShortBarrelItem> {
    public GunComponentShortBarrelItemRenderer() {
        super(new DefaultedItemGeoModel<>(ResourceLocation.fromNamespaceAndPath(ModularGuns.MODID, "gun_component_short_barrel")));
    }
}
