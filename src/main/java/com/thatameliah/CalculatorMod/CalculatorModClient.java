package com.thatameliah.calculatormod;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;

@Mod(value = CalculatorMod.MOD_ID, dist = Dist.CLIENT)

@EventBusSubscriber(modid = CalculatorMod.MOD_ID, value = Dist.CLIENT)
public class CalculatorModClient {
    public CalculatorModClient(ModContainer container) {

    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {

    }

    @SubscribeEvent
    public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
        event.register(ModKeyBindings.OPEN_CALCULATOR);
    }
}
