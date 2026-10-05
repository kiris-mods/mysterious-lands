package dev.tophatcat.mysteriouslands.data;

import dev.tophatcat.mysteriouslands.init.MysteriousBlocks;
import net.minecraft.data.BlockFamilies;
import net.minecraft.data.BlockFamily;

public final class MysteriousBlockFamilies {

    public static final BlockFamily BLOOD_SOAKED_PLANKS = BlockFamilies.familyBuilder(MysteriousBlocks.BLOOD_SOAKED_PLANKS.get())
        .button(MysteriousBlocks.BLOOD_SOAKED_BUTTON.get())
        .fence(MysteriousBlocks.BLOOD_SOAKED_FENCE.get())
        .fenceGate(MysteriousBlocks.BLOOD_SOAKED_GATE.get())
        .pressurePlate(MysteriousBlocks.BLOOD_SOAKED_PRESSURE_PLATE.get())
        .sign(MysteriousBlocks.BLOOD_SOAKED_SIGN.get(), MysteriousBlocks.BLOOD_SOAKED_WALL_SIGN.get())
        .slab(MysteriousBlocks.BLOOD_SOAKED_SLAB.get())
        .stairs(MysteriousBlocks.BLOOD_SOAKED_STAIRS.get())
        .door(MysteriousBlocks.BLOOD_SOAKED_DOOR.get())
        .trapdoor(MysteriousBlocks.BLOOD_SOAKED_TRAPDOOR.get())
        .recipeGroupPrefix("wooden")
        .recipeUnlockedBy("has_planks")
        .getFamily();

    public static final BlockFamily GHOSTLY_PLANKS = BlockFamilies.familyBuilder(MysteriousBlocks.GHOSTLY_PLANKS.get())
        .button(MysteriousBlocks.GHOSTLY_BUTTON.get())
        .fence(MysteriousBlocks.GHOSTLY_FENCE.get())
        .fenceGate(MysteriousBlocks.GHOSTLY_GATE.get())
        .pressurePlate(MysteriousBlocks.GHOSTLY_PRESSURE_PLATE.get())
        .sign(MysteriousBlocks.GHOSTLY_SIGN.get(), MysteriousBlocks.GHOSTLY_WALL_SIGN.get())
        .slab(MysteriousBlocks.GHOSTLY_SLAB.get())
        .stairs(MysteriousBlocks.GHOSTLY_STAIRS.get())
        .door(MysteriousBlocks.GHOSTLY_DOOR.get())
        .trapdoor(MysteriousBlocks.GHOSTLY_TRAPDOOR.get())
        .recipeGroupPrefix("wooden")
        .recipeUnlockedBy("has_planks")
        .getFamily();

    public static final BlockFamily SEEPING_PLANKS = BlockFamilies.familyBuilder(MysteriousBlocks.SEEPING_PLANKS.get())
        .button(MysteriousBlocks.SEEPING_BUTTON.get())
        .fence(MysteriousBlocks.SEEPING_FENCE.get())
        .fenceGate(MysteriousBlocks.SEEPING_GATE.get())
        .pressurePlate(MysteriousBlocks.SEEPING_PRESSURE_PLATE.get())
        .sign(MysteriousBlocks.SEEPING_SIGN.get(), MysteriousBlocks.SEEPING_WALL_SIGN.get())
        .slab(MysteriousBlocks.SEEPING_SLAB.get())
        .stairs(MysteriousBlocks.SEEPING_STAIRS.get())
        .door(MysteriousBlocks.SEEPING_DOOR.get())
        .trapdoor(MysteriousBlocks.SEEPING_TRAPDOOR.get())
        .recipeGroupPrefix("wooden")
        .recipeUnlockedBy("has_planks")
        .getFamily();

    public static final BlockFamily SORBUS_PLANKS = BlockFamilies.familyBuilder(MysteriousBlocks.SORBUS_PLANKS.get())
        .button(MysteriousBlocks.SORBUS_BUTTON.get())
        .fence(MysteriousBlocks.SORBUS_FENCE.get())
        .fenceGate(MysteriousBlocks.SORBUS_GATE.get())
        .pressurePlate(MysteriousBlocks.SORBUS_PRESSURE_PLATE.get())
        .sign(MysteriousBlocks.SORBUS_SIGN.get(), MysteriousBlocks.SORBUS_WALL_SIGN.get())
        .slab(MysteriousBlocks.SORBUS_SLAB.get())
        .stairs(MysteriousBlocks.SORBUS_STAIRS.get())
        .door(MysteriousBlocks.SORBUS_DOOR.get())
        .trapdoor(MysteriousBlocks.SORBUS_TRAPDOOR.get())
        .recipeGroupPrefix("wooden")
        .recipeUnlockedBy("has_planks")
        .getFamily();

    public static final BlockFamily WALNUT_PLANKS = BlockFamilies.familyBuilder(MysteriousBlocks.WALNUT_PLANKS.get())
        .button(MysteriousBlocks.WALNUT_BUTTON.get())
        .fence(MysteriousBlocks.WALNUT_FENCE.get())
        .fenceGate(MysteriousBlocks.WALNUT_GATE.get())
        .pressurePlate(MysteriousBlocks.WALNUT_PRESSURE_PLATE.get())
        .sign(MysteriousBlocks.WALNUT_SIGN.get(), MysteriousBlocks.WALNUT_WALL_SIGN.get())
        .slab(MysteriousBlocks.WALNUT_SLAB.get())
        .stairs(MysteriousBlocks.WALNUT_STAIRS.get())
        .door(MysteriousBlocks.WALNUT_DOOR.get())
        .trapdoor(MysteriousBlocks.WALNUT_TRAPDOOR.get())
        .recipeGroupPrefix("wooden")
        .recipeUnlockedBy("has_planks")
        .getFamily();
}
