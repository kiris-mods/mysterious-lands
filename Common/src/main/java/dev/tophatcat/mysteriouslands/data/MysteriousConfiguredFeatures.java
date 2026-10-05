package dev.tophatcat.mysteriouslands.data;

import dev.tophatcat.mysteriouslands.MysteriousLands;
import dev.tophatcat.mysteriouslands.init.MysteriousBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BushFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class MysteriousConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> BLOOD_SOAKED_TREE = ResourceKey.create(
        Registries.CONFIGURED_FEATURE, MysteriousLands.id("blood_soaked_tree"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> GHOSTLY_TREE = ResourceKey.create(
        Registries.CONFIGURED_FEATURE, MysteriousLands.id("ghostly_tree"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SORBUS_TREE = ResourceKey.create(
        Registries.CONFIGURED_FEATURE, MysteriousLands.id("sorbus_tree"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SEEPING_TREE = ResourceKey.create(
        Registries.CONFIGURED_FEATURE, MysteriousLands.id("seeping_tree"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> WALNUT_TREE = ResourceKey.create(
        Registries.CONFIGURED_FEATURE, MysteriousLands.id("walnut_tree"));

    public static void run(BootstrapContext<ConfiguredFeature<?, ?>> feature) {
        feature.register(BLOOD_SOAKED_TREE, new ConfiguredFeature<>(Feature.TREE,
            new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(MysteriousBlocks.BLOOD_SOAKED_LOG.get()),
                new StraightTrunkPlacer(1, 0, 0),
                BlockStateProvider.simple(MysteriousBlocks.BLOOD_SOAKED_LEAVES.get()),
                new BushFoliagePlacer(ConstantInt.of(2),
                ConstantInt.of(1), 2), new TwoLayersFeatureSize(0, 0, 0)).build()));
    }
}
