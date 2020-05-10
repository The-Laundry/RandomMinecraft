package net.mcreator.laundrysmiscmod.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.laundrysmiscmod.LaundrysMiscModElements;

@LaundrysMiscModElements.ModElement.Tag
public class DryRangerRangedItemUsedProcedure extends LaundrysMiscModElements.ModElement {
	public DryRangerRangedItemUsedProcedure(LaundrysMiscModElements instance) {
		super(instance, 99);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DryRangerRangedItemUsed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 5);
	}
}
