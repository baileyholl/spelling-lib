package com.example.examplemod.api.spell;

import net.minecraft.world.phys.HitResult;

/**
 * Stores the resolve result of a spell.
 * Ex. The hit result of a projectile.
 */
public class ResolveTarget {
    public HitResult hitResult;

    public ResolveTarget(HitResult hitResult) {
        this.hitResult = hitResult;
    }
}
