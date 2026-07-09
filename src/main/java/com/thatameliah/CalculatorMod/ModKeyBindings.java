package com.thatameliah.calculatormod;

import org.lwjgl.glfw.GLFW;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;

public class ModKeyBindings {
    public static final KeyMapping OPEN_CALCULATOR = new KeyMapping(
            "key.thatameliahcalculator.open_calculator",
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_KP_ENTER,
            "key.categories.thatameliahcalculator"
    );
}
