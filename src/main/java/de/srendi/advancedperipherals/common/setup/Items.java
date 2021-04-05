package de.srendi.advancedperipherals.common.setup;

import de.srendi.advancedperipherals.common.items.ChunkControllerItem;
import de.srendi.advancedperipherals.common.items.ComputerToolItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class Items {

    public static final RegistryObject<Item> CHUNK_CONTROLLER = Registration.ITEMS.register("chunk_controller", ChunkControllerItem::new);
    public static final RegistryObject<Item> COMPUTER_TOOL = Registration.ITEMS.register("computer_tool", ComputerToolItem::new);

    public static void register() {}


}
