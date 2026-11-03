package me.will.modular_guns;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import me.will.modular_guns.registry.ItemRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.fml.ModContainer;

@Mod(ModularGuns.MODID)
public class ModularGuns {
    public static final String MODID = "modular_guns";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, MODID);

    public ModularGuns(IEventBus modEventBus, ModContainer modContainer) {
        ITEMS.register(modEventBus);
        ItemRegistry.init();
    }
}
