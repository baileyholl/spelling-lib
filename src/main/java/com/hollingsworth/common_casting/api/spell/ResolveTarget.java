package com.hollingsworth.common_casting.api.spell;

import net.minecraft.world.phys.HitResult;

/**
 * Stores the resolve result of a spell.
 * Ex. The hit result of a projectile.
 */
public class ResolveTarget {
    private HitResult hitResult;

    public ResolveTarget(HitResult hitResult) {
        this.hitResult = hitResult;
    }

    public HitResult getHitResult() {
        return hitResult;
    }

    public void setHitResult(HitResult hitResult) {
        this.hitResult = hitResult;
    }
}
