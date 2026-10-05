package dev.tophatcat.mysteriouslands.datagen.server;

import dev.tophatcat.mysteriouslands.data.MysteriousBiomes;
import dev.upcraft.sparkweave.api.datagen.provider.common.dynamic.SparkweaveBiomeProvider;
import net.minecraft.core.HolderGetter;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.biome.OverworldBiomes;
import net.minecraft.util.Util;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.attribute.modifier.FloatModifier;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class MysteriousBiomeProvider extends SparkweaveBiomeProvider {

    @Override
    protected void generateBiomes(Context ctx, HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> worldCarvers) {
        ctx.register(MysteriousBiomes.BLOOD_SOAKED_PLAINS,
            OverworldBiomes.baseBiome(0.5F, 0.5F)
                .hasPrecipitation(true)
                .setAttribute(EnvironmentAttributes.SKY_COLOR, 6226463) // Sky Colour

                .setAttribute(EnvironmentAttributes.FOG_COLOR, 6226463) // Fog Colour
                .modifyAttribute(EnvironmentAttributes.FOG_START_DISTANCE, FloatModifier.MULTIPLY, 0.75F) // Fog Start Distance
                .modifyAttribute(EnvironmentAttributes.FOG_END_DISTANCE, FloatModifier.MULTIPLY, 0.75F) // Fog Start Distance

                .setAttribute(EnvironmentAttributes.WATER_FOG_COLOR, 9371648) // Water Fog Colour
                .modifyAttribute(EnvironmentAttributes.WATER_FOG_START_DISTANCE, FloatModifier.MULTIPLY, 0.75F) // Water Fog Start Distance
                .modifyAttribute(EnvironmentAttributes.WATER_FOG_END_DISTANCE, FloatModifier.MULTIPLY, 0.75F) // Water Fog End Distance

                .specialEffects(new BiomeSpecialEffects.Builder()
                    .waterColor(9371648)
                    .grassColorOverride(5505281)
                    .foliageColorOverride(12728064)
                    .build())
                .mobSpawnSettings(Util.make(new MobSpawnSettings.Builder(), BiomeDefaultFeatures::commonSpawns).build())
                .generationSettings(Util.make(new BiomeGenerationSettings.Builder(placedFeatures, worldCarvers), builder -> {
                    OverworldBiomes.globalOverworldGeneration(builder);
                    BiomeDefaultFeatures.addDefaultOres(builder);
                    BiomeDefaultFeatures.addFerns(builder);
                    BiomeDefaultFeatures.addDefaultSoftDisks(builder);
                    BiomeDefaultFeatures.addDefaultFlowers(builder);
                    BiomeDefaultFeatures.addDefaultMushrooms(builder);
                    BiomeDefaultFeatures.addDefaultExtraVegetation(builder, false);
                }).build())
                .build(), "Blood Soaked Plains");

        ctx.register(MysteriousBiomes.GHOSTLY_WOODLANDS,
            OverworldBiomes.baseBiome(0.25F, 0.9F)
                .hasPrecipitation(true)
                .setAttribute(EnvironmentAttributes.SKY_COLOR, 7972607) // Sky Colour

                .setAttribute(EnvironmentAttributes.FOG_COLOR, 7972607) // Fog Colour
                .modifyAttribute(EnvironmentAttributes.FOG_START_DISTANCE, FloatModifier.MULTIPLY, 0.75F) // Fog Start Distance
                .modifyAttribute(EnvironmentAttributes.FOG_END_DISTANCE, FloatModifier.MULTIPLY, 0.75F) // Fog Start Distance

                .setAttribute(EnvironmentAttributes.WATER_FOG_COLOR, 666226) // Water Fog Colour
                .modifyAttribute(EnvironmentAttributes.WATER_FOG_START_DISTANCE, FloatModifier.MULTIPLY, 0.75F) // Water Fog Start Distance
                .modifyAttribute(EnvironmentAttributes.WATER_FOG_END_DISTANCE, FloatModifier.MULTIPLY, 0.75F) // Water Fog End Distance

                .specialEffects(new BiomeSpecialEffects.Builder()
                    .waterColor(666226)
                    .grassColorOverride(14411493)
                    .foliageColorOverride(14411493)
                    .build())
                .mobSpawnSettings(Util.make(new MobSpawnSettings.Builder(), BiomeDefaultFeatures::commonSpawns).build())
                .generationSettings(Util.make(new BiomeGenerationSettings.Builder(placedFeatures, worldCarvers), builder -> {
                    OverworldBiomes.globalOverworldGeneration(builder);
                    BiomeDefaultFeatures.addDefaultOres(builder);
                    BiomeDefaultFeatures.addFerns(builder);
                    BiomeDefaultFeatures.addDefaultSoftDisks(builder);
                    BiomeDefaultFeatures.addDefaultFlowers(builder);
                    BiomeDefaultFeatures.addDefaultMushrooms(builder);
                    BiomeDefaultFeatures.addDefaultExtraVegetation(builder, false);
                }).build())
                .build(), "Ghostly Woodlands");

        ctx.register(MysteriousBiomes.SEEPING_FOREST,
            OverworldBiomes.baseBiome(0.25F, 0.9F)
                .hasPrecipitation(true)
                .setAttribute(EnvironmentAttributes.SKY_COLOR, 7511653) // Sky Colour

                .setAttribute(EnvironmentAttributes.FOG_COLOR, 7511653) // Fog Colour
                .modifyAttribute(EnvironmentAttributes.FOG_START_DISTANCE, FloatModifier.MULTIPLY, 0.75F) // Fog Start Distance
                .modifyAttribute(EnvironmentAttributes.FOG_END_DISTANCE, FloatModifier.MULTIPLY, 0.75F) // Fog Start Distance

                .setAttribute(EnvironmentAttributes.WATER_FOG_COLOR, 8774175) // Water Fog Colour
                .modifyAttribute(EnvironmentAttributes.WATER_FOG_START_DISTANCE, FloatModifier.MULTIPLY, 0.75F) // Water Fog Start Distance
                .modifyAttribute(EnvironmentAttributes.WATER_FOG_END_DISTANCE, FloatModifier.MULTIPLY, 0.75F) // Water Fog End Distance

                .specialEffects(new BiomeSpecialEffects.Builder()
                    .waterColor(8774175)
                    .grassColorOverride(8774175)
                    .foliageColorOverride(8774175)
                    .build())
                .mobSpawnSettings(Util.make(new MobSpawnSettings.Builder(), BiomeDefaultFeatures::commonSpawns).build())
                .generationSettings(Util.make(new BiomeGenerationSettings.Builder(placedFeatures, worldCarvers), builder -> {
                    OverworldBiomes.globalOverworldGeneration(builder);
                    BiomeDefaultFeatures.addDefaultOres(builder);
                    BiomeDefaultFeatures.addFerns(builder);
                    BiomeDefaultFeatures.addDefaultSoftDisks(builder);
                    BiomeDefaultFeatures.addDefaultFlowers(builder);
                    BiomeDefaultFeatures.addDefaultMushrooms(builder);
                    BiomeDefaultFeatures.addDefaultExtraVegetation(builder, false);
                }).build())
                .build(), "Seeping Forest");

        ctx.register(MysteriousBiomes.SORBUS_HIGHLANDS,
            OverworldBiomes.baseBiome(0.25F, 0.9F)
                .hasPrecipitation(true)
                .setAttribute(EnvironmentAttributes.SKY_COLOR, 15859663) // Sky Colour

                .setAttribute(EnvironmentAttributes.FOG_COLOR, 15859663) // Fog Colour
                .modifyAttribute(EnvironmentAttributes.FOG_START_DISTANCE, FloatModifier.MULTIPLY, 0.75F) // Fog Start Distance
                .modifyAttribute(EnvironmentAttributes.FOG_END_DISTANCE, FloatModifier.MULTIPLY, 0.75F) // Fog Start Distance

                .setAttribute(EnvironmentAttributes.WATER_FOG_COLOR, 13369231) // Water Fog Colour
                .modifyAttribute(EnvironmentAttributes.WATER_FOG_START_DISTANCE, FloatModifier.MULTIPLY, 0.75F) // Water Fog Start Distance
                .modifyAttribute(EnvironmentAttributes.WATER_FOG_END_DISTANCE, FloatModifier.MULTIPLY, 0.75F) // Water Fog End Distance

                .specialEffects(new BiomeSpecialEffects.Builder()
                    .waterColor(13369231)
                    .grassColorOverride(10665728)
                    .foliageColorOverride(8690688)
                    .build())
                .mobSpawnSettings(Util.make(new MobSpawnSettings.Builder(), BiomeDefaultFeatures::commonSpawns).build())
                .generationSettings(Util.make(new BiomeGenerationSettings.Builder(placedFeatures, worldCarvers), builder -> {
                    OverworldBiomes.globalOverworldGeneration(builder);
                    BiomeDefaultFeatures.addDefaultOres(builder);
                    BiomeDefaultFeatures.addFerns(builder);
                    BiomeDefaultFeatures.addDefaultSoftDisks(builder);
                    BiomeDefaultFeatures.addDefaultFlowers(builder);
                    BiomeDefaultFeatures.addDefaultMushrooms(builder);
                    BiomeDefaultFeatures.addDefaultExtraVegetation(builder, false);
                }).build())
                .build(), "Sorbus Highlands");
    }
}
