package ga.didrus.init;

import ga.didrus.morearrows.MoreArrows;
import ga.didrus.morearrows.entity.EntityExplosiveArrow;
import ga.didrus.morearrows.entity.EntityTeleportArrow;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
	
	public static void RegisterEntities() {
		registerArrow("explosive_arrow", EntityExplosiveArrow.class, 251);
		registerArrow("teleport_arrow", EntityTeleportArrow.class, 252);
	}
	
	private static void registerArrow(String name, Class<? extends Entity> entity, int id) {
		EntityRegistry.registerModEntity(new ResourceLocation(MoreArrows.modId + ":" + name), entity, name, id, MoreArrows.instance, 64, 20, true);
	}

}
