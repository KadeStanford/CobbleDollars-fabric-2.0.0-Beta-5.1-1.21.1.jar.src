/*    */ package fr.harmex.cobbledollars.common.world.inventory;
/*    */ 
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.CobbleDollarsShopHolder;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Shop;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmOverloads;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1263;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_1661;
/*    */ import net.minecraft.class_1703;
/*    */ import net.minecraft.class_1735;
/*    */ import net.minecraft.class_1799;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\016\030\0002\0020\001B/\b\027\022\006\020\003\032\0020\002\022\006\020\005\032\0020\004\022\n\b\002\020\007\032\004\030\0010\006\022\b\b\002\020\t\032\0020\b¢\006\004\b\n\020\013J\027\020\r\032\0020\f2\006\020\005\032\0020\004H\002¢\006\004\b\r\020\016J\r\020\020\032\0020\017¢\006\004\b\020\020\021J\025\020\023\032\0020\f2\006\020\022\032\0020\017¢\006\004\b\023\020\024J\037\020\027\032\0020\0262\006\020\007\032\0020\0062\006\020\025\032\0020\002H\026¢\006\004\b\027\020\030J\027\020\032\032\0020\0312\006\020\007\032\0020\006H\026¢\006\004\b\032\020\033R\"\020\t\032\0020\b8\006@\006X\016¢\006\022\n\004\b\t\020\034\032\004\b\035\020\036\"\004\b\037\020 R\"\020!\032\0020\0318\006@\006X\016¢\006\022\n\004\b!\020\"\032\004\b#\020$\"\004\b%\020&¨\006'"}, d2 = {"Lfr/harmex/cobbledollars/common/world/inventory/ShopMenu;", "Lnet/minecraft/class_1703;", "", "containerId", "Lnet/minecraft/class_1661;", "playerInventory", "Lnet/minecraft/class_1657;", "player", "Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;", "cobbleMerchant", "<init>", "(ILnet/minecraft/class_1661;Lnet/minecraft/class_1657;Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;)V", "", "createSlots", "(Lnet/minecraft/class_1661;)V", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "getShop", "()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "shop", "setShop", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;)V", "index", "Lnet/minecraft/class_1799;", "quickMoveStack", "(Lnet/minecraft/class_1657;I)Lnet/minecraft/class_1799;", "", "stillValid", "(Lnet/minecraft/class_1657;)Z", "Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;", "getCobbleMerchant", "()Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;", "setCobbleMerchant", "(Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;)V", "hasMerchant", "Z", "getHasMerchant", "()Z", "setHasMerchant", "(Z)V", "common"})
/*    */ public final class ShopMenu extends class_1703 {
/*    */   @NotNull
/*    */   private CobbleDollarsShopHolder cobbleMerchant;
/*    */   
/*    */   private boolean hasMerchant;
/*    */   
/*    */   @NotNull
/*    */   public final CobbleDollarsShopHolder getCobbleMerchant() {
/* 14 */     return this.cobbleMerchant;
/*    */   }
/*    */   
/*    */   public final void setCobbleMerchant(@NotNull CobbleDollarsShopHolder <set-?>) {
/* 14 */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/* 14 */     this.cobbleMerchant = <set-?>;
/*    */   }
/*    */   
/*    */   public final boolean getHasMerchant() {
/* 15 */     return this.hasMerchant;
/*    */   }
/*    */   
/*    */   public final void setHasMerchant(boolean <set-?>) {
/* 15 */     this.hasMerchant = <set-?>;
/*    */   }
/*    */   
/*    */   @JvmOverloads
/*    */   public ShopMenu(int containerId, @NotNull class_1661 playerInventory, @Nullable class_1657 player, @NotNull CobbleDollarsShopHolder cobbleMerchant) {
/* 18 */     super(CobbleDollarsMenus.SHOP, containerId);
/* 19 */     this.cobbleMerchant = cobbleMerchant;
/* 20 */     createSlots(playerInventory);
/*    */   }
/*    */   
/*    */   @JvmOverloads
/*    */   public ShopMenu(int containerId, @NotNull class_1661 playerInventory, @Nullable class_1657 player) {
/* 21 */     this(containerId, playerInventory, player, (CobbleDollarsShopHolder)null, 8, (DefaultConstructorMarker)null);
/*    */   }
/*    */   
/*    */   @JvmOverloads
/*    */   public ShopMenu(int containerId, @NotNull class_1661 playerInventory) {
/* 21 */     this(containerId, playerInventory, (class_1657)null, (CobbleDollarsShopHolder)null, 12, (DefaultConstructorMarker)null);
/*    */   }
/*    */   
/*    */   private final void createSlots(class_1661 playerInventory) {
/* 24 */     for (int line = 0; line < 3; line++) {
/* 25 */       for (int column = 0; column < 9; column++)
/* 26 */         method_7621(new class_1735((class_1263)playerInventory, column + (line + 1) * 9, 5 + column * 18, 98 + line * 18)); 
/*    */     } 
/* 29 */     for (int hotbarSlot = 0; hotbarSlot < 9; hotbarSlot++)
/* 30 */       method_7621(new class_1735((class_1263)playerInventory, hotbarSlot, 5 + hotbarSlot * 18, 156)); 
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Shop getShop() {
/* 34 */     if (this.cobbleMerchant.getShop() == null)
/* 34 */       this.cobbleMerchant.getShop(); 
/* 34 */     return new Shop();
/*    */   }
/*    */   
/*    */   public final void setShop(@NotNull Shop shop) {
/* 36 */     Intrinsics.checkNotNullParameter(shop, "shop");
/* 36 */     this.cobbleMerchant.setShop(shop);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public class_1799 method_7601(@NotNull class_1657 player, int index) {
/* 40 */     Intrinsics.checkNotNullParameter(player, "player");
/* 40 */     class_1799 itemStack = class_1799.field_8037;
/* 41 */     Intrinsics.checkNotNullExpressionValue(this.field_7761.get(index), "get(...)");
/* 41 */     class_1735 clickedSlot = (class_1735)this.field_7761.get(index);
/* 42 */     if (clickedSlot.method_7681()) {
/* 43 */       class_1799 clickedItemStack = clickedSlot.method_7677();
/* 44 */       itemStack = clickedItemStack.method_7972();
/* 46 */       if ((0 <= index) ? ((index < 27)) : false) {
/* 47 */         if (!method_7616(clickedItemStack, 27, 36, false)) {
/* 48 */           Intrinsics.checkNotNullExpressionValue(class_1799.field_8037, "EMPTY");
/* 48 */           return class_1799.field_8037;
/*    */         } 
/* 50 */       } else if (((27 <= index) ? ((index < 37)) : false) && 
/* 51 */         !method_7616(clickedItemStack, 0, 26, false)) {
/* 52 */         Intrinsics.checkNotNullExpressionValue(class_1799.field_8037, "EMPTY");
/* 52 */         return class_1799.field_8037;
/*    */       } 
/* 56 */       if (clickedItemStack.method_7960()) {
/* 57 */         clickedSlot.method_48931(class_1799.field_8037, itemStack);
/*    */       } else {
/* 59 */         clickedSlot.method_7668();
/*    */       } 
/* 62 */       if (clickedItemStack.method_7947() == itemStack.method_7947()) {
/* 63 */         Intrinsics.checkNotNullExpressionValue(class_1799.field_8037, "EMPTY");
/* 63 */         return class_1799.field_8037;
/*    */       } 
/* 66 */       clickedSlot.method_7667(player, clickedItemStack);
/*    */     } 
/* 68 */     class_1799 class_17991 = itemStack;
/* 68 */     Intrinsics.checkNotNull(class_17991);
/* 68 */     return class_17991;
/*    */   }
/*    */   
/*    */   public boolean method_7597(@NotNull class_1657 player) {
/* 71 */     Intrinsics.checkNotNullParameter(player, "player");
/* 71 */     return player.method_45015();
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\world\inventory\ShopMenu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */