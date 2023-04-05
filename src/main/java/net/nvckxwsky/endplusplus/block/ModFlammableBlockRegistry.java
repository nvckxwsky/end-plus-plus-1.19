package net.nvckxwsky.endplusplus.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {
    public static void registerFlammableBlocks(){
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        //registry.add(ModBlocks.END_TREE_LEAVES, 30, 60);
    }
}
