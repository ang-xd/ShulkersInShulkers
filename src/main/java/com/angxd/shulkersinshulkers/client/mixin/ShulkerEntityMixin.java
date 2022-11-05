package com.angxd.shulkersinshulkers.client.mixin;

import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ShulkerBoxBlockEntity.class)
public class ShulkerEntityMixin {
    @Inject(method = "canInsert", at = @At("HEAD"), cancellable = true)
    public void canInsert(int slot, ItemStack stack, Direction dir, CallbackInfoReturnable<Boolean> cir) {
        cir.cancel();
        cir.setReturnValue(true);
    }
}
