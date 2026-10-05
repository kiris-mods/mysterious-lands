package dev.tophatcat.mysteriouslands.init;

import dev.tophatcat.mysteriouslands.MysteriousLands;
import dev.upcraft.sparkweave.api.registry.RegistryHandler;
import dev.upcraft.sparkweave.api.registry.RegistrySupplier;
import dev.upcraft.sparkweave.api.registry.entity.EntityRegistryHandler;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.vehicle.boat.Boat;

public class MysteriousEntities {

    public static final EntityRegistryHandler ENTITIES = RegistryHandler.entities(MysteriousLands.MODID);

    public static final RegistrySupplier<EntityType<Boat>> BLOOD_SOAKED_BOAT = ENTITIES.register("blood_soaked_boat",
        (entityType, level) -> new Boat(entityType, level, MysteriousItems.BLOOD_SOAKED_BOAT), MobCategory.MISC, builder -> builder
        .noLootTable()
        .sized(1.375F, 0.5625F)
        .eyeHeight(0.5625F)
        .clientTrackingRange(10)
    );
    public static final RegistrySupplier<EntityType<Boat>> GHOSTLY_BOAT = ENTITIES.register("ghostly_boat",
        (entityType, level) -> new Boat(entityType, level, MysteriousItems.GHOSTLY_BOAT), MobCategory.MISC, builder -> builder
            .noLootTable()
            .sized(1.375F, 0.5625F)
            .eyeHeight(0.5625F)
            .clientTrackingRange(10)
    );
    public static final RegistrySupplier<EntityType<Boat>> SEEPING_BOAT = ENTITIES.register("seeping_boat",
        (entityType, level) -> new Boat(entityType, level, MysteriousItems.SEEPING_BOAT), MobCategory.MISC, builder -> builder
            .noLootTable()
            .sized(1.375F, 0.5625F)
            .eyeHeight(0.5625F)
            .clientTrackingRange(10)
    );
    public static final RegistrySupplier<EntityType<Boat>> SORBUS_BOAT = ENTITIES.register("sorbus_boat",
        (entityType, level) -> new Boat(entityType, level, MysteriousItems.SORBUS_BOAT), MobCategory.MISC, builder -> builder
            .noLootTable()
            .sized(1.375F, 0.5625F)
            .eyeHeight(0.5625F)
            .clientTrackingRange(10)
    );
    public static final RegistrySupplier<EntityType<Boat>> WALNUT_BOAT = ENTITIES.register("walnut_boat",
        (entityType, level) -> new Boat(entityType, level, MysteriousItems.WALNUT_BOAT), MobCategory.MISC, builder -> builder
            .noLootTable()
            .sized(1.375F, 0.5625F)
            .eyeHeight(0.5625F)
            .clientTrackingRange(10)
    );
}
