
package net.mcreator.craftnoyaiba.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.craftnoyaiba.procedures.TCAFProjectileWhileProjectileFlyingTickProcedure;
import net.mcreator.craftnoyaiba.procedures.TCAFProjectileProjectileHitsLivingEntityProcedure;
import net.mcreator.craftnoyaiba.init.CraftnoyaibaModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class TCAFProjectileEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(Blocks.AIR);

	public TCAFProjectileEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(CraftnoyaibaModEntities.TCAF_PROJECTILE.get(), world);
	}

	public TCAFProjectileEntity(EntityType<? extends TCAFProjectileEntity> type, Level world) {
		super(type, world);
	}

	public TCAFProjectileEntity(EntityType<? extends TCAFProjectileEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public TCAFProjectileEntity(EntityType<? extends TCAFProjectileEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getPickupItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		TCAFProjectileProjectileHitsLivingEntityProcedure.execute(this.getX(), this.getY(), this.getZ(), this.getOwner());
	}

	@Override
	public void tick() {
		super.tick();
		TCAFProjectileWhileProjectileFlyingTickProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this.getOwner(), this);
		if (this.inGround)
			this.discard();
	}

	public static TCAFProjectileEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 2f, 0, 0);
	}

	public static TCAFProjectileEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		TCAFProjectileEntity entityarrow = new TCAFProjectileEntity(CraftnoyaibaModEntities.TCAF_PROJECTILE.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static TCAFProjectileEntity shoot(LivingEntity entity, LivingEntity target) {
		TCAFProjectileEntity entityarrow = new TCAFProjectileEntity(CraftnoyaibaModEntities.TCAF_PROJECTILE.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 2f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(0);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		return entityarrow;
	}
}
