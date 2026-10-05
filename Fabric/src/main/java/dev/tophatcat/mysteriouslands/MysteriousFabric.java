package dev.tophatcat.mysteriouslands;

import net.fabricmc.api.ModInitializer;

public class MysteriousFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        new MysteriousFlammableBlocks();
        new MysteriousFuelSettings();
        new MysteriousStrippableBlocks();
    }
}
