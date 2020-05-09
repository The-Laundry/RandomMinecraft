
package net.mcreator.laundrysmiscmod.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.laundrysmiscmod.block.BlockQuicklimeBlock;
import net.mcreator.laundrysmiscmod.LaundrysMiscModElements;

@LaundrysMiscModElements.ModElement.Tag
public class FuelQuicklimeFuel extends LaundrysMiscModElements.ModElement {
	public FuelQuicklimeFuel(LaundrysMiscModElements instance) {
		super(instance, 19);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(BlockQuicklimeBlock.block, (int) (1)).getItem())
			event.setBurnTime(200);
	}
}
