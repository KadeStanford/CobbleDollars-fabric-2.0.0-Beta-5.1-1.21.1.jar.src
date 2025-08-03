/*    */ package fr.harmex.cobbledollars.common.network.handlers.client;
/*    */ 
/*    */ import com.cobblemon.mod.common.api.net.ClientNetworkPacketHandler;
/*    */ import com.cobblemon.mod.common.api.net.NetworkPacket;
/*    */ import fr.harmex.cobbledollars.common.client.config.ClientShopConfig;
/*    */ import fr.harmex.cobbledollars.common.network.packets.s2c.SyncShopPacket;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Shop;
/*    */ import java.util.Collection;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import net.minecraft.class_1703;
/*    */ import net.minecraft.class_310;
/*    */ import net.minecraft.class_437;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\002\b\003\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\037\020\t\032\0020\b2\006\020\005\032\0020\0022\006\020\007\032\0020\006H\026¢\006\004\b\t\020\n¨\006\013"}, d2 = {"Lfr/harmex/cobbledollars/common/network/handlers/client/SyncShopHandler;", "Lcom/cobblemon/mod/common/api/net/ClientNetworkPacketHandler;", "Lfr/harmex/cobbledollars/common/network/packets/s2c/SyncShopPacket;", "<init>", "()V", "packet", "Lnet/minecraft/class_310;", "client", "", "handle", "(Lfr/harmex/cobbledollars/common/network/packets/s2c/SyncShopPacket;Lnet/minecraft/class_310;)V", "common"})
/*    */ @SourceDebugExtension({"SMAP\nSyncShopHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncShopHandler.kt\nfr/harmex/cobbledollars/common/network/handlers/client/SyncShopHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
/*    */ public final class SyncShopHandler implements ClientNetworkPacketHandler<SyncShopPacket> {
/*    */   @NotNull
/*    */   public static final SyncShopHandler INSTANCE = new SyncShopHandler();
/*    */   
/*    */   public void handle(@NotNull SyncShopPacket packet, @NotNull class_310 client) {
/* 12 */     Intrinsics.checkNotNullParameter(packet, "packet");
/* 12 */     Intrinsics.checkNotNullParameter(client, "client");
/* 12 */     class_1703 class_1703 = (client.field_1724 != null) ? client.field_1724.field_7512 : null;
/* 12 */     Object object1 = (class_1703 instanceof fr.harmex.cobbledollars.common.world.inventory.ShopMenu) ? class_1703 : null;
/* 12 */     int $i$a$-let-SyncShopHandler$handle$1 = 0;
/* 14 */     object1.getCobbleMerchant().setMerchantUUID(packet.getMerchantUUID());
/* 15 */     Collection collection = (Collection)packet.getShop();
/* 25 */     Object object2 = object1;
/* 25 */     int $i$a$-ifEmpty-SyncShopHandler$handle$1$1 = 0;
/*    */     object2.setShop(collection.isEmpty() ? ClientShopConfig.INSTANCE.getDefaultShop().copy() : (Shop)collection);
/*    */     object1.setHasMerchant(packet.getHasMerchant());
/*    */     class_437 class_437 = (class_310.method_1551()).field_1755;
/*    */     Object object3 = (class_437 instanceof fr.harmex.cobbledollars.common.client.gui.screen.ShopScreen) ? class_437 : null;
/*    */     int $i$a$-let-SyncShopHandler$handle$1$2 = 0;
/*    */     object3.setEditMode(packet.isEditMode());
/*    */     object3.syncShop();
/*    */     (class_437 instanceof fr.harmex.cobbledollars.common.client.gui.screen.ShopScreen) ? class_437 : null;
/*    */     (class_1703 instanceof fr.harmex.cobbledollars.common.world.inventory.ShopMenu) ? class_1703 : null;
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\network\handlers\client\SyncShopHandler.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */