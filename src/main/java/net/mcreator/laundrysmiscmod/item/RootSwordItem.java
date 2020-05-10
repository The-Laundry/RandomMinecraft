
package net.mcreator.laundrysmiscmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.laundrysmiscmod.itemgroup.TabTheLaundryArmourItemGroup;
import net.mcreator.laundrysmiscmod.LaundrysMiscModElements;

@LaundrysMiscModElements.ModElement.Tag
public class RootSwordItem extends LaundrysMiscModElements.ModElement {
	@ObjectHolder("laundrysmiscmod:rootsword")
	public static final Item block = null;
	public RootSwordItem(LaundrysMiscModElements instance) {
		super(instance, 84);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
		}, 3, -3f, new Item.Properties().group(TabTheLaundryArmourItemGroup.tab)) {
		}.setRegistryName("rootsword"));
	}
}
