package dev.tophatcat.mysteriouslands.datagen.client;

import dev.tophatcat.mysteriouslands.data.MysteriousBlockFamilies;
import dev.tophatcat.mysteriouslands.init.MysteriousBlocks;
import dev.tophatcat.mysteriouslands.init.MysteriousItems;
import dev.upcraft.sparkweave.api.datagen.ContextAwarePackOutput;
import dev.upcraft.sparkweave.api.datagen.provider.client.SparkweaveModelProvider;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class MysteriousModelProvider extends SparkweaveModelProvider {

    public MysteriousModelProvider(ContextAwarePackOutput output) {
        super(output);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        blockModels.family(MysteriousBlocks.BLOOD_SOAKED_PLANKS.get()).generateFor(MysteriousBlockFamilies.BLOOD_SOAKED_PLANKS);
        blockModels.createPlantWithDefaultItem(MysteriousBlocks.BLOOD_SOAKED_SAPLING.get(), MysteriousBlocks.POTTED_BLOOD_SOAKED_SAPLING.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createRotatedVariantBlock(MysteriousBlocks.BLOOD_SOAKED_LOG.get());
        blockModels.createRotatedVariantBlock(MysteriousBlocks.BLOOD_SOAKED_STRIPPED_LOG.get());
        blockModels.createTrivialCube(MysteriousBlocks.BLOOD_SOAKED_WOOD.get());
        blockModels.createTrivialCube(MysteriousBlocks.BLOOD_SOAKED_STRIPPED_WOOD.get());
        blockModels.createTrivialCube(MysteriousBlocks.BLOOD_SOAKED_LEAVES.get());
        blockModels.createHangingSign(MysteriousBlocks.BLOOD_SOAKED_PLANKS.get(), MysteriousBlocks.BLOOD_SOAKED_HANGING_SIGN.get(), MysteriousBlocks.BLOOD_SOAKED_WALL_HANGING_SIGN.get());

        blockModels.family(MysteriousBlocks.GHOSTLY_PLANKS.get()).generateFor(MysteriousBlockFamilies.GHOSTLY_PLANKS);
        blockModels.createPlantWithDefaultItem(MysteriousBlocks.GHOSTLY_SAPLING.get(), MysteriousBlocks.POTTED_GHOSTLY_SAPLING.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createRotatedVariantBlock(MysteriousBlocks.GHOSTLY_LOG.get());
        blockModels.createRotatedVariantBlock(MysteriousBlocks.GHOSTLY_STRIPPED_LOG.get());
        blockModels.createTrivialCube(MysteriousBlocks.GHOSTLY_WOOD.get());
        blockModels.createTrivialCube(MysteriousBlocks.GHOSTLY_STRIPPED_WOOD.get());
        blockModels.createTrivialCube(MysteriousBlocks.GHOSTLY_LEAVES.get());
        blockModels.createHangingSign(MysteriousBlocks.GHOSTLY_PLANKS.get(), MysteriousBlocks.GHOSTLY_HANGING_SIGN.get(), MysteriousBlocks.GHOSTLY_WALL_HANGING_SIGN.get());

        blockModels.family(MysteriousBlocks.SEEPING_PLANKS.get()).generateFor(MysteriousBlockFamilies.SEEPING_PLANKS);
        blockModels.createPlantWithDefaultItem(MysteriousBlocks.SEEPING_SAPLING.get(), MysteriousBlocks.POTTED_SEEPING_SAPLING.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createRotatedVariantBlock(MysteriousBlocks.SEEPING_LOG.get());
        blockModels.createRotatedVariantBlock(MysteriousBlocks.SEEPING_STRIPPED_LOG.get());
        blockModels.createTrivialCube(MysteriousBlocks.SEEPING_WOOD.get());
        blockModels.createTrivialCube(MysteriousBlocks.SEEPING_STRIPPED_WOOD.get());
        blockModels.createTrivialCube(MysteriousBlocks.SEEPING_LEAVES.get());
        blockModels.createHangingSign(MysteriousBlocks.SEEPING_PLANKS.get(), MysteriousBlocks.SEEPING_HANGING_SIGN.get(), MysteriousBlocks.SEEPING_WALL_HANGING_SIGN.get());

        blockModels.family(MysteriousBlocks.SORBUS_PLANKS.get()).generateFor(MysteriousBlockFamilies.SORBUS_PLANKS);
        blockModels.createPlantWithDefaultItem(MysteriousBlocks.SORBUS_SAPLING.get(), MysteriousBlocks.POTTED_SORBUS_SAPLING.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createRotatedVariantBlock(MysteriousBlocks.SORBUS_LOG.get());
        blockModels.createRotatedVariantBlock(MysteriousBlocks.SORBUS_STRIPPED_LOG.get());
        blockModels.createTrivialCube(MysteriousBlocks.SORBUS_WOOD.get());
        blockModels.createTrivialCube(MysteriousBlocks.SORBUS_STRIPPED_WOOD.get());
        blockModels.createTrivialCube(MysteriousBlocks.SORBUS_LEAVES.get());
        blockModels.createHangingSign(MysteriousBlocks.SORBUS_PLANKS.get(), MysteriousBlocks.SORBUS_HANGING_SIGN.get(), MysteriousBlocks.SORBUS_WALL_HANGING_SIGN.get());

        blockModels.family(MysteriousBlocks.WALNUT_PLANKS.get()).generateFor(MysteriousBlockFamilies.WALNUT_PLANKS);
        blockModels.createPlantWithDefaultItem(MysteriousBlocks.WALNUT_SAPLING.get(), MysteriousBlocks.POTTED_WALNUT_SAPLING.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createRotatedVariantBlock(MysteriousBlocks.WALNUT_LOG.get());
        blockModels.createRotatedVariantBlock(MysteriousBlocks.WALNUT_STRIPPED_LOG.get());
        blockModels.createTrivialCube(MysteriousBlocks.WALNUT_WOOD.get());
        blockModels.createTrivialCube(MysteriousBlocks.WALNUT_STRIPPED_WOOD.get());
        blockModels.createTrivialCube(MysteriousBlocks.WALNUT_LEAVES.get());
        blockModels.createHangingSign(MysteriousBlocks.WALNUT_PLANKS.get(), MysteriousBlocks.WALNUT_HANGING_SIGN.get(), MysteriousBlocks.WALNUT_WALL_HANGING_SIGN.get());

        itemModels.generateFlatItem(MysteriousItems.BLOOD_SOAKED_BOAT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(MysteriousItems.GHOSTLY_BOAT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(MysteriousItems.SEEPING_BOAT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(MysteriousItems.SORBUS_BOAT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(MysteriousItems.WALNUT_BOAT.get(), ModelTemplates.FLAT_ITEM);
    }
}
