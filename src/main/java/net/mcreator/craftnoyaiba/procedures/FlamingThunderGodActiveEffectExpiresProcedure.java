package net.mcreator.craftnoyaiba.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FlamingThunderGodActiveEffectExpiresProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getEntitiesOfClass(FlamingThunderGodEntity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()) {
			if (((Entity) world.getEntitiesOfClass(FlamingThunderGodEntity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
				if (!world.getEntitiesOfClass(FlamingThunderGodEntity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()) {
					if (!((Entity) world.getEntitiesOfClass(FlamingThunderGodEntity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide())
						((Entity) world.getEntitiesOfClass(FlamingThunderGodEntity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
				}
			}
		}
	}
}
