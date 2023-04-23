package net.nvckxwsky.endplusplus.data;



import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.nvckxwsky.endplusplus.block.ModBlocks;
import net.nvckxwsky.endplusplus.item.ModItems;

import java.util.function.BiConsumer;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {


    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.Enderium_Source, oreDrops(ModBlocks.Enderium_Source, ModItems.Enderium_Dust));
        addDrop(ModBlocks.Enderium_Block);
        addDrop(ModBlocks.Raw_Enderium_Block);

        addDrop(ModBlocks.END_TREE_WOOD);
        addDrop(ModBlocks.END_TREE_LOG);
        addDrop(ModBlocks.END_TREE_PLANKS);
        addDrop(ModBlocks.END_TREE_SAPLING);
        addDrop(ModBlocks.END_TREE_LEAVES, oreDrops(ModBlocks.END_TREE_LEAVES,ModItems.End_Stick));

    }
}
