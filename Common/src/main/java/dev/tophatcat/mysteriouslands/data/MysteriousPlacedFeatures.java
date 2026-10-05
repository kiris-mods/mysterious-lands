package dev.tophatcat.mysteriouslands.data;

import dev.tophatcat.mysteriouslands.MysteriousLands;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightmapPlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RandomOffsetPlacement;

import java.util.List;

public class MysteriousPlacedFeatures {

    public static final ResourceKey<PlacedFeature> BLOOD_SOAKED_TREE = ResourceKey.create(
        Registries.PLACED_FEATURE, MysteriousLands.id("blood_soaked_tree"));
    public static final ResourceKey<PlacedFeature> GHOSTLY_TREE = ResourceKey.create(
        Registries.PLACED_FEATURE, MysteriousLands.id("ghostly_tree"));
    public static final ResourceKey<PlacedFeature> SORBUS_TREE = ResourceKey.create(
        Registries.PLACED_FEATURE, MysteriousLands.id("sorbus_tree"));
    public static final ResourceKey<PlacedFeature> SEEPING_TREE = ResourceKey.create(
        Registries.PLACED_FEATURE, MysteriousLands.id("seeping_tree"));
    public static final ResourceKey<PlacedFeature> WALNUT_TREE = ResourceKey.create(
        Registries.PLACED_FEATURE, MysteriousLands.id("walnut_tree"));

    public static void run(BootstrapContext<PlacedFeature> feature) {
        HolderGetter<ConfiguredFeature<?, ?>> getter = feature.lookup(Registries.CONFIGURED_FEATURE);
        feature.register(BLOOD_SOAKED_TREE, new PlacedFeature(getter.getOrThrow(MysteriousConfiguredFeatures.BLOOD_SOAKED_TREE),
            List.of(CountPlacement.of(10), RandomOffsetPlacement.horizontal(
                UniformInt.of(0, 8)), HeightmapPlacement.onHeightmap(
                    Heightmap.Types.MOTION_BLOCKING), BiomeFilter.biome())));
    }
}
