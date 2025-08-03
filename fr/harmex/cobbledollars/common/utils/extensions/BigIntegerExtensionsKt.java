/*    */ package fr.harmex.cobbledollars.common.utils.extensions;
/*    */ 
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*    */ import java.math.BigDecimal;
/*    */ import java.math.BigInteger;
/*    */ import java.math.RoundingMode;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_5250;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\b\b\032\023\020\002\032\004\030\0010\001*\0020\000¢\006\004\b\002\020\003\032\033\020\007\032\0020\006*\0020\0012\b\b\002\020\005\032\0020\004¢\006\004\b\007\020\b\032\033\020\t\032\0020\006*\0020\0012\b\b\002\020\005\032\0020\004¢\006\004\b\t\020\b\032!\020\f\032\0020\001*\0020\0012\006\020\n\032\0020\0012\006\020\013\032\0020\001¢\006\004\b\f\020\r¨\006\016"}, d2 = {"Lcom/mojang/brigadier/StringReader;", "Ljava/math/BigInteger;", "readBigInt", "(Lcom/mojang/brigadier/StringReader;)Ljava/math/BigInteger;", "", "dollarSign", "Lnet/minecraft/class_5250;", "format", "(Ljava/math/BigInteger;Z)Lnet/minecraft/class_5250;", "formatFull", "min", "max", "clamp", "(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;", "common"})
/*    */ public final class BigIntegerExtensionsKt {
/*    */   @Nullable
/*    */   public static final BigInteger readBigInt(@NotNull StringReader $this$readBigInt) {
/* 12 */     Intrinsics.checkNotNullParameter($this$readBigInt, "<this>");
/* 12 */     Intrinsics.checkNotNullExpressionValue($this$readBigInt.readString(), "readString(...)");
/* 12 */     return MiscUtilsKt.parseBigIntegerOrNull($this$readBigInt.readString());
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final class_5250 format(@NotNull BigInteger $this$format, boolean dollarSign) {
/* 15 */     Intrinsics.checkNotNullParameter($this$format, "<this>");
/* 15 */     String[] arrayOfString1 = new String[22];
/* 15 */     arrayOfString1[0] = "";
/* 15 */     arrayOfString1[1] = "K";
/* 15 */     arrayOfString1[2] = "M";
/* 15 */     arrayOfString1[3] = "B";
/* 15 */     arrayOfString1[4] = "T";
/* 15 */     arrayOfString1[5] = "Q";
/* 15 */     arrayOfString1[6] = "Qi";
/* 15 */     arrayOfString1[7] = "Sx";
/* 15 */     arrayOfString1[8] = "Sp";
/* 15 */     arrayOfString1[9] = "O";
/* 15 */     arrayOfString1[10] = "N";
/* 15 */     arrayOfString1[11] = "D";
/* 15 */     arrayOfString1[12] = "UD";
/* 15 */     arrayOfString1[13] = "DD";
/* 15 */     arrayOfString1[14] = "TD";
/* 15 */     arrayOfString1[15] = "QD";
/* 15 */     arrayOfString1[16] = "QiD";
/* 15 */     arrayOfString1[17] = "SxD";
/* 15 */     arrayOfString1[18] = "SpD";
/* 15 */     arrayOfString1[19] = "OcD";
/* 15 */     arrayOfString1[20] = "ND";
/* 15 */     arrayOfString1[21] = "Vg";
/* 15 */     String[] suffixes = arrayOfString1;
/* 16 */     BigDecimal value = new BigDecimal($this$format);
/* 17 */     int magnitude = 0;
/* 19 */     while (value.abs().compareTo(new BigDecimal("1000")) >= 0 && magnitude < suffixes.length - 1) {
/* 20 */       value = value.divide(new BigDecimal("1000"));
/* 21 */       magnitude++;
/*    */     } 
/* 23 */     value = value.setScale(3 - value.toBigInteger().toString().length() - suffixes[magnitude].length() - 1, RoundingMode.DOWN);
/* 24 */     value = value.stripTrailingZeros();
/* 26 */     return MiscUtilsKt.toComponent((dollarSign ? "$ " : "") + (dollarSign ? "$ " : "") + value.toPlainString());
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final class_5250 formatFull(@NotNull BigInteger $this$formatFull, boolean dollarSign) {
/* 29 */     Intrinsics.checkNotNullParameter($this$formatFull, "<this>");
/* 29 */     return MiscUtilsKt.toComponent((dollarSign ? "$ " : "") + (dollarSign ? "$ " : ""));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final BigInteger clamp(@NotNull BigInteger $this$clamp, @NotNull BigInteger min, @NotNull BigInteger max) {
/* 32 */     Intrinsics.checkNotNullParameter($this$clamp, "<this>");
/* 32 */     Intrinsics.checkNotNullParameter(min, "min");
/* 32 */     Intrinsics.checkNotNullParameter(max, "max");
/* 32 */     Intrinsics.checkNotNullExpressionValue($this$clamp.max(min).min(max), "min(...)");
/* 32 */     return $this$clamp.max(min).min(max);
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\commo\\utils\extensions\BigIntegerExtensionsKt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */