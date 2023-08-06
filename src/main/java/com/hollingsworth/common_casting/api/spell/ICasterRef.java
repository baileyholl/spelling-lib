package com.hollingsworth.common_casting.api.spell;

import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

/**
 * A reference to the caster of a spell.
 * For concrete implementations, see {@link EntitySpellCaster} and {@link BlockSpellCaster}.
 */
public interface ICasterRef {

    Vec3 getCasterPos();

    Level getLevel();

}
