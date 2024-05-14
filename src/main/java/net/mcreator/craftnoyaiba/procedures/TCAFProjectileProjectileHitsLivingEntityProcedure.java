package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class TCAFProjectileProjectileHitsLivingEntityProcedure {
	public static void execute(double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		{
			Entity _ent = sourceentity;
			_ent.teleportTo(x, y, z);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
		}
	}
}
