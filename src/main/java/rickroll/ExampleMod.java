package rickroll;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import rickroll.items.Bow;
import rickroll.register.ItemRegister;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class ExampleMod implements ModInitializer {

	// an instance of our new item


	public static final Logger LOGGER = LoggerFactory.getLogger("rickroll");

	public static final ItemGroup OTHER_GROUP = FabricItemGroupBuilder.create(
					new Identifier("rickroll", "rickroll"))
			.icon(() -> new ItemStack(Items.BOWL))
			.build();

	public static final CustomItem CUSTOM_ITEM = new CustomItem(new FabricItemSettings().group(OTHER_GROUP));

	public static final Bow BOW = new Bow(new FabricItemSettings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {

		ItemRegister.registerItems();

		LOGGER.info("Hello Fabric world!");


	}


}
