/*    */ package fr.harmex.cobbledollars.fabric;
/*    */ 
/*    */ import com.cobblemon.mod.common.NetworkManager;
/*    */ import com.cobblemon.mod.common.api.net.NetworkPacket;
/*    */ import com.cobblemon.mod.common.net.PacketRegisterInfo;
/*    */ import com.cobblemon.mod.fabric.net.FabricPacketInfo;
/*    */ import fr.harmex.cobbledollars.common.network.CobbleDollarsNetwork;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
/*    */ import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
/*    */ import net.minecraft.class_3222;
/*    */ import net.minecraft.class_8710;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\006\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\r\020\005\032\0020\004¢\006\004\b\005\020\003J\r\020\006\032\0020\004¢\006\004\b\006\020\003J\r\020\007\032\0020\004¢\006\004\b\007\020\003J#\020\f\032\0020\0042\006\020\t\032\0020\b2\n\020\013\032\006\022\002\b\0030\nH\026¢\006\004\b\f\020\rJ\033\020\016\032\0020\0042\n\020\013\032\006\022\002\b\0030\nH\026¢\006\004\b\016\020\017¨\006\020"}, d2 = {"Lfr/harmex/cobbledollars/fabric/CobbleDollarsFabricNetworkManager;", "Lcom/cobblemon/mod/common/NetworkManager;", "<init>", "()V", "", "registerMessages", "registerClientHandlers", "registerServerHandlers", "Lnet/minecraft/class_3222;", "player", "Lcom/cobblemon/mod/common/api/net/NetworkPacket;", "packet", "sendPacketToPlayer", "(Lnet/minecraft/class_3222;Lcom/cobblemon/mod/common/api/net/NetworkPacket;)V", "sendToServer", "(Lcom/cobblemon/mod/common/api/net/NetworkPacket;)V", "fabric"})
/*    */ @SourceDebugExtension({"SMAP\nCobbleDollarsFabricNetworkManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CobbleDollarsFabricNetworkManager.kt\nfr/harmex/cobbledollars/fabric/CobbleDollarsFabricNetworkManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1557#2:33\n1628#2,3:34\n1863#2,2:37\n1557#2:39\n1628#2,3:40\n1863#2,2:43\n1557#2:45\n1628#2,3:46\n1863#2,2:49\n1557#2:51\n1628#2,3:52\n1863#2,2:55\n*S KotlinDebug\n*F\n+ 1 CobbleDollarsFabricNetworkManager.kt\nfr/harmex/cobbledollars/fabric/CobbleDollarsFabricNetworkManager\n*L\n13#1:33\n13#1:34,3\n13#1:37,2\n14#1:39\n14#1:40,3\n14#1:43,2\n18#1:45\n18#1:46,3\n18#1:49,2\n22#1:51\n22#1:52,3\n22#1:55,2\n*E\n"})
/*    */ public final class CobbleDollarsFabricNetworkManager implements NetworkManager {
/*    */   @NotNull
/*    */   public static final CobbleDollarsFabricNetworkManager INSTANCE = new CobbleDollarsFabricNetworkManager();
/*    */   
/*    */   public final void registerMessages() {
/* 13 */     Iterable $this$map$iv = CobbleDollarsNetwork.INSTANCE.getS2cPayloads();
/* 13 */     int j = 0;
/* 33 */     Iterable iterable2 = $this$map$iv;
/* 33 */     Collection<FabricPacketInfo> collection1 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
/* 33 */     int $i$f$mapTo = 0;
/* 34 */     for (Object item$iv$iv : iterable2) {
/* 35 */       PacketRegisterInfo packetRegisterInfo = (PacketRegisterInfo)item$iv$iv;
/* 35 */       Collection<FabricPacketInfo> collection = collection1;
/* 35 */       int $i$a$-map-CobbleDollarsFabricNetworkManager$registerMessages$1 = 0;
/* 35 */       collection.add(new FabricPacketInfo(packetRegisterInfo));
/*    */     } 
/* 36 */     $this$map$iv = collection1;
/*    */     int i = 0;
/* 37 */     Iterator iterator2 = $this$map$iv.iterator();
/* 37 */     if (iterator2.hasNext()) {
/* 37 */       Object element$iv = iterator2.next();
/* 37 */       FabricPacketInfo it = (FabricPacketInfo)element$iv;
/* 37 */       int $i$a$-forEach-CobbleDollarsFabricNetworkManager$registerMessages$2 = 0;
/*    */       it.registerPacket(true);
/*    */     } 
/*    */     $this$map$iv = CobbleDollarsNetwork.INSTANCE.getC2sPayloads();
/*    */     int $i$f$map = 0;
/* 39 */     Iterable iterable1 = $this$map$iv;
/* 39 */     Collection<FabricPacketInfo> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
/* 39 */     $i$f$mapTo = 0;
/* 40 */     for (Object item$iv$iv : iterable1) {
/* 41 */       PacketRegisterInfo it = (PacketRegisterInfo)item$iv$iv;
/* 41 */       Collection<FabricPacketInfo> collection = destination$iv$iv;
/* 41 */       int $i$a$-map-CobbleDollarsFabricNetworkManager$registerMessages$3 = 0;
/* 41 */       collection.add(new FabricPacketInfo(it));
/*    */     } 
/* 42 */     Iterable $this$forEach$iv = destination$iv$iv;
/*    */     int $i$f$forEach = 0;
/* 43 */     Iterator iterator1 = $this$forEach$iv.iterator();
/* 43 */     if (iterator1.hasNext()) {
/* 43 */       Object element$iv = iterator1.next();
/* 43 */       FabricPacketInfo it = (FabricPacketInfo)element$iv;
/* 43 */       int $i$a$-forEach-CobbleDollarsFabricNetworkManager$registerMessages$4 = 0;
/*    */       it.registerPacket(false);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void registerClientHandlers() {
/*    */     Iterable $this$map$iv = CobbleDollarsNetwork.INSTANCE.getS2cPayloads();
/*    */     int $i$f$map = 0;
/* 45 */     Iterable iterable1 = $this$map$iv;
/* 45 */     Collection<FabricPacketInfo> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
/* 45 */     int $i$f$mapTo = 0;
/* 46 */     for (Object item$iv$iv : iterable1) {
/* 47 */       PacketRegisterInfo packetRegisterInfo = (PacketRegisterInfo)item$iv$iv;
/* 47 */       Collection<FabricPacketInfo> collection = destination$iv$iv;
/* 47 */       int $i$a$-map-CobbleDollarsFabricNetworkManager$registerClientHandlers$1 = 0;
/* 47 */       collection.add(new FabricPacketInfo(packetRegisterInfo));
/*    */     } 
/* 48 */     $this$map$iv = destination$iv$iv;
/*    */     int $i$f$forEach = 0;
/* 49 */     Iterator iterator = $this$map$iv.iterator();
/* 49 */     if (iterator.hasNext()) {
/* 49 */       Object element$iv = iterator.next();
/* 49 */       FabricPacketInfo it = (FabricPacketInfo)element$iv;
/* 49 */       int $i$a$-forEach-CobbleDollarsFabricNetworkManager$registerClientHandlers$2 = 0;
/*    */       it.registerClientHandler();
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void registerServerHandlers() {
/*    */     Iterable $this$map$iv = CobbleDollarsNetwork.INSTANCE.getC2sPayloads();
/*    */     int $i$f$map = 0;
/* 51 */     Iterable iterable1 = $this$map$iv;
/* 51 */     Collection<FabricPacketInfo> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
/* 51 */     int $i$f$mapTo = 0;
/* 52 */     for (Object item$iv$iv : iterable1) {
/* 53 */       PacketRegisterInfo packetRegisterInfo = (PacketRegisterInfo)item$iv$iv;
/* 53 */       Collection<FabricPacketInfo> collection = destination$iv$iv;
/* 53 */       int $i$a$-map-CobbleDollarsFabricNetworkManager$registerServerHandlers$1 = 0;
/* 53 */       collection.add(new FabricPacketInfo(packetRegisterInfo));
/*    */     } 
/* 54 */     $this$map$iv = destination$iv$iv;
/*    */     int $i$f$forEach = 0;
/* 55 */     Iterator iterator = $this$map$iv.iterator();
/* 55 */     if (iterator.hasNext()) {
/* 55 */       Object element$iv = iterator.next();
/* 55 */       FabricPacketInfo it = (FabricPacketInfo)element$iv;
/* 55 */       int $i$a$-forEach-CobbleDollarsFabricNetworkManager$registerServerHandlers$2 = 0;
/*    */       it.registerServerHandler();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void sendPacketToPlayer(@NotNull class_3222 player, @NotNull NetworkPacket packet) {
/*    */     Intrinsics.checkNotNullParameter(player, "player");
/*    */     Intrinsics.checkNotNullParameter(packet, "packet");
/*    */     ServerPlayNetworking.send(player, (class_8710)packet);
/*    */   }
/*    */   
/*    */   public void sendToServer(@NotNull NetworkPacket packet) {
/*    */     Intrinsics.checkNotNullParameter(packet, "packet");
/*    */     ClientPlayNetworking.send((class_8710)packet);
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\fabric\CobbleDollarsFabricNetworkManager.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */