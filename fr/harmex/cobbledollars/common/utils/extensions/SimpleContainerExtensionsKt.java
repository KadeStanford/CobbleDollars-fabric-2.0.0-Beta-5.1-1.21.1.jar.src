/*    */ package fr.harmex.cobbledollars.common.utils.extensions;
/*    */ 
/*    */ import fr.harmex.cobbledollars.common.CobbleDollars;
/*    */ import fr.harmex.cobbledollars.common.client.config.ClientShopConfig;
/*    */ import java.math.BigInteger;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import net.minecraft.class_1277;
/*    */ import net.minecraft.class_1799;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020 \n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\004\032\037\020\004\032\020\022\f\022\n \003*\004\030\0010\0020\0020\001*\0020\000¢\006\004\b\004\020\005\032\037\020\006\032\020\022\f\022\n \003*\004\030\0010\0020\0020\001*\0020\000¢\006\004\b\006\020\005\032\021\020\b\032\0020\007*\0020\000¢\006\004\b\b\020\t\032\021\020\n\032\0020\007*\0020\000¢\006\004\b\n\020\t¨\006\013"}, d2 = {"Lnet/minecraft/class_1277;", "", "Lnet/minecraft/class_1799;", "kotlin.jvm.PlatformType", "getBankableItems", "(Lnet/minecraft/class_1277;)Ljava/util/List;", "getClientBankableItems", "Ljava/math/BigInteger;", "calculateBankValue", "(Lnet/minecraft/class_1277;)Ljava/math/BigInteger;", "calculateClientBankValue", "common"})
/*    */ @SourceDebugExtension({"SMAP\nSimpleContainerExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleContainerExtensions.kt\nfr/harmex/cobbledollars/common/utils/extensions/SimpleContainerExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,16:1\n774#2:17\n865#2,2:18\n774#2:20\n865#2,2:21\n1797#2,3:23\n1797#2,3:26\n*S KotlinDebug\n*F\n+ 1 SimpleContainerExtensions.kt\nfr/harmex/cobbledollars/common/utils/extensions/SimpleContainerExtensionsKt\n*L\n8#1:17\n8#1:18,2\n9#1:20\n9#1:21,2\n11#1:23,3\n14#1:26,3\n*E\n"})
/*    */ public final class SimpleContainerExtensionsKt {
/*    */   @NotNull
/*    */   public static final List<class_1799> getBankableItems(@NotNull class_1277 $this$getBankableItems) {
/*  8 */     Intrinsics.checkNotNullParameter($this$getBankableItems, "<this>");
/*  8 */     Intrinsics.checkNotNullExpressionValue($this$getBankableItems.method_54454(), "getItems(...)");
/*  8 */     Iterable $this$filter$iv = (Iterable)$this$getBankableItems.method_54454();
/*  8 */     int $i$f$filter = 0;
/* 17 */     Iterable iterable1 = $this$filter$iv;
/* 17 */     Collection<Object> destination$iv$iv = new ArrayList();
/* 17 */     int $i$f$filterTo = 0;
/* 18 */     for (Object element$iv$iv : iterable1) {
/* 18 */       class_1799 it = (class_1799)element$iv$iv;
/* 18 */       int $i$a$-filter-SimpleContainerExtensionsKt$getBankableItems$1 = 0;
/*    */       Intrinsics.checkNotNull(it);
/*    */       if (CobbleDollars.INSTANCE.getBankConfig().getBank().contains(it))
/* 18 */         destination$iv$iv.add(element$iv$iv); 
/*    */     } 
/* 19 */     return (List)destination$iv$iv;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final List<class_1799> getClientBankableItems(@NotNull class_1277 $this$getClientBankableItems) {
/*    */     Intrinsics.checkNotNullParameter($this$getClientBankableItems, "<this>");
/*    */     Intrinsics.checkNotNullExpressionValue($this$getClientBankableItems.method_54454(), "getItems(...)");
/*    */     Iterable $this$filter$iv = (Iterable)$this$getClientBankableItems.method_54454();
/*    */     int $i$f$filter = 0;
/* 20 */     Iterable iterable1 = $this$filter$iv;
/* 20 */     Collection<Object> destination$iv$iv = new ArrayList();
/* 20 */     int $i$f$filterTo = 0;
/* 21 */     for (Object element$iv$iv : iterable1) {
/* 21 */       class_1799 it = (class_1799)element$iv$iv;
/* 21 */       int $i$a$-filter-SimpleContainerExtensionsKt$getClientBankableItems$1 = 0;
/*    */       Intrinsics.checkNotNull(it);
/*    */       if (ClientShopConfig.INSTANCE.getBank().contains(it))
/* 21 */         destination$iv$iv.add(element$iv$iv); 
/*    */     } 
/* 22 */     return (List)destination$iv$iv;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final BigInteger calculateBankValue(@NotNull class_1277 $this$calculateBankValue) {
/*    */     Intrinsics.checkNotNullParameter($this$calculateBankValue, "<this>");
/*    */     List<class_1799> list = getBankableItems($this$calculateBankValue);
/*    */     Object initial$iv = BigInteger.ZERO;
/*    */     int $i$f$fold = 0;
/* 23 */     Object accumulator$iv = initial$iv;
/* 24 */     for (class_1799 element$iv : list) {
/* 24 */       class_1799 class_17991 = element$iv;
/* 24 */       Object object1 = accumulator$iv;
/* 24 */       int $i$a$-fold-SimpleContainerExtensionsKt$calculateBankValue$1 = 0;
/*    */       Intrinsics.checkNotNull(object1);
/*    */       Object object2 = object1;
/*    */       Intrinsics.checkNotNullExpressionValue(BigInteger.valueOf(class_17991.method_7947()), "valueOf(...)");
/*    */       BigInteger bigInteger = BigInteger.valueOf(class_17991.method_7947());
/*    */       Intrinsics.checkNotNull(class_17991);
/*    */       if (CobbleDollars.INSTANCE.getBankConfig().getBank().get(class_17991) == null || CobbleDollars.INSTANCE.getBankConfig().getBank().get(class_17991).getPrice() == null)
/*    */         CobbleDollars.INSTANCE.getBankConfig().getBank().get(class_17991).getPrice(); 
/*    */     } 
/* 25 */     Intrinsics.checkNotNullExpressionValue(accumulator$iv, "fold(...)");
/* 25 */     return (BigInteger)accumulator$iv;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final BigInteger calculateClientBankValue(@NotNull class_1277 $this$calculateClientBankValue) {
/*    */     Intrinsics.checkNotNullParameter($this$calculateClientBankValue, "<this>");
/*    */     List<class_1799> list = getClientBankableItems($this$calculateClientBankValue);
/*    */     Object initial$iv = BigInteger.ZERO;
/*    */     int $i$f$fold = 0;
/* 26 */     Object accumulator$iv = initial$iv;
/* 27 */     for (class_1799 element$iv : list) {
/* 27 */       class_1799 class_17991 = element$iv;
/* 27 */       Object object1 = accumulator$iv;
/* 27 */       int $i$a$-fold-SimpleContainerExtensionsKt$calculateClientBankValue$1 = 0;
/*    */       Intrinsics.checkNotNull(object1);
/*    */       Object object2 = object1;
/*    */       Intrinsics.checkNotNullExpressionValue(BigInteger.valueOf(class_17991.method_7947()), "valueOf(...)");
/*    */       BigInteger bigInteger = BigInteger.valueOf(class_17991.method_7947());
/*    */       Intrinsics.checkNotNull(class_17991);
/*    */       if (ClientShopConfig.INSTANCE.getBank().get(class_17991) == null || ClientShopConfig.INSTANCE.getBank().get(class_17991).getPrice() == null)
/*    */         ClientShopConfig.INSTANCE.getBank().get(class_17991).getPrice(); 
/*    */     } 
/* 28 */     Intrinsics.checkNotNullExpressionValue(accumulator$iv, "fold(...)");
/* 28 */     return (BigInteger)accumulator$iv;
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\commo\\utils\extensions\SimpleContainerExtensionsKt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */