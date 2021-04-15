package com.telepathicgrunt.the_bumblezone.world.features;

import com.telepathicgrunt.the_bumblezone.Bumblezone;
import com.telepathicgrunt.the_bumblezone.tags.BZBlockTags;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.feature.template.TagMatchRuleTest;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BzFeatures {
    // For making ore features replace combs
    // Init at mod startup when adding FEATURES to event bus
    public static final RuleTest HONEYCOMB_BUMBLEZONE = new TagMatchRuleTest(BZBlockTags.HONEYCOMBS_THAT_FEATURES_CAN_CARVE);

    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, Bumblezone.MODID);

    public static final RegistryObject<Feature<NoFeatureConfig>> HONEYCOMB_HOLE = FEATURES.register("honeycomb_holes", () -> new HoneycombHole(NoFeatureConfig.field_236558_a_));
    public static final RegistryObject<Feature<NoFeatureConfig>> HONEYCOMB_CAVES = FEATURES.register("honeycomb_caves", () -> new HoneycombCaves(NoFeatureConfig.field_236558_a_));
    public static final RegistryObject<Feature<NoFeatureConfig>> CAVE_SUGAR_WATERFALL = FEATURES.register("cave_sugar_waterfall", () -> new CaveSugarWaterfall(NoFeatureConfig.field_236558_a_));
    public static final RegistryObject<Feature<NoFeatureConfig>> BEE_DUNGEON = FEATURES.register("bee_dungeon", () -> new BeeDungeon(NoFeatureConfig.field_236558_a_));
    public static final RegistryObject<Feature<NoFeatureConfig>> SPIDER_INFESTED_BEE_DUNGEON = FEATURES.register("spider_infested_bee_dungeon", () -> new SpiderInfestedBeeDungeon(NoFeatureConfig.field_236558_a_));
    public static final RegistryObject<Feature<NoFeatureConfig>> HONEY_CRYSTAL_FEATURE = FEATURES.register("honey_crystal_feature", () -> new HoneyCrystalFeature(NoFeatureConfig.field_236558_a_));
    public static final RegistryObject<Feature<NoFeatureConfig>> BZ_BEES_WAX_PILLAR_FEATURE = FEATURES.register("bz_bees_wax_pillar_feature", () -> new BzBeesWaxPillarFeature(NoFeatureConfig.field_236558_a_));
}