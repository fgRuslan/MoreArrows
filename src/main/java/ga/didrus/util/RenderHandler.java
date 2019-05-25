package ga.didrus.util;

import ga.didrus.morearrows.entity.EntityExplosiveArrow;
import ga.didrus.morearrows.entity.EntityTpArrow;
import ga.didrus.morearrows.entity.RenderExplosiveArrow;
import ga.didrus.morearrows.entity.RenderTeleportArrow;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	
	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityExplosiveArrow.class, new IRenderFactory<EntityExplosiveArrow>() {
			@Override
			public Render<? super EntityExplosiveArrow> createRenderFor(RenderManager manager) {
				return new RenderExplosiveArrow(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityTpArrow.class, new IRenderFactory<EntityTpArrow>() {
			@Override
			public Render<? super EntityTpArrow> createRenderFor(RenderManager manager) {
				return new RenderTeleportArrow(manager);
			}
		});
	}

}
