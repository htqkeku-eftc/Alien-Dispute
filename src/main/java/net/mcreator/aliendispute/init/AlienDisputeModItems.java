/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aliendispute.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.aliendispute.AlienDisputeMod;

public class AlienDisputeModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AlienDisputeMod.MODID);
	public static final DeferredItem<Item> QINGQINGDODOBLOCK = block(AlienDisputeModBlocks.QINGQINGDODOBLOCK, new Item.Properties().rarity(Rarity.EPIC).fireResistant());
	public static final DeferredItem<Item> KEKUBLOCK = block(AlienDisputeModBlocks.KEKUBLOCK, new Item.Properties().rarity(Rarity.EPIC).fireResistant());

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}