package net.nvckxwsky.endplusplus.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.nvckxwsky.endplusplus.block.ModBlocks;
import net.nvckxwsky.endplusplus.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Enderium_Source);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Enderium_Block);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Raw_Enderium_Block);

        blockStateModelGenerator.registerLog(ModBlocks.END_TREE_LOG).log(ModBlocks.END_TREE_LOG).wood(ModBlocks.END_TREE_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.END_TREE_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.END_TREE_LEAVES);

        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.END_TREE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.Enderium_Dust, Models.GENERATED);
        itemModelGenerator.register(ModItems.Enderium_Ingot, Models.GENERATED);
        itemModelGenerator.register(ModItems.Raw_Enderium, Models.GENERATED);
        itemModelGenerator.register(ModItems.Runic_Crystal, Models.GENERATED);
        itemModelGenerator.register(ModItems.End_Stick, Models.GENERATED);
        itemModelGenerator.register(ModItems.Forging_Book, Models.GENERATED);
        itemModelGenerator.register(ModItems.Runic_Pickaxe, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Runic_Sword, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Runic_Axe, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Runic_Shovel, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Runic_Hoe, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Runic_Helmet, Models.GENERATED);
        itemModelGenerator.register(ModItems.Runic_Chestplate, Models.GENERATED);
        itemModelGenerator.register(ModItems.Runic_Leggings, Models.GENERATED);
        itemModelGenerator.register(ModItems.Runic_Boots, Models.GENERATED);


    }
}
