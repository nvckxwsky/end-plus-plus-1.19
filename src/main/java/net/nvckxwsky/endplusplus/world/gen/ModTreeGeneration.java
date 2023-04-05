package net.nvckxwsky.endplusplus.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.nvckxwsky.endplusplus.world.ModPlacedFeatures;

public class ModTreeGeneration {
    public static void generateTrees(){
    BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.END_TREE_PLACED_KEY);
}
}
