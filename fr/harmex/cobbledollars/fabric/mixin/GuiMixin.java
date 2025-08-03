/*    */ package fr.harmex.cobbledollars.fabric.mixin;
/*    */ 
/*    */ import fr.harmex.cobbledollars.common.client.CobbleDollarsClient;
/*    */ import net.minecraft.class_329;
/*    */ import net.minecraft.class_332;
/*    */ import net.minecraft.class_9779;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({class_329.class})
/*    */ public class GuiMixin {
/*    */   @Inject(method = {"renderCameraOverlays"}, at = {@At("HEAD")})
/*    */   private void cameraOverlaysHook(class_332 guiGraphics, class_9779 deltaTracker, CallbackInfo ci) {
/* 16 */     CobbleDollarsClient.INSTANCE.beforeChatRender(guiGraphics, deltaTracker);
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\fabric\mixin\GuiMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */