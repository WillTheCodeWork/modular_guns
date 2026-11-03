package me.will.modular_guns.item.gunComponent;

import me.will.modular_guns.client.renderer.item.GunComponentRifleReceiverItemRenderer;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;
import software.bernie.geckolib.renderer.GeoItemRenderer;
import software.bernie.geckolib.util.GeckoLibUtil;

public class GunComponentRifleReceiverItem extends GunComponentItem {
    private AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    public GunComponentRifleReceiverItem(Properties properties) {
        super(
            properties,
            COMPONENT_TYPE.RECIEVER,
            new Stats(3, 7, 10, 1, null)
        );
    }

    @Override
    public void registerControllers(ControllerRegistrar controllers) {
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    @Override
    protected GeoItemRenderer<?> createRenderer() {
        return new GunComponentRifleReceiverItemRenderer();
    }
}
