package me.will.modular_guns.item.gunComponent;

import me.will.modular_guns.client.renderer.item.GunComponentShortBarrelItemRenderer;
import net.minecraft.world.item.Item;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;
import software.bernie.geckolib.renderer.GeoItemRenderer;
import software.bernie.geckolib.util.GeckoLibUtil;

public class GunComponentShortBarrelItem extends GunComponentItem {
    private AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public GunComponentShortBarrelItem(Properties properties) {
        super(
            properties,
            COMPONENT_TYPE.BARREL,
            new Stats(1, 0.7, 2, 3, null)
        );
        
    }

    @Override
    public void registerControllers(ControllerRegistrar controllers) {
    }



    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    @Override
    protected GeoItemRenderer<?> createRenderer() {
        return new GunComponentShortBarrelItemRenderer();
    }
}