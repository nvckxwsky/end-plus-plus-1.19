package net.nvckxwsky.endplusplus.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.nvckxwsky.endplusplus.block.ModBlocks;
import net.nvckxwsky.endplusplus.item.ModItemGroup;
import net.nvckxwsky.endplusplus.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecepieGenerator extends FabricRecipeProvider {
    public ModRecepieGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.Enderium_Dust), RecipeCategory.MISC,ModItems.Raw_Enderium,
                3f,300,"endplusplus");
        offerSmelting(exporter, List.of(ModItems.Raw_Enderium), RecipeCategory.MISC,ModItems.Enderium_Ingot,
                6f,500,"endplusplus");
        offerSmelting(exporter, List.of(ModBlocks.END_TREE_LEAVES), RecipeCategory.MISC,ModItems.Enderium_Dust,
                2f,300,"endplusplus");

        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC, ModItems.Enderium_Ingot, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.Enderium_Block);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC, ModItems.Raw_Enderium, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.Raw_Enderium_Block);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.Runic_Crystal)
                .pattern("ede")
                .pattern("ded")
                .pattern("ede")
                .input('d', Items.DIAMOND)
                .input('e',ModItems.Enderium_Ingot)
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND),
                        FabricRecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(FabricRecipeProvider.hasItem(ModItems.Enderium_Ingot),
                        FabricRecipeProvider.conditionsFromItem(ModItems.Enderium_Ingot))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.Runic_Crystal)));


        /*ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.END_TREE_SAPLING)
                .pattern("ede")
                .pattern("ehe")
                .pattern("ede")
                .input('d', Items.DIAMOND)
                .input('e',ModItems.Enderium_Dust)
                .input('h',Items.CHORUS_FLOWER)
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND),
                        FabricRecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(FabricRecipeProvider.hasItem(Items.CHORUS_FLOWER),
                        FabricRecipeProvider.conditionsFromItem(Items.CHORUS_FLOWER))
                .criterion(FabricRecipeProvider.hasItem(ModItems.Enderium_Dust),
                        FabricRecipeProvider.conditionsFromItem(ModItems.Enderium_Dust))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.END_TREE_SAPLING)));*/

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.End_Stick)
                .pattern("   ")
                .pattern(" e ")
                .pattern(" e ")
                .input('e', ModBlocks.END_TREE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND),
                        FabricRecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.End_Stick)));

        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_TREE_PLANKS, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.END_TREE_LOG);

        //end tree crafting recepies
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.END_TREE_SAPLING)
                .pattern("eee")
                .pattern("eee")
                .pattern("eee")
                .input('e', ModBlocks.END_TREE_LEAVES)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.END_TREE_LEAVES),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.END_TREE_LEAVES))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.END_TREE_SAPLING)));

        //Tools recepies
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.Runic_Pickaxe)
                .pattern("iri")
                .pattern("gng")
                .pattern("isi")
                .input('r', ModItems.Runic_Crystal)
                .input('g', Items.GOLD_INGOT)
                .input('n', Items.NETHERITE_PICKAXE)
                .input('i', Blocks.IRON_BLOCK)
                .input('s', ModItems.End_Stick)
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_PICKAXE),
                        FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_PICKAXE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.Runic_Crystal),
                        FabricRecipeProvider.conditionsFromItem(ModItems.Runic_Crystal))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.Runic_Pickaxe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.Runic_Sword)
                .pattern("iri")
                .pattern("dnd")
                .pattern("isi")
                .input('r', ModItems.Runic_Crystal)
                .input('d', Items.DIAMOND)
                .input('n', Items.NETHERITE_SWORD)
                .input('i', Blocks.IRON_BLOCK)
                .input('s', ModItems.End_Stick)
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_SWORD),
                        FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_SWORD))
                .criterion(FabricRecipeProvider.hasItem(ModItems.Runic_Crystal),
                        FabricRecipeProvider.conditionsFromItem(ModItems.Runic_Crystal))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.Runic_Sword)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.Runic_Axe)
                .pattern("iri")
                .pattern("ene")
                .pattern("isi")
                .input('r', ModItems.Runic_Crystal)
                .input('e', ModBlocks.END_TREE_LOG)
                .input('n', Items.NETHERITE_AXE)
                .input('i', Blocks.IRON_BLOCK)
                .input('s', ModItems.End_Stick)
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_AXE),
                        FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_AXE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.Runic_Crystal),
                        FabricRecipeProvider.conditionsFromItem(ModItems.Runic_Crystal))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.Runic_Axe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.Runic_Shovel)
                .pattern("iri")
                .pattern("pnp")
                .pattern("isi")
                .input('r', ModItems.Runic_Crystal)
                .input('p', Blocks.PODZOL)
                .input('n', Items.NETHERITE_SHOVEL)
                .input('i', Blocks.IRON_BLOCK)
                .input('s', ModItems.End_Stick)
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_SHOVEL),
                        FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_SHOVEL))
                .criterion(FabricRecipeProvider.hasItem(ModItems.Runic_Crystal),
                        FabricRecipeProvider.conditionsFromItem(ModItems.Runic_Crystal))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.Runic_Shovel)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.Runic_Hoe)
                .pattern("iri")
                .pattern("ana")
                .pattern("isi")
                .input('r', ModItems.Runic_Crystal)
                .input('a', Items.GOLDEN_APPLE)
                .input('n', Items.NETHERITE_HOE)
                .input('i', Blocks.IRON_BLOCK)
                .input('s', ModItems.End_Stick)
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_HOE),
                        FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_HOE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.Runic_Crystal),
                        FabricRecipeProvider.conditionsFromItem(ModItems.Runic_Crystal))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.Runic_Hoe)));



    }
}
