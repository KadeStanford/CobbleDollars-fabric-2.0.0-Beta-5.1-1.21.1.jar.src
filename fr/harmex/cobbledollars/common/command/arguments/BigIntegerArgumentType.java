/*    */ package fr.harmex.cobbledollars.common.command.arguments;
/*    */ 
/*    */ import com.mojang.brigadier.ImmutableStringReader;
/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*    */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*    */ import fr.harmex.cobbledollars.common.utils.extensions.BigIntegerExtensionsKt;
/*    */ import java.math.BigInteger;
/*    */ import java.util.Collection;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020\036\n\002\020\016\n\002\b\b\030\000 \0232\b\022\004\022\0020\0020\001:\001\023B\037\022\n\b\002\020\003\032\004\030\0010\002\022\n\b\002\020\004\032\004\030\0010\002¢\006\004\b\005\020\006J\027\020\t\032\0020\0022\006\020\b\032\0020\007H\026¢\006\004\b\t\020\nJ\025\020\r\032\b\022\004\022\0020\f0\013H\026¢\006\004\b\r\020\016R\031\020\003\032\004\030\0010\0028\006¢\006\f\n\004\b\003\020\017\032\004\b\020\020\021R\031\020\004\032\004\030\0010\0028\006¢\006\f\n\004\b\004\020\017\032\004\b\022\020\021¨\006\024"}, d2 = {"Lfr/harmex/cobbledollars/common/command/arguments/BigIntegerArgumentType;", "Lcom/mojang/brigadier/arguments/ArgumentType;", "Ljava/math/BigInteger;", "min", "max", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V", "Lcom/mojang/brigadier/StringReader;", "reader", "parse", "(Lcom/mojang/brigadier/StringReader;)Ljava/math/BigInteger;", "", "", "getExamples", "()Ljava/util/Collection;", "Ljava/math/BigInteger;", "getMin", "()Ljava/math/BigInteger;", "getMax", "Companion", "common"})
/*    */ public final class BigIntegerArgumentType implements ArgumentType<BigInteger> {
/*    */   public BigIntegerArgumentType(@Nullable BigInteger min, @Nullable BigInteger max) {
/* 11 */     this.min = min;
/* 11 */     this.max = max;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final BigInteger getMin() {
/* 11 */     return this.min;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final BigInteger getMax() {
/* 11 */     return this.max;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\006\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\036\n\002\b\004\n\002\030\002\n\002\b\007\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\r\020\005\032\0020\004¢\006\004\b\005\020\006J\025\020\005\032\0020\0042\006\020\b\032\0020\007¢\006\004\b\005\020\tJ\025\020\005\032\0020\0042\006\020\b\032\0020\n¢\006\004\b\005\020\013J\035\020\005\032\0020\0042\006\020\b\032\0020\0072\006\020\f\032\0020\007¢\006\004\b\005\020\rJ\035\020\005\032\0020\0042\006\020\b\032\0020\n2\006\020\f\032\0020\007¢\006\004\b\005\020\016J\035\020\005\032\0020\0042\006\020\b\032\0020\0072\006\020\f\032\0020\n¢\006\004\b\005\020\017J\035\020\005\032\0020\0042\006\020\b\032\0020\n2\006\020\f\032\0020\n¢\006\004\b\005\020\020J!\020\025\032\0020\0072\n\020\022\032\006\022\002\b\0030\0212\006\020\024\032\0020\023¢\006\004\b\025\020\026R\035\020\030\032\b\022\004\022\0020\0230\0278\006¢\006\f\n\004\b\030\020\031\032\004\b\032\020\033R\027\020\035\032\0020\0348\006¢\006\f\n\004\b\035\020\036\032\004\b\037\020 R\027\020!\032\0020\0348\006¢\006\f\n\004\b!\020\036\032\004\b\"\020 ¨\006#"}, d2 = {"Lfr/harmex/cobbledollars/common/command/arguments/BigIntegerArgumentType$Companion;", "", "<init>", "()V", "Lfr/harmex/cobbledollars/common/command/arguments/BigIntegerArgumentType;", "bigInt", "()Lfr/harmex/cobbledollars/common/command/arguments/BigIntegerArgumentType;", "Ljava/math/BigInteger;", "min", "(Ljava/math/BigInteger;)Lfr/harmex/cobbledollars/common/command/arguments/BigIntegerArgumentType;", "", "(I)Lfr/harmex/cobbledollars/common/command/arguments/BigIntegerArgumentType;", "max", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)Lfr/harmex/cobbledollars/common/command/arguments/BigIntegerArgumentType;", "(ILjava/math/BigInteger;)Lfr/harmex/cobbledollars/common/command/arguments/BigIntegerArgumentType;", "(Ljava/math/BigInteger;I)Lfr/harmex/cobbledollars/common/command/arguments/BigIntegerArgumentType;", "(II)Lfr/harmex/cobbledollars/common/command/arguments/BigIntegerArgumentType;", "Lcom/mojang/brigadier/context/CommandContext;", "context", "", "name", "getBigInteger", "(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/math/BigInteger;", "", "EXAMPLES", "Ljava/util/Collection;", "getEXAMPLES", "()Ljava/util/Collection;", "Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", "BIG_INT_TOO_SMALL", "Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", "getBIG_INT_TOO_SMALL", "()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", "BIG_INT_TOO_BIG", "getBIG_INT_TOO_BIG", "common"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final Collection<String> getEXAMPLES() {
/* 13 */       return BigIntegerArgumentType.EXAMPLES;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Dynamic2CommandExceptionType getBIG_INT_TOO_SMALL() {
/* 14 */       return BigIntegerArgumentType.BIG_INT_TOO_SMALL;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Dynamic2CommandExceptionType getBIG_INT_TOO_BIG() {
/* 15 */       return BigIntegerArgumentType.BIG_INT_TOO_BIG;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final BigIntegerArgumentType bigInt() {
/* 17 */       return new BigIntegerArgumentType(null, null, 3, null);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final BigIntegerArgumentType bigInt(@NotNull BigInteger min) {
/* 18 */       Intrinsics.checkNotNullParameter(min, "min");
/* 18 */       return new BigIntegerArgumentType(min, null, 2, null);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final BigIntegerArgumentType bigInt(int min) {
/* 19 */       Intrinsics.checkNotNullExpressionValue(BigInteger.valueOf(min), "valueOf(...)");
/* 19 */       return bigInt(BigInteger.valueOf(min));
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final BigIntegerArgumentType bigInt(@NotNull BigInteger min, @NotNull BigInteger max) {
/* 20 */       Intrinsics.checkNotNullParameter(min, "min");
/* 20 */       Intrinsics.checkNotNullParameter(max, "max");
/* 20 */       return new BigIntegerArgumentType(min, max);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final BigIntegerArgumentType bigInt(int min, @NotNull BigInteger max) {
/* 21 */       Intrinsics.checkNotNullParameter(max, "max");
/* 21 */       Intrinsics.checkNotNullExpressionValue(BigInteger.valueOf(min), "valueOf(...)");
/* 21 */       return bigInt(BigInteger.valueOf(min), max);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final BigIntegerArgumentType bigInt(@NotNull BigInteger min, int max) {
/* 22 */       Intrinsics.checkNotNullParameter(min, "min");
/* 22 */       Intrinsics.checkNotNullExpressionValue(BigInteger.valueOf(max), "valueOf(...)");
/* 22 */       return bigInt(min, BigInteger.valueOf(max));
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final BigIntegerArgumentType bigInt(int min, int max) {
/* 23 */       Intrinsics.checkNotNullExpressionValue(BigInteger.valueOf(min), "valueOf(...)");
/* 23 */       Intrinsics.checkNotNullExpressionValue(BigInteger.valueOf(max), "valueOf(...)");
/* 23 */       return bigInt(BigInteger.valueOf(min), BigInteger.valueOf(max));
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final BigInteger getBigInteger(@NotNull CommandContext context, @NotNull String name) {
/* 25 */       Intrinsics.checkNotNullParameter(context, "context");
/* 25 */       Intrinsics.checkNotNullParameter(name, "name");
/* 25 */       Intrinsics.checkNotNullExpressionValue(context.getArgument(name, BigInteger.class), "getArgument(...)");
/* 25 */       return (BigInteger)context.getArgument(name, BigInteger.class);
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @Nullable
/*    */   private final BigInteger min;
/*    */   
/*    */   @Nullable
/*    */   private final BigInteger max;
/*    */   
/*    */   @NotNull
/*    */   private static final Collection<String> EXAMPLES;
/*    */   
/*    */   static {
/*    */     String[] arrayOfString = new String[3];
/*    */     arrayOfString[0] = "0";
/*    */     arrayOfString[1] = "123456789";
/*    */     arrayOfString[2] = "-987654321";
/*    */     EXAMPLES = CollectionsKt.listOf((Object[])arrayOfString);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private static final Dynamic2CommandExceptionType BIG_INT_TOO_SMALL = new Dynamic2CommandExceptionType(BigIntegerArgumentType::BIG_INT_TOO_SMALL$lambda$0);
/*    */   
/*    */   private static final Message BIG_INT_TOO_SMALL$lambda$0(Object result, Object min) {
/*    */     Object[] arrayOfObject = new Object[2];
/*    */     arrayOfObject[0] = min;
/*    */     arrayOfObject[1] = result;
/*    */     return (Message)MiscUtilsKt.cobbleDollarsArgument("big_integer.low", arrayOfObject);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private static final Dynamic2CommandExceptionType BIG_INT_TOO_BIG = new Dynamic2CommandExceptionType(BigIntegerArgumentType::BIG_INT_TOO_BIG$lambda$1);
/*    */   
/*    */   private static final Message BIG_INT_TOO_BIG$lambda$1(Object result, Object max) {
/*    */     Object[] arrayOfObject = new Object[2];
/*    */     arrayOfObject[0] = max;
/*    */     arrayOfObject[1] = result;
/*    */     return (Message)MiscUtilsKt.cobbleDollarsArgument("big_integer.big", arrayOfObject);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public BigInteger parse(@NotNull StringReader reader) {
/* 29 */     Intrinsics.checkNotNullParameter(reader, "reader");
/* 29 */     int start = reader.getCursor();
/* 30 */     Intrinsics.checkNotNull(BigIntegerExtensionsKt.readBigInt(reader));
/* 30 */     BigInteger result = BigIntegerExtensionsKt.readBigInt(reader);
/* 31 */     if (this.min != null && result.compareTo(this.min) < 0) {
/* 32 */       reader.setCursor(start);
/* 33 */       throw BIG_INT_TOO_SMALL.createWithContext((ImmutableStringReader)reader, result, this.min);
/*    */     } 
/* 34 */     if (this.max != null && result.compareTo(this.max) > 0) {
/* 35 */       reader.setCursor(start);
/* 36 */       throw BIG_INT_TOO_BIG.createWithContext((ImmutableStringReader)reader, result, this.max);
/*    */     } 
/* 38 */     return result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Collection<String> getExamples() {
/* 41 */     return EXAMPLES;
/*    */   }
/*    */   
/*    */   public BigIntegerArgumentType() {
/*    */     this(null, null, 3, null);
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\command\arguments\BigIntegerArgumentType.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */