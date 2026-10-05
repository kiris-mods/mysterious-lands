package dev.tophatcat.mysteriouslands.client;

import dev.tophatcat.mysteriouslands.data.MysteriousBlockFamilies;
import dev.tophatcat.mysteriouslands.init.MysteriousBlocks;
import dev.tophatcat.mysteriouslands.init.MysteriousItems;
import dev.upcraft.sparkweave.api.datagen.ContextAwarePackOutput;
import dev.upcraft.sparkweave.api.datagen.provider.client.SparkweaveModelProvider;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.BlockFamily;

public class MysteriousModelProvider extends SparkweaveModelProvider {

    public MysteriousModelProvider(ContextAwarePackOutput output) {
        super(output);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        createFamily(blockModels, MysteriousBlockFamilies.BLOOD_SOAKED_PLANKS);
        createFamily(blockModels, MysteriousBlockFamilies.GHOSTLY_PLANKS);
        createFamily(blockModels, MysteriousBlockFamilies.SEEPING_PLANKS);
        createFamily(blockModels, MysteriousBlockFamilies.SORBUS_PLANKS);
        createFamily(blockModels, MysteriousBlockFamilies.WALNUT_PLANKS);

        blockModels.createPlantWithDefaultItem(MysteriousBlocks.BLOOD_SOAKED_SAPLING.get(), MysteriousBlocks.POTTED_BLOOD_SOAKED_SAPLING.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createPlantWithDefaultItem(MysteriousBlocks.GHOSTLY_SAPLING.get(), MysteriousBlocks.POTTED_GHOSTLY_SAPLING.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createPlantWithDefaultItem(MysteriousBlocks.SEEPING_SAPLING.get(), MysteriousBlocks.POTTED_SEEPING_SAPLING.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createPlantWithDefaultItem(MysteriousBlocks.SORBUS_SAPLING.get(), MysteriousBlocks.POTTED_SORBUS_SAPLING.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createPlantWithDefaultItem(MysteriousBlocks.WALNUT_SAPLING.get(), MysteriousBlocks.POTTED_WALNUT_SAPLING.get(), BlockModelGenerators.PlantType.NOT_TINTED);

        blockModels.createHangingSign(MysteriousBlocks.BLOOD_SOAKED_PLANKS.get(), MysteriousBlocks.BLOOD_SOAKED_HANGING_SIGN.get(), MysteriousBlocks.BLOOD_SOAKED_WALL_HANGING_SIGN.get());
        blockModels.createHangingSign(MysteriousBlocks.GHOSTLY_PLANKS.get(), MysteriousBlocks.GHOSTLY_HANGING_SIGN.get(), MysteriousBlocks.GHOSTLY_WALL_HANGING_SIGN.get());
        blockModels.createHangingSign(MysteriousBlocks.SEEPING_PLANKS.get(), MysteriousBlocks.SEEPING_HANGING_SIGN.get(), MysteriousBlocks.SEEPING_WALL_HANGING_SIGN.get());
        blockModels.createHangingSign(MysteriousBlocks.SORBUS_PLANKS.get(), MysteriousBlocks.SORBUS_HANGING_SIGN.get(), MysteriousBlocks.SORBUS_WALL_HANGING_SIGN.get());
        blockModels.createHangingSign(MysteriousBlocks.WALNUT_PLANKS.get(), MysteriousBlocks.WALNUT_HANGING_SIGN.get(), MysteriousBlocks.WALNUT_WALL_HANGING_SIGN.get());

        itemModels.generateFlatItem(MysteriousItems.BLOOD_SOAKED_BOAT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(MysteriousItems.GHOSTLY_BOAT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(MysteriousItems.SEEPING_BOAT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(MysteriousItems.SORBUS_BOAT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(MysteriousItems.WALNUT_BOAT.get(), ModelTemplates.FLAT_ITEM);
    }

    private static void createFamily(BlockModelGenerators blockModels, BlockFamily family) {
        blockModels.family(family.getBaseBlock()).generateFor(family);
    }
}
