
package net.mcreator.craftnoyaiba.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class DemonSpawnPointBlock extends Block {
	public DemonSpawnPointBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.EMPTY).strength(25f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		DemonSpawnPointUpdateTickProcedure.execute(world, x, y, z);
		world.scheduleTick(pos, this, 1);
	}
}