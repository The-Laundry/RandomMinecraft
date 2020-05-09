package net.mcreator.laundrysmiscmod.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;

import net.mcreator.laundrysmiscmod.LaundrysMiscModElements;

import java.util.Random;

@LaundrysMiscModElements.ModElement.Tag
public class ItemFossileFragmentRightClickedOnBlockProcedure extends LaundrysMiscModElements.ModElement {
	public ItemFossileFragmentRightClickedOnBlockProcedure(LaundrysMiscModElements instance) {
		super(instance, 27);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ItemFossileFragmentRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ItemFossileFragmentRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ItemFossileFragmentRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure ItemFossileFragmentRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ItemFossileFragmentRightClickedOnBlock!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
				.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) < 4)) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			if (itemstack.attemptDamageItem((int) 10000, new Random(), null)) {
				itemstack.shrink(1);
				itemstack.setDamage(0);
			}
		}
	}
}
