package me.will.modular_guns.client.renderer.item;

import me.will.modular_guns.ModularGuns;
import me.will.modular_guns.item.gunComponent.GunComponentRifleReceiverItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class GunComponentRifleReceiverItemRenderer extends GeoItemRenderer<GunComponentRifleReceiverItem> {

    public GunComponentRifleReceiverItemRenderer() {
        super(new DefaultedItemGeoModel<>(ResourceLocation.fromNamespaceAndPath(ModularGuns.MODID, "gun_component_rifle_receiver")));
    }
}