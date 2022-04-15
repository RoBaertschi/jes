package ch.fantasticgame28.jes.item;

import ch.fantasticgame28.jes.Jes;
import ch.fantasticgame28.jes.item.custom.RedstoneSword;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Jes.MOD_ID);

    public static final RegistryObject<Item> REDSTONE_SWORD =
            ITEMS.register("redstone_sword",
                    () -> new RedstoneSword(ModTiers.REDSTONE, 3, 2.0f,
                            new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
