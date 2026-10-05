package dev.tophatcat.mysteriouslands.init;

import dev.tophatcat.mysteriouslands.MysteriousLands;
import dev.upcraft.sparkweave.api.registry.RegistryHandler;
import dev.upcraft.sparkweave.api.registry.RegistrySupplier;
import dev.upcraft.sparkweave.api.registry.item.ItemRegistryHandler;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BoatItem;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;

public class MysteriousItems {

    public static final ItemRegistryHandler ITEMS = RegistryHandler.items(MysteriousLands.MODID);

    // Logs
    public static final RegistrySupplier<Item> BLOOD_SOAKED_LOG = ITEMS.registerForBlock(
        MysteriousBlocks.BLOOD_SOAKED_LOG, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> GHOSTLY_LOG = ITEMS.registerForBlock(
        MysteriousBlocks.GHOSTLY_LOG, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SEEPING_LOG = ITEMS.registerForBlock(
        MysteriousBlocks.SEEPING_LOG, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SORBUS_LOG = ITEMS.registerForBlock(
        MysteriousBlocks.SORBUS_LOG, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> WALNUT_LOG = ITEMS.registerForBlock(
        MysteriousBlocks.WALNUT_LOG, BlockItem::new, new Item.Properties());

    // Stripped logs
    public static final RegistrySupplier<Item> BLOOD_SOAKED_STRIPPED_LOG = ITEMS.registerForBlock(
        MysteriousBlocks.BLOOD_SOAKED_STRIPPED_LOG, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> GHOSTLY_STRIPPED_LOG = ITEMS.registerForBlock(
        MysteriousBlocks.GHOSTLY_STRIPPED_LOG, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SEEPING_STRIPPED_LOG = ITEMS.registerForBlock(
        MysteriousBlocks.SEEPING_STRIPPED_LOG, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SORBUS_STRIPPED_LOG = ITEMS.registerForBlock(
        MysteriousBlocks.SORBUS_STRIPPED_LOG, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> WALNUT_STRIPPED_LOG = ITEMS.registerForBlock(
        MysteriousBlocks.WALNUT_STRIPPED_LOG, BlockItem::new, new Item.Properties());

    // Woods
    public static final RegistrySupplier<Item> BLOOD_SOAKED_WOOD = ITEMS.registerForBlock(
        MysteriousBlocks.BLOOD_SOAKED_WOOD, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> GHOSTLY_WOOD = ITEMS.registerForBlock(
        MysteriousBlocks.GHOSTLY_WOOD, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SEEPING_WOOD = ITEMS.registerForBlock(
        MysteriousBlocks.SEEPING_WOOD, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SORBUS_WOOD = ITEMS.registerForBlock(
        MysteriousBlocks.SORBUS_WOOD, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> WALNUT_WOOD = ITEMS.registerForBlock(
        MysteriousBlocks.WALNUT_WOOD, BlockItem::new, new Item.Properties());

    //Stripped woods
    public static final RegistrySupplier<Item> BLOOD_SOAKED_STRIPPED_WOOD = ITEMS.registerForBlock(
        MysteriousBlocks.BLOOD_SOAKED_STRIPPED_WOOD, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> GHOSTLY_STRIPPED_WOOD = ITEMS.registerForBlock(
        MysteriousBlocks.GHOSTLY_STRIPPED_WOOD, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SEEPING_STRIPPED_WOOD = ITEMS.registerForBlock(
        MysteriousBlocks.SEEPING_STRIPPED_WOOD, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SORBUS_STRIPPED_WOOD = ITEMS.registerForBlock(
        MysteriousBlocks.SORBUS_STRIPPED_WOOD, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> WALNUT_STRIPPED_WOOD = ITEMS.registerForBlock(
        MysteriousBlocks.WALNUT_STRIPPED_WOOD, BlockItem::new, new Item.Properties());

    // Planks
    public static final RegistrySupplier<Item> BLOOD_SOAKED_PLANKS = ITEMS.registerForBlock(
        MysteriousBlocks.BLOOD_SOAKED_PLANKS, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> GHOSTLY_PLANKS = ITEMS.registerForBlock(
        MysteriousBlocks.GHOSTLY_PLANKS, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SEEPING_PLANKS = ITEMS.registerForBlock(
        MysteriousBlocks.SEEPING_PLANKS, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SORBUS_PLANKS = ITEMS.registerForBlock(
        MysteriousBlocks.SORBUS_PLANKS, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> WALNUT_PLANKS = ITEMS.registerForBlock(
        MysteriousBlocks.WALNUT_PLANKS, BlockItem::new, new Item.Properties());

    // Stairs
    public static final RegistrySupplier<Item> BLOOD_SOAKED_STAIRS = ITEMS.registerForBlock(
        MysteriousBlocks.BLOOD_SOAKED_STAIRS, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> GHOSTLY_STAIRS = ITEMS.registerForBlock(
        MysteriousBlocks.GHOSTLY_STAIRS, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SEEPING_STAIRS = ITEMS.registerForBlock(
        MysteriousBlocks.SEEPING_STAIRS, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SORBUS_STAIRS = ITEMS.registerForBlock(
        MysteriousBlocks.SORBUS_STAIRS, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> WALNUT_STAIRS = ITEMS.registerForBlock(
        MysteriousBlocks.WALNUT_STAIRS, BlockItem::new, new Item.Properties());

    // Leaves
    public static final RegistrySupplier<Item> BLOOD_SOAKED_LEAVES = ITEMS.registerForBlock(
        MysteriousBlocks.BLOOD_SOAKED_LEAVES, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> GHOSTLY_LEAVES = ITEMS.registerForBlock(
        MysteriousBlocks.GHOSTLY_LEAVES, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SEEPING_LEAVES = ITEMS.registerForBlock(
        MysteriousBlocks.SEEPING_LEAVES, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SORBUS_LEAVES = ITEMS.registerForBlock(
        MysteriousBlocks.SORBUS_LEAVES, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> WALNUT_LEAVES = ITEMS.registerForBlock(
        MysteriousBlocks.WALNUT_LEAVES, BlockItem::new, new Item.Properties());

    // Slabs
    public static final RegistrySupplier<Item> BLOOD_SOAKED_SLAB = ITEMS.registerForBlock(
        MysteriousBlocks.BLOOD_SOAKED_SLAB, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> GHOSTLY_SLAB = ITEMS.registerForBlock(
        MysteriousBlocks.GHOSTLY_SLAB, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SEEPING_SLAB = ITEMS.registerForBlock(
        MysteriousBlocks.SEEPING_SLAB, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SORBUS_SLAB = ITEMS.registerForBlock(
        MysteriousBlocks.SORBUS_SLAB, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> WALNUT_SLAB = ITEMS.registerForBlock(
        MysteriousBlocks.WALNUT_SLAB, BlockItem::new, new Item.Properties());

    // Fences
    public static final RegistrySupplier<Item> BLOOD_SOAKED_FENCE = ITEMS.registerForBlock(
        MysteriousBlocks.BLOOD_SOAKED_FENCE, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> GHOSTLY_FENCE = ITEMS.registerForBlock(
        MysteriousBlocks.GHOSTLY_FENCE, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SEEPING_FENCE = ITEMS.registerForBlock(
        MysteriousBlocks.SEEPING_FENCE, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SORBUS_FENCE = ITEMS.registerForBlock(
        MysteriousBlocks.SORBUS_FENCE, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> WALNUT_FENCE = ITEMS.registerForBlock(
        MysteriousBlocks.WALNUT_FENCE, BlockItem::new, new Item.Properties());

    // Gates
    public static final RegistrySupplier<Item> BLOOD_SOAKED_GATE = ITEMS.registerForBlock(
        MysteriousBlocks.BLOOD_SOAKED_GATE, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> GHOSTLY_GATE = ITEMS.registerForBlock(
        MysteriousBlocks.GHOSTLY_GATE, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SEEPING_GATE = ITEMS.registerForBlock(
        MysteriousBlocks.SEEPING_GATE, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SORBUS_GATE = ITEMS.registerForBlock(
        MysteriousBlocks.SORBUS_GATE, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> WALNUT_GATE = ITEMS.registerForBlock(
        MysteriousBlocks.WALNUT_GATE, BlockItem::new, new Item.Properties());

    // Buttons
    public static final RegistrySupplier<Item> BLOOD_SOAKED_BUTTON = ITEMS.registerForBlock(
        MysteriousBlocks.BLOOD_SOAKED_BUTTON, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> GHOSTLY_BUTTON = ITEMS.registerForBlock(
        MysteriousBlocks.GHOSTLY_BUTTON, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SEEPING_BUTTON = ITEMS.registerForBlock(
        MysteriousBlocks.SEEPING_BUTTON, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SORBUS_BUTTON = ITEMS.registerForBlock(
        MysteriousBlocks.SORBUS_BUTTON, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> WALNUT_BUTTON = ITEMS.registerForBlock(
        MysteriousBlocks.WALNUT_BUTTON, BlockItem::new, new Item.Properties());

    // Pressure plates
    public static final RegistrySupplier<Item> BLOOD_SOAKED_PRESSURE_PLATE = ITEMS.registerForBlock(
        MysteriousBlocks.BLOOD_SOAKED_PRESSURE_PLATE, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> GHOSTLY_PRESSURE_PLATE = ITEMS.registerForBlock(
        MysteriousBlocks.GHOSTLY_PRESSURE_PLATE, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SEEPING_PRESSURE_PLATE = ITEMS.registerForBlock(
        MysteriousBlocks.SEEPING_PRESSURE_PLATE, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SORBUS_PRESSURE_PLATE = ITEMS.registerForBlock(
        MysteriousBlocks.SORBUS_PRESSURE_PLATE, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> WALNUT_PRESSURE_PLATE = ITEMS.registerForBlock(
        MysteriousBlocks.WALNUT_PRESSURE_PLATE, BlockItem::new, new Item.Properties());

    // Trapdoors
    public static final RegistrySupplier<Item> BLOOD_SOAKED_TRAPDOOR = ITEMS.registerForBlock(
        MysteriousBlocks.BLOOD_SOAKED_TRAPDOOR, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> GHOSTLY_TRAPDOOR = ITEMS.registerForBlock(
        MysteriousBlocks.GHOSTLY_TRAPDOOR, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SEEPING_TRAPDOOR = ITEMS.registerForBlock(
        MysteriousBlocks.SEEPING_TRAPDOOR, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SORBUS_TRAPDOOR = ITEMS.registerForBlock(
        MysteriousBlocks.SORBUS_TRAPDOOR, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> WALNUT_TRAPDOOR = ITEMS.registerForBlock(
        MysteriousBlocks.WALNUT_TRAPDOOR, BlockItem::new, new Item.Properties());

    // Doors
    public static final RegistrySupplier<Item> BLOOD_SOAKED_DOOR = ITEMS.registerForBlock(
        MysteriousBlocks.BLOOD_SOAKED_DOOR, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> GHOSTLY_DOOR = ITEMS.registerForBlock(
        MysteriousBlocks.GHOSTLY_DOOR, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SEEPING_DOOR = ITEMS.registerForBlock(
        MysteriousBlocks.SEEPING_DOOR, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SORBUS_DOOR = ITEMS.registerForBlock(
        MysteriousBlocks.SORBUS_DOOR, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> WALNUT_DOOR = ITEMS.registerForBlock(
        MysteriousBlocks.WALNUT_DOOR, BlockItem::new, new Item.Properties());

    // Saplings
    public static final RegistrySupplier<Item> BLOOD_SOAKED_SAPLING = ITEMS.registerForBlock(
        MysteriousBlocks.BLOOD_SOAKED_SAPLING, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> GHOSTLY_SAPLING = ITEMS.registerForBlock(
        MysteriousBlocks.GHOSTLY_SAPLING, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SEEPING_SAPLING = ITEMS.registerForBlock(
        MysteriousBlocks.SEEPING_SAPLING, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> SORBUS_SAPLING = ITEMS.registerForBlock(
        MysteriousBlocks.SORBUS_SAPLING, BlockItem::new, new Item.Properties());
    public static final RegistrySupplier<Item> WALNUT_SAPLING = ITEMS.registerForBlock(
        MysteriousBlocks.WALNUT_SAPLING, BlockItem::new, new Item.Properties());

    // Sign items
    public static final RegistrySupplier<SignItem> BLOOD_SOAKED_SIGN = ITEMS.registerForBlock(MysteriousBlocks.BLOOD_SOAKED_SIGN,
        (signBlock, properties) -> new SignItem(signBlock, MysteriousBlocks.BLOOD_SOAKED_SIGN.get(), properties), new Item.Properties().stacksTo(16));

    public static final RegistrySupplier<SignItem> GHOSTLY_SIGN = ITEMS.registerForBlock(MysteriousBlocks.GHOSTLY_SIGN,
        (signBlock, properties) -> new SignItem(signBlock, MysteriousBlocks.GHOSTLY_SIGN.get(), properties), new Item.Properties().stacksTo(16));

    public static final RegistrySupplier<SignItem> SEEPING_SIGN = ITEMS.registerForBlock(MysteriousBlocks.SEEPING_SIGN,
        (signBlock, properties) -> new SignItem(signBlock, MysteriousBlocks.SEEPING_SIGN.get(), properties), new Item.Properties().stacksTo(16));

    public static final RegistrySupplier<SignItem> SORBUS_SIGN = ITEMS.registerForBlock(MysteriousBlocks.SORBUS_SIGN,
        (signBlock, properties) -> new SignItem(signBlock, MysteriousBlocks.SORBUS_SIGN.get(), properties), new Item.Properties().stacksTo(16));

    public static final RegistrySupplier<SignItem> WALNUT_SIGN = ITEMS.registerForBlock(MysteriousBlocks.WALNUT_SIGN,
        (signBlock, properties) -> new SignItem(signBlock, MysteriousBlocks.WALNUT_SIGN.get(), properties), new Item.Properties().stacksTo(16));

    // Hanging sign items
    public static final RegistrySupplier<SignItem> BLOOD_SOAKED_HANGING_SIGN = ITEMS.registerForBlock(MysteriousBlocks.BLOOD_SOAKED_HANGING_SIGN,
        (signBlock, properties) -> new HangingSignItem(signBlock, MysteriousBlocks.BLOOD_SOAKED_HANGING_SIGN.get(), properties), new Item.Properties().stacksTo(16));
    public static final RegistrySupplier<SignItem> GHOSTLY_HANGING_SIGN = ITEMS.registerForBlock(MysteriousBlocks.GHOSTLY_HANGING_SIGN,
        (signBlock, properties) -> new HangingSignItem(signBlock, MysteriousBlocks.GHOSTLY_HANGING_SIGN.get(), properties), new Item.Properties().stacksTo(16));
    public static final RegistrySupplier<SignItem> SEEPING_HANGING_SIGN = ITEMS.registerForBlock(MysteriousBlocks.SEEPING_HANGING_SIGN,
        (signBlock, properties) -> new HangingSignItem(signBlock, MysteriousBlocks.SEEPING_HANGING_SIGN.get(), properties), new Item.Properties().stacksTo(16));
    public static final RegistrySupplier<SignItem> SORBUS_HANGING_SIGN = ITEMS.registerForBlock(MysteriousBlocks.SORBUS_HANGING_SIGN,
        (signBlock, properties) -> new HangingSignItem(signBlock, MysteriousBlocks.SORBUS_HANGING_SIGN.get(), properties), new Item.Properties().stacksTo(16));
    public static final RegistrySupplier<SignItem> WALNUT_HANGING_SIGN = ITEMS.registerForBlock(MysteriousBlocks.WALNUT_HANGING_SIGN,
        (signBlock, properties) -> new HangingSignItem(signBlock, MysteriousBlocks.WALNUT_HANGING_SIGN.get(), properties), new Item.Properties().stacksTo(16));

    public static final RegistrySupplier<Item> BLOOD_SOAKED_BOAT = ITEMS.register("blood_soaked_boat", properties -> new BoatItem(MysteriousEntities.BLOOD_SOAKED_BOAT.get(), properties), new Item.Properties().stacksTo(1));
    public static final RegistrySupplier<Item> GHOSTLY_BOAT = ITEMS.register("ghostly_boat", properties -> new BoatItem(MysteriousEntities.GHOSTLY_BOAT.get(), properties), new Item.Properties().stacksTo(1));
    public static final RegistrySupplier<Item> SEEPING_BOAT = ITEMS.register("seeping_boat", properties -> new BoatItem(MysteriousEntities.SEEPING_BOAT.get(), properties), new Item.Properties().stacksTo(1));
    public static final RegistrySupplier<Item> SORBUS_BOAT = ITEMS.register("sorbus_boat", properties -> new BoatItem(MysteriousEntities.SORBUS_BOAT.get(), properties), new Item.Properties().stacksTo(1));
    public static final RegistrySupplier<Item> WALNUT_BOAT = ITEMS.register("walnut_boat", properties -> new BoatItem(MysteriousEntities.WALNUT_BOAT.get(), properties), new Item.Properties().stacksTo(1));
}
