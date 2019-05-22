package ga.didrus.morearrows.entity;

import ga.didrus.morearrows.MoreArrows;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderExplosiveArrow extends RenderArrow<EntityExplosiveArrow> {

	public RenderExplosiveArrow(RenderManager manager) {
		super(manager);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityExplosiveArrow entity) {
		return new ResourceLocation(MoreArrows.modId + ":textures/entity/arrows/explosive_arrow.png");
	}

}
