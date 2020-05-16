package net.mcreator.laundrysmiscmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.Blocks;

import net.mcreator.laundrysmiscmod.block.BlockCursedSaplingBlock;
import net.mcreator.laundrysmiscmod.LaundrysMiscModElements;

@LaundrysMiscModElements.ModElement.Tag
public class ItemCursedSaplingRightClickedOnBlockProcedure extends LaundrysMiscModElements.ModElement {
	public ItemCursedSaplingRightClickedOnBlockProcedure(LaundrysMiscModElements instance) {
		super(instance, 114);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ItemCursedSaplingRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ItemCursedSaplingRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ItemCursedSaplingRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ItemCursedSaplingRightClickedOnBlock!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState().getBlock())
				|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.DIRT.getDefaultState().getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.COARSE_DIRT.getDefaultState()
								.getBlock())))) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockCursedSaplingBlock.block.getDefaultState(), 3);
			world.playSound((PlayerEntity) null, x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.gravel.break")),
					SoundCategory.NEUTRAL, (float) 1, (float) 0.8);
		}
	}
}
