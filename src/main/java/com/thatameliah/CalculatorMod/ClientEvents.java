package com.thatameliah.calculatormod;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;

@EventBusSubscriber(modid = CalculatorMod.MOD_ID, value = Dist.CLIENT)

public class ClientEvents {
    @SubscribeEvent
    public static void clientTick(ClientTickEvent.Post event) {
        while (ModKeyBindings.OPEN_CALCULATOR.consumeClick()) {
            Minecraft.getInstance().setScreen(new CalculatorGUI());
        }
    }
}
