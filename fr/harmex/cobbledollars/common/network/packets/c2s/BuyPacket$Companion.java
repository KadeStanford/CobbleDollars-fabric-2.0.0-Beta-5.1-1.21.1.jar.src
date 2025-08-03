/*    */ package fr.harmex.cobbledollars.common.network.packets.c2s;
/*    */ 
/*    */ import fr.harmex.cobbledollars.common.utils.extensions.FriendlyByteBufExtensionKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_2540;
/*    */ import net.minecraft.class_2960;
/*    */ import net.minecraft.class_9129;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\025\020\007\032\0020\0062\006\020\005\032\0020\004¢\006\004\b\007\020\bR\027\020\n\032\0020\t8\006¢\006\f\n\004\b\n\020\013\032\004\b\f\020\r¨\006\016"}, d2 = {"Lfr/harmex/cobbledollars/common/network/packets/c2s/BuyPacket$Companion;", "", "<init>", "()V", "Lnet/minecraft/class_9129;", "buffer", "Lfr/harmex/cobbledollars/common/network/packets/c2s/BuyPacket;", "decode", "(Lnet/minecraft/class_9129;)Lfr/harmex/cobbledollars/common/network/packets/c2s/BuyPacket;", "Lnet/minecraft/class_2960;", "ID", "Lnet/minecraft/class_2960;", "getID", "()Lnet/minecraft/class_2960;", "common"})
/*    */ public final class Companion {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final class_2960 getID() {
/* 24 */     return BuyPacket.access$getID$cp();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final BuyPacket decode(@NotNull class_9129 buffer) {
/* 25 */     Intrinsics.checkNotNullParameter(buffer, "buffer");
/* 31 */     Intrinsics.checkNotNullExpressionValue(buffer.method_10790(), "readUUID(...)");
/* 31 */     return new BuyPacket(FriendlyByteBufExtensionKt.readOffer((class_2540)buffer), buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readBoolean(), buffer.method_10790());
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\network\packets\c2s\BuyPacket$Companion.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */