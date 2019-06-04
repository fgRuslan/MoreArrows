package ga.didrus.morearrows.entity;

import ga.didrus.init.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityExplosiveArrow extends EntityArrow {

	public EntityExplosiveArrow(World worldIn) {
		super(worldIn);
	}

	public EntityExplosiveArrow(World worldIn, double x, double y, double z) {
		super(worldIn,x,y,z);
	}

	public EntityExplosiveArrow(World worldIn, EntityLivingBase shooter) {
		super(worldIn,shooter);
	}

	@Override
	protected ItemStack getArrowStack() {
		return new ItemStack(ModItems.EXPLOSIVE_ARROW);
	}

	@Override
	protected void arrowHit(EntityLivingBase living) {
		super.arrowHit(living);
		this.world.createExplosion((Entity)null, living.posX, living.posY, living.posZ, 5.0f, true);
		this.setDead();
	}
	@Override
	public void onUpdate() {
		super.onUpdate();
		if(this.inGround) {
			this.world.createExplosion((Entity)null, this.posX, this.posY, this.posZ, 5.0f, true);
			this.setDead();
		}
	}
}
