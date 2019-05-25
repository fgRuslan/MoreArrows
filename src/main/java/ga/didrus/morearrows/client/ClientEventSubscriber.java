package ga.didrus.morearrows.client;

import ga.didrus.init.ModItems;
import ga.didrus.morearrows.MoreArrows;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(modid = MoreArrows.modId, value = Side.CLIENT)
public final class ClientEventSubscriber {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(ModItems.EXPLOSIVE_ARROW);
        registerModel(ModItems.TP_ARROW);
        registerModel(ModItems.EXTRA_BOW);
    }

    private static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}