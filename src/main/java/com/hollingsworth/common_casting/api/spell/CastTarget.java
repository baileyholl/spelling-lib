package com.hollingsworth.common_casting.api.spell;

import net.minecraft.world.phys.HitResult;

/**
 * Stores the target of a spell cast.
 * Ex. The raytrace result of the players look vector.
 */
public class CastTarget {
    private HitResult hitResult;

    public CastTarget(HitResult hitResult) {
        this.hitResult = hitResult;
    }

    public HitResult getHitResult() {
        return hitResult;
    }

    public void setHitResult(HitResult hitResult) {
        this.hitResult = hitResult;
    }
}
