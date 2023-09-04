package net.goldfoxyt.moremilk.item;

import net.goldfoxyt.moremilk.MoreMilk;
import net.goldfoxyt.moremilk.item.custom.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreMilk.MOD_ID);

    public static final RegistryObject<Item> MILK_BOTTLE = ITEMS.register("milk_bottle",
            () -> new MilkBottleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MILK_CARTON = ITEMS.register("milk_carton",
            () -> new CartonMilkItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MILK_CARTON1 = ITEMS.register("milk_carton1",
            () -> new CartonMilkItem1(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MILK_CARTON2 = ITEMS.register("milk_carton2",
            () -> new CartonMilkItem2(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MILK_CARTON3 = ITEMS.register("milk_carton3",
            () -> new CartonMilkItem3(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MILK_CARTON4 = ITEMS.register("milk_carton4",
            () -> new CartonMilkItem4(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MILK_CARTON5 = ITEMS.register("milk_carton5",
            () -> new CartonMilkItem5(new Item.Properties().stacksTo(1)));


    public static final RegistryObject<Item> EMPTY_MILK_CARTON = ITEMS.register("empty_milk_carton",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
