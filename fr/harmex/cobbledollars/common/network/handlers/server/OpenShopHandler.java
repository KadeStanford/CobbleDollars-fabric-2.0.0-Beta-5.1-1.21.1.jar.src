/*    */ package fr.harmex.cobbledollars.common.network.handlers.server;
/*    */ 
/*    */ import com.cobblemon.mod.common.api.net.NetworkPacket;
/*    */ import com.cobblemon.mod.common.api.net.ServerNetworkPacketHandler;
/*    */ import fr.harmex.cobbledollars.common.network.packets.c2s.OpenShopPacket;
/*    */ import fr.harmex.cobbledollars.common.utils.extensions.PlayerExtensionKt;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.CobbleDollarsShopHolder;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1297;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_3218;
/*    */ import net.minecraft.class_3222;
/*    */ import net.minecraft.class_5321;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\003\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J'\020\013\032\0020\n2\006\020\005\032\0020\0022\006\020\007\032\0020\0062\006\020\t\032\0020\bH\026¢\006\004\b\013\020\f¨\006\r"}, d2 = {"Lfr/harmex/cobbledollars/common/network/handlers/server/OpenShopHandler;", "Lcom/cobblemon/mod/common/api/net/ServerNetworkPacketHandler;", "Lfr/harmex/cobbledollars/common/network/packets/c2s/OpenShopPacket;", "<init>", "()V", "packet", "Lnet/minecraft/server/MinecraftServer;", "server", "Lnet/minecraft/class_3222;", "player", "", "handle", "(Lfr/harmex/cobbledollars/common/network/packets/c2s/OpenShopPacket;Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/class_3222;)V", "common"})
/*    */ public final class OpenShopHandler implements ServerNetworkPacketHandler<OpenShopPacket> {
/*    */   @NotNull
/*    */   public static final OpenShopHandler INSTANCE = new OpenShopHandler();
/*    */   
/*    */   public void handle(@NotNull OpenShopPacket packet, @NotNull MinecraftServer server, @NotNull class_3222 player) {
/* 12 */     Intrinsics.checkNotNullParameter(packet, "packet");
/* 12 */     Intrinsics.checkNotNullParameter(server, "server");
/* 12 */     Intrinsics.checkNotNullParameter(player, "player");
/* 12 */     class_5321 dimension = player.method_37908().method_27983();
/* 13 */     class_3218 level = server.method_3847(dimension);
/* 14 */     class_1297 class_1297 = (level != null) ? level.method_14190(packet.getMerchantUUID()) : null;
/* 14 */     CobbleDollarsShopHolder cobbleMerchant = (class_1297 instanceof CobbleDollarsShopHolder) ? (CobbleDollarsShopHolder)class_1297 : null;
/* 15 */     if (cobbleMerchant != null) {
/* 16 */       PlayerExtensionKt.openShop$default((class_1657)player, cobbleMerchant, false, 2, null);
/* 17 */       cobbleMerchant.getTradingPlayers().add(player);
/*    */     } else {
/* 19 */       PlayerExtensionKt.openShop$default((class_1657)player, null, false, 3, null);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\network\handlers\server\OpenShopHandler.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */