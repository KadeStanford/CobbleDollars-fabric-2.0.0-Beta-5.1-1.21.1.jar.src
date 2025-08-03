/*    */ package fr.harmex.cobbledollars.common.network.packets.c2s;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\002\b\b\n\002\030\002\n\002\b\006\030\000 \0302\b\022\004\022\0020\0000\001:\001\030B\027\022\006\020\003\032\0020\002\022\006\020\005\032\0020\004¢\006\004\b\006\020\007J\027\020\013\032\0020\n2\006\020\t\032\0020\bH\026¢\006\004\b\013\020\fR\027\020\003\032\0020\0028\006¢\006\f\n\004\b\003\020\r\032\004\b\016\020\017R\027\020\005\032\0020\0048\006¢\006\f\n\004\b\005\020\020\032\004\b\021\020\022R\032\020\024\032\0020\0238\026X\004¢\006\f\n\004\b\024\020\025\032\004\b\026\020\027¨\006\031"}, d2 = {"Lfr/harmex/cobbledollars/common/network/packets/c2s/UpdateMerchantShopPacket;", "Lcom/cobblemon/mod/common/api/net/NetworkPacket;", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "shop", "Ljava/util/UUID;", "merchantUUID", "<init>", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;Ljava/util/UUID;)V", "Lnet/minecraft/class_9129;", "buffer", "", "encode", "(Lnet/minecraft/class_9129;)V", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "getShop", "()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "Ljava/util/UUID;", "getMerchantUUID", "()Ljava/util/UUID;", "Lnet/minecraft/class_2960;", "id", "Lnet/minecraft/class_2960;", "getId", "()Lnet/minecraft/class_2960;", "Companion", "common"})
/*    */ public final class UpdateMerchantShopPacket implements NetworkPacket<UpdateMerchantShopPacket> {
/*    */   public UpdateMerchantShopPacket(@NotNull Shop shop, @NotNull UUID merchantUUID) {
/* 11 */     this.shop = shop;
/* 11 */     this.merchantUUID = merchantUUID;
/* 12 */     this.id = ID;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Shop getShop() {
/*    */     return this.shop;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final UUID getMerchantUUID() {
/*    */     return this.merchantUUID;
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
/*    */   public class_8710.class_9154<UpdateMerchantShopPacket> method_56479() {
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
/* 15 */     FriendlyByteBufExtensionKt.writeShop((class_2540)buffer, this.shop);
/* 16 */     buffer.method_10797(this.merchantUUID);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\025\020\007\032\0020\0062\006\020\005\032\0020\004¢\006\004\b\007\020\bR\027\020\n\032\0020\t8\006¢\006\f\n\004\b\n\020\013\032\004\b\f\020\r¨\006\016"}, d2 = {"Lfr/harmex/cobbledollars/common/network/packets/c2s/UpdateMerchantShopPacket$Companion;", "", "<init>", "()V", "Lnet/minecraft/class_9129;", "buffer", "Lfr/harmex/cobbledollars/common/network/packets/c2s/UpdateMerchantShopPacket;", "decode", "(Lnet/minecraft/class_9129;)Lfr/harmex/cobbledollars/common/network/packets/c2s/UpdateMerchantShopPacket;", "Lnet/minecraft/class_2960;", "ID", "Lnet/minecraft/class_2960;", "getID", "()Lnet/minecraft/class_2960;", "common"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final class_2960 getID() {
/* 20 */       return UpdateMerchantShopPacket.ID;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final UpdateMerchantShopPacket decode(@NotNull class_9129 buffer) {
/* 21 */       Intrinsics.checkNotNullParameter(buffer, "buffer");
/* 21 */       Intrinsics.checkNotNullExpressionValue(buffer.method_10790(), "readUUID(...)");
/* 21 */       return new UpdateMerchantShopPacket(FriendlyByteBufExtensionKt.readShop((class_2540)buffer), buffer.method_10790());
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @NotNull
/*    */   private final Shop shop;
/*    */   
/*    */   @NotNull
/*    */   private final UUID merchantUUID;
/*    */   
/*    */   @NotNull
/*    */   private final class_2960 id;
/*    */   
/*    */   @NotNull
/*    */   private static final class_2960 ID = MiscUtilsKt.cobbleDollarsResource("update_merchant_shop");
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\network\packets\c2s\UpdateMerchantShopPacket.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */