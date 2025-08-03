/*     */ package fr.harmex.cobbledollars.common.world.item.trading.shop;
/*     */ 
/*     */ import fr.harmex.cobbledollars.common.utils.extensions.CompoundTagExtensionKt;
/*     */ import java.math.BigInteger;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.jvm.optionals.OptionalsKt;
/*     */ import net.minecraft.class_1799;
/*     */ import net.minecraft.class_2487;
/*     */ import net.minecraft.class_2499;
/*     */ import net.minecraft.class_2520;
/*     */ import net.minecraft.class_5455;
/*     */ import net.minecraft.class_7225;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\021\n\002\b\004\n\002\020\b\n\000\n\002\020\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020\013\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\b\030\000 %2\022\022\004\022\0020\0020\001j\b\022\004\022\0020\002`\003:\001%B\007¢\006\004\b\004\020\005B!\b\026\022\026\020\006\032\022\022\004\022\0020\0020\001j\b\022\004\022\0020\002`\003¢\006\004\b\004\020\007B\035\b\026\022\022\020\t\032\n\022\006\b\001\022\0020\0020\b\"\0020\002¢\006\004\b\004\020\nJ\r\020\013\032\0020\000¢\006\004\b\013\020\fJ!\020\020\032\0020\0172\006\020\t\032\0020\0022\n\b\002\020\016\032\004\030\0010\r¢\006\004\b\020\020\021J%\020\022\032\0020\0172\n\b\002\020\t\032\004\030\0010\0022\n\b\002\020\016\032\004\030\0010\r¢\006\004\b\022\020\021J\027\020\025\032\004\030\0010\0022\006\020\024\032\0020\023¢\006\004\b\025\020\026J\025\020\030\032\0020\0272\006\020\024\032\0020\023¢\006\004\b\030\020\031J\025\020\032\032\0020\0272\006\020\024\032\0020\023¢\006\004\b\032\020\031J\025\020\033\032\0020\0272\006\020\024\032\0020\023¢\006\004\b\033\020\031J\025\020\037\032\0020\0362\006\020\035\032\0020\034¢\006\004\b\037\020 J\027\020\"\032\0020\0272\b\020!\032\004\030\0010\000¢\006\004\b\"\020#J\027\020$\032\0020\0272\b\020!\032\004\030\0010\000¢\006\004\b$\020#¨\006&"}, d2 = {"Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "Ljava/util/ArrayList;", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;", "Lkotlin/collections/ArrayList;", "<init>", "()V", "shopList", "(Ljava/util/ArrayList;)V", "", "category", "([Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;)V", "copy", "()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "", "index", "", "addCategory", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;Ljava/lang/Integer;)V", "delCategory", "", "name", "get", "(Ljava/lang/String;)Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;", "", "has", "(Ljava/lang/String;)Z", "add", "del", "Lnet/minecraft/class_5455;", "registryAccess", "Lnet/minecraft/class_2499;", "save", "(Lnet/minecraft/class_5455;)Lnet/minecraft/class_2499;", "other", "equalsWithoutStock", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;)Z", "equals", "Companion", "common"})
/*     */ @SourceDebugExtension({"SMAP\nShop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shop.kt\nfr/harmex/cobbledollars/common/world/item/trading/shop/Shop\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n1863#2,2:130\n295#2,2:132\n1863#2,2:134\n1872#2,2:136\n1872#2,3:138\n1874#2:141\n1872#2,2:142\n1872#2,3:144\n1874#2:147\n*S KotlinDebug\n*F\n+ 1 Shop.kt\nfr/harmex/cobbledollars/common/world/item/trading/shop/Shop\n*L\n46#1:130,2\n68#1:132,2\n78#1:134,2\n102#1:136,2\n105#1:138,3\n102#1:141\n119#1:142,2\n122#1:144,3\n119#1:147\n*E\n"})
/*     */ public final class Shop extends ArrayList<Category> {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   
/*     */   public Shop() {}
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\035\020\t\032\0020\b2\006\020\005\032\0020\0042\006\020\007\032\0020\006¢\006\004\b\t\020\n¨\006\013"}, d2 = {"Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop$Companion;", "", "<init>", "()V", "Lnet/minecraft/class_5455;", "registryAccess", "Lnet/minecraft/class_2499;", "listTag", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "read", "(Lnet/minecraft/class_5455;Lnet/minecraft/class_2499;)Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "common"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final Shop read(@NotNull class_5455 registryAccess, @NotNull class_2499 listTag) {
/*  16 */       Intrinsics.checkNotNullParameter(registryAccess, "registryAccess");
/*  16 */       Intrinsics.checkNotNullParameter(listTag, "listTag");
/*  16 */       Shop shop = new Shop();
/*  17 */       Intrinsics.checkNotNullExpressionValue(listTag.iterator(), "iterator(...)");
/*  17 */       for (class_2520 categoryCompound : listTag) {
/*  18 */         ArrayList<Offer> offerList = new ArrayList();
/*  19 */         Intrinsics.checkNotNull(categoryCompound, "null cannot be cast to non-null type net.minecraft.nbt.CompoundTag");
/*  19 */         Intrinsics.checkNotNullExpressionValue(((class_2487)categoryCompound).method_10554("Offers", 10).iterator(), "iterator(...)");
/*  19 */         for (class_2520 offerTag : ((class_2487)categoryCompound).method_10554("Offers", 10)) {
/*  20 */           Intrinsics.checkNotNull(offerTag, "null cannot be cast to non-null type net.minecraft.nbt.CompoundTag");
/*  20 */           class_2487 offerCompound = (class_2487)offerTag;
/*  21 */           Intrinsics.checkNotNullExpressionValue(class_1799.method_57360((class_7225.class_7874)registryAccess, (class_2520)offerCompound.method_10562("Item")), "parse(...)");
/*  21 */           class_1799 offerItem = (class_1799)OptionalsKt.getOrDefault(class_1799.method_57360((class_7225.class_7874)registryAccess, (class_2520)offerCompound.method_10562("Item")), class_1799.field_8037);
/*  22 */           if (!offerItem.method_7960()) {
/*  23 */             BigInteger offerPrice = CompoundTagExtensionKt.getBigInt(offerCompound, "Price");
/*  24 */             int offerStock = offerCompound.method_10545("Stock") ? 
/*  25 */               offerCompound.method_10550("Stock") : 
/*  26 */               -1;
/*  27 */             Intrinsics.checkNotNull(offerItem);
/*  27 */             offerList.add(new Offer(offerItem, offerPrice, offerStock));
/*     */           } 
/*     */         } 
/*  30 */         Intrinsics.checkNotNullExpressionValue(((class_2487)categoryCompound).method_10558("Category"), "getString(...)");
/*  30 */         Category category = new Category(((class_2487)categoryCompound).method_10558("Category"), offerList);
/*  31 */         shop.add(category);
/*     */       } 
/*  33 */       return shop;
/*     */     }
/*     */   }
/*     */   
/*     */   public Shop(@NotNull ArrayList<? extends Category> shopList) {
/*  37 */     this();
/*  38 */     addAll(shopList);
/*     */   }
/*     */   
/*     */   public Shop(@NotNull Category... category) {
/*  40 */     this();
/*  41 */     CollectionsKt.addAll(this, (Object[])category);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Shop copy() {
/*  45 */     Shop shop = new Shop();
/*  46 */     Iterable $this$forEach$iv = this;
/*  46 */     int $i$f$forEach = 0;
/* 130 */     Iterator iterator = $this$forEach$iv.iterator();
/* 130 */     if (iterator.hasNext()) {
/* 130 */       Object element$iv = iterator.next();
/* 130 */       Category it = (Category)element$iv;
/* 130 */       int $i$a$-forEach-Shop$copy$1 = 0;
/*     */       shop.add(it.copy());
/*     */     } 
/*     */     return shop;
/*     */   }
/*     */   
/*     */   public final void addCategory(@NotNull Category category, @Nullable Integer index) {
/*     */     Intrinsics.checkNotNullParameter(category, "category");
/*     */     if (index == null) {
/*     */       add(category);
/*     */     } else {
/*     */       add(index.intValue(), category);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void delCategory(@Nullable Category category, @Nullable Integer index) {
/*     */     if (category != null && index != null && Intrinsics.areEqual(get(index.intValue()), category)) {
/*     */       remove(index.intValue());
/*     */     } else if (category != null) {
/*     */       remove(category);
/*     */     } else if (index != null) {
/*     */       remove(index.intValue());
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Category get(@NotNull String name) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'name'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: checkcast java/lang/Iterable
/*     */     //   10: astore_2
/*     */     //   11: iconst_0
/*     */     //   12: istore_3
/*     */     //   13: aload_2
/*     */     //   14: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   19: astore #4
/*     */     //   21: aload #4
/*     */     //   23: invokeinterface hasNext : ()Z
/*     */     //   28: ifeq -> 67
/*     */     //   31: aload #4
/*     */     //   33: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   38: astore #5
/*     */     //   40: aload #5
/*     */     //   42: checkcast fr/harmex/cobbledollars/common/world/item/trading/shop/Category
/*     */     //   45: astore #6
/*     */     //   47: iconst_0
/*     */     //   48: istore #7
/*     */     //   50: aload #6
/*     */     //   52: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   55: aload_1
/*     */     //   56: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   59: ifeq -> 21
/*     */     //   62: aload #5
/*     */     //   64: goto -> 68
/*     */     //   67: aconst_null
/*     */     //   68: checkcast fr/harmex/cobbledollars/common/world/item/trading/shop/Category
/*     */     //   71: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #68	-> 6
/*     */     //   #132	-> 13
/*     */     //   #68	-> 50
/*     */     //   #132	-> 59
/*     */     //   #133	-> 67
/*     */     //   #68	-> 71
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   50	9	7	$i$a$-firstOrNull-Shop$get$1	I
/*     */     //   47	12	6	it	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;
/*     */     //   40	27	5	element$iv	Ljava/lang/Object;
/*     */     //   13	55	3	$i$f$firstOrNull	I
/*     */     //   11	57	2	$this$firstOrNull$iv	Ljava/lang/Iterable;
/*     */     //   0	72	0	this	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;
/*     */     //   0	72	1	name	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   public final boolean has(@NotNull String name) {
/*     */     Intrinsics.checkNotNullParameter(name, "name");
/*     */     return (get(name) != null);
/*     */   }
/*     */   
/*     */   public final boolean add(@NotNull String name) {
/*     */     Intrinsics.checkNotNullParameter(name, "name");
/*     */     return add(new Category(name, new ArrayList<>()));
/*     */   }
/*     */   
/*     */   public final boolean del(@NotNull String name) {
/*     */     Intrinsics.checkNotNullParameter(name, "name");
/*     */     return removeIf(name::del$lambda$2::del$lambda$3);
/*     */   }
/*     */   
/*     */   private static final boolean del$lambda$2(String $name, Category it) {
/*     */     Intrinsics.checkNotNullParameter($name, "$name");
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return Intrinsics.areEqual(it.getName(), $name);
/*     */   }
/*     */   
/*     */   private static final boolean del$lambda$3(Function1 $tmp0, Object p0) {
/*     */     Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
/*     */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final class_2499 save(@NotNull class_5455 registryAccess) {
/*     */     Intrinsics.checkNotNullParameter(registryAccess, "registryAccess");
/*     */     class_2499 categoryList = new class_2499();
/*     */     Intrinsics.checkNotNullExpressionValue(iterator(), "iterator(...)");
/*     */     Iterator<Category> iterator = iterator();
/*     */     while (true) {
/*     */       Category category;
/*     */       class_2487 categoryCompound;
/*     */       class_2499 offerList;
/*     */       Iterator<Offer> iterator1;
/*     */       if (iterator.hasNext()) {
/*     */         Intrinsics.checkNotNullExpressionValue(iterator.next(), "next(...)");
/*     */         category = iterator.next();
/*     */         categoryCompound = new class_2487();
/*     */         offerList = new class_2499();
/*     */         Iterable<Offer> $this$forEach$iv = category.getOffers();
/*     */         int $i$f$forEach = 0;
/* 134 */         iterator1 = $this$forEach$iv.iterator();
/*     */       } else {
/*     */         break;
/*     */       } 
/* 134 */       if (iterator1.hasNext()) {
/* 134 */         Object element$iv = iterator1.next();
/* 134 */         Offer it = (Offer)element$iv;
/* 134 */         int $i$a$-forEach-Shop$save$1 = 0;
/*     */         if (!it.getItem().method_7960()) {
/*     */           class_2487 offerCompound = new class_2487();
/*     */           offerCompound.method_10566("Item", it.getItem().method_57376((class_7225.class_7874)registryAccess, (class_2520)new class_2487()));
/*     */           CompoundTagExtensionKt.putBigInt(offerCompound, "Price", it.getPrice());
/*     */           if (it.getStock() >= 0)
/*     */             offerCompound.method_10569("Stock", it.getStock()); 
/*     */           offerList.add(offerCompound);
/*     */         } 
/*     */       } 
/*     */       categoryCompound.method_10582("Category", category.getName());
/*     */       categoryCompound.method_10566("Offers", (class_2520)offerList);
/*     */       categoryList.add(categoryCompound);
/*     */     } 
/*     */     return categoryList;
/*     */   }
/*     */   
/*     */   public final boolean equalsWithoutStock(@Nullable Shop other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (other == null)
/*     */       return false; 
/*     */     if (size() != other.size())
/*     */       return false; 
/*     */     Iterable $this$forEachIndexed$iv = this;
/*     */     int $i$f$forEachIndexed = 0;
/* 136 */     int index$iv = 0;
/* 137 */     Iterator iterator = $this$forEachIndexed$iv.iterator();
/* 137 */     if (iterator.hasNext()) {
/* 137 */       Object item$iv = iterator.next();
/* 137 */       int i = index$iv++;
/* 137 */       if (i < 0)
/* 137 */         CollectionsKt.throwIndexOverflow(); 
/* 137 */       Category category = (Category)item$iv;
/* 137 */       int categoryIndex = i, $i$a$-forEachIndexed-Shop$equalsWithoutStock$1 = 0;
/*     */       if (!Intrinsics.areEqual(category.getName(), other.get(categoryIndex).getName()))
/*     */         return false; 
/*     */     } 
/*     */     return true;
/*     */   }
/*     */   
/*     */   public final boolean equals(@Nullable Shop other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (other == null)
/*     */       return false; 
/*     */     if (size() != other.size())
/*     */       return false; 
/*     */     Iterable $this$forEachIndexed$iv = this;
/*     */     int $i$f$forEachIndexed = 0;
/* 142 */     int index$iv = 0;
/* 143 */     Iterator iterator = $this$forEachIndexed$iv.iterator();
/* 143 */     if (iterator.hasNext()) {
/* 143 */       Object item$iv = iterator.next();
/* 143 */       int i = index$iv++;
/* 143 */       if (i < 0)
/* 143 */         CollectionsKt.throwIndexOverflow(); 
/* 143 */       Category category = (Category)item$iv;
/* 143 */       int categoryIndex = i, $i$a$-forEachIndexed-Shop$equals$1 = 0;
/*     */       if (!Intrinsics.areEqual(category.getName(), other.get(categoryIndex).getName()))
/*     */         return false; 
/*     */     } 
/*     */     return true;
/*     */   }
/*     */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\world\item\trading\shop\Shop.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */