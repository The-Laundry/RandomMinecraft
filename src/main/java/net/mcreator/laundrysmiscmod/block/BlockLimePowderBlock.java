
package net.mcreator.laundrysmiscmod.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.laundrysmiscmod.itemgroup.TabLaundryBlocksItemGroup;
import net.mcreator.laundrysmiscmod.LaundrysMiscModElements;

import java.util.List;
import java.util.Collections;

@LaundrysMiscModElements.ModElement.Tag
public class BlockLimePowderBlock extends LaundrysMiscModElements.ModElement {
	@ObjectHolder("laundrysmiscmod:blocklimepowder")
	public static final Block block = null;
	public BlockLimePowderBlock(LaundrysMiscModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(TabLaundryBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends FallingBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.SAND).sound(SoundType.SAND).hardnessAndResistance(0.5f, 0.5f).lightValue(0));
			setRegistryName("blocklimepowder");
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
