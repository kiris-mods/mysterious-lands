package dev.tophatcat.mysteriouslands;

import dev.tophatcat.mysteriouslands.init.MysteriousBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class MysteriousStrippableBlocks {

    public MysteriousStrippableBlocks() {
        init();
    }

    private void init() {
        StrippableBlockRegistry.register(MysteriousBlocks.BLOOD_SOAKED_LOG.get(),
            MysteriousBlocks.BLOOD_SOAKED_STRIPPED_LOG.get());
        StrippableBlockRegistry.register(MysteriousBlocks.BLOOD_SOAKED_WOOD.get(),
            MysteriousBlocks.BLOOD_SOAKED_STRIPPED_WOOD.get());
        StrippableBlockRegistry.register(MysteriousBlocks.GHOSTLY_LOG.get(),
            MysteriousBlocks.GHOSTLY_STRIPPED_LOG.get());
        StrippableBlockRegistry.register(MysteriousBlocks.GHOSTLY_WOOD.get(),
            MysteriousBlocks.GHOSTLY_STRIPPED_WOOD.get());
        StrippableBlockRegistry.register(MysteriousBlocks.SEEPING_LOG.get(),
            MysteriousBlocks.SEEPING_STRIPPED_LOG.get());
        StrippableBlockRegistry.register(MysteriousBlocks.SEEPING_WOOD.get(),
            MysteriousBlocks.SEEPING_STRIPPED_WOOD.get());
        StrippableBlockRegistry.register(MysteriousBlocks.SORBUS_LOG.get(),
            MysteriousBlocks.SORBUS_STRIPPED_LOG.get());
        StrippableBlockRegistry.register(MysteriousBlocks.SORBUS_WOOD.get(),
            MysteriousBlocks.SORBUS_STRIPPED_WOOD.get());
        StrippableBlockRegistry.register(MysteriousBlocks.WALNUT_LOG.get(),
            MysteriousBlocks.WALNUT_STRIPPED_LOG.get());
        StrippableBlockRegistry.register(MysteriousBlocks.WALNUT_WOOD.get(),
            MysteriousBlocks.WALNUT_STRIPPED_WOOD.get());
    }
}
