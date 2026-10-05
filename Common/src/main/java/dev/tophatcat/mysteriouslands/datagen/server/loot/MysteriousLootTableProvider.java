package dev.tophatcat.mysteriouslands.datagen.server.loot;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MysteriousLootTableProvider extends LootTableProvider {

    public MysteriousLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, Collections.emptySet(), List.of(
            new LootTableProvider.SubProviderEntry(MysteriousBlockInteractLoot::new, LootContextParamSets.BLOCK)
        ), registries);
    }
}
