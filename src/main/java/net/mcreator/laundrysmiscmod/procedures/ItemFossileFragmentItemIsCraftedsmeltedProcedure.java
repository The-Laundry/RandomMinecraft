package net.mcreator.laundrysmiscmod.procedures;

@LaundrysMiscModElements.ModElement.Tag
public class ItemFossileFragmentItemIsCraftedsmeltedProcedure extends LaundrysMiscModElements.ModElement {

	public ItemFossileFragmentItemIsCraftedsmeltedProcedure(LaundrysMiscModElements instance) {
		super(instance, 28);

	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ItemFossileFragmentItemIsCraftedsmelted!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).giveExperiencePoints((int) 5);

	}

}
