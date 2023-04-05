package net.nvckxwsky.endplusplus.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.nvckxwsky.endplusplus.EndPlusPlus;
import net.nvckxwsky.endplusplus.block.custom.ModSaplingBlock;
import net.nvckxwsky.endplusplus.item.ModItemGroup;
import net.nvckxwsky.endplusplus.world.tree.EndTreeGenerator;

public class ModBlocks {

    public static final Block Enderium_Source =  registerBlock("enderium_source",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(9,15)), ModItemGroup.EndPlusPLus);
    public static final Block Enderium_Block =  registerBlock("enderium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.EndPlusPLus);
    public static final Block Raw_Enderium_Block =  registerBlock("raw_enderium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.EndPlusPLus);
    public static final Block END_TREE_LOG = registerBlock("end_tree_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.EndPlusPLus);
    public static final Block END_TREE_WOOD = registerBlock("end_tree_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.EndPlusPLus);
    public static final Block END_TREE_PLANKS = registerBlock("end_tree_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ModItemGroup.EndPlusPLus);
    public static final Block END_TREE_LEAVES = registerBlock("end_tree_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(1.0f)), ModItemGroup.EndPlusPLus);
    public static final Block END_TREE_SAPLING = registerBlock("end_tree_sapling",
            new ModSaplingBlock(new EndTreeGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f)), ModItemGroup.EndPlusPLus);

    private static Block registerBlock(String name,Block block,ItemGroup group){
        registerBlockItem(name,block,group);
        return Registry.register(Registries.BLOCK, new Identifier(EndPlusPlus.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        Item item = Registry.register(Registries.ITEM, new Identifier(EndPlusPlus.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    public static void registerModBlocks(){
        EndPlusPlus.LOGGER.info("Register ModBlocks for EndPlusPlus");
    }
}
