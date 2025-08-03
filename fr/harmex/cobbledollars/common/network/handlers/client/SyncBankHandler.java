/*    */ package fr.harmex.cobbledollars.common.network.handlers.client;
/*    */ 
/*    */ import com.cobblemon.mod.common.api.net.ClientNetworkPacketHandler;
/*    */ import com.cobblemon.mod.common.api.net.NetworkPacket;
/*    */ import fr.harmex.cobbledollars.common.network.packets.s2c.SyncBankPacket;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1703;
/*    */ import net.minecraft.class_310;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\002\b\003\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\037\020\t\032\0020\b2\006\020\005\032\0020\0022\006\020\007\032\0020\006H\026¢\006\004\b\t\020\n¨\006\013"}, d2 = {"Lfr/harmex/cobbledollars/common/network/handlers/client/SyncBankHandler;", "Lcom/cobblemon/mod/common/api/net/ClientNetworkPacketHandler;", "Lfr/harmex/cobbledollars/common/network/packets/s2c/SyncBankPacket;", "<init>", "()V", "packet", "Lnet/minecraft/class_310;", "client", "", "handle", "(Lfr/harmex/cobbledollars/common/network/packets/s2c/SyncBankPacket;Lnet/minecraft/class_310;)V", "common"})
/*    */ public final class SyncBankHandler implements ClientNetworkPacketHandler<SyncBankPacket> {
/*    */   @NotNull
/*    */   public static final SyncBankHandler INSTANCE = new SyncBankHandler();
/*    */   
/*    */   public void handle(@NotNull SyncBankPacket packet, @NotNull class_310 client) {
/* 10 */     Intrinsics.checkNotNullParameter(packet, "packet");
/* 10 */     Intrinsics.checkNotNullParameter(client, "client");
/* 10 */     class_1703 class_1703 = (client.field_1724 != null) ? client.field_1724.field_7512 : null;
/* 10 */     Object object = (class_1703 instanceof fr.harmex.cobbledollars.common.world.inventory.BankMenu) ? class_1703 : null;
/* 10 */     int $i$a$-let-SyncBankHandler$handle$1 = 0;
/* 11 */     if (((class_1703)object).field_7763 == packet.getContainerId())
/* 12 */       object.getCobbleMerchant().setMerchantUUID(packet.getMerchantUUID()); 
/*    */     (class_1703 instanceof fr.harmex.cobbledollars.common.world.inventory.BankMenu) ? class_1703 : null;
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\network\handlers\client\SyncBankHandler.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */