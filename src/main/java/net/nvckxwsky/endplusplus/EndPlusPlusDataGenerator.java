package net.nvckxwsky.endplusplus;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.nvckxwsky.endplusplus.data.ModLootTableGenerator;
import net.nvckxwsky.endplusplus.data.ModModelProvider;
import net.nvckxwsky.endplusplus.data.ModRecepieGenerator;
import net.nvckxwsky.endplusplus.data.ModWorldGenerator;
import net.nvckxwsky.endplusplus.world.ModConfiguredFeatures;
import net.nvckxwsky.endplusplus.world.ModPlacedFeatures;

public class EndPlusPlusDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModLootTableGenerator::new);
        pack.addProvider(ModRecepieGenerator::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModWorldGenerator::new);
    }
    @Override
    public void buildRegistry(RegistryBuilder registryBuilder){
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
    }
}
