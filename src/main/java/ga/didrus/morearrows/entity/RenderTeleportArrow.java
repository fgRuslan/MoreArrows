package ga.didrus.morearrows.entity;

import ga.didrus.morearrows.MoreArrows;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTeleportArrow extends RenderArrow<EntityTeleportArrow> {

	public RenderTeleportArrow(RenderManager manager) {
		super(manager);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityTeleportArrow entity) {
		return new ResourceLocation(MoreArrows.modId + ":textures/entity/arrows/teleport_arrow.png");
	}

}
