package com.syanicxd.e4mcoffline.mixin;

import net.minecraft.server.integrated.IntegratedServer;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(IntegratedServer.class)
public class IntegratedServerMixin {

    @Inject(method = "openToLan", at = @At("HEAD"))
    private void onOpenToLan(CallbackInfoReturnable<Boolean> cir) {
        // Set online-mode to false when opening to LAN
        ((IntegratedServer)(Object)this).setOnlineMode(false);

        // Notify stuff
        MinecraftServer server = (MinecraftServer)(Object)this;
        String message = "[§coffline-e4mc§r] Server allowed offline/cracked players to join §aSuccessfully§r";

        for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
            player.sendMessage(Text.literal(message), false);
        }
    }
}
