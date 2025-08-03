/*    */ package fr.harmex.cobbledollars.common.network.handlers.server;
/*    */ 
/*    */ import com.cobblemon.mod.common.api.net.NetworkPacket;
/*    */ import com.cobblemon.mod.common.api.net.ServerNetworkPacketHandler;
/*    */ import fr.harmex.cobbledollars.common.network.packets.c2s.BuyPacket;
/*    */ import fr.harmex.cobbledollars.common.utils.extensions.PlayerExtensionKt;
/*    */ import java.math.BigInteger;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_1799;
/*    */ import net.minecraft.class_3222;
/*    */ import net.minecraft.class_3417;
/*    */ import net.minecraft.class_3419;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J'\020\013\032\0020\n2\006\020\005\032\0020\0022\006\020\007\032\0020\0062\006\020\t\032\0020\bH\026¢\006\004\b\013\020\fJ'\020\021\032\0020\n2\006\020\t\032\0020\b2\006\020\016\032\0020\r2\006\020\020\032\0020\017H\002¢\006\004\b\021\020\022¨\006\023"}, d2 = {"Lfr/harmex/cobbledollars/common/network/handlers/server/BuyHandler;", "Lcom/cobblemon/mod/common/api/net/ServerNetworkPacketHandler;", "Lfr/harmex/cobbledollars/common/network/packets/c2s/BuyPacket;", "<init>", "()V", "packet", "Lnet/minecraft/server/MinecraftServer;", "server", "Lnet/minecraft/class_3222;", "player", "", "handle", "(Lfr/harmex/cobbledollars/common/network/packets/c2s/BuyPacket;Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/class_3222;)V", "Lnet/minecraft/class_1799;", "items", "Ljava/math/BigInteger;", "price", "buy", "(Lnet/minecraft/class_3222;Lnet/minecraft/class_1799;Ljava/math/BigInteger;)V", "common"})
/*    */ @SourceDebugExtension({"SMAP\nBuyHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyHandler.kt\nfr/harmex/cobbledollars/common/network/handlers/server/BuyHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1863#2,2:101\n*S KotlinDebug\n*F\n+ 1 BuyHandler.kt\nfr/harmex/cobbledollars/common/network/handlers/server/BuyHandler\n*L\n58#1:101,2\n*E\n"})
/*    */ public final class BuyHandler implements ServerNetworkPacketHandler<BuyPacket> {
/*    */   @NotNull
/*    */   public static final BuyHandler INSTANCE = new BuyHandler();
/*    */   
/*    */   public void handle(@NotNull BuyPacket packet, @NotNull MinecraftServer server, @NotNull class_3222 player) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'packet'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'server'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_3
/*    */     //   13: ldc 'player'
/*    */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   18: aload_3
/*    */     //   19: invokevirtual method_37908 : ()Lnet/minecraft/class_1937;
/*    */     //   22: invokevirtual method_27983 : ()Lnet/minecraft/class_5321;
/*    */     //   25: astore #4
/*    */     //   27: aload_2
/*    */     //   28: aload #4
/*    */     //   30: invokevirtual method_3847 : (Lnet/minecraft/class_5321;)Lnet/minecraft/class_3218;
/*    */     //   33: astore #5
/*    */     //   35: aload #5
/*    */     //   37: dup
/*    */     //   38: ifnull -> 51
/*    */     //   41: aload_1
/*    */     //   42: invokevirtual getMerchantUUID : ()Ljava/util/UUID;
/*    */     //   45: invokevirtual method_14190 : (Ljava/util/UUID;)Lnet/minecraft/class_1297;
/*    */     //   48: goto -> 53
/*    */     //   51: pop
/*    */     //   52: aconst_null
/*    */     //   53: astore #7
/*    */     //   55: aload #7
/*    */     //   57: instanceof fr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder
/*    */     //   60: ifeq -> 71
/*    */     //   63: aload #7
/*    */     //   65: checkcast fr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder
/*    */     //   68: goto -> 72
/*    */     //   71: aconst_null
/*    */     //   72: astore #6
/*    */     //   74: aload_1
/*    */     //   75: invokevirtual getAmount : ()I
/*    */     //   78: istore #7
/*    */     //   80: aload_3
/*    */     //   81: checkcast net/minecraft/class_1657
/*    */     //   84: aload_1
/*    */     //   85: invokevirtual getOffer : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;
/*    */     //   88: invokevirtual getItem : ()Lnet/minecraft/class_1799;
/*    */     //   91: invokestatic getMaxAmountObtainable : (Lnet/minecraft/class_1657;Lnet/minecraft/class_1799;)I
/*    */     //   94: istore #8
/*    */     //   96: iload #7
/*    */     //   98: iload #8
/*    */     //   100: invokestatic coerceAtMost : (II)I
/*    */     //   103: istore #7
/*    */     //   105: aload_1
/*    */     //   106: invokevirtual getHasMerchant : ()Z
/*    */     //   109: ifeq -> 360
/*    */     //   112: aload #6
/*    */     //   114: ifnull -> 359
/*    */     //   117: aload #6
/*    */     //   119: invokeinterface getShop : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;
/*    */     //   124: astore #9
/*    */     //   126: aload #9
/*    */     //   128: ifnull -> 358
/*    */     //   131: aload #9
/*    */     //   133: invokevirtual isEmpty : ()Z
/*    */     //   136: ifeq -> 150
/*    */     //   139: getstatic fr/harmex/cobbledollars/common/CobbleDollars.INSTANCE : Lfr/harmex/cobbledollars/common/CobbleDollars;
/*    */     //   142: invokevirtual getShopConfig : ()Lfr/harmex/cobbledollars/common/config/ShopConfig;
/*    */     //   145: invokevirtual getDefaultShop : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;
/*    */     //   148: astore #9
/*    */     //   150: aload #9
/*    */     //   152: checkcast java/util/List
/*    */     //   155: aload_1
/*    */     //   156: invokevirtual getCategoryIndex : ()I
/*    */     //   159: invokestatic getOrNull : (Ljava/util/List;I)Ljava/lang/Object;
/*    */     //   162: checkcast fr/harmex/cobbledollars/common/world/item/trading/shop/Category
/*    */     //   165: dup
/*    */     //   166: ifnull -> 192
/*    */     //   169: invokevirtual getOffers : ()Ljava/util/ArrayList;
/*    */     //   172: dup
/*    */     //   173: ifnull -> 192
/*    */     //   176: checkcast java/util/List
/*    */     //   179: aload_1
/*    */     //   180: invokevirtual getOfferIndex : ()I
/*    */     //   183: invokestatic getOrNull : (Ljava/util/List;I)Ljava/lang/Object;
/*    */     //   186: checkcast fr/harmex/cobbledollars/common/world/item/trading/shop/Offer
/*    */     //   189: goto -> 194
/*    */     //   192: pop
/*    */     //   193: aconst_null
/*    */     //   194: astore #10
/*    */     //   196: aload #10
/*    */     //   198: aload_1
/*    */     //   199: invokevirtual getOffer : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;
/*    */     //   202: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   205: ifeq -> 357
/*    */     //   208: aload #10
/*    */     //   210: invokevirtual getStock : ()I
/*    */     //   213: ifne -> 217
/*    */     //   216: return
/*    */     //   217: aload #10
/*    */     //   219: invokevirtual getStock : ()I
/*    */     //   222: ifle -> 360
/*    */     //   225: iload #7
/*    */     //   227: aload #10
/*    */     //   229: invokevirtual getStock : ()I
/*    */     //   232: invokestatic coerceAtMost : (II)I
/*    */     //   235: istore #7
/*    */     //   237: aload #10
/*    */     //   239: aload #10
/*    */     //   241: invokevirtual getStock : ()I
/*    */     //   244: iload #7
/*    */     //   246: isub
/*    */     //   247: invokevirtual setStock : (I)V
/*    */     //   250: aload #6
/*    */     //   252: invokeinterface getTradingPlayers : ()Ljava/util/Set;
/*    */     //   257: checkcast java/lang/Iterable
/*    */     //   260: astore #11
/*    */     //   262: iconst_0
/*    */     //   263: istore #12
/*    */     //   265: aload #11
/*    */     //   267: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   272: astore #13
/*    */     //   274: aload #13
/*    */     //   276: invokeinterface hasNext : ()Z
/*    */     //   281: ifeq -> 353
/*    */     //   284: aload #13
/*    */     //   286: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   291: astore #14
/*    */     //   293: aload #14
/*    */     //   295: checkcast net/minecraft/class_1657
/*    */     //   298: astore #15
/*    */     //   300: iconst_0
/*    */     //   301: istore #16
/*    */     //   303: getstatic fr/harmex/cobbledollars/common/network/CobbleDollarsNetwork.INSTANCE : Lfr/harmex/cobbledollars/common/network/CobbleDollarsNetwork;
/*    */     //   306: aload #15
/*    */     //   308: ldc 'null cannot be cast to non-null type net.minecraft.server.level.ServerPlayer'
/*    */     //   310: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   313: aload #15
/*    */     //   315: checkcast net/minecraft/class_3222
/*    */     //   318: new fr/harmex/cobbledollars/common/network/packets/s2c/UpdateStockPacket
/*    */     //   321: dup
/*    */     //   322: aload_1
/*    */     //   323: invokevirtual getCategoryIndex : ()I
/*    */     //   326: aload_1
/*    */     //   327: invokevirtual getOfferIndex : ()I
/*    */     //   330: aload #10
/*    */     //   332: invokevirtual getStock : ()I
/*    */     //   335: aload_1
/*    */     //   336: invokevirtual getMerchantUUID : ()Ljava/util/UUID;
/*    */     //   339: invokespecial <init> : (IIILjava/util/UUID;)V
/*    */     //   342: checkcast com/cobblemon/mod/common/api/net/NetworkPacket
/*    */     //   345: invokevirtual sendPacketToPlayer : (Lnet/minecraft/class_3222;Lcom/cobblemon/mod/common/api/net/NetworkPacket;)V
/*    */     //   348: nop
/*    */     //   349: nop
/*    */     //   350: goto -> 274
/*    */     //   353: nop
/*    */     //   354: goto -> 360
/*    */     //   357: return
/*    */     //   358: return
/*    */     //   359: return
/*    */     //   360: aload_1
/*    */     //   361: invokevirtual getOffer : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;
/*    */     //   364: invokevirtual getItem : ()Lnet/minecraft/class_1799;
/*    */     //   367: iload #7
/*    */     //   369: invokevirtual method_46651 : (I)Lnet/minecraft/class_1799;
/*    */     //   372: astore #9
/*    */     //   374: nop
/*    */     //   375: aload_1
/*    */     //   376: invokevirtual getOffer : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;
/*    */     //   379: invokevirtual getPrice : ()Ljava/math/BigInteger;
/*    */     //   382: iload #7
/*    */     //   384: i2l
/*    */     //   385: invokestatic valueOf : (J)Ljava/math/BigInteger;
/*    */     //   388: dup
/*    */     //   389: ldc 'valueOf(...)'
/*    */     //   391: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   394: invokevirtual multiply : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
/*    */     //   397: dup
/*    */     //   398: ldc 'multiply(...)'
/*    */     //   400: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   403: astore #10
/*    */     //   405: iload #7
/*    */     //   407: ifle -> 424
/*    */     //   410: aload_0
/*    */     //   411: aload_3
/*    */     //   412: aload #9
/*    */     //   414: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   417: aload #9
/*    */     //   419: aload #10
/*    */     //   421: invokespecial buy : (Lnet/minecraft/class_3222;Lnet/minecraft/class_1799;Ljava/math/BigInteger;)V
/*    */     //   424: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 18
/*    */     //   #22	-> 27
/*    */     //   #23	-> 35
/*    */     //   #26	-> 74
/*    */     //   #29	-> 80
/*    */     //   #31	-> 96
/*    */     //   #34	-> 105
/*    */     //   #36	-> 112
/*    */     //   #38	-> 117
/*    */     //   #40	-> 126
/*    */     //   #42	-> 131
/*    */     //   #44	-> 150
/*    */     //   #46	-> 196
/*    */     //   #48	-> 208
/*    */     //   #49	-> 216
/*    */     //   #52	-> 217
/*    */     //   #54	-> 225
/*    */     //   #56	-> 237
/*    */     //   #58	-> 250
/*    */     //   #101	-> 265
/*    */     //   #59	-> 303
/*    */     //   #60	-> 306
/*    */     //   #61	-> 318
/*    */     //   #62	-> 322
/*    */     //   #63	-> 326
/*    */     //   #64	-> 330
/*    */     //   #65	-> 335
/*    */     //   #61	-> 339
/*    */     //   #59	-> 345
/*    */     //   #68	-> 348
/*    */     //   #101	-> 349
/*    */     //   #102	-> 353
/*    */     //   #70	-> 357
/*    */     //   #71	-> 358
/*    */     //   #72	-> 359
/*    */     //   #75	-> 360
/*    */     //   #76	-> 374
/*    */     //   #76	-> 375
/*    */     //   #76	-> 403
/*    */     //   #78	-> 405
/*    */     //   #79	-> 410
/*    */     //   #81	-> 424
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   303	46	16	$i$a$-forEach-BuyHandler$handle$1	I
/*    */     //   300	49	15	player	Lnet/minecraft/class_1657;
/*    */     //   293	57	14	element$iv	Ljava/lang/Object;
/*    */     //   265	89	12	$i$f$forEach	I
/*    */     //   262	92	11	$this$forEach$iv	Ljava/lang/Iterable;
/*    */     //   196	162	10	offer	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;
/*    */     //   126	233	9	shop	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;
/*    */     //   27	398	4	dimension	Lnet/minecraft/class_5321;
/*    */     //   35	390	5	level	Lnet/minecraft/class_3218;
/*    */     //   74	351	6	cobbleMerchant	Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;
/*    */     //   80	345	7	realAmount	I
/*    */     //   96	329	8	obtainableLimit	I
/*    */     //   374	51	9	boughtStack	Lnet/minecraft/class_1799;
/*    */     //   405	20	10	totalPrice	Ljava/math/BigInteger;
/*    */     //   0	425	0	this	Lfr/harmex/cobbledollars/common/network/handlers/server/BuyHandler;
/*    */     //   0	425	1	packet	Lfr/harmex/cobbledollars/common/network/packets/c2s/BuyPacket;
/*    */     //   0	425	2	server	Lnet/minecraft/server/MinecraftServer;
/*    */     //   0	425	3	player	Lnet/minecraft/class_3222;
/*    */   }
/*    */   
/*    */   private final void buy(class_3222 player, class_1799 items, BigInteger price) {
/* 84 */     if (PlayerExtensionKt.getCobbleDollars((class_1657)player).compareTo(price) >= 0) {
/* 85 */       Intrinsics.checkNotNullExpressionValue(PlayerExtensionKt.getCobbleDollars((class_1657)player).subtract(price), "subtract(...)");
/* 85 */       PlayerExtensionKt.setCobbleDollars((class_1657)player, PlayerExtensionKt.getCobbleDollars((class_1657)player).subtract(price));
/* 86 */       player.method_7270(items);
/* 87 */       player.method_37908().method_43128(
/* 88 */           null, 
/* 89 */           player.method_23317(), 
/* 90 */           player.method_23318(), 
/* 91 */           player.method_23321(), 
/* 92 */           class_3417.field_15197, 
/* 93 */           class_3419.field_15248, 
/* 94 */           0.2F, ((
/* 95 */           player.method_59922().method_43057() - player.method_59922().method_43057()) * 0.7F + 1.0F) * 2.0F);
/* 97 */       player.field_7512.method_7623();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\network\handlers\server\BuyHandler.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */