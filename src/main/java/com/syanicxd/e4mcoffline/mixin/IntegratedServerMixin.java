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
        String message = "§8[§coffline-e4mc§8]§r Changed §n§6Online Mode§r to False §aSuccessfully§r";

        Text textMessage = createText(message);

        for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
            player.sendMessage(textMessage, false);
        }
    }

    private Text createText(String message) {
        // Create a Text object compatible with all versions
        return Text.of(message); // This is compatible with both older and newer versions
    }
}
