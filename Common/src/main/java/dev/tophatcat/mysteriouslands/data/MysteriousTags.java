package dev.tophatcat.mysteriouslands.data;

import dev.tophatcat.mysteriouslands.MysteriousLands;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class MysteriousTags {

    public static final class Blocks {
        public static final TagKey<Block> BLOOD_SOAKED_LOGS = TagKey.create(Registries.BLOCK,
            MysteriousLands.id( "blood_soaked_logs"));
        public static final TagKey<Block> GHOSTLY_LOGS = TagKey.create(Registries.BLOCK,
            MysteriousLands.id( "ghostly_logs"));
        public static final TagKey<Block> SEEPING_LOGS = TagKey.create(Registries.BLOCK,
            MysteriousLands.id( "seeping_logs"));
        public static final TagKey<Block> SORBUS_LOGS = TagKey.create(Registries.BLOCK,
            MysteriousLands.id( "sorbus_logs"));
        public static final TagKey<Block> WALNUT_LOGS = TagKey.create(Registries.BLOCK,
            MysteriousLands.id( "walnut_logs"));
        public static final TagKey<Block> SIGNS = TagKey.create(Registries.BLOCK,
            MysteriousLands.id( "signs"));
        public static final TagKey<Block> HANGING_SIGNS = TagKey.create(Registries.BLOCK,
            MysteriousLands.id( "hanging_signs"));
    }

    public static final class Items {
        public static final TagKey<Item> BLOOD_SOAKED_LOGS = TagKey.create(Registries.ITEM,
            MysteriousLands.id( "blood_soaked_logs"));
        public static final TagKey<Item> GHOSTLY_LOGS = TagKey.create(Registries.ITEM,
            MysteriousLands.id( "ghostly_logs"));
        public static final TagKey<Item> SEEPING_LOGS = TagKey.create(Registries.ITEM,
            MysteriousLands.id( "seeping_logs"));
        public static final TagKey<Item> SORBUS_LOGS = TagKey.create(Registries.ITEM,
            MysteriousLands.id( "sorbus_logs"));
        public static final TagKey<Item> WALNUT_LOGS = TagKey.create(Registries.ITEM,
            MysteriousLands.id( "walnut_logs"));
    }
}
