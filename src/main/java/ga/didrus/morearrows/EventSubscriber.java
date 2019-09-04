package ga.didrus.morearrows;

import ga.didrus.morearrows.item.ItemExplosiveArrow;
import ga.didrus.morearrows.item.ItemExtrabow;
import ga.didrus.morearrows.item.ItemTeleportArrow;
import ga.didrus.init.*;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = MoreArrows.modId)
public final class EventSubscriber {

	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				new ItemExplosiveArrow(),
				new ItemTeleportArrow(),
				new ItemExtrabow(),
		};

		event.getRegistry().registerAll(items);
	}
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
	  event.getRegistry().registerAll(ModBlocks.tutorialBlock);
	}
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
	  event.getRegistry().registerAll(new ItemBlock(ModBlocks.tutorialBlock).setRegistryName(ModBlocks.tutorialBlock.getRegistryName()));
	}
	public static void registerRender(Item item) {
		  ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
	  registerRender(Item.getItemFromBlock(ModBlocks.tutorialBlock));
	}
}