/*    */ package fr.harmex.cobbledollars.common.network.packets.s2c;
/*    */ 
/*    */ import com.cobblemon.mod.common.api.net.NetworkPacket;
/*    */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*    */ import java.util.UUID;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_2960;
/*    */ import net.minecraft.class_3222;
/*    */ import net.minecraft.class_5321;
/*    */ import net.minecraft.class_8710;
/*    */ import net.minecraft.class_9129;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\002\b\n\n\002\030\002\n\002\b\006\030\000 \0342\b\022\004\022\0020\0000\001:\001\034B'\022\006\020\003\032\0020\002\022\006\020\004\032\0020\002\022\006\020\005\032\0020\002\022\006\020\007\032\0020\006¢\006\004\b\b\020\tJ\027\020\r\032\0020\f2\006\020\013\032\0020\nH\026¢\006\004\b\r\020\016R\027\020\003\032\0020\0028\006¢\006\f\n\004\b\003\020\017\032\004\b\020\020\021R\027\020\004\032\0020\0028\006¢\006\f\n\004\b\004\020\017\032\004\b\022\020\021R\027\020\005\032\0020\0028\006¢\006\f\n\004\b\005\020\017\032\004\b\023\020\021R\027\020\007\032\0020\0068\006¢\006\f\n\004\b\007\020\024\032\004\b\025\020\026R\032\020\030\032\0020\0278\026X\004¢\006\f\n\004\b\030\020\031\032\004\b\032\020\033¨\006\035"}, d2 = {"Lfr/harmex/cobbledollars/common/network/packets/s2c/UpdateStockPacket;", "Lcom/cobblemon/mod/common/api/net/NetworkPacket;", "", "categoryIndex", "offerIndex", "newStock", "Ljava/util/UUID;", "merchantUUID", "<init>", "(IIILjava/util/UUID;)V", "Lnet/minecraft/class_9129;", "buffer", "", "encode", "(Lnet/minecraft/class_9129;)V", "I", "getCategoryIndex", "()I", "getOfferIndex", "getNewStock", "Ljava/util/UUID;", "getMerchantUUID", "()Ljava/util/UUID;", "Lnet/minecraft/class_2960;", "id", "Lnet/minecraft/class_2960;", "getId", "()Lnet/minecraft/class_2960;", "Companion", "common"})
/*    */ public final class UpdateStockPacket implements NetworkPacket<UpdateStockPacket> {
/*    */   public UpdateStockPacket(int categoryIndex, int offerIndex, int newStock, @NotNull UUID merchantUUID) {
/*  8 */     this.categoryIndex = categoryIndex;
/*  8 */     this.offerIndex = offerIndex;
/*  8 */     this.newStock = newStock;
/*  8 */     this.merchantUUID = merchantUUID;
/*  9 */     this.id = ID;
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
/*    */   public final int getNewStock() {
/*    */     return this.newStock;
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
/*    */   public class_8710.class_9154<UpdateStockPacket> method_56479() {
/*    */     return NetworkPacket.DefaultImpls.type(this);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public class_2960 getId() {
/*  9 */     return this.id;
/*    */   }
/*    */   
/*    */   public void encode(@NotNull class_9129 buffer) {
/* 12 */     Intrinsics.checkNotNullParameter(buffer, "buffer");
/* 12 */     buffer.method_53002(this.categoryIndex);
/* 13 */     buffer.method_53002(this.offerIndex);
/* 14 */     buffer.method_53002(this.newStock);
/* 15 */     buffer.method_10797(this.merchantUUID);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\025\020\007\032\0020\0062\006\020\005\032\0020\004¢\006\004\b\007\020\bR\027\020\n\032\0020\t8\006¢\006\f\n\004\b\n\020\013\032\004\b\f\020\r¨\006\016"}, d2 = {"Lfr/harmex/cobbledollars/common/network/packets/s2c/UpdateStockPacket$Companion;", "", "<init>", "()V", "Lnet/minecraft/class_9129;", "buffer", "Lfr/harmex/cobbledollars/common/network/packets/s2c/UpdateStockPacket;", "decode", "(Lnet/minecraft/class_9129;)Lfr/harmex/cobbledollars/common/network/packets/s2c/UpdateStockPacket;", "Lnet/minecraft/class_2960;", "ID", "Lnet/minecraft/class_2960;", "getID", "()Lnet/minecraft/class_2960;", "common"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final class_2960 getID() {
/* 19 */       return UpdateStockPacket.ID;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final UpdateStockPacket decode(@NotNull class_9129 buffer) {
/* 20 */       Intrinsics.checkNotNullParameter(buffer, "buffer");
/* 24 */       Intrinsics.checkNotNullExpressionValue(buffer.method_10790(), "readUUID(...)");
/* 24 */       return new UpdateStockPacket(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.method_10790());
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   private final int categoryIndex;
/*    */   
/*    */   private final int offerIndex;
/*    */   
/*    */   private final int newStock;
/*    */   
/*    */   @NotNull
/*    */   private final UUID merchantUUID;
/*    */   
/*    */   @NotNull
/*    */   private final class_2960 id;
/*    */   
/*    */   @NotNull
/*    */   private static final class_2960 ID = MiscUtilsKt.cobbleDollarsResource("update_stock");
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\network\packets\s2c\UpdateStockPacket.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */