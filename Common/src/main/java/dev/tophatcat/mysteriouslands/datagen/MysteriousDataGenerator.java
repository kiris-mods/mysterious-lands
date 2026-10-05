package dev.tophatcat.mysteriouslands.datagen;

import com.google.auto.service.AutoService;
import dev.tophatcat.mysteriouslands.datagen.client.MysteriousEnglishLanguageProvider;
import dev.tophatcat.mysteriouslands.datagen.server.MysteriousRecipeProvider;
import dev.tophatcat.mysteriouslands.datagen.server.MysteriousTagProvider;
import dev.tophatcat.mysteriouslands.datagen.server.loot.MysteriousLootTableProvider;
import dev.upcraft.sparkweave.api.datagen.DataGenerationContext;
import dev.upcraft.sparkweave.api.entrypoint.DataGenerationEntryPoint;

@AutoService(DataGenerationEntryPoint.class)
public class MysteriousDataGenerator implements DataGenerationEntryPoint {

    @Override
    public void generate(DataGenerationContext context) {
        var pack = context.getDefaultPack();

        System.out.println("TESTING!!!!!!");
        pack.addProvider(MysteriousTagProvider.MysteriousBlockTags::new);
        pack.addProvider(MysteriousTagProvider.MysteriousItemTags::new);
        pack.addRecipes(MysteriousRecipeProvider::new);
        pack.addProvider(MysteriousLootTableProvider::new);
        pack.addProvider(DataGenerationContext::includeClient, MysteriousEnglishLanguageProvider::new);
    }
}
