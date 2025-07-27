/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aliendispute.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.aliendispute.AlienDisputeMod;

public class AlienDisputeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AlienDisputeMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ALIEN_DISPUTE = REGISTRY.register("alien_dispute",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.alien_dispute.alien_dispute")).icon(() -> new ItemStack(Blocks.BEACON)).displayItems((parameters, tabData) -> {
				tabData.accept(AlienDisputeModBlocks.QINGQINGDODOBLOCK.get().asItem());
				tabData.accept(AlienDisputeModBlocks.KEKUBLOCK.get().asItem());
				tabData.accept(AlienDisputeModItems.AMBER.get());
				tabData.accept(AlienDisputeModBlocks.AMBERRAWORE.get().asItem());
			}).withSearchBar().build());
}