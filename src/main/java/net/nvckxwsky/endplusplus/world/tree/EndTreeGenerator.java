package net.nvckxwsky.endplusplus.world.tree;


import net.minecraft.block.PlantBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.nvckxwsky.endplusplus.world.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class EndTreeGenerator extends SaplingGenerator {

    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.END_TREE_KEY;
    }
}
