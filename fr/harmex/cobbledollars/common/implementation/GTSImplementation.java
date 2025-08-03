/*    */ package fr.harmex.cobbledollars.common.implementation;
/*    */ 
/*    */ import com.cobblemon.mod.common.util.PlayerExtensionsKt;
/*    */ import fr.harmex.cobbledollars.common.utils.extensions.PlayerExtensionKt;
/*    */ import java.math.BigDecimal;
/*    */ import java.math.BigInteger;
/*    */ import java.util.UUID;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_3222;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.pokesplash.gts.api.economy.GtsEconomy;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\006\n\000\n\002\020\013\n\002\b\007\030\000 \0162\0020\001:\001\016B\007¢\006\004\b\002\020\003J\037\020\t\032\0020\b2\006\020\005\032\0020\0042\006\020\007\032\0020\006H\026¢\006\004\b\t\020\nJ\037\020\013\032\0020\b2\006\020\005\032\0020\0042\006\020\007\032\0020\006H\026¢\006\004\b\013\020\nJ\027\020\f\032\0020\0062\006\020\005\032\0020\004H\026¢\006\004\b\f\020\r¨\006\017"}, d2 = {"Lfr/harmex/cobbledollars/common/implementation/GTSImplementation;", "Lorg/pokesplash/gts/api/economy/GtsEconomy;", "<init>", "()V", "Ljava/util/UUID;", "playerUUID", "", "amount", "", "add", "(Ljava/util/UUID;D)Z", "remove", "balance", "(Ljava/util/UUID;)D", "Companion", "common"})
/*    */ public final class GTSImplementation implements GtsEconomy {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @Nullable
/*    */   private static MinecraftServer server;
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\007\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R$\020\005\032\004\030\0010\0048\006@\006X\016¢\006\022\n\004\b\005\020\006\032\004\b\007\020\b\"\004\b\t\020\n¨\006\013"}, d2 = {"Lfr/harmex/cobbledollars/common/implementation/GTSImplementation$Companion;", "", "<init>", "()V", "Lnet/minecraft/server/MinecraftServer;", "server", "Lnet/minecraft/server/MinecraftServer;", "getServer", "()Lnet/minecraft/server/MinecraftServer;", "setServer", "(Lnet/minecraft/server/MinecraftServer;)V", "common"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @Nullable
/*    */     public final MinecraftServer getServer() {
/* 12 */       return GTSImplementation.server;
/*    */     }
/*    */     
/*    */     public final void setServer(@Nullable MinecraftServer <set-?>) {
/* 12 */       GTSImplementation.server = <set-?>;
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean add(@NotNull UUID playerUUID, double amount) {
/* 16 */     Intrinsics.checkNotNullParameter(playerUUID, "playerUUID");
/* 16 */     class_3222 player = PlayerExtensionsKt.getPlayer(playerUUID);
/* 17 */     if (player == null && server != null) {
/* 18 */       Intrinsics.checkNotNull(server);
/* 18 */       Intrinsics.checkNotNullExpressionValue((new BigDecimal(String.valueOf(amount))).toBigInteger(), "toBigInteger(...)");
/* 18 */       return PlayerExtensionKt.addOfflineCobbleDollars(playerUUID, server, (new BigDecimal(String.valueOf(amount))).toBigInteger());
/*    */     } 
/* 19 */     if (player != null) {
/* 20 */       BigInteger bigInteger = PlayerExtensionKt.getCobbleDollars((class_1657)player);
/* 20 */       Intrinsics.checkNotNullExpressionValue((new BigDecimal(String.valueOf(amount))).toBigInteger(), "toBigInteger(...)");
/* 20 */       Intrinsics.checkNotNullExpressionValue(bigInteger.add((new BigDecimal(String.valueOf(amount))).toBigInteger()), "add(...)");
/* 20 */       PlayerExtensionKt.setCobbleDollars((class_1657)player, bigInteger.add((new BigDecimal(String.valueOf(amount))).toBigInteger()));
/* 21 */       return true;
/*    */     } 
/* 23 */     return false;
/*    */   }
/*    */   
/*    */   public boolean remove(@NotNull UUID playerUUID, double amount) {
/* 27 */     Intrinsics.checkNotNullParameter(playerUUID, "playerUUID");
/* 27 */     class_3222 player = PlayerExtensionsKt.getPlayer(playerUUID);
/* 28 */     if (player == null)
/* 28 */       return false; 
/* 29 */     if (PlayerExtensionKt.getCobbleDollars((class_1657)player).compareTo((new BigDecimal(String.valueOf(amount))).toBigInteger()) < 0)
/* 30 */       return false; 
/* 33 */     BigInteger bigInteger = PlayerExtensionKt.getCobbleDollars((class_1657)player);
/* 33 */     Intrinsics.checkNotNullExpressionValue((new BigDecimal(String.valueOf(amount))).toBigInteger(), "toBigInteger(...)");
/* 33 */     Intrinsics.checkNotNullExpressionValue(bigInteger.subtract((new BigDecimal(String.valueOf(amount))).toBigInteger()), "subtract(...)");
/* 33 */     PlayerExtensionKt.setCobbleDollars((class_1657)player, bigInteger.subtract((new BigDecimal(String.valueOf(amount))).toBigInteger()));
/* 34 */     return true;
/*    */   }
/*    */   
/*    */   public double balance(@NotNull UUID playerUUID) {
/* 39 */     Intrinsics.checkNotNullParameter(playerUUID, "playerUUID");
/* 39 */     class_3222 player = PlayerExtensionsKt.getPlayer(playerUUID);
/* 40 */     PlayerExtensionKt.getCobbleDollars((class_1657)player);
/* 40 */     return (player != null && PlayerExtensionKt.getCobbleDollars((class_1657)player) != null) ? PlayerExtensionKt.getCobbleDollars((class_1657)player).doubleValue() : 0.0D;
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\implementation\GTSImplementation.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */