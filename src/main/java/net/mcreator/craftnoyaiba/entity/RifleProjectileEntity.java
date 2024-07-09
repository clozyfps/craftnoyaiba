
package net.mcreator.craftnoyaiba.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

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

import net.mcreator.craftnoyaiba.procedures.RifleProjectileWhileProjectileFlyingTickProcedure;
import net.mcreator.craftnoyaiba.init.CraftnoyaibaModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class RifleProjectileEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(Blocks.AIR);

	public RifleProjectileEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(CraftnoyaibaModEntities.RIFLE_PROJECTILE.get(), world);
	}

	public RifleProjectileEntity(EntityType<? extends RifleProjectileEntity> type, Level world) {
		super(type, world);
	}

	public RifleProjectileEntity(EntityType<? extends RifleProjectileEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public RifleProjectileEntity(EntityType<? extends RifleProjectileEntity> type, LivingEntity entity, Level world) {
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
	public void tick() {
		super.tick();
		RifleProjectileWhileProjectileFlyingTickProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
		if (this.inGround)
			this.discard();
	}

	public static RifleProjectileEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 3f, 10, 1);
	}

	public static RifleProjectileEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		RifleProjectileEntity entityarrow = new RifleProjectileEntity(CraftnoyaibaModEntities.RIFLE_PROJECTILE.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static RifleProjectileEntity shoot(LivingEntity entity, LivingEntity target) {
		RifleProjectileEntity entityarrow = new RifleProjectileEntity(CraftnoyaibaModEntities.RIFLE_PROJECTILE.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 3f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(10);
		entityarrow.setKnockback(1);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		return entityarrow;
	}
}
