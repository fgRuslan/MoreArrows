package ga.didrus.util;

import ga.didrus.morearrows.entity.EntityExplosiveArrow;
import ga.didrus.morearrows.entity.EntityTeleportArrow;
import ga.didrus.morearrows.entity.RenderExplosiveArrow;
import ga.didrus.morearrows.entity.RenderTeleportArrow;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	
	public static void registerEntityRenders() {
		/**
		 * Render explosive arrow
		 */
		RenderingRegistry.registerEntityRenderingHandler(EntityExplosiveArrow.class, new IRenderFactory<EntityExplosiveArrow>() {
			@Override
			public Render<? super EntityExplosiveArrow> createRenderFor(RenderManager manager) {
				return new RenderExplosiveArrow(manager);
			}
		});
		/**
		 * Render teleport arrow
		 */
		RenderingRegistry.registerEntityRenderingHandler(EntityTeleportArrow.class, new IRenderFactory<EntityTeleportArrow>() {
			@Override
			public Render<? super EntityTeleportArrow> createRenderFor(RenderManager manager) {
				return new RenderTeleportArrow(manager);
			}
		});
	}

}
