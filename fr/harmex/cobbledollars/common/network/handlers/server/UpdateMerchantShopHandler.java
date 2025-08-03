/*    */ package fr.harmex.cobbledollars.common.network.handlers.server;
/*    */ 
/*    */ import com.cobblemon.mod.common.api.net.NetworkPacket;
/*    */ import com.cobblemon.mod.common.api.net.ServerNetworkPacketHandler;
/*    */ import fr.harmex.cobbledollars.common.network.packets.c2s.UpdateMerchantShopPacket;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.CobbleDollarsShopHolder;
/*    */ import java.util.Iterator;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import net.minecraft.class_1297;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_3218;
/*    */ import net.minecraft.class_3222;
/*    */ import net.minecraft.class_5321;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\003\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J'\020\013\032\0020\n2\006\020\005\032\0020\0022\006\020\007\032\0020\0062\006\020\t\032\0020\bH\026¢\006\004\b\013\020\f¨\006\r"}, d2 = {"Lfr/harmex/cobbledollars/common/network/handlers/server/UpdateMerchantShopHandler;", "Lcom/cobblemon/mod/common/api/net/ServerNetworkPacketHandler;", "Lfr/harmex/cobbledollars/common/network/packets/c2s/UpdateMerchantShopPacket;", "<init>", "()V", "packet", "Lnet/minecraft/server/MinecraftServer;", "server", "Lnet/minecraft/class_3222;", "player", "", "handle", "(Lfr/harmex/cobbledollars/common/network/packets/c2s/UpdateMerchantShopPacket;Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/class_3222;)V", "common"})
/*    */ @SourceDebugExtension({"SMAP\nUpdateMerchantShopHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateMerchantShopHandler.kt\nfr/harmex/cobbledollars/common/network/handlers/server/UpdateMerchantShopHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,26:1\n1863#2,2:27\n*S KotlinDebug\n*F\n+ 1 UpdateMerchantShopHandler.kt\nfr/harmex/cobbledollars/common/network/handlers/server/UpdateMerchantShopHandler\n*L\n18#1:27,2\n*E\n"})
/*    */ public final class UpdateMerchantShopHandler implements ServerNetworkPacketHandler<UpdateMerchantShopPacket> {
/*    */   @NotNull
/*    */   public static final UpdateMerchantShopHandler INSTANCE = new UpdateMerchantShopHandler();
/*    */   
/*    */   public void handle(@NotNull UpdateMerchantShopPacket packet, @NotNull MinecraftServer server, @NotNull class_3222 player) {
/*    */     Iterator iterator;
/* 13 */     Intrinsics.checkNotNullParameter(packet, "packet");
/* 13 */     Intrinsics.checkNotNullParameter(server, "server");
/* 13 */     Intrinsics.checkNotNullParameter(player, "player");
/* 13 */     class_5321 dimension = player.method_37908().method_27983();
/* 14 */     class_3218 level = server.method_3847(dimension);
/* 15 */     class_1297 class_1297 = (level != null) ? level.method_14190(packet.getMerchantUUID()) : null;
/* 15 */     CobbleDollarsShopHolder cobbleMerchant = (class_1297 instanceof CobbleDollarsShopHolder) ? (CobbleDollarsShopHolder)class_1297 : null;
/* 16 */     if (cobbleMerchant != null) {
/* 17 */       cobbleMerchant.setShop(packet.getShop());
/* 18 */       Iterable $this$forEach$iv = cobbleMerchant.getTradingPlayers();
/* 18 */       int $i$f$forEach = 0;
/* 27 */       iterator = $this$forEach$iv.iterator();
/*    */     } else {
/*    */       return;
/*    */     } 
/* 27 */     if (iterator.hasNext()) {
/* 27 */       Object element$iv = iterator.next();
/* 27 */       class_1657 tradingPlayer = (class_1657)element$iv;
/* 27 */       int $i$a$-forEach-UpdateMerchantShopHandler$handle$1 = 0;
/*    */       Intrinsics.checkNotNull(tradingPlayer, "null cannot be cast to non-null type net.minecraft.server.level.ServerPlayer");
/*    */       (class_3222)tradingPlayer;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\network\handlers\server\UpdateMerchantShopHandler.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */