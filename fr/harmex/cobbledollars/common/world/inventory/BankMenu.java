/*    */ package fr.harmex.cobbledollars.common.world.inventory;
/*    */ 
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.CobbleDollarsShopHolder;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmOverloads;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1263;
/*    */ import net.minecraft.class_1277;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_1661;
/*    */ import net.minecraft.class_1703;
/*    */ import net.minecraft.class_1735;
/*    */ import net.minecraft.class_1799;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\n\030\0002\0020\001B/\b\027\022\006\020\003\032\0020\002\022\006\020\005\032\0020\004\022\n\b\002\020\007\032\004\030\0010\006\022\b\b\002\020\t\032\0020\b¢\006\004\b\n\020\013J\037\020\016\032\0020\r2\006\020\007\032\0020\0062\006\020\f\032\0020\002H\026¢\006\004\b\016\020\017J\027\020\021\032\0020\0202\006\020\007\032\0020\006H\026¢\006\004\b\021\020\022J\027\020\024\032\0020\0232\006\020\007\032\0020\006H\026¢\006\004\b\024\020\025R\027\020\027\032\0020\0268\006¢\006\f\n\004\b\027\020\030\032\004\b\031\020\032R\"\020\t\032\0020\b8\006@\006X\016¢\006\022\n\004\b\t\020\033\032\004\b\034\020\035\"\004\b\036\020\037¨\006 "}, d2 = {"Lfr/harmex/cobbledollars/common/world/inventory/BankMenu;", "Lnet/minecraft/class_1703;", "", "containerId", "Lnet/minecraft/class_1661;", "playerInventory", "Lnet/minecraft/class_1657;", "player", "Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;", "cobbleMerchant", "<init>", "(ILnet/minecraft/class_1661;Lnet/minecraft/class_1657;Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;)V", "index", "Lnet/minecraft/class_1799;", "quickMoveStack", "(Lnet/minecraft/class_1657;I)Lnet/minecraft/class_1799;", "", "removed", "(Lnet/minecraft/class_1657;)V", "", "stillValid", "(Lnet/minecraft/class_1657;)Z", "Lnet/minecraft/class_1277;", "bankContainer", "Lnet/minecraft/class_1277;", "getBankContainer", "()Lnet/minecraft/class_1277;", "Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;", "getCobbleMerchant", "()Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;", "setCobbleMerchant", "(Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;)V", "common"})
/*    */ public final class BankMenu extends class_1703 {
/*    */   @NotNull
/* 14 */   private final class_1277 bankContainer = new class_1277(36);
/*    */   
/*    */   @NotNull
/*    */   private CobbleDollarsShopHolder cobbleMerchant;
/*    */   
/*    */   @NotNull
/*    */   public final class_1277 getBankContainer() {
/* 14 */     return this.bankContainer;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CobbleDollarsShopHolder getCobbleMerchant() {
/* 15 */     return this.cobbleMerchant;
/*    */   }
/*    */   
/*    */   public final void setCobbleMerchant(@NotNull CobbleDollarsShopHolder <set-?>) {
/* 15 */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/* 15 */     this.cobbleMerchant = <set-?>;
/*    */   }
/*    */   
/*    */   @JvmOverloads
/*    */   public BankMenu(int containerId, @NotNull class_1661 playerInventory, @Nullable class_1657 player, @NotNull CobbleDollarsShopHolder cobbleMerchant) {
/* 18 */     super(CobbleDollarsMenus.BANK, containerId);
/* 19 */     this.cobbleMerchant = cobbleMerchant;
/*    */     int line;
/* 20 */     for (line = 0; line < 4; line++) {
/* 21 */       for (int column = 0; column < 9; column++)
/* 22 */         method_7621(new class_1735((class_1263)this.bankContainer, column + line * 9, 5 + column * 18, 19 + line * 18)); 
/*    */     } 
/* 25 */     for (line = 0; line < 3; line++) {
/* 26 */       for (int column = 0; column < 9; column++)
/* 27 */         method_7621(new class_1735((class_1263)playerInventory, column + (line + 1) * 9, 5 + column * 18, 106 + line * 18)); 
/*    */     } 
/* 30 */     for (int hotbarSlot = 0; hotbarSlot < 9; hotbarSlot++)
/* 31 */       method_7621(new class_1735((class_1263)playerInventory, hotbarSlot, 5 + hotbarSlot * 18, 164)); 
/*    */   }
/*    */   
/*    */   @JvmOverloads
/*    */   public BankMenu(int containerId, @NotNull class_1661 playerInventory, @Nullable class_1657 player) {
/* 33 */     this(containerId, playerInventory, player, (CobbleDollarsShopHolder)null, 8, (DefaultConstructorMarker)null);
/*    */   }
/*    */   
/*    */   @JvmOverloads
/*    */   public BankMenu(int containerId, @NotNull class_1661 playerInventory) {
/* 33 */     this(containerId, playerInventory, (class_1657)null, (CobbleDollarsShopHolder)null, 12, (DefaultConstructorMarker)null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public class_1799 method_7601(@NotNull class_1657 player, int index) {
/* 36 */     Intrinsics.checkNotNullParameter(player, "player");
/* 36 */     class_1799 itemStack = class_1799.field_8037;
/* 37 */     Intrinsics.checkNotNullExpressionValue(this.field_7761.get(index), "get(...)");
/* 37 */     class_1735 clickedSlot = (class_1735)this.field_7761.get(index);
/* 38 */     if (clickedSlot.method_7681()) {
/* 39 */       class_1799 clickedItemStack = clickedSlot.method_7677();
/* 40 */       itemStack = clickedItemStack.method_7972();
/* 42 */       if ((0 <= index) ? ((index < 36)) : false) {
/* 43 */         if (!method_7616(clickedItemStack, 36, this.field_7761.size(), true)) {
/* 44 */           Intrinsics.checkNotNullExpressionValue(class_1799.field_8037, "EMPTY");
/* 44 */           return class_1799.field_8037;
/*    */         } 
/* 47 */       } else if (!method_7616(clickedItemStack, 0, 36, false)) {
/* 48 */         Intrinsics.checkNotNullExpressionValue(class_1799.field_8037, "EMPTY");
/* 48 */         return class_1799.field_8037;
/*    */       } 
/* 52 */       if (clickedItemStack.method_7960()) {
/* 53 */         clickedSlot.method_48931(class_1799.field_8037, itemStack);
/*    */       } else {
/* 55 */         clickedSlot.method_7668();
/*    */       } 
/* 58 */       if (clickedItemStack.method_7947() == itemStack.method_7947()) {
/* 59 */         Intrinsics.checkNotNullExpressionValue(class_1799.field_8037, "EMPTY");
/* 59 */         return class_1799.field_8037;
/*    */       } 
/* 62 */       clickedSlot.method_7667(player, clickedItemStack);
/*    */     } 
/* 64 */     class_1799 class_17991 = itemStack;
/* 64 */     Intrinsics.checkNotNull(class_17991);
/* 64 */     return class_17991;
/*    */   }
/*    */   
/*    */   public void method_7595(@NotNull class_1657 player) {
/* 68 */     Intrinsics.checkNotNullParameter(player, "player");
/* 68 */     super.method_7595(player);
/* 69 */     method_7607(player, (class_1263)this.bankContainer);
/*    */   }
/*    */   
/*    */   public boolean method_7597(@NotNull class_1657 player) {
/* 72 */     Intrinsics.checkNotNullParameter(player, "player");
/* 72 */     return player.method_45015();
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\world\inventory\BankMenu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */