package me.will.modular_guns.item.gunComponent;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.jetbrains.annotations.Nullable;

import me.will.modular_guns.registry.ItemRegistry;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.Item;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public abstract class GunComponentItem extends Item implements GeoItem {
    public COMPONENT_TYPE component_type;
    public Stats stats;

    public GunComponentItem(
        Properties properties,
        COMPONENT_TYPE component_type,
        Stats stats
    )
    {
        super(properties);
        this.component_type = component_type;
        this.stats = stats;
    }

    public enum COMPONENT_TYPE {
        STOCK,
        BARREL,
        RECIEVER,
        PISTOL_GRIP,
        SIGHT,
        FOREGRIP,
        BARREL_ATTACHMENT,
        MAGAZINE
    }

    protected abstract GeoItemRenderer<?> createRenderer();

    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept(new GeoRenderProvider() {
            private GeoItemRenderer<?> renderer;
            @Override
            @Nullable
            public BlockEntityWithoutLevelRenderer getGeoItemRenderer() {
                if (renderer == null) {
                    renderer = createRenderer();
                }

                return renderer;
            }
        });
    }

    /**
     * All stats will be multiplied by the base stats set by reciever stats
     * Stats
     * @param recoil
     * @param damage
     * @param ads_speed
     * @param accuracy
     * @param ammo only for magazines, will be ignored otherise
     */
    public record Stats(
        double recoil,
        double damage,
        double ads_speed,
        double accuracy,
        Double ammo) {
        /**
         * just gets a map of all stats
         * @return
         * recoil,
         * damage,
         * ads_speed,
         * accuracy,
         * ammo
         */
        public Map<String, Double> getStats() {
            return Map.of(
                "recoil", recoil,
                "damage", damage,
                "ads_speed", ads_speed,
                "accuracy", accuracy,
                "ammo", ammo
            );
        }
    }
}
