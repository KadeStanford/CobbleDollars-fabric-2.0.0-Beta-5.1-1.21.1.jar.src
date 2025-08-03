/*    */ package fr.harmex.cobbledollars.common.network.packets.s2c;
/*    */ 
/*    */ import com.cobblemon.mod.common.api.net.NetworkPacket;
/*    */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*    */ import fr.harmex.cobbledollars.common.utils.extensions.FriendlyByteBufExtensionKt;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Shop;
/*    */ import java.util.UUID;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_2540;
/*    */ import net.minecraft.class_2960;
/*    */ import net.minecraft.class_3222;
/*    */ import net.minecraft.class_5321;
/*    */ import net.minecraft.class_8710;
/*    */ import net.minecraft.class_9129;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\002\b\016\n\002\030\002\n\002\b\006\030\000 #2\b\022\004\022\0020\0000\001:\001#B/\022\006\020\003\032\0020\002\022\006\020\005\032\0020\004\022\006\020\007\032\0020\006\022\006\020\t\032\0020\b\022\006\020\n\032\0020\006¢\006\004\b\013\020\fJ\027\020\020\032\0020\0172\006\020\016\032\0020\rH\026¢\006\004\b\020\020\021R\027\020\003\032\0020\0028\006¢\006\f\n\004\b\003\020\022\032\004\b\023\020\024R\027\020\005\032\0020\0048\006¢\006\f\n\004\b\005\020\025\032\004\b\026\020\027R\027\020\007\032\0020\0068\006¢\006\f\n\004\b\007\020\030\032\004\b\031\020\032R\027\020\t\032\0020\b8\006¢\006\f\n\004\b\t\020\033\032\004\b\034\020\035R\027\020\n\032\0020\0068\006¢\006\f\n\004\b\n\020\030\032\004\b\n\020\032R\032\020\037\032\0020\0368\026X\004¢\006\f\n\004\b\037\020 \032\004\b!\020\"¨\006$"}, d2 = {"Lfr/harmex/cobbledollars/common/network/packets/s2c/SyncShopPacket;", "Lcom/cobblemon/mod/common/api/net/NetworkPacket;", "", "containerId", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "shop", "", "hasMerchant", "Ljava/util/UUID;", "merchantUUID", "isEditMode", "<init>", "(ILfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;ZLjava/util/UUID;Z)V", "Lnet/minecraft/class_9129;", "buffer", "", "encode", "(Lnet/minecraft/class_9129;)V", "I", "getContainerId", "()I", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "getShop", "()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "Z", "getHasMerchant", "()Z", "Ljava/util/UUID;", "getMerchantUUID", "()Ljava/util/UUID;", "Lnet/minecraft/class_2960;", "id", "Lnet/minecraft/class_2960;", "getId", "()Lnet/minecraft/class_2960;", "Companion", "common"})
/*    */ public final class SyncShopPacket implements NetworkPacket<SyncShopPacket> {
/*    */   public SyncShopPacket(int containerId, @NotNull Shop shop, boolean hasMerchant, @NotNull UUID merchantUUID, boolean isEditMode) {
/* 11 */     this.containerId = containerId;
/* 11 */     this.shop = shop;
/* 11 */     this.hasMerchant = hasMerchant;
/* 11 */     this.merchantUUID = merchantUUID;
/* 11 */     this.isEditMode = isEditMode;
/* 12 */     this.id = ID;
/*    */   }
/*    */   
/*    */   public final int getContainerId() {
/*    */     return this.containerId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Shop getShop() {
/*    */     return this.shop;
/*    */   }
/*    */   
/*    */   public final boolean getHasMerchant() {
/*    */     return this.hasMerchant;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final UUID getMerchantUUID() {
/*    */     return this.merchantUUID;
/*    */   }
/*    */   
/*    */   public final boolean isEditMode() {
/*    */     return this.isEditMode;
/*    */   }
/*    */   
/*    */   public void sendToPlayer(@NotNull class_3222 player) {
/*    */     NetworkPacket.DefaultImpls.sendToPlayer(this, player);
/*    */   }
/*    */   
/*    */   public void sendToPlayers(@NotNull Iterable players) {
/*    */     NetworkPacket.DefaultImpls.sendToPlayers(this, players);
/*    */   }
/*    */   
/*    */   public void sendToAllPlayers() {
/*    */     NetworkPacket.DefaultImpls.sendToAllPlayers(this);
/*    */   }
/*    */   
/*    */   public void sendToServer() {
/*    */     NetworkPacket.DefaultImpls.sendToServer(this);
/*    */   }
/*    */   
/*    */   public void sendToPlayersAround(double x, double y, double z, double distance, @NotNull class_5321 worldKey, @NotNull Function1 exclusionCondition) {
/*    */     NetworkPacket.DefaultImpls.sendToPlayersAround(this, x, y, z, distance, worldKey, exclusionCondition);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public class_8710.class_9154<SyncShopPacket> method_56479() {
/*    */     return NetworkPacket.DefaultImpls.type(this);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public class_2960 getId() {
/* 12 */     return this.id;
/*    */   }
/*    */   
/*    */   public void encode(@NotNull class_9129 buffer) {
/* 15 */     Intrinsics.checkNotNullParameter(buffer, "buffer");
/* 15 */     buffer.method_10804(this.containerId);
/* 16 */     FriendlyByteBufExtensionKt.writeShop((class_2540)buffer, this.shop);
/* 17 */     buffer.method_52964(this.hasMerchant);
/* 18 */     buffer.method_10797(this.merchantUUID);
/* 19 */     buffer.method_52964(this.isEditMode);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\025\020\007\032\0020\0062\006\020\005\032\0020\004¢\006\004\b\007\020\bR\027\020\n\032\0020\t8\006¢\006\f\n\004\b\n\020\013\032\004\b\f\020\r¨\006\016"}, d2 = {"Lfr/harmex/cobbledollars/common/network/packets/s2c/SyncShopPacket$Companion;", "", "<init>", "()V", "Lnet/minecraft/class_9129;", "buffer", "Lfr/harmex/cobbledollars/common/network/packets/s2c/SyncShopPacket;", "decode", "(Lnet/minecraft/class_9129;)Lfr/harmex/cobbledollars/common/network/packets/s2c/SyncShopPacket;", "Lnet/minecraft/class_2960;", "ID", "Lnet/minecraft/class_2960;", "getID", "()Lnet/minecraft/class_2960;", "common"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final class_2960 getID() {
/* 23 */       return SyncShopPacket.ID;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final SyncShopPacket decode(@NotNull class_9129 buffer) {
/* 24 */       Intrinsics.checkNotNullParameter(buffer, "buffer");
/* 24 */       Intrinsics.checkNotNullExpressionValue(buffer.method_10790(), "readUUID(...)");
/* 24 */       return new SyncShopPacket(buffer.method_10816(), FriendlyByteBufExtensionKt.readShop((class_2540)buffer), buffer.readBoolean(), buffer.method_10790(), buffer.readBoolean());
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   private final int containerId;
/*    */   
/*    */   @NotNull
/*    */   private final Shop shop;
/*    */   
/*    */   private final boolean hasMerchant;
/*    */   
/*    */   @NotNull
/*    */   private final UUID merchantUUID;
/*    */   
/*    */   private final boolean isEditMode;
/*    */   
/*    */   @NotNull
/*    */   private final class_2960 id;
/*    */   
/*    */   @NotNull
/*    */   private static final class_2960 ID = MiscUtilsKt.cobbleDollarsResource("sync_shop");
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\network\packets\s2c\SyncShopPacket.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */