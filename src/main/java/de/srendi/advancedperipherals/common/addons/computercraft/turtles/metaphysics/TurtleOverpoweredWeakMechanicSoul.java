package de.srendi.advancedperipherals.common.addons.computercraft.turtles.metaphysics;

import de.srendi.advancedperipherals.common.addons.computercraft.base.ModelTransformingTurtle;
import de.srendi.advancedperipherals.common.addons.computercraft.peripheral.metaphysics.OverpoweredWeakMechanicSoulPeripheral;
import de.srendi.advancedperipherals.common.setup.Items;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.item.ItemStack;

public class TurtleOverpoweredWeakMechanicSoul extends ModelTransformingTurtle<OverpoweredWeakMechanicSoulPeripheral> {
    public TurtleOverpoweredWeakMechanicSoul() {
        super("overpowered_weak_mechanic_soul_turtle", "turtle.advancedperipherals.overpowered_weak_mechanic_soul", new ItemStack(Items.OVERPOWERED_WEAK_MECHANIC_SOUL.get()));
    }

    @Override
    protected OverpoweredWeakMechanicSoulPeripheral createPeripheral() {
        return new OverpoweredWeakMechanicSoulPeripheral("overpoweredWeakMechanicSoul", null);
    }

    @Override
    protected ModelResourceLocation getLeftModel() {
        return null;
    }

    @Override
    protected ModelResourceLocation getRightModel() {
        return null;
    }
}