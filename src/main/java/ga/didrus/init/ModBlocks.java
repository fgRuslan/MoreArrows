package ga.didrus.init;

import ga.didrus.morearrows.MoreArrows;
import ga.didrus.morearrows.block.BlockBasic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=MoreArrows.modId)
public class ModBlocks {

	public static Block tutorialBlock;
	
	public static void init() {
		  tutorialBlock = new BlockBasic("block_yungrussia", Material.ROCK);
		}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		
	}
	
	public static void registerRender(Item item) {
		
	}
}