
package net.mcreator.laundrysmiscmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.laundrysmiscmod.itemgroup.TheLaundryToolsItemGroup;
import net.mcreator.laundrysmiscmod.LaundrysMiscModElements;

@LaundrysMiscModElements.ModElement.Tag
public class FossilePickaxeItem extends LaundrysMiscModElements.ModElement {
	@ObjectHolder("laundrysmiscmod:fossilepickaxe")
	public static final Item block = null;
	public FossilePickaxeItem(LaundrysMiscModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(TheLaundryToolsItemGroup.tab)) {
		}.setRegistryName("fossilepickaxe"));
	}
}
