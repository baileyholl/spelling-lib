package com.example.examplemod.api.event;

import com.example.examplemod.api.spell.ICasterRef;
import com.example.examplemod.api.spell.ResolveTarget;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.eventbus.api.Cancelable;

/**
 * Fired when a spell attempts to resolve its target.
 */
public class SpellResolveEvent {

    public ICasterRef caster;

    public ResolveTarget resolveTarget;

    public CompoundTag spellData;

    private SpellResolveEvent(ICasterRef caster, ResolveTarget resolveTarget, CompoundTag spellData) {
        this.caster = caster;
        this.resolveTarget = resolveTarget;
        this.spellData = spellData;
    }

    /**
     * Fires before a spell is resolved.
     * This event is {@link net.minecraftforge.eventbus.api.Cancelable}
     * Canceling the event will prevent the spell from being resolved.
     */
    @Cancelable
    public static class Pre extends SpellResolveEvent {

        public Pre(ICasterRef caster, ResolveTarget resolveTarget, CompoundTag spellData) {
            super(caster, resolveTarget, spellData);
        }
    }

    /**
     * Fired after a spell is resolved.
     * This is not cancelable.
     */
    public static class Post extends SpellResolveEvent {

        public Post(ICasterRef caster, ResolveTarget resolveTarget, CompoundTag spellData) {
            super(caster, resolveTarget, spellData);
        }
    }
}
