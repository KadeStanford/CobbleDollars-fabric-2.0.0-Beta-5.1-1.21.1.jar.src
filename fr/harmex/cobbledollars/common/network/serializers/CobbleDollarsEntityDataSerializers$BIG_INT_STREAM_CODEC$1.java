/*    */ package fr.harmex.cobbledollars.common.network.serializers;
/*    */ 
/*    */ import fr.harmex.cobbledollars.common.utils.extensions.FriendlyByteBufExtensionKt;
/*    */ import java.math.BigInteger;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_2540;
/*    */ import net.minecraft.class_9129;
/*    */ import net.minecraft.class_9139;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\003*\001\000\b\n\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001J\027\020\005\032\0020\0032\006\020\004\032\0020\002H\026¢\006\004\b\005\020\006J\037\020\t\032\0020\b2\006\020\004\032\0020\0022\006\020\007\032\0020\003H\026¢\006\004\b\t\020\n¨\006\013"}, d2 = {"fr/harmex/cobbledollars/common/network/serializers/CobbleDollarsEntityDataSerializers.BIG_INT_STREAM_CODEC.1", "Lnet/minecraft/class_9139;", "Lnet/minecraft/class_9129;", "Ljava/math/BigInteger;", "buf", "decode", "(Lnet/minecraft/class_9129;)Ljava/math/BigInteger;", "bigInt", "", "encode", "(Lnet/minecraft/class_9129;Ljava/math/BigInteger;)V", "common"})
/*    */ public final class CobbleDollarsEntityDataSerializers$BIG_INT_STREAM_CODEC$1 implements class_9139<class_9129, BigInteger> {
/*    */   public BigInteger decode(class_9129 buf) {
/* 12 */     Intrinsics.checkNotNullParameter(buf, "buf");
/* 12 */     return FriendlyByteBufExtensionKt.readBigInt((class_2540)buf);
/*    */   }
/*    */   
/*    */   public void encode(class_9129 buf, BigInteger bigInt) {
/* 14 */     Intrinsics.checkNotNullParameter(buf, "buf");
/* 14 */     Intrinsics.checkNotNullParameter(bigInt, "bigInt");
/* 14 */     FriendlyByteBufExtensionKt.writeBigInt((class_2540)buf, bigInt);
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\network\serializers\CobbleDollarsEntityDataSerializers$BIG_INT_STREAM_CODEC$1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */