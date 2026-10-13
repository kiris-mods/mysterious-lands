package dev.tophatcat.mysteriouslands.datagen.server.loot;

import dev.tophatcat.mysteriouslands.init.MysteriousBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;

import java.util.Set;

public class MysteriousBlockLoot extends BlockLootSubProvider {

    public MysteriousBlockLoot(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    public void generate() {
        // Blood soaked tree family
        dropSelf(MysteriousBlocks.BLOOD_SOAKED_LOG.get());
        dropSelf(MysteriousBlocks.BLOOD_SOAKED_STRIPPED_LOG.get());
        dropSelf(MysteriousBlocks.BLOOD_SOAKED_WOOD.get());
        dropSelf(MysteriousBlocks.BLOOD_SOAKED_STRIPPED_WOOD.get());
        dropSelf(MysteriousBlocks.BLOOD_SOAKED_PLANKS.get());
        dropSelf(MysteriousBlocks.BLOOD_SOAKED_STAIRS.get());
        add(MysteriousBlocks.BLOOD_SOAKED_SLAB.get(), this::createSlabItemTable);
        dropSelf(MysteriousBlocks.BLOOD_SOAKED_FENCE.get());
        dropSelf(MysteriousBlocks.BLOOD_SOAKED_GATE.get());
        dropSelf(MysteriousBlocks.BLOOD_SOAKED_BUTTON.get());
        dropSelf(MysteriousBlocks.BLOOD_SOAKED_PRESSURE_PLATE.get());
        dropSelf(MysteriousBlocks.BLOOD_SOAKED_TRAPDOOR.get());
        dropSelf(MysteriousBlocks.BLOOD_SOAKED_SAPLING.get());
        dropPottedContents(MysteriousBlocks.POTTED_BLOOD_SOAKED_SAPLING.get());
        dropSelf(MysteriousBlocks.BLOOD_SOAKED_SIGN.get());
        dropSelf(MysteriousBlocks.BLOOD_SOAKED_HANGING_SIGN.get());
        add(MysteriousBlocks.BLOOD_SOAKED_WALL_SIGN.get(), block -> createSingleItemTable(MysteriousBlocks.BLOOD_SOAKED_SIGN.get()));
        add(MysteriousBlocks.BLOOD_SOAKED_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(MysteriousBlocks.BLOOD_SOAKED_HANGING_SIGN.get()));
        add(MysteriousBlocks.BLOOD_SOAKED_DOOR.get(), this::createDoorTable);
        add(MysteriousBlocks.BLOOD_SOAKED_LEAVES.get(), block -> createLeavesDrops(
            block, MysteriousBlocks.BLOOD_SOAKED_SAPLING.get(),
            NORMAL_LEAVES_SAPLING_CHANCES));

        // Ghostly tree family
        dropSelf(MysteriousBlocks.GHOSTLY_LOG.get());
        dropSelf(MysteriousBlocks.GHOSTLY_STRIPPED_LOG.get());
        dropSelf(MysteriousBlocks.GHOSTLY_WOOD.get());
        dropSelf(MysteriousBlocks.GHOSTLY_STRIPPED_WOOD.get());
        dropSelf(MysteriousBlocks.GHOSTLY_PLANKS.get());
        dropSelf(MysteriousBlocks.GHOSTLY_STAIRS.get());
        add(MysteriousBlocks.GHOSTLY_SLAB.get(), this::createSlabItemTable);
        dropSelf(MysteriousBlocks.GHOSTLY_FENCE.get());
        dropSelf(MysteriousBlocks.GHOSTLY_GATE.get());
        dropSelf(MysteriousBlocks.GHOSTLY_BUTTON.get());
        dropSelf(MysteriousBlocks.GHOSTLY_PRESSURE_PLATE.get());
        dropSelf(MysteriousBlocks.GHOSTLY_TRAPDOOR.get());
        dropSelf(MysteriousBlocks.GHOSTLY_SAPLING.get());
        dropPottedContents(MysteriousBlocks.POTTED_GHOSTLY_SAPLING.get());
        dropSelf(MysteriousBlocks.GHOSTLY_SIGN.get());
        dropSelf(MysteriousBlocks.GHOSTLY_HANGING_SIGN.get());
        add(MysteriousBlocks.GHOSTLY_WALL_SIGN.get(), block -> createSingleItemTable(MysteriousBlocks.GHOSTLY_SIGN.get()));
        add(MysteriousBlocks.GHOSTLY_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(MysteriousBlocks.GHOSTLY_HANGING_SIGN.get()));
        add(MysteriousBlocks.GHOSTLY_DOOR.get(), this::createDoorTable);
        add(MysteriousBlocks.GHOSTLY_LEAVES.get(), block -> createLeavesDrops(
            block, MysteriousBlocks.GHOSTLY_SAPLING.get(),
            NORMAL_LEAVES_SAPLING_CHANCES));

        // Seeping tree family
        dropSelf(MysteriousBlocks.SEEPING_LOG.get());
        dropSelf(MysteriousBlocks.SEEPING_STRIPPED_LOG.get());
        dropSelf(MysteriousBlocks.SEEPING_WOOD.get());
        dropSelf(MysteriousBlocks.SEEPING_STRIPPED_WOOD.get());
        dropSelf(MysteriousBlocks.SEEPING_PLANKS.get());
        dropSelf(MysteriousBlocks.SEEPING_STAIRS.get());
        add(MysteriousBlocks.SEEPING_SLAB.get(), this::createSlabItemTable);
        dropSelf(MysteriousBlocks.SEEPING_FENCE.get());
        dropSelf(MysteriousBlocks.SEEPING_GATE.get());
        dropSelf(MysteriousBlocks.SEEPING_BUTTON.get());
        dropSelf(MysteriousBlocks.SEEPING_PRESSURE_PLATE.get());
        dropSelf(MysteriousBlocks.SEEPING_TRAPDOOR.get());
        dropSelf(MysteriousBlocks.SEEPING_SAPLING.get());
        dropPottedContents(MysteriousBlocks.POTTED_SEEPING_SAPLING.get());
        dropSelf(MysteriousBlocks.SEEPING_SIGN.get());
        dropSelf(MysteriousBlocks.SEEPING_HANGING_SIGN.get());
        add(MysteriousBlocks.SEEPING_WALL_SIGN.get(), block -> createSingleItemTable(MysteriousBlocks.SEEPING_SIGN.get()));
        add(MysteriousBlocks.SEEPING_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(MysteriousBlocks.SEEPING_HANGING_SIGN.get()));
        add(MysteriousBlocks.SEEPING_DOOR.get(), this::createDoorTable);
        add(MysteriousBlocks.SEEPING_LEAVES.get(), block -> createLeavesDrops(
            block, MysteriousBlocks.SEEPING_SAPLING.get(),
            NORMAL_LEAVES_SAPLING_CHANCES));

        // Sorbus tree family
        dropSelf(MysteriousBlocks.SORBUS_LOG.get());
        dropSelf(MysteriousBlocks.SORBUS_STRIPPED_LOG.get());
        dropSelf(MysteriousBlocks.SORBUS_WOOD.get());
        dropSelf(MysteriousBlocks.SORBUS_STRIPPED_WOOD.get());
        dropSelf(MysteriousBlocks.SORBUS_PLANKS.get());
        dropSelf(MysteriousBlocks.SORBUS_STAIRS.get());
        add(MysteriousBlocks.SORBUS_SLAB.get(), this::createSlabItemTable);
        dropSelf(MysteriousBlocks.SORBUS_FENCE.get());
        dropSelf(MysteriousBlocks.SORBUS_GATE.get());
        dropSelf(MysteriousBlocks.SORBUS_BUTTON.get());
        dropSelf(MysteriousBlocks.SORBUS_PRESSURE_PLATE.get());
        dropSelf(MysteriousBlocks.SORBUS_TRAPDOOR.get());
        dropSelf(MysteriousBlocks.SORBUS_SAPLING.get());
        dropPottedContents(MysteriousBlocks.POTTED_SORBUS_SAPLING.get());
        dropSelf(MysteriousBlocks.SORBUS_SIGN.get());
        dropSelf(MysteriousBlocks.SORBUS_HANGING_SIGN.get());
        add(MysteriousBlocks.SORBUS_WALL_SIGN.get(), block -> createSingleItemTable(MysteriousBlocks.SORBUS_SIGN.get()));
        add(MysteriousBlocks.SORBUS_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(MysteriousBlocks.SORBUS_HANGING_SIGN.get()));
        add(MysteriousBlocks.SORBUS_DOOR.get(), this::createDoorTable);
        add(MysteriousBlocks.SORBUS_LEAVES.get(), block -> createLeavesDrops(
            block, MysteriousBlocks.SORBUS_SAPLING.get(),
            NORMAL_LEAVES_SAPLING_CHANCES));

        // Walnut tree family
        dropSelf(MysteriousBlocks.WALNUT_LOG.get());
        dropSelf(MysteriousBlocks.WALNUT_STRIPPED_LOG.get());
        dropSelf(MysteriousBlocks.WALNUT_WOOD.get());
        dropSelf(MysteriousBlocks.WALNUT_STRIPPED_WOOD.get());
        dropSelf(MysteriousBlocks.WALNUT_PLANKS.get());
        dropSelf(MysteriousBlocks.WALNUT_STAIRS.get());
        add(MysteriousBlocks.WALNUT_SLAB.get(), this::createSlabItemTable);
        dropSelf(MysteriousBlocks.WALNUT_FENCE.get());
        dropSelf(MysteriousBlocks.WALNUT_GATE.get());
        dropSelf(MysteriousBlocks.WALNUT_BUTTON.get());
        dropSelf(MysteriousBlocks.WALNUT_PRESSURE_PLATE.get());
        dropSelf(MysteriousBlocks.WALNUT_TRAPDOOR.get());
        dropSelf(MysteriousBlocks.WALNUT_SAPLING.get());
        dropPottedContents(MysteriousBlocks.POTTED_WALNUT_SAPLING.get());
        dropSelf(MysteriousBlocks.WALNUT_SIGN.get());
        dropSelf(MysteriousBlocks.WALNUT_HANGING_SIGN.get());
        add(MysteriousBlocks.WALNUT_WALL_SIGN.get(), block -> createSingleItemTable(MysteriousBlocks.WALNUT_SIGN.get()));
        add(MysteriousBlocks.WALNUT_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(MysteriousBlocks.WALNUT_HANGING_SIGN.get()));
        add(MysteriousBlocks.WALNUT_DOOR.get(), this::createDoorTable);
        add(MysteriousBlocks.WALNUT_LEAVES.get(), block -> createLeavesDrops(
            block, MysteriousBlocks.WALNUT_SAPLING.get(),
            NORMAL_LEAVES_SAPLING_CHANCES));
    }
}
