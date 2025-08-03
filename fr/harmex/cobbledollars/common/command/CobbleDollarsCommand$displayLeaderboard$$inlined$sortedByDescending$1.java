/*     */ package fr.harmex.cobbledollars.common.command;
/*     */ 
/*     */ import java.math.BigInteger;
/*     */ import java.util.Comparator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.comparisons.ComparisonsKt;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\f\n\002\b\004\n\002\020\b\n\002\b\004\020\b\032\0020\004\"\004\b\000\020\0002\016\020\002\032\n \001*\004\030\0018\0008\0002\016\020\003\032\n \001*\004\030\0018\0008\000H\n¢\006\004\b\005\020\006¨\006\007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1", "<anonymous>"})
/*     */ @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 CobbleDollarsCommand.kt\nfr/harmex/cobbledollars/common/command/CobbleDollarsCommand\n*L\n1#1,121:1\n189#2:122\n*E\n"})
/*     */ public final class CobbleDollarsCommand$displayLeaderboard$$inlined$sortedByDescending$1<T> implements Comparator {
/*     */   public final int compare(Object a, Object b) {
/* 121 */     Pair pair = (Pair)b;
/* 121 */     int $i$a$-sortedByDescending-CobbleDollarsCommand$displayLeaderboard$leaderboard$2 = 0;
/* 122 */     BigInteger balance = (BigInteger)pair.component2();
/*     */     pair = (Pair)a;
/* 122 */     BigInteger bigInteger1 = balance;
/*     */     $i$a$-sortedByDescending-CobbleDollarsCommand$displayLeaderboard$leaderboard$2 = 0;
/* 122 */     balance = (BigInteger)pair.component2();
/* 122 */     return ComparisonsKt.compareValues(bigInteger1, balance);
/*     */   }
/*     */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\command\CobbleDollarsCommand$displayLeaderboard$$inlined$sortedByDescending$1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */