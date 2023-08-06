package com.hollingsworth.common_casting.api.event;

import com.hollingsworth.common_casting.api.spell.ICasterRef;
import com.hollingsworth.common_casting.api.spell.ResolveTarget;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.eventbus.api.Cancelable;

/**
 * Fired when a spell attempts to resolve its target.
 */
public class SpellResolveEvent {

    private ICasterRef caster;

    private ResolveTarget resolveTarget;

    private CompoundTag spellData;

    private SpellResolveEvent(ICasterRef caster, ResolveTarget resolveTarget, CompoundTag spellData) {
        this.caster = caster;
        this.resolveTarget = resolveTarget;
        this.spellData = spellData;
    }

    public ICasterRef getCaster() {
        return caster;
    }

    public void setCaster(ICasterRef caster) {
        this.caster = caster;
    }

    public ResolveTarget getResolveTarget() {
        return resolveTarget;
    }

    public void setResolveTarget(ResolveTarget resolveTarget) {
        this.resolveTarget = resolveTarget;
    }

    public CompoundTag getSpellData() {
        return spellData;
    }

    public void setSpellData(CompoundTag spellData) {
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
