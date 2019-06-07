package ga.didrus.morearrows.entity;

import ga.didrus.init.ModItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityTeleportArrow extends EntityArrow {

	private EntityLivingBase shooter1;
	
	public EntityTeleportArrow(World worldIn) {
		super(worldIn);
	}

	public EntityTeleportArrow(World worldIn, double x, double y, double z) {
		super(worldIn,x,y,z);
	}

	public EntityTeleportArrow(World worldIn, EntityLivingBase shooter) {
		super(worldIn,shooter);
		shooter1 = shooter;
	}

	@Override
	protected ItemStack getArrowStack() {
		return new ItemStack(ModItems.TP_ARROW);
	}

	@Override
	protected void arrowHit(EntityLivingBase living) {
		super.arrowHit(living);
		this.shooter1.attemptTeleport(this.posX, this.posY, this.posZ);
		this.setDead();
	}
	@Override
	public void onUpdate() {
		super.onUpdate();
		if(this.inGround) {
			this.shooter1.attemptTeleport(this.posX, this.posY, this.posZ);
			this.setDead();
		}
	}
}
