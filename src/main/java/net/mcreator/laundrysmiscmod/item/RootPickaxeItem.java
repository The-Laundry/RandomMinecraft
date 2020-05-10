
package net.mcreator.laundrysmiscmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.laundrysmiscmod.itemgroup.TheLaundryToolsItemGroup;
import net.mcreator.laundrysmiscmod.LaundrysMiscModElements;

@LaundrysMiscModElements.ModElement.Tag
public class RootPickaxeItem extends LaundrysMiscModElements.ModElement {
	@ObjectHolder("laundrysmiscmod:rootpickaxe")
	public static final Item block = null;
	public RootPickaxeItem(LaundrysMiscModElements instance) {
		super(instance, 82);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 30;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 11;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(TheLaundryToolsItemGroup.tab)) {
		}.setRegistryName("rootpickaxe"));
	}
}
