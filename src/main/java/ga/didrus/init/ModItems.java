package ga.didrus.init;

import ga.didrus.morearrows.MoreArrows;
import ga.didrus.morearrows.item.ItemExplosiveArrow;
import ga.didrus.morearrows.item.ItemExtrabow;
import ga.didrus.morearrows.item.ItemTpArrow;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(MoreArrows.modId)
public class ModItems {

	public static final ItemExplosiveArrow EXPLOSIVE_ARROW = null;
	public static final ItemTpArrow TP_ARROW = new ItemTpArrow();
	public static final ItemExtrabow EXTRA_BOW = null;

}