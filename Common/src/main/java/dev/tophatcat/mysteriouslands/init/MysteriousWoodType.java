package dev.tophatcat.mysteriouslands.init;

import dev.tophatcat.mysteriouslands.MysteriousLands;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class MysteriousWoodType {

    public static void init() {
        WoodType.register(BLOOD_SOAKED_TYPE);
        WoodType.register(GHOSTLY_TYPE);
        WoodType.register(SEEPING_TYPE);
        WoodType.register(SORBUS_TYPE);
        WoodType.register(WALNUT_TYPE);

        BlockSetType.register(BLOOD_SOAKED_SET);
        BlockSetType.register(GHOSTLY_SET);
        BlockSetType.register(SORBUS_SET);
        BlockSetType.register(SEEPING_SET);
        BlockSetType.register(WALNUT_SET);
    }

    public static final BlockSetType BLOOD_SOAKED_SET = new BlockSetType("blood_soaked");
    public static final BlockSetType GHOSTLY_SET = new BlockSetType("ghostly");
    public static final BlockSetType SORBUS_SET = new BlockSetType("sorbus");
    public static final BlockSetType SEEPING_SET = new BlockSetType("seeping");
    public static final BlockSetType WALNUT_SET = new BlockSetType("walnut");

    public static final WoodType BLOOD_SOAKED_TYPE = new WoodType(MysteriousLands.id("blood_soaked").toString(), BLOOD_SOAKED_SET);
    public static final WoodType GHOSTLY_TYPE = new WoodType(MysteriousLands.id( "ghostly").toString(), GHOSTLY_SET);
    public static final WoodType SORBUS_TYPE = new WoodType(MysteriousLands.id("sorbus").toString(), SORBUS_SET);
    public static final WoodType SEEPING_TYPE = new WoodType(MysteriousLands.id("seeping").toString(), SEEPING_SET);
    public static final WoodType WALNUT_TYPE = new WoodType(MysteriousLands.id("walnut").toString(), WALNUT_SET);
}
