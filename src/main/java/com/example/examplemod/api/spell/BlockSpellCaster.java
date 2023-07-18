package com.example.examplemod.api.spell;


import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.phys.Vec3;

public class BlockSpellCaster implements ICasterRef {

    public BlockEntity blockEntity;

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
}
