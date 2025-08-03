/*    */ package fr.harmex.cobbledollars.common.mixin;
/*    */ 
/*    */ import fr.harmex.cobbledollars.common.utils.extensions.PlayerExtensionKt;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_3222;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Unique;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({class_3222.class})
/*    */ public class ServerPlayerMixin {
/*    */   @Inject(method = {"restoreFrom"}, at = {@At("RETURN")})
/*    */   private void restoreFrom(class_3222 that, boolean keepEverything, CallbackInfo ci) {
/* 15 */     PlayerExtensionKt.setCobbleDollars((class_1657)cobbleDollars$self(), PlayerExtensionKt.getCobbleDollars((class_1657)that));
/*    */   }
/*    */   
/*    */   @Unique
/*    */   private class_3222 cobbleDollars$self() {
/* 20 */     return (class_3222)this;
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\mixin\ServerPlayerMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */