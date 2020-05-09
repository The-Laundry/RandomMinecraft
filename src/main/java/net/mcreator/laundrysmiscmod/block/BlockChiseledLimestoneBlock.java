
package net.mcreator.laundrysmiscmod.block;

@LaundrysMiscModElements.ModElement.Tag
public class BlockChiseledLimestoneBlock extends LaundrysMiscModElements.ModElement {

	@ObjectHolder("laundrysmiscmod:blockchiseledlimestone")
	public static final Block block = null;

	public BlockChiseledLimestoneBlock(LaundrysMiscModElements instance) {
		super(instance, 27);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(TabLaundryBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.4f, 6f).lightValue(0));

			setRegistryName("blockchiseledlimestone");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
