/*    */ package fr.harmex.cobbledollars.common.network.handlers.client;
/*    */ 
/*    */ import com.cobblemon.mod.common.api.net.ClientNetworkPacketHandler;
/*    */ import com.cobblemon.mod.common.api.net.NetworkPacket;
/*    */ import fr.harmex.cobbledollars.common.client.config.ClientShopConfig;
/*    */ import fr.harmex.cobbledollars.common.client.gui.screen.ShopScreen;
/*    */ import fr.harmex.cobbledollars.common.network.packets.s2c.SyncShopConfigPacket;
/*    */ import fr.harmex.cobbledollars.common.world.inventory.ShopMenu;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1703;
/*    */ import net.minecraft.class_310;
/*    */ import net.minecraft.class_437;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\002\b\003\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\037\020\t\032\0020\b2\006\020\005\032\0020\0022\006\020\007\032\0020\006H\026¢\006\004\b\t\020\n¨\006\013"}, d2 = {"Lfr/harmex/cobbledollars/common/network/handlers/client/SyncShopConfigHandler;", "Lcom/cobblemon/mod/common/api/net/ClientNetworkPacketHandler;", "Lfr/harmex/cobbledollars/common/network/packets/s2c/SyncShopConfigPacket;", "<init>", "()V", "packet", "Lnet/minecraft/class_310;", "client", "", "handle", "(Lfr/harmex/cobbledollars/common/network/packets/s2c/SyncShopConfigPacket;Lnet/minecraft/class_310;)V", "common"})
/*    */ public final class SyncShopConfigHandler implements ClientNetworkPacketHandler<SyncShopConfigPacket> {
/*    */   @NotNull
/*    */   public static final SyncShopConfigHandler INSTANCE = new SyncShopConfigHandler();
/*    */   
/*    */   public void handle(@NotNull SyncShopConfigPacket packet, @NotNull class_310 client) {
/* 12 */     Intrinsics.checkNotNullParameter(packet, "packet");
/* 12 */     Intrinsics.checkNotNullParameter(client, "client");
/* 12 */     class_1703 class_1703 = (client.field_1724 != null) ? client.field_1724.field_7512 : null;
/* 12 */     ShopMenu shopMenu = (class_1703 instanceof ShopMenu) ? (ShopMenu)class_1703 : null;
/* 14 */     ShopMenu it = shopMenu;
/* 14 */     int $i$a$-let-SyncShopConfigHandler$handle$defaultShop$1 = 0;
/* 14 */     Boolean defaultShop = (shopMenu != null) ? 
/* 15 */       Boolean.valueOf(Intrinsics.areEqual(it.getShop(), ClientShopConfig.INSTANCE.getDefaultShop())) : null;
/* 18 */     ClientShopConfig.INSTANCE.setDefaultShop(packet.getShop());
/* 19 */     ClientShopConfig.INSTANCE.setBank(packet.getBank());
/* 21 */     class_437 class_437 = client.field_1755;
/* 21 */     ShopScreen shopScreen = (class_437 instanceof ShopScreen) ? (ShopScreen)class_437 : null;
/* 23 */     ShopMenu shopMenu1 = shopMenu;
/* 23 */     int $i$a$-let-SyncShopConfigHandler$handle$1 = 0;
/* 24 */     if (Intrinsics.areEqual(defaultShop, Boolean.valueOf(true)))
/* 25 */       shopMenu1.setShop(packet.getShop()); 
/* 28 */     if (shopScreen != null) {
/* 28 */       shopScreen.syncShop();
/*    */     } else {
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\network\handlers\client\SyncShopConfigHandler.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */