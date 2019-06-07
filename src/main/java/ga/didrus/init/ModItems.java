package ga.didrus.init;

import ga.didrus.morearrows.MoreArrows;
import ga.didrus.morearrows.item.ItemExplosiveArrow;
import ga.didrus.morearrows.item.ItemExtrabow;
import ga.didrus.morearrows.item.ItemTeleportArrow;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(MoreArrows.modId)
public class ModItems {

	public static final ItemExplosiveArrow EXPLOSIVE_ARROW = new ItemExplosiveArrow();
	public static final ItemTeleportArrow TP_ARROW = new ItemTeleportArrow();
	public static final ItemExtrabow EXTRA_BOW = new ItemExtrabow();

}