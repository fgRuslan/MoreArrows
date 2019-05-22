package ga.didrus.morearrows;

import ga.didrus.morearrows.item.ItemExplosiveArrow;
import ga.didrus.morearrows.item.ItemExtrabow;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = MoreArrows.modId)
public final class EventSubscriber {

	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				new ItemExplosiveArrow(),
				new ItemExtrabow(),
		};

		event.getRegistry().registerAll(items);
	}

}