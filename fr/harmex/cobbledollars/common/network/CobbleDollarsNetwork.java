/*    */ package fr.harmex.cobbledollars.common.network;
/*    */ 
/*    */ import com.cobblemon.mod.common.api.net.NetworkPacket;
/*    */ import com.cobblemon.mod.common.api.net.PacketHandler;
/*    */ import com.cobblemon.mod.common.net.PacketRegisterInfo;
/*    */ import com.cobblemon.mod.common.util.DistributionUtilsKt;
/*    */ import fr.harmex.cobbledollars.common.CobbleDollars;
/*    */ import fr.harmex.cobbledollars.common.network.handlers.client.SyncBankHandler;
/*    */ import fr.harmex.cobbledollars.common.network.handlers.client.SyncShopConfigHandler;
/*    */ import fr.harmex.cobbledollars.common.network.handlers.client.SyncShopHandler;
/*    */ import fr.harmex.cobbledollars.common.network.handlers.client.UpdateStockHandler;
/*    */ import fr.harmex.cobbledollars.common.network.handlers.server.BuyHandler;
/*    */ import fr.harmex.cobbledollars.common.network.handlers.server.CloseShopHandler;
/*    */ import fr.harmex.cobbledollars.common.network.handlers.server.OpenBankHandler;
/*    */ import fr.harmex.cobbledollars.common.network.handlers.server.OpenShopHandler;
/*    */ import fr.harmex.cobbledollars.common.network.handlers.server.SellHandler;
/*    */ import fr.harmex.cobbledollars.common.network.handlers.server.UpdateMerchantShopHandler;
/*    */ import fr.harmex.cobbledollars.common.network.packets.c2s.BuyPacket;
/*    */ import fr.harmex.cobbledollars.common.network.packets.c2s.CloseShopPacket;
/*    */ import fr.harmex.cobbledollars.common.network.packets.c2s.OpenBankPacket;
/*    */ import fr.harmex.cobbledollars.common.network.packets.c2s.OpenShopPacket;
/*    */ import fr.harmex.cobbledollars.common.network.packets.c2s.SellPacket;
/*    */ import fr.harmex.cobbledollars.common.network.packets.c2s.UpdateMerchantShopPacket;
/*    */ import fr.harmex.cobbledollars.common.network.packets.s2c.SyncBankPacket;
/*    */ import fr.harmex.cobbledollars.common.network.packets.s2c.SyncShopConfigPacket;
/*    */ import fr.harmex.cobbledollars.common.network.packets.s2c.SyncShopPacket;
/*    */ import fr.harmex.cobbledollars.common.network.packets.s2c.UpdateStockPacket;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import net.minecraft.class_3222;
/*    */ import net.minecraft.class_9129;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\b\005\n\002\020\034\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\013\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\035\020\b\032\0020\007*\0020\0042\n\020\006\032\006\022\002\b\0030\005¢\006\004\b\b\020\tJ\031\020\n\032\0020\0072\n\020\006\032\006\022\002\b\0030\005¢\006\004\b\n\020\013J\031\020\f\032\0020\0072\n\020\006\032\006\022\002\b\0030\005¢\006\004\b\f\020\013J'\020\017\032\0020\0072\f\020\016\032\b\022\004\022\0020\0040\r2\n\020\006\032\006\022\002\b\0030\005¢\006\004\b\017\020\020J\031\020\023\032\f\022\b\022\006\022\002\b\0030\0220\021H\002¢\006\004\b\023\020\024J\031\020\025\032\f\022\b\022\006\022\002\b\0030\0220\021H\002¢\006\004\b\025\020\024J!\020\027\032\0020\0072\006\020\026\032\0020\0042\n\020\006\032\006\022\002\b\0030\005¢\006\004\b\027\020\tR!\020\030\032\f\022\b\022\006\022\002\b\0030\0220\0218\006¢\006\f\n\004\b\030\020\031\032\004\b\032\020\024R!\020\033\032\f\022\b\022\006\022\002\b\0030\0220\0218\006¢\006\f\n\004\b\033\020\031\032\004\b\034\020\024¨\006\035"}, d2 = {"Lfr/harmex/cobbledollars/common/network/CobbleDollarsNetwork;", "", "<init>", "()V", "Lnet/minecraft/class_3222;", "Lcom/cobblemon/mod/common/api/net/NetworkPacket;", "packet", "", "sendPacket", "(Lnet/minecraft/class_3222;Lcom/cobblemon/mod/common/api/net/NetworkPacket;)V", "sendToServer", "(Lcom/cobblemon/mod/common/api/net/NetworkPacket;)V", "sendToAllPlayers", "", "players", "sendPacketToPlayers", "(Ljava/lang/Iterable;Lcom/cobblemon/mod/common/api/net/NetworkPacket;)V", "", "Lcom/cobblemon/mod/common/net/PacketRegisterInfo;", "genS2CPacketInfoList", "()Ljava/util/List;", "genC2SPacketInfoList", "player", "sendPacketToPlayer", "s2cPayloads", "Ljava/util/List;", "getS2cPayloads", "c2sPayloads", "getC2sPayloads", "common"})
/*    */ @SourceDebugExtension({"SMAP\nCobbleDollarsNetwork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CobbleDollarsNetwork.kt\nfr/harmex/cobbledollars/common/network/CobbleDollarsNetwork\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1863#2,2:66\n*S KotlinDebug\n*F\n+ 1 CobbleDollarsNetwork.kt\nfr/harmex/cobbledollars/common/network/CobbleDollarsNetwork\n*L\n30#1:66,2\n*E\n"})
/*    */ public final class CobbleDollarsNetwork {
/*    */   public final void sendPacket(@NotNull class_3222 $this$sendPacket, @NotNull NetworkPacket<?> packet) {
/* 22 */     Intrinsics.checkNotNullParameter($this$sendPacket, "<this>");
/* 22 */     Intrinsics.checkNotNullParameter(packet, "packet");
/* 22 */     sendPacketToPlayer($this$sendPacket, packet);
/*    */   }
/*    */   
/*    */   public final void sendToServer(@NotNull NetworkPacket packet) {
/* 26 */     Intrinsics.checkNotNullParameter(packet, "packet");
/* 26 */     CobbleDollars.INSTANCE.getImplementation().getNetworkManager().sendToServer(packet);
/*    */   }
/*    */   
/*    */   public final void sendToAllPlayers(@NotNull NetworkPacket<?> packet) {
/* 29 */     Intrinsics.checkNotNullParameter(packet, "packet");
/* 29 */     Intrinsics.checkNotNull(DistributionUtilsKt.server());
/* 29 */     Intrinsics.checkNotNullExpressionValue(DistributionUtilsKt.server().method_3760().method_14571(), "getPlayers(...)");
/* 29 */     sendPacketToPlayers(DistributionUtilsKt.server().method_3760().method_14571(), packet);
/*    */   }
/*    */   
/*    */   public final void sendPacketToPlayers(@NotNull Iterable players, @NotNull NetworkPacket<?> packet) {
/* 30 */     Intrinsics.checkNotNullParameter(players, "players");
/* 30 */     Intrinsics.checkNotNullParameter(packet, "packet");
/* 30 */     Iterable $this$forEach$iv = players;
/* 30 */     int $i$f$forEach = 0;
/* 66 */     Iterator iterator = $this$forEach$iv.iterator();
/* 66 */     if (iterator.hasNext()) {
/* 66 */       Object element$iv = iterator.next();
/* 66 */       class_3222 it = (class_3222)element$iv;
/* 66 */       int $i$a$-forEach-CobbleDollarsNetwork$sendPacketToPlayers$1 = 0;
/*    */       INSTANCE.sendPacketToPlayer(it, packet);
/*    */     } 
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final CobbleDollarsNetwork INSTANCE = new CobbleDollarsNetwork();
/*    */   
/*    */   @NotNull
/*    */   private static final List<PacketRegisterInfo<?>> s2cPayloads = INSTANCE.genS2CPacketInfoList();
/*    */   
/*    */   @NotNull
/*    */   public final List<PacketRegisterInfo<?>> getS2cPayloads() {
/*    */     return s2cPayloads;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private static final List<PacketRegisterInfo<?>> c2sPayloads = INSTANCE.genC2SPacketInfoList();
/*    */   
/*    */   @NotNull
/*    */   public final List<PacketRegisterInfo<?>> getC2sPayloads() {
/*    */     return c2sPayloads;
/*    */   }
/*    */   
/*    */   private final List<PacketRegisterInfo<?>> genS2CPacketInfoList() {
/*    */     List<PacketRegisterInfo> list = new ArrayList();
/*    */     list.add(new PacketRegisterInfo(SyncShopConfigPacket.Companion.getID(), new CobbleDollarsNetwork$genS2CPacketInfoList$1(SyncShopConfigPacket.Companion), (PacketHandler)SyncShopConfigHandler.INSTANCE, null, 8, null));
/*    */     list.add(new PacketRegisterInfo(SyncShopPacket.Companion.getID(), new CobbleDollarsNetwork$genS2CPacketInfoList$2(SyncShopPacket.Companion), (PacketHandler)SyncShopHandler.INSTANCE, null, 8, null));
/*    */     list.add(new PacketRegisterInfo(SyncBankPacket.Companion.getID(), new CobbleDollarsNetwork$genS2CPacketInfoList$3(SyncBankPacket.Companion), (PacketHandler)SyncBankHandler.INSTANCE, null, 8, null));
/*    */     list.add(new PacketRegisterInfo(UpdateStockPacket.Companion.getID(), new CobbleDollarsNetwork$genS2CPacketInfoList$4(UpdateStockPacket.Companion), (PacketHandler)UpdateStockHandler.INSTANCE, null, 8, null));
/*    */     return (List)list;
/*    */   }
/*    */   
/*    */   private final List<PacketRegisterInfo<?>> genC2SPacketInfoList() {
/*    */     List<PacketRegisterInfo> list = new ArrayList();
/*    */     list.add(new PacketRegisterInfo(BuyPacket.Companion.getID(), new CobbleDollarsNetwork$genC2SPacketInfoList$1(BuyPacket.Companion), (PacketHandler)BuyHandler.INSTANCE, null, 8, null));
/*    */     list.add(new PacketRegisterInfo(SellPacket.Companion.getID(), new CobbleDollarsNetwork$genC2SPacketInfoList$2(SellPacket.Companion), (PacketHandler)SellHandler.INSTANCE, null, 8, null));
/*    */     list.add(new PacketRegisterInfo(OpenShopPacket.Companion.getID(), new CobbleDollarsNetwork$genC2SPacketInfoList$3(OpenShopPacket.Companion), (PacketHandler)OpenShopHandler.INSTANCE, null, 8, null));
/*    */     list.add(new PacketRegisterInfo(OpenBankPacket.Companion.getID(), new CobbleDollarsNetwork$genC2SPacketInfoList$4(OpenBankPacket.Companion), (PacketHandler)OpenBankHandler.INSTANCE, null, 8, null));
/*    */     list.add(new PacketRegisterInfo(UpdateMerchantShopPacket.Companion.getID(), new CobbleDollarsNetwork$genC2SPacketInfoList$5(UpdateMerchantShopPacket.Companion), (PacketHandler)UpdateMerchantShopHandler.INSTANCE, null, 8, null));
/*    */     list.add(new PacketRegisterInfo(CloseShopPacket.Companion.getID(), new CobbleDollarsNetwork$genC2SPacketInfoList$6(CloseShopPacket.Companion), (PacketHandler)CloseShopHandler.INSTANCE, null, 8, null));
/*    */     return (List)list;
/*    */   }
/*    */   
/*    */   public final void sendPacketToPlayer(@NotNull class_3222 player, @NotNull NetworkPacket packet) {
/*    */     Intrinsics.checkNotNullParameter(player, "player");
/*    */     Intrinsics.checkNotNullParameter(packet, "packet");
/*    */     CobbleDollars.INSTANCE.getImplementation().getNetworkManager().sendPacketToPlayer(player, packet);
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\network\CobbleDollarsNetwork.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */