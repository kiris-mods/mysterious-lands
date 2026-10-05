package dev.tophatcat.mysteriouslands.datagen.server;

import dev.tophatcat.mysteriouslands.init.MysteriousBlocks;
import dev.tophatcat.mysteriouslands.init.MysteriousItems;
import dev.tophatcat.mysteriouslands.data.MysteriousTags;

import dev.upcraft.sparkweave.api.datagen.provider.common.SparkweaveRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;

public class MysteriousRecipeProvider extends SparkweaveRecipeProvider {

    public MysteriousRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    public void buildRecipes() {
        // Planks
        shapeless(
                RecipeCategory.BUILDING_BLOCKS, MysteriousBlocks.BLOOD_SOAKED_PLANKS.get(), 4)
            .requires(MysteriousTags.Items.BLOOD_SOAKED_LOGS)
            .unlockedBy("has_log", has(MysteriousTags.Items.BLOOD_SOAKED_LOGS))
            .group("planks")
            .save(output);
        shapeless(
                RecipeCategory.BUILDING_BLOCKS, MysteriousBlocks.GHOSTLY_PLANKS.get(), 4)
            .requires(MysteriousTags.Items.GHOSTLY_LOGS)
            .unlockedBy("has_log", has(MysteriousTags.Items.GHOSTLY_LOGS))
            .group("planks")
            .save(output);
        shapeless(
                RecipeCategory.BUILDING_BLOCKS, MysteriousBlocks.SORBUS_PLANKS.get(), 4)
            .requires(MysteriousTags.Items.SORBUS_LOGS)
            .unlockedBy("has_log", has(MysteriousTags.Items.SORBUS_LOGS))
            .group("planks")
            .save(output);
        shapeless(
                RecipeCategory.BUILDING_BLOCKS, MysteriousBlocks.SEEPING_PLANKS.get(), 4)
            .requires(MysteriousTags.Items.SEEPING_LOGS)
            .unlockedBy("has_log", has(MysteriousTags.Items.SEEPING_LOGS))
            .group("planks")
            .save(output);
        shapeless(
                RecipeCategory.BUILDING_BLOCKS, MysteriousBlocks.WALNUT_PLANKS.get(), 4)
            .requires(MysteriousTags.Items.WALNUT_LOGS)
            .unlockedBy("has_log", has(MysteriousTags.Items.WALNUT_LOGS))
            .group("planks")
            .save(output);

        // Buttons
        shapeless(
                RecipeCategory.REDSTONE, MysteriousBlocks.BLOOD_SOAKED_BUTTON.get())
            .requires(MysteriousBlocks.BLOOD_SOAKED_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.BLOOD_SOAKED_PLANKS.get()))
            .group("wooden_button")
            .save(output);
        shapeless(
                RecipeCategory.REDSTONE, MysteriousBlocks.GHOSTLY_BUTTON.get())
            .requires(MysteriousBlocks.GHOSTLY_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.GHOSTLY_PLANKS.get()))
            .group("wooden_button")
            .save(output);
        shapeless(
                RecipeCategory.REDSTONE, MysteriousBlocks.SORBUS_BUTTON.get())
            .requires(MysteriousBlocks.SORBUS_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.SORBUS_PLANKS.get()))
            .group("wooden_button")
            .save(output);
        shapeless(
                RecipeCategory.REDSTONE, MysteriousBlocks.SEEPING_BUTTON.get())
            .requires(MysteriousBlocks.SEEPING_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.SEEPING_PLANKS.get()))
            .group("wooden_button")
            .save(output);
        shapeless(
                RecipeCategory.REDSTONE, MysteriousBlocks.WALNUT_BUTTON.get())
            .requires(MysteriousBlocks.WALNUT_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.WALNUT_PLANKS.get()))
            .group("wooden_button")
            .save(output);

        // Doors
        shaped(RecipeCategory.REDSTONE, MysteriousBlocks.BLOOD_SOAKED_DOOR.get(), 3)
            .pattern("WW")
            .pattern("WW")
            .pattern("WW")
            .define('W', MysteriousBlocks.BLOOD_SOAKED_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.BLOOD_SOAKED_PLANKS.get()))
            .group("wooden_door")
            .save(output);
        shaped(RecipeCategory.REDSTONE, MysteriousBlocks.GHOSTLY_DOOR.get(), 3)
            .pattern("WW")
            .pattern("WW")
            .pattern("WW")
            .define('W', MysteriousBlocks.GHOSTLY_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.GHOSTLY_PLANKS.get()))
            .group("wooden_door")
            .save(output);
        shaped(RecipeCategory.REDSTONE, MysteriousBlocks.SORBUS_DOOR.get(), 3)
            .pattern("WW")
            .pattern("WW")
            .pattern("WW")
            .define('W', MysteriousBlocks.SORBUS_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.SORBUS_PLANKS.get()))
            .group("wooden_door")
            .save(output);
        shaped(RecipeCategory.REDSTONE, MysteriousBlocks.SEEPING_DOOR.get(), 3)
            .pattern("WW")
            .pattern("WW")
            .pattern("WW")
            .define('W', MysteriousBlocks.SEEPING_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.SEEPING_PLANKS.get()))
            .group("wooden_door")
            .save(output);
        shaped(RecipeCategory.REDSTONE, MysteriousBlocks.WALNUT_DOOR.get(), 3)
            .pattern("WW")
            .pattern("WW")
            .pattern("WW")
            .define('W', MysteriousBlocks.WALNUT_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.WALNUT_PLANKS.get()))
            .group("wooden_door")
            .save(output);

        // Fences
        shaped(RecipeCategory.MISC, MysteriousBlocks.BLOOD_SOAKED_FENCE.get(), 3)
            .pattern("WSW")
            .pattern("WSW")
            .define('W', MysteriousBlocks.BLOOD_SOAKED_PLANKS.get())
            .define('S', Items.STICK)
            .unlockedBy("has_planks", has(MysteriousBlocks.BLOOD_SOAKED_PLANKS.get()))
            .group("wooden_fence")
            .save(output);
        shaped(RecipeCategory.MISC, MysteriousBlocks.GHOSTLY_FENCE.get(), 3)
            .pattern("WSW")
            .pattern("WSW")
            .define('W', MysteriousBlocks.GHOSTLY_PLANKS.get())
            .define('S', Items.STICK)
            .unlockedBy("has_planks", has(MysteriousBlocks.GHOSTLY_PLANKS.get()))
            .group("wooden_fence")
            .save(output);
        shaped(RecipeCategory.MISC, MysteriousBlocks.SORBUS_FENCE.get(), 3)
            .pattern("WSW")
            .pattern("WSW")
            .define('W', MysteriousBlocks.SORBUS_PLANKS.get())
            .define('S', Items.STICK)
            .unlockedBy("has_planks", has(MysteriousBlocks.SORBUS_PLANKS.get()))
            .group("wooden_fence")
            .save(output);
        shaped(RecipeCategory.MISC, MysteriousBlocks.SEEPING_FENCE.get(), 3)
            .pattern("WSW")
            .pattern("WSW")
            .define('W', MysteriousBlocks.SEEPING_PLANKS.get())
            .define('S', Items.STICK)
            .unlockedBy("has_planks", has(MysteriousBlocks.SEEPING_PLANKS.get()))
            .group("wooden_fence")
            .save(output);
        shaped(RecipeCategory.MISC, MysteriousBlocks.WALNUT_FENCE.get(), 3)
            .pattern("WSW")
            .pattern("WSW")
            .define('W', MysteriousBlocks.WALNUT_PLANKS.get())
            .define('S', Items.STICK)
            .unlockedBy("has_planks", has(MysteriousBlocks.WALNUT_PLANKS.get()))
            .group("wooden_fence")
            .save(output);

        // Gates
        shaped(RecipeCategory.REDSTONE, MysteriousBlocks.BLOOD_SOAKED_GATE.get())
            .pattern("SWS")
            .pattern("SWS")
            .define('W', MysteriousBlocks.BLOOD_SOAKED_PLANKS.get())
            .define('S', Items.STICK)
            .unlockedBy("has_planks", has(MysteriousBlocks.BLOOD_SOAKED_PLANKS.get()))
            .group("wooden_fence_gate")
            .save(output);
        shaped(RecipeCategory.REDSTONE, MysteriousBlocks.GHOSTLY_GATE.get())
            .pattern("SWS")
            .pattern("SWS")
            .define('W', MysteriousBlocks.GHOSTLY_PLANKS.get())
            .define('S', Items.STICK)
            .unlockedBy("has_planks", has(MysteriousBlocks.GHOSTLY_PLANKS.get()))
            .group("wooden_fence_gate")
            .save(output);
        shaped(RecipeCategory.REDSTONE, MysteriousBlocks.SORBUS_GATE.get())
            .pattern("SWS")
            .pattern("SWS")
            .define('W', MysteriousBlocks.SORBUS_PLANKS.get())
            .define('S', Items.STICK)
            .unlockedBy("has_planks", has(MysteriousBlocks.SORBUS_PLANKS.get()))
            .group("wooden_fence_gate")
            .save(output);
        shaped(RecipeCategory.REDSTONE, MysteriousBlocks.SEEPING_GATE.get())
            .pattern("SWS")
            .pattern("SWS")
            .define('W', MysteriousBlocks.SEEPING_PLANKS.get())
            .define('S', Items.STICK)
            .unlockedBy("has_planks", has(MysteriousBlocks.SEEPING_PLANKS.get()))
            .group("wooden_fence_gate")
            .save(output);
        shaped(RecipeCategory.REDSTONE, MysteriousBlocks.WALNUT_GATE.get())
            .pattern("SWS")
            .pattern("SWS")
            .define('W', MysteriousBlocks.WALNUT_PLANKS.get())
            .define('S', Items.STICK)
            .unlockedBy("has_planks", has(MysteriousBlocks.WALNUT_PLANKS.get()))
            .group("wooden_fence_gate")
            .save(output);

        // Hanging signs
        shaped(
                RecipeCategory.MISC, MysteriousBlocks.BLOOD_SOAKED_HANGING_SIGN.get(), 6)
            .pattern("X X")
            .pattern("WWW")
            .pattern("WWW")
            .define('W', MysteriousBlocks.BLOOD_SOAKED_STRIPPED_LOG.get())
            .define('X', Items.IRON_CHAIN)
            .unlockedBy(
                "has_stripped_logs",
                has(MysteriousBlocks.BLOOD_SOAKED_STRIPPED_LOG.get()))
            .group("hanging_sign")
            .save(output);
        shaped(
                RecipeCategory.MISC, MysteriousBlocks.GHOSTLY_HANGING_SIGN.get(), 6)
            .pattern("X X")
            .pattern("WWW")
            .pattern("WWW")
            .define('W', MysteriousBlocks.GHOSTLY_STRIPPED_LOG.get())
            .define('X', Items.IRON_CHAIN)
            .unlockedBy(
                "has_stripped_logs", has(MysteriousBlocks.GHOSTLY_STRIPPED_LOG.get()))
            .group("hanging_sign")
            .save(output);
        shaped(RecipeCategory.MISC, MysteriousBlocks.SORBUS_HANGING_SIGN.get(), 6)
            .pattern("X X")
            .pattern("WWW")
            .pattern("WWW")
            .define('W', MysteriousBlocks.SORBUS_STRIPPED_LOG.get())
            .define('X', Items.IRON_CHAIN)
            .unlockedBy(
                "has_stripped_logs", has(MysteriousBlocks.SORBUS_STRIPPED_LOG.get()))
            .group("hanging_sign")
            .save(output);
        shaped(
                RecipeCategory.MISC, MysteriousBlocks.SEEPING_HANGING_SIGN.get(), 6)
            .pattern("X X")
            .pattern("WWW")
            .pattern("WWW")
            .define('W', MysteriousBlocks.SEEPING_STRIPPED_LOG.get())
            .define('X', Items.IRON_CHAIN)
            .unlockedBy(
                "has_stripped_logs", has(MysteriousBlocks.SEEPING_STRIPPED_LOG.get()))
            .group("hanging_sign")
            .save(output);
        shaped(RecipeCategory.MISC, MysteriousBlocks.WALNUT_HANGING_SIGN.get(), 6)
            .pattern("X X")
            .pattern("WWW")
            .pattern("WWW")
            .define('W', MysteriousBlocks.WALNUT_STRIPPED_LOG.get())
            .define('X', Items.IRON_CHAIN)
            .unlockedBy(
                "has_stripped_logs", has(MysteriousBlocks.WALNUT_STRIPPED_LOG.get()))
            .group("hanging_sign")
            .save(output);

        // Pressure plates
        shaped(
                RecipeCategory.REDSTONE, MysteriousBlocks.BLOOD_SOAKED_PRESSURE_PLATE.get())
            .pattern("WW")
            .define('W', MysteriousBlocks.BLOOD_SOAKED_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.BLOOD_SOAKED_PLANKS.get()))
            .group("wooden_pressure_plate")
            .save(output);
        shaped(
                RecipeCategory.REDSTONE, MysteriousBlocks.GHOSTLY_PRESSURE_PLATE.get())
            .pattern("WW")
            .define('W', MysteriousBlocks.GHOSTLY_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.GHOSTLY_PLANKS.get()))
            .group("wooden_pressure_plate")
            .save(output);
        shaped(
                RecipeCategory.REDSTONE, MysteriousBlocks.SORBUS_PRESSURE_PLATE.get())
            .pattern("WW")
            .define('W', MysteriousBlocks.SORBUS_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.SORBUS_PLANKS.get()))
            .group("wooden_pressure_plate")
            .save(output);
        shaped(
                RecipeCategory.REDSTONE, MysteriousBlocks.SEEPING_PRESSURE_PLATE.get())
            .pattern("WW")
            .define('W', MysteriousBlocks.SEEPING_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.SEEPING_PLANKS.get()))
            .group("wooden_pressure_plate")
            .save(output);
        shaped(
                RecipeCategory.REDSTONE, MysteriousBlocks.WALNUT_PRESSURE_PLATE.get())
            .pattern("WW")
            .define('W', MysteriousBlocks.WALNUT_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.WALNUT_PLANKS.get()))
            .group("wooden_pressure_plate")
            .save(output);

        // Signs
        shaped(RecipeCategory.MISC, MysteriousItems.BLOOD_SOAKED_SIGN.get(), 3)
            .pattern("WWW")
            .pattern("WWW")
            .pattern(" S ")
            .define('W', MysteriousBlocks.BLOOD_SOAKED_PLANKS.get())
            .define('S', Items.STICK)
            .unlockedBy("has_planks", has(MysteriousBlocks.BLOOD_SOAKED_PLANKS.get()))
            .group("wooden_sign")
            .save(output);
        shaped(RecipeCategory.MISC, MysteriousItems.GHOSTLY_SIGN.get(), 3)
            .pattern("WWW")
            .pattern("WWW")
            .pattern(" S ")
            .define('W', MysteriousBlocks.GHOSTLY_PLANKS.get())
            .define('S', Items.STICK)
            .unlockedBy("has_planks", has(MysteriousBlocks.GHOSTLY_PLANKS.get()))
            .group("wooden_sign")
            .save(output);
        shaped(RecipeCategory.MISC, MysteriousItems.SORBUS_SIGN.get(), 3)
            .pattern("WWW")
            .pattern("WWW")
            .pattern(" S ")
            .define('W', MysteriousBlocks.SORBUS_PLANKS.get())
            .define('S', Items.STICK)
            .unlockedBy("has_planks", has(MysteriousBlocks.SORBUS_PLANKS.get()))
            .group("wooden_sign")
            .save(output);
        shaped(RecipeCategory.MISC, MysteriousItems.SEEPING_SIGN.get(), 3)
            .pattern("WWW")
            .pattern("WWW")
            .pattern(" S ")
            .define('W', MysteriousBlocks.SEEPING_PLANKS.get())
            .define('S', Items.STICK)
            .unlockedBy("has_planks", has(MysteriousBlocks.SEEPING_PLANKS.get()))
            .group("wooden_sign")
            .save(output);
        shaped(RecipeCategory.MISC, MysteriousItems.WALNUT_SIGN.get(), 3)
            .pattern("WWW")
            .pattern("WWW")
            .pattern(" S ")
            .define('W', MysteriousBlocks.WALNUT_PLANKS.get())
            .define('S', Items.STICK)
            .unlockedBy("has_planks", has(MysteriousBlocks.WALNUT_PLANKS.get()))
            .group("wooden_sign")
            .save(output);

        // Slabs
        shaped(
                RecipeCategory.BUILDING_BLOCKS, MysteriousBlocks.BLOOD_SOAKED_SLAB.get(), 6)
            .pattern("WWW")
            .define('W', MysteriousBlocks.BLOOD_SOAKED_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.BLOOD_SOAKED_PLANKS.get()))
            .group("wooden_slab")
            .save(output);
        shaped(
                RecipeCategory.BUILDING_BLOCKS, MysteriousBlocks.GHOSTLY_SLAB.get(), 6)
            .pattern("WWW")
            .define('W', MysteriousBlocks.GHOSTLY_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.GHOSTLY_PLANKS.get()))
            .group("wooden_slab")
            .save(output);
        shaped(
                RecipeCategory.BUILDING_BLOCKS, MysteriousBlocks.SORBUS_SLAB.get(), 6)
            .pattern("WWW")
            .define('W', MysteriousBlocks.SORBUS_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.SORBUS_PLANKS.get()))
            .group("wooden_slab")
            .save(output);
        shaped(
                RecipeCategory.BUILDING_BLOCKS, MysteriousBlocks.SEEPING_SLAB.get(), 6)
            .pattern("WWW")
            .define('W', MysteriousBlocks.SEEPING_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.SEEPING_PLANKS.get()))
            .group("wooden_slab")
            .save(output);
        shaped(
                RecipeCategory.BUILDING_BLOCKS, MysteriousBlocks.WALNUT_SLAB.get(), 6)
            .pattern("WWW")
            .define('W', MysteriousBlocks.WALNUT_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.WALNUT_PLANKS.get()))
            .group("wooden_slab")
            .save(output);

        // Stairs
        shaped(
                RecipeCategory.BUILDING_BLOCKS, MysteriousBlocks.BLOOD_SOAKED_STAIRS.get(), 4)
            .pattern("W  ")
            .pattern("WW ")
            .pattern("WWW")
            .define('W', MysteriousBlocks.BLOOD_SOAKED_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.BLOOD_SOAKED_PLANKS.get()))
            .group("wooden_stairs")
            .save(output);
        shaped(
                RecipeCategory.BUILDING_BLOCKS, MysteriousBlocks.GHOSTLY_STAIRS.get(), 4)
            .pattern("W  ")
            .pattern("WW ")
            .pattern("WWW")
            .define('W', MysteriousBlocks.GHOSTLY_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.GHOSTLY_PLANKS.get()))
            .group("wooden_stairs")
            .save(output);
        shaped(
                RecipeCategory.BUILDING_BLOCKS, MysteriousBlocks.SORBUS_STAIRS.get(), 4)
            .pattern("W  ")
            .pattern("WW ")
            .pattern("WWW")
            .define('W', MysteriousBlocks.SORBUS_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.SORBUS_PLANKS.get()))
            .group("wooden_stairs")
            .save(output);
        shaped(
                RecipeCategory.BUILDING_BLOCKS, MysteriousBlocks.SEEPING_STAIRS.get(), 4)
            .pattern("W  ")
            .pattern("WW ")
            .pattern("WWW")
            .define('W', MysteriousBlocks.SEEPING_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.SEEPING_PLANKS.get()))
            .group("wooden_stairs")
            .save(output);
        shaped(
                RecipeCategory.BUILDING_BLOCKS, MysteriousBlocks.WALNUT_STAIRS.get(), 4)
            .pattern("W  ")
            .pattern("WW ")
            .pattern("WWW")
            .define('W', MysteriousBlocks.WALNUT_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.WALNUT_PLANKS.get()))
            .group("wooden_stairs")
            .save(output);

        // Trapdoors
        shaped(
                RecipeCategory.REDSTONE, MysteriousBlocks.BLOOD_SOAKED_TRAPDOOR.get(), 2)
            .pattern("WWW")
            .pattern("WWW")
            .define('W', MysteriousBlocks.BLOOD_SOAKED_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.BLOOD_SOAKED_PLANKS.get()))
            .group("wooden_trapdoor")
            .save(output);
        shaped(
                RecipeCategory.REDSTONE, MysteriousBlocks.GHOSTLY_TRAPDOOR.get(), 2)
            .pattern("WWW")
            .pattern("WWW")
            .define('W', MysteriousBlocks.GHOSTLY_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.GHOSTLY_PLANKS.get()))
            .group("wooden_trapdoor")
            .save(output);
        shaped(RecipeCategory.REDSTONE, MysteriousBlocks.SORBUS_TRAPDOOR.get(), 2)
            .pattern("WWW")
            .pattern("WWW")
            .define('W', MysteriousBlocks.SORBUS_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.SORBUS_PLANKS.get()))
            .group("wooden_trapdoor")
            .save(output);
        shaped(
                RecipeCategory.REDSTONE, MysteriousBlocks.SEEPING_TRAPDOOR.get(), 2)
            .pattern("WWW")
            .pattern("WWW")
            .define('W', MysteriousBlocks.SEEPING_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.SEEPING_PLANKS.get()))
            .group("wooden_trapdoor")
            .save(output);
        shaped(RecipeCategory.REDSTONE, MysteriousBlocks.WALNUT_TRAPDOOR.get(), 2)
            .pattern("WWW")
            .pattern("WWW")
            .define('W', MysteriousBlocks.WALNUT_PLANKS.get())
            .unlockedBy("has_planks", has(MysteriousBlocks.WALNUT_PLANKS.get()))
            .group("wooden_trapdoor")
            .save(output);

        // Woods
        shaped(
                RecipeCategory.BUILDING_BLOCKS, MysteriousBlocks.BLOOD_SOAKED_WOOD.get(), 3)
            .pattern("WW")
            .pattern("WW")
            .define('W', MysteriousBlocks.BLOOD_SOAKED_LOG.get())
            .unlockedBy("has_log", has(MysteriousBlocks.BLOOD_SOAKED_LOG.get()))
            .group("bark")
            .save(output);
        shaped(
                RecipeCategory.BUILDING_BLOCKS, MysteriousBlocks.GHOSTLY_WOOD.get(), 3)
            .pattern("WW")
            .pattern("WW")
            .define('W', MysteriousBlocks.GHOSTLY_LOG.get())
            .unlockedBy("has_log", has(MysteriousBlocks.GHOSTLY_LOG.get()))
            .group("bark")
            .save(output);
        shaped(
                RecipeCategory.BUILDING_BLOCKS, MysteriousBlocks.SORBUS_WOOD.get(), 3)
            .pattern("WW")
            .pattern("WW")
            .define('W', MysteriousBlocks.SORBUS_LOG.get())
            .unlockedBy("has_log", has(MysteriousBlocks.SORBUS_LOG.get()))
            .group("bark")
            .save(output);
        shaped(
                RecipeCategory.BUILDING_BLOCKS, MysteriousBlocks.SEEPING_WOOD.get(), 3)
            .pattern("WW")
            .pattern("WW")
            .define('W', MysteriousBlocks.SEEPING_LOG.get())
            .unlockedBy("has_log", has(MysteriousBlocks.SEEPING_LOG.get()))
            .group("bark")
            .save(output);
        shaped(
                RecipeCategory.BUILDING_BLOCKS, MysteriousBlocks.WALNUT_WOOD.get(), 3)
            .pattern("WW")
            .pattern("WW")
            .define('W', MysteriousBlocks.WALNUT_LOG.get())
            .unlockedBy("has_log", has(MysteriousBlocks.WALNUT_LOG.get()))
            .group("bark")
            .save(output);
    }
}
