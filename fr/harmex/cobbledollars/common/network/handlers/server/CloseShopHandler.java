/*    */ package fr.harmex.cobbledollars.common.network.handlers.server;
/*    */ 
/*    */ import com.cobblemon.mod.common.api.net.NetworkPacket;
/*    */ import com.cobblemon.mod.common.api.net.ServerNetworkPacketHandler;
/*    */ import fr.harmex.cobbledollars.common.network.packets.c2s.CloseShopPacket;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.CobbleDollarsShopHolder;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1297;
/*    */ import net.minecraft.class_3218;
/*    */ import net.minecraft.class_3222;
/*    */ import net.minecraft.class_5321;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\003\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J'\020\013\032\0020\n2\006\020\005\032\0020\0022\006\020\007\032\0020\0062\006\020\t\032\0020\bH\026¢\006\004\b\013\020\f¨\006\r"}, d2 = {"Lfr/harmex/cobbledollars/common/network/handlers/server/CloseShopHandler;", "Lcom/cobblemon/mod/common/api/net/ServerNetworkPacketHandler;", "Lfr/harmex/cobbledollars/common/network/packets/c2s/CloseShopPacket;", "<init>", "()V", "packet", "Lnet/minecraft/server/MinecraftServer;", "server", "Lnet/minecraft/class_3222;", "player", "", "handle", "(Lfr/harmex/cobbledollars/common/network/packets/c2s/CloseShopPacket;Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/class_3222;)V", "common"})
/*    */ public final class CloseShopHandler implements ServerNetworkPacketHandler<CloseShopPacket> {
/*    */   @NotNull
/*    */   public static final CloseShopHandler INSTANCE = new CloseShopHandler();
/*    */   
/*    */   public void handle(@NotNull CloseShopPacket packet, @NotNull MinecraftServer server, @NotNull class_3222 player) {
/* 11 */     Intrinsics.checkNotNullParameter(packet, "packet");
/* 11 */     Intrinsics.checkNotNullParameter(server, "server");
/* 11 */     Intrinsics.checkNotNullParameter(player, "player");
/* 11 */     class_5321 dimension = player.method_37908().method_27983();
/* 12 */     class_3218 level = server.method_3847(dimension);
/* 13 */     class_1297 class_1297 = (level != null) ? level.method_14190(packet.getMerchantUUID()) : null;
/* 13 */     CobbleDollarsShopHolder cobbleMerchant = (class_1297 instanceof CobbleDollarsShopHolder) ? (CobbleDollarsShopHolder)class_1297 : null;
/* 14 */     if (cobbleMerchant != null && cobbleMerchant.getTradingPlayers() != null) {
/* 14 */       cobbleMerchant.getTradingPlayers().remove(player);
/*    */     } else {
/* 14 */       cobbleMerchant.getTradingPlayers();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\network\handlers\server\CloseShopHandler.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */