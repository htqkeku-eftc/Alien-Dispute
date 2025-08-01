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

import net.mcreator.aliendispute.item.AmbergemstonesItem;
import net.mcreator.aliendispute.item.AmberSwordItem;
import net.mcreator.aliendispute.item.AmberShovelItem;
import net.mcreator.aliendispute.item.AmberPickaxeItem;
import net.mcreator.aliendispute.item.AmberItem;
import net.mcreator.aliendispute.item.AmberHoeItem;
import net.mcreator.aliendispute.item.AmberAxeItem;
import net.mcreator.aliendispute.AlienDisputeMod;

public class AlienDisputeModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AlienDisputeMod.MODID);
	public static final DeferredItem<Item> QINGQINGDODOBLOCK = block(AlienDisputeModBlocks.QINGQINGDODOBLOCK, new Item.Properties().rarity(Rarity.EPIC).fireResistant());
	public static final DeferredItem<Item> KEKUBLOCK = block(AlienDisputeModBlocks.KEKUBLOCK, new Item.Properties().rarity(Rarity.EPIC).fireResistant());
	public static final DeferredItem<Item> AMBER = REGISTRY.register("amber", AmberItem::new);
	public static final DeferredItem<Item> AMBERRAWORE = block(AlienDisputeModBlocks.AMBERRAWORE, new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant());
	public static final DeferredItem<Item> AMBER_PICKAXE = REGISTRY.register("amber_pickaxe", AmberPickaxeItem::new);
	public static final DeferredItem<Item> AMBER_SWORD = REGISTRY.register("amber_sword", AmberSwordItem::new);
	public static final DeferredItem<Item> AMBER_AXE = REGISTRY.register("amber_axe", AmberAxeItem::new);
	public static final DeferredItem<Item> AMBER_HOE = REGISTRY.register("amber_hoe", AmberHoeItem::new);
	public static final DeferredItem<Item> AMBER_SHOVEL = REGISTRY.register("amber_shovel", AmberShovelItem::new);
	public static final DeferredItem<Item> AMBERGEMSTONES = REGISTRY.register("ambergemstones", AmbergemstonesItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}