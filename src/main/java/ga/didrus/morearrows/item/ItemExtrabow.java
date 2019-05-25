package ga.didrus.morearrows.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class ItemExtrabow extends ItemBow {
	public ItemExtrabow() {
		setUnlocalizedName("extra_bow");
		setRegistryName("extra_bow");
		setCreativeTab(CreativeTabs.COMBAT);
		setMaxDamage(1000);
		setMaxStackSize(1);
	}
	@Override
	protected boolean isArrow(ItemStack stack) {
		if(stack.getItem() instanceof ItemTpArrow)
			return true;
		if(stack.getItem() instanceof ItemExplosiveArrow)
			return true;
		return false;
	}

}
