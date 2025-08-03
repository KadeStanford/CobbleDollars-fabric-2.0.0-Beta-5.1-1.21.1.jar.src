/*    */ package fr.harmex.cobbledollars.common.mixin;
/*    */ 
/*    */ import com.llamalad7.mixinextras.sugar.Local;
/*    */ import fr.harmex.cobbledollars.common.utils.extensions.CompoundTagExtensionKt;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.CobbleDollarsShopHolder;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Shop;
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
/*    */ import java.util.UUID;
/*    */ import net.minecraft.class_1641;
/*    */ import net.minecraft.class_1646;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_2487;
/*    */ import net.minecraft.class_3218;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Unique;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({class_1641.class})
/*    */ public class ZombieVillagerMixin implements CobbleDollarsShopHolder {
/*    */   @Unique
/* 26 */   private Shop shop = new Shop();
/*    */   
/*    */   @Unique
/* 28 */   private Set<class_1657> tradingPlayers = new HashSet<>();
/*    */   
/*    */   @Inject(method = {"finishConversion"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/world/entity/npc/Villager;setVillagerData(Lnet/minecraft/world/entity/npc/VillagerData;)V", shift = At.Shift.AFTER)})
/*    */   private void transferCobbleMerchantShop(class_3218 serverLevel, CallbackInfo ci, @Local class_1646 villager) {
/* 34 */     ((CobbleDollarsShopHolder)villager).setShop(this.shop);
/*    */   }
/*    */   
/*    */   @Inject(method = {"addAdditionalSaveData"}, at = {@At("HEAD")})
/*    */   private void addShopToNbt(class_2487 compound, CallbackInfo ci) {
/* 39 */     if (this.shop != null)
/* 40 */       CompoundTagExtensionKt.putShop(compound, this.shop, cobbleDollars$self().method_56673()); 
/*    */   }
/*    */   
/*    */   @Inject(method = {"readAdditionalSaveData"}, at = {@At("HEAD")})
/*    */   private void readShopFromNbt(class_2487 compound, CallbackInfo ci) {
/* 46 */     if (compound.method_10545("CobbleMerchantShop"))
/* 47 */       this.shop = CompoundTagExtensionKt.getShop(compound, cobbleDollars$self().method_56673()); 
/*    */   }
/*    */   
/*    */   @Unique
/*    */   @Nullable
/*    */   public Shop getShop() {
/* 54 */     return this.shop;
/*    */   }
/*    */   
/*    */   @Unique
/*    */   public void setShop(@Nullable Shop shop) {
/* 60 */     this.shop = shop;
/*    */   }
/*    */   
/*    */   @Unique
/*    */   @NotNull
/*    */   public UUID getMerchantUUID() {
/* 66 */     return cobbleDollars$self().method_5667();
/*    */   }
/*    */   
/*    */   @Unique
/*    */   public void setMerchantUUID(@NotNull UUID uuid) {}
/*    */   
/*    */   @Unique
/*    */   private class_1641 cobbleDollars$self() {
/* 75 */     return (class_1641)this;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Set<class_1657> getTradingPlayers() {
/* 80 */     return this.tradingPlayers;
/*    */   }
/*    */   
/*    */   public void setTradingPlayers(@NotNull Set<class_1657> players) {
/* 85 */     this.tradingPlayers = players;
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\mixin\ZombieVillagerMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */