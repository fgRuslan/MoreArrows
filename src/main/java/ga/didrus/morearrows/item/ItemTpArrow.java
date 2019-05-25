package ga.didrus.morearrows.item;

import ga.didrus.morearrows.entity.EntityTpArrow;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTpArrow extends ItemArrow {
	
	public ItemTpArrow() {
		setUnlocalizedName("teleport_arrow");
		setRegistryName("teleport_arrow");
		setCreativeTab(CreativeTabs.COMBAT);
		setMaxDamage(1000);
		setMaxStackSize(64);
	}
	@Override
	public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter) {
		EntityTpArrow entityarrow = new EntityTpArrow(worldIn, shooter);
		return entityarrow;
		
	}
}
