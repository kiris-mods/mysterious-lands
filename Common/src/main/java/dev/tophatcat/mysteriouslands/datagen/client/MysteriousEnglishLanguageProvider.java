package dev.tophatcat.mysteriouslands.datagen.client;

import dev.tophatcat.mysteriouslands.init.MysteriousBlocks;
import dev.tophatcat.mysteriouslands.init.MysteriousCreativeTabs;
import dev.tophatcat.mysteriouslands.init.MysteriousItems;
import dev.upcraft.sparkweave.api.datagen.ContextAwarePackOutput;
import dev.upcraft.sparkweave.api.datagen.TranslationBuilder;
import dev.upcraft.sparkweave.api.datagen.provider.client.SparkweaveLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.locale.Language;

import java.util.concurrent.CompletableFuture;

public class MysteriousEnglishLanguageProvider extends SparkweaveLanguageProvider {

    public MysteriousEnglishLanguageProvider(ContextAwarePackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture, Language.DEFAULT);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registries, TranslationBuilder builder) {
        // Creative tab.
        builder.creativeTab(MysteriousCreativeTabs.MYSTERIOUS_TAB, "Mysterious Lands");

        // Logs
        builder.block(MysteriousBlocks.BLOOD_SOAKED_LOG, "Blood Soaked Log");
        builder.block(MysteriousBlocks.GHOSTLY_LOG, "Ghostly Log");
        builder.block(MysteriousBlocks.SEEPING_LOG, "Seeping Log");
        builder.block(MysteriousBlocks.SORBUS_LOG, "Sorbus Log");
        builder.block(MysteriousBlocks.WALNUT_LOG, "Walnut Log");

        // Woods
        builder.block(MysteriousBlocks.BLOOD_SOAKED_WOOD, "Blood Soaked Wood");
        builder.block(MysteriousBlocks.GHOSTLY_WOOD, "Ghostly Wood");
        builder.block(MysteriousBlocks.SEEPING_WOOD, "Seeping Wood");
        builder.block(MysteriousBlocks.SORBUS_WOOD, "Sorbus Wood");
        builder.block(MysteriousBlocks.WALNUT_WOOD, "Walnut Wood");

        // Stripped logs
        builder.block(MysteriousBlocks.BLOOD_SOAKED_STRIPPED_LOG, "Blood Soaked Stripped Log");
        builder.block(MysteriousBlocks.GHOSTLY_STRIPPED_LOG, "Ghostly Stripped Log");
        builder.block(MysteriousBlocks.SEEPING_STRIPPED_LOG, "Seeping Stripped Log");
        builder.block(MysteriousBlocks.SORBUS_STRIPPED_LOG, "Sorbus Stripped Log");
        builder.block(MysteriousBlocks.WALNUT_STRIPPED_LOG, "Walnut Stripped Log");

        // Stripped woods
        builder.block(MysteriousBlocks.BLOOD_SOAKED_STRIPPED_WOOD, "Blood Soaked Stripped Wood");
        builder.block(MysteriousBlocks.GHOSTLY_STRIPPED_WOOD, "Ghostly Stripped Wood");
        builder.block(MysteriousBlocks.SEEPING_STRIPPED_WOOD, "Seeping Stripped Wood");
        builder.block(MysteriousBlocks.SORBUS_STRIPPED_WOOD, "Sorbus Stripped Wood");
        builder.block(MysteriousBlocks.WALNUT_STRIPPED_WOOD, "Walnut Stripped Wood");

        // Buttons
        builder.block(MysteriousBlocks.BLOOD_SOAKED_BUTTON, "Blood Soaked Button");
        builder.block(MysteriousBlocks.GHOSTLY_BUTTON, "Ghostly Button");
        builder.block(MysteriousBlocks.SEEPING_BUTTON, "Seeping Button");
        builder.block(MysteriousBlocks.SORBUS_BUTTON, "Sorbus Button");
        builder.block(MysteriousBlocks.WALNUT_BUTTON, "Walnut Button");

        // Doors
        builder.block(MysteriousBlocks.BLOOD_SOAKED_DOOR, "Blood Soaked Door");
        builder.block(MysteriousBlocks.GHOSTLY_DOOR, "Ghostly Door");
        builder.block(MysteriousBlocks.SEEPING_DOOR, "Seeping Door");
        builder.block(MysteriousBlocks.SORBUS_DOOR, "Sorbus Door");
        builder.block(MysteriousBlocks.WALNUT_DOOR, "Walnut Door");

        // Fences
        builder.block(MysteriousBlocks.BLOOD_SOAKED_FENCE, "Blood Soaked Fence");
        builder.block(MysteriousBlocks.GHOSTLY_FENCE, "Ghostly Fence");
        builder.block(MysteriousBlocks.SEEPING_FENCE, "Seeping Fence");
        builder.block(MysteriousBlocks.SORBUS_FENCE, "Sorbus Fence");
        builder.block(MysteriousBlocks.WALNUT_FENCE, "Walnut Fence");

        // Gates
        builder.block(MysteriousBlocks.BLOOD_SOAKED_GATE, "Blood Soaked Gate");
        builder.block(MysteriousBlocks.GHOSTLY_GATE, "Ghostly Gate");
        builder.block(MysteriousBlocks.SEEPING_GATE, "Seeping Gate");
        builder.block(MysteriousBlocks.SORBUS_GATE, "Sorbus Gate");
        builder.block(MysteriousBlocks.WALNUT_GATE, "Walnut Gate");

        // Leaves
        builder.block(MysteriousBlocks.BLOOD_SOAKED_LEAVES, "Blood Soaked Leaves");
        builder.block(MysteriousBlocks.GHOSTLY_LEAVES, "Ghostly Leaves");
        builder.block(MysteriousBlocks.SEEPING_LEAVES, "Seeping Leaves");
        builder.block(MysteriousBlocks.SORBUS_LEAVES, "Sorbus Leaves");
        builder.block(MysteriousBlocks.WALNUT_LEAVES, "Walnut Leaves");

        // Planks
        builder.block(MysteriousBlocks.BLOOD_SOAKED_PLANKS, "Blood Soaked Planks");
        builder.block(MysteriousBlocks.GHOSTLY_PLANKS, "Ghostly Planks");
        builder.block(MysteriousBlocks.SEEPING_PLANKS, "Seeping Planks");
        builder.block(MysteriousBlocks.SORBUS_PLANKS, "Sorbus Planks");
        builder.block(MysteriousBlocks.WALNUT_PLANKS, "Walnut Planks");

        // Pressure plates
        builder.block(MysteriousBlocks.BLOOD_SOAKED_PRESSURE_PLATE, "Blood Soaked Pressure Plate");
        builder.block(MysteriousBlocks.GHOSTLY_PRESSURE_PLATE, "Ghostly Pressure Plate");
        builder.block(MysteriousBlocks.SEEPING_PRESSURE_PLATE, "Seeping Pressure Plate");
        builder.block(MysteriousBlocks.SORBUS_PRESSURE_PLATE, "Sorbus Pressure Plate");
        builder.block(MysteriousBlocks.WALNUT_PRESSURE_PLATE, "Walnut Pressure Plate");

        // Saplings
        builder.block(MysteriousBlocks.BLOOD_SOAKED_SAPLING, "Blood Soaked Sapling");
        builder.block(MysteriousBlocks.GHOSTLY_SAPLING, "Ghostly Sapling");
        builder.block(MysteriousBlocks.SEEPING_SAPLING, "Seeping Sapling");
        builder.block(MysteriousBlocks.SORBUS_SAPLING, "Sorbus Sapling");
        builder.block(MysteriousBlocks.WALNUT_SAPLING, "Walnut Sapling");

        // Signs
        builder.item(MysteriousItems.BLOOD_SOAKED_SIGN, "Blood Soaked Sign");
        builder.item(MysteriousItems.GHOSTLY_SIGN, "Ghostly Sign");
        builder.item(MysteriousItems.SEEPING_SIGN, "Seeping Sign");
        builder.item(MysteriousItems.SORBUS_SIGN, "Sorbus Sign");
        builder.item(MysteriousItems.WALNUT_SIGN, "Walnut Sign");

        // Hanging signs
        builder.block(MysteriousBlocks.BLOOD_SOAKED_HANGING_SIGN, "Blood Soaked Hanging Sign");
        builder.block(MysteriousBlocks.GHOSTLY_HANGING_SIGN, "Ghostly Hanging Sign");
        builder.block(MysteriousBlocks.SEEPING_HANGING_SIGN, "Seeping Hanging Sign");
        builder.block(MysteriousBlocks.SORBUS_HANGING_SIGN, "Sorbus Hanging Sign");
        builder.block(MysteriousBlocks.WALNUT_HANGING_SIGN, "Walnut Hanging Sign");

        // Slabs
        builder.block(MysteriousBlocks.BLOOD_SOAKED_SLAB, "Blood Soaked Slab");
        builder.block(MysteriousBlocks.GHOSTLY_SLAB, "Ghostly Slab");
        builder.block(MysteriousBlocks.SEEPING_SLAB, "Seeping Slab");
        builder.block(MysteriousBlocks.SORBUS_SLAB, "Sorbus Slab");
        builder.block(MysteriousBlocks.WALNUT_SLAB, "Walnut Slab");

        // Stairs
        builder.block(MysteriousBlocks.BLOOD_SOAKED_STAIRS, "Blood Soaked Stairs");
        builder.block(MysteriousBlocks.GHOSTLY_STAIRS, "Ghostly Stairs");
        builder.block(MysteriousBlocks.SEEPING_STAIRS, "Seeping Stairs");
        builder.block(MysteriousBlocks.SORBUS_STAIRS, "Sorbus Stairs");
        builder.block(MysteriousBlocks.WALNUT_STAIRS, "Walnut Stairs");

        // Trapdoors
        builder.block(MysteriousBlocks.BLOOD_SOAKED_TRAPDOOR, "Blood Soaked Trapdoor");
        builder.block(MysteriousBlocks.GHOSTLY_TRAPDOOR, "Ghostly Trapdoor");
        builder.block(MysteriousBlocks.SEEPING_TRAPDOOR, "Seeping Trapdoor");
        builder.block(MysteriousBlocks.SORBUS_TRAPDOOR, "Sorbus Trapdoor");
        builder.block(MysteriousBlocks.WALNUT_TRAPDOOR, "Walnut Trapdoor");
    }
}
