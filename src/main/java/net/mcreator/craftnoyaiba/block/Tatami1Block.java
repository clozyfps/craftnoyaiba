
package net.mcreator.craftnoyaiba.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class Tatami1Block extends Block {
	public Tatami1Block() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.WOOL).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}