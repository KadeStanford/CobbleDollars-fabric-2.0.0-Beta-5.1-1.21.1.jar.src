/*   */ package fr.harmex.cobbledollars.common.client.config;
/*   */ 
/*   */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Bank;
/*   */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Shop;
/*   */ import kotlin.Metadata;
/*   */ import kotlin.jvm.internal.Intrinsics;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\"\020\005\032\0020\0048\006@\006X\016¢\006\022\n\004\b\005\020\006\032\004\b\007\020\b\"\004\b\t\020\nR\"\020\f\032\0020\0138\006@\006X\016¢\006\022\n\004\b\f\020\r\032\004\b\016\020\017\"\004\b\020\020\021¨\006\022"}, d2 = {"Lfr/harmex/cobbledollars/common/client/config/ClientShopConfig;", "", "<init>", "()V", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "defaultShop", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "getDefaultShop", "()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "setDefaultShop", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;)V", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Bank;", "bank", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Bank;", "getBank", "()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Bank;", "setBank", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Bank;)V", "common"})
/*   */ public final class ClientShopConfig {
/*   */   @NotNull
/* 7 */   public static final ClientShopConfig INSTANCE = new ClientShopConfig();
/*   */   
/*   */   @NotNull
/* 7 */   private static Shop defaultShop = new Shop();
/*   */   
/*   */   @NotNull
/*   */   public final Shop getDefaultShop() {
/* 7 */     return defaultShop;
/*   */   }
/*   */   
/*   */   public final void setDefaultShop(@NotNull Shop <set-?>) {
/* 7 */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/* 7 */     defaultShop = <set-?>;
/*   */   }
/*   */   
/*   */   @NotNull
/* 8 */   private static Bank bank = new Bank();
/*   */   
/*   */   @NotNull
/*   */   public final Bank getBank() {
/* 8 */     return bank;
/*   */   }
/*   */   
/*   */   public final void setBank(@NotNull Bank <set-?>) {
/* 8 */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/* 8 */     bank = <set-?>;
/*   */   }
/*   */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\client\config\ClientShopConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */