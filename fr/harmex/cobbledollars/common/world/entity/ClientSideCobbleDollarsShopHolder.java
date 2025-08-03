/*    */ package fr.harmex.cobbledollars.common.world.entity;
/*    */ 
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.CobbleDollarsShopHolder;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Shop;
/*    */ import java.util.Set;
/*    */ import java.util.UUID;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1657;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020#\n\002\030\002\n\002\b\013\n\002\020\000\n\000\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020\016\n\002\b\017\b\b\030\0002\0020\001B-\022\n\b\002\020\003\032\004\030\0010\002\022\b\b\002\020\005\032\0020\004\022\016\b\002\020\b\032\b\022\004\022\0020\0070\006¢\006\004\b\t\020\nJ\022\020\013\032\004\030\0010\002HÆ\003¢\006\004\b\013\020\fJ\020\020\r\032\0020\004HÆ\003¢\006\004\b\r\020\016J\026\020\017\032\b\022\004\022\0020\0070\006HÆ\003¢\006\004\b\017\020\020J6\020\021\032\0020\0002\n\b\002\020\003\032\004\030\0010\0022\b\b\002\020\005\032\0020\0042\016\b\002\020\b\032\b\022\004\022\0020\0070\006HÆ\001¢\006\004\b\021\020\022J\032\020\026\032\0020\0252\b\020\024\032\004\030\0010\023HÖ\003¢\006\004\b\026\020\027J\020\020\031\032\0020\030HÖ\001¢\006\004\b\031\020\032J\020\020\034\032\0020\033HÖ\001¢\006\004\b\034\020\035R$\020\003\032\004\030\0010\0028\026@\026X\016¢\006\022\n\004\b\003\020\036\032\004\b\037\020\f\"\004\b \020!R\"\020\005\032\0020\0048\026@\026X\016¢\006\022\n\004\b\005\020\"\032\004\b#\020\016\"\004\b$\020%R(\020\b\032\b\022\004\022\0020\0070\0068\026@\026X\016¢\006\022\n\004\b\b\020&\032\004\b'\020\020\"\004\b(\020)¨\006*"}, d2 = {"Lfr/harmex/cobbledollars/common/world/entity/ClientSideCobbleDollarsShopHolder;", "Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "shop", "Ljava/util/UUID;", "merchantUUID", "", "Lnet/minecraft/class_1657;", "tradingPlayers", "<init>", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;Ljava/util/UUID;Ljava/util/Set;)V", "component1", "()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "component2", "()Ljava/util/UUID;", "component3", "()Ljava/util/Set;", "copy", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;Ljava/util/UUID;Ljava/util/Set;)Lfr/harmex/cobbledollars/common/world/entity/ClientSideCobbleDollarsShopHolder;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "getShop", "setShop", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;)V", "Ljava/util/UUID;", "getMerchantUUID", "setMerchantUUID", "(Ljava/util/UUID;)V", "Ljava/util/Set;", "getTradingPlayers", "setTradingPlayers", "(Ljava/util/Set;)V", "common"})
/*    */ public final class ClientSideCobbleDollarsShopHolder implements CobbleDollarsShopHolder {
/*    */   @Nullable
/*    */   private Shop shop;
/*    */   
/*    */   @NotNull
/*    */   private UUID merchantUUID;
/*    */   
/*    */   @NotNull
/*    */   private Set<class_1657> tradingPlayers;
/*    */   
/*    */   public ClientSideCobbleDollarsShopHolder(@Nullable Shop shop, @NotNull UUID merchantUUID, @NotNull Set<class_1657> tradingPlayers) {
/* 10 */     this.shop = shop;
/* 11 */     this.merchantUUID = merchantUUID;
/* 12 */     this.tradingPlayers = tradingPlayers;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Shop getShop() {
/*    */     return this.shop;
/*    */   }
/*    */   
/*    */   public void setShop(@Nullable Shop <set-?>) {
/*    */     this.shop = <set-?>;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public UUID getMerchantUUID() {
/*    */     return this.merchantUUID;
/*    */   }
/*    */   
/*    */   public void setMerchantUUID(@NotNull UUID <set-?>) {
/*    */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */     this.merchantUUID = <set-?>;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Set<class_1657> getTradingPlayers() {
/* 12 */     return this.tradingPlayers;
/*    */   }
/*    */   
/*    */   public void setTradingPlayers(@NotNull Set<class_1657> <set-?>) {
/* 12 */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/* 12 */     this.tradingPlayers = <set-?>;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Shop component1() {
/*    */     return this.shop;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final UUID component2() {
/*    */     return this.merchantUUID;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Set<class_1657> component3() {
/*    */     return this.tradingPlayers;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ClientSideCobbleDollarsShopHolder copy(@Nullable Shop shop, @NotNull UUID merchantUUID, @NotNull Set<class_1657> tradingPlayers) {
/*    */     Intrinsics.checkNotNullParameter(merchantUUID, "merchantUUID");
/*    */     Intrinsics.checkNotNullParameter(tradingPlayers, "tradingPlayers");
/*    */     return new ClientSideCobbleDollarsShopHolder(shop, merchantUUID, tradingPlayers);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ClientSideCobbleDollarsShopHolder(shop=" + this.shop + ", merchantUUID=" + this.merchantUUID + ", tradingPlayers=" + this.tradingPlayers + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.shop == null) ? 0 : this.shop.hashCode();
/*    */     result = result * 31 + this.merchantUUID.hashCode();
/*    */     return result * 31 + this.tradingPlayers.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ClientSideCobbleDollarsShopHolder))
/*    */       return false; 
/*    */     ClientSideCobbleDollarsShopHolder clientSideCobbleDollarsShopHolder = (ClientSideCobbleDollarsShopHolder)other;
/*    */     return !Intrinsics.areEqual(this.shop, clientSideCobbleDollarsShopHolder.shop) ? false : (!Intrinsics.areEqual(this.merchantUUID, clientSideCobbleDollarsShopHolder.merchantUUID) ? false : (!!Intrinsics.areEqual(this.tradingPlayers, clientSideCobbleDollarsShopHolder.tradingPlayers)));
/*    */   }
/*    */   
/*    */   public ClientSideCobbleDollarsShopHolder() {
/*    */     this(null, null, null, 7, null);
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\world\entity\ClientSideCobbleDollarsShopHolder.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */