package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;

import java.util.List;
import java.util.Comparator;

public class TestRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double castlerevolvenumber = 0;
		double randomlimb = 0;
		double xRadius = 0;
		double zRadius = 0;
		double degree = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double rotation_angle = 0;
		double rotation_angle_old = 0;
		randomlimb = Mth.nextInt(RandomSource.create(), 1, 4);
		{
			double _setval = 10;
			entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ActiveLimbTimer = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (randomlimb == 1) {
			{
				String _setval = "Right Arm";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ActiveLimbTarget = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (randomlimb == 2) {
			{
				String _setval = "Left Arm";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ActiveLimbTarget = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (randomlimb == 3) {
			{
				String _setval = "Left Leg";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ActiveLimbTarget = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (randomlimb == 4) {
			{
				String _setval = "Right Leg";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ActiveLimbTarget = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(9 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC), entity), 2);
				}
			}
		}
		if (entity.isShiftKeyDown()) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"execute as @p run function test_slice rotated 50");
		}
	}
}
