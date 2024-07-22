
package net.mcreator.craftnoyaiba.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class WisteriaBlock extends Block {
	public WisteriaBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.VINE).strength(1f).lightLevel(s -> 15).noOcclusion().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)
				.isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}
}