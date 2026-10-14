package dev.tophatcat.mysteriouslands.init;

import dev.tophatcat.mysteriouslands.MysteriousLands;
import dev.upcraft.sparkweave.api.block.SparkweaveCeilingHangingSignBlock;
import dev.upcraft.sparkweave.api.block.SparkweaveStandingSignBlock;
import dev.upcraft.sparkweave.api.block.SparkweaveWallHangingSignBlock;
import dev.upcraft.sparkweave.api.block.SparkweaveWallSignBlock;
import dev.upcraft.sparkweave.api.registry.RegistryHandler;
import dev.upcraft.sparkweave.api.registry.RegistrySupplier;
import dev.upcraft.sparkweave.api.registry.block.BlockRegistryHandler;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.PushReaction;

public class MysteriousBlocks {

    public static final BlockRegistryHandler BLOCKS = RegistryHandler.blocks(MysteriousLands.MODID);

    // Logs
    public static final RegistrySupplier<RotatedPillarBlock> BLOOD_SOAKED_LOG = BLOCKS.register(
        "blood_soaked_log", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final RegistrySupplier<RotatedPillarBlock> GHOSTLY_LOG = BLOCKS.register(
        "ghostly_log", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final RegistrySupplier<RotatedPillarBlock> SEEPING_LOG
        = BLOCKS.register("seeping_log", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final RegistrySupplier<RotatedPillarBlock> SORBUS_LOG
        = BLOCKS.register("sorbus_log", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final RegistrySupplier<RotatedPillarBlock> WALNUT_LOG
        = BLOCKS.register("walnut_log", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));

    // Stripped logs
    public static final RegistrySupplier<RotatedPillarBlock> BLOOD_SOAKED_STRIPPED_LOG
        = BLOCKS.register("blood_soaked_stripped_log", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final RegistrySupplier<RotatedPillarBlock> GHOSTLY_STRIPPED_LOG
        = BLOCKS.register("ghostly_stripped_log", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final RegistrySupplier<RotatedPillarBlock> SEEPING_STRIPPED_LOG
        = BLOCKS.register("seeping_stripped_log", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final RegistrySupplier<RotatedPillarBlock> SORBUS_STRIPPED_LOG
        = BLOCKS.register("sorbus_stripped_log", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final RegistrySupplier<RotatedPillarBlock> WALNUT_STRIPPED_LOG
        = BLOCKS.register("walnut_stripped_log", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));

    // Woods
    public static final RegistrySupplier<RotatedPillarBlock> BLOOD_SOAKED_WOOD
        = BLOCKS.register("blood_soaked_wood", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final RegistrySupplier<RotatedPillarBlock> GHOSTLY_WOOD
        = BLOCKS.register("ghostly_wood", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final RegistrySupplier<RotatedPillarBlock> SEEPING_WOOD
        = BLOCKS.register("seeping_wood", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final RegistrySupplier<RotatedPillarBlock> SORBUS_WOOD
        = BLOCKS.register("sorbus_wood", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final RegistrySupplier<RotatedPillarBlock> WALNUT_WOOD
        = BLOCKS.register("walnut_wood", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));

    // Stripped woods
    public static final RegistrySupplier<RotatedPillarBlock> BLOOD_SOAKED_STRIPPED_WOOD
        = BLOCKS.register("blood_soaked_stripped_wood", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final RegistrySupplier<RotatedPillarBlock> GHOSTLY_STRIPPED_WOOD
        = BLOCKS.register("ghostly_stripped_wood", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final RegistrySupplier<RotatedPillarBlock> SEEPING_STRIPPED_WOOD
        = BLOCKS.register("seeping_stripped_wood", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final RegistrySupplier<RotatedPillarBlock> SORBUS_STRIPPED_WOOD
        = BLOCKS.register("sorbus_stripped_wood", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final RegistrySupplier<RotatedPillarBlock> WALNUT_STRIPPED_WOOD
        = BLOCKS.register("walnut_stripped_wood", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));

    // Planks
    public static final RegistrySupplier<Block> BLOOD_SOAKED_PLANKS = BLOCKS.register("blood_soaked_planks",
        Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));
    public static final RegistrySupplier<Block> GHOSTLY_PLANKS = BLOCKS.register("ghostly_planks",
        Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));
    public static final RegistrySupplier<Block> SEEPING_PLANKS = BLOCKS.register("seeping_planks",
        Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));
    public static final RegistrySupplier<Block> SORBUS_PLANKS = BLOCKS.register("sorbus_planks",
        Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));
    public static final RegistrySupplier<Block> WALNUT_PLANKS = BLOCKS.register("walnut_planks",
        Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Stairs
    public static final RegistrySupplier<StairBlock> BLOOD_SOAKED_STAIRS = BLOCKS.register(
        "blood_soaked_stairs", properties -> new StairBlock(BLOOD_SOAKED_PLANKS.get().defaultBlockState(), properties),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS));
    public static final RegistrySupplier<StairBlock> GHOSTLY_STAIRS = BLOCKS.register(
        "ghostly_stairs", properties -> new StairBlock(GHOSTLY_PLANKS.get().defaultBlockState(), properties),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS));
    public static final RegistrySupplier<StairBlock> SEEPING_STAIRS = BLOCKS.register(
        "seeping_stairs", properties -> new StairBlock(SEEPING_PLANKS.get().defaultBlockState(), properties),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS));
    public static final RegistrySupplier<StairBlock> SORBUS_STAIRS = BLOCKS.register(
        "sorbus_stairs", properties -> new StairBlock(SORBUS_PLANKS.get().defaultBlockState(), properties),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS));
    public static final RegistrySupplier<StairBlock> WALNUT_STAIRS = BLOCKS.register(
        "walnut_stairs", properties -> new StairBlock(WALNUT_PLANKS.get().defaultBlockState(), properties),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS));

    // Leaves
    public static final RegistrySupplier<Block> BLOOD_SOAKED_LEAVES = BLOCKS.register("blood_soaked_leaves",
        properties -> new UntintedParticleLeavesBlock(
        0.5F, ParticleTypes.ASH, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));
    public static final RegistrySupplier<Block> GHOSTLY_LEAVES = BLOCKS.register("ghostly_leaves",
        properties -> new UntintedParticleLeavesBlock(
        0.5F, ParticleTypes.ASH, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));
    public static final RegistrySupplier<Block> SEEPING_LEAVES = BLOCKS.register("seeping_leaves",
        properties -> new UntintedParticleLeavesBlock(
        0.5F, ParticleTypes.ASH, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));
    public static final RegistrySupplier<Block> SORBUS_LEAVES = BLOCKS.register("sorbus_leaves",
        properties -> new UntintedParticleLeavesBlock(
        0.5F, ParticleTypes.ASH, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));
    public static final RegistrySupplier<Block> WALNUT_LEAVES = BLOCKS.register("walnut_leaves",
        properties -> new UntintedParticleLeavesBlock(
        0.5F, ParticleTypes.ASH, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));

    // Slabs
    public static final RegistrySupplier<SlabBlock> BLOOD_SOAKED_SLAB = BLOCKS.register("blood_soaked_slab",
        SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));
    public static final RegistrySupplier<SlabBlock> GHOSTLY_SLAB = BLOCKS.register("ghostly_slab",
        SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));
    public static final RegistrySupplier<SlabBlock> SEEPING_SLAB = BLOCKS.register("seeping_slab",
        SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));
    public static final RegistrySupplier<SlabBlock> SORBUS_SLAB = BLOCKS.register("sorbus_slab",
        SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));
    public static final RegistrySupplier<SlabBlock> WALNUT_SLAB = BLOCKS.register("walnut_slab",
        SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));

    // Fences
    public static final RegistrySupplier<FenceBlock> BLOOD_SOAKED_FENCE = BLOCKS.register("blood_soaked_fence",
        FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));
    public static final RegistrySupplier<FenceBlock> GHOSTLY_FENCE = BLOCKS.register("ghostly_fence",
        FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));
    public static final RegistrySupplier<FenceBlock> SEEPING_FENCE = BLOCKS.register("seeping_fence",
        FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));
    public static final RegistrySupplier<FenceBlock> SORBUS_FENCE = BLOCKS.register("sorbus_fence",
        FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));
    public static final RegistrySupplier<FenceBlock> WALNUT_FENCE = BLOCKS.register("walnut_fence",
        FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));

    // Gates
    public static final RegistrySupplier<FenceGateBlock> BLOOD_SOAKED_GATE = BLOCKS.register("blood_soaked_gate",
        properties -> new FenceGateBlock(WoodType.OAK, properties),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));
    public static final RegistrySupplier<FenceGateBlock> GHOSTLY_GATE = BLOCKS.register("ghostly_gate",
        properties -> new FenceGateBlock(WoodType.OAK, properties),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));
    public static final RegistrySupplier<FenceGateBlock> SEEPING_GATE = BLOCKS.register("seeping_gate",
        properties -> new FenceGateBlock(WoodType.OAK, properties),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));
    public static final RegistrySupplier<FenceGateBlock> SORBUS_GATE = BLOCKS.register("sorbus_gate",
        properties -> new FenceGateBlock(WoodType.OAK, properties),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));
    public static final RegistrySupplier<FenceGateBlock> WALNUT_GATE = BLOCKS.register("walnut_gate",
        properties -> new FenceGateBlock(WoodType.OAK, properties),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));

    // Buttons
    public static final RegistrySupplier<ButtonBlock> BLOOD_SOAKED_BUTTON = BLOCKS.register("blood_soaked_button",
        properties -> new ButtonBlock(BlockSetType.OAK, 30, properties),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));
    public static final RegistrySupplier<ButtonBlock> GHOSTLY_BUTTON = BLOCKS.register("ghostly_button",
        properties -> new ButtonBlock(BlockSetType.OAK, 30, properties),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));
    public static final RegistrySupplier<ButtonBlock> SEEPING_BUTTON = BLOCKS.register("seeping_button",
        properties -> new ButtonBlock(BlockSetType.OAK, 30, properties),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));
    public static final RegistrySupplier<ButtonBlock> SORBUS_BUTTON = BLOCKS.register("sorbus_button",
        properties -> new ButtonBlock(BlockSetType.OAK, 30, properties),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));
    public static final RegistrySupplier<ButtonBlock> WALNUT_BUTTON = BLOCKS.register("walnut_button",
        properties -> new ButtonBlock(BlockSetType.OAK, 30, properties),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));

    // Pressure plates
    public static final RegistrySupplier<PressurePlateBlock> BLOOD_SOAKED_PRESSURE_PLATE
        = BLOCKS.register("blood_soaked_pressure_plate", properties -> new PressurePlateBlock(BlockSetType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));
    public static final RegistrySupplier<PressurePlateBlock> GHOSTLY_PRESSURE_PLATE
        = BLOCKS.register("ghostly_pressure_plate", properties -> new PressurePlateBlock(BlockSetType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));
    public static final RegistrySupplier<PressurePlateBlock> SEEPING_PRESSURE_PLATE
        = BLOCKS.register("seeping_pressure_plate", properties -> new PressurePlateBlock(BlockSetType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));
    public static final RegistrySupplier<PressurePlateBlock> SORBUS_PRESSURE_PLATE
        = BLOCKS.register("sorbus_pressure_plate", properties -> new PressurePlateBlock(BlockSetType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));
    public static final RegistrySupplier<PressurePlateBlock> WALNUT_PRESSURE_PLATE
        = BLOCKS.register("walnut_pressure_plate", properties -> new PressurePlateBlock(BlockSetType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));

    // Trapdoors
    public static final RegistrySupplier<TrapDoorBlock> BLOOD_SOAKED_TRAPDOOR
        = BLOCKS.register("blood_soaked_trapdoor", properties -> new TrapDoorBlock(BlockSetType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR));
    public static final RegistrySupplier<TrapDoorBlock> GHOSTLY_TRAPDOOR
        = BLOCKS.register("ghostly_trapdoor", properties -> new TrapDoorBlock(BlockSetType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR));
    public static final RegistrySupplier<TrapDoorBlock> SEEPING_TRAPDOOR
        = BLOCKS.register("seeping_trapdoor", properties -> new TrapDoorBlock(BlockSetType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR));
    public static final RegistrySupplier<TrapDoorBlock> SORBUS_TRAPDOOR
        = BLOCKS.register("sorbus_trapdoor", properties -> new TrapDoorBlock(BlockSetType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR));
    public static final RegistrySupplier<TrapDoorBlock> WALNUT_TRAPDOOR
        = BLOCKS.register("walnut_trapdoor", properties -> new TrapDoorBlock(BlockSetType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR));

    // Doors
    public static final RegistrySupplier<DoorBlock> BLOOD_SOAKED_DOOR = BLOCKS.register("blood_soaked_door",
        properties -> new DoorBlock(BlockSetType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).strength(3.0F).noOcclusion().ignitedByLava());
    public static final RegistrySupplier<DoorBlock> GHOSTLY_DOOR = BLOCKS.register("ghostly_door",
        properties -> new DoorBlock(BlockSetType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).strength(3.0F).noOcclusion().ignitedByLava());
    public static final RegistrySupplier<DoorBlock> SEEPING_DOOR = BLOCKS.register("seeping_door",
        properties -> new DoorBlock(BlockSetType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).strength(3.0F).noOcclusion().ignitedByLava());
    public static final RegistrySupplier<DoorBlock> SORBUS_DOOR = BLOCKS.register("sorbus_door",
        properties -> new DoorBlock(BlockSetType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).strength(3.0F).noOcclusion().ignitedByLava());
    public static final RegistrySupplier<DoorBlock> WALNUT_DOOR = BLOCKS.register("walnut_door",
        properties -> new DoorBlock(BlockSetType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).strength(3.0F).noOcclusion().ignitedByLava());

    // Saplings
    // TODO Make our own tree growers and fancy trees.
    public static final RegistrySupplier<SaplingBlock> BLOOD_SOAKED_SAPLING
        = BLOCKS.register("blood_soaked_sapling", properties -> new SaplingBlock(TreeGrower.BIRCH, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
    public static final RegistrySupplier<SaplingBlock> GHOSTLY_SAPLING
        = BLOCKS.register("ghostly_sapling", properties -> new SaplingBlock(TreeGrower.BIRCH, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
    public static final RegistrySupplier<SaplingBlock> SEEPING_SAPLING
        = BLOCKS.register("seeping_sapling", properties -> new SaplingBlock(TreeGrower.BIRCH, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
    public static final RegistrySupplier<SaplingBlock> SORBUS_SAPLING
        = BLOCKS.register("sorbus_sapling", properties -> new SaplingBlock(TreeGrower.BIRCH, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
    public static final RegistrySupplier<SaplingBlock> WALNUT_SAPLING
        = BLOCKS.register("walnut_sapling", properties -> new SaplingBlock(TreeGrower.BIRCH, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));

    // Potted saplings
    public static final RegistrySupplier<Block> POTTED_BLOOD_SOAKED_SAPLING
        = BLOCKS.register("potted_blood_soaked_sapling", properties -> new FlowerPotBlock(BLOOD_SOAKED_SAPLING.get(),
            properties.noOcclusion().instabreak().pushReaction(PushReaction.DESTROY)),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
    public static final RegistrySupplier<Block> POTTED_GHOSTLY_SAPLING
        = BLOCKS.register("potted_ghostly_sapling", properties -> new FlowerPotBlock(GHOSTLY_SAPLING.get(),
            properties.noOcclusion().instabreak().pushReaction(PushReaction.DESTROY)),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
    public static final RegistrySupplier<Block> POTTED_SEEPING_SAPLING
        = BLOCKS.register("potted_seeping_sapling", properties -> new FlowerPotBlock(SEEPING_SAPLING.get(),
            properties.noOcclusion().instabreak().pushReaction(PushReaction.DESTROY)),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
    public static final RegistrySupplier<Block> POTTED_SORBUS_SAPLING
        = BLOCKS.register("potted_sorbus_sapling", properties -> new FlowerPotBlock(SORBUS_SAPLING.get(),
            properties.noOcclusion().instabreak().pushReaction(PushReaction.DESTROY)),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
    public static final RegistrySupplier<Block> POTTED_WALNUT_SAPLING
        = BLOCKS.register("potted_walnut_sapling", properties -> new FlowerPotBlock(WALNUT_SAPLING.get(),
            properties.noOcclusion().instabreak().pushReaction(PushReaction.DESTROY)),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));

    // Floor signs
    public static final RegistrySupplier<SparkweaveStandingSignBlock> BLOOD_SOAKED_SIGN
        = BLOCKS.register("blood_soaked_sign", properties -> new SparkweaveStandingSignBlock(WoodType.OAK, properties),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final RegistrySupplier<SparkweaveStandingSignBlock> GHOSTLY_SIGN
        = BLOCKS.register("ghostly_sign", properties -> new SparkweaveStandingSignBlock(WoodType.OAK, properties),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final RegistrySupplier<SparkweaveStandingSignBlock> SEEPING_SIGN
        = BLOCKS.register("seeping_sign", properties -> new SparkweaveStandingSignBlock(WoodType.OAK, properties),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final RegistrySupplier<SparkweaveStandingSignBlock> SORBUS_SIGN
        = BLOCKS.register("sorbus_sign", properties -> new SparkweaveStandingSignBlock(WoodType.OAK, properties),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final RegistrySupplier<SparkweaveStandingSignBlock> WALNUT_SIGN
        = BLOCKS.register("walnut_sign", properties -> new SparkweaveStandingSignBlock(WoodType.OAK, properties),
        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));

    // Wall signs
    public static final RegistrySupplier<SparkweaveWallSignBlock> BLOOD_SOAKED_WALL_SIGN
        = BLOCKS.register("blood_soaked_wall_sign", properties -> new SparkweaveWallSignBlock(WoodType.OAK, properties),
        () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).setOverridesFrom(BLOOD_SOAKED_SIGN));
    public static final RegistrySupplier<SparkweaveWallSignBlock> GHOSTLY_WALL_SIGN
        = BLOCKS.register("ghostly_wall_sign", properties -> new SparkweaveWallSignBlock(WoodType.OAK, properties),
        () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).setOverridesFrom(GHOSTLY_SIGN));
    public static final RegistrySupplier<SparkweaveWallSignBlock> SEEPING_WALL_SIGN
        = BLOCKS.register("seeping_wall_sign", properties -> new SparkweaveWallSignBlock(WoodType.OAK, properties),
        () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).setOverridesFrom(SEEPING_SIGN));
    public static final RegistrySupplier<SparkweaveWallSignBlock> SORBUS_WALL_SIGN
        = BLOCKS.register("sorbus_wall_sign", properties -> new SparkweaveWallSignBlock(WoodType.OAK, properties),
        () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).setOverridesFrom(SORBUS_SIGN));
    public static final RegistrySupplier<SparkweaveWallSignBlock> WALNUT_WALL_SIGN
        = BLOCKS.register("walnut_wall_sign", properties -> new SparkweaveWallSignBlock(WoodType.OAK, properties),
        () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).setOverridesFrom(WALNUT_SIGN));

    // Hanging signs
    public static final RegistrySupplier<SparkweaveCeilingHangingSignBlock> BLOOD_SOAKED_HANGING_SIGN
        = BLOCKS.register("blood_soaked_hanging_sign", properties -> new SparkweaveCeilingHangingSignBlock(WoodType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final RegistrySupplier<SparkweaveCeilingHangingSignBlock> GHOSTLY_HANGING_SIGN
        = BLOCKS.register("ghostly_hanging_sign", properties -> new SparkweaveCeilingHangingSignBlock(WoodType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final RegistrySupplier<SparkweaveCeilingHangingSignBlock> SEEPING_HANGING_SIGN
        = BLOCKS.register("seeping_hanging_sign", properties -> new SparkweaveCeilingHangingSignBlock(WoodType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final RegistrySupplier<SparkweaveCeilingHangingSignBlock> SORBUS_HANGING_SIGN
        = BLOCKS.register("sorbus_hanging_sign", properties -> new SparkweaveCeilingHangingSignBlock(WoodType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final RegistrySupplier<SparkweaveCeilingHangingSignBlock> WALNUT_HANGING_SIGN
        = BLOCKS.register("walnut_hanging_sign", properties -> new SparkweaveCeilingHangingSignBlock(WoodType.OAK, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));

    // Wall hanging signs
    public static final RegistrySupplier<SparkweaveWallHangingSignBlock> BLOOD_SOAKED_WALL_HANGING_SIGN
        = BLOCKS.register("blood_soaked_wall_hanging_sign", properties -> new SparkweaveWallHangingSignBlock(WoodType.OAK, properties),
        () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).setOverridesFrom(BLOOD_SOAKED_HANGING_SIGN));
    public static final RegistrySupplier<SparkweaveWallHangingSignBlock> GHOSTLY_WALL_HANGING_SIGN
        = BLOCKS.register("ghostly_wall_hanging_sign", properties -> new SparkweaveWallHangingSignBlock(WoodType.OAK, properties),
        () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).setOverridesFrom(GHOSTLY_HANGING_SIGN));
    public static final RegistrySupplier<SparkweaveWallHangingSignBlock> SEEPING_WALL_HANGING_SIGN
        = BLOCKS.register("seeping_wall_hanging_sign", properties -> new SparkweaveWallHangingSignBlock(WoodType.OAK, properties),
        () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).setOverridesFrom(SEEPING_HANGING_SIGN));
    public static final RegistrySupplier<SparkweaveWallHangingSignBlock> SORBUS_WALL_HANGING_SIGN
        = BLOCKS.register("sorbus_wall_hanging_sign", properties -> new SparkweaveWallHangingSignBlock(WoodType.OAK, properties),
        () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).setOverridesFrom(SORBUS_HANGING_SIGN));
    public static final RegistrySupplier<SparkweaveWallHangingSignBlock> WALNUT_WALL_HANGING_SIGN
        = BLOCKS.register("walnut_wall_hanging_sign", properties -> new SparkweaveWallHangingSignBlock(WoodType.OAK, properties),
        () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).setOverridesFrom(WALNUT_HANGING_SIGN));
}
