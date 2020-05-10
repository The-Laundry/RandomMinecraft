
package net.mcreator.laundrysmiscmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.laundrysmiscmod.item.FossilePickaxeItem;
import net.mcreator.laundrysmiscmod.LaundrysMiscModElements;

@LaundrysMiscModElements.ModElement.Tag
public class TheLaundryToolsItemGroup extends LaundrysMiscModElements.ModElement {
	public TheLaundryToolsItemGroup(LaundrysMiscModElements instance) {
		super(instance, 74);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabthelaundrytools") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(FossilePickaxeItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
