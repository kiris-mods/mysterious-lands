package dev.tophatcat.mysteriouslands.datagen.server;

import dev.tophatcat.mysteriouslands.MysteriousLands;
import dev.tophatcat.mysteriouslands.init.MysteriousBlocks;
import dev.tophatcat.mysteriouslands.init.MysteriousItems;
import dev.tophatcat.mysteriouslands.data.MysteriousTags;
import java.util.concurrent.CompletableFuture;

import dev.upcraft.sparkweave.api.datagen.provider.common.SparkweaveBlockTagProvider;
import dev.upcraft.sparkweave.api.datagen.provider.common.SparkweaveItemTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;

import org.jetbrains.annotations.NotNull;

public class MysteriousTagProvider {

    public static class MysteriousItemTags extends SparkweaveItemTagProvider {

        public MysteriousItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, MysteriousLands.MODID, lookupProvider);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            tag(ItemTags.PLANKS, "Planks tag")
                .add(MysteriousItems.BLOOD_SOAKED_PLANKS.get())
                .add(MysteriousItems.GHOSTLY_PLANKS.get())
                .add(MysteriousItems.SEEPING_PLANKS.get())
                .add(MysteriousItems.SORBUS_PLANKS.get())
                .add(MysteriousItems.WALNUT_PLANKS.get());

            tag(ItemTags.WOODEN_BUTTONS, "Wooden Buttons tag")
                .add(MysteriousItems.BLOOD_SOAKED_BUTTON.get())
                .add(MysteriousItems.GHOSTLY_BUTTON.get())
                .add(MysteriousItems.SEEPING_BUTTON.get())
                .add(MysteriousItems.SORBUS_BUTTON.get())
                .add(MysteriousItems.WALNUT_BUTTON.get());

            tag(ItemTags.WOODEN_DOORS, "Wooden Doors tag")
                .add(MysteriousItems.BLOOD_SOAKED_DOOR.get())
                .add(MysteriousItems.GHOSTLY_DOOR.get())
                .add(MysteriousItems.SEEPING_DOOR.get())
                .add(MysteriousItems.SORBUS_DOOR.get())
                .add(MysteriousItems.WALNUT_DOOR.get());

            tag(ItemTags.WOODEN_STAIRS, "Wooden Stairs tag")
                .add(MysteriousItems.BLOOD_SOAKED_STAIRS.get())
                .add(MysteriousItems.GHOSTLY_STAIRS.get())
                .add(MysteriousItems.SEEPING_STAIRS.get())
                .add(MysteriousItems.SORBUS_STAIRS.get())
                .add(MysteriousItems.WALNUT_STAIRS.get());

            tag(ItemTags.WOODEN_SLABS, "Wooden Slabs tag")
                .add(MysteriousItems.BLOOD_SOAKED_SLAB.get())
                .add(MysteriousItems.GHOSTLY_SLAB.get())
                .add(MysteriousItems.SEEPING_SLAB.get())
                .add(MysteriousItems.SORBUS_SLAB.get())
                .add(MysteriousItems.WALNUT_SLAB.get());

            tag(ItemTags.WOODEN_FENCES, "Wooden Fences tag")
                .add(MysteriousItems.BLOOD_SOAKED_FENCE.get())
                .add(MysteriousItems.GHOSTLY_FENCE.get())
                .add(MysteriousItems.SEEPING_FENCE.get())
                .add(MysteriousItems.SORBUS_FENCE.get())
                .add(MysteriousItems.WALNUT_FENCE.get());

            tag(ItemTags.SAPLINGS, "Saplings tag")
                .add(MysteriousItems.BLOOD_SOAKED_SAPLING.get())
                .add(MysteriousItems.GHOSTLY_SAPLING.get())
                .add(MysteriousItems.SEEPING_SAPLING.get())
                .add(MysteriousItems.SORBUS_SAPLING.get())
                .add(MysteriousItems.WALNUT_SAPLING.get());

            tag(ItemTags.WOODEN_PRESSURE_PLATES, "Wooden Pressure Plates tag")
                .add(MysteriousItems.BLOOD_SOAKED_PRESSURE_PLATE.get())
                .add(MysteriousItems.GHOSTLY_PRESSURE_PLATE.get())
                .add(MysteriousItems.SEEPING_PRESSURE_PLATE.get())
                .add(MysteriousItems.SORBUS_PRESSURE_PLATE.get())
                .add(MysteriousItems.WALNUT_PRESSURE_PLATE.get());

            tag(ItemTags.LEAVES, "Leaves tag")
                .add(MysteriousItems.BLOOD_SOAKED_LEAVES.get())
                .add(MysteriousItems.GHOSTLY_LEAVES.get())
                .add(MysteriousItems.SEEPING_LEAVES.get())
                .add(MysteriousItems.SORBUS_LEAVES.get())
                .add(MysteriousItems.WALNUT_LEAVES.get());

            tag(ItemTags.WOODEN_TRAPDOORS, "Wooden Trapdoors tag")
                .add(MysteriousItems.BLOOD_SOAKED_TRAPDOOR.get())
                .add(MysteriousItems.GHOSTLY_TRAPDOOR.get())
                .add(MysteriousItems.SEEPING_TRAPDOOR.get())
                .add(MysteriousItems.SORBUS_TRAPDOOR.get())
                .add(MysteriousItems.WALNUT_TRAPDOOR.get());

            tag(ItemTags.FENCE_GATES, "Fence Gates tag")
                .add(MysteriousItems.BLOOD_SOAKED_GATE.get())
                .add(MysteriousItems.GHOSTLY_GATE.get())
                .add(MysteriousItems.SEEPING_GATE.get())
                .add(MysteriousItems.SORBUS_GATE.get())
                .add(MysteriousItems.WALNUT_GATE.get());

            tag(MysteriousTags.Items.BLOOD_SOAKED_LOGS, "Blood Soaked logs tag")
                .add(MysteriousItems.BLOOD_SOAKED_LOG.get())
                .add(MysteriousItems.BLOOD_SOAKED_STRIPPED_LOG.get())
                .add(MysteriousItems.BLOOD_SOAKED_WOOD.get())
                .add(MysteriousItems.BLOOD_SOAKED_STRIPPED_WOOD.get());

            tag(MysteriousTags.Items.GHOSTLY_LOGS, "Ghostly logs tag")
                .add(MysteriousItems.GHOSTLY_LOG.get())
                .add(MysteriousItems.GHOSTLY_STRIPPED_LOG.get())
                .add(MysteriousItems.GHOSTLY_WOOD.get())
                .add(MysteriousItems.GHOSTLY_STRIPPED_WOOD.get());

            tag(MysteriousTags.Items.SORBUS_LOGS, "Sorbus logs tag")
                .add(MysteriousItems.SORBUS_LOG.get())
                .add(MysteriousItems.SORBUS_STRIPPED_LOG.get())
                .add(MysteriousItems.SORBUS_WOOD.get())
                .add(MysteriousItems.SORBUS_STRIPPED_WOOD.get());

            tag(MysteriousTags.Items.SEEPING_LOGS, "Seeping logs tag")
                .add(MysteriousItems.SEEPING_LOG.get())
                .add(MysteriousItems.SEEPING_STRIPPED_LOG.get())
                .add(MysteriousItems.SEEPING_WOOD.get())
                .add(MysteriousItems.SEEPING_STRIPPED_WOOD.get());

            tag(MysteriousTags.Items.WALNUT_LOGS, "Walnut logs tag")
                .add(MysteriousItems.WALNUT_LOG.get())
                .add(MysteriousItems.WALNUT_STRIPPED_LOG.get())
                .add(MysteriousItems.WALNUT_WOOD.get())
                .add(MysteriousItems.WALNUT_STRIPPED_WOOD.get());

            tag(ItemTags.LOGS_THAT_BURN, "Logs that burn tag")
                .addTag(MysteriousTags.Items.BLOOD_SOAKED_LOGS)
                .addTag(MysteriousTags.Items.GHOSTLY_LOGS)
                .addTag(MysteriousTags.Items.SORBUS_LOGS)
                .addTag(MysteriousTags.Items.SEEPING_LOGS)
                .addTag(MysteriousTags.Items.WALNUT_LOGS);
        }
    }

    @SuppressWarnings("experimental")
    public static class MysteriousBlockTags extends SparkweaveBlockTagProvider {

        public MysteriousBlockTags(
            PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, MysteriousLands.MODID, lookupProvider);
        }

        @Override
        protected void addTags(@NotNull HolderLookup.Provider provider) {
            tag(BlockTags.PLANKS, "Planks tag")
                .add(MysteriousBlocks.BLOOD_SOAKED_PLANKS.get())
                .add(MysteriousBlocks.GHOSTLY_PLANKS.get())
                .add(MysteriousBlocks.SEEPING_PLANKS.get())
                .add(MysteriousBlocks.SORBUS_PLANKS.get())
                .add(MysteriousBlocks.WALNUT_PLANKS.get());

            tag(BlockTags.WOODEN_BUTTONS, "Wooden Buttons tag")
                .add(MysteriousBlocks.BLOOD_SOAKED_BUTTON.get())
                .add(MysteriousBlocks.GHOSTLY_BUTTON.get())
                .add(MysteriousBlocks.SEEPING_BUTTON.get())
                .add(MysteriousBlocks.SORBUS_BUTTON.get())
                .add(MysteriousBlocks.WALNUT_BUTTON.get());

            tag(BlockTags.WOODEN_DOORS, "Wooden Doors tag")
                .add(MysteriousBlocks.BLOOD_SOAKED_DOOR.get())
                .add(MysteriousBlocks.GHOSTLY_DOOR.get())
                .add(MysteriousBlocks.SEEPING_DOOR.get())
                .add(MysteriousBlocks.SORBUS_DOOR.get())
                .add(MysteriousBlocks.WALNUT_DOOR.get());

            tag(BlockTags.WOODEN_STAIRS, "Wooden Stairs tag")
                .add(MysteriousBlocks.BLOOD_SOAKED_STAIRS.get())
                .add(MysteriousBlocks.GHOSTLY_STAIRS.get())
                .add(MysteriousBlocks.SEEPING_STAIRS.get())
                .add(MysteriousBlocks.SORBUS_STAIRS.get())
                .add(MysteriousBlocks.WALNUT_STAIRS.get());

            tag(BlockTags.WOODEN_SLABS, "Wooden Slabs tag")
                .add(MysteriousBlocks.BLOOD_SOAKED_SLAB.get())
                .add(MysteriousBlocks.GHOSTLY_SLAB.get())
                .add(MysteriousBlocks.SEEPING_SLAB.get())
                .add(MysteriousBlocks.SORBUS_SLAB.get())
                .add(MysteriousBlocks.WALNUT_SLAB.get());

            tag(BlockTags.WOODEN_FENCES, "Wooden Fences tag")
                .add(MysteriousBlocks.BLOOD_SOAKED_FENCE.get())
                .add(MysteriousBlocks.GHOSTLY_FENCE.get())
                .add(MysteriousBlocks.SEEPING_FENCE.get())
                .add(MysteriousBlocks.SORBUS_FENCE.get())
                .add(MysteriousBlocks.WALNUT_FENCE.get());

            tag(BlockTags.SAPLINGS, "Saplings tag")
                .add(MysteriousBlocks.BLOOD_SOAKED_SAPLING.get())
                .add(MysteriousBlocks.GHOSTLY_SAPLING.get())
                .add(MysteriousBlocks.SEEPING_SAPLING.get())
                .add(MysteriousBlocks.SORBUS_SAPLING.get())
                .add(MysteriousBlocks.WALNUT_SAPLING.get());

            tag(BlockTags.WOODEN_PRESSURE_PLATES, "Pressure Plates tag")
                .add(MysteriousBlocks.BLOOD_SOAKED_PRESSURE_PLATE.get())
                .add(MysteriousBlocks.GHOSTLY_PRESSURE_PLATE.get())
                .add(MysteriousBlocks.SEEPING_PRESSURE_PLATE.get())
                .add(MysteriousBlocks.SORBUS_PRESSURE_PLATE.get())
                .add(MysteriousBlocks.WALNUT_PRESSURE_PLATE.get());

            tag(BlockTags.LEAVES, "Leaves tag")
                .add(MysteriousBlocks.BLOOD_SOAKED_LEAVES.get())
                .add(MysteriousBlocks.GHOSTLY_LEAVES.get())
                .add(MysteriousBlocks.SEEPING_LEAVES.get())
                .add(MysteriousBlocks.SORBUS_LEAVES.get())
                .add(MysteriousBlocks.WALNUT_LEAVES.get());

            tag(BlockTags.WOODEN_TRAPDOORS, "Trapdoor tag")
                .add(MysteriousBlocks.BLOOD_SOAKED_TRAPDOOR.get())
                .add(MysteriousBlocks.GHOSTLY_TRAPDOOR.get())
                .add(MysteriousBlocks.SEEPING_TRAPDOOR.get())
                .add(MysteriousBlocks.SORBUS_TRAPDOOR.get())
                .add(MysteriousBlocks.WALNUT_TRAPDOOR.get());

            tag(BlockTags.FENCE_GATES, "Fence gate tag")
                .add(MysteriousBlocks.BLOOD_SOAKED_GATE.get())
                .add(MysteriousBlocks.GHOSTLY_GATE.get())
                .add(MysteriousBlocks.SEEPING_GATE.get())
                .add(MysteriousBlocks.SORBUS_GATE.get())
                .add(MysteriousBlocks.WALNUT_GATE.get());

            tag(MysteriousTags.Blocks.BLOOD_SOAKED_LOGS, "Blood Soaked log tag")
                .add(MysteriousBlocks.BLOOD_SOAKED_LOG.get())
                .add(MysteriousBlocks.BLOOD_SOAKED_STRIPPED_LOG.get())
                .add(MysteriousBlocks.BLOOD_SOAKED_WOOD.get())
                .add(MysteriousBlocks.BLOOD_SOAKED_STRIPPED_WOOD.get());

            tag(MysteriousTags.Blocks.GHOSTLY_LOGS, "Ghostly log tag")
                .add(MysteriousBlocks.GHOSTLY_LOG.get())
                .add(MysteriousBlocks.GHOSTLY_STRIPPED_LOG.get())
                .add(MysteriousBlocks.GHOSTLY_WOOD.get())
                .add(MysteriousBlocks.GHOSTLY_STRIPPED_WOOD.get());

            tag(MysteriousTags.Blocks.SORBUS_LOGS, "Sorbus log tag")
                .add(MysteriousBlocks.SORBUS_LOG.get())
                .add(MysteriousBlocks.SORBUS_STRIPPED_LOG.get())
                .add(MysteriousBlocks.SORBUS_WOOD.get())
                .add(MysteriousBlocks.SORBUS_STRIPPED_WOOD.get());

            tag(MysteriousTags.Blocks.SEEPING_LOGS, "Seeping logs tag")
                .add(MysteriousBlocks.SEEPING_LOG.get())
                .add(MysteriousBlocks.SEEPING_STRIPPED_LOG.get())
                .add(MysteriousBlocks.SEEPING_WOOD.get())
                .add(MysteriousBlocks.SEEPING_STRIPPED_WOOD.get());

            tag(MysteriousTags.Blocks.WALNUT_LOGS, "Walnut logs tag")
                .add(MysteriousBlocks.WALNUT_LOG.get())
                .add(MysteriousBlocks.WALNUT_STRIPPED_LOG.get())
                .add(MysteriousBlocks.WALNUT_WOOD.get())
                .add(MysteriousBlocks.WALNUT_STRIPPED_WOOD.get());

            tag(BlockTags.LOGS_THAT_BURN, "Logs that burn tag")
                .addTag(MysteriousTags.Blocks.BLOOD_SOAKED_LOGS)
                .addTag(MysteriousTags.Blocks.GHOSTLY_LOGS)
                .addTag(MysteriousTags.Blocks.SORBUS_LOGS)
                .addTag(MysteriousTags.Blocks.SEEPING_LOGS)
                .addTag(MysteriousTags.Blocks.WALNUT_LOGS);

            tag(MysteriousTags.Blocks.SIGNS, "Signs tag")
                .add(MysteriousBlocks.BLOOD_SOAKED_WALL_SIGN.get())
                .add(MysteriousBlocks.GHOSTLY_WALL_SIGN.get())
                .add(MysteriousBlocks.SEEPING_WALL_SIGN.get())
                .add(MysteriousBlocks.SORBUS_WALL_SIGN.get())
                .add(MysteriousBlocks.WALNUT_WALL_SIGN.get())
                .add(MysteriousBlocks.BLOOD_SOAKED_SIGN.get())
                .add(MysteriousBlocks.GHOSTLY_SIGN.get())
                .add(MysteriousBlocks.SEEPING_SIGN.get())
                .add(MysteriousBlocks.SORBUS_SIGN.get())
                .add(MysteriousBlocks.WALNUT_SIGN.get());

            tag(MysteriousTags.Blocks.HANGING_SIGNS, "Hanging signs tag")
                .add(MysteriousBlocks.BLOOD_SOAKED_HANGING_SIGN.get())
                .add(MysteriousBlocks.GHOSTLY_HANGING_SIGN.get())
                .add(MysteriousBlocks.SEEPING_HANGING_SIGN.get())
                .add(MysteriousBlocks.SORBUS_HANGING_SIGN.get())
                .add(MysteriousBlocks.WALNUT_HANGING_SIGN.get())
                .add(MysteriousBlocks.BLOOD_SOAKED_WALL_HANGING_SIGN.get())
                .add(MysteriousBlocks.GHOSTLY_WALL_HANGING_SIGN.get())
                .add(MysteriousBlocks.SEEPING_WALL_HANGING_SIGN.get())
                .add(MysteriousBlocks.SORBUS_WALL_HANGING_SIGN.get())
                .add(MysteriousBlocks.WALNUT_WALL_HANGING_SIGN.get());

            tag(BlockTags.MINEABLE_WITH_AXE, "Mineable with axe tag")
                .addTag(MysteriousTags.Blocks.SIGNS)
                .addTag(MysteriousTags.Blocks.HANGING_SIGNS);
        }
    }
}
