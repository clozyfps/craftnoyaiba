package net.mcreator.craftnoyaiba.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FlamingThunderGodOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double player_yaw = 0;
		double entity_yaw = 0;
		double rotation_step = 0;
		double difference = 0;
		double max_rotation_step = 0;
		double rotation_direction = 0;
		double rotation_speed = 0;
		if (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
			{
				Entity _ent = entity;
				_ent.teleportTo(
						((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-0.2)
								+ Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-1) * 0.5),
						((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 1),
						((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-1) * (-0.2)
								- Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * 0.5));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-0.2)
									+ Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-1) * 0.5),
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 1),
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-1) * (-0.2)
									- Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * 0.5),
							_ent.getYRot(), _ent.getXRot());
			}
		}
		if (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
			rotation_speed = 36;
			player_yaw = (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot();
			entity_yaw = entity.getYRot();
			if (player_yaw != entity_yaw) {
				difference = player_yaw - entity_yaw;
				if (difference > 180) {
					difference = difference - 360;
				}
				if (difference < -180) {
					difference = difference + 360;
				}
				if (Math.abs(player_yaw) < 180) {
					if (Math.abs(difference) < rotation_speed) {
						rotation_step = 0;
					} else {
						if (difference > 0) {
							rotation_direction = 1;
						} else {
							rotation_direction = -1;
						}
						max_rotation_step = rotation_direction * Math.abs(rotation_speed);
						if (Math.abs(difference) <= max_rotation_step) {
							rotation_step = 0;
						} else {
							rotation_step = max_rotation_step;
						}
					}
				} else {
					rotation_step = 0;
				}
				entity_yaw = entity_yaw + rotation_step;
				if (entity_yaw > 180) {
					entity_yaw = entity_yaw - 360;
				}
				if (entity_yaw < -180) {
					entity_yaw = entity_yaw + 360;
				}
				{
					Entity _ent = entity;
					_ent.setYRot((float) entity_yaw);
					_ent.setXRot(entity.getXRot());
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftnoyaibaModParticleTypes.YELLOW_ELECTRICITY.get()), x, y, z, 10, 3, 3, 3, 0.1);
	}
}
