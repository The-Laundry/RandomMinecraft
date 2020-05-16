package net.mcreator.laundrysmiscmod.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;

import net.mcreator.laundrysmiscmod.LaundrysMiscModElements;

@LaundrysMiscModElements.ModElement.Tag
public class BlockCursedSaplingUpdateTickProcedure extends LaundrysMiscModElements.ModElement {
	public BlockCursedSaplingUpdateTickProcedure(LaundrysMiscModElements instance) {
		super(instance, 116);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BlockCursedSaplingUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BlockCursedSaplingUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BlockCursedSaplingUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BlockCursedSaplingUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((Math.random() == 0.01) && (world.canBlockSeeSky(new BlockPos((int) x, (int) y, (int) z))))) {
			if (!world.isRemote) {
				Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("laundrysmiscmod", "cursed_tree_1"));
				if (template != null) {
					template.addBlocksToWorldChunk(world, new BlockPos((int) (x - 2), (int) y, (int) (z - 2)), new PlacementSettings()
							.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk((ChunkPos) null).setIgnoreEntities(false));
				}
			}
		}
	}
}
