/*    */ package fr.harmex.cobbledollars.common.utils.extensions;
/*    */ 
/*    */ import com.cobblemon.mod.common.util.BufferUtilsKt;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Bank;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Category;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Offer;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Shop;
/*    */ import java.math.BigInteger;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.function.IntFunction;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_2540;
/*    */ import net.minecraft.class_9129;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\006\032\021\020\002\032\0020\001*\0020\000¢\006\004\b\002\020\003\032\031\020\006\032\0020\005*\0020\0002\006\020\004\032\0020\001¢\006\004\b\006\020\007\032\021\020\t\032\0020\b*\0020\000¢\006\004\b\t\020\n\032\031\020\f\032\0020\005*\0020\0002\006\020\013\032\0020\b¢\006\004\b\f\020\r\032\021\020\017\032\0020\016*\0020\000¢\006\004\b\017\020\020\032\031\020\022\032\0020\005*\0020\0002\006\020\021\032\0020\016¢\006\004\b\022\020\023\032\021\020\025\032\0020\024*\0020\000¢\006\004\b\025\020\026\032\031\020\030\032\0020\000*\0020\0002\006\020\027\032\0020\024¢\006\004\b\030\020\031\032\021\020\033\032\0020\032*\0020\000¢\006\004\b\033\020\034\032\031\020\036\032\0020\005*\0020\0002\006\020\035\032\0020\032¢\006\004\b\036\020\037¨\006 "}, d2 = {"Lnet/minecraft/class_2540;", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "readShop", "(Lnet/minecraft/class_2540;)Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "shop", "", "writeShop", "(Lnet/minecraft/class_2540;Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;)V", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Bank;", "readBank", "(Lnet/minecraft/class_2540;)Lfr/harmex/cobbledollars/common/world/item/trading/shop/Bank;", "bank", "writeBank", "(Lnet/minecraft/class_2540;Lfr/harmex/cobbledollars/common/world/item/trading/shop/Bank;)V", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;", "readCategory", "(Lnet/minecraft/class_2540;)Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;", "category", "writeCategory", "(Lnet/minecraft/class_2540;Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;)V", "Ljava/math/BigInteger;", "readBigInt", "(Lnet/minecraft/class_2540;)Ljava/math/BigInteger;", "bigInt", "writeBigInt", "(Lnet/minecraft/class_2540;Ljava/math/BigInteger;)Lnet/minecraft/class_2540;", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;", "readOffer", "(Lnet/minecraft/class_2540;)Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;", "offer", "writeOffer", "(Lnet/minecraft/class_2540;Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;)V", "common"})
/*    */ public final class FriendlyByteBufExtensionKt {
/*    */   @NotNull
/*    */   public static final Shop readShop(@NotNull class_2540 $this$readShop) {
/* 13 */     Intrinsics.checkNotNullParameter($this$readShop, "<this>");
/* 13 */     Intrinsics.checkNotNullExpressionValue($this$readShop.method_34068(ArrayList::new, FriendlyByteBufExtensionKt::readShop$lambda$0::readShop$lambda$1), "readCollection(...)");
/* 13 */     return new Shop((ArrayList)$this$readShop.method_34068(ArrayList::new, FriendlyByteBufExtensionKt::readShop$lambda$0::readShop$lambda$1));
/*    */   }
/*    */   
/*    */   private static final Category readShop$lambda$0(class_2540 buf) {
/* 13 */     Intrinsics.checkNotNull(buf);
/* 13 */     return readCategory(buf);
/*    */   }
/*    */   
/*    */   private static final Category readShop$lambda$1(Function1 $tmp0, Object object) {
/* 13 */     Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
/* 13 */     return (Category)$tmp0.invoke(object);
/*    */   }
/*    */   
/*    */   public static final void writeShop(@NotNull class_2540 $this$writeShop, @NotNull Shop shop) {
/* 15 */     Intrinsics.checkNotNullParameter($this$writeShop, "<this>");
/* 15 */     Intrinsics.checkNotNullParameter(shop, "shop");
/* 15 */     $this$writeShop.method_34062((Collection)shop, FriendlyByteBufExtensionKt::writeShop$lambda$2::writeShop$lambda$3);
/*    */   }
/*    */   
/*    */   private static final void writeShop$lambda$3(Function2 $tmp0, Object object, Category object2) {
/* 15 */     Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
/* 15 */     $tmp0.invoke(object, object2);
/*    */   }
/*    */   
/*    */   private static final Unit writeShop$lambda$2(class_2540 buf, Category category) {
/* 16 */     Intrinsics.checkNotNull(buf);
/* 16 */     Intrinsics.checkNotNull(category);
/* 16 */     writeCategory(buf, category);
/* 17 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Bank readBank(@NotNull class_2540 $this$readBank) {
/* 20 */     Intrinsics.checkNotNullParameter($this$readBank, "<this>");
/* 20 */     Intrinsics.checkNotNullExpressionValue($this$readBank.method_34068(ArrayList::new, FriendlyByteBufExtensionKt::readBank$lambda$4::readBank$lambda$5), "readCollection(...)");
/* 20 */     return new Bank((ArrayList)$this$readBank.method_34068(ArrayList::new, FriendlyByteBufExtensionKt::readBank$lambda$4::readBank$lambda$5));
/*    */   }
/*    */   
/*    */   private static final Offer readBank$lambda$4(class_2540 buf) {
/* 20 */     Intrinsics.checkNotNull(buf);
/* 20 */     return readOffer(buf);
/*    */   }
/*    */   
/*    */   private static final Offer readBank$lambda$5(Function1 $tmp0, Object object) {
/* 20 */     Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
/* 20 */     return (Offer)$tmp0.invoke(object);
/*    */   }
/*    */   
/*    */   public static final void writeBank(@NotNull class_2540 $this$writeBank, @NotNull Bank bank) {
/* 22 */     Intrinsics.checkNotNullParameter($this$writeBank, "<this>");
/* 22 */     Intrinsics.checkNotNullParameter(bank, "bank");
/* 22 */     $this$writeBank.method_34062((Collection)bank, FriendlyByteBufExtensionKt::writeBank$lambda$6::writeBank$lambda$7);
/*    */   }
/*    */   
/*    */   private static final void writeBank$lambda$7(Function2 $tmp0, Object object, Offer object2) {
/* 22 */     Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
/* 22 */     $tmp0.invoke(object, object2);
/*    */   }
/*    */   
/*    */   private static final Unit writeBank$lambda$6(class_2540 buf, Offer offer) {
/* 23 */     Intrinsics.checkNotNull(buf);
/* 23 */     Intrinsics.checkNotNull(offer);
/* 23 */     writeOffer(buf, offer);
/* 24 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Category readCategory(@NotNull class_2540 $this$readCategory) {
/* 27 */     Intrinsics.checkNotNullParameter($this$readCategory, "<this>");
/* 27 */     Intrinsics.checkNotNullExpressionValue($this$readCategory.method_19772(), "readUtf(...)");
/* 27 */     Intrinsics.checkNotNullExpressionValue($this$readCategory.method_34068(ArrayList::new, FriendlyByteBufExtensionKt::readCategory$lambda$8::readCategory$lambda$9), "readCollection(...)");
/* 27 */     return new Category($this$readCategory.method_19772(), (ArrayList)$this$readCategory.method_34068(ArrayList::new, FriendlyByteBufExtensionKt::readCategory$lambda$8::readCategory$lambda$9));
/*    */   }
/*    */   
/*    */   private static final Offer readCategory$lambda$8(class_2540 buf) {
/* 27 */     Intrinsics.checkNotNull(buf);
/* 27 */     return readOffer(buf);
/*    */   }
/*    */   
/*    */   private static final Offer readCategory$lambda$9(Function1 $tmp0, Object object) {
/* 27 */     Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
/* 27 */     return (Offer)$tmp0.invoke(object);
/*    */   }
/*    */   
/*    */   public static final void writeCategory(@NotNull class_2540 $this$writeCategory, @NotNull Category category) {
/* 29 */     Intrinsics.checkNotNullParameter($this$writeCategory, "<this>");
/* 29 */     Intrinsics.checkNotNullParameter(category, "category");
/* 29 */     $this$writeCategory.method_10814(category.getName());
/* 30 */     $this$writeCategory.method_34062(category.getOffers(), FriendlyByteBufExtensionKt::writeCategory$lambda$10::writeCategory$lambda$11);
/*    */   }
/*    */   
/*    */   private static final void writeCategory$lambda$11(Function2 $tmp0, Object object, Offer object2) {
/* 30 */     Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
/* 30 */     $tmp0.invoke(object, object2);
/*    */   }
/*    */   
/*    */   private static final Unit writeCategory$lambda$10(class_2540 buf, Offer offer) {
/* 31 */     Intrinsics.checkNotNull(buf);
/* 31 */     Intrinsics.checkNotNull(offer);
/* 31 */     writeOffer(buf, offer);
/* 32 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final BigInteger readBigInt(@NotNull class_2540 $this$readBigInt) {
/* 35 */     Intrinsics.checkNotNullParameter($this$readBigInt, "<this>");
/* 35 */     Intrinsics.checkNotNullExpressionValue($this$readBigInt.method_19772(), "readUtf(...)");
/* 35 */     String str = $this$readBigInt.method_19772();
/* 35 */     return new BigInteger(str);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final class_2540 writeBigInt(@NotNull class_2540 $this$writeBigInt, @NotNull BigInteger bigInt) {
/* 36 */     Intrinsics.checkNotNullParameter($this$writeBigInt, "<this>");
/* 36 */     Intrinsics.checkNotNullParameter(bigInt, "bigInt");
/* 36 */     Intrinsics.checkNotNullExpressionValue($this$writeBigInt.method_10814(bigInt.toString()), "writeUtf(...)");
/* 36 */     return $this$writeBigInt.method_10814(bigInt.toString());
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Offer readOffer(@NotNull class_2540 $this$readOffer) {
/* 38 */     Intrinsics.checkNotNullParameter($this$readOffer, "<this>");
/* 38 */     return new Offer(BufferUtilsKt.readItemStack((class_9129)$this$readOffer), readBigInt($this$readOffer), $this$readOffer.readInt());
/*    */   }
/*    */   
/*    */   public static final void writeOffer(@NotNull class_2540 $this$writeOffer, @NotNull Offer offer) {
/* 40 */     Intrinsics.checkNotNullParameter($this$writeOffer, "<this>");
/* 40 */     Intrinsics.checkNotNullParameter(offer, "offer");
/* 40 */     BufferUtilsKt.writeItemStack((class_9129)$this$writeOffer, offer.getItem());
/* 41 */     writeBigInt($this$writeOffer, offer.getPrice());
/* 42 */     $this$writeOffer.method_53002(offer.getStock());
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\commo\\utils\extensions\FriendlyByteBufExtensionKt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */