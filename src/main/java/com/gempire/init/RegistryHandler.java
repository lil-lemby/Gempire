package com.gempire.init;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class RegistryHandler {

    public static void init() {
        // attach DeferredRegister to the event bus
        ModSounds.SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModFluids.FLUIDS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModFluids.FLUID_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModTE.TILE_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModContainers.CONTAINERS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModEntities.ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModFeatures.FEATURES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
