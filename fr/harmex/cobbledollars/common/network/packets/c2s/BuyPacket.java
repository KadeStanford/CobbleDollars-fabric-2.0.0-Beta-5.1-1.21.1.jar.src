/*    */ package fr.harmex.cobbledollars.common.network.packets.c2s;
/*    */ 
/*    */ import com.cobblemon.mod.common.api.net.NetworkPacket;
/*    */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*    */ import fr.harmex.cobbledollars.common.utils.extensions.FriendlyByteBufExtensionKt;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Offer;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\002\b\020\n\002\030\002\n\002\b\006\030\000 &2\b\022\004\022\0020\0000\001:\001&B7\022\006\020\003\032\0020\002\022\006\020\005\032\0020\004\022\006\020\006\032\0020\004\022\006\020\007\032\0020\004\022\006\020\t\032\0020\b\022\006\020\013\032\0020\n¢\006\004\b\f\020\rJ\027\020\021\032\0020\0202\006\020\017\032\0020\016H\026¢\006\004\b\021\020\022R\027\020\003\032\0020\0028\006¢\006\f\n\004\b\003\020\023\032\004\b\024\020\025R\027\020\005\032\0020\0048\006¢\006\f\n\004\b\005\020\026\032\004\b\027\020\030R\027\020\006\032\0020\0048\006¢\006\f\n\004\b\006\020\026\032\004\b\031\020\030R\027\020\007\032\0020\0048\006¢\006\f\n\004\b\007\020\026\032\004\b\032\020\030R\027\020\t\032\0020\b8\006¢\006\f\n\004\b\t\020\033\032\004\b\034\020\035R\027\020\013\032\0020\n8\006¢\006\f\n\004\b\013\020\036\032\004\b\037\020 R\032\020\"\032\0020!8\026X\004¢\006\f\n\004\b\"\020#\032\004\b$\020%¨\006'"}, d2 = {"Lfr/harmex/cobbledollars/common/network/packets/c2s/BuyPacket;", "Lcom/cobblemon/mod/common/api/net/NetworkPacket;", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;", "offer", "", "categoryIndex", "offerIndex", "amount", "", "hasMerchant", "Ljava/util/UUID;", "merchantUUID", "<init>", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;IIIZLjava/util/UUID;)V", "Lnet/minecraft/class_9129;", "buffer", "", "encode", "(Lnet/minecraft/class_9129;)V", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;", "getOffer", "()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;", "I", "getCategoryIndex", "()I", "getOfferIndex", "getAmount", "Z", "getHasMerchant", "()Z", "Ljava/util/UUID;", "getMerchantUUID", "()Ljava/util/UUID;", "Lnet/minecraft/class_2960;", "id", "Lnet/minecraft/class_2960;", "getId", "()Lnet/minecraft/class_2960;", "Companion", "common"})
/*    */ public final class BuyPacket implements NetworkPacket<BuyPacket> {
/*    */   public BuyPacket(@NotNull Offer offer, int categoryIndex, int offerIndex, int amount, boolean hasMerchant, @NotNull UUID merchantUUID) {
/* 11 */     this.offer = offer;
/* 11 */     this.categoryIndex = categoryIndex;
/* 11 */     this.offerIndex = offerIndex;
/* 11 */     this.amount = amount;
/* 11 */     this.hasMerchant = hasMerchant;
/* 11 */     this.merchantUUID = merchantUUID;
/* 12 */     this.id = ID;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Offer getOffer() {
/*    */     return this.offer;
/*    */   }
/*    */   
/*    */   public final int getCategoryIndex() {
/*    */     return this.categoryIndex;
/*    */   }
/*    */   
/*    */   public final int getOfferIndex() {
/*    */     return this.offerIndex;
/*    */   }
/*    */   
/*    */   public final int getAmount() {
/*    */     return this.amount;
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
/*    */   public class_8710.class_9154<BuyPacket> method_56479() {
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
/* 15 */     FriendlyByteBufExtensionKt.writeOffer((class_2540)buffer, this.offer);
/* 16 */     buffer.method_53002(this.categoryIndex);
/* 17 */     buffer.method_53002(this.offerIndex);
/* 18 */     buffer.method_53002(this.amount);
/* 19 */     buffer.method_52964(this.hasMerchant);
/* 20 */     buffer.method_10797(this.merchantUUID);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\025\020\007\032\0020\0062\006\020\005\032\0020\004¢\006\004\b\007\020\bR\027\020\n\032\0020\t8\006¢\006\f\n\004\b\n\020\013\032\004\b\f\020\r¨\006\016"}, d2 = {"Lfr/harmex/cobbledollars/common/network/packets/c2s/BuyPacket$Companion;", "", "<init>", "()V", "Lnet/minecraft/class_9129;", "buffer", "Lfr/harmex/cobbledollars/common/network/packets/c2s/BuyPacket;", "decode", "(Lnet/minecraft/class_9129;)Lfr/harmex/cobbledollars/common/network/packets/c2s/BuyPacket;", "Lnet/minecraft/class_2960;", "ID", "Lnet/minecraft/class_2960;", "getID", "()Lnet/minecraft/class_2960;", "common"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final class_2960 getID() {
/* 24 */       return BuyPacket.ID;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final BuyPacket decode(@NotNull class_9129 buffer) {
/* 25 */       Intrinsics.checkNotNullParameter(buffer, "buffer");
/* 31 */       Intrinsics.checkNotNullExpressionValue(buffer.method_10790(), "readUUID(...)");
/* 31 */       return new BuyPacket(FriendlyByteBufExtensionKt.readOffer((class_2540)buffer), buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readBoolean(), buffer.method_10790());
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @NotNull
/*    */   private final Offer offer;
/*    */   
/*    */   private final int categoryIndex;
/*    */   
/*    */   private final int offerIndex;
/*    */   
/*    */   private final int amount;
/*    */   
/*    */   private final boolean hasMerchant;
/*    */   
/*    */   @NotNull
/*    */   private final UUID merchantUUID;
/*    */   
/*    */   @NotNull
/*    */   private final class_2960 id;
/*    */   
/*    */   @NotNull
/*    */   private static final class_2960 ID = MiscUtilsKt.cobbleDollarsResource("buy");
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\network\packets\c2s\BuyPacket.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */