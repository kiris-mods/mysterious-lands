package dev.tophatcat.mysteriouslands;

import com.google.auto.service.AutoService;
import dev.tophatcat.mysteriouslands.init.MysteriousBlocks;
import dev.tophatcat.mysteriouslands.init.MysteriousCreativeTabs;
import dev.tophatcat.mysteriouslands.init.MysteriousEntities;
import dev.tophatcat.mysteriouslands.init.MysteriousItems;
import dev.upcraft.sparkweave.api.entrypoint.MainEntryPoint;
import dev.upcraft.sparkweave.api.platform.ModContainer;
import dev.upcraft.sparkweave.api.platform.services.RegistryService;
import net.minecraft.resources.Identifier;

@AutoService(MainEntryPoint.class)
public class MysteriousLands implements MainEntryPoint {

    public static final String MODID = "mysteriouslands";

    @Override
    public void onInitialize(ModContainer mod) {
        var registryService = RegistryService.get();

        MysteriousBlocks.BLOCKS.accept(registryService);
        MysteriousItems.ITEMS.accept(registryService);
        MysteriousEntities.ENTITIES.accept(registryService);
        MysteriousCreativeTabs.TABS.accept(registryService);
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MODID, path);
    }
}
