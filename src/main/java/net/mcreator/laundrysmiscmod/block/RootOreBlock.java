
package net.mcreator.laundrysmiscmod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.laundrysmiscmod.itemgroup.TabLaundryBlocksItemGroup;
import net.mcreator.laundrysmiscmod.item.RootIngotItem;
import net.mcreator.laundrysmiscmod.LaundrysMiscModElements;

import java.util.Random;
import java.util.List;
import java.util.Collections;

@LaundrysMiscModElements.ModElement.Tag
public class RootOreBlock extends LaundrysMiscModElements.ModElement {
	@ObjectHolder("laundrysmiscmod:rootore")
	public static final Block block = null;
	public RootOreBlock(LaundrysMiscModElements instance) {
		super(instance, 76);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(TabLaundryBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(1f, 4.182558210365094f).lightValue(0)
					.harvestLevel(0).harvestTool(ToolType.AXE));
			setRegistryName("rootore");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(RootIngotItem.block, (int) (1)));
		}
	}
	@Override
	public void init(FMLCommonSetupEvent event) {
		for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(new OreFeature(OreFeatureConfig::deserialize) {
				@Override
				public boolean place(IWorld world, ChunkGenerator generator, Random rand, BlockPos pos, OreFeatureConfig config) {
					DimensionType dimensionType = world.getDimension().getType();
					boolean dimensionCriteria = false;
					if (dimensionType == DimensionType.OVERWORLD)
						dimensionCriteria = true;
					if (!dimensionCriteria)
						return false;
					return super.place(world, generator, rand, pos, config);
				}
			}, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("rootore", "rootore", blockAt -> {
				boolean blockCriteria = false;
				if (blockAt.getBlock() == Blocks.OAK_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.OAK_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.SPRUCE_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.BIRCH_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.JUNGLE_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.ACACIA_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.ACACIA_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.DARK_OAK_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.OAK_WOOD.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.SPRUCE_WOOD.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.BIRCH_WOOD.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.JUNGLE_WOOD.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.ACACIA_WOOD.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.DARK_OAK_WOOD.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.DIRT.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.STRIPPED_OAK_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.STRIPPED_SPRUCE_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.STRIPPED_BIRCH_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.STRIPPED_JUNGLE_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.STRIPPED_ACACIA_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.STRIPPED_DARK_OAK_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.GRASS_BLOCK.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.GRASS_PATH.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.MYCELIUM.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.DIRT.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.COARSE_DIRT.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.PODZOL.getDefaultState().getBlock())
					blockCriteria = true;
				return blockCriteria;
			}), block.getDefaultState(), 8), Placement.COUNT_RANGE, new CountRangeConfig(20, 1, 1, 100)));
		}
	}
}
