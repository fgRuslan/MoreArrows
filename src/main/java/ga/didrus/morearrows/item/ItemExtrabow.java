package ga.didrus.morearrows.item;

import ga.didrus.init.ModItems;
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
		if(stack.getItem() == ModItems.EXPLOSIVE_ARROW)
			return true;
		return false;
	}

}
