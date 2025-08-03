/*    */ package fr.harmex.cobbledollars.common.utils.extensions;
/*    */ 
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Shop;
/*    */ import java.math.BigInteger;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_2487;
/*    */ import net.minecraft.class_2520;
/*    */ import net.minecraft.class_5455;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\005\032#\020\006\032\004\030\0010\005*\0020\0002\006\020\002\032\0020\0012\006\020\004\032\0020\003¢\006\004\b\006\020\007\032\031\020\b\032\0020\001*\0020\0002\006\020\004\032\0020\003¢\006\004\b\b\020\t\032!\020\017\032\0020\016*\0020\0002\006\020\013\032\0020\n2\006\020\r\032\0020\f¢\006\004\b\017\020\020\032\031\020\021\032\0020\f*\0020\0002\006\020\013\032\0020\n¢\006\004\b\021\020\022¨\006\023"}, d2 = {"Lnet/minecraft/class_2487;", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "shop", "Lnet/minecraft/class_5455;", "registryAccess", "Lnet/minecraft/class_2520;", "putShop", "(Lnet/minecraft/class_2487;Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;Lnet/minecraft/class_5455;)Lnet/minecraft/class_2520;", "getShop", "(Lnet/minecraft/class_2487;Lnet/minecraft/class_5455;)Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "", "key", "Ljava/math/BigInteger;", "value", "", "putBigInt", "(Lnet/minecraft/class_2487;Ljava/lang/String;Ljava/math/BigInteger;)V", "getBigInt", "(Lnet/minecraft/class_2487;Ljava/lang/String;)Ljava/math/BigInteger;", "common"})
/*    */ public final class CompoundTagExtensionKt {
/*    */   @Nullable
/*    */   public static final class_2520 putShop(@NotNull class_2487 $this$putShop, @NotNull Shop shop, @NotNull class_5455 registryAccess) {
/*  9 */     Intrinsics.checkNotNullParameter($this$putShop, "<this>");
/*  9 */     Intrinsics.checkNotNullParameter(shop, "shop");
/*  9 */     Intrinsics.checkNotNullParameter(registryAccess, "registryAccess");
/*  9 */     return $this$putShop.method_10566("CobbleMerchantShop", (class_2520)shop.save(registryAccess));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Shop getShop(@NotNull class_2487 $this$getShop, @NotNull class_5455 registryAccess) {
/* 10 */     Intrinsics.checkNotNullParameter($this$getShop, "<this>");
/* 10 */     Intrinsics.checkNotNullParameter(registryAccess, "registryAccess");
/* 10 */     Intrinsics.checkNotNullExpressionValue($this$getShop.method_10554("CobbleMerchantShop", 10), "getList(...)");
/* 10 */     return Shop.Companion.read(registryAccess, $this$getShop.method_10554("CobbleMerchantShop", 10));
/*    */   }
/*    */   
/*    */   public static final void putBigInt(@NotNull class_2487 $this$putBigInt, @NotNull String key, @NotNull BigInteger value) {
/* 13 */     Intrinsics.checkNotNullParameter($this$putBigInt, "<this>");
/* 13 */     Intrinsics.checkNotNullParameter(key, "key");
/* 13 */     Intrinsics.checkNotNullParameter(value, "value");
/* 13 */     $this$putBigInt.method_10582(key, value.toString());
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final BigInteger getBigInt(@NotNull class_2487 $this$getBigInt, @NotNull String key) {
/* 15 */     Intrinsics.checkNotNullParameter($this$getBigInt, "<this>");
/* 15 */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     try {
/* 16 */       if ($this$getBigInt.method_10573(key, 8)) {
/* 17 */         Intrinsics.checkNotNullExpressionValue($this$getBigInt.method_10558(key), "getString(...)");
/* 17 */         String str = $this$getBigInt.method_10558(key);
/* 17 */         return new BigInteger(str);
/*    */       } 
/* 19 */     } catch (ClassCastException classCastException) {}
/* 20 */     Intrinsics.checkNotNullExpressionValue(BigInteger.ZERO, "ZERO");
/* 20 */     return BigInteger.ZERO;
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\commo\\utils\extensions\CompoundTagExtensionKt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */