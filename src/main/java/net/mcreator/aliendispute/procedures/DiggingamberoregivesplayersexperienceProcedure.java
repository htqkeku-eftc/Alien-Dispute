package net.mcreator.aliendispute.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

public class DiggingamberoregivesplayersexperienceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 4); index0++) {
			if (world instanceof ServerLevel _level)
				_level.addFreshEntity(new ExperienceOrb(_level, (x + 0.5), (y + 1), (z + 0.5), 1));
		}
	}
}