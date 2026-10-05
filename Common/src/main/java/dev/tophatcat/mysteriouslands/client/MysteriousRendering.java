package dev.tophatcat.mysteriouslands.client;

import com.google.auto.service.AutoService;
import dev.tophatcat.mysteriouslands.init.MysteriousEntities;
import dev.upcraft.sparkweave.api.client.event.RegisterEntityRenderersEvent;
import dev.upcraft.sparkweave.api.entrypoint.ClientEntryPoint;
import dev.upcraft.sparkweave.api.platform.ModContainer;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.BoatRenderer;

@AutoService(ClientEntryPoint.class)
public class MysteriousRendering implements ClientEntryPoint {

    @Override
    public void onInitializeClient(ModContainer mod) {
        RegisterEntityRenderersEvent.EVENT.register(event
            -> event.registerRenderer(MysteriousEntities.BLOOD_SOAKED_BOAT, context
            -> new BoatRenderer(context, ModelLayers.OAK_BOAT)));
        RegisterEntityRenderersEvent.EVENT.register(event
            -> event.registerRenderer(MysteriousEntities.GHOSTLY_BOAT, context
            -> new BoatRenderer(context, ModelLayers.OAK_BOAT)));
        RegisterEntityRenderersEvent.EVENT.register(event
            -> event.registerRenderer(MysteriousEntities.SEEPING_BOAT, context
            -> new BoatRenderer(context, ModelLayers.OAK_BOAT)));
        RegisterEntityRenderersEvent.EVENT.register(event
            -> event.registerRenderer(MysteriousEntities.SORBUS_BOAT, context
            -> new BoatRenderer(context, ModelLayers.OAK_BOAT)));
        RegisterEntityRenderersEvent.EVENT.register(event
            -> event.registerRenderer(MysteriousEntities.WALNUT_BOAT, context
            -> new BoatRenderer(context, ModelLayers.OAK_BOAT)));
    }
}
