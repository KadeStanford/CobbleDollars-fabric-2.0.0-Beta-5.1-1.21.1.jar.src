/*    */ package fr.harmex.cobbledollars.common.command.arguments;
/*    */ 
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*    */ import java.math.BigInteger;
/*    */ import java.util.Collection;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\006\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\036\n\002\b\004\n\002\030\002\n\002\b\007\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\r\020\005\032\0020\004¢\006\004\b\005\020\006J\025\020\005\032\0020\0042\006\020\b\032\0020\007¢\006\004\b\005\020\tJ\025\020\005\032\0020\0042\006\020\b\032\0020\n¢\006\004\b\005\020\013J\035\020\005\032\0020\0042\006\020\b\032\0020\0072\006\020\f\032\0020\007¢\006\004\b\005\020\rJ\035\020\005\032\0020\0042\006\020\b\032\0020\n2\006\020\f\032\0020\007¢\006\004\b\005\020\016J\035\020\005\032\0020\0042\006\020\b\032\0020\0072\006\020\f\032\0020\n¢\006\004\b\005\020\017J\035\020\005\032\0020\0042\006\020\b\032\0020\n2\006\020\f\032\0020\n¢\006\004\b\005\020\020J!\020\025\032\0020\0072\n\020\022\032\006\022\002\b\0030\0212\006\020\024\032\0020\023¢\006\004\b\025\020\026R\035\020\030\032\b\022\004\022\0020\0230\0278\006¢\006\f\n\004\b\030\020\031\032\004\b\032\020\033R\027\020\035\032\0020\0348\006¢\006\f\n\004\b\035\020\036\032\004\b\037\020 R\027\020!\032\0020\0348\006¢\006\f\n\004\b!\020\036\032\004\b\"\020 ¨\006#"}, d2 = {"Lfr/harmex/cobbledollars/common/command/arguments/BigIntegerArgumentType$Companion;", "", "<init>", "()V", "Lfr/harmex/cobbledollars/common/command/arguments/BigIntegerArgumentType;", "bigInt", "()Lfr/harmex/cobbledollars/common/command/arguments/BigIntegerArgumentType;", "Ljava/math/BigInteger;", "min", "(Ljava/math/BigInteger;)Lfr/harmex/cobbledollars/common/command/arguments/BigIntegerArgumentType;", "", "(I)Lfr/harmex/cobbledollars/common/command/arguments/BigIntegerArgumentType;", "max", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)Lfr/harmex/cobbledollars/common/command/arguments/BigIntegerArgumentType;", "(ILjava/math/BigInteger;)Lfr/harmex/cobbledollars/common/command/arguments/BigIntegerArgumentType;", "(Ljava/math/BigInteger;I)Lfr/harmex/cobbledollars/common/command/arguments/BigIntegerArgumentType;", "(II)Lfr/harmex/cobbledollars/common/command/arguments/BigIntegerArgumentType;", "Lcom/mojang/brigadier/context/CommandContext;", "context", "", "name", "getBigInteger", "(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/math/BigInteger;", "", "EXAMPLES", "Ljava/util/Collection;", "getEXAMPLES", "()Ljava/util/Collection;", "Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", "BIG_INT_TOO_SMALL", "Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", "getBIG_INT_TOO_SMALL", "()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", "BIG_INT_TOO_BIG", "getBIG_INT_TOO_BIG", "common"})
/*    */ public final class Companion {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final Collection<String> getEXAMPLES() {
/* 13 */     return BigIntegerArgumentType.access$getEXAMPLES$cp();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Dynamic2CommandExceptionType getBIG_INT_TOO_SMALL() {
/* 14 */     return BigIntegerArgumentType.access$getBIG_INT_TOO_SMALL$cp();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Dynamic2CommandExceptionType getBIG_INT_TOO_BIG() {
/* 15 */     return BigIntegerArgumentType.access$getBIG_INT_TOO_BIG$cp();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final BigIntegerArgumentType bigInt() {
/* 17 */     return new BigIntegerArgumentType(null, null, 3, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final BigIntegerArgumentType bigInt(@NotNull BigInteger min) {
/* 18 */     Intrinsics.checkNotNullParameter(min, "min");
/* 18 */     return new BigIntegerArgumentType(min, null, 2, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final BigIntegerArgumentType bigInt(int min) {
/* 19 */     Intrinsics.checkNotNullExpressionValue(BigInteger.valueOf(min), "valueOf(...)");
/* 19 */     return bigInt(BigInteger.valueOf(min));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final BigIntegerArgumentType bigInt(@NotNull BigInteger min, @NotNull BigInteger max) {
/* 20 */     Intrinsics.checkNotNullParameter(min, "min");
/* 20 */     Intrinsics.checkNotNullParameter(max, "max");
/* 20 */     return new BigIntegerArgumentType(min, max);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final BigIntegerArgumentType bigInt(int min, @NotNull BigInteger max) {
/* 21 */     Intrinsics.checkNotNullParameter(max, "max");
/* 21 */     Intrinsics.checkNotNullExpressionValue(BigInteger.valueOf(min), "valueOf(...)");
/* 21 */     return bigInt(BigInteger.valueOf(min), max);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final BigIntegerArgumentType bigInt(@NotNull BigInteger min, int max) {
/* 22 */     Intrinsics.checkNotNullParameter(min, "min");
/* 22 */     Intrinsics.checkNotNullExpressionValue(BigInteger.valueOf(max), "valueOf(...)");
/* 22 */     return bigInt(min, BigInteger.valueOf(max));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final BigIntegerArgumentType bigInt(int min, int max) {
/* 23 */     Intrinsics.checkNotNullExpressionValue(BigInteger.valueOf(min), "valueOf(...)");
/* 23 */     Intrinsics.checkNotNullExpressionValue(BigInteger.valueOf(max), "valueOf(...)");
/* 23 */     return bigInt(BigInteger.valueOf(min), BigInteger.valueOf(max));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final BigInteger getBigInteger(@NotNull CommandContext context, @NotNull String name) {
/* 25 */     Intrinsics.checkNotNullParameter(context, "context");
/* 25 */     Intrinsics.checkNotNullParameter(name, "name");
/* 25 */     Intrinsics.checkNotNullExpressionValue(context.getArgument(name, BigInteger.class), "getArgument(...)");
/* 25 */     return (BigInteger)context.getArgument(name, BigInteger.class);
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\command\arguments\BigIntegerArgumentType$Companion.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */