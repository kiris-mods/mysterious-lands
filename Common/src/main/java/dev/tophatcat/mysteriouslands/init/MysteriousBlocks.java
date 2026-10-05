package dev.tophatcat.mysteriouslands.init;

import dev.tophatcat.mysteriouslands.data.MysteriousBlockFamilies;
import dev.tophatcat.mysteriouslands.MysteriousLands;
import dev.upcraft.sparkweave.api.block.SparkweaveCeilingHangingSignBlock;
import dev.upcraft.sparkweave.api.block.SparkweaveStandingSignBlock;
import dev.upcraft.sparkweave.api.block.SparkweaveWallSignBlock;
import dev.upcraft.sparkweave.api.registry.RegistryHandler;
import dev.upcraft.sparkweave.api.registry.RegistrySupplier;
import dev.upcraft.sparkweave.api.registry.block.BlockRegistryHandler;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Supplier;

public class MysteriousBlocks {

    public static final BlockRegistryHandler BLOCKS = RegistryHandler.blocks(MysteriousLands.MODID);

    // Logs
    public static final RegistrySupplier<RotatedPillarBlock> BLOOD_SOAKED_LOG
        = createPillarBlock("blood_soaked_log");
    public static final RegistrySupplier<RotatedPillarBlock> GHOSTLY_LOG
        = createPillarBlock("ghostly_log");
    public static final RegistrySupplier<RotatedPillarBlock> SEEPING_LOG
        = createPillarBlock("seeping_log");
    public static final RegistrySupplier<RotatedPillarBlock> SORBUS_LOG
        = createPillarBlock("sorbus_log");
    public static final RegistrySupplier<RotatedPillarBlock> WALNUT_LOG
        = createPillarBlock("walnut_log");

    // Stripped logs
    public static final RegistrySupplier<RotatedPillarBlock> BLOOD_SOAKED_STRIPPED_LOG
        = createPillarBlock("blood_soaked_stripped_log");
    public static final RegistrySupplier<RotatedPillarBlock> GHOSTLY_STRIPPED_LOG
        = createPillarBlock("ghostly_stripped_log");
    public static final RegistrySupplier<RotatedPillarBlock> SEEPING_STRIPPED_LOG
        = createPillarBlock("seeping_stripped_log");
    public static final RegistrySupplier<RotatedPillarBlock> SORBUS_STRIPPED_LOG
        = createPillarBlock("sorbus_stripped_log");
    public static final RegistrySupplier<RotatedPillarBlock> WALNUT_STRIPPED_LOG
        = createPillarBlock("walnut_stripped_log");

    // Woods
    public static final RegistrySupplier<RotatedPillarBlock> BLOOD_SOAKED_WOOD
        = createPillarBlock("blood_soaked_wood");
    public static final RegistrySupplier<RotatedPillarBlock> GHOSTLY_WOOD
        = createPillarBlock("ghostly_wood");
    public static final RegistrySupplier<RotatedPillarBlock> SEEPING_WOOD
        = createPillarBlock("seeping_wood");
    public static final RegistrySupplier<RotatedPillarBlock> SORBUS_WOOD
        = createPillarBlock("sorbus_wood");
    public static final RegistrySupplier<RotatedPillarBlock> WALNUT_WOOD
        = createPillarBlock("walnut_wood");

    // Stripped woods
    public static final RegistrySupplier<RotatedPillarBlock> BLOOD_SOAKED_STRIPPED_WOOD
        = createPillarBlock("blood_soaked_stripped_wood");
    public static final RegistrySupplier<RotatedPillarBlock> GHOSTLY_STRIPPED_WOOD
        = createPillarBlock("ghostly_stripped_wood");
    public static final RegistrySupplier<RotatedPillarBlock> SEEPING_STRIPPED_WOOD
        = createPillarBlock("seeping_stripped_wood");
    public static final RegistrySupplier<RotatedPillarBlock> SORBUS_STRIPPED_WOOD
        = createPillarBlock("sorbus_stripped_wood");
    public static final RegistrySupplier<RotatedPillarBlock> WALNUT_STRIPPED_WOOD
        = createPillarBlock("walnut_stripped_wood");

    // Planks
    public static final RegistrySupplier<Block> BLOOD_SOAKED_PLANKS = createPlanksBlock("blood_soaked_planks");
    public static final RegistrySupplier<Block> GHOSTLY_PLANKS = createPlanksBlock("ghostly_planks");
    public static final RegistrySupplier<Block> SEEPING_PLANKS = createPlanksBlock("seeping_planks");
    public static final RegistrySupplier<Block> SORBUS_PLANKS = createPlanksBlock("sorbus_planks");
    public static final RegistrySupplier<Block> WALNUT_PLANKS = createPlanksBlock("walnut_planks");

    // Stairs
    public static final RegistrySupplier<StairBlock> BLOOD_SOAKED_STAIRS = createStairsBlock(
        "blood_soaked_stairs", BLOOD_SOAKED_PLANKS);
    public static final RegistrySupplier<StairBlock> GHOSTLY_STAIRS = createStairsBlock(
        "ghostly_stairs", GHOSTLY_PLANKS);
    public static final RegistrySupplier<StairBlock> SEEPING_STAIRS = createStairsBlock(
        "seeping_stairs", SEEPING_PLANKS);
    public static final RegistrySupplier<StairBlock> SORBUS_STAIRS = createStairsBlock(
        "sorbus_stairs", SORBUS_PLANKS);
    public static final RegistrySupplier<StairBlock> WALNUT_STAIRS = createStairsBlock(
        "walnut_stairs", WALNUT_PLANKS);

    // Leaves
    public static final RegistrySupplier<Block> BLOOD_SOAKED_LEAVES = createLeavesBlock("blood_soaked_leaves");
    public static final RegistrySupplier<Block> GHOSTLY_LEAVES = createLeavesBlock("ghostly_leaves");
    public static final RegistrySupplier<Block> SEEPING_LEAVES = createLeavesBlock("seeping_leaves");
    public static final RegistrySupplier<Block> SORBUS_LEAVES = createLeavesBlock("sorbus_leaves");
    public static final RegistrySupplier<Block> WALNUT_LEAVES = createLeavesBlock("walnut_leaves");

    // Slabs
    public static final RegistrySupplier<SlabBlock> BLOOD_SOAKED_SLAB = createSlabBlock("blood_soaked_slab");
    public static final RegistrySupplier<SlabBlock> GHOSTLY_SLAB = createSlabBlock("ghostly_slab");
    public static final RegistrySupplier<SlabBlock> SEEPING_SLAB = createSlabBlock("seeping_slab");
    public static final RegistrySupplier<SlabBlock> SORBUS_SLAB = createSlabBlock("sorbus_slab");
    public static final RegistrySupplier<SlabBlock> WALNUT_SLAB = createSlabBlock("walnut_slab");

    // Fences
    public static final RegistrySupplier<FenceBlock> BLOOD_SOAKED_FENCE = createFenceBlock("blood_soaked_fence");
    public static final RegistrySupplier<FenceBlock> GHOSTLY_FENCE = createFenceBlock("ghostly_fence");
    public static final RegistrySupplier<FenceBlock> SEEPING_FENCE = createFenceBlock("seeping_fence");
    public static final RegistrySupplier<FenceBlock> SORBUS_FENCE = createFenceBlock("sorbus_fence");
    public static final RegistrySupplier<FenceBlock> WALNUT_FENCE = createFenceBlock("walnut_fence");

    // Gates
    public static final RegistrySupplier<FenceGateBlock> BLOOD_SOAKED_GATE = createGateBlock("blood_soaked_gate");
    public static final RegistrySupplier<FenceGateBlock> GHOSTLY_GATE = createGateBlock("ghostly_gate");
    public static final RegistrySupplier<FenceGateBlock> SEEPING_GATE = createGateBlock("seeping_gate");
    public static final RegistrySupplier<FenceGateBlock> SORBUS_GATE = createGateBlock("sorbus_gate");
    public static final RegistrySupplier<FenceGateBlock> WALNUT_GATE = createGateBlock("walnut_gate");

    // Buttons
    public static final RegistrySupplier<ButtonBlock> BLOOD_SOAKED_BUTTON = createButtonBlock("blood_soaked_button");
    public static final RegistrySupplier<ButtonBlock> GHOSTLY_BUTTON = createButtonBlock("ghostly_button");
    public static final RegistrySupplier<ButtonBlock> SEEPING_BUTTON = createButtonBlock("seeping_button");
    public static final RegistrySupplier<ButtonBlock> SORBUS_BUTTON = createButtonBlock("sorbus_button");
    public static final RegistrySupplier<ButtonBlock> WALNUT_BUTTON = createButtonBlock("walnut_button");

    // Pressure plates
    public static final RegistrySupplier<PressurePlateBlock> BLOOD_SOAKED_PRESSURE_PLATE
        = createPressurePlateBlock("blood_soaked_pressure_plate");
    public static final RegistrySupplier<PressurePlateBlock> GHOSTLY_PRESSURE_PLATE
        = createPressurePlateBlock("ghostly_pressure_plate");
    public static final RegistrySupplier<PressurePlateBlock> SEEPING_PRESSURE_PLATE
        = createPressurePlateBlock("seeping_pressure_plate");
    public static final RegistrySupplier<PressurePlateBlock> SORBUS_PRESSURE_PLATE
        = createPressurePlateBlock("sorbus_pressure_plate");
    public static final RegistrySupplier<PressurePlateBlock> WALNUT_PRESSURE_PLATE
        = createPressurePlateBlock("walnut_pressure_plate");

    // Trapdoors
    public static final RegistrySupplier<TrapDoorBlock> BLOOD_SOAKED_TRAPDOOR
        = createTrapdoorBlock("blood_soaked_trapdoor");
    public static final RegistrySupplier<TrapDoorBlock> GHOSTLY_TRAPDOOR
        = createTrapdoorBlock("ghostly_trapdoor");
    public static final RegistrySupplier<TrapDoorBlock> SEEPING_TRAPDOOR
        = createTrapdoorBlock("seeping_trapdoor");
    public static final RegistrySupplier<TrapDoorBlock> SORBUS_TRAPDOOR
        = createTrapdoorBlock("sorbus_trapdoor");
    public static final RegistrySupplier<TrapDoorBlock> WALNUT_TRAPDOOR
        = createTrapdoorBlock("walnut_trapdoor");

    // Doors
    public static final RegistrySupplier<DoorBlock> BLOOD_SOAKED_DOOR = createDoorBlock("blood_soaked_door");
    public static final RegistrySupplier<DoorBlock> GHOSTLY_DOOR = createDoorBlock("ghostly_door");
    public static final RegistrySupplier<DoorBlock> SEEPING_DOOR = createDoorBlock("seeping_door");
    public static final RegistrySupplier<DoorBlock> SORBUS_DOOR = createDoorBlock("sorbus_door");
    public static final RegistrySupplier<DoorBlock> WALNUT_DOOR = createDoorBlock("walnut_door");

    // Saplings
    // TODO Make our own tree growers and fancy trees.
    public static final RegistrySupplier<SaplingBlock> BLOOD_SOAKED_SAPLING
        = createSaplingBlock("blood_soaked_sapling", TreeGrower.BIRCH);
    public static final RegistrySupplier<SaplingBlock> GHOSTLY_SAPLING
        = createSaplingBlock("ghostly_sapling", TreeGrower.BIRCH);
    public static final RegistrySupplier<SaplingBlock> SEEPING_SAPLING
        = createSaplingBlock("seeping_sapling", TreeGrower.BIRCH);
    public static final RegistrySupplier<SaplingBlock> SORBUS_SAPLING
        = createSaplingBlock("sorbus_sapling", TreeGrower.BIRCH);
    public static final RegistrySupplier<SaplingBlock> WALNUT_SAPLING
        = createSaplingBlock("walnut_sapling", TreeGrower.BIRCH);

    public static final RegistrySupplier<Block> POTTED_BLOOD_SOAKED_SAPLING
        = createPottedSapling("blood_soaked_potted_sapling", BLOOD_SOAKED_SAPLING);
    public static final RegistrySupplier<Block> POTTED_GHOSTLY_SAPLING
        = createPottedSapling("ghostly_potted_sapling", GHOSTLY_SAPLING);
    public static final RegistrySupplier<Block> POTTED_SEEPING_SAPLING
        = createPottedSapling("seeping_potted_sapling", SEEPING_SAPLING);
    public static final RegistrySupplier<Block> POTTED_SORBUS_SAPLING
        = createPottedSapling("sorbus_potted_sapling", SORBUS_SAPLING);
    public static final RegistrySupplier<Block> POTTED_WALNUT_SAPLING
        = createPottedSapling("walnut_potted_sapling", WALNUT_SAPLING);

    // Floor signs
    public static final RegistrySupplier<SparkweaveStandingSignBlock> BLOOD_SOAKED_SIGN
        = createStandingSignBlock("blood_soaked_sign", WoodType.OAK);
    public static final RegistrySupplier<SparkweaveStandingSignBlock> GHOSTLY_SIGN
        = createStandingSignBlock("ghostly_sign", WoodType.OAK);
    public static final RegistrySupplier<SparkweaveStandingSignBlock> SEEPING_SIGN
        = createStandingSignBlock("seeping_sign", WoodType.OAK);
    public static final RegistrySupplier<SparkweaveStandingSignBlock> SORBUS_SIGN
        = createStandingSignBlock("sorbus_sign", WoodType.OAK);
    public static final RegistrySupplier<SparkweaveStandingSignBlock> WALNUT_SIGN
        = createStandingSignBlock("walnut_sign", WoodType.OAK);

    // Wall signs
    public static final RegistrySupplier<SparkweaveWallSignBlock> BLOOD_SOAKED_WALL_SIGN
        = createWallSignBlock("blood_soaked_wall_sign", WoodType.OAK);
    public static final RegistrySupplier<SparkweaveWallSignBlock> GHOSTLY_WALL_SIGN
        = createWallSignBlock("ghostly_wall_sign", WoodType.OAK);
    public static final RegistrySupplier<SparkweaveWallSignBlock> SEEPING_WALL_SIGN
        = createWallSignBlock("seeping_wall_sign", WoodType.OAK);
    public static final RegistrySupplier<SparkweaveWallSignBlock> SORBUS_WALL_SIGN
        = createWallSignBlock("sorbus_wall_sign", WoodType.OAK);
    public static final RegistrySupplier<SparkweaveWallSignBlock> WALNUT_WALL_SIGN
        = createWallSignBlock("walnut_wall_sign", WoodType.OAK);

    // Hanging signs
    public static final RegistrySupplier<SparkweaveCeilingHangingSignBlock> BLOOD_SOAKED_HANGING_SIGN
        = createHangingSignBlock("blood_soaked_hanging_sign", WoodType.OAK);
    public static final RegistrySupplier<SparkweaveCeilingHangingSignBlock> GHOSTLY_HANGING_SIGN
        = createHangingSignBlock("ghostly_hanging_sign", WoodType.OAK);
    public static final RegistrySupplier<SparkweaveCeilingHangingSignBlock> SEEPING_HANGING_SIGN
        = createHangingSignBlock("seeping_hanging_sign", WoodType.OAK);
    public static final RegistrySupplier<SparkweaveCeilingHangingSignBlock> SORBUS_HANGING_SIGN
        = createHangingSignBlock("sorbus_hanging_sign", WoodType.OAK);
    public static final RegistrySupplier<SparkweaveCeilingHangingSignBlock> WALNUT_HANGING_SIGN
        = createHangingSignBlock("walnut_hanging_sign", WoodType.OAK);

    // Wall hanging signs
    public static final RegistrySupplier<WallHangingSignBlock> BLOOD_SOAKED_WALL_HANGING_SIGN
        = createWallHangingSignBlock("blood_soaked_wall_hanging_sign", WoodType.OAK);
    public static final RegistrySupplier<WallHangingSignBlock> GHOSTLY_WALL_HANGING_SIGN
        = createWallHangingSignBlock("ghostly_wall_hanging_sign", WoodType.OAK);
    public static final RegistrySupplier<WallHangingSignBlock> SEEPING_WALL_HANGING_SIGN
        = createWallHangingSignBlock("seeping_wall_hanging_sign", WoodType.OAK);
    public static final RegistrySupplier<WallHangingSignBlock> SORBUS_WALL_HANGING_SIGN
        = createWallHangingSignBlock("sorbus_wall_hanging_sign", WoodType.OAK);
    public static final RegistrySupplier<WallHangingSignBlock> WALNUT_WALL_HANGING_SIGN
        = createWallHangingSignBlock("walnut_wall_hanging_sign", WoodType.OAK);

    private static RegistrySupplier<RotatedPillarBlock> createPillarBlock(String name) {
        return BLOCKS.register(name, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    }

    private static RegistrySupplier<Block> createPlanksBlock(String name) {
        return BLOCKS.register(name, Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));
    }

    private static RegistrySupplier<StairBlock> createStairsBlock(String name, Supplier<Block> blockState) {
        return BLOCKS.register(name, properties -> new StairBlock(blockState.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS));
    }

    private static RegistrySupplier<Block> createLeavesBlock(String name) {
        return BLOCKS.register(name, properties -> new UntintedParticleLeavesBlock(
            0.5F, ParticleTypes.ASH, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));
    }

    private static RegistrySupplier<SlabBlock> createSlabBlock(String name) {
        return BLOCKS.register(name, SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));
    }

    private static RegistrySupplier<FenceBlock> createFenceBlock(String name) {
        return BLOCKS.register(name, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));
    }

    private static RegistrySupplier<FenceGateBlock> createGateBlock(String name) {
        return BLOCKS.register(name, properties -> new FenceGateBlock(WoodType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));
    }

    private static RegistrySupplier<ButtonBlock> createButtonBlock(String name) {
        return BLOCKS.register(name, properties -> new ButtonBlock(BlockSetType.OAK, 30, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));
    }

    private static RegistrySupplier<PressurePlateBlock> createPressurePlateBlock(String name) {
        return BLOCKS.register(name, properties -> new PressurePlateBlock(BlockSetType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));
    }

    private static RegistrySupplier<TrapDoorBlock> createTrapdoorBlock(String name) {
        return BLOCKS.register(name, properties -> new TrapDoorBlock(BlockSetType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR));
    }

    private static RegistrySupplier<DoorBlock> createDoorBlock(String name) {
        return BLOCKS.register(name, properties -> new DoorBlock(BlockSetType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).strength(3.0F).noOcclusion().ignitedByLava());
    }

    private static RegistrySupplier<SaplingBlock> createSaplingBlock(String name, TreeGrower generator) {
        return BLOCKS.register(name, properties -> new SaplingBlock(generator, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
    }

    @SuppressWarnings("deprecation")
    private static RegistrySupplier<Block> createPottedSapling(String name, RegistrySupplier<SaplingBlock> saplingBlock) {
        return BLOCKS.register(name, properties -> new FlowerPotBlock(saplingBlock.get(),
                properties.noOcclusion().instabreak().pushReaction(PushReaction.DESTROY)),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
    }

    private static RegistrySupplier<SparkweaveStandingSignBlock> createStandingSignBlock(String name, WoodType signType) {
        return BLOCKS.register(name, properties -> new SparkweaveStandingSignBlock(signType, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    }

    private static RegistrySupplier<SparkweaveWallSignBlock> createWallSignBlock(String name, WoodType signType) {
        return BLOCKS.register(name, properties -> new SparkweaveWallSignBlock(signType, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN));
    }

    private static RegistrySupplier<SparkweaveCeilingHangingSignBlock> createHangingSignBlock(String name, WoodType signType) {
        return BLOCKS.register(name, properties -> new SparkweaveCeilingHangingSignBlock(signType, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    }

    private static RegistrySupplier<WallHangingSignBlock> createWallHangingSignBlock(String name, WoodType signType) {
        return BLOCKS.register(name, properties -> new WallHangingSignBlock(signType, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN));
    }
}
