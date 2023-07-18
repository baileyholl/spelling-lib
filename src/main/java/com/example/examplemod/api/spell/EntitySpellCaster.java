package com.example.examplemod.api.spell;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class EntitySpellCaster implements ICasterRef {
    Entity caster;

    public EntitySpellCaster(Entity caster) {
        this.caster = caster;
    }

    @Override
    public Vec3 getCasterPos() {
        return caster.position();
    }

    @Override
    public Level getLevel() {
        return caster.level();
    }
}
