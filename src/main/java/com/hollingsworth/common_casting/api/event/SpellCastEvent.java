package com.hollingsworth.common_casting.api.event;

import com.hollingsworth.common_casting.api.spell.CastTarget;
import com.hollingsworth.common_casting.api.spell.ICasterRef;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;

public class SpellCastEvent extends Event {
    public ICasterRef caster;

    public CastTarget castTarget;

    public CompoundTag spellData;



    private SpellCastEvent(ICasterRef caster, CastTarget castTarget, CompoundTag spellData) {
        this.caster = caster;
        this.castTarget = castTarget;
        this.spellData = spellData;
    }

    /**
     * Fires before a spell is cast.
     * This event is {@link net.minecraftforge.eventbus.api.Cancelable}
     * Canceling the event will prevent the spell from being cast
     */
    @Cancelable
    public static class Pre extends SpellCastEvent {

        public Pre(ICasterRef caster, CastTarget castTarget, CompoundTag spellData) {
            super(caster, castTarget, spellData);
        }
    }

    /**
     * Fired after a spell is cast.
     * This is not cancelable.
     */
    public static class Post extends SpellCastEvent {

        public Post(ICasterRef caster, CastTarget castTarget, CompoundTag spellData) {
            super(caster, castTarget, spellData);
        }
    }
}
