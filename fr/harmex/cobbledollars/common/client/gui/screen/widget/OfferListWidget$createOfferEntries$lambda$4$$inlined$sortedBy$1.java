/*     */ package fr.harmex.cobbledollars.common.client.gui.screen.widget;
/*     */ 
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Offer;
/*     */ import java.math.BigInteger;
/*     */ import java.util.Comparator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.comparisons.ComparisonsKt;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\f\n\002\b\004\n\002\020\b\n\002\b\004\020\b\032\0020\004\"\004\b\000\020\0002\016\020\002\032\n \001*\004\030\0018\0008\0002\016\020\003\032\n \001*\004\030\0018\0008\000H\n¢\006\004\b\005\020\006¨\006\007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2", "<anonymous>"})
/*     */ @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 OfferListWidget.kt\nfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget\n*L\n1#1,102:1\n61#2:103\n*E\n"})
/*     */ public final class OfferListWidget$createOfferEntries$lambda$4$$inlined$sortedBy$1<T> implements Comparator {
/*     */   public final int compare(Object a, Object b) {
/* 102 */     Offer offer = (Offer)a;
/* 102 */     int $i$a$-sortedBy-OfferListWidget$createOfferEntries$1$1 = 0;
/* 102 */     offer = (Offer)b;
/* 102 */     BigInteger bigInteger = 
/* 103 */       offer.getPrice();
/*     */     $i$a$-sortedBy-OfferListWidget$createOfferEntries$1$1 = 0;
/* 103 */     return ComparisonsKt.compareValues(bigInteger, offer.getPrice());
/*     */   }
/*     */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\client\gui\screen\widget\OfferListWidget$createOfferEntries$lambda$4$$inlined$sortedBy$1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */