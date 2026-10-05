package dev.tophatcat.mysteriouslands;

import dev.tophatcat.mysteriouslands.init.MysteriousBlocks;
import dev.tophatcat.mysteriouslands.init.MysteriousItems;
import net.fabricmc.fabric.api.registry.FuelValueEvents;

public class MysteriousFuelSettings {

    public MysteriousFuelSettings() {
        FuelValueEvents.BUILD.register((builder, context) -> {
            builder.add(MysteriousBlocks.BLOOD_SOAKED_LOG.get(), 300);
            builder.add(MysteriousBlocks.BLOOD_SOAKED_STRIPPED_LOG.get(), 300);
            builder.add(MysteriousBlocks.BLOOD_SOAKED_WOOD.get(), 300);
            builder.add(MysteriousBlocks.BLOOD_SOAKED_STRIPPED_WOOD.get(), 300);
            builder.add(MysteriousBlocks.BLOOD_SOAKED_PLANKS.get(), 300);
            builder.add(MysteriousBlocks.BLOOD_SOAKED_STAIRS.get(), 300);
            builder.add(MysteriousBlocks.BLOOD_SOAKED_SLAB.get(), 150);
            builder.add(MysteriousBlocks.BLOOD_SOAKED_TRAPDOOR.get(), 300);
            builder.add(MysteriousBlocks.BLOOD_SOAKED_PRESSURE_PLATE.get(), 300);
            builder.add(MysteriousBlocks.BLOOD_SOAKED_FENCE.get(), 300);
            builder.add(MysteriousBlocks.BLOOD_SOAKED_GATE.get(), 300);
            builder.add(MysteriousItems.BLOOD_SOAKED_SIGN.get(), 200);
            builder.add(MysteriousBlocks.BLOOD_SOAKED_HANGING_SIGN.get(), 800);
            builder.add(MysteriousBlocks.BLOOD_SOAKED_BUTTON.get(), 100);
            builder.add(MysteriousBlocks.BLOOD_SOAKED_SAPLING.get(), 100);

            builder.add(MysteriousBlocks.GHOSTLY_LOG.get(), 300);
            builder.add(MysteriousBlocks.GHOSTLY_STRIPPED_LOG.get(), 300);
            builder.add(MysteriousBlocks.GHOSTLY_WOOD.get(), 300);
            builder.add(MysteriousBlocks.GHOSTLY_STRIPPED_WOOD.get(), 300);
            builder.add(MysteriousBlocks.GHOSTLY_PLANKS.get(), 300);
            builder.add(MysteriousBlocks.GHOSTLY_STAIRS.get(), 300);
            builder.add(MysteriousBlocks.GHOSTLY_SLAB.get(), 150);
            builder.add(MysteriousBlocks.GHOSTLY_TRAPDOOR.get(), 300);
            builder.add(MysteriousBlocks.GHOSTLY_PRESSURE_PLATE.get(), 300);
            builder.add(MysteriousBlocks.GHOSTLY_FENCE.get(), 300);
            builder.add(MysteriousBlocks.GHOSTLY_GATE.get(), 300);
            builder.add(MysteriousItems.GHOSTLY_SIGN.get(), 200);
            builder.add(MysteriousBlocks.GHOSTLY_HANGING_SIGN.get(), 800);
            builder.add(MysteriousBlocks.GHOSTLY_BUTTON.get(), 100);
            builder.add(MysteriousBlocks.GHOSTLY_SAPLING.get(), 100);

            builder.add(MysteriousBlocks.SEEPING_LOG.get(), 300);
            builder.add(MysteriousBlocks.SEEPING_STRIPPED_LOG.get(), 300);
            builder.add(MysteriousBlocks.SEEPING_WOOD.get(), 300);
            builder.add(MysteriousBlocks.SEEPING_STRIPPED_WOOD.get(), 300);
            builder.add(MysteriousBlocks.SEEPING_PLANKS.get(), 300);
            builder.add(MysteriousBlocks.SEEPING_STAIRS.get(), 300);
            builder.add(MysteriousBlocks.SEEPING_SLAB.get(), 150);
            builder.add(MysteriousBlocks.SEEPING_TRAPDOOR.get(), 300);
            builder.add(MysteriousBlocks.SEEPING_PRESSURE_PLATE.get(), 300);
            builder.add(MysteriousBlocks.SEEPING_FENCE.get(), 300);
            builder.add(MysteriousBlocks.SEEPING_GATE.get(), 300);
            builder.add(MysteriousItems.SEEPING_SIGN.get(), 200);
            builder.add(MysteriousBlocks.SEEPING_HANGING_SIGN.get(), 800);
            builder.add(MysteriousBlocks.SEEPING_BUTTON.get(), 100);
            builder.add(MysteriousBlocks.SEEPING_SAPLING.get(), 100);

            builder.add(MysteriousBlocks.SORBUS_LOG.get(), 300);
            builder.add(MysteriousBlocks.SORBUS_STRIPPED_LOG.get(), 300);
            builder.add(MysteriousBlocks.SORBUS_WOOD.get(), 300);
            builder.add(MysteriousBlocks.SORBUS_STRIPPED_WOOD.get(), 300);
            builder.add(MysteriousBlocks.SORBUS_PLANKS.get(), 300);
            builder.add(MysteriousBlocks.SORBUS_STAIRS.get(), 300);
            builder.add(MysteriousBlocks.SORBUS_SLAB.get(), 150);
            builder.add(MysteriousBlocks.SORBUS_TRAPDOOR.get(), 300);
            builder.add(MysteriousBlocks.SORBUS_PRESSURE_PLATE.get(), 300);
            builder.add(MysteriousBlocks.SORBUS_FENCE.get(), 300);
            builder.add(MysteriousBlocks.SORBUS_GATE.get(), 300);
            builder.add(MysteriousItems.SORBUS_SIGN.get(), 200);
            builder.add(MysteriousBlocks.SORBUS_HANGING_SIGN.get(), 800);
            builder.add(MysteriousBlocks.SORBUS_BUTTON.get(), 100);
            builder.add(MysteriousBlocks.SORBUS_SAPLING.get(), 100);

            builder.add(MysteriousBlocks.WALNUT_LOG.get(), 300);
            builder.add(MysteriousBlocks.WALNUT_STRIPPED_LOG.get(), 300);
            builder.add(MysteriousBlocks.WALNUT_WOOD.get(), 300);
            builder.add(MysteriousBlocks.WALNUT_STRIPPED_WOOD.get(), 300);
            builder.add(MysteriousBlocks.WALNUT_PLANKS.get(), 300);
            builder.add(MysteriousBlocks.WALNUT_STAIRS.get(), 300);
            builder.add(MysteriousBlocks.WALNUT_SLAB.get(), 150);
            builder.add(MysteriousBlocks.WALNUT_TRAPDOOR.get(), 300);
            builder.add(MysteriousBlocks.WALNUT_PRESSURE_PLATE.get(), 300);
            builder.add(MysteriousBlocks.WALNUT_FENCE.get(), 300);
            builder.add(MysteriousBlocks.WALNUT_GATE.get(), 300);
            builder.add(MysteriousItems.WALNUT_SIGN.get(), 200);
            builder.add(MysteriousBlocks.WALNUT_HANGING_SIGN.get(), 800);
            builder.add(MysteriousBlocks.WALNUT_BUTTON.get(), 100);
            builder.add(MysteriousBlocks.WALNUT_SAPLING.get(), 100);
        });
    }
}
