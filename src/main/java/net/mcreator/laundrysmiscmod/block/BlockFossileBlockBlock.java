
package net.mcreator.laundrysmiscmod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.IWorldReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.laundrysmiscmod.itemgroup.TabLaundryBlocksItemGroup;
import net.mcreator.laundrysmiscmod.LaundrysMiscModElements;

import java.util.List;
import java.util.Collections;

@LaundrysMiscModElements.ModElement.Tag
public class BlockFossileBlockBlock extends LaundrysMiscModElements.ModElement {
	@ObjectHolder("laundrysmiscmod:blockfossileblock")
	public static final Block block = null;
	public BlockFossileBlockBlock(LaundrysMiscModElements instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(TabLaundryBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(2f, 20f).lightValue(0).harvestLevel(2)
					.harvestTool(ToolType.PICKAXE));
			setRegistryName("blockfossileblock");
		}

		@Override
		public boolean isBeaconBase(BlockState state, IWorldReader world, BlockPos pos, BlockPos beacon) {
			return true;
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
