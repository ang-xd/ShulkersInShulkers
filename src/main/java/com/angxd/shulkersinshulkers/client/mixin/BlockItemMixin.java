package com.angxd.shulkersinshulkers.client.mixin;

import net.minecraft.item.BlockItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockItem.class)
public class BlockItemMixin {
    @Inject(method = "canBeNested", at = @At("HEAD"), cancellable = true)
    public void canBeNested(CallbackInfoReturnable<Boolean> cir) {
        cir.cancel();
        cir.setReturnValue(true);
    }
}