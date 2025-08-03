/*     */ package fr.harmex.cobbledollars.common.command;
/*     */ 
/*     */ import com.cobblemon.mod.common.api.net.NetworkPacket;
/*     */ import com.cobblemon.mod.common.api.text.TextKt;
/*     */ import com.cobblemon.mod.common.util.PermissionUtilsKt;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.tree.CommandNode;
/*     */ import com.mojang.brigadier.tree.LiteralCommandNode;
/*     */ import fr.harmex.cobbledollars.common.CobbleDollars;
/*     */ import fr.harmex.cobbledollars.common.command.arguments.BigIntegerArgumentType;
/*     */ import fr.harmex.cobbledollars.common.command.permission.CobbleDollarsPermissions;
/*     */ import fr.harmex.cobbledollars.common.config.BankConfig;
/*     */ import fr.harmex.cobbledollars.common.config.CommonConfig;
/*     */ import fr.harmex.cobbledollars.common.config.ShopConfig;
/*     */ import fr.harmex.cobbledollars.common.network.CobbleDollarsNetwork;
/*     */ import fr.harmex.cobbledollars.common.network.packets.s2c.SyncShopConfigPacket;
/*     */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*     */ import fr.harmex.cobbledollars.common.utils.extensions.BigIntegerExtensionsKt;
/*     */ import java.math.BigInteger;
/*     */ import java.util.Collection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import net.minecraft.class_1657;
/*     */ import net.minecraft.class_2168;
/*     */ import net.minecraft.class_2170;
/*     */ import net.minecraft.class_2186;
/*     */ import net.minecraft.class_2561;
/*     */ import net.minecraft.class_3222;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\036\n\002\b\f\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\033\020\b\032\0020\0072\f\020\006\032\b\022\004\022\0020\0050\004¢\006\004\b\b\020\tJ'\020\020\032\0020\0172\006\020\n\032\0020\0052\006\020\f\032\0020\0132\006\020\016\032\0020\rH\002¢\006\004\b\020\020\021J\037\020\023\032\0020\0172\006\020\n\032\0020\0052\006\020\f\032\0020\022H\002¢\006\004\b\023\020\024J-\020\027\032\0020\0172\006\020\n\032\0020\0052\f\020\026\032\b\022\004\022\0020\0130\0252\006\020\016\032\0020\rH\002¢\006\004\b\027\020\030J-\020\031\032\0020\0172\006\020\n\032\0020\0052\f\020\026\032\b\022\004\022\0020\0130\0252\006\020\016\032\0020\rH\002¢\006\004\b\031\020\030J-\020\032\032\0020\0172\006\020\n\032\0020\0052\f\020\026\032\b\022\004\022\0020\0130\0252\006\020\016\032\0020\rH\002¢\006\004\b\032\020\030J\027\020\033\032\0020\0172\006\020\n\032\0020\005H\002¢\006\004\b\033\020\034J!\020\036\032\0020\0172\006\020\n\032\0020\0052\b\b\002\020\035\032\0020\017H\002¢\006\004\b\036\020\037J\027\020 \032\0020\0172\006\020\n\032\0020\005H\002¢\006\004\b \020\034¨\006!"}, d2 = {"Lfr/harmex/cobbledollars/common/command/CobbleDollarsCommand;", "", "<init>", "()V", "Lcom/mojang/brigadier/CommandDispatcher;", "Lnet/minecraft/class_2168;", "dispatcher", "", "register", "(Lcom/mojang/brigadier/CommandDispatcher;)V", "sourceStack", "Lnet/minecraft/class_3222;", "target", "Ljava/math/BigInteger;", "amount", "", "pay", "(Lnet/minecraft/class_2168;Lnet/minecraft/class_3222;Ljava/math/BigInteger;)I", "Lnet/minecraft/class_1657;", "query", "(Lnet/minecraft/class_2168;Lnet/minecraft/class_1657;)I", "", "targets", "give", "(Lnet/minecraft/class_2168;Ljava/util/Collection;Ljava/math/BigInteger;)I", "remove", "set", "reload", "(Lnet/minecraft/class_2168;)I", "page", "displayLeaderboard", "(Lnet/minecraft/class_2168;I)I", "updateLeaderboard", "common"})
/*     */ @SourceDebugExtension({"SMAP\nCobbleDollarsCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CobbleDollarsCommand.kt\nfr/harmex/cobbledollars/common/command/CobbleDollarsCommand\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,284:1\n1557#2:285\n1628#2,3:286\n1062#2:289\n1872#2,3:290\n*S KotlinDebug\n*F\n+ 1 CobbleDollarsCommand.kt\nfr/harmex/cobbledollars/common/command/CobbleDollarsCommand\n*L\n188#1:285\n188#1:286,3\n189#1:289\n216#1:290,3\n*E\n"})
/*     */ public final class CobbleDollarsCommand {
/*     */   @NotNull
/*     */   public static final CobbleDollarsCommand INSTANCE = new CobbleDollarsCommand();
/*     */   
/*     */   public final void register(@NotNull CommandDispatcher dispatcher) {
/*  29 */     Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
/*  30 */     Intrinsics.checkNotNullExpressionValue(class_2170.method_9247("cobbledollars"), "literal(...)");
/*  31 */     Intrinsics.checkNotNullExpressionValue(class_2170.method_9247("pay"), "literal(...)");
/*  44 */     Intrinsics.checkNotNullExpressionValue(class_2170.method_9247("query"), "literal(...)");
/*  54 */     Intrinsics.checkNotNullExpressionValue(class_2170.method_9247("give"), "literal(...)");
/*  66 */     Intrinsics.checkNotNullExpressionValue(class_2170.method_9247("remove"), "literal(...)");
/*  78 */     Intrinsics.checkNotNullExpressionValue(class_2170.method_9247("set"), "literal(...)");
/*  90 */     Intrinsics.checkNotNullExpressionValue(class_2170.method_9247("reload"), "literal(...)");
/*  97 */     Intrinsics.checkNotNullExpressionValue(class_2170.method_9247("leaderboard"), "literal(...)");
/* 103 */     Intrinsics.checkNotNullExpressionValue(class_2170.method_9247("update"), "literal(...)");
/* 103 */     LiteralCommandNode mainNode = dispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)PermissionUtilsKt.permission$default((ArgumentBuilder)class_2170.method_9247("cobbledollars"), CobbleDollarsPermissions.INSTANCE.getCOBBLE_DOLLARS(), false, 2, null)).then(((LiteralArgumentBuilder)PermissionUtilsKt.permission$default((ArgumentBuilder)class_2170.method_9247("pay"), CobbleDollarsPermissions.INSTANCE.getCOBBLE_DOLLARS_PAY(), false, 2, null)).then(class_2170.method_9244("target", (ArgumentType)class_2186.method_9305()).then(class_2170.method_9244("amount", (ArgumentType)BigIntegerArgumentType.Companion.bigInt(1)).executes(CobbleDollarsCommand::register$lambda$0))))).then(((LiteralArgumentBuilder)PermissionUtilsKt.permission$default((ArgumentBuilder)class_2170.method_9247("query"), CobbleDollarsPermissions.INSTANCE.getCOBBLE_DOLLARS_QUERY(), false, 2, null)).then(class_2170.method_9244("target", (ArgumentType)class_2186.method_9305()).executes(CobbleDollarsCommand::register$lambda$1)))).then(((LiteralArgumentBuilder)PermissionUtilsKt.permission$default((ArgumentBuilder)class_2170.method_9247("give"), CobbleDollarsPermissions.INSTANCE.getCOBBLE_DOLLARS_GIVE(), false, 2, null)).then(class_2170.method_9244("targets", (ArgumentType)class_2186.method_9308()).then(class_2170.method_9244("amount", (ArgumentType)BigIntegerArgumentType.Companion.bigInt(1)).executes(CobbleDollarsCommand::register$lambda$2))))).then(((LiteralArgumentBuilder)PermissionUtilsKt.permission$default((ArgumentBuilder)class_2170.method_9247("remove"), CobbleDollarsPermissions.INSTANCE.getCOBBLE_DOLLARS_REMOVE(), false, 2, null)).then(class_2170.method_9244("targets", (ArgumentType)class_2186.method_9308()).then(class_2170.method_9244("amount", (ArgumentType)BigIntegerArgumentType.Companion.bigInt(1)).executes(CobbleDollarsCommand::register$lambda$3))))).then(((LiteralArgumentBuilder)PermissionUtilsKt.permission$default((ArgumentBuilder)class_2170.method_9247("set"), CobbleDollarsPermissions.INSTANCE.getCOBBLE_DOLLARS_SET(), false, 2, null)).then(class_2170.method_9244("targets", (ArgumentType)class_2186.method_9308()).then(class_2170.method_9244("amount", (ArgumentType)BigIntegerArgumentType.Companion.bigInt(0)).executes(CobbleDollarsCommand::register$lambda$4))))).then(((LiteralArgumentBuilder)PermissionUtilsKt.permission$default((ArgumentBuilder)class_2170.method_9247("reload"), CobbleDollarsPermissions.INSTANCE.getCOBBLE_DOLLARS_RELOAD(), false, 2, null)).executes(CobbleDollarsCommand::register$lambda$5))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)PermissionUtilsKt.permission$default((ArgumentBuilder)class_2170.method_9247("leaderboard"), CobbleDollarsPermissions.INSTANCE.getCOBBLE_DOLLARS_LEADERBOARD(), false, 2, null)).executes(CobbleDollarsCommand::register$lambda$6)).then(((LiteralArgumentBuilder)PermissionUtilsKt.permission$default((ArgumentBuilder)class_2170.method_9247("update"), CobbleDollarsPermissions.INSTANCE.getCOBBLE_DOLLARS_LEADERBOARD_UPDATE(), false, 2, null))
/* 104 */             .executes(CobbleDollarsCommand::register$lambda$7))));
/* 112 */     Intrinsics.checkNotNullExpressionValue(class_2170.method_9247("cd"), "literal(...)");
/* 112 */     dispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)PermissionUtilsKt.permission$default((ArgumentBuilder)class_2170.method_9247("cd"), CobbleDollarsPermissions.INSTANCE.getCOBBLE_DOLLARS(), false, 2, null)).redirect((CommandNode)mainNode));
/*     */   }
/*     */   
/*     */   private static final int register$lambda$0(CommandContext context) {
/*     */     Intrinsics.checkNotNullExpressionValue(context.getSource(), "getSource(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(class_2186.method_9315(context, "target"), "getPlayer(...)");
/*     */     Intrinsics.checkNotNull(context);
/*     */     return INSTANCE.pay((class_2168)context.getSource(), class_2186.method_9315(context, "target"), BigIntegerArgumentType.Companion.getBigInteger(context, "amount"));
/*     */   }
/*     */   
/*     */   private static final int register$lambda$1(CommandContext context) {
/*     */     Intrinsics.checkNotNullExpressionValue(context.getSource(), "getSource(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(class_2186.method_9315(context, "target"), "getPlayer(...)");
/*     */     return INSTANCE.query((class_2168)context.getSource(), (class_1657)class_2186.method_9315(context, "target"));
/*     */   }
/*     */   
/*     */   private static final int register$lambda$2(CommandContext context) {
/*     */     Intrinsics.checkNotNullExpressionValue(context.getSource(), "getSource(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(class_2186.method_9312(context, "targets"), "getPlayers(...)");
/*     */     Intrinsics.checkNotNull(context);
/*     */     return INSTANCE.give((class_2168)context.getSource(), class_2186.method_9312(context, "targets"), BigIntegerArgumentType.Companion.getBigInteger(context, "amount"));
/*     */   }
/*     */   
/*     */   private static final int register$lambda$3(CommandContext context) {
/*     */     Intrinsics.checkNotNullExpressionValue(context.getSource(), "getSource(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(class_2186.method_9312(context, "targets"), "getPlayers(...)");
/*     */     Intrinsics.checkNotNull(context);
/*     */     return INSTANCE.remove((class_2168)context.getSource(), class_2186.method_9312(context, "targets"), BigIntegerArgumentType.Companion.getBigInteger(context, "amount"));
/*     */   }
/*     */   
/*     */   private static final int register$lambda$4(CommandContext context) {
/*     */     Intrinsics.checkNotNullExpressionValue(context.getSource(), "getSource(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(class_2186.method_9312(context, "targets"), "getPlayers(...)");
/*     */     Intrinsics.checkNotNull(context);
/*     */     return INSTANCE.set((class_2168)context.getSource(), class_2186.method_9312(context, "targets"), BigIntegerArgumentType.Companion.getBigInteger(context, "amount"));
/*     */   }
/*     */   
/*     */   private static final int register$lambda$5(CommandContext context) {
/*     */     Intrinsics.checkNotNullExpressionValue(context.getSource(), "getSource(...)");
/*     */     return INSTANCE.reload((class_2168)context.getSource());
/*     */   }
/*     */   
/*     */   private static final int register$lambda$6(CommandContext context) {
/*     */     Intrinsics.checkNotNullExpressionValue(context.getSource(), "getSource(...)");
/*     */     return displayLeaderboard$default(INSTANCE, (class_2168)context.getSource(), 0, 2, null);
/*     */   }
/*     */   
/*     */   private static final int register$lambda$7(CommandContext context) {
/*     */     Intrinsics.checkNotNullExpressionValue(context.getSource(), "getSource(...)");
/*     */     return INSTANCE.updateLeaderboard((class_2168)context.getSource());
/*     */   }
/*     */   
/*     */   private final int pay(class_2168 sourceStack, class_3222 target, BigInteger amount) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: aload_1
/*     */     //   2: invokevirtual method_9207 : ()Lnet/minecraft/class_3222;
/*     */     //   5: dup
/*     */     //   6: ldc_w 'getPlayerOrException(...)'
/*     */     //   9: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: checkcast net/minecraft/class_1657
/*     */     //   15: invokestatic getCobbleDollars : (Lnet/minecraft/class_1657;)Ljava/math/BigInteger;
/*     */     //   18: invokevirtual compareTo : (Ljava/math/BigInteger;)I
/*     */     //   21: ifle -> 43
/*     */     //   24: aload_1
/*     */     //   25: ldc_w 'pay.fail'
/*     */     //   28: iconst_0
/*     */     //   29: anewarray java/lang/Object
/*     */     //   32: invokestatic cobbleDollarsCommand : (Ljava/lang/String;[Ljava/lang/Object;)Lnet/minecraft/class_5250;
/*     */     //   35: checkcast net/minecraft/class_2561
/*     */     //   38: invokevirtual method_9213 : (Lnet/minecraft/class_2561;)V
/*     */     //   41: iconst_0
/*     */     //   42: ireturn
/*     */     //   43: aload_1
/*     */     //   44: invokevirtual method_9207 : ()Lnet/minecraft/class_3222;
/*     */     //   47: astore #4
/*     */     //   49: aload #4
/*     */     //   51: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   54: aload #4
/*     */     //   56: checkcast net/minecraft/class_1657
/*     */     //   59: aload #4
/*     */     //   61: checkcast net/minecraft/class_1657
/*     */     //   64: invokestatic getCobbleDollars : (Lnet/minecraft/class_1657;)Ljava/math/BigInteger;
/*     */     //   67: aload_3
/*     */     //   68: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
/*     */     //   71: dup
/*     */     //   72: ldc_w 'subtract(...)'
/*     */     //   75: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   78: invokestatic setCobbleDollars : (Lnet/minecraft/class_1657;Ljava/math/BigInteger;)V
/*     */     //   81: aload_2
/*     */     //   82: checkcast net/minecraft/class_1657
/*     */     //   85: aload_2
/*     */     //   86: checkcast net/minecraft/class_1657
/*     */     //   89: invokestatic getCobbleDollars : (Lnet/minecraft/class_1657;)Ljava/math/BigInteger;
/*     */     //   92: aload_3
/*     */     //   93: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
/*     */     //   96: dup
/*     */     //   97: ldc_w 'add(...)'
/*     */     //   100: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   103: invokestatic setCobbleDollars : (Lnet/minecraft/class_1657;Ljava/math/BigInteger;)V
/*     */     //   106: aload_2
/*     */     //   107: ldc_w 'pay.receive'
/*     */     //   110: iconst_2
/*     */     //   111: anewarray java/lang/Object
/*     */     //   114: astore #4
/*     */     //   116: aload #4
/*     */     //   118: iconst_0
/*     */     //   119: aload_1
/*     */     //   120: invokevirtual method_44023 : ()Lnet/minecraft/class_3222;
/*     */     //   123: dup
/*     */     //   124: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   127: invokevirtual method_5476 : ()Lnet/minecraft/class_2561;
/*     */     //   130: dup
/*     */     //   131: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   134: aastore
/*     */     //   135: aload #4
/*     */     //   137: iconst_1
/*     */     //   138: aload_3
/*     */     //   139: iconst_0
/*     */     //   140: iconst_1
/*     */     //   141: aconst_null
/*     */     //   142: invokestatic format$default : (Ljava/math/BigInteger;ZILjava/lang/Object;)Lnet/minecraft/class_5250;
/*     */     //   145: invokestatic green : (Lnet/minecraft/class_5250;)Lnet/minecraft/class_5250;
/*     */     //   148: aastore
/*     */     //   149: aload #4
/*     */     //   151: invokestatic cobbleDollarsCommand : (Ljava/lang/String;[Ljava/lang/Object;)Lnet/minecraft/class_5250;
/*     */     //   154: checkcast net/minecraft/class_2561
/*     */     //   157: invokevirtual method_43496 : (Lnet/minecraft/class_2561;)V
/*     */     //   160: aload_1
/*     */     //   161: aload_3
/*     */     //   162: aload_2
/*     */     //   163: <illegal opcode> get : (Ljava/math/BigInteger;Lnet/minecraft/class_3222;)Ljava/util/function/Supplier;
/*     */     //   168: iconst_1
/*     */     //   169: invokevirtual method_9226 : (Ljava/util/function/Supplier;Z)V
/*     */     //   172: aload_3
/*     */     //   173: invokevirtual intValue : ()I
/*     */     //   176: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #116	-> 0
/*     */     //   #117	-> 24
/*     */     //   #118	-> 41
/*     */     //   #121	-> 43
/*     */     //   #121	-> 78
/*     */     //   #122	-> 81
/*     */     //   #122	-> 103
/*     */     //   #123	-> 106
/*     */     //   #124	-> 160
/*     */     //   #125	-> 172
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	177	0	this	Lfr/harmex/cobbledollars/common/command/CobbleDollarsCommand;
/*     */     //   0	177	1	sourceStack	Lnet/minecraft/class_2168;
/*     */     //   0	177	2	target	Lnet/minecraft/class_3222;
/*     */     //   0	177	3	amount	Ljava/math/BigInteger;
/*     */   }
/*     */   
/*     */   private static final class_2561 pay$lambda$8(BigInteger $amount, class_3222 $target) {
/* 124 */     Intrinsics.checkNotNullParameter($amount, "$amount");
/* 124 */     Intrinsics.checkNotNullParameter($target, "$target");
/* 124 */     Object[] arrayOfObject = new Object[2];
/* 124 */     arrayOfObject[0] = TextKt.red(BigIntegerExtensionsKt.format$default($amount, false, 1, null));
/* 124 */     Intrinsics.checkNotNull($target.method_5476());
/* 124 */     arrayOfObject[1] = $target.method_5476();
/* 124 */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("pay.success", arrayOfObject);
/*     */   }
/*     */   
/*     */   private final int query(class_2168 sourceStack, class_1657 target) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: invokestatic getCobbleDollars : (Lnet/minecraft/class_1657;)Ljava/math/BigInteger;
/*     */     //   4: astore_3
/*     */     //   5: aload_1
/*     */     //   6: aload_2
/*     */     //   7: aload_3
/*     */     //   8: <illegal opcode> get : (Lnet/minecraft/class_1657;Ljava/math/BigInteger;)Ljava/util/function/Supplier;
/*     */     //   13: iconst_0
/*     */     //   14: invokevirtual method_9226 : (Ljava/util/function/Supplier;Z)V
/*     */     //   17: aload_3
/*     */     //   18: invokevirtual intValue : ()I
/*     */     //   21: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #129	-> 0
/*     */     //   #130	-> 5
/*     */     //   #131	-> 17
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   5	17	3	cobbleDollars	Ljava/math/BigInteger;
/*     */     //   0	22	0	this	Lfr/harmex/cobbledollars/common/command/CobbleDollarsCommand;
/*     */     //   0	22	1	sourceStack	Lnet/minecraft/class_2168;
/*     */     //   0	22	2	target	Lnet/minecraft/class_1657;
/*     */   }
/*     */   
/*     */   private static final class_2561 query$lambda$9(class_1657 $target, BigInteger $cobbleDollars) {
/* 130 */     Intrinsics.checkNotNullParameter($target, "$target");
/* 130 */     Intrinsics.checkNotNullParameter($cobbleDollars, "$cobbleDollars");
/* 130 */     Object[] arrayOfObject = new Object[2];
/* 130 */     Intrinsics.checkNotNull($target.method_5476());
/* 130 */     arrayOfObject[0] = $target.method_5476();
/* 130 */     arrayOfObject[1] = TextKt.green(BigIntegerExtensionsKt.format$default($cobbleDollars, false, 1, null));
/* 130 */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("query.success", arrayOfObject);
/*     */   }
/*     */   
/*     */   private final int give(class_2168 sourceStack, Collection targets, BigInteger amount) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   6: astore #4
/*     */     //   8: aload #4
/*     */     //   10: invokeinterface hasNext : ()Z
/*     */     //   15: ifeq -> 60
/*     */     //   18: aload #4
/*     */     //   20: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   25: checkcast net/minecraft/class_3222
/*     */     //   28: astore #5
/*     */     //   30: aload #5
/*     */     //   32: checkcast net/minecraft/class_1657
/*     */     //   35: aload #5
/*     */     //   37: checkcast net/minecraft/class_1657
/*     */     //   40: invokestatic getCobbleDollars : (Lnet/minecraft/class_1657;)Ljava/math/BigInteger;
/*     */     //   43: aload_3
/*     */     //   44: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
/*     */     //   47: dup
/*     */     //   48: ldc_w 'add(...)'
/*     */     //   51: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   54: invokestatic setCobbleDollars : (Lnet/minecraft/class_1657;Ljava/math/BigInteger;)V
/*     */     //   57: goto -> 8
/*     */     //   60: aload_2
/*     */     //   61: invokeinterface size : ()I
/*     */     //   66: iconst_1
/*     */     //   67: if_icmpne -> 85
/*     */     //   70: aload_1
/*     */     //   71: aload_3
/*     */     //   72: aload_2
/*     */     //   73: <illegal opcode> get : (Ljava/math/BigInteger;Ljava/util/Collection;)Ljava/util/function/Supplier;
/*     */     //   78: iconst_1
/*     */     //   79: invokevirtual method_9226 : (Ljava/util/function/Supplier;Z)V
/*     */     //   82: goto -> 97
/*     */     //   85: aload_1
/*     */     //   86: aload_3
/*     */     //   87: aload_2
/*     */     //   88: <illegal opcode> get : (Ljava/math/BigInteger;Ljava/util/Collection;)Ljava/util/function/Supplier;
/*     */     //   93: iconst_1
/*     */     //   94: invokevirtual method_9226 : (Ljava/util/function/Supplier;Z)V
/*     */     //   97: aload_2
/*     */     //   98: invokeinterface size : ()I
/*     */     //   103: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #135	-> 0
/*     */     //   #135	-> 54
/*     */     //   #137	-> 60
/*     */     //   #138	-> 70
/*     */     //   #140	-> 85
/*     */     //   #143	-> 97
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   30	27	5	player	Lnet/minecraft/class_3222;
/*     */     //   0	104	0	this	Lfr/harmex/cobbledollars/common/command/CobbleDollarsCommand;
/*     */     //   0	104	1	sourceStack	Lnet/minecraft/class_2168;
/*     */     //   0	104	2	targets	Ljava/util/Collection;
/*     */     //   0	104	3	amount	Ljava/math/BigInteger;
/*     */   }
/*     */   
/*     */   private static final class_2561 give$lambda$10(BigInteger $amount, Collection<class_3222> $targets) {
/* 138 */     Intrinsics.checkNotNullParameter($amount, "$amount");
/* 138 */     Intrinsics.checkNotNullParameter($targets, "$targets");
/* 138 */     Object[] arrayOfObject = new Object[2];
/* 138 */     arrayOfObject[0] = TextKt.green(BigIntegerExtensionsKt.format$default($amount, false, 1, null));
/* 138 */     Intrinsics.checkNotNull(((class_3222)$targets.iterator().next()).method_5476());
/* 138 */     arrayOfObject[1] = ((class_3222)$targets.iterator().next()).method_5476();
/* 138 */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("give.success.single", arrayOfObject);
/*     */   }
/*     */   
/*     */   private static final class_2561 give$lambda$11(BigInteger $amount, Collection $targets) {
/* 140 */     Intrinsics.checkNotNullParameter($amount, "$amount");
/* 140 */     Intrinsics.checkNotNullParameter($targets, "$targets");
/* 140 */     Object[] arrayOfObject = new Object[2];
/* 140 */     arrayOfObject[0] = TextKt.green(BigIntegerExtensionsKt.format$default($amount, false, 1, null));
/* 140 */     arrayOfObject[1] = Integer.valueOf($targets.size());
/* 140 */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("give.success.multiple", arrayOfObject);
/*     */   }
/*     */   
/*     */   private final int remove(class_2168 sourceStack, Collection targets, BigInteger amount) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   6: astore #4
/*     */     //   8: aload #4
/*     */     //   10: invokeinterface hasNext : ()Z
/*     */     //   15: ifeq -> 80
/*     */     //   18: aload #4
/*     */     //   20: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   25: checkcast net/minecraft/class_3222
/*     */     //   28: astore #5
/*     */     //   30: aload #5
/*     */     //   32: checkcast net/minecraft/class_1657
/*     */     //   35: aload #5
/*     */     //   37: checkcast net/minecraft/class_1657
/*     */     //   40: invokestatic getCobbleDollars : (Lnet/minecraft/class_1657;)Ljava/math/BigInteger;
/*     */     //   43: aload_3
/*     */     //   44: checkcast java/lang/Comparable
/*     */     //   47: aload #5
/*     */     //   49: checkcast net/minecraft/class_1657
/*     */     //   52: invokestatic getCobbleDollars : (Lnet/minecraft/class_1657;)Ljava/math/BigInteger;
/*     */     //   55: checkcast java/lang/Comparable
/*     */     //   58: invokestatic coerceAtMost : (Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;
/*     */     //   61: checkcast java/math/BigInteger
/*     */     //   64: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
/*     */     //   67: dup
/*     */     //   68: ldc_w 'subtract(...)'
/*     */     //   71: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   74: invokestatic setCobbleDollars : (Lnet/minecraft/class_1657;Ljava/math/BigInteger;)V
/*     */     //   77: goto -> 8
/*     */     //   80: aload_2
/*     */     //   81: invokeinterface size : ()I
/*     */     //   86: iconst_1
/*     */     //   87: if_icmpne -> 105
/*     */     //   90: aload_1
/*     */     //   91: aload_3
/*     */     //   92: aload_2
/*     */     //   93: <illegal opcode> get : (Ljava/math/BigInteger;Ljava/util/Collection;)Ljava/util/function/Supplier;
/*     */     //   98: iconst_1
/*     */     //   99: invokevirtual method_9226 : (Ljava/util/function/Supplier;Z)V
/*     */     //   102: goto -> 117
/*     */     //   105: aload_1
/*     */     //   106: aload_3
/*     */     //   107: aload_2
/*     */     //   108: <illegal opcode> get : (Ljava/math/BigInteger;Ljava/util/Collection;)Ljava/util/function/Supplier;
/*     */     //   113: iconst_1
/*     */     //   114: invokevirtual method_9226 : (Ljava/util/function/Supplier;Z)V
/*     */     //   117: aload_2
/*     */     //   118: invokeinterface size : ()I
/*     */     //   123: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #147	-> 0
/*     */     //   #147	-> 74
/*     */     //   #149	-> 80
/*     */     //   #150	-> 90
/*     */     //   #152	-> 105
/*     */     //   #155	-> 117
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   30	47	5	player	Lnet/minecraft/class_3222;
/*     */     //   0	124	0	this	Lfr/harmex/cobbledollars/common/command/CobbleDollarsCommand;
/*     */     //   0	124	1	sourceStack	Lnet/minecraft/class_2168;
/*     */     //   0	124	2	targets	Ljava/util/Collection;
/*     */     //   0	124	3	amount	Ljava/math/BigInteger;
/*     */   }
/*     */   
/*     */   private static final class_2561 remove$lambda$12(BigInteger $amount, Collection<class_3222> $targets) {
/* 150 */     Intrinsics.checkNotNullParameter($amount, "$amount");
/* 150 */     Intrinsics.checkNotNullParameter($targets, "$targets");
/* 150 */     Object[] arrayOfObject = new Object[2];
/* 150 */     arrayOfObject[0] = TextKt.red(BigIntegerExtensionsKt.format$default($amount, false, 1, null));
/* 150 */     Intrinsics.checkNotNull(((class_3222)$targets.iterator().next()).method_5476());
/* 150 */     arrayOfObject[1] = ((class_3222)$targets.iterator().next()).method_5476();
/* 150 */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("remove.success.single", arrayOfObject);
/*     */   }
/*     */   
/*     */   private static final class_2561 remove$lambda$13(BigInteger $amount, Collection $targets) {
/* 152 */     Intrinsics.checkNotNullParameter($amount, "$amount");
/* 152 */     Intrinsics.checkNotNullParameter($targets, "$targets");
/* 152 */     Object[] arrayOfObject = new Object[2];
/* 152 */     arrayOfObject[0] = TextKt.red(BigIntegerExtensionsKt.format$default($amount, false, 1, null));
/* 152 */     arrayOfObject[1] = Integer.valueOf($targets.size());
/* 152 */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("remove.success.multiple", arrayOfObject);
/*     */   }
/*     */   
/*     */   private final int set(class_2168 sourceStack, Collection targets, BigInteger amount) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   6: astore #4
/*     */     //   8: aload #4
/*     */     //   10: invokeinterface hasNext : ()Z
/*     */     //   15: ifeq -> 42
/*     */     //   18: aload #4
/*     */     //   20: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   25: checkcast net/minecraft/class_3222
/*     */     //   28: astore #5
/*     */     //   30: aload #5
/*     */     //   32: checkcast net/minecraft/class_1657
/*     */     //   35: aload_3
/*     */     //   36: invokestatic setCobbleDollars : (Lnet/minecraft/class_1657;Ljava/math/BigInteger;)V
/*     */     //   39: goto -> 8
/*     */     //   42: aload_2
/*     */     //   43: invokeinterface size : ()I
/*     */     //   48: iconst_1
/*     */     //   49: if_icmpne -> 67
/*     */     //   52: aload_1
/*     */     //   53: aload_3
/*     */     //   54: aload_2
/*     */     //   55: <illegal opcode> get : (Ljava/math/BigInteger;Ljava/util/Collection;)Ljava/util/function/Supplier;
/*     */     //   60: iconst_1
/*     */     //   61: invokevirtual method_9226 : (Ljava/util/function/Supplier;Z)V
/*     */     //   64: goto -> 79
/*     */     //   67: aload_1
/*     */     //   68: aload_3
/*     */     //   69: aload_2
/*     */     //   70: <illegal opcode> get : (Ljava/math/BigInteger;Ljava/util/Collection;)Ljava/util/function/Supplier;
/*     */     //   75: iconst_1
/*     */     //   76: invokevirtual method_9226 : (Ljava/util/function/Supplier;Z)V
/*     */     //   79: aload_2
/*     */     //   80: invokeinterface size : ()I
/*     */     //   85: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #159	-> 0
/*     */     //   #161	-> 42
/*     */     //   #162	-> 52
/*     */     //   #164	-> 67
/*     */     //   #167	-> 79
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   30	9	5	player	Lnet/minecraft/class_3222;
/*     */     //   0	86	0	this	Lfr/harmex/cobbledollars/common/command/CobbleDollarsCommand;
/*     */     //   0	86	1	sourceStack	Lnet/minecraft/class_2168;
/*     */     //   0	86	2	targets	Ljava/util/Collection;
/*     */     //   0	86	3	amount	Ljava/math/BigInteger;
/*     */   }
/*     */   
/*     */   private static final class_2561 set$lambda$14(BigInteger $amount, Collection<class_3222> $targets) {
/* 162 */     Intrinsics.checkNotNullParameter($amount, "$amount");
/* 162 */     Intrinsics.checkNotNullParameter($targets, "$targets");
/* 162 */     Object[] arrayOfObject = new Object[2];
/* 162 */     arrayOfObject[0] = TextKt.green(BigIntegerExtensionsKt.format$default($amount, false, 1, null));
/* 162 */     Intrinsics.checkNotNull(((class_3222)$targets.iterator().next()).method_5476());
/* 162 */     arrayOfObject[1] = ((class_3222)$targets.iterator().next()).method_5476();
/* 162 */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("set.success.single", arrayOfObject);
/*     */   }
/*     */   
/*     */   private static final class_2561 set$lambda$15(BigInteger $amount, Collection $targets) {
/* 164 */     Intrinsics.checkNotNullParameter($amount, "$amount");
/* 164 */     Intrinsics.checkNotNullParameter($targets, "$targets");
/* 164 */     Object[] arrayOfObject = new Object[2];
/* 164 */     arrayOfObject[0] = TextKt.green(BigIntegerExtensionsKt.format$default($amount, false, 1, null));
/* 164 */     arrayOfObject[1] = Integer.valueOf($targets.size());
/* 164 */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("set.success.multiple", arrayOfObject);
/*     */   }
/*     */   
/*     */   private final int reload(class_2168 sourceStack) {
/* 171 */     CommonConfig.Companion.load();
/* 172 */     ShopConfig.Companion.load();
/* 173 */     BankConfig.Companion.load();
/* 174 */     CobbleDollars.INSTANCE.getSaveExecutor().close();
/* 175 */     Intrinsics.checkNotNullExpressionValue(sourceStack.method_9211(), "getServer(...)");
/* 175 */     CobbleDollars.INSTANCE.saveSchedule(sourceStack.method_9211());
/* 177 */     CobbleDollarsNetwork.INSTANCE.sendToAllPlayers((NetworkPacket)new SyncShopConfigPacket(CobbleDollars.INSTANCE.getShopConfig().getDefaultShop(), CobbleDollars.INSTANCE.getBankConfig().getBank()));
/* 179 */     sourceStack.method_9226(CobbleDollarsCommand::reload$lambda$16, true);
/* 181 */     return 1;
/*     */   }
/*     */   
/*     */   private static final class_2561 reload$lambda$16() {
/*     */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("reload", new Object[0]);
/*     */   }
/*     */   
/*     */   private final int displayLeaderboard(class_2168 sourceStack, int page) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokestatic method_43473 : ()Lnet/minecraft/class_5250;
/*     */     //   4: checkcast net/minecraft/class_2561
/*     */     //   7: invokevirtual method_45068 : (Lnet/minecraft/class_2561;)V
/*     */     //   10: getstatic fr/harmex/cobbledollars/common/CobbleDollars.INSTANCE : Lfr/harmex/cobbledollars/common/CobbleDollars;
/*     */     //   13: invokevirtual getCobbleDollarsAccounts : ()Ljava/util/List;
/*     */     //   16: checkcast java/lang/Iterable
/*     */     //   19: astore #4
/*     */     //   21: nop
/*     */     //   22: iconst_0
/*     */     //   23: istore #5
/*     */     //   25: aload #4
/*     */     //   27: astore #6
/*     */     //   29: new java/util/ArrayList
/*     */     //   32: dup
/*     */     //   33: aload #4
/*     */     //   35: bipush #10
/*     */     //   37: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   40: invokespecial <init> : (I)V
/*     */     //   43: checkcast java/util/Collection
/*     */     //   46: astore #7
/*     */     //   48: iconst_0
/*     */     //   49: istore #8
/*     */     //   51: aload #6
/*     */     //   53: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   58: astore #9
/*     */     //   60: aload #9
/*     */     //   62: invokeinterface hasNext : ()Z
/*     */     //   67: ifeq -> 130
/*     */     //   70: aload #9
/*     */     //   72: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   77: astore #10
/*     */     //   79: aload #7
/*     */     //   81: aload #10
/*     */     //   83: checkcast fr/harmex/cobbledollars/common/world/cobbledollars/CobbleDollarsAccount
/*     */     //   86: astore #11
/*     */     //   88: astore #27
/*     */     //   90: iconst_0
/*     */     //   91: istore #12
/*     */     //   93: aload #11
/*     */     //   95: invokevirtual component1 : ()Ljava/lang/String;
/*     */     //   98: astore #13
/*     */     //   100: aload #11
/*     */     //   102: invokevirtual component2 : ()Ljava/math/BigInteger;
/*     */     //   105: astore #14
/*     */     //   107: new kotlin/Pair
/*     */     //   110: dup
/*     */     //   111: aload #13
/*     */     //   113: aload #14
/*     */     //   115: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   118: aload #27
/*     */     //   120: swap
/*     */     //   121: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   126: pop
/*     */     //   127: goto -> 60
/*     */     //   130: aload #7
/*     */     //   132: checkcast java/util/List
/*     */     //   135: nop
/*     */     //   136: checkcast java/lang/Iterable
/*     */     //   139: astore #4
/*     */     //   141: nop
/*     */     //   142: iconst_0
/*     */     //   143: istore #5
/*     */     //   145: aload #4
/*     */     //   147: new fr/harmex/cobbledollars/common/command/CobbleDollarsCommand$displayLeaderboard$$inlined$sortedByDescending$1
/*     */     //   150: dup
/*     */     //   151: invokespecial <init> : ()V
/*     */     //   154: checkcast java/util/Comparator
/*     */     //   157: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
/*     */     //   160: astore_3
/*     */     //   161: aload_3
/*     */     //   162: invokeinterface size : ()I
/*     */     //   167: bipush #10
/*     */     //   169: idiv
/*     */     //   170: iconst_1
/*     */     //   171: iadd
/*     */     //   172: istore #4
/*     */     //   174: invokestatic now : ()Ljava/time/LocalDateTime;
/*     */     //   177: checkcast java/time/temporal/Temporal
/*     */     //   180: getstatic fr/harmex/cobbledollars/common/CobbleDollars.INSTANCE : Lfr/harmex/cobbledollars/common/CobbleDollars;
/*     */     //   183: invokevirtual getNextSaveDateTime : ()Ljava/time/LocalDateTime;
/*     */     //   186: checkcast java/time/temporal/Temporal
/*     */     //   189: invokestatic between : (Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;
/*     */     //   192: astore #5
/*     */     //   194: ldc_w 'CobbleDollars Leaderboard'
/*     */     //   197: invokestatic method_43470 : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   200: dup
/*     */     //   201: ldc 'literal(...)'
/*     */     //   203: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   206: invokestatic green : (Lnet/minecraft/class_5250;)Lnet/minecraft/class_5250;
/*     */     //   209: astore #6
/*     */     //   211: iload #4
/*     */     //   213: iconst_1
/*     */     //   214: if_icmple -> 269
/*     */     //   217: aload #6
/*     */     //   219: ldc_w ' '
/*     */     //   222: invokevirtual method_27693 : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   225: ldc_w '('
/*     */     //   228: invokestatic green : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   231: checkcast net/minecraft/class_2561
/*     */     //   234: invokevirtual method_10852 : (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
/*     */     //   237: iload_2
/*     */     //   238: iconst_1
/*     */     //   239: iadd
/*     */     //   240: invokestatic valueOf : (I)Ljava/lang/String;
/*     */     //   243: invokestatic darkGreen : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   246: checkcast net/minecraft/class_2561
/*     */     //   249: invokevirtual method_10852 : (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
/*     */     //   252: iload #4
/*     */     //   254: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   259: invokestatic green : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   262: checkcast net/minecraft/class_2561
/*     */     //   265: invokevirtual method_10852 : (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
/*     */     //   268: pop
/*     */     //   269: aload #5
/*     */     //   271: invokevirtual getSeconds : ()J
/*     */     //   274: lconst_0
/*     */     //   275: lcmp
/*     */     //   276: iflt -> 307
/*     */     //   279: aload #6
/*     */     //   281: ldc_w ' '
/*     */     //   284: invokevirtual method_27693 : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   287: aload #5
/*     */     //   289: invokevirtual getSeconds : ()J
/*     */     //   292: <illegal opcode> makeConcatWithConstants : (J)Ljava/lang/String;
/*     */     //   297: invokestatic darkGray : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   300: checkcast net/minecraft/class_2561
/*     */     //   303: invokevirtual method_10852 : (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
/*     */     //   306: pop
/*     */     //   307: aload #6
/*     */     //   309: ldc_w ':'
/*     */     //   312: invokestatic green : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   315: checkcast net/minecraft/class_2561
/*     */     //   318: invokevirtual method_10852 : (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
/*     */     //   321: pop
/*     */     //   322: aload_1
/*     */     //   323: aload #6
/*     */     //   325: checkcast net/minecraft/class_2561
/*     */     //   328: invokevirtual method_45068 : (Lnet/minecraft/class_2561;)V
/*     */     //   331: iload_2
/*     */     //   332: bipush #10
/*     */     //   334: imul
/*     */     //   335: istore #7
/*     */     //   337: iload #7
/*     */     //   339: bipush #10
/*     */     //   341: iadd
/*     */     //   342: aload_3
/*     */     //   343: invokeinterface size : ()I
/*     */     //   348: invokestatic min : (II)I
/*     */     //   351: istore #8
/*     */     //   353: aload_3
/*     */     //   354: iload #7
/*     */     //   356: iload #8
/*     */     //   358: invokeinterface subList : (II)Ljava/util/List;
/*     */     //   363: checkcast java/lang/Iterable
/*     */     //   366: astore #9
/*     */     //   368: iconst_0
/*     */     //   369: istore #10
/*     */     //   371: iconst_0
/*     */     //   372: istore #11
/*     */     //   374: aload #9
/*     */     //   376: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   381: astore #12
/*     */     //   383: aload #12
/*     */     //   385: invokeinterface hasNext : ()Z
/*     */     //   390: ifeq -> 696
/*     */     //   393: aload #12
/*     */     //   395: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   400: astore #13
/*     */     //   402: iload #11
/*     */     //   404: iinc #11, 1
/*     */     //   407: istore #14
/*     */     //   409: iload #14
/*     */     //   411: ifge -> 417
/*     */     //   414: invokestatic throwIndexOverflow : ()V
/*     */     //   417: iload #14
/*     */     //   419: aload #13
/*     */     //   421: checkcast kotlin/Pair
/*     */     //   424: astore #15
/*     */     //   426: istore #16
/*     */     //   428: iconst_0
/*     */     //   429: istore #17
/*     */     //   431: aload #15
/*     */     //   433: invokevirtual component1 : ()Ljava/lang/Object;
/*     */     //   436: checkcast java/lang/String
/*     */     //   439: astore #18
/*     */     //   441: aload #15
/*     */     //   443: invokevirtual component2 : ()Ljava/lang/Object;
/*     */     //   446: checkcast java/math/BigInteger
/*     */     //   449: astore #19
/*     */     //   451: iload #7
/*     */     //   453: iload #16
/*     */     //   455: iadd
/*     */     //   456: iconst_1
/*     */     //   457: iadd
/*     */     //   458: istore #20
/*     */     //   460: iload #20
/*     */     //   462: iconst_2
/*     */     //   463: irem
/*     */     //   464: iconst_1
/*     */     //   465: if_icmpne -> 472
/*     */     //   468: iconst_1
/*     */     //   469: goto -> 473
/*     */     //   472: iconst_0
/*     */     //   473: istore #21
/*     */     //   475: aload #18
/*     */     //   477: aload_1
/*     */     //   478: invokevirtual method_44023 : ()Lnet/minecraft/class_3222;
/*     */     //   481: dup
/*     */     //   482: ifnull -> 500
/*     */     //   485: invokevirtual method_5477 : ()Lnet/minecraft/class_2561;
/*     */     //   488: dup
/*     */     //   489: ifnull -> 500
/*     */     //   492: invokeinterface getString : ()Ljava/lang/String;
/*     */     //   497: goto -> 502
/*     */     //   500: pop
/*     */     //   501: aconst_null
/*     */     //   502: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   505: istore #22
/*     */     //   507: iload #22
/*     */     //   509: ifeq -> 534
/*     */     //   512: iload #20
/*     */     //   514: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   519: invokestatic method_43470 : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   522: dup
/*     */     //   523: ldc 'literal(...)'
/*     */     //   525: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   528: invokestatic gold : (Lnet/minecraft/class_5250;)Lnet/minecraft/class_5250;
/*     */     //   531: goto -> 571
/*     */     //   534: iload #21
/*     */     //   536: ifeq -> 552
/*     */     //   539: iload #20
/*     */     //   541: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   546: invokestatic method_43470 : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   549: goto -> 571
/*     */     //   552: iload #20
/*     */     //   554: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   559: invokestatic method_43470 : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   562: dup
/*     */     //   563: ldc 'literal(...)'
/*     */     //   565: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   568: invokestatic gray : (Lnet/minecraft/class_5250;)Lnet/minecraft/class_5250;
/*     */     //   571: astore #23
/*     */     //   573: iload #22
/*     */     //   575: ifeq -> 595
/*     */     //   578: aload #18
/*     */     //   580: invokestatic method_43470 : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   583: dup
/*     */     //   584: ldc 'literal(...)'
/*     */     //   586: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   589: invokestatic gold : (Lnet/minecraft/class_5250;)Lnet/minecraft/class_5250;
/*     */     //   592: goto -> 622
/*     */     //   595: iload #21
/*     */     //   597: ifeq -> 608
/*     */     //   600: aload #18
/*     */     //   602: invokestatic method_43470 : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   605: goto -> 622
/*     */     //   608: aload #18
/*     */     //   610: invokestatic method_43470 : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   613: dup
/*     */     //   614: ldc 'literal(...)'
/*     */     //   616: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   619: invokestatic gray : (Lnet/minecraft/class_5250;)Lnet/minecraft/class_5250;
/*     */     //   622: astore #24
/*     */     //   624: iload #21
/*     */     //   626: ifeq -> 643
/*     */     //   629: aload #19
/*     */     //   631: iconst_0
/*     */     //   632: iconst_1
/*     */     //   633: aconst_null
/*     */     //   634: invokestatic format$default : (Ljava/math/BigInteger;ZILjava/lang/Object;)Lnet/minecraft/class_5250;
/*     */     //   637: invokestatic green : (Lnet/minecraft/class_5250;)Lnet/minecraft/class_5250;
/*     */     //   640: goto -> 654
/*     */     //   643: aload #19
/*     */     //   645: iconst_0
/*     */     //   646: iconst_1
/*     */     //   647: aconst_null
/*     */     //   648: invokestatic format$default : (Ljava/math/BigInteger;ZILjava/lang/Object;)Lnet/minecraft/class_5250;
/*     */     //   651: invokestatic darkGreen : (Lnet/minecraft/class_5250;)Lnet/minecraft/class_5250;
/*     */     //   654: astore #25
/*     */     //   656: aload #23
/*     */     //   658: aload #24
/*     */     //   660: checkcast net/minecraft/class_2561
/*     */     //   663: invokevirtual method_10852 : (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
/*     */     //   666: ldc_w ' '
/*     */     //   669: invokevirtual method_27693 : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   672: aload #25
/*     */     //   674: checkcast net/minecraft/class_2561
/*     */     //   677: invokevirtual method_10852 : (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
/*     */     //   680: astore #26
/*     */     //   682: aload_1
/*     */     //   683: aload #26
/*     */     //   685: checkcast net/minecraft/class_2561
/*     */     //   688: invokevirtual method_45068 : (Lnet/minecraft/class_2561;)V
/*     */     //   691: nop
/*     */     //   692: nop
/*     */     //   693: goto -> 383
/*     */     //   696: nop
/*     */     //   697: iload_2
/*     */     //   698: ifle -> 705
/*     */     //   701: iconst_1
/*     */     //   702: goto -> 706
/*     */     //   705: iconst_0
/*     */     //   706: istore #9
/*     */     //   708: iload_2
/*     */     //   709: iconst_1
/*     */     //   710: iadd
/*     */     //   711: bipush #10
/*     */     //   713: imul
/*     */     //   714: aload_3
/*     */     //   715: invokeinterface size : ()I
/*     */     //   720: if_icmpge -> 727
/*     */     //   723: iconst_1
/*     */     //   724: goto -> 728
/*     */     //   727: iconst_0
/*     */     //   728: istore #10
/*     */     //   730: invokestatic method_43473 : ()Lnet/minecraft/class_5250;
/*     */     //   733: astore #11
/*     */     //   735: iload #9
/*     */     //   737: ifeq -> 783
/*     */     //   740: aload #11
/*     */     //   742: ldc_w '<<-'
/*     */     //   745: invokestatic method_43470 : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   748: dup
/*     */     //   749: ldc 'literal(...)'
/*     */     //   751: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   754: iload_2
/*     */     //   755: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   760: invokestatic onHover : (Lnet/minecraft/class_5250;Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   763: iconst_0
/*     */     //   764: aload_1
/*     */     //   765: iload_2
/*     */     //   766: <illegal opcode> invoke : (Lnet/minecraft/class_2168;I)Lkotlin/jvm/functions/Function1;
/*     */     //   771: iconst_1
/*     */     //   772: aconst_null
/*     */     //   773: invokestatic onClick$default : (Lnet/minecraft/class_5250;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lnet/minecraft/class_5250;
/*     */     //   776: checkcast net/minecraft/class_2561
/*     */     //   779: invokevirtual method_10852 : (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
/*     */     //   782: pop
/*     */     //   783: iload #9
/*     */     //   785: ifeq -> 808
/*     */     //   788: iload #10
/*     */     //   790: ifeq -> 808
/*     */     //   793: aload #11
/*     */     //   795: ldc_w ' | '
/*     */     //   798: invokestatic method_43470 : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   801: checkcast net/minecraft/class_2561
/*     */     //   804: invokevirtual method_10852 : (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
/*     */     //   807: pop
/*     */     //   808: iload #10
/*     */     //   810: ifeq -> 858
/*     */     //   813: aload #11
/*     */     //   815: ldc_w '->>'
/*     */     //   818: invokestatic method_43470 : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   821: dup
/*     */     //   822: ldc 'literal(...)'
/*     */     //   824: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   827: iload_2
/*     */     //   828: iconst_2
/*     */     //   829: iadd
/*     */     //   830: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   835: invokestatic onHover : (Lnet/minecraft/class_5250;Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   838: iconst_0
/*     */     //   839: aload_1
/*     */     //   840: iload_2
/*     */     //   841: <illegal opcode> invoke : (Lnet/minecraft/class_2168;I)Lkotlin/jvm/functions/Function1;
/*     */     //   846: iconst_1
/*     */     //   847: aconst_null
/*     */     //   848: invokestatic onClick$default : (Lnet/minecraft/class_5250;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lnet/minecraft/class_5250;
/*     */     //   851: checkcast net/minecraft/class_2561
/*     */     //   854: invokevirtual method_10852 : (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
/*     */     //   857: pop
/*     */     //   858: aload_1
/*     */     //   859: aload #11
/*     */     //   861: checkcast net/minecraft/class_2561
/*     */     //   864: invokevirtual method_45068 : (Lnet/minecraft/class_2561;)V
/*     */     //   867: iconst_1
/*     */     //   868: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #185	-> 0
/*     */     //   #187	-> 10
/*     */     //   #188	-> 21
/*     */     //   #285	-> 25
/*     */     //   #286	-> 51
/*     */     //   #287	-> 79
/*     */     //   #188	-> 93
/*     */     //   #287	-> 121
/*     */     //   #288	-> 130
/*     */     //   #285	-> 135
/*     */     //   #189	-> 141
/*     */     //   #289	-> 145
/*     */     //   #289	-> 157
/*     */     //   #189	-> 160
/*     */     //   #187	-> 160
/*     */     //   #191	-> 161
/*     */     //   #193	-> 174
/*     */     //   #195	-> 194
/*     */     //   #197	-> 211
/*     */     //   #198	-> 217
/*     */     //   #199	-> 225
/*     */     //   #200	-> 237
/*     */     //   #201	-> 252
/*     */     //   #204	-> 269
/*     */     //   #205	-> 279
/*     */     //   #206	-> 287
/*     */     //   #209	-> 307
/*     */     //   #211	-> 322
/*     */     //   #213	-> 331
/*     */     //   #214	-> 337
/*     */     //   #214	-> 351
/*     */     //   #216	-> 353
/*     */     //   #290	-> 371
/*     */     //   #291	-> 374
/*     */     //   #291	-> 419
/*     */     //   #216	-> 431
/*     */     //   #217	-> 451
/*     */     //   #218	-> 460
/*     */     //   #219	-> 475
/*     */     //   #221	-> 507
/*     */     //   #222	-> 512
/*     */     //   #223	-> 534
/*     */     //   #224	-> 539
/*     */     //   #226	-> 552
/*     */     //   #221	-> 571
/*     */     //   #228	-> 573
/*     */     //   #229	-> 578
/*     */     //   #230	-> 595
/*     */     //   #231	-> 600
/*     */     //   #233	-> 608
/*     */     //   #228	-> 622
/*     */     //   #235	-> 624
/*     */     //   #236	-> 629
/*     */     //   #238	-> 643
/*     */     //   #235	-> 654
/*     */     //   #240	-> 656
/*     */     //   #241	-> 658
/*     */     //   #242	-> 666
/*     */     //   #243	-> 672
/*     */     //   #240	-> 680
/*     */     //   #245	-> 682
/*     */     //   #246	-> 691
/*     */     //   #291	-> 692
/*     */     //   #292	-> 696
/*     */     //   #248	-> 697
/*     */     //   #249	-> 708
/*     */     //   #251	-> 730
/*     */     //   #253	-> 735
/*     */     //   #254	-> 740
/*     */     //   #255	-> 742
/*     */     //   #256	-> 754
/*     */     //   #257	-> 763
/*     */     //   #254	-> 779
/*     */     //   #260	-> 783
/*     */     //   #261	-> 793
/*     */     //   #263	-> 808
/*     */     //   #264	-> 813
/*     */     //   #265	-> 815
/*     */     //   #266	-> 827
/*     */     //   #267	-> 838
/*     */     //   #264	-> 854
/*     */     //   #271	-> 858
/*     */     //   #273	-> 867
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	25	12	$i$a$-map-CobbleDollarsCommand$displayLeaderboard$leaderboard$1	I
/*     */     //   100	18	13	playerName	Ljava/lang/String;
/*     */     //   107	11	14	balance	Ljava/math/BigInteger;
/*     */     //   79	48	10	item$iv$iv	Ljava/lang/Object;
/*     */     //   51	81	8	$i$f$mapTo	I
/*     */     //   48	84	6	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   48	84	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   25	111	5	$i$f$map	I
/*     */     //   22	114	4	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   145	15	5	$i$f$sortedByDescending	I
/*     */     //   142	18	4	$this$sortedByDescending$iv	Ljava/lang/Iterable;
/*     */     //   460	231	20	rank	I
/*     */     //   475	216	21	isOdd	Z
/*     */     //   507	184	22	isCurrentPlayer	Z
/*     */     //   573	118	23	rankComponent	Lnet/minecraft/class_5250;
/*     */     //   624	67	24	nameComponent	Lnet/minecraft/class_5250;
/*     */     //   656	35	25	balanceComponent	Lnet/minecraft/class_5250;
/*     */     //   682	9	26	message	Lnet/minecraft/class_5250;
/*     */     //   431	261	17	$i$a$-forEachIndexed-CobbleDollarsCommand$displayLeaderboard$1	I
/*     */     //   441	251	18	playerName	Ljava/lang/String;
/*     */     //   451	241	19	balance	Ljava/math/BigInteger;
/*     */     //   428	264	16	index	I
/*     */     //   402	291	13	item$iv	Ljava/lang/Object;
/*     */     //   371	326	10	$i$f$forEachIndexed	I
/*     */     //   374	323	11	index$iv	I
/*     */     //   368	329	9	$this$forEachIndexed$iv	Ljava/lang/Iterable;
/*     */     //   161	708	3	leaderboard	Ljava/util/List;
/*     */     //   174	695	4	pageAmount	I
/*     */     //   194	675	5	nextSaveDuration	Ljava/time/Duration;
/*     */     //   211	658	6	headerComponent	Lnet/minecraft/class_5250;
/*     */     //   337	532	7	startIndex	I
/*     */     //   353	516	8	endIndex	I
/*     */     //   708	161	9	hasPreviousPage	Z
/*     */     //   730	139	10	hasNextPage	Z
/*     */     //   735	134	11	pageSelector	Lnet/minecraft/class_5250;
/*     */     //   0	869	0	this	Lfr/harmex/cobbledollars/common/command/CobbleDollarsCommand;
/*     */     //   0	869	1	sourceStack	Lnet/minecraft/class_2168;
/*     */     //   0	869	2	page	I
/*     */   }
/*     */   
/*     */   private static final Unit displayLeaderboard$lambda$20(class_2168 $sourceStack, int $page, class_3222 it) {
/* 257 */     Intrinsics.checkNotNullParameter($sourceStack, "$sourceStack");
/* 257 */     Intrinsics.checkNotNullParameter(it, "it");
/* 257 */     INSTANCE.displayLeaderboard($sourceStack, $page - 1);
/* 257 */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit displayLeaderboard$lambda$21(class_2168 $sourceStack, int $page, class_3222 it) {
/* 267 */     Intrinsics.checkNotNullParameter($sourceStack, "$sourceStack");
/* 267 */     Intrinsics.checkNotNullParameter(it, "it");
/* 267 */     INSTANCE.displayLeaderboard($sourceStack, $page + 1);
/* 267 */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private final int updateLeaderboard(class_2168 sourceStack) {
/* 277 */     CobbleDollars.INSTANCE.getSaveExecutor().close();
/* 278 */     Intrinsics.checkNotNullExpressionValue(sourceStack.method_9211(), "getServer(...)");
/* 278 */     CobbleDollars.INSTANCE.saveSchedule(sourceStack.method_9211());
/* 280 */     sourceStack.method_9226(CobbleDollarsCommand::updateLeaderboard$lambda$22, true);
/* 282 */     return 1;
/*     */   }
/*     */   
/*     */   private static final class_2561 updateLeaderboard$lambda$22() {
/*     */     return (class_2561)MiscUtilsKt.cobbleDollarsCommand("leaderboard.update", new Object[0]);
/*     */   }
/*     */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\command\CobbleDollarsCommand.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */