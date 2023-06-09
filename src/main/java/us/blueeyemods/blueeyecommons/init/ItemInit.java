package us.blueeyemods.blueeyecommons.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import us.blueeyemods.blueeyecommons.Main;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
