package dev.tophatcat.mysteriouslands.init;

import dev.tophatcat.mysteriouslands.MysteriousLands;
import dev.upcraft.sparkweave.api.item.CreativeTabHelper;
import dev.upcraft.sparkweave.api.registry.RegistryHandler;
import dev.upcraft.sparkweave.api.registry.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;

public class MysteriousCreativeTabs {

    public static final RegistryHandler<CreativeModeTab> TABS = RegistryHandler.create(Registries.CREATIVE_MODE_TAB,
        MysteriousLands.MODID);

    public static final RegistrySupplier<CreativeModeTab> MYSTERIOUS_TAB = TABS.register("mysterious_tab",
        () -> CreativeTabHelper.newBuilder(MysteriousLands.id("mysterious_tab"))
            .icon(() -> MysteriousItems.GHOSTLY_SAPLING.get().getDefaultInstance())
            .displayItems((itemDisplayParameters, output)
                -> CreativeTabHelper.addRegistryEntries(itemDisplayParameters, output,
                MysteriousItems.ITEMS, MysteriousBlocks.BLOCKS))
            .build()
    );
}
