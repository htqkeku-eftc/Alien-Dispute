/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aliendispute.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.aliendispute.block.kekublockBlock;
import net.mcreator.aliendispute.block.QingqingdodoblockBlock;
import net.mcreator.aliendispute.AlienDisputeMod;

public class AlienDisputeModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AlienDisputeMod.MODID);
	public static final DeferredBlock<Block> QINGQINGDODOBLOCK = REGISTRY.register("qingqingdodoblock", QingqingdodoblockBlock::new);
	public static final DeferredBlock<Block> KEKUBLOCK = REGISTRY.register("kekublock", kekublockBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}