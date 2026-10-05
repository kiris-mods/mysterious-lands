package dev.tophatcat.mysteriouslands.data;

import dev.tophatcat.mysteriouslands.MysteriousLands;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;

public class MysteriousBiomes {

    public static final ResourceKey<Biome> BLOOD_SOAKED_PLAINS = ResourceKey.create(Registries.BIOME, MysteriousLands.id( "blood_soaked_plains"));
    public static final ResourceKey<Biome> GHOSTLY_WOODLANDS = ResourceKey.create(Registries.BIOME, MysteriousLands.id( "ghostly_woodlands"));
    public static final ResourceKey<Biome> SEEPING_FOREST = ResourceKey.create(Registries.BIOME, MysteriousLands.id( "seeping_forest"));
    public static final ResourceKey<Biome> SORBUS_HIGHLANDS = ResourceKey.create(Registries.BIOME, MysteriousLands.id( "sorbus_highlands"));
    public static final ResourceKey<Biome> WALNUT_WOODLANDS = ResourceKey.create(Registries.BIOME, MysteriousLands.id( "walnut_woodlands"));
}
