package ga.didrus.morearrows.item;

import ga.didrus.morearrows.entity.EntityExplosiveArrow;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemExplosiveArrow extends ItemArrow {
	
	public ItemExplosiveArrow() {
		setUnlocalizedName("explosive_arrow");
		setRegistryName("explosive_arrow");
		setCreativeTab(CreativeTabs.COMBAT);
		setMaxDamage(1000);
		setMaxStackSize(64);
	}
	@Override
	public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter) {
		EntityExplosiveArrow entityarrow = new EntityExplosiveArrow(worldIn, shooter);
		return entityarrow;
		
	}
}
