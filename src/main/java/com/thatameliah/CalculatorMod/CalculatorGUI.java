package com.thatameliah.calculatormod;

import com.ezylang.evalex.data.EvaluationValue;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

// Components
import net.minecraft.client.gui.components.EditBox;

public class CalculatorGUI extends Screen {
    private EditBox inputBox;
    private EditBox outputBox;

    public CalculatorGUI() {
        super(Component.translatable("screen.thatameliahcalculator.title"));
    }

    @Override
    protected void init() {
        inputBox = new EditBox(
                this.font,
                width / 2 - 100,
                height / 2 - 100,
                200,
                20,
                Component.translatable("screen.thatameliahcalculator.input")
        );

        inputBox.setMaxLength(256);
        inputBox.setValue("");
        inputBox.setResponder(this::onInputChange);

        outputBox = new EditBox(
                this.font,
                width / 2 - 100,
                height / 2 - 70,
                200,
                20,
                Component.translatable("screen.thatameliahcalculator.output")
        );

        outputBox.setEditable(false);
        outputBox.setValue("");

        addRenderableWidget(inputBox);
        addRenderableWidget(outputBox);

        setInitialFocus(inputBox);
    }

    @Override
    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
        renderBackground(graphics, mouseX, mouseY, partialTick);
        super.render(graphics, mouseX, mouseY, partialTick);
    }

    @Override
    public boolean isPauseScreen() { return false; }

    private void onInputChange(String text) {
        EvaluationValue value = Calculator.Evaluate(text);

        if (value == null) { outputBox.setValue("NaN"); }
        else { outputBox.setValue(value.getStringValue()); }
    }
}
