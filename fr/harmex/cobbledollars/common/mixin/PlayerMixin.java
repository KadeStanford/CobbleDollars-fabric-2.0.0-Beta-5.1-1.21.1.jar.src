/*    */ package fr.harmex.cobbledollars.common.mixin;
/*    */ 
/*    */ import fr.harmex.cobbledollars.common.utils.CobbleDollarsPlayer;
/*    */ import fr.harmex.cobbledollars.common.utils.extensions.CompoundTagExtensionKt;
/*    */ import java.math.BigInteger;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_2487;
/*    */ import net.minecraft.class_2940;
/*    */ import net.minecraft.class_2943;
/*    */ import net.minecraft.class_2945;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Unique;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({class_1657.class})
/*    */ public class PlayerMixin implements CobbleDollarsPlayer {
/*    */   @Unique
/* 23 */   private static final class_2940<String> DATA_COBBLEDOLLARS_ID = class_2945.method_12791(class_1657.class, class_2943.field_13326);
/*    */   
/*    */   @Inject(method = {"defineSynchedData"}, at = {@At("RETURN")})
/*    */   private void defineSyncedData(class_2945.class_9222 builder, CallbackInfo ci) {
/* 27 */     builder.method_56912(DATA_COBBLEDOLLARS_ID, "0");
/*    */   }
/*    */   
/*    */   @Inject(method = {"readAdditionalSaveData"}, at = {@At("RETURN")})
/*    */   private void readAdditionalSaveData(class_2487 compoundTag, CallbackInfo callbackInfo) {
/* 32 */     cobbleDollars$setCobbleDollars(CompoundTagExtensionKt.getBigInt(compoundTag, "CobbleDollars"));
/*    */   }
/*    */   
/*    */   @Inject(method = {"addAdditionalSaveData"}, at = {@At("RETURN")})
/*    */   private void addAdditionalSaveData(class_2487 compoundTag, CallbackInfo callbackInfo) {
/* 37 */     CompoundTagExtensionKt.putBigInt(compoundTag, "CobbleDollars", cobbleDollars$getCobbleDollars());
/*    */   }
/*    */   
/*    */   @Unique
/*    */   @NotNull
/*    */   public BigInteger cobbleDollars$getCobbleDollars() {
/* 43 */     return new BigInteger((String)cobbleDollars$self().method_5841().method_12789(DATA_COBBLEDOLLARS_ID));
/*    */   }
/*    */   
/*    */   @Unique
/*    */   public void cobbleDollars$setCobbleDollars(@NotNull BigInteger amount) {
/* 49 */     cobbleDollars$self().method_5841().method_12778(DATA_COBBLEDOLLARS_ID, amount.toString());
/*    */   }
/*    */   
/*    */   @Unique
/*    */   private class_1657 cobbleDollars$self() {
/* 54 */     return (class_1657)this;
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\mixin\PlayerMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */