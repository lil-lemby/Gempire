package com.gempire.init;

import com.gempire.Gempire;
import com.gempire.items.ItemChroma;
import com.gempire.items.ItemGem;
import com.gempire.items.TestItem;
import com.gempire.util.ModItemGroup;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.awt.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Gempire.MODID);


    public static final RegistryObject<Item> WHITE_CHROMA_CRYSTAL = ITEMS.register("white_chroma_crystal", () ->
            new BlockItem(
                    ModBlocks.WHITE_CHROMA_CRYSTAL.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> ORANGE_CHROMA_CRYSTAL = ITEMS.register("orange_chroma_crystal", () ->
            new BlockItem(
                    ModBlocks.ORANGE_CHROMA_CRYSTAL.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> MAGENTA_CHROMA_CRYSTAL = ITEMS.register("magenta_chroma_crystal", () ->
            new BlockItem(
                    ModBlocks.MAGENTA_CHROMA_CRYSTAL.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> LIGHT_BLUE_CHROMA_CRYSTAL = ITEMS.register("light_blue_chroma_crystal", () ->
            new BlockItem(
                    ModBlocks.LIGHT_BLUE_CHROMA_CRYSTAL.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> YELLOW_CHROMA_CRYSTAL = ITEMS.register("yellow_chroma_crystal", () ->
            new BlockItem(
                    ModBlocks.YELLOW_CHROMA_CRYSTAL.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> LIME_CHROMA_CRYSTAL = ITEMS.register("lime_chroma_crystal", () ->
            new BlockItem(
                    ModBlocks.LIME_CHROMA_CRYSTAL.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> PINK_CHROMA_CRYSTAL = ITEMS.register("pink_chroma_crystal", () ->
            new BlockItem(
                    ModBlocks.PINK_CHROMA_CRYSTAL.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> GRAY_CHROMA_CRYSTAL = ITEMS.register("gray_chroma_crystal", () ->
            new BlockItem(
                    ModBlocks.GRAY_CHROMA_CRYSTAL.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> LIGHT_GRAY_CHROMA_CRYSTAL = ITEMS.register("light_gray_chroma_crystal", () ->
            new BlockItem(
                    ModBlocks.LIGHT_GRAY_CHROMA_CRYSTAL.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> CYAN_CHROMA_CRYSTAL = ITEMS.register("cyan_chroma_crystal", () ->
            new BlockItem(
                    ModBlocks.CYAN_CHROMA_CRYSTAL.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> PURPLE_CHROMA_CRYSTAL = ITEMS.register("purple_chroma_crystal", () ->
            new BlockItem(
                    ModBlocks.PURPLE_CHROMA_CRYSTAL.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> BLUE_CHROMA_CRYSTAL = ITEMS.register("blue_chroma_crystal", () ->
            new BlockItem(
                    ModBlocks.BLUE_CHROMA_CRYSTAL.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> BROWN_CHROMA_CRYSTAL = ITEMS.register("brown_chroma_crystal", () ->
            new BlockItem(
                    ModBlocks.BROWN_CHROMA_CRYSTAL.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> GREEN_CHROMA_CRYSTAL = ITEMS.register("green_chroma_crystal", () ->
            new BlockItem(
                    ModBlocks.GREEN_CHROMA_CRYSTAL.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> RED_CHROMA_CRYSTAL = ITEMS.register("red_chroma_crystal", () ->
            new BlockItem(
                    ModBlocks.RED_CHROMA_CRYSTAL.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> BLACK_CHROMA_CRYSTAL = ITEMS.register("black_chroma_crystal", () ->
            new BlockItem(
                    ModBlocks.BLACK_CHROMA_CRYSTAL.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );



    public static final RegistryObject<Item> DRAINED_BLUE_SOIL = ITEMS.register("drained_blue_soil", () ->
            new BlockItem(
                    ModBlocks.DRAINED_BLUE_SOIL.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> DRAINED_BLUE_STONE = ITEMS.register("drained_blue_stone", () ->
            new BlockItem(
                    ModBlocks.DRAINED_BLUE_STONE.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> DRAINED_BLUE_STONE_2 = ITEMS.register("drained_blue_stone_2", () ->
            new BlockItem(
                    ModBlocks.DRAINED_BLUE_STONE_2.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> DRAINED_BANDED_BLUE_STONE = ITEMS.register("drained_blue_stone_bands", () ->
            new BlockItem(
                    ModBlocks.DRAINED_BANDED_BLUE_STONE.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );

    public static final RegistryObject<Item> DRAINED_GREY_SOIL = ITEMS.register("drained_grey_soil", () ->
            new BlockItem(
                    ModBlocks.DRAINED_GREY_SOIL.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> DRAINED_GREY_STONE = ITEMS.register("drained_grey_stone", () ->
            new BlockItem(
                    ModBlocks.DRAINED_GREY_STONE.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> DRAINED_GREY_STONE_2 = ITEMS.register("drained_grey_stone_2", () ->
            new BlockItem(
                    ModBlocks.DRAINED_GREY_STONE_2.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> DRAINED_BANDED_GREY_STONE = ITEMS.register("drained_grey_stone_bands", () ->
            new BlockItem(
                    ModBlocks.DRAINED_BANDED_GREY_STONE.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );

    public static final RegistryObject<Item> DRAINED_PURPLE_SOIL = ITEMS.register("drained_purple_soil", () ->
            new BlockItem(
                    ModBlocks.DRAINED_PURPLE_SOIL.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> DRAINED_PURPLE_STONE = ITEMS.register("drained_purple_stone", () ->
            new BlockItem(
                    ModBlocks.DRAINED_PURPLE_STONE.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> DRAINED_PURPLE_STONE_2 = ITEMS.register("drained_purple_stone_2", () ->
            new BlockItem(
                    ModBlocks.DRAINED_PURPLE_STONE_2.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> DRAINED_BANDED_PURPLE_STONE = ITEMS.register("drained_purple_stone_bands", () ->
            new BlockItem(
                    ModBlocks.DRAINED_BANDED_PURPLE_STONE.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );

    public static final RegistryObject<Item> DRAINED_RED_SAND = ITEMS.register("drained_red_sand", () ->
            new BlockItem(
                    ModBlocks.DRAINED_RED_SAND.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> DRAINED_RED_STONE = ITEMS.register("drained_red_stone", () ->
            new BlockItem(
                    ModBlocks.DRAINED_RED_STONE.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> DRAINED_RED_STONE_2 = ITEMS.register("drained_red_stone_2", () ->
            new BlockItem(
                    ModBlocks.DRAINED_RED_STONE_2.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> DRAINED_BANDED_RED_STONE = ITEMS.register("drained_red_stone_bands", () ->
            new BlockItem(
                    ModBlocks.DRAINED_BANDED_RED_STONE.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );

    public static final RegistryObject<Item> DRAINED_SAND = ITEMS.register("drained_sand", () ->
            new BlockItem(
                    ModBlocks.DRAINED_SAND.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> DRAINED_YELLOW_STONE = ITEMS.register("drained_yellow_stone", () ->
            new BlockItem(
                    ModBlocks.DRAINED_YELLOW_STONE.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> DRAINED_YELLOW_STONE_2 = ITEMS.register("drained_yellow_stone_2", () ->
            new BlockItem(
                    ModBlocks.DRAINED_YELLOW_STONE_2.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> DRAINED_BANDED_YELLOW_STONE = ITEMS.register("drained_yellow_stone_bands", () ->
            new BlockItem(
                    ModBlocks.DRAINED_BANDED_YELLOW_STONE.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );

    /*public static final RegistryObject<Item> GEM_SEED_BLOCK_ITEM = ITEMS.register("gem_seed_block", () ->
            new BlockItem(
                    ModBlocks.GEM_SEED_BLOCK.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );*/
    public static final RegistryObject<Item> POWER_CRYSTAL_BLOCK_ITEM = ITEMS.register("power_crystal_block", () ->
            new BlockItem(
                    ModBlocks.POWER_CRYSTAL_BLOCK.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> TANK_BLOCK_ITEM = ITEMS.register("tank_block", () ->
            new BlockItem(
                    ModBlocks.TANK_BLOCK.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );
    public static final RegistryObject<Item> DRILL_BLOCK_ITEM = ITEMS.register("drill_block", () ->
            new BlockItem(
                    ModBlocks.DRILL_BLOCK.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );

    /*public static final RegistryObject<Item> TEST_CONTAINER_BLOCK_ITEM = ITEMS.register("test_container_block", () ->
            new BlockItem(
                    ModBlocks.TEST_CONTAINER_BLOCK.get(),
                    new Item.Properties().group(ModItemGroup.BLOCKS)
            )
    );*/

    public static final RegistryObject<Item> ESSENCE_BOTTLE = ITEMS.register("essence_bottle", () ->
            new BucketItem(Fluids.EMPTY, new Item.Properties().containerItem(Items.BUCKET).maxStackSize(16).group(ModItemGroup.ITEMS)));
    public static final RegistryObject<Item> PINK_ESSENCE = ITEMS.register("pink_essence", () ->
            new BucketItem(ModFluids.PINK_ESSENCE, new Item.Properties().containerItem(ModItems.ESSENCE_BOTTLE.get()).maxStackSize(1).group(ModItemGroup.ITEMS)));
    public static final RegistryObject<Item> BLUE_ESSENCE = ITEMS.register("blue_essence", () ->
            new BucketItem(ModFluids.BLUE_ESSENCE, new Item.Properties().containerItem(ModItems.ESSENCE_BOTTLE.get()).maxStackSize(1).group(ModItemGroup.ITEMS)));
    public static final RegistryObject<Item> YELLOW_ESSENCE = ITEMS.register("yellow_essence", () ->
            new BucketItem(ModFluids.YELLOW_ESSENCE, new Item.Properties().containerItem(ModItems.ESSENCE_BOTTLE.get()).maxStackSize(1).group(ModItemGroup.ITEMS)));
    public static final RegistryObject<Item> WHITE_ESSENCE = ITEMS.register("white_essence", () ->
            new BucketItem(ModFluids.WHITE_ESSENCE, new Item.Properties().containerItem(ModItems.ESSENCE_BOTTLE.get()).maxStackSize(1).group(ModItemGroup.ITEMS)));

    public static final RegistryObject<Item> WHITE_CHROMA = ITEMS.register("white_chroma", () ->
            new ItemChroma(new Item.Properties().group(ModItemGroup.ITEMS).maxStackSize(64), 0));
    public static final RegistryObject<Item> ORANGE_CHROMA = ITEMS.register("orange_chroma", () ->
            new ItemChroma(new Item.Properties().group(ModItemGroup.ITEMS).maxStackSize(64), 1));
    public static final RegistryObject<Item> MAGENTA_CHROMA = ITEMS.register("magenta_chroma", () ->
            new ItemChroma(new Item.Properties().group(ModItemGroup.ITEMS).maxStackSize(64), 2));
    public static final RegistryObject<Item> LIGHT_BLUE_CHROMA = ITEMS.register("light_blue_chroma", () ->
            new ItemChroma(new Item.Properties().group(ModItemGroup.ITEMS).maxStackSize(64), 3));
    public static final RegistryObject<Item> YELLOW_CHROMA = ITEMS.register("yellow_chroma", () ->
            new ItemChroma(new Item.Properties().group(ModItemGroup.ITEMS).maxStackSize(64), 4));
    public static final RegistryObject<Item> LIME_CHROMA = ITEMS.register("lime_chroma", () ->
            new ItemChroma(new Item.Properties().group(ModItemGroup.ITEMS).maxStackSize(64), 5));
    public static final RegistryObject<Item> PINK_CHROMA = ITEMS.register("pink_chroma", () ->
            new ItemChroma(new Item.Properties().group(ModItemGroup.ITEMS).maxStackSize(64), 6));
    public static final RegistryObject<Item> GRAY_CHROMA = ITEMS.register("gray_chroma", () ->
            new ItemChroma(new Item.Properties().group(ModItemGroup.ITEMS).maxStackSize(64), 7));
    public static final RegistryObject<Item> LIGHT_GRAY_CHROMA = ITEMS.register("light_gray_chroma", () ->
            new ItemChroma(new Item.Properties().group(ModItemGroup.ITEMS).maxStackSize(64), 8));
    public static final RegistryObject<Item> CYAN_CHROMA = ITEMS.register("cyan_chroma", () ->
            new ItemChroma(new Item.Properties().group(ModItemGroup.ITEMS).maxStackSize(64), 9));
    public static final RegistryObject<Item> PURPLE_CHROMA = ITEMS.register("purple_chroma", () ->
            new ItemChroma(new Item.Properties().group(ModItemGroup.ITEMS).maxStackSize(64), 10));
    public static final RegistryObject<Item> BLUE_CHROMA = ITEMS.register("blue_chroma", () ->
            new ItemChroma(new Item.Properties().group(ModItemGroup.ITEMS).maxStackSize(64), 11));
    public static final RegistryObject<Item> BROWN_CHROMA = ITEMS.register("brown_chroma", () ->
            new ItemChroma(new Item.Properties().group(ModItemGroup.ITEMS).maxStackSize(64), 12));
    public static final RegistryObject<Item> GREEN_CHROMA = ITEMS.register("green_chroma", () ->
            new ItemChroma(new Item.Properties().group(ModItemGroup.ITEMS).maxStackSize(64), 13));
    public static final RegistryObject<Item> RED_CHROMA = ITEMS.register("red_chroma", () ->
            new ItemChroma(new Item.Properties().group(ModItemGroup.ITEMS).maxStackSize(64), 14));
    public static final RegistryObject<Item> BLACK_CHROMA = ITEMS.register("black_chroma", () ->
            new ItemChroma(new Item.Properties().group(ModItemGroup.ITEMS).maxStackSize(64), 15));
    public static final RegistryObject<Item> SPECIAL_CHROMA = ITEMS.register("special_chroma", () ->
            new ItemChroma(new Item.Properties().group(ModItemGroup.ITEMS).maxStackSize(64), 16));

    public static final RegistryObject<Item> WHITE_SAPPHIRE_GEM = ITEMS.register("sapphire_gem_0", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> ORANGE_SAPPHIRE_GEM = ITEMS.register("sapphire_gem_1", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> MAGENTA_SAPPHIRE_GEM = ITEMS.register("sapphire_gem_2", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIGHT_BLUE_SAPPHIRE_GEM = ITEMS.register("sapphire_gem_3", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> YELLOW_SAPPHIRE_GEM = ITEMS.register("sapphire_gem_4", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIME_SAPPHIRE_GEM = ITEMS.register("sapphire_gem_5", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PINK_SAPPHIRE_GEM = ITEMS.register("sapphire_gem_6", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> GRAY_SAPPHIRE_GEM = ITEMS.register("sapphire_gem_7", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIGHT_GRAY_SAPPHIRE_GEM = ITEMS.register("sapphire_gem_8", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> CYAN_SAPPHIRE_GEM = ITEMS.register("sapphire_gem_9", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PURPLE_SAPPHIRE_GEM = ITEMS.register("sapphire_gem_10", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BLUE_SAPPHIRE_GEM = ITEMS.register("sapphire_gem_11", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BROWN_SAPPHIRE_GEM = ITEMS.register("sapphire_gem_12", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> GREEN_SAPPHIRE_GEM = ITEMS.register("sapphire_gem_13", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> RUBY_GEM = ITEMS.register("ruby_gem", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BLACK_SAPPHIRE_GEM = ITEMS.register("sapphire_gem_15", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));

    public static final RegistryObject<Item> RED_QUARTZ_GEM = ITEMS.register("quartz_gem_0", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> ORANGE_QUARTZ_GEM = ITEMS.register("quartz_gem_1", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> YELLOW_QUARTZ_GEM = ITEMS.register("quartz_gem_2", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIME_QUARTZ_GEM = ITEMS.register("quartz_gem_3", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> GREEN_QUARTZ_GEM = ITEMS.register("quartz_gem_4", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> CYAN_QUARTZ_GEM = ITEMS.register("quartz_gem_5", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIGHT_BLUE_QUARTZ_GEM = ITEMS.register("quartz_gem_6", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BLUE_QUARTZ_GEM = ITEMS.register("quartz_gem_7", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PURPLE_QUARTZ_GEM = ITEMS.register("quartz_gem_8", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> MAGENTA_QUARTZ_GEM = ITEMS.register("quartz_gem_9", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PINK_QUARTZ_GEM = ITEMS.register("quartz_gem_10", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BROWN_QUARTZ_GEM = ITEMS.register("quartz_gem_11", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BLACK_QUARTZ_GEM = ITEMS.register("quartz_gem_12", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> GRAY_QUARTZ_GEM = ITEMS.register("quartz_gem_13", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIGHT_GRAY_QUARTZ_GEM = ITEMS.register("quartz_gem_14", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> WHITE_QUARTZ_GEM = ITEMS.register("quartz_gem_15", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> SPECIAL_QUARTZ_GEM = ITEMS.register("quartz_gem_16", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LACE_AMETHYST_GEM = ITEMS.register("quartz_gem_17", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));

    public static final RegistryObject<Item> RED_JASPER_GEM = ITEMS.register("jasper_gem_0", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> ORANGE_JASPER_GEM = ITEMS.register("jasper_gem_1", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> YELLOW_JASPER_GEM = ITEMS.register("jasper_gem_2", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIME_JASPER_GEM = ITEMS.register("jasper_gem_3", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> GREEN_JASPER_GEM = ITEMS.register("jasper_gem_4", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> CYAN_JASPER_GEM = ITEMS.register("jasper_gem_5", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIGHT_BLUE_JASPER_GEM = ITEMS.register("jasper_gem_6", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BLUE_JASPER_GEM = ITEMS.register("jasper_gem_7", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PURPLE_JASPER_GEM = ITEMS.register("jasper_gem_8", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> MAGENTA_JASPER_GEM = ITEMS.register("jasper_gem_9", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PINK_JASPER_GEM = ITEMS.register("jasper_gem_10", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BROWN_JASPER_GEM = ITEMS.register("jasper_gem_11", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BLACK_JASPER_GEM = ITEMS.register("jasper_gem_12", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> GRAY_JASPER_GEM = ITEMS.register("jasper_gem_13", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIGHT_GRAY_JASPER_GEM = ITEMS.register("jasper_gem_14", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> WHITE_JASPER_GEM = ITEMS.register("jasper_gem_15", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> SPECIAL_JASPER_GEM = ITEMS.register("jasper_gem_16", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));

    public static final RegistryObject<Item> RED_AGATE_GEM = ITEMS.register("agate_gem_0", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> ORANGE_AGATE_GEM = ITEMS.register("agate_gem_1", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> YELLOW_AGATE_GEM = ITEMS.register("agate_gem_2", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIME_AGATE_GEM = ITEMS.register("agate_gem_3", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> GREEN_AGATE_GEM = ITEMS.register("agate_gem_4", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> CYAN_AGATE_GEM = ITEMS.register("agate_gem_5", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIGHT_BLUE_AGATE_GEM = ITEMS.register("agate_gem_6", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BLUE_AGATE_GEM = ITEMS.register("agate_gem_7", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PURPLE_AGATE_GEM = ITEMS.register("agate_gem_8", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> MAGENTA_AGATE_GEM = ITEMS.register("agate_gem_9", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PINK_AGATE_GEM = ITEMS.register("agate_gem_10", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BROWN_AGATE_GEM = ITEMS.register("agate_gem_11", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BLACK_AGATE_GEM = ITEMS.register("agate_gem_12", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> GRAY_AGATE_GEM = ITEMS.register("agate_gem_13", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIGHT_GRAY_AGATE_GEM = ITEMS.register("agate_gem_14", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> WHITE_AGATE_GEM = ITEMS.register("agate_gem_15", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> SPECIAL_AGATE_GEM = ITEMS.register("agate_gem_16", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));

    public static final RegistryObject<Item> RED_PEARL_GEM = ITEMS.register("pearl_gem_0", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> ORANGE_PEARL_GEM = ITEMS.register("pearl_gem_1", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> YELLOW_PEARL_GEM = ITEMS.register("pearl_gem_2", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIME_PEARL_GEM = ITEMS.register("pearl_gem_3", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> GREEN_PEARL_GEM = ITEMS.register("pearl_gem_4", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> CYAN_PEARL_GEM = ITEMS.register("pearl_gem_5", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIGHT_BLUE_PEARL_GEM = ITEMS.register("pearl_gem_6", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BLUE_PEARL_GEM = ITEMS.register("pearl_gem_7", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PURPLE_PEARL_GEM = ITEMS.register("pearl_gem_8", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> MAGENTA_PEARL_GEM = ITEMS.register("pearl_gem_9", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PINK_PEARL_GEM = ITEMS.register("pearl_gem_10", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BROWN_PEARL_GEM = ITEMS.register("pearl_gem_11", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BLACK_PEARL_GEM = ITEMS.register("pearl_gem_12", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> GRAY_PEARL_GEM = ITEMS.register("pearl_gem_13", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIGHT_GRAY_PEARL_GEM = ITEMS.register("pearl_gem_14", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> WHITE_PEARL_GEM = ITEMS.register("pearl_gem_15", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));

    public static final RegistryObject<Item> RED_SPINEL_GEM = ITEMS.register("spinel_gem_0", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> ORANGE_SPINEL_GEM = ITEMS.register("spinel_gem_1", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> YELLOW_SPINEL_GEM = ITEMS.register("spinel_gem_2", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIME_SPINEL_GEM = ITEMS.register("spinel_gem_3", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> GREEN_SPINEL_GEM = ITEMS.register("spinel_gem_4", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> CYAN_SPINEL_GEM = ITEMS.register("spinel_gem_5", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIGHT_BLUE_SPINEL_GEM = ITEMS.register("spinel_gem_6", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BLUE_SPINEL_GEM = ITEMS.register("spinel_gem_7", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PURPLE_SPINEL_GEM = ITEMS.register("spinel_gem_8", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> MAGENTA_SPINEL_GEM = ITEMS.register("spinel_gem_9", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PINK_SPINEL_GEM = ITEMS.register("spinel_gem_10", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BROWN_SPINEL_GEM = ITEMS.register("spinel_gem_11", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BLACK_SPINEL_GEM = ITEMS.register("spinel_gem_12", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> GRAY_SPINEL_GEM = ITEMS.register("spinel_gem_13", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIGHT_GRAY_SPINEL_GEM = ITEMS.register("spinel_gem_14", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> WHITE_SPINEL_GEM = ITEMS.register("spinel_gem_15", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));

    public static final RegistryObject<Item> RED_TOURMALINE_GEM = ITEMS.register("tourmaline_gem_0", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> ORANGE_TOURMALINE_GEM = ITEMS.register("tourmaline_gem_1", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> YELLOW_TOURMALINE_GEM = ITEMS.register("tourmaline_gem_2", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIME_TOURMALINE_GEM = ITEMS.register("tourmaline_gem_3", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> GREEN_TOURMALINE_GEM = ITEMS.register("tourmaline_gem_4", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> CYAN_TOURMALINE_GEM = ITEMS.register("tourmaline_gem_5", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIGHT_BLUE_TOURMALINE_GEM = ITEMS.register("tourmaline_gem_6", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BLUE_TOURMALINE_GEM = ITEMS.register("tourmaline_gem_7", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PURPLE_TOURMALINE_GEM = ITEMS.register("tourmaline_gem_8", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> MAGENTA_TOURMALINE_GEM = ITEMS.register("tourmaline_gem_9", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PINK_TOURMALINE_GEM = ITEMS.register("tourmaline_gem_10", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BROWN_TOURMALINE_GEM = ITEMS.register("tourmaline_gem_11", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BLACK_TOURMALINE_GEM = ITEMS.register("tourmaline_gem_12", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> GRAY_TOURMALINE_GEM = ITEMS.register("tourmaline_gem_13", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIGHT_GRAY_TOURMALINE_GEM = ITEMS.register("tourmaline_gem_14", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> WHITE_TOURMALINE_GEM = ITEMS.register("tourmaline_gem_15", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> SPECIAL_TOURMALINE_GEM = ITEMS.register("tourmaline_gem_16", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));

    public static final RegistryObject<Item> RED_ZIRCON_GEM = ITEMS.register("zircon_gem_0", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> ORANGE_ZIRCON_GEM = ITEMS.register("zircon_gem_1", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> YELLOW_ZIRCON_GEM = ITEMS.register("zircon_gem_2", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIME_ZIRCON_GEM = ITEMS.register("zircon_gem_3", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> GREEN_ZIRCON_GEM = ITEMS.register("zircon_gem_4", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> CYAN_ZIRCON_GEM = ITEMS.register("zircon_gem_5", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIGHT_BLUE_ZIRCON_GEM = ITEMS.register("zircon_gem_6", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BLUE_ZIRCON_GEM = ITEMS.register("zircon_gem_7", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PURPLE_ZIRCON_GEM = ITEMS.register("zircon_gem_8", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> MAGENTA_ZIRCON_GEM = ITEMS.register("zircon_gem_9", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PINK_ZIRCON_GEM = ITEMS.register("zircon_gem_10", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BROWN_ZIRCON_GEM = ITEMS.register("zircon_gem_11", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BLACK_ZIRCON_GEM = ITEMS.register("zircon_gem_12", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> GRAY_ZIRCON_GEM = ITEMS.register("zircon_gem_13", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LIGHT_GRAY_ZIRCON_GEM = ITEMS.register("zircon_gem_14", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> WHITE_ZIRCON_GEM = ITEMS.register("zircon_gem_15", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));

    public static final RegistryObject<Item> AQUAMARINE_GEM = ITEMS.register("aquamarine_gem", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BISMUTH_GEM = ITEMS.register("bismuth_gem", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BIXBITE_GEM = ITEMS.register("bixbite_gem", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> DEMANTOID_GEM = ITEMS.register("demantoid_gem", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> EMERALD_GEM = ITEMS.register("emerald_gem", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> HESSONITE_GEM = ITEMS.register("hessonite_gem", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LAPIS_LAZULI_GEM = ITEMS.register("lapis_lazuli_gem", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> LARIMAR_GEM = ITEMS.register("larimar_gem", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> MORGANITE_GEM = ITEMS.register("morganite_gem", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> MICA_GEM = ITEMS.register("mica_gem", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> NEPHRITE_GEM = ITEMS.register("nephrite_gem", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> OBSIDIAN_GEM = ITEMS.register("obsidian_gem", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PEBBLE_GEM = ITEMS.register("pebble_gem", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PERIDOT_GEM = ITEMS.register("peridot_gem", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PYROPE_GEM = ITEMS.register("pyrope_gem", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> RUTILE_GEM = ITEMS.register("rutile_gem", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> SHALE_GEM = ITEMS.register("shale_gem", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BLUE_RUBY_GEM = ITEMS.register("ruby_gem_1", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> RED_SAPPHIRE_GEM = ITEMS.register("sapphire_gem_14", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));

    public static final RegistryObject<Item> ORANGE_SPODUMENE_GEM = ITEMS.register("spodumene_gem_0", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> YELLOW_SPODUMENE_GEM = ITEMS.register("spodumene_gem_1", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> GREEN_SPODUMENE_GEM = ITEMS.register("spodumene_gem_2", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BLUE_SPODUMENE_GEM = ITEMS.register("spodumene_gem_3", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PURPLE_SPODUMENE_GEM = ITEMS.register("spodumene_gem_4", () ->
            new Item(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));

    public static final RegistryObject<Item> YELLOW_TOPAZ_GEM = ITEMS.register("topaz_gem_0", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> BLUE_TOPAZ_GEM = ITEMS.register("topaz_gem_1", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> PINK_TOPAZ_GEM = ITEMS.register("topaz_gem_2", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
    public static final RegistryObject<Item> WHITE_TOPAZ_GEM = ITEMS.register("topaz_gem_3", () ->
            new ItemGem(new Item.Properties().group(ModItemGroup.GEMSTONES).maxStackSize(1).isImmuneToFire()));
}
