/*     */ package fr.harmex.cobbledollars.common.command;
/*     */ 
/*     */ import com.cobblemon.mod.common.api.text.TextKt;
/*     */ import com.cobblemon.mod.common.util.PermissionUtilsKt;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.StringArgumentType;
/*     */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.tree.CommandNode;
/*     */ import com.mojang.brigadier.tree.LiteralCommandNode;
/*     */ import fr.harmex.cobbledollars.common.command.arguments.BigIntegerArgumentType;
/*     */ import fr.harmex.cobbledollars.common.command.permission.CobbleDollarsPermissions;
/*     */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*     */ import fr.harmex.cobbledollars.common.utils.extensions.PlayerExtensionKt;
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.CobbleDollarsShopHolder;
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Offer;
/*     */ import java.math.BigInteger;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import net.minecraft.class_1297;
/*     */ import net.minecraft.class_1657;
/*     */ import net.minecraft.class_1799;
/*     */ import net.minecraft.class_2168;
/*     */ import net.minecraft.class_2170;
/*     */ import net.minecraft.class_2186;
/*     */ import net.minecraft.class_2287;
/*     */ import net.minecraft.class_2290;
/*     */ import net.minecraft.class_2561;
/*     */ import net.minecraft.class_3222;
/*     */ import net.minecraft.class_7157;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\036\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\f\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J#\020\n\032\0020\t2\f\020\006\032\b\022\004\022\0020\0050\0042\006\020\b\032\0020\007¢\006\004\b\n\020\013J\037\020\020\032\0020\0172\006\020\f\032\0020\0052\006\020\016\032\0020\rH\002¢\006\004\b\020\020\021J-\020\026\032\0020\0172\006\020\f\032\0020\0052\f\020\023\032\b\022\004\022\0020\r0\0222\006\020\025\032\0020\024H\002¢\006\004\b\026\020\027J=\020\034\032\0020\0172\006\020\f\032\0020\0052\f\020\023\032\b\022\004\022\0020\r0\0222\006\020\025\032\0020\0242\006\020\031\032\0020\0302\006\020\033\032\0020\032H\002¢\006\004\b\034\020\035J-\020\036\032\0020\0172\006\020\f\032\0020\0052\f\020\023\032\b\022\004\022\0020\r0\0222\006\020\025\032\0020\024H\002¢\006\004\b\036\020\027JA\020\037\032\0020\0172\006\020\f\032\0020\0052\f\020\023\032\b\022\004\022\0020\r0\0222\006\020\025\032\0020\0242\006\020\031\032\0020\0302\n\b\002\020\033\032\004\030\0010\032H\002¢\006\004\b\037\020\035J5\020 \032\0020\0172\006\020\f\032\0020\0052\f\020\023\032\b\022\004\022\0020\r0\0222\006\020\025\032\0020\0242\006\020\033\032\0020\032H\002¢\006\004\b \020!J9\020\"\032\0020\0172\006\020\f\032\0020\0052\f\020\023\032\b\022\004\022\0020\r0\0222\006\020\025\032\0020\0242\n\b\002\020\033\032\004\030\0010\032H\002¢\006\004\b\"\020!J\027\020#\032\0020\0172\006\020\f\032\0020\005H\002¢\006\004\b#\020$J\027\020%\032\0020\0172\006\020\f\032\0020\005H\002¢\006\004\b%\020$¨\006&"}, d2 = {"Lfr/harmex/cobbledollars/common/command/CobbleMerchantCommand;", "", "<init>", "()V", "Lcom/mojang/brigadier/CommandDispatcher;", "Lnet/minecraft/class_2168;", "dispatcher", "Lnet/minecraft/class_7157;", "buildContext", "", "register", "(Lcom/mojang/brigadier/CommandDispatcher;Lnet/minecraft/class_7157;)V", "sourceStack", "Lnet/minecraft/class_1297;", "target", "", "openEditScreen", "(Lnet/minecraft/class_2168;Lnet/minecraft/class_1297;)I", "", "targets", "", "category", "addCategory", "(Lnet/minecraft/class_2168;Ljava/util/Collection;Ljava/lang/String;)I", "Lnet/minecraft/class_2290;", "itemInput", "Ljava/math/BigInteger;", "price", "addOfferToCategory", "(Lnet/minecraft/class_2168;Ljava/util/Collection;Ljava/lang/String;Lnet/minecraft/class_2290;Ljava/math/BigInteger;)I", "removeCategory", "removeOfferFromCategory", "addItemInHandToCategory", "(Lnet/minecraft/class_2168;Ljava/util/Collection;Ljava/lang/String;Ljava/math/BigInteger;)I", "removeItemInHandFromCategory", "openShop", "(Lnet/minecraft/class_2168;)I", "openBank", "common"})
/*     */ @SourceDebugExtension({"SMAP\nCobbleMerchantCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CobbleMerchantCommand.kt\nfr/harmex/cobbledollars/common/command/CobbleMerchantCommand\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,307:1\n808#2,11:308\n774#2:319\n865#2,2:320\n808#2,11:322\n774#2:333\n865#2,2:334\n808#2,11:336\n774#2:347\n865#2,2:348\n808#2,11:350\n774#2:361\n865#2,2:362\n808#2,11:364\n774#2:375\n865#2,2:376\n808#2,11:378\n774#2:389\n865#2,2:390\n*S KotlinDebug\n*F\n+ 1 CobbleMerchantCommand.kt\nfr/harmex/cobbledollars/common/command/CobbleMerchantCommand\n*L\n152#1:308,11\n152#1:319\n152#1:320,2\n170#1:322,11\n170#1:333\n170#1:334,2\n198#1:336,11\n198#1:347\n198#1:348,2\n216#1:350,11\n216#1:361\n216#1:362,2\n243#1:364,11\n243#1:375\n243#1:376,2\n272#1:378,11\n272#1:389\n272#1:390,2\n*E\n"})
/*     */ public final class CobbleMerchantCommand {
/*     */   @NotNull
/*     */   public static final CobbleMerchantCommand INSTANCE = new CobbleMerchantCommand();
/*     */   
/*     */   public final void register(@NotNull CommandDispatcher dispatcher, @NotNull class_7157 buildContext) {
/*  29 */     Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
/*  29 */     Intrinsics.checkNotNullParameter(buildContext, "buildContext");
/*  30 */     Intrinsics.checkNotNullExpressionValue(class_2170.method_9247("cobblemerchant"), "literal(...)");
/*  31 */     Intrinsics.checkNotNullExpressionValue(class_2170.method_9247("edit"), "literal(...)");
/* 126 */     Intrinsics.checkNotNullExpressionValue(class_2170.method_9247("open"), "literal(...)");
/* 127 */     Intrinsics.checkNotNullExpressionValue(class_2170.method_9247("shop"), "literal(...)");
/* 132 */     Intrinsics.checkNotNullExpressionValue(class_2170.method_9247("bank"), "literal(...)");
/* 132 */     LiteralCommandNode mainNode = dispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)PermissionUtilsKt.permission$default((ArgumentBuilder)class_2170.method_9247("cobblemerchant"), CobbleDollarsPermissions.INSTANCE.getCOBBLE_MERCHANT(), false, 2, null)).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)PermissionUtilsKt.permission$default((ArgumentBuilder)class_2170.method_9247("edit"), CobbleDollarsPermissions.INSTANCE.getCOBBLE_MERCHANT_EDIT(), false, 2, null)).then(class_2170.method_9244("target", (ArgumentType)class_2186.method_9309()).executes(CobbleMerchantCommand::register$lambda$0))).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_2170.method_9244("targets", (ArgumentType)class_2186.method_9306()).then(class_2170.method_9247("add").then(((RequiredArgumentBuilder)class_2170.method_9244("category", (ArgumentType)StringArgumentType.string()).executes(CobbleMerchantCommand::register$lambda$1)).then(class_2170.method_9244("item", (ArgumentType)class_2287.method_9776(buildContext)).then(class_2170.method_9244("price", (ArgumentType)BigIntegerArgumentType.Companion.bigInt(0)).executes(CobbleMerchantCommand::register$lambda$2)))))).then(class_2170.method_9247("remove").then(((RequiredArgumentBuilder)class_2170.method_9244("category", (ArgumentType)StringArgumentType.string()).executes(CobbleMerchantCommand::register$lambda$3)).then(class_2170.method_9244("item", (ArgumentType)class_2287.method_9776(buildContext)).then(class_2170.method_9244("price", (ArgumentType)BigIntegerArgumentType.Companion.bigInt(0)).executes(CobbleMerchantCommand::register$lambda$4)))))).then(class_2170.method_9247("addItemInHandTo").then(class_2170.method_9244("category", (ArgumentType)StringArgumentType.string()).then(class_2170.method_9244("price", (ArgumentType)BigIntegerArgumentType.Companion.bigInt(0)).executes(CobbleMerchantCommand::register$lambda$5))))).then(class_2170.method_9247("removeItemInHandFrom").then(((RequiredArgumentBuilder)class_2170.method_9244("category", (ArgumentType)StringArgumentType.string()).executes(CobbleMerchantCommand::register$lambda$6)).then(class_2170.method_9244("price", (ArgumentType)BigIntegerArgumentType.Companion.bigInt(0)).executes(CobbleMerchantCommand::register$lambda$7))))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)PermissionUtilsKt.permission$default((ArgumentBuilder)class_2170.method_9247("open"), CobbleDollarsPermissions.INSTANCE.getCOBBLE_MERCHANT_OPEN(), false, 2, null)).then(((LiteralArgumentBuilder)PermissionUtilsKt.permission$default((ArgumentBuilder)class_2170.method_9247("shop"), CobbleDollarsPermissions.INSTANCE.getCOBBLE_MERCHANT_OPEN_SHOP(), false, 2, null)).executes(CobbleMerchantCommand::register$lambda$8))).then(((LiteralArgumentBuilder)PermissionUtilsKt.permission$default((ArgumentBuilder)class_2170.method_9247("bank"), CobbleDollarsPermissions.INSTANCE.getCOBBLE_MERCHANT_OPEN_BANK(), false, 2, null))
/* 133 */             .executes(CobbleMerchantCommand::register$lambda$9))));
/* 139 */     Intrinsics.checkNotNullExpressionValue(class_2170.method_9247("cm"), "literal(...)");
/* 139 */     dispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)PermissionUtilsKt.permission$default((ArgumentBuilder)class_2170.method_9247("cm"), CobbleDollarsPermissions.INSTANCE.getCOBBLE_MERCHANT(), false, 2, null)).redirect((CommandNode)mainNode));
/*     */   }
/*     */   
/*     */   private static final int register$lambda$0(CommandContext context) {
/*     */     Intrinsics.checkNotNullExpressionValue(context.getSource(), "getSource(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(class_2186.method_9313(context, "target"), "getEntity(...)");
/*     */     return INSTANCE.openEditScreen((class_2168)context.getSource(), class_2186.method_9313(context, "target"));
/*     */   }
/*     */   
/*     */   private static final int register$lambda$1(CommandContext context) {
/*     */     Intrinsics.checkNotNullExpressionValue(context.getSource(), "getSource(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(class_2186.method_9317(context, "targets"), "getEntities(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(StringArgumentType.getString(context, "category"), "getString(...)");
/*     */     return INSTANCE.addCategory((class_2168)context.getSource(), class_2186.method_9317(context, "targets"), StringArgumentType.getString(context, "category"));
/*     */   }
/*     */   
/*     */   private static final int register$lambda$2(CommandContext context) {
/*     */     Intrinsics.checkNotNullExpressionValue(context.getSource(), "getSource(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(class_2186.method_9317(context, "targets"), "getEntities(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(StringArgumentType.getString(context, "category"), "getString(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(class_2287.method_9777(context, "item"), "getItem(...)");
/*     */     Intrinsics.checkNotNull(context);
/*     */     return INSTANCE.addOfferToCategory((class_2168)context.getSource(), class_2186.method_9317(context, "targets"), StringArgumentType.getString(context, "category"), class_2287.method_9777(context, "item"), BigIntegerArgumentType.Companion.getBigInteger(context, "price"));
/*     */   }
/*     */   
/*     */   private static final int register$lambda$3(CommandContext context) {
/*     */     Intrinsics.checkNotNullExpressionValue(context.getSource(), "getSource(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(class_2186.method_9317(context, "targets"), "getEntities(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(StringArgumentType.getString(context, "category"), "getString(...)");
/*     */     return INSTANCE.removeCategory((class_2168)context.getSource(), class_2186.method_9317(context, "targets"), StringArgumentType.getString(context, "category"));
/*     */   }
/*     */   
/*     */   private static final int register$lambda$4(CommandContext context) {
/*     */     Intrinsics.checkNotNullExpressionValue(context.getSource(), "getSource(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(class_2186.method_9317(context, "targets"), "getEntities(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(StringArgumentType.getString(context, "category"), "getString(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(class_2287.method_9777(context, "item"), "getItem(...)");
/*     */     Intrinsics.checkNotNull(context);
/*     */     return INSTANCE.removeOfferFromCategory((class_2168)context.getSource(), class_2186.method_9317(context, "targets"), StringArgumentType.getString(context, "category"), class_2287.method_9777(context, "item"), BigIntegerArgumentType.Companion.getBigInteger(context, "price"));
/*     */   }
/*     */   
/*     */   private static final int register$lambda$5(CommandContext context) {
/*     */     Intrinsics.checkNotNullExpressionValue(context.getSource(), "getSource(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(class_2186.method_9317(context, "targets"), "getEntities(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(StringArgumentType.getString(context, "category"), "getString(...)");
/*     */     Intrinsics.checkNotNull(context);
/*     */     return INSTANCE.addItemInHandToCategory((class_2168)context.getSource(), class_2186.method_9317(context, "targets"), StringArgumentType.getString(context, "category"), BigIntegerArgumentType.Companion.getBigInteger(context, "price"));
/*     */   }
/*     */   
/*     */   private static final int register$lambda$6(CommandContext context) {
/*     */     Intrinsics.checkNotNullExpressionValue(context.getSource(), "getSource(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(class_2186.method_9317(context, "targets"), "getEntities(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(StringArgumentType.getString(context, "category"), "getString(...)");
/*     */     return removeItemInHandFromCategory$default(INSTANCE, (class_2168)context.getSource(), class_2186.method_9317(context, "targets"), StringArgumentType.getString(context, "category"), null, 8, null);
/*     */   }
/*     */   
/*     */   private static final int register$lambda$7(CommandContext context) {
/*     */     Intrinsics.checkNotNullExpressionValue(context.getSource(), "getSource(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(class_2186.method_9317(context, "targets"), "getEntities(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(StringArgumentType.getString(context, "category"), "getString(...)");
/*     */     Intrinsics.checkNotNull(context);
/*     */     return INSTANCE.removeItemInHandFromCategory((class_2168)context.getSource(), class_2186.method_9317(context, "targets"), StringArgumentType.getString(context, "category"), BigIntegerArgumentType.Companion.getBigInteger(context, "price"));
/*     */   }
/*     */   
/*     */   private static final int register$lambda$8(CommandContext context) {
/*     */     Intrinsics.checkNotNullExpressionValue(context.getSource(), "getSource(...)");
/*     */     return INSTANCE.openShop((class_2168)context.getSource());
/*     */   }
/*     */   
/*     */   private static final int register$lambda$9(CommandContext context) {
/*     */     Intrinsics.checkNotNullExpressionValue(context.getSource(), "getSource(...)");
/*     */     return INSTANCE.openBank((class_2168)context.getSource());
/*     */   }
/*     */   
/*     */   private final int openEditScreen(class_2168 sourceStack, class_1297 target) {
/* 143 */     class_3222 player = sourceStack.method_9207();
/* 144 */     if (target instanceof CobbleDollarsShopHolder) {
/* 145 */       Intrinsics.checkNotNull(player);
/* 145 */       PlayerExtensionKt.openShop((class_1657)player, (CobbleDollarsShopHolder)target, true);
/* 146 */       return 1;
/*     */     } 
/* 148 */     return 0;
/*     */   }
/*     */   
/*     */   private final int addCategory(class_2168 sourceStack, Collection targets, String category) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: checkcast java/lang/Iterable
/*     */     //   4: astore #5
/*     */     //   6: iconst_0
/*     */     //   7: istore #6
/*     */     //   9: aload #5
/*     */     //   11: astore #7
/*     */     //   13: new java/util/ArrayList
/*     */     //   16: dup
/*     */     //   17: invokespecial <init> : ()V
/*     */     //   20: checkcast java/util/Collection
/*     */     //   23: astore #8
/*     */     //   25: iconst_0
/*     */     //   26: istore #9
/*     */     //   28: aload #7
/*     */     //   30: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   35: astore #10
/*     */     //   37: aload #10
/*     */     //   39: invokeinterface hasNext : ()Z
/*     */     //   44: ifeq -> 77
/*     */     //   47: aload #10
/*     */     //   49: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   54: astore #11
/*     */     //   56: aload #11
/*     */     //   58: instanceof fr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder
/*     */     //   61: ifeq -> 37
/*     */     //   64: aload #8
/*     */     //   66: aload #11
/*     */     //   68: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   73: pop
/*     */     //   74: goto -> 37
/*     */     //   77: aload #8
/*     */     //   79: checkcast java/util/List
/*     */     //   82: nop
/*     */     //   83: checkcast java/lang/Iterable
/*     */     //   86: astore #5
/*     */     //   88: nop
/*     */     //   89: iconst_0
/*     */     //   90: istore #6
/*     */     //   92: aload #5
/*     */     //   94: astore #7
/*     */     //   96: new java/util/ArrayList
/*     */     //   99: dup
/*     */     //   100: invokespecial <init> : ()V
/*     */     //   103: checkcast java/util/Collection
/*     */     //   106: astore #8
/*     */     //   108: iconst_0
/*     */     //   109: istore #9
/*     */     //   111: aload #7
/*     */     //   113: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   118: astore #10
/*     */     //   120: aload #10
/*     */     //   122: invokeinterface hasNext : ()Z
/*     */     //   127: ifeq -> 180
/*     */     //   130: aload #10
/*     */     //   132: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   137: astore #11
/*     */     //   139: aload #11
/*     */     //   141: checkcast fr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder
/*     */     //   144: astore #12
/*     */     //   146: iconst_0
/*     */     //   147: istore #13
/*     */     //   149: aload #12
/*     */     //   151: invokeinterface getShop : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;
/*     */     //   156: ifnull -> 163
/*     */     //   159: iconst_1
/*     */     //   160: goto -> 164
/*     */     //   163: iconst_0
/*     */     //   164: ifeq -> 120
/*     */     //   167: aload #8
/*     */     //   169: aload #11
/*     */     //   171: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   176: pop
/*     */     //   177: goto -> 120
/*     */     //   180: aload #8
/*     */     //   182: checkcast java/util/List
/*     */     //   185: nop
/*     */     //   186: astore #4
/*     */     //   188: new kotlin/jvm/internal/Ref$IntRef
/*     */     //   191: dup
/*     */     //   192: invokespecial <init> : ()V
/*     */     //   195: astore #5
/*     */     //   197: aload #4
/*     */     //   199: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   204: astore #6
/*     */     //   206: aload #6
/*     */     //   208: invokeinterface hasNext : ()Z
/*     */     //   213: ifeq -> 265
/*     */     //   216: aload #6
/*     */     //   218: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   223: checkcast fr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder
/*     */     //   226: astore #7
/*     */     //   228: aload #7
/*     */     //   230: invokeinterface getShop : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;
/*     */     //   235: dup
/*     */     //   236: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   239: aload_3
/*     */     //   240: invokevirtual add : (Ljava/lang/String;)Z
/*     */     //   243: ifeq -> 206
/*     */     //   246: aload #5
/*     */     //   248: getfield element : I
/*     */     //   251: istore #8
/*     */     //   253: aload #5
/*     */     //   255: iload #8
/*     */     //   257: iconst_1
/*     */     //   258: iadd
/*     */     //   259: putfield element : I
/*     */     //   262: goto -> 206
/*     */     //   265: aload #5
/*     */     //   267: getfield element : I
/*     */     //   270: iconst_1
/*     */     //   271: if_icmple -> 290
/*     */     //   274: aload_1
/*     */     //   275: aload_3
/*     */     //   276: aload #5
/*     */     //   278: <illegal opcode> get : (Ljava/lang/String;Lkotlin/jvm/internal/Ref$IntRef;)Ljava/util/function/Supplier;
/*     */     //   283: iconst_1
/*     */     //   284: invokevirtual method_9226 : (Ljava/util/function/Supplier;Z)V
/*     */     //   287: goto -> 303
/*     */     //   290: aload_1
/*     */     //   291: aload_3
/*     */     //   292: aload #4
/*     */     //   294: <illegal opcode> get : (Ljava/lang/String;Ljava/util/List;)Ljava/util/function/Supplier;
/*     */     //   299: iconst_1
/*     */     //   300: invokevirtual method_9226 : (Ljava/util/function/Supplier;Z)V
/*     */     //   303: aload #5
/*     */     //   305: getfield element : I
/*     */     //   308: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #152	-> 0
/*     */     //   #308	-> 9
/*     */     //   #317	-> 28
/*     */     //   #318	-> 77
/*     */     //   #308	-> 82
/*     */     //   #152	-> 88
/*     */     //   #319	-> 92
/*     */     //   #320	-> 111
/*     */     //   #152	-> 149
/*     */     //   #320	-> 164
/*     */     //   #321	-> 180
/*     */     //   #319	-> 185
/*     */     //   #152	-> 186
/*     */     //   #154	-> 188
/*     */     //   #156	-> 197
/*     */     //   #157	-> 228
/*     */     //   #160	-> 265
/*     */     //   #161	-> 274
/*     */     //   #163	-> 290
/*     */     //   #166	-> 303
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   56	18	11	element$iv$iv	Ljava/lang/Object;
/*     */     //   28	51	9	$i$f$filterIsInstanceTo	I
/*     */     //   25	54	7	$this$filterIsInstanceTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   25	54	8	destination$iv$iv	Ljava/util/Collection;
/*     */     //   9	74	6	$i$f$filterIsInstance	I
/*     */     //   6	77	5	$this$filterIsInstance$iv	Ljava/lang/Iterable;
/*     */     //   149	15	13	$i$a$-filter-CobbleMerchantCommand$addCategory$filteredTargets$1	I
/*     */     //   146	18	12	it	Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;
/*     */     //   139	38	11	element$iv$iv	Ljava/lang/Object;
/*     */     //   111	71	9	$i$f$filterTo	I
/*     */     //   108	74	7	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   108	74	8	destination$iv$iv	Ljava/util/Collection;
/*     */     //   92	94	6	$i$f$filter	I
/*     */     //   89	97	5	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   228	34	7	cobbleMerchant	Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;
/*     */     //   188	121	4	filteredTargets	Ljava/util/List;
/*     */     //   197	112	5	success	Lkotlin/jvm/internal/Ref$IntRef;
/*     */     //   0	309	0	this	Lfr/harmex/cobbledollars/common/command/CobbleMerchantCommand;
/*     */     //   0	309	1	sourceStack	Lnet/minecraft/class_2168;
/*     */     //   0	309	2	targets	Ljava/util/Collection;
/*     */     //   0	309	3	category	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   private static final class_2561 addCategory$lambda$11(String $category, Ref.IntRef $success) {
/* 161 */     Intrinsics.checkNotNullParameter($category, "$category");
/* 161 */     Intrinsics.checkNotNullParameter($success, "$success");
/* 161 */     Object[] arrayOfObject = new Object[2];
/* 161 */     Intrinsics.checkNotNullExpressionValue(class_2561.method_43470($category), "literal(...)");
/* 161 */     arrayOfObject[0] = TextKt.green(class_2561.method_43470($category));
/* 161 */     arrayOfObject[1] = Integer.valueOf($success.element);
/* 161 */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("cobblemerchant.add.category.success.multiple", arrayOfObject);
/*     */   }
/*     */   
/*     */   private static final class_2561 addCategory$lambda$12(String $category, List $filteredTargets) {
/* 163 */     Intrinsics.checkNotNullParameter($category, "$category");
/* 163 */     Intrinsics.checkNotNullParameter($filteredTargets, "$filteredTargets");
/* 163 */     Object[] arrayOfObject = new Object[2];
/* 163 */     Intrinsics.checkNotNullExpressionValue(class_2561.method_43470($category), "literal(...)");
/* 163 */     arrayOfObject[0] = TextKt.green(class_2561.method_43470($category));
/* 163 */     Intrinsics.checkNotNull($filteredTargets.iterator().next(), "null cannot be cast to non-null type net.minecraft.world.entity.Entity");
/* 163 */     Intrinsics.checkNotNull(((class_1297)$filteredTargets.iterator().next()).method_5476());
/* 163 */     arrayOfObject[1] = ((class_1297)$filteredTargets.iterator().next()).method_5476();
/* 163 */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("cobblemerchant.add.category.success.single", arrayOfObject);
/*     */   }
/*     */   
/*     */   private final int addOfferToCategory(class_2168 sourceStack, Collection targets, String category, class_2290 itemInput, BigInteger price) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: checkcast java/lang/Iterable
/*     */     //   4: astore #7
/*     */     //   6: iconst_0
/*     */     //   7: istore #8
/*     */     //   9: aload #7
/*     */     //   11: astore #9
/*     */     //   13: new java/util/ArrayList
/*     */     //   16: dup
/*     */     //   17: invokespecial <init> : ()V
/*     */     //   20: checkcast java/util/Collection
/*     */     //   23: astore #10
/*     */     //   25: iconst_0
/*     */     //   26: istore #11
/*     */     //   28: aload #9
/*     */     //   30: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   35: astore #12
/*     */     //   37: aload #12
/*     */     //   39: invokeinterface hasNext : ()Z
/*     */     //   44: ifeq -> 77
/*     */     //   47: aload #12
/*     */     //   49: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   54: astore #13
/*     */     //   56: aload #13
/*     */     //   58: instanceof fr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder
/*     */     //   61: ifeq -> 37
/*     */     //   64: aload #10
/*     */     //   66: aload #13
/*     */     //   68: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   73: pop
/*     */     //   74: goto -> 37
/*     */     //   77: aload #10
/*     */     //   79: checkcast java/util/List
/*     */     //   82: nop
/*     */     //   83: checkcast java/lang/Iterable
/*     */     //   86: astore #7
/*     */     //   88: nop
/*     */     //   89: iconst_0
/*     */     //   90: istore #8
/*     */     //   92: aload #7
/*     */     //   94: astore #9
/*     */     //   96: new java/util/ArrayList
/*     */     //   99: dup
/*     */     //   100: invokespecial <init> : ()V
/*     */     //   103: checkcast java/util/Collection
/*     */     //   106: astore #10
/*     */     //   108: iconst_0
/*     */     //   109: istore #11
/*     */     //   111: aload #9
/*     */     //   113: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   118: astore #12
/*     */     //   120: aload #12
/*     */     //   122: invokeinterface hasNext : ()Z
/*     */     //   127: ifeq -> 180
/*     */     //   130: aload #12
/*     */     //   132: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   137: astore #13
/*     */     //   139: aload #13
/*     */     //   141: checkcast fr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder
/*     */     //   144: astore #14
/*     */     //   146: iconst_0
/*     */     //   147: istore #15
/*     */     //   149: aload #14
/*     */     //   151: invokeinterface getShop : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;
/*     */     //   156: ifnull -> 163
/*     */     //   159: iconst_1
/*     */     //   160: goto -> 164
/*     */     //   163: iconst_0
/*     */     //   164: ifeq -> 120
/*     */     //   167: aload #10
/*     */     //   169: aload #13
/*     */     //   171: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   176: pop
/*     */     //   177: goto -> 120
/*     */     //   180: aload #10
/*     */     //   182: checkcast java/util/List
/*     */     //   185: nop
/*     */     //   186: astore #6
/*     */     //   188: aload #4
/*     */     //   190: iconst_1
/*     */     //   191: iconst_0
/*     */     //   192: invokevirtual method_9781 : (IZ)Lnet/minecraft/class_1799;
/*     */     //   195: astore #7
/*     */     //   197: new fr/harmex/cobbledollars/common/world/item/trading/shop/Offer
/*     */     //   200: dup
/*     */     //   201: aload #7
/*     */     //   203: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   206: aload #7
/*     */     //   208: aload #5
/*     */     //   210: iconst_0
/*     */     //   211: iconst_4
/*     */     //   212: aconst_null
/*     */     //   213: invokespecial <init> : (Lnet/minecraft/class_1799;Ljava/math/BigInteger;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   216: astore #8
/*     */     //   218: new kotlin/jvm/internal/Ref$IntRef
/*     */     //   221: dup
/*     */     //   222: invokespecial <init> : ()V
/*     */     //   225: astore #9
/*     */     //   227: aload #6
/*     */     //   229: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   234: astore #10
/*     */     //   236: aload #10
/*     */     //   238: invokeinterface hasNext : ()Z
/*     */     //   243: ifeq -> 367
/*     */     //   246: aload #10
/*     */     //   248: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   253: checkcast fr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder
/*     */     //   256: astore #11
/*     */     //   258: aload #11
/*     */     //   260: invokeinterface getShop : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;
/*     */     //   265: dup
/*     */     //   266: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   269: astore #12
/*     */     //   271: aload #12
/*     */     //   273: aload_3
/*     */     //   274: invokevirtual has : (Ljava/lang/String;)Z
/*     */     //   277: ifeq -> 317
/*     */     //   280: aload #12
/*     */     //   282: aload_3
/*     */     //   283: invokevirtual get : (Ljava/lang/String;)Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;
/*     */     //   286: dup
/*     */     //   287: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   290: aload #8
/*     */     //   292: aconst_null
/*     */     //   293: iconst_2
/*     */     //   294: aconst_null
/*     */     //   295: invokestatic addOffer$default : (Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;Ljava/lang/Integer;ILjava/lang/Object;)V
/*     */     //   298: aload #9
/*     */     //   300: getfield element : I
/*     */     //   303: istore #13
/*     */     //   305: aload #9
/*     */     //   307: iload #13
/*     */     //   309: iconst_1
/*     */     //   310: iadd
/*     */     //   311: putfield element : I
/*     */     //   314: goto -> 236
/*     */     //   317: aload #12
/*     */     //   319: new fr/harmex/cobbledollars/common/world/item/trading/shop/Category
/*     */     //   322: dup
/*     */     //   323: aload_3
/*     */     //   324: iconst_1
/*     */     //   325: anewarray fr/harmex/cobbledollars/common/world/item/trading/shop/Offer
/*     */     //   328: astore #13
/*     */     //   330: aload #13
/*     */     //   332: iconst_0
/*     */     //   333: aload #8
/*     */     //   335: aastore
/*     */     //   336: aload #13
/*     */     //   338: invokestatic arrayListOf : ([Ljava/lang/Object;)Ljava/util/ArrayList;
/*     */     //   341: invokespecial <init> : (Ljava/lang/String;Ljava/util/ArrayList;)V
/*     */     //   344: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   347: pop
/*     */     //   348: aload #9
/*     */     //   350: getfield element : I
/*     */     //   353: istore #13
/*     */     //   355: aload #9
/*     */     //   357: iload #13
/*     */     //   359: iconst_1
/*     */     //   360: iadd
/*     */     //   361: putfield element : I
/*     */     //   364: goto -> 236
/*     */     //   367: aload #9
/*     */     //   369: getfield element : I
/*     */     //   372: iconst_1
/*     */     //   373: if_icmple -> 394
/*     */     //   376: aload_1
/*     */     //   377: aload #8
/*     */     //   379: aload_1
/*     */     //   380: aload #9
/*     */     //   382: <illegal opcode> get : (Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;Lnet/minecraft/class_2168;Lkotlin/jvm/internal/Ref$IntRef;)Ljava/util/function/Supplier;
/*     */     //   387: iconst_1
/*     */     //   388: invokevirtual method_9226 : (Ljava/util/function/Supplier;Z)V
/*     */     //   391: goto -> 409
/*     */     //   394: aload_1
/*     */     //   395: aload #8
/*     */     //   397: aload_1
/*     */     //   398: aload #6
/*     */     //   400: <illegal opcode> get : (Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;Lnet/minecraft/class_2168;Ljava/util/List;)Ljava/util/function/Supplier;
/*     */     //   405: iconst_1
/*     */     //   406: invokevirtual method_9226 : (Ljava/util/function/Supplier;Z)V
/*     */     //   409: aload #9
/*     */     //   411: getfield element : I
/*     */     //   414: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #170	-> 0
/*     */     //   #322	-> 9
/*     */     //   #331	-> 28
/*     */     //   #332	-> 77
/*     */     //   #322	-> 82
/*     */     //   #170	-> 88
/*     */     //   #333	-> 92
/*     */     //   #334	-> 111
/*     */     //   #170	-> 149
/*     */     //   #334	-> 164
/*     */     //   #335	-> 180
/*     */     //   #333	-> 185
/*     */     //   #170	-> 186
/*     */     //   #172	-> 188
/*     */     //   #173	-> 197
/*     */     //   #175	-> 218
/*     */     //   #177	-> 227
/*     */     //   #178	-> 258
/*     */     //   #179	-> 271
/*     */     //   #180	-> 280
/*     */     //   #181	-> 298
/*     */     //   #183	-> 317
/*     */     //   #184	-> 348
/*     */     //   #188	-> 367
/*     */     //   #189	-> 376
/*     */     //   #191	-> 394
/*     */     //   #194	-> 409
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   56	18	13	element$iv$iv	Ljava/lang/Object;
/*     */     //   28	51	11	$i$f$filterIsInstanceTo	I
/*     */     //   25	54	9	$this$filterIsInstanceTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   25	54	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   9	74	8	$i$f$filterIsInstance	I
/*     */     //   6	77	7	$this$filterIsInstance$iv	Ljava/lang/Iterable;
/*     */     //   149	15	15	$i$a$-filter-CobbleMerchantCommand$addOfferToCategory$filteredTargets$1	I
/*     */     //   146	18	14	it	Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;
/*     */     //   139	38	13	element$iv$iv	Ljava/lang/Object;
/*     */     //   111	71	11	$i$f$filterTo	I
/*     */     //   108	74	9	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   108	74	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   92	94	8	$i$f$filter	I
/*     */     //   89	97	7	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   271	93	12	shop	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;
/*     */     //   258	106	11	cobbleMerchant	Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;
/*     */     //   188	227	6	filteredTargets	Ljava/util/List;
/*     */     //   197	218	7	item	Lnet/minecraft/class_1799;
/*     */     //   218	197	8	offer	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;
/*     */     //   227	188	9	success	Lkotlin/jvm/internal/Ref$IntRef;
/*     */     //   0	415	0	this	Lfr/harmex/cobbledollars/common/command/CobbleMerchantCommand;
/*     */     //   0	415	1	sourceStack	Lnet/minecraft/class_2168;
/*     */     //   0	415	2	targets	Ljava/util/Collection;
/*     */     //   0	415	3	category	Ljava/lang/String;
/*     */     //   0	415	4	itemInput	Lnet/minecraft/class_2290;
/*     */     //   0	415	5	price	Ljava/math/BigInteger;
/*     */   }
/*     */   
/*     */   private static final class_2561 addOfferToCategory$lambda$14(Offer $offer, class_2168 $sourceStack, Ref.IntRef $success) {
/* 189 */     Intrinsics.checkNotNullParameter($offer, "$offer");
/* 189 */     Intrinsics.checkNotNullParameter($sourceStack, "$sourceStack");
/* 189 */     Intrinsics.checkNotNullParameter($success, "$success");
/* 189 */     Object[] arrayOfObject = new Object[2];
/* 189 */     arrayOfObject[0] = $offer.getDisplayName((class_1657)$sourceStack.method_44023());
/* 189 */     arrayOfObject[1] = Integer.valueOf($success.element);
/* 189 */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("cobblemerchant.add.item.success.multiple", arrayOfObject);
/*     */   }
/*     */   
/*     */   private static final class_2561 addOfferToCategory$lambda$15(Offer $offer, class_2168 $sourceStack, List $filteredTargets) {
/* 191 */     Intrinsics.checkNotNullParameter($offer, "$offer");
/* 191 */     Intrinsics.checkNotNullParameter($sourceStack, "$sourceStack");
/* 191 */     Intrinsics.checkNotNullParameter($filteredTargets, "$filteredTargets");
/* 191 */     Object[] arrayOfObject = new Object[2];
/* 191 */     arrayOfObject[0] = $offer.getDisplayName((class_1657)$sourceStack.method_44023());
/* 191 */     Intrinsics.checkNotNull($filteredTargets.iterator().next(), "null cannot be cast to non-null type net.minecraft.world.entity.Entity");
/* 191 */     Intrinsics.checkNotNull(((class_1297)$filteredTargets.iterator().next()).method_5476());
/* 191 */     arrayOfObject[1] = ((class_1297)$filteredTargets.iterator().next()).method_5476();
/* 191 */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("cobblemerchant.add.item.success.single", arrayOfObject);
/*     */   }
/*     */   
/*     */   private final int removeCategory(class_2168 sourceStack, Collection targets, String category) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: checkcast java/lang/Iterable
/*     */     //   4: astore #5
/*     */     //   6: iconst_0
/*     */     //   7: istore #6
/*     */     //   9: aload #5
/*     */     //   11: astore #7
/*     */     //   13: new java/util/ArrayList
/*     */     //   16: dup
/*     */     //   17: invokespecial <init> : ()V
/*     */     //   20: checkcast java/util/Collection
/*     */     //   23: astore #8
/*     */     //   25: iconst_0
/*     */     //   26: istore #9
/*     */     //   28: aload #7
/*     */     //   30: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   35: astore #10
/*     */     //   37: aload #10
/*     */     //   39: invokeinterface hasNext : ()Z
/*     */     //   44: ifeq -> 77
/*     */     //   47: aload #10
/*     */     //   49: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   54: astore #11
/*     */     //   56: aload #11
/*     */     //   58: instanceof fr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder
/*     */     //   61: ifeq -> 37
/*     */     //   64: aload #8
/*     */     //   66: aload #11
/*     */     //   68: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   73: pop
/*     */     //   74: goto -> 37
/*     */     //   77: aload #8
/*     */     //   79: checkcast java/util/List
/*     */     //   82: nop
/*     */     //   83: checkcast java/lang/Iterable
/*     */     //   86: astore #5
/*     */     //   88: nop
/*     */     //   89: iconst_0
/*     */     //   90: istore #6
/*     */     //   92: aload #5
/*     */     //   94: astore #7
/*     */     //   96: new java/util/ArrayList
/*     */     //   99: dup
/*     */     //   100: invokespecial <init> : ()V
/*     */     //   103: checkcast java/util/Collection
/*     */     //   106: astore #8
/*     */     //   108: iconst_0
/*     */     //   109: istore #9
/*     */     //   111: aload #7
/*     */     //   113: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   118: astore #10
/*     */     //   120: aload #10
/*     */     //   122: invokeinterface hasNext : ()Z
/*     */     //   127: ifeq -> 180
/*     */     //   130: aload #10
/*     */     //   132: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   137: astore #11
/*     */     //   139: aload #11
/*     */     //   141: checkcast fr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder
/*     */     //   144: astore #12
/*     */     //   146: iconst_0
/*     */     //   147: istore #13
/*     */     //   149: aload #12
/*     */     //   151: invokeinterface getShop : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;
/*     */     //   156: ifnull -> 163
/*     */     //   159: iconst_1
/*     */     //   160: goto -> 164
/*     */     //   163: iconst_0
/*     */     //   164: ifeq -> 120
/*     */     //   167: aload #8
/*     */     //   169: aload #11
/*     */     //   171: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   176: pop
/*     */     //   177: goto -> 120
/*     */     //   180: aload #8
/*     */     //   182: checkcast java/util/List
/*     */     //   185: nop
/*     */     //   186: astore #4
/*     */     //   188: new kotlin/jvm/internal/Ref$IntRef
/*     */     //   191: dup
/*     */     //   192: invokespecial <init> : ()V
/*     */     //   195: astore #5
/*     */     //   197: aload #4
/*     */     //   199: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   204: astore #6
/*     */     //   206: aload #6
/*     */     //   208: invokeinterface hasNext : ()Z
/*     */     //   213: ifeq -> 265
/*     */     //   216: aload #6
/*     */     //   218: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   223: checkcast fr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder
/*     */     //   226: astore #7
/*     */     //   228: aload #7
/*     */     //   230: invokeinterface getShop : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;
/*     */     //   235: dup
/*     */     //   236: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   239: aload_3
/*     */     //   240: invokevirtual del : (Ljava/lang/String;)Z
/*     */     //   243: ifeq -> 206
/*     */     //   246: aload #5
/*     */     //   248: getfield element : I
/*     */     //   251: istore #8
/*     */     //   253: aload #5
/*     */     //   255: iload #8
/*     */     //   257: iconst_1
/*     */     //   258: iadd
/*     */     //   259: putfield element : I
/*     */     //   262: goto -> 206
/*     */     //   265: aload #5
/*     */     //   267: getfield element : I
/*     */     //   270: iconst_1
/*     */     //   271: if_icmple -> 290
/*     */     //   274: aload_1
/*     */     //   275: aload_3
/*     */     //   276: aload #5
/*     */     //   278: <illegal opcode> get : (Ljava/lang/String;Lkotlin/jvm/internal/Ref$IntRef;)Ljava/util/function/Supplier;
/*     */     //   283: iconst_1
/*     */     //   284: invokevirtual method_9226 : (Ljava/util/function/Supplier;Z)V
/*     */     //   287: goto -> 303
/*     */     //   290: aload_1
/*     */     //   291: aload_3
/*     */     //   292: aload #4
/*     */     //   294: <illegal opcode> get : (Ljava/lang/String;Ljava/util/List;)Ljava/util/function/Supplier;
/*     */     //   299: iconst_1
/*     */     //   300: invokevirtual method_9226 : (Ljava/util/function/Supplier;Z)V
/*     */     //   303: aload #5
/*     */     //   305: getfield element : I
/*     */     //   308: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #198	-> 0
/*     */     //   #336	-> 9
/*     */     //   #345	-> 28
/*     */     //   #346	-> 77
/*     */     //   #336	-> 82
/*     */     //   #198	-> 88
/*     */     //   #347	-> 92
/*     */     //   #348	-> 111
/*     */     //   #198	-> 149
/*     */     //   #348	-> 164
/*     */     //   #349	-> 180
/*     */     //   #347	-> 185
/*     */     //   #198	-> 186
/*     */     //   #200	-> 188
/*     */     //   #202	-> 197
/*     */     //   #203	-> 228
/*     */     //   #206	-> 265
/*     */     //   #207	-> 274
/*     */     //   #209	-> 290
/*     */     //   #212	-> 303
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   56	18	11	element$iv$iv	Ljava/lang/Object;
/*     */     //   28	51	9	$i$f$filterIsInstanceTo	I
/*     */     //   25	54	7	$this$filterIsInstanceTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   25	54	8	destination$iv$iv	Ljava/util/Collection;
/*     */     //   9	74	6	$i$f$filterIsInstance	I
/*     */     //   6	77	5	$this$filterIsInstance$iv	Ljava/lang/Iterable;
/*     */     //   149	15	13	$i$a$-filter-CobbleMerchantCommand$removeCategory$filteredTargets$1	I
/*     */     //   146	18	12	it	Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;
/*     */     //   139	38	11	element$iv$iv	Ljava/lang/Object;
/*     */     //   111	71	9	$i$f$filterTo	I
/*     */     //   108	74	7	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   108	74	8	destination$iv$iv	Ljava/util/Collection;
/*     */     //   92	94	6	$i$f$filter	I
/*     */     //   89	97	5	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   228	34	7	cobbleMerchant	Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;
/*     */     //   188	121	4	filteredTargets	Ljava/util/List;
/*     */     //   197	112	5	success	Lkotlin/jvm/internal/Ref$IntRef;
/*     */     //   0	309	0	this	Lfr/harmex/cobbledollars/common/command/CobbleMerchantCommand;
/*     */     //   0	309	1	sourceStack	Lnet/minecraft/class_2168;
/*     */     //   0	309	2	targets	Ljava/util/Collection;
/*     */     //   0	309	3	category	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   private static final class_2561 removeCategory$lambda$17(String $category, Ref.IntRef $success) {
/* 207 */     Intrinsics.checkNotNullParameter($category, "$category");
/* 207 */     Intrinsics.checkNotNullParameter($success, "$success");
/* 207 */     Object[] arrayOfObject = new Object[2];
/* 207 */     Intrinsics.checkNotNullExpressionValue(class_2561.method_43470($category), "literal(...)");
/* 207 */     arrayOfObject[0] = TextKt.red(class_2561.method_43470($category));
/* 207 */     arrayOfObject[1] = Integer.valueOf($success.element);
/* 207 */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("cobblemerchant.remove.category.success.multiple", arrayOfObject);
/*     */   }
/*     */   
/*     */   private static final class_2561 removeCategory$lambda$18(String $category, List $filteredTargets) {
/* 209 */     Intrinsics.checkNotNullParameter($category, "$category");
/* 209 */     Intrinsics.checkNotNullParameter($filteredTargets, "$filteredTargets");
/* 209 */     Object[] arrayOfObject = new Object[2];
/* 209 */     Intrinsics.checkNotNullExpressionValue(class_2561.method_43470($category), "literal(...)");
/* 209 */     arrayOfObject[0] = TextKt.red(class_2561.method_43470($category));
/* 209 */     Intrinsics.checkNotNull($filteredTargets.iterator().next(), "null cannot be cast to non-null type net.minecraft.world.entity.Entity");
/* 209 */     Intrinsics.checkNotNull(((class_1297)$filteredTargets.iterator().next()).method_5476());
/* 209 */     arrayOfObject[1] = ((class_1297)$filteredTargets.iterator().next()).method_5476();
/* 209 */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("cobblemerchant.remove.category.success.single", arrayOfObject);
/*     */   }
/*     */   
/*     */   private final int removeOfferFromCategory(class_2168 sourceStack, Collection targets, String category, class_2290 itemInput, BigInteger price) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: checkcast java/lang/Iterable
/*     */     //   4: astore #7
/*     */     //   6: iconst_0
/*     */     //   7: istore #8
/*     */     //   9: aload #7
/*     */     //   11: astore #9
/*     */     //   13: new java/util/ArrayList
/*     */     //   16: dup
/*     */     //   17: invokespecial <init> : ()V
/*     */     //   20: checkcast java/util/Collection
/*     */     //   23: astore #10
/*     */     //   25: iconst_0
/*     */     //   26: istore #11
/*     */     //   28: aload #9
/*     */     //   30: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   35: astore #12
/*     */     //   37: aload #12
/*     */     //   39: invokeinterface hasNext : ()Z
/*     */     //   44: ifeq -> 77
/*     */     //   47: aload #12
/*     */     //   49: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   54: astore #13
/*     */     //   56: aload #13
/*     */     //   58: instanceof fr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder
/*     */     //   61: ifeq -> 37
/*     */     //   64: aload #10
/*     */     //   66: aload #13
/*     */     //   68: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   73: pop
/*     */     //   74: goto -> 37
/*     */     //   77: aload #10
/*     */     //   79: checkcast java/util/List
/*     */     //   82: nop
/*     */     //   83: checkcast java/lang/Iterable
/*     */     //   86: astore #7
/*     */     //   88: nop
/*     */     //   89: iconst_0
/*     */     //   90: istore #8
/*     */     //   92: aload #7
/*     */     //   94: astore #9
/*     */     //   96: new java/util/ArrayList
/*     */     //   99: dup
/*     */     //   100: invokespecial <init> : ()V
/*     */     //   103: checkcast java/util/Collection
/*     */     //   106: astore #10
/*     */     //   108: iconst_0
/*     */     //   109: istore #11
/*     */     //   111: aload #9
/*     */     //   113: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   118: astore #12
/*     */     //   120: aload #12
/*     */     //   122: invokeinterface hasNext : ()Z
/*     */     //   127: ifeq -> 180
/*     */     //   130: aload #12
/*     */     //   132: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   137: astore #13
/*     */     //   139: aload #13
/*     */     //   141: checkcast fr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder
/*     */     //   144: astore #14
/*     */     //   146: iconst_0
/*     */     //   147: istore #15
/*     */     //   149: aload #14
/*     */     //   151: invokeinterface getShop : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;
/*     */     //   156: ifnull -> 163
/*     */     //   159: iconst_1
/*     */     //   160: goto -> 164
/*     */     //   163: iconst_0
/*     */     //   164: ifeq -> 120
/*     */     //   167: aload #10
/*     */     //   169: aload #13
/*     */     //   171: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   176: pop
/*     */     //   177: goto -> 120
/*     */     //   180: aload #10
/*     */     //   182: checkcast java/util/List
/*     */     //   185: nop
/*     */     //   186: astore #6
/*     */     //   188: aload #4
/*     */     //   190: iconst_1
/*     */     //   191: iconst_0
/*     */     //   192: invokevirtual method_9781 : (IZ)Lnet/minecraft/class_1799;
/*     */     //   195: astore #7
/*     */     //   197: aload #5
/*     */     //   199: ifnull -> 224
/*     */     //   202: new fr/harmex/cobbledollars/common/world/item/trading/shop/Offer
/*     */     //   205: dup
/*     */     //   206: aload #7
/*     */     //   208: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   211: aload #7
/*     */     //   213: aload #5
/*     */     //   215: iconst_0
/*     */     //   216: iconst_4
/*     */     //   217: aconst_null
/*     */     //   218: invokespecial <init> : (Lnet/minecraft/class_1799;Ljava/math/BigInteger;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   221: goto -> 225
/*     */     //   224: aconst_null
/*     */     //   225: astore #8
/*     */     //   227: new kotlin/jvm/internal/Ref$IntRef
/*     */     //   230: dup
/*     */     //   231: invokespecial <init> : ()V
/*     */     //   234: astore #9
/*     */     //   236: aload #6
/*     */     //   238: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   243: astore #10
/*     */     //   245: aload #10
/*     */     //   247: invokeinterface hasNext : ()Z
/*     */     //   252: ifeq -> 331
/*     */     //   255: aload #10
/*     */     //   257: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   262: checkcast fr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder
/*     */     //   265: astore #11
/*     */     //   267: aload #11
/*     */     //   269: invokeinterface getShop : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;
/*     */     //   274: dup
/*     */     //   275: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   278: astore #12
/*     */     //   280: aload #12
/*     */     //   282: aload_3
/*     */     //   283: invokevirtual has : (Ljava/lang/String;)Z
/*     */     //   286: ifeq -> 245
/*     */     //   289: aload #12
/*     */     //   291: aload_3
/*     */     //   292: invokevirtual get : (Ljava/lang/String;)Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;
/*     */     //   295: dup
/*     */     //   296: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   299: aload #7
/*     */     //   301: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   304: aload #7
/*     */     //   306: aload #5
/*     */     //   308: invokevirtual del : (Lnet/minecraft/class_1799;Ljava/math/BigInteger;)Z
/*     */     //   311: pop
/*     */     //   312: aload #9
/*     */     //   314: getfield element : I
/*     */     //   317: istore #13
/*     */     //   319: aload #9
/*     */     //   321: iload #13
/*     */     //   323: iconst_1
/*     */     //   324: iadd
/*     */     //   325: putfield element : I
/*     */     //   328: goto -> 245
/*     */     //   331: aload #9
/*     */     //   333: getfield element : I
/*     */     //   336: iconst_1
/*     */     //   337: if_icmple -> 360
/*     */     //   340: aload_1
/*     */     //   341: aload #8
/*     */     //   343: aload_1
/*     */     //   344: aload #7
/*     */     //   346: aload #9
/*     */     //   348: <illegal opcode> get : (Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;Lnet/minecraft/class_2168;Lnet/minecraft/class_1799;Lkotlin/jvm/internal/Ref$IntRef;)Ljava/util/function/Supplier;
/*     */     //   353: iconst_1
/*     */     //   354: invokevirtual method_9226 : (Ljava/util/function/Supplier;Z)V
/*     */     //   357: goto -> 377
/*     */     //   360: aload_1
/*     */     //   361: aload #8
/*     */     //   363: aload_1
/*     */     //   364: aload #7
/*     */     //   366: aload #6
/*     */     //   368: <illegal opcode> get : (Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;Lnet/minecraft/class_2168;Lnet/minecraft/class_1799;Ljava/util/List;)Ljava/util/function/Supplier;
/*     */     //   373: iconst_1
/*     */     //   374: invokevirtual method_9226 : (Ljava/util/function/Supplier;Z)V
/*     */     //   377: aload #9
/*     */     //   379: getfield element : I
/*     */     //   382: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #216	-> 0
/*     */     //   #350	-> 9
/*     */     //   #359	-> 28
/*     */     //   #360	-> 77
/*     */     //   #350	-> 82
/*     */     //   #216	-> 88
/*     */     //   #361	-> 92
/*     */     //   #362	-> 111
/*     */     //   #216	-> 149
/*     */     //   #362	-> 164
/*     */     //   #363	-> 180
/*     */     //   #361	-> 185
/*     */     //   #216	-> 186
/*     */     //   #218	-> 188
/*     */     //   #219	-> 197
/*     */     //   #221	-> 227
/*     */     //   #223	-> 236
/*     */     //   #224	-> 267
/*     */     //   #225	-> 280
/*     */     //   #226	-> 289
/*     */     //   #227	-> 312
/*     */     //   #231	-> 331
/*     */     //   #232	-> 340
/*     */     //   #234	-> 360
/*     */     //   #237	-> 377
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   56	18	13	element$iv$iv	Ljava/lang/Object;
/*     */     //   28	51	11	$i$f$filterIsInstanceTo	I
/*     */     //   25	54	9	$this$filterIsInstanceTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   25	54	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   9	74	8	$i$f$filterIsInstance	I
/*     */     //   6	77	7	$this$filterIsInstance$iv	Ljava/lang/Iterable;
/*     */     //   149	15	15	$i$a$-filter-CobbleMerchantCommand$removeOfferFromCategory$filteredTargets$1	I
/*     */     //   146	18	14	it	Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;
/*     */     //   139	38	13	element$iv$iv	Ljava/lang/Object;
/*     */     //   111	71	11	$i$f$filterTo	I
/*     */     //   108	74	9	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   108	74	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   92	94	8	$i$f$filter	I
/*     */     //   89	97	7	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   280	48	12	shop	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;
/*     */     //   267	61	11	cobbleMerchant	Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;
/*     */     //   188	195	6	filteredTargets	Ljava/util/List;
/*     */     //   197	186	7	item	Lnet/minecraft/class_1799;
/*     */     //   227	156	8	offer	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;
/*     */     //   236	147	9	success	Lkotlin/jvm/internal/Ref$IntRef;
/*     */     //   0	383	0	this	Lfr/harmex/cobbledollars/common/command/CobbleMerchantCommand;
/*     */     //   0	383	1	sourceStack	Lnet/minecraft/class_2168;
/*     */     //   0	383	2	targets	Ljava/util/Collection;
/*     */     //   0	383	3	category	Ljava/lang/String;
/*     */     //   0	383	4	itemInput	Lnet/minecraft/class_2290;
/*     */     //   0	383	5	price	Ljava/math/BigInteger;
/*     */   }
/*     */   
/*     */   private static final class_2561 removeOfferFromCategory$lambda$20(Offer $offer, class_2168 $sourceStack, class_1799 $item, Ref.IntRef $success) {
/* 232 */     Intrinsics.checkNotNullParameter($sourceStack, "$sourceStack");
/* 232 */     Intrinsics.checkNotNullParameter($success, "$success");
/* 232 */     Object[] arrayOfObject = new Object[2];
/* 232 */     $offer.getDisplayName((class_1657)$sourceStack.method_44023());
/* 232 */     arrayOfObject[0] = ($offer != null && $offer.getDisplayName((class_1657)$sourceStack.method_44023()) != null) ? $offer.getDisplayName((class_1657)$sourceStack.method_44023()) : $item.method_7954();
/* 232 */     arrayOfObject[1] = Integer.valueOf($success.element);
/* 232 */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("cobblemerchant.remove.item.success.multiple", arrayOfObject);
/*     */   }
/*     */   
/*     */   private static final class_2561 removeOfferFromCategory$lambda$21(Offer $offer, class_2168 $sourceStack, class_1799 $item, List $filteredTargets) {
/* 234 */     Intrinsics.checkNotNullParameter($sourceStack, "$sourceStack");
/* 234 */     Intrinsics.checkNotNullParameter($filteredTargets, "$filteredTargets");
/* 234 */     Object[] arrayOfObject = new Object[2];
/* 234 */     $offer.getDisplayName((class_1657)$sourceStack.method_44023());
/* 234 */     arrayOfObject[0] = ($offer != null && $offer.getDisplayName((class_1657)$sourceStack.method_44023()) != null) ? $offer.getDisplayName((class_1657)$sourceStack.method_44023()) : $item.method_7954();
/* 234 */     Intrinsics.checkNotNull($filteredTargets.iterator().next(), "null cannot be cast to non-null type net.minecraft.world.entity.Entity");
/* 234 */     Intrinsics.checkNotNull(((class_1297)$filteredTargets.iterator().next()).method_5476());
/* 234 */     arrayOfObject[1] = ((class_1297)$filteredTargets.iterator().next()).method_5476();
/* 234 */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("cobblemerchant.remove.item.success.single", arrayOfObject);
/*     */   }
/*     */   
/*     */   private final int addItemInHandToCategory(class_2168 sourceStack, Collection targets, String category, BigInteger price) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual method_9207 : ()Lnet/minecraft/class_3222;
/*     */     //   4: astore #5
/*     */     //   6: aload #5
/*     */     //   8: invokevirtual method_6047 : ()Lnet/minecraft/class_1799;
/*     */     //   11: getstatic net/minecraft/class_1799.field_8037 : Lnet/minecraft/class_1799;
/*     */     //   14: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   17: ifeq -> 22
/*     */     //   20: iconst_0
/*     */     //   21: ireturn
/*     */     //   22: aload_2
/*     */     //   23: checkcast java/lang/Iterable
/*     */     //   26: astore #7
/*     */     //   28: iconst_0
/*     */     //   29: istore #8
/*     */     //   31: aload #7
/*     */     //   33: astore #9
/*     */     //   35: new java/util/ArrayList
/*     */     //   38: dup
/*     */     //   39: invokespecial <init> : ()V
/*     */     //   42: checkcast java/util/Collection
/*     */     //   45: astore #10
/*     */     //   47: iconst_0
/*     */     //   48: istore #11
/*     */     //   50: aload #9
/*     */     //   52: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   57: astore #12
/*     */     //   59: aload #12
/*     */     //   61: invokeinterface hasNext : ()Z
/*     */     //   66: ifeq -> 99
/*     */     //   69: aload #12
/*     */     //   71: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   76: astore #13
/*     */     //   78: aload #13
/*     */     //   80: instanceof fr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder
/*     */     //   83: ifeq -> 59
/*     */     //   86: aload #10
/*     */     //   88: aload #13
/*     */     //   90: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   95: pop
/*     */     //   96: goto -> 59
/*     */     //   99: aload #10
/*     */     //   101: checkcast java/util/List
/*     */     //   104: nop
/*     */     //   105: checkcast java/lang/Iterable
/*     */     //   108: astore #7
/*     */     //   110: nop
/*     */     //   111: iconst_0
/*     */     //   112: istore #8
/*     */     //   114: aload #7
/*     */     //   116: astore #9
/*     */     //   118: new java/util/ArrayList
/*     */     //   121: dup
/*     */     //   122: invokespecial <init> : ()V
/*     */     //   125: checkcast java/util/Collection
/*     */     //   128: astore #10
/*     */     //   130: iconst_0
/*     */     //   131: istore #11
/*     */     //   133: aload #9
/*     */     //   135: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   140: astore #12
/*     */     //   142: aload #12
/*     */     //   144: invokeinterface hasNext : ()Z
/*     */     //   149: ifeq -> 202
/*     */     //   152: aload #12
/*     */     //   154: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   159: astore #13
/*     */     //   161: aload #13
/*     */     //   163: checkcast fr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder
/*     */     //   166: astore #14
/*     */     //   168: iconst_0
/*     */     //   169: istore #15
/*     */     //   171: aload #14
/*     */     //   173: invokeinterface getShop : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;
/*     */     //   178: ifnull -> 185
/*     */     //   181: iconst_1
/*     */     //   182: goto -> 186
/*     */     //   185: iconst_0
/*     */     //   186: ifeq -> 142
/*     */     //   189: aload #10
/*     */     //   191: aload #13
/*     */     //   193: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   198: pop
/*     */     //   199: goto -> 142
/*     */     //   202: aload #10
/*     */     //   204: checkcast java/util/List
/*     */     //   207: nop
/*     */     //   208: astore #6
/*     */     //   210: aload #5
/*     */     //   212: invokevirtual method_6047 : ()Lnet/minecraft/class_1799;
/*     */     //   215: invokevirtual method_7972 : ()Lnet/minecraft/class_1799;
/*     */     //   218: astore #7
/*     */     //   220: aload #7
/*     */     //   222: iconst_1
/*     */     //   223: invokevirtual method_7939 : (I)V
/*     */     //   226: new fr/harmex/cobbledollars/common/world/item/trading/shop/Offer
/*     */     //   229: dup
/*     */     //   230: aload #7
/*     */     //   232: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   235: aload #7
/*     */     //   237: aload #4
/*     */     //   239: iconst_0
/*     */     //   240: iconst_4
/*     */     //   241: aconst_null
/*     */     //   242: invokespecial <init> : (Lnet/minecraft/class_1799;Ljava/math/BigInteger;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   245: astore #8
/*     */     //   247: new kotlin/jvm/internal/Ref$IntRef
/*     */     //   250: dup
/*     */     //   251: invokespecial <init> : ()V
/*     */     //   254: astore #9
/*     */     //   256: aload #6
/*     */     //   258: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   263: astore #10
/*     */     //   265: aload #10
/*     */     //   267: invokeinterface hasNext : ()Z
/*     */     //   272: ifeq -> 398
/*     */     //   275: aload #10
/*     */     //   277: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   282: checkcast fr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder
/*     */     //   285: astore #11
/*     */     //   287: aload #11
/*     */     //   289: invokeinterface getShop : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;
/*     */     //   294: dup
/*     */     //   295: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   298: astore #12
/*     */     //   300: aload #12
/*     */     //   302: aload_3
/*     */     //   303: invokevirtual has : (Ljava/lang/String;)Z
/*     */     //   306: ifeq -> 346
/*     */     //   309: aload #12
/*     */     //   311: aload_3
/*     */     //   312: invokevirtual get : (Ljava/lang/String;)Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;
/*     */     //   315: dup
/*     */     //   316: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   319: aload #8
/*     */     //   321: invokevirtual add : (Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;)Z
/*     */     //   324: ifeq -> 265
/*     */     //   327: aload #9
/*     */     //   329: getfield element : I
/*     */     //   332: istore #13
/*     */     //   334: aload #9
/*     */     //   336: iload #13
/*     */     //   338: iconst_1
/*     */     //   339: iadd
/*     */     //   340: putfield element : I
/*     */     //   343: goto -> 265
/*     */     //   346: aload #12
/*     */     //   348: new fr/harmex/cobbledollars/common/world/item/trading/shop/Category
/*     */     //   351: dup
/*     */     //   352: aload_3
/*     */     //   353: iconst_1
/*     */     //   354: anewarray fr/harmex/cobbledollars/common/world/item/trading/shop/Offer
/*     */     //   357: astore #13
/*     */     //   359: aload #13
/*     */     //   361: iconst_0
/*     */     //   362: aload #8
/*     */     //   364: aastore
/*     */     //   365: aload #13
/*     */     //   367: invokestatic arrayListOf : ([Ljava/lang/Object;)Ljava/util/ArrayList;
/*     */     //   370: invokespecial <init> : (Ljava/lang/String;Ljava/util/ArrayList;)V
/*     */     //   373: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   376: ifeq -> 265
/*     */     //   379: aload #9
/*     */     //   381: getfield element : I
/*     */     //   384: istore #13
/*     */     //   386: aload #9
/*     */     //   388: iload #13
/*     */     //   390: iconst_1
/*     */     //   391: iadd
/*     */     //   392: putfield element : I
/*     */     //   395: goto -> 265
/*     */     //   398: aload #9
/*     */     //   400: getfield element : I
/*     */     //   403: iconst_1
/*     */     //   404: if_icmple -> 425
/*     */     //   407: aload_1
/*     */     //   408: aload #8
/*     */     //   410: aload_1
/*     */     //   411: aload #9
/*     */     //   413: <illegal opcode> get : (Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;Lnet/minecraft/class_2168;Lkotlin/jvm/internal/Ref$IntRef;)Ljava/util/function/Supplier;
/*     */     //   418: iconst_1
/*     */     //   419: invokevirtual method_9226 : (Ljava/util/function/Supplier;Z)V
/*     */     //   422: goto -> 440
/*     */     //   425: aload_1
/*     */     //   426: aload #8
/*     */     //   428: aload_1
/*     */     //   429: aload #6
/*     */     //   431: <illegal opcode> get : (Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;Lnet/minecraft/class_2168;Ljava/util/List;)Ljava/util/function/Supplier;
/*     */     //   436: iconst_1
/*     */     //   437: invokevirtual method_9226 : (Ljava/util/function/Supplier;Z)V
/*     */     //   440: aload #9
/*     */     //   442: getfield element : I
/*     */     //   445: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #241	-> 0
/*     */     //   #242	-> 6
/*     */     //   #243	-> 22
/*     */     //   #364	-> 31
/*     */     //   #373	-> 50
/*     */     //   #374	-> 99
/*     */     //   #364	-> 104
/*     */     //   #243	-> 110
/*     */     //   #375	-> 114
/*     */     //   #376	-> 133
/*     */     //   #243	-> 171
/*     */     //   #376	-> 186
/*     */     //   #377	-> 202
/*     */     //   #375	-> 207
/*     */     //   #243	-> 208
/*     */     //   #245	-> 210
/*     */     //   #246	-> 220
/*     */     //   #247	-> 226
/*     */     //   #249	-> 247
/*     */     //   #251	-> 256
/*     */     //   #252	-> 287
/*     */     //   #253	-> 300
/*     */     //   #254	-> 309
/*     */     //   #256	-> 346
/*     */     //   #260	-> 398
/*     */     //   #261	-> 407
/*     */     //   #263	-> 425
/*     */     //   #266	-> 440
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   78	18	13	element$iv$iv	Ljava/lang/Object;
/*     */     //   50	51	11	$i$f$filterIsInstanceTo	I
/*     */     //   47	54	9	$this$filterIsInstanceTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   47	54	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   31	74	8	$i$f$filterIsInstance	I
/*     */     //   28	77	7	$this$filterIsInstance$iv	Ljava/lang/Iterable;
/*     */     //   171	15	15	$i$a$-filter-CobbleMerchantCommand$addItemInHandToCategory$filteredTargets$1	I
/*     */     //   168	18	14	it	Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;
/*     */     //   161	38	13	element$iv$iv	Ljava/lang/Object;
/*     */     //   133	71	11	$i$f$filterTo	I
/*     */     //   130	74	9	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   130	74	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   114	94	8	$i$f$filter	I
/*     */     //   111	97	7	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   300	95	12	shop	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;
/*     */     //   287	108	11	cobbleMerchant	Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;
/*     */     //   6	440	5	player	Lnet/minecraft/class_3222;
/*     */     //   210	236	6	filteredTargets	Ljava/util/List;
/*     */     //   220	226	7	item	Lnet/minecraft/class_1799;
/*     */     //   247	199	8	offer	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;
/*     */     //   256	190	9	success	Lkotlin/jvm/internal/Ref$IntRef;
/*     */     //   0	446	0	this	Lfr/harmex/cobbledollars/common/command/CobbleMerchantCommand;
/*     */     //   0	446	1	sourceStack	Lnet/minecraft/class_2168;
/*     */     //   0	446	2	targets	Ljava/util/Collection;
/*     */     //   0	446	3	category	Ljava/lang/String;
/*     */     //   0	446	4	price	Ljava/math/BigInteger;
/*     */   }
/*     */   
/*     */   private static final class_2561 addItemInHandToCategory$lambda$23(Offer $offer, class_2168 $sourceStack, Ref.IntRef $success) {
/* 261 */     Intrinsics.checkNotNullParameter($offer, "$offer");
/* 261 */     Intrinsics.checkNotNullParameter($sourceStack, "$sourceStack");
/* 261 */     Intrinsics.checkNotNullParameter($success, "$success");
/* 261 */     Object[] arrayOfObject = new Object[2];
/* 261 */     arrayOfObject[0] = $offer.getDisplayName((class_1657)$sourceStack.method_44023());
/* 261 */     arrayOfObject[1] = Integer.valueOf($success.element);
/* 261 */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("cobblemerchant.add.item.success.multiple", arrayOfObject);
/*     */   }
/*     */   
/*     */   private static final class_2561 addItemInHandToCategory$lambda$24(Offer $offer, class_2168 $sourceStack, List $filteredTargets) {
/* 263 */     Intrinsics.checkNotNullParameter($offer, "$offer");
/* 263 */     Intrinsics.checkNotNullParameter($sourceStack, "$sourceStack");
/* 263 */     Intrinsics.checkNotNullParameter($filteredTargets, "$filteredTargets");
/* 263 */     Object[] arrayOfObject = new Object[2];
/* 263 */     arrayOfObject[0] = $offer.getDisplayName((class_1657)$sourceStack.method_44023());
/* 263 */     Intrinsics.checkNotNull($filteredTargets.iterator().next(), "null cannot be cast to non-null type net.minecraft.world.entity.Entity");
/* 263 */     Intrinsics.checkNotNull(((class_1297)$filteredTargets.iterator().next()).method_5476());
/* 263 */     arrayOfObject[1] = ((class_1297)$filteredTargets.iterator().next()).method_5476();
/* 263 */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("cobblemerchant.add.item.success.single", arrayOfObject);
/*     */   }
/*     */   
/*     */   private final int removeItemInHandFromCategory(class_2168 sourceStack, Collection targets, String category, BigInteger price) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual method_9207 : ()Lnet/minecraft/class_3222;
/*     */     //   4: astore #5
/*     */     //   6: aload #5
/*     */     //   8: invokevirtual method_6047 : ()Lnet/minecraft/class_1799;
/*     */     //   11: getstatic net/minecraft/class_1799.field_8037 : Lnet/minecraft/class_1799;
/*     */     //   14: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   17: ifeq -> 22
/*     */     //   20: iconst_0
/*     */     //   21: ireturn
/*     */     //   22: aload_2
/*     */     //   23: checkcast java/lang/Iterable
/*     */     //   26: astore #7
/*     */     //   28: iconst_0
/*     */     //   29: istore #8
/*     */     //   31: aload #7
/*     */     //   33: astore #9
/*     */     //   35: new java/util/ArrayList
/*     */     //   38: dup
/*     */     //   39: invokespecial <init> : ()V
/*     */     //   42: checkcast java/util/Collection
/*     */     //   45: astore #10
/*     */     //   47: iconst_0
/*     */     //   48: istore #11
/*     */     //   50: aload #9
/*     */     //   52: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   57: astore #12
/*     */     //   59: aload #12
/*     */     //   61: invokeinterface hasNext : ()Z
/*     */     //   66: ifeq -> 99
/*     */     //   69: aload #12
/*     */     //   71: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   76: astore #13
/*     */     //   78: aload #13
/*     */     //   80: instanceof fr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder
/*     */     //   83: ifeq -> 59
/*     */     //   86: aload #10
/*     */     //   88: aload #13
/*     */     //   90: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   95: pop
/*     */     //   96: goto -> 59
/*     */     //   99: aload #10
/*     */     //   101: checkcast java/util/List
/*     */     //   104: nop
/*     */     //   105: checkcast java/lang/Iterable
/*     */     //   108: astore #7
/*     */     //   110: nop
/*     */     //   111: iconst_0
/*     */     //   112: istore #8
/*     */     //   114: aload #7
/*     */     //   116: astore #9
/*     */     //   118: new java/util/ArrayList
/*     */     //   121: dup
/*     */     //   122: invokespecial <init> : ()V
/*     */     //   125: checkcast java/util/Collection
/*     */     //   128: astore #10
/*     */     //   130: iconst_0
/*     */     //   131: istore #11
/*     */     //   133: aload #9
/*     */     //   135: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   140: astore #12
/*     */     //   142: aload #12
/*     */     //   144: invokeinterface hasNext : ()Z
/*     */     //   149: ifeq -> 202
/*     */     //   152: aload #12
/*     */     //   154: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   159: astore #13
/*     */     //   161: aload #13
/*     */     //   163: checkcast fr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder
/*     */     //   166: astore #14
/*     */     //   168: iconst_0
/*     */     //   169: istore #15
/*     */     //   171: aload #14
/*     */     //   173: invokeinterface getShop : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;
/*     */     //   178: ifnull -> 185
/*     */     //   181: iconst_1
/*     */     //   182: goto -> 186
/*     */     //   185: iconst_0
/*     */     //   186: ifeq -> 142
/*     */     //   189: aload #10
/*     */     //   191: aload #13
/*     */     //   193: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   198: pop
/*     */     //   199: goto -> 142
/*     */     //   202: aload #10
/*     */     //   204: checkcast java/util/List
/*     */     //   207: nop
/*     */     //   208: astore #6
/*     */     //   210: aload #5
/*     */     //   212: invokevirtual method_6047 : ()Lnet/minecraft/class_1799;
/*     */     //   215: invokevirtual method_7972 : ()Lnet/minecraft/class_1799;
/*     */     //   218: astore #7
/*     */     //   220: aload #7
/*     */     //   222: iconst_1
/*     */     //   223: invokevirtual method_7939 : (I)V
/*     */     //   226: aload #4
/*     */     //   228: ifnull -> 253
/*     */     //   231: new fr/harmex/cobbledollars/common/world/item/trading/shop/Offer
/*     */     //   234: dup
/*     */     //   235: aload #7
/*     */     //   237: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   240: aload #7
/*     */     //   242: aload #4
/*     */     //   244: iconst_0
/*     */     //   245: iconst_4
/*     */     //   246: aconst_null
/*     */     //   247: invokespecial <init> : (Lnet/minecraft/class_1799;Ljava/math/BigInteger;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   250: goto -> 254
/*     */     //   253: aconst_null
/*     */     //   254: astore #8
/*     */     //   256: new kotlin/jvm/internal/Ref$IntRef
/*     */     //   259: dup
/*     */     //   260: invokespecial <init> : ()V
/*     */     //   263: astore #9
/*     */     //   265: aload #6
/*     */     //   267: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   272: astore #10
/*     */     //   274: aload #10
/*     */     //   276: invokeinterface hasNext : ()Z
/*     */     //   281: ifeq -> 362
/*     */     //   284: aload #10
/*     */     //   286: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   291: checkcast fr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder
/*     */     //   294: astore #11
/*     */     //   296: aload #11
/*     */     //   298: invokeinterface getShop : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;
/*     */     //   303: dup
/*     */     //   304: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   307: astore #12
/*     */     //   309: aload #12
/*     */     //   311: aload_3
/*     */     //   312: invokevirtual has : (Ljava/lang/String;)Z
/*     */     //   315: ifeq -> 274
/*     */     //   318: aload #12
/*     */     //   320: aload_3
/*     */     //   321: invokevirtual get : (Ljava/lang/String;)Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;
/*     */     //   324: dup
/*     */     //   325: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   328: aload #7
/*     */     //   330: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   333: aload #7
/*     */     //   335: aload #4
/*     */     //   337: invokevirtual del : (Lnet/minecraft/class_1799;Ljava/math/BigInteger;)Z
/*     */     //   340: ifeq -> 274
/*     */     //   343: aload #9
/*     */     //   345: getfield element : I
/*     */     //   348: istore #13
/*     */     //   350: aload #9
/*     */     //   352: iload #13
/*     */     //   354: iconst_1
/*     */     //   355: iadd
/*     */     //   356: putfield element : I
/*     */     //   359: goto -> 274
/*     */     //   362: aload #9
/*     */     //   364: getfield element : I
/*     */     //   367: iconst_1
/*     */     //   368: if_icmple -> 391
/*     */     //   371: aload_1
/*     */     //   372: aload #8
/*     */     //   374: aload_1
/*     */     //   375: aload #7
/*     */     //   377: aload #9
/*     */     //   379: <illegal opcode> get : (Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;Lnet/minecraft/class_2168;Lnet/minecraft/class_1799;Lkotlin/jvm/internal/Ref$IntRef;)Ljava/util/function/Supplier;
/*     */     //   384: iconst_1
/*     */     //   385: invokevirtual method_9226 : (Ljava/util/function/Supplier;Z)V
/*     */     //   388: goto -> 408
/*     */     //   391: aload_1
/*     */     //   392: aload #8
/*     */     //   394: aload_1
/*     */     //   395: aload #7
/*     */     //   397: aload #6
/*     */     //   399: <illegal opcode> get : (Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;Lnet/minecraft/class_2168;Lnet/minecraft/class_1799;Ljava/util/List;)Ljava/util/function/Supplier;
/*     */     //   404: iconst_1
/*     */     //   405: invokevirtual method_9226 : (Ljava/util/function/Supplier;Z)V
/*     */     //   408: aload #9
/*     */     //   410: getfield element : I
/*     */     //   413: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #270	-> 0
/*     */     //   #271	-> 6
/*     */     //   #272	-> 22
/*     */     //   #378	-> 31
/*     */     //   #387	-> 50
/*     */     //   #388	-> 99
/*     */     //   #378	-> 104
/*     */     //   #272	-> 110
/*     */     //   #389	-> 114
/*     */     //   #390	-> 133
/*     */     //   #272	-> 171
/*     */     //   #390	-> 186
/*     */     //   #391	-> 202
/*     */     //   #389	-> 207
/*     */     //   #272	-> 208
/*     */     //   #274	-> 210
/*     */     //   #275	-> 220
/*     */     //   #276	-> 226
/*     */     //   #278	-> 256
/*     */     //   #280	-> 265
/*     */     //   #281	-> 296
/*     */     //   #282	-> 309
/*     */     //   #283	-> 318
/*     */     //   #287	-> 362
/*     */     //   #288	-> 371
/*     */     //   #290	-> 391
/*     */     //   #293	-> 408
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   78	18	13	element$iv$iv	Ljava/lang/Object;
/*     */     //   50	51	11	$i$f$filterIsInstanceTo	I
/*     */     //   47	54	9	$this$filterIsInstanceTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   47	54	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   31	74	8	$i$f$filterIsInstance	I
/*     */     //   28	77	7	$this$filterIsInstance$iv	Ljava/lang/Iterable;
/*     */     //   171	15	15	$i$a$-filter-CobbleMerchantCommand$removeItemInHandFromCategory$filteredTargets$1	I
/*     */     //   168	18	14	it	Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;
/*     */     //   161	38	13	element$iv$iv	Ljava/lang/Object;
/*     */     //   133	71	11	$i$f$filterTo	I
/*     */     //   130	74	9	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   130	74	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   114	94	8	$i$f$filter	I
/*     */     //   111	97	7	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   309	50	12	shop	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;
/*     */     //   296	63	11	cobbleMerchant	Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;
/*     */     //   6	408	5	player	Lnet/minecraft/class_3222;
/*     */     //   210	204	6	filteredTargets	Ljava/util/List;
/*     */     //   220	194	7	item	Lnet/minecraft/class_1799;
/*     */     //   256	158	8	offer	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;
/*     */     //   265	149	9	success	Lkotlin/jvm/internal/Ref$IntRef;
/*     */     //   0	414	0	this	Lfr/harmex/cobbledollars/common/command/CobbleMerchantCommand;
/*     */     //   0	414	1	sourceStack	Lnet/minecraft/class_2168;
/*     */     //   0	414	2	targets	Ljava/util/Collection;
/*     */     //   0	414	3	category	Ljava/lang/String;
/*     */     //   0	414	4	price	Ljava/math/BigInteger;
/*     */   }
/*     */   
/*     */   private static final class_2561 removeItemInHandFromCategory$lambda$26(Offer $offer, class_2168 $sourceStack, class_1799 $item, Ref.IntRef $success) {
/* 288 */     Intrinsics.checkNotNullParameter($sourceStack, "$sourceStack");
/* 288 */     Intrinsics.checkNotNullParameter($success, "$success");
/* 288 */     Object[] arrayOfObject = new Object[2];
/* 288 */     $offer.getDisplayName((class_1657)$sourceStack.method_44023());
/* 288 */     arrayOfObject[0] = ($offer != null && $offer.getDisplayName((class_1657)$sourceStack.method_44023()) != null) ? $offer.getDisplayName((class_1657)$sourceStack.method_44023()) : $item.method_7954();
/* 288 */     arrayOfObject[1] = Integer.valueOf($success.element);
/* 288 */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("cobblemerchant.remove.item.success.multiple", arrayOfObject);
/*     */   }
/*     */   
/*     */   private static final class_2561 removeItemInHandFromCategory$lambda$27(Offer $offer, class_2168 $sourceStack, class_1799 $item, List $filteredTargets) {
/* 290 */     Intrinsics.checkNotNullParameter($sourceStack, "$sourceStack");
/* 290 */     Intrinsics.checkNotNullParameter($filteredTargets, "$filteredTargets");
/* 290 */     Object[] arrayOfObject = new Object[2];
/* 290 */     $offer.getDisplayName((class_1657)$sourceStack.method_44023());
/* 290 */     arrayOfObject[0] = ($offer != null && $offer.getDisplayName((class_1657)$sourceStack.method_44023()) != null) ? $offer.getDisplayName((class_1657)$sourceStack.method_44023()) : $item.method_7954();
/* 290 */     Intrinsics.checkNotNull($filteredTargets.iterator().next(), "null cannot be cast to non-null type net.minecraft.world.entity.Entity");
/* 290 */     Intrinsics.checkNotNull(((class_1297)$filteredTargets.iterator().next()).method_5476());
/* 290 */     arrayOfObject[1] = ((class_1297)$filteredTargets.iterator().next()).method_5476();
/* 290 */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("cobblemerchant.remove.item.success.single", arrayOfObject);
/*     */   }
/*     */   
/*     */   private final int openShop(class_2168 sourceStack) {
/* 297 */     class_3222 player = sourceStack.method_9207();
/* 298 */     Intrinsics.checkNotNull(player);
/* 298 */     PlayerExtensionKt.openShop$default((class_1657)player, null, false, 3, null);
/* 299 */     return 1;
/*     */   }
/*     */   
/*     */   private final int openBank(class_2168 sourceStack) {
/* 303 */     class_3222 player = sourceStack.method_9207();
/* 304 */     Intrinsics.checkNotNull(player);
/* 304 */     PlayerExtensionKt.openBank$default((class_1657)player, null, 1, null);
/* 305 */     return 1;
/*     */   }
/*     */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\command\CobbleMerchantCommand.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */