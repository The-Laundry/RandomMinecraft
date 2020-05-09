package net.mcreator.laundrysmiscmod.procedures;

@LaundrysMiscModElements.ModElement.Tag
public class ItemFossileFragmentEntityWalksOnTheBlockProcedure extends LaundrysMiscModElements.ModElement {

	public ItemFossileFragmentEntityWalksOnTheBlockProcedure(LaundrysMiscModElements instance) {
		super(instance, 29);

	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ItemFossileFragmentEntityWalksOnTheBlock!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 5, (int) 1));

	}

}
