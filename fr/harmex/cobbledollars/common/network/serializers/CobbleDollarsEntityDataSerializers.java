/*    */ package fr.harmex.cobbledollars.common.network.serializers;
/*    */ 
/*    */ import fr.harmex.cobbledollars.common.utils.extensions.FriendlyByteBufExtensionKt;
/*    */ import java.math.BigInteger;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_2540;
/*    */ import net.minecraft.class_2941;
/*    */ import net.minecraft.class_9129;
/*    */ import net.minecraft.class_9139;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\037\n\002\030\002\n\002\020\000\n\002\b\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\005*\001\004\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\024\020\005\032\0020\0048\002X\004¢\006\006\n\004\b\005\020\006R\035\020\t\032\b\022\004\022\0020\b0\0078\006¢\006\f\n\004\b\t\020\n\032\004\b\013\020\f¨\006\r"}, d2 = {"Lfr/harmex/cobbledollars/common/network/serializers/CobbleDollarsEntityDataSerializers;", "", "<init>", "()V", "fr/harmex/cobbledollars/common/network/serializers/CobbleDollarsEntityDataSerializers.BIG_INT_STREAM_CODEC.1", "BIG_INT_STREAM_CODEC", "Lfr/harmex/cobbledollars/common/network/serializers/CobbleDollarsEntityDataSerializers$BIG_INT_STREAM_CODEC$1;", "Lnet/minecraft/class_2941;", "Ljava/math/BigInteger;", "BIG_INT", "Lnet/minecraft/class_2941;", "getBIG_INT", "()Lnet/minecraft/class_2941;", "common"})
/*    */ public final class CobbleDollarsEntityDataSerializers {
/*    */   @NotNull
/* 11 */   public static final CobbleDollarsEntityDataSerializers INSTANCE = new CobbleDollarsEntityDataSerializers();
/*    */   
/*    */   @NotNull
/* 11 */   private static final CobbleDollarsEntityDataSerializers$BIG_INT_STREAM_CODEC$1 BIG_INT_STREAM_CODEC = new CobbleDollarsEntityDataSerializers$BIG_INT_STREAM_CODEC$1();
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\003*\001\000\b\n\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001J\027\020\005\032\0020\0032\006\020\004\032\0020\002H\026¢\006\004\b\005\020\006J\037\020\t\032\0020\b2\006\020\004\032\0020\0022\006\020\007\032\0020\003H\026¢\006\004\b\t\020\n¨\006\013"}, d2 = {"fr/harmex/cobbledollars/common/network/serializers/CobbleDollarsEntityDataSerializers.BIG_INT_STREAM_CODEC.1", "Lnet/minecraft/class_9139;", "Lnet/minecraft/class_9129;", "Ljava/math/BigInteger;", "buf", "decode", "(Lnet/minecraft/class_9129;)Ljava/math/BigInteger;", "bigInt", "", "encode", "(Lnet/minecraft/class_9129;Ljava/math/BigInteger;)V", "common"})
/*    */   public static final class CobbleDollarsEntityDataSerializers$BIG_INT_STREAM_CODEC$1 implements class_9139<class_9129, BigInteger> {
/*    */     public BigInteger decode(class_9129 buf) {
/* 12 */       Intrinsics.checkNotNullParameter(buf, "buf");
/* 12 */       return FriendlyByteBufExtensionKt.readBigInt((class_2540)buf);
/*    */     }
/*    */     
/*    */     public void encode(class_9129 buf, BigInteger bigInt) {
/* 14 */       Intrinsics.checkNotNullParameter(buf, "buf");
/* 14 */       Intrinsics.checkNotNullParameter(bigInt, "bigInt");
/* 14 */       FriendlyByteBufExtensionKt.writeBigInt((class_2540)buf, bigInt);
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/* 18 */   private static final class_2941<BigInteger> BIG_INT = class_2941.method_56031(BIG_INT_STREAM_CODEC);
/*    */   
/*    */   @NotNull
/*    */   public final class_2941<BigInteger> getBIG_INT() {
/* 18 */     return BIG_INT;
/*    */   }
/*    */   
/*    */   static {
/* 18 */     Intrinsics.checkNotNullExpressionValue(class_2941.method_56031(BIG_INT_STREAM_CODEC), "forValueType(...)");
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\network\serializers\CobbleDollarsEntityDataSerializers.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */