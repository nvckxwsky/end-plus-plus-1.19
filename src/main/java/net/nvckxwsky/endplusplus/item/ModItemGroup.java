package net.nvckxwsky.endplusplus.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nvckxwsky.endplusplus.EndPlusPlus;

public class ModItemGroup {
    public static ItemGroup EndPlusPLus;

    public static void registerItemGroup(){
        EndPlusPLus = FabricItemGroup.builder(new Identifier(EndPlusPlus.MOD_ID,"endplusplus"))
                .displayName(Text.literal("EndPlusPlus"))
                .icon(() -> new ItemStack(ModItems.Enderium_Dust)).build();
    }
}
