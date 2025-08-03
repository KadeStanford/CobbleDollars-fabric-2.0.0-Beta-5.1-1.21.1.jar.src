/*     */ package fr.harmex.cobbledollars.common.mixin;
/*     */ 
/*     */ import fr.harmex.cobbledollars.common.utils.extensions.CompoundTagExtensionKt;
/*     */ import fr.harmex.cobbledollars.common.utils.extensions.PlayerExtensionKt;
/*     */ import fr.harmex.cobbledollars.common.world.entity.villager.CobbleDollarsProfessions;
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.CobbleDollarsShopHolder;
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Shop;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
/*     */ import net.minecraft.class_1268;
/*     */ import net.minecraft.class_1269;
/*     */ import net.minecraft.class_1646;
/*     */ import net.minecraft.class_1657;
/*     */ import net.minecraft.class_2487;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.spongepowered.asm.mixin.Mixin;
/*     */ import org.spongepowered.asm.mixin.Unique;
/*     */ import org.spongepowered.asm.mixin.injection.At;
/*     */ import org.spongepowered.asm.mixin.injection.Inject;
/*     */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*     */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*     */ 
/*     */ @Mixin({class_1646.class})
/*     */ public class VillagerMixin implements CobbleDollarsShopHolder {
/*     */   @Unique
/*  28 */   private Shop shop = new Shop();
/*     */   
/*     */   @Unique
/*     */   @NotNull
/*  31 */   private Set<class_1657> tradingPlayers = new HashSet<>();
/*     */   
/*     */   @Inject(method = {"mobInteract"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/world/entity/npc/Villager;level()Lnet/minecraft/world/level/Level;", ordinal = 1, shift = At.Shift.AFTER)}, cancellable = true)
/*     */   private void cobbleMerchantInteract(class_1657 player, class_1268 hand, CallbackInfoReturnable<class_1269> cir) {
/*  36 */     if (cobbleDollars$isCobbleMerchant() && !(player.method_37908()).field_9236) {
/*  37 */       if (player.method_5715()) {
/*  38 */         PlayerExtensionKt.openBank(player, this);
/*     */       } else {
/*  40 */         PlayerExtensionKt.openShop(player, this);
/*  41 */         this.tradingPlayers.add(player);
/*     */       } 
/*  43 */       cir.setReturnValue(class_1269.field_21466);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Inject(method = {"addAdditionalSaveData"}, at = {@At("HEAD")})
/*     */   private void addShopToNbt(class_2487 compound, CallbackInfo ci) {
/*  49 */     if (this.shop != null)
/*  50 */       CompoundTagExtensionKt.putShop(compound, this.shop, cobbleDollars$self().method_56673()); 
/*     */   }
/*     */   
/*     */   @Inject(method = {"readAdditionalSaveData"}, at = {@At("HEAD")})
/*     */   private void readShopFromNbt(class_2487 compound, CallbackInfo ci) {
/*  56 */     if (compound.method_10545("CobbleMerchantShop"))
/*  57 */       this.shop = CompoundTagExtensionKt.getShop(compound, cobbleDollars$self().method_56673()); 
/*     */   }
/*     */   
/*     */   @Unique
/*     */   @Nullable
/*     */   public Shop getShop() {
/*  64 */     return this.shop;
/*     */   }
/*     */   
/*     */   @Unique
/*     */   public void setShop(@Nullable Shop shop) {
/*  70 */     this.shop = shop;
/*     */   }
/*     */   
/*     */   @Unique
/*     */   @NotNull
/*     */   public UUID getMerchantUUID() {
/*  76 */     return cobbleDollars$self().method_5667();
/*     */   }
/*     */   
/*     */   @Unique
/*     */   public void setMerchantUUID(@NotNull UUID uuid) {}
/*     */   
/*     */   @Unique
/*     */   private boolean cobbleDollars$isCobbleMerchant() {
/*  85 */     return (cobbleDollars$self().method_7231().method_16924() == CobbleDollarsProfessions.COBBLE_MERCHANT);
/*     */   }
/*     */   
/*     */   @Unique
/*     */   private class_1646 cobbleDollars$self() {
/*  90 */     return (class_1646)this;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Set<class_1657> getTradingPlayers() {
/*  95 */     return this.tradingPlayers;
/*     */   }
/*     */   
/*     */   public void setTradingPlayers(@NotNull Set<class_1657> players) {
/* 100 */     this.tradingPlayers = players;
/*     */   }
/*     */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\mixin\VillagerMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */