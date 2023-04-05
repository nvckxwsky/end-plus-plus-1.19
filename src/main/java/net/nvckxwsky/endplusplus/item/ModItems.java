package net.nvckxwsky.endplusplus.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nvckxwsky.endplusplus.EndPlusPlus;
import net.nvckxwsky.endplusplus.item.custom.ModAxeItem;
import net.nvckxwsky.endplusplus.item.custom.ModHoeItem;
import net.nvckxwsky.endplusplus.item.custom.ModPickaxeItem;


public class ModItems {

    public static final Item Enderium_Dust = registerItem("enderium_dust",new Item(new FabricItemSettings()));
    public static final Item Enderium_Ingot = registerItem("enderium_ingot",new Item(new FabricItemSettings()));
    public static final Item Raw_Enderium = registerItem("raw_enderium",new Item(new FabricItemSettings()));
    public static final Item Runic_Crystal = registerItem("runic_crystal",new Item(new FabricItemSettings()));
    public static final Item End_Stick = registerItem("end_stick",new Item(new FabricItemSettings()));

    public static final Item Runic_Sword = registerItem("runic_sword",new SwordItem(ModToolMaterials.RUNIC, 3,2f,
            new FabricItemSettings()));
    public static final Item Runic_Shovel = registerItem("runic_shovel",new ShovelItem(ModToolMaterials.RUNIC, 0,0f,
            new FabricItemSettings()));
    public static final Item Runic_Pickaxe = registerItem("runic_pickaxe",new ModPickaxeItem(ModToolMaterials.RUNIC, 0,0f,
            new FabricItemSettings()));
    public static final Item Runic_Axe = registerItem("runic_axe",new ModAxeItem(ModToolMaterials.RUNIC, 5,1f,
            new FabricItemSettings()));
    public static final Item Runic_Hoe = registerItem("runic_hoe",new ModHoeItem(ModToolMaterials.RUNIC, 0,0f,
            new FabricItemSettings()));
    /*public static final Item Runic_Helmet = registerItem("runic_helmet",new ArmorItem(ModArmorMaterials.RUNIC, EquipmentSlot.HEAD,
            new FabricItemSettings()));
    public static final Item Runic_Chestplate = registerItem("runic_chestplate",new ArmorItem(ModArmorMaterials.RUNIC, EquipmentSlot.CHEST,
            new FabricItemSettings()));
    public static final Item Runic_Leggings = registerItem("runic_leggings",new ArmorItem(ModArmorMaterials.RUNIC, EquipmentSlot.LEGS,
            new FabricItemSettings()));
   public static final Item Runic_Boots = registerItem("runic_boots",new ArmorItem(ModArmorMaterials.RUNIC, EquipmentSlot.FEET,
            new FabricItemSettings()));*/


    public static void addItemsToItemGroup(){
        addToItemGroup(ModItemGroup.EndPlusPLus, Enderium_Dust);
        addToItemGroup(ModItemGroup.EndPlusPLus, Enderium_Ingot);
        addToItemGroup(ModItemGroup.EndPlusPLus, Raw_Enderium);
        addToItemGroup(ModItemGroup.EndPlusPLus, Runic_Crystal);
        addToItemGroup(ModItemGroup.EndPlusPLus, End_Stick);
        addToItemGroup(ModItemGroup.EndPlusPLus, Runic_Hoe);
        addToItemGroup(ModItemGroup.EndPlusPLus, Runic_Shovel);
        addToItemGroup(ModItemGroup.EndPlusPLus, Runic_Axe);
        addToItemGroup(ModItemGroup.EndPlusPLus, Runic_Sword);
        addToItemGroup(ModItemGroup.EndPlusPLus, Runic_Pickaxe);
        /*addToItemGroup(ModItemGroup.EndPlusPLus, Runic_Helmet);
        //addToItemGroup(ModItemGroup.EndPlusPLus, Runic_Chestplate);
        //addToItemGroup(ModItemGroup.EndPlusPLus, Runic_Leggings);
        //addToItemGroup(ModItemGroup.EndPlusPLus, Runic_Boots);*/
    }

    private static void addToItemGroup(ItemGroup group,Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM, new Identifier(EndPlusPlus.MOD_ID, name), item);
    }
    public static void registerModItems(){
        EndPlusPlus.LOGGER.info("Registering Mod Items for EndPlusPlus mod!");

        addItemsToItemGroup();
    }
}
