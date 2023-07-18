package com.example.examplemod.api.spell;

import net.minecraft.world.phys.HitResult;

/**
 * Stores the target of a spell cast.
 * Ex. The raytrace result of the players look vector.
 */
public class CastTarget {
    public HitResult hitResult;

    public CastTarget(HitResult hitResult) {
        this.hitResult = hitResult;
    }
}
