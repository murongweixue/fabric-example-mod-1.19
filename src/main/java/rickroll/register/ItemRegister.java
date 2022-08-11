package rickroll.register;


import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import rickroll.ExampleMod;

public class ItemRegister {
        public static final String MOD_ID = "rickroll";
        public static void registerItems() {

            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iyu"), ExampleMod.CUSTOM_ITEM);

            Registry.register(Registry.ITEM, new Identifier(MOD_ID,"boooow"),ExampleMod.BOW);

        }
}

