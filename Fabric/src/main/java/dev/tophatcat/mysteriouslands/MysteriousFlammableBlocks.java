package dev.tophatcat.mysteriouslands;

import dev.tophatcat.mysteriouslands.init.MysteriousBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class MysteriousFlammableBlocks {

    public MysteriousFlammableBlocks() {
        init();
    }

    private static void init() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(MysteriousBlocks.BLOOD_SOAKED_LOG.get(), 5, 5);
        registry.add(MysteriousBlocks.BLOOD_SOAKED_STRIPPED_LOG.get(), 5, 5);
        registry.add(MysteriousBlocks.BLOOD_SOAKED_WOOD.get(), 5, 5);
        registry.add(MysteriousBlocks.BLOOD_SOAKED_STRIPPED_WOOD.get(), 5, 5);
        registry.add(MysteriousBlocks.BLOOD_SOAKED_PLANKS.get(), 5, 20);
        registry.add(MysteriousBlocks.BLOOD_SOAKED_LEAVES.get(), 30, 60);
        registry.add(MysteriousBlocks.BLOOD_SOAKED_SLAB.get(), 5, 20);
        registry.add(MysteriousBlocks.BLOOD_SOAKED_GATE.get(), 5, 20);
        registry.add(MysteriousBlocks.BLOOD_SOAKED_FENCE.get(), 5, 20);
        registry.add(MysteriousBlocks.BLOOD_SOAKED_STAIRS.get(), 5, 20);

        registry.add(MysteriousBlocks.GHOSTLY_LOG.get(), 5, 5);
        registry.add(MysteriousBlocks.GHOSTLY_STRIPPED_LOG.get(), 5, 5);
        registry.add(MysteriousBlocks.GHOSTLY_WOOD.get(), 5, 5);
        registry.add(MysteriousBlocks.GHOSTLY_STRIPPED_WOOD.get(), 5, 5);
        registry.add(MysteriousBlocks.GHOSTLY_PLANKS.get(), 5, 20);
        registry.add(MysteriousBlocks.GHOSTLY_LEAVES.get(), 30, 60);
        registry.add(MysteriousBlocks.GHOSTLY_SLAB.get(), 5, 20);
        registry.add(MysteriousBlocks.GHOSTLY_GATE.get(), 5, 20);
        registry.add(MysteriousBlocks.GHOSTLY_FENCE.get(), 5, 20);
        registry.add(MysteriousBlocks.GHOSTLY_STAIRS.get(), 5, 20);

        registry.add(MysteriousBlocks.SEEPING_LOG.get(), 5, 5);
        registry.add(MysteriousBlocks.SEEPING_STRIPPED_LOG.get(), 5, 5);
        registry.add(MysteriousBlocks.SEEPING_WOOD.get(), 5, 5);
        registry.add(MysteriousBlocks.SEEPING_STRIPPED_WOOD.get(), 5, 5);
        registry.add(MysteriousBlocks.SEEPING_PLANKS.get(), 5, 20);
        registry.add(MysteriousBlocks.SEEPING_LEAVES.get(), 30, 60);
        registry.add(MysteriousBlocks.SEEPING_SLAB.get(), 5, 20);
        registry.add(MysteriousBlocks.SEEPING_GATE.get(), 5, 20);
        registry.add(MysteriousBlocks.SEEPING_FENCE.get(), 5, 20);
        registry.add(MysteriousBlocks.SEEPING_STAIRS.get(), 5, 20);

        registry.add(MysteriousBlocks.SORBUS_LOG.get(), 5, 5);
        registry.add(MysteriousBlocks.SORBUS_STRIPPED_LOG.get(), 5, 5);
        registry.add(MysteriousBlocks.SORBUS_WOOD.get(), 5, 5);
        registry.add(MysteriousBlocks.SORBUS_STRIPPED_WOOD.get(), 5, 5);
        registry.add(MysteriousBlocks.SORBUS_PLANKS.get(), 5, 20);
        registry.add(MysteriousBlocks.SORBUS_LEAVES.get(), 30, 60);
        registry.add(MysteriousBlocks.SORBUS_SLAB.get(), 5, 20);
        registry.add(MysteriousBlocks.SORBUS_GATE.get(), 5, 20);
        registry.add(MysteriousBlocks.SORBUS_FENCE.get(), 5, 20);
        registry.add(MysteriousBlocks.SORBUS_STAIRS.get(), 5, 20);

        registry.add(MysteriousBlocks.WALNUT_LOG.get(), 5, 5);
        registry.add(MysteriousBlocks.WALNUT_STRIPPED_LOG.get(), 5, 5);
        registry.add(MysteriousBlocks.WALNUT_WOOD.get(), 5, 5);
        registry.add(MysteriousBlocks.WALNUT_STRIPPED_WOOD.get(), 5, 5);
        registry.add(MysteriousBlocks.WALNUT_PLANKS.get(), 5, 20);
        registry.add(MysteriousBlocks.WALNUT_LEAVES.get(), 30, 60);
        registry.add(MysteriousBlocks.WALNUT_SLAB.get(), 5, 20);
        registry.add(MysteriousBlocks.WALNUT_GATE.get(), 5, 20);
        registry.add(MysteriousBlocks.WALNUT_FENCE.get(), 5, 20);
        registry.add(MysteriousBlocks.WALNUT_STAIRS.get(), 5, 20);
    }
}
