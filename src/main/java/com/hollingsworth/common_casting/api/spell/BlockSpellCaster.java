package com.hollingsworth.common_casting.api.spell;


import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.phys.Vec3;

public class BlockSpellCaster implements ICasterRef {

    private BlockEntity blockEntity;

    public BlockSpellCaster(BlockEntity blockEntity) {
        this.blockEntity = blockEntity;
    }

    @Override
    public Vec3 getCasterPos() {
        return blockEntity.getBlockPos().getCenter();
    }

    @Override
    public Level getLevel() {
        return blockEntity.getLevel();
    }

    public BlockEntity getBlockEntity() {
        return blockEntity;
    }

    public void setBlockEntity(BlockEntity blockEntity) {
        this.blockEntity = blockEntity;
    }
}
