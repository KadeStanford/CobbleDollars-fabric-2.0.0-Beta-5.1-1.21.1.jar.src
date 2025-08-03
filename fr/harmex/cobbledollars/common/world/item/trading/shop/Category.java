/*    */ package fr.harmex.cobbledollars.common.world.item.trading.shop;
/*    */ 
/*    */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*    */ import java.math.BigInteger;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Iterator;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import net.minecraft.class_1799;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\006\n\002\020\b\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\020\030\0002\0020\001B'\022\006\020\003\032\0020\002\022\026\020\007\032\022\022\004\022\0020\0050\004j\b\022\004\022\0020\005`\006¢\006\004\b\b\020\tJ\r\020\n\032\0020\000¢\006\004\b\n\020\013J!\020\020\032\0020\0172\006\020\f\032\0020\0052\n\b\002\020\016\032\004\030\0010\r¢\006\004\b\020\020\021J%\020\022\032\0020\0172\n\b\002\020\f\032\004\030\0010\0052\n\b\002\020\016\032\004\030\0010\r¢\006\004\b\022\020\021J\035\020\030\032\0020\0272\006\020\024\032\0020\0232\006\020\026\032\0020\025¢\006\004\b\030\020\031J\025\020\030\032\0020\0272\006\020\f\032\0020\005¢\006\004\b\030\020\032J!\020\033\032\0020\0272\006\020\024\032\0020\0232\n\b\002\020\026\032\004\030\0010\025¢\006\004\b\033\020\031J\025\020\033\032\0020\0272\006\020\f\032\0020\005¢\006\004\b\033\020\032J\035\020\035\032\0020\0172\006\020\f\032\0020\0052\006\020\034\032\0020\r¢\006\004\b\035\020\036R\"\020\003\032\0020\0028\006@\006X\016¢\006\022\n\004\b\003\020\037\032\004\b \020!\"\004\b\"\020#R'\020\007\032\022\022\004\022\0020\0050\004j\b\022\004\022\0020\005`\0068\006¢\006\f\n\004\b\007\020$\032\004\b%\020&¨\006'"}, d2 = {"Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;", "", "", "name", "Ljava/util/ArrayList;", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;", "Lkotlin/collections/ArrayList;", "offers", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "copy", "()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;", "offer", "", "index", "", "addOffer", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;Ljava/lang/Integer;)V", "delOffer", "Lnet/minecraft/class_1799;", "item", "Ljava/math/BigInteger;", "price", "", "add", "(Lnet/minecraft/class_1799;Ljava/math/BigInteger;)Z", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;)Z", "del", "to", "moveOffer", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "Ljava/util/ArrayList;", "getOffers", "()Ljava/util/ArrayList;", "common"})
/*    */ @SourceDebugExtension({"SMAP\nCategory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Category.kt\nfr/harmex/cobbledollars/common/world/item/trading/shop/Category\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1863#2,2:45\n*S KotlinDebug\n*F\n+ 1 Category.kt\nfr/harmex/cobbledollars/common/world/item/trading/shop/Category\n*L\n10#1:45,2\n*E\n"})
/*    */ public final class Category {
/*    */   @NotNull
/*    */   private String name;
/*    */   
/*    */   @NotNull
/*    */   private final ArrayList<Offer> offers;
/*    */   
/*    */   public Category(@NotNull String name, @NotNull ArrayList<Offer> offers) {
/*  7 */     this.name = name;
/*  7 */     this.offers = offers;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getName() {
/*  7 */     return this.name;
/*    */   }
/*    */   
/*    */   public final void setName(@NotNull String <set-?>) {
/*  7 */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*  7 */     this.name = <set-?>;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ArrayList<Offer> getOffers() {
/*  7 */     return this.offers;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Category copy() {
/*  9 */     ArrayList<Offer> offers = new ArrayList();
/* 10 */     Iterable<Offer> $this$forEach$iv = this.offers;
/* 10 */     int $i$f$forEach = 0;
/* 45 */     Iterator<Offer> iterator = $this$forEach$iv.iterator();
/* 45 */     if (iterator.hasNext()) {
/* 45 */       Object element$iv = iterator.next();
/* 45 */       Offer it = (Offer)element$iv;
/* 45 */       int $i$a$-forEach-Category$copy$1 = 0;
/*    */       offers.add(it.copy());
/*    */     } 
/*    */     Category category = new Category(this.name, offers);
/*    */     return category;
/*    */   }
/*    */   
/*    */   public final void addOffer(@NotNull Offer offer, @Nullable Integer index) {
/*    */     Intrinsics.checkNotNullParameter(offer, "offer");
/*    */     if (index == null) {
/*    */       this.offers.add(offer);
/*    */     } else {
/*    */       this.offers.add(index.intValue(), offer);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void delOffer(@Nullable Offer offer, @Nullable Integer index) {
/*    */     if (offer != null && index != null && Intrinsics.areEqual(this.offers.get(index.intValue()), offer)) {
/*    */       this.offers.remove(index.intValue());
/*    */     } else if (offer != null) {
/*    */       this.offers.remove(offer);
/*    */     } else if (index != null) {
/*    */       this.offers.remove(index.intValue());
/*    */     } 
/*    */   }
/*    */   
/*    */   public final boolean add(@NotNull class_1799 item, @NotNull BigInteger price) {
/*    */     Intrinsics.checkNotNullParameter(item, "item");
/*    */     Intrinsics.checkNotNullParameter(price, "price");
/*    */     return this.offers.add(new Offer(item, price, 0, 4, null));
/*    */   }
/*    */   
/*    */   public final boolean add(@NotNull Offer offer) {
/*    */     Intrinsics.checkNotNullParameter(offer, "offer");
/*    */     return this.offers.add(offer);
/*    */   }
/*    */   
/*    */   public final boolean del(@NotNull class_1799 item, @Nullable BigInteger price) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'item'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: getfield offers : Ljava/util/ArrayList;
/*    */     //   10: aload_1
/*    */     //   11: aload_2
/*    */     //   12: <illegal opcode> invoke : (Lnet/minecraft/class_1799;Ljava/math/BigInteger;)Lkotlin/jvm/functions/Function1;
/*    */     //   17: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*    */     //   22: invokevirtual removeIf : (Ljava/util/function/Predicate;)Z
/*    */     //   25: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #35	-> 6
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	26	0	this	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;
/*    */     //   0	26	1	item	Lnet/minecraft/class_1799;
/*    */     //   0	26	2	price	Ljava/math/BigInteger;
/*    */   }
/*    */   
/*    */   private static final boolean del$lambda$1(class_1799 $item, BigInteger $price, Offer it) {
/*    */     Intrinsics.checkNotNullParameter($item, "$item");
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     return (MiscUtilsKt.isSame(it.getItem(), $item) && ($price == null || Intrinsics.areEqual(it.getPrice(), $price)));
/*    */   }
/*    */   
/*    */   private static final boolean del$lambda$2(Function1 $tmp0, Object p0) {
/*    */     Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
/*    */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*    */   }
/*    */   
/*    */   public final boolean del(@NotNull Offer offer) {
/*    */     Intrinsics.checkNotNullParameter(offer, "offer");
/*    */     return this.offers.removeIf(offer::del$lambda$3::del$lambda$4);
/*    */   }
/*    */   
/*    */   private static final boolean del$lambda$3(Offer $offer, Offer it) {
/*    */     Intrinsics.checkNotNullParameter($offer, "$offer");
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     return Intrinsics.areEqual(it, $offer);
/*    */   }
/*    */   
/*    */   private static final boolean del$lambda$4(Function1 $tmp0, Object p0) {
/*    */     Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
/*    */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*    */   }
/*    */   
/*    */   public final void moveOffer(@NotNull Offer offer, int to) {
/*    */     Intrinsics.checkNotNullParameter(offer, "offer");
/*    */     if (this.offers.contains(offer)) {
/*    */       this.offers.remove(offer);
/*    */       this.offers.add(to, offer);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\world\item\trading\shop\Category.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */