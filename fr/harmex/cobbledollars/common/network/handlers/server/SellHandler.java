/*    */ package fr.harmex.cobbledollars.common.network.handlers.server;
/*    */ 
/*    */ import com.cobblemon.mod.common.api.net.NetworkPacket;
/*    */ import com.cobblemon.mod.common.api.net.ServerNetworkPacketHandler;
/*    */ import fr.harmex.cobbledollars.common.CobbleDollars;
/*    */ import fr.harmex.cobbledollars.common.network.packets.c2s.SellPacket;
/*    */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*    */ import fr.harmex.cobbledollars.common.utils.extensions.PlayerExtensionKt;
/*    */ import fr.harmex.cobbledollars.common.utils.extensions.SimpleContainerExtensionsKt;
/*    */ import fr.harmex.cobbledollars.common.world.inventory.BankMenu;
/*    */ import java.math.BigInteger;
/*    */ import java.util.Iterator;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import net.minecraft.class_1262;
/*    */ import net.minecraft.class_1263;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_1799;
/*    */ import net.minecraft.class_3222;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\003\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J'\020\013\032\0020\n2\006\020\005\032\0020\0022\006\020\007\032\0020\0062\006\020\t\032\0020\bH\026¢\006\004\b\013\020\f¨\006\r"}, d2 = {"Lfr/harmex/cobbledollars/common/network/handlers/server/SellHandler;", "Lcom/cobblemon/mod/common/api/net/ServerNetworkPacketHandler;", "Lfr/harmex/cobbledollars/common/network/packets/c2s/SellPacket;", "<init>", "()V", "packet", "Lnet/minecraft/server/MinecraftServer;", "server", "Lnet/minecraft/class_3222;", "player", "", "handle", "(Lfr/harmex/cobbledollars/common/network/packets/c2s/SellPacket;Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/class_3222;)V", "common"})
/*    */ @SourceDebugExtension({"SMAP\nSellHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SellHandler.kt\nfr/harmex/cobbledollars/common/network/handlers/server/SellHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n1863#2,2:34\n*S KotlinDebug\n*F\n+ 1 SellHandler.kt\nfr/harmex/cobbledollars/common/network/handlers/server/SellHandler\n*L\n23#1:34,2\n*E\n"})
/*    */ public final class SellHandler implements ServerNetworkPacketHandler<SellPacket> {
/*    */   @NotNull
/*    */   public static final SellHandler INSTANCE = new SellHandler();
/*    */   
/*    */   public void handle(@NotNull SellPacket packet, @NotNull MinecraftServer server, @NotNull class_3222 player) {
/*    */     Iterator iterator;
/* 18 */     Intrinsics.checkNotNullParameter(packet, "packet");
/* 18 */     Intrinsics.checkNotNullParameter(server, "server");
/* 18 */     Intrinsics.checkNotNullParameter(player, "player");
/* 18 */     Object clearedValue = player.field_7512;
/* 18 */     BankMenu bankMenu = (clearedValue instanceof BankMenu) ? (BankMenu)clearedValue : null;
/* 19 */     if (bankMenu != null) {
/* 20 */       clearedValue = null;
/* 20 */       clearedValue = BigInteger.ZERO;
/* 23 */       Iterable $this$forEach$iv = SimpleContainerExtensionsKt.getBankableItems(bankMenu.getBankContainer());
/* 23 */       int $i$f$forEach = 0;
/* 34 */       iterator = $this$forEach$iv.iterator();
/*    */     } else {
/*    */       return;
/*    */     } 
/* 34 */     if (iterator.hasNext()) {
/* 34 */       Object element$iv = iterator.next();
/* 34 */       class_1799 item = (class_1799)element$iv;
/* 34 */       int $i$a$-forEach-SellHandler$handle$1 = 0;
/*    */       class_1799 itemCopy = item.method_7972();
/*    */       int clearedAmount = class_1262.method_29234((class_1263)bankMenu.getBankContainer(), item::handle$lambda$1$lambda$0, -1, false);
/*    */       Intrinsics.checkNotNullExpressionValue(clearedValue, "element");
/*    */       Object object1 = clearedValue;
/*    */       Intrinsics.checkNotNullExpressionValue(BigInteger.valueOf(clearedAmount), "valueOf(...)");
/*    */       BigInteger bigInteger1 = BigInteger.valueOf(clearedAmount);
/*    */       Intrinsics.checkNotNull(itemCopy);
/*    */       if (CobbleDollars.INSTANCE.getBankConfig().getBank().get(itemCopy) == null || CobbleDollars.INSTANCE.getBankConfig().getBank().get(itemCopy).getPrice() == null)
/*    */         CobbleDollars.INSTANCE.getBankConfig().getBank().get(itemCopy).getPrice(); 
/*    */     } 
/*    */     BigInteger bigInteger = PlayerExtensionKt.getCobbleDollars((class_1657)player);
/*    */     Intrinsics.checkNotNullExpressionValue(clearedValue, "element");
/*    */     Intrinsics.checkNotNullExpressionValue(bigInteger.add((BigInteger)clearedValue), "add(...)");
/*    */     PlayerExtensionKt.setCobbleDollars((class_1657)player, bigInteger.add((BigInteger)clearedValue));
/*    */   }
/*    */   
/*    */   private static final boolean handle$lambda$1$lambda$0(class_1799 $item, class_1799 itemStack) {
/*    */     Intrinsics.checkNotNull(itemStack);
/*    */     Intrinsics.checkNotNull($item);
/*    */     return MiscUtilsKt.isSame(itemStack, $item);
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\network\handlers\server\SellHandler.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */