/*     */ package fr.harmex.cobbledollars.common;
/*     */ 
/*     */ import com.cobblemon.mod.common.api.events.CobblemonEvents;
/*     */ import com.cobblemon.mod.common.api.events.battles.BattleVictoryEvent;
/*     */ import com.cobblemon.mod.common.api.net.NetworkPacket;
/*     */ import com.cobblemon.mod.common.api.reactive.Observable;
/*     */ import com.cobblemon.mod.common.platform.events.PlatformEvents;
/*     */ import com.cobblemon.mod.common.platform.events.ServerEvent;
/*     */ import com.cobblemon.mod.common.platform.events.ServerPlayerEvent;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import fr.harmex.cobbledollars.common.command.arguments.BigIntegerArgumentType;
/*     */ import fr.harmex.cobbledollars.common.config.BankConfig;
/*     */ import fr.harmex.cobbledollars.common.config.CommonConfig;
/*     */ import fr.harmex.cobbledollars.common.config.ShopConfig;
/*     */ import fr.harmex.cobbledollars.common.event.CobbleDollarsEventsKt;
/*     */ import fr.harmex.cobbledollars.common.implementation.GTSImplementation;
/*     */ import fr.harmex.cobbledollars.common.network.CobbleDollarsNetwork;
/*     */ import fr.harmex.cobbledollars.common.network.packets.s2c.SyncShopConfigPacket;
/*     */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*     */ import fr.harmex.cobbledollars.common.utils.extensions.PlayerExtensionKt;
/*     */ import fr.harmex.cobbledollars.common.world.cobbledollars.CobbleDollarsAccount;
/*     */ import java.math.BigInteger;
/*     */ import java.time.LocalDateTime;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.Executors;
/*     */ import java.util.concurrent.ScheduledExecutorService;
/*     */ import java.util.concurrent.ThreadFactory;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import net.minecraft.class_2314;
/*     */ import net.minecraft.class_2319;
/*     */ import net.minecraft.class_3222;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.pokesplash.gts.api.economy.GtsEconomy;
/*     */ import org.pokesplash.gts.api.economy.GtsEconomyProvider;
/*     */ import org.pokesplash.gts.enumeration.Priority;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000f\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\006\n\002\020 \n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\025\020\007\032\0020\0062\006\020\005\032\0020\004¢\006\004\b\007\020\bJ\r\020\t\032\0020\006¢\006\004\b\t\020\003J\025\020\f\032\0020\0062\006\020\013\032\0020\n¢\006\004\b\f\020\rJ\017\020\016\032\0020\006H\002¢\006\004\b\016\020\003R\024\020\020\032\0020\0178\006XT¢\006\006\n\004\b\020\020\021R\027\020\023\032\0020\0228\006¢\006\f\n\004\b\023\020\024\032\004\b\025\020\026R\"\020\005\032\0020\0048\006@\006X.¢\006\022\n\004\b\005\020\027\032\004\b\030\020\031\"\004\b\032\020\bR\"\020\034\032\0020\0338\006@\006X.¢\006\022\n\004\b\034\020\035\032\004\b\036\020\037\"\004\b \020!R\"\020#\032\0020\"8\006@\006X.¢\006\022\n\004\b#\020$\032\004\b%\020&\"\004\b'\020(R\"\020*\032\0020)8\006@\006X.¢\006\022\n\004\b*\020+\032\004\b,\020-\"\004\b.\020/R\"\0201\032\002008\006@\006X.¢\006\022\n\004\b1\0202\032\004\b3\0204\"\004\b5\0206R\"\0208\032\002078\006@\006X.¢\006\022\n\004\b8\0209\032\004\b:\020;\"\004\b<\020=R(\020@\032\b\022\004\022\0020?0>8\006@\006X\016¢\006\022\n\004\b@\020A\032\004\bB\020C\"\004\bD\020E¨\006F"}, d2 = {"Lfr/harmex/cobbledollars/common/CobbleDollars;", "", "<init>", "()V", "Lfr/harmex/cobbledollars/common/CobbleDollarsImplementation;", "implementation", "", "preInit", "(Lfr/harmex/cobbledollars/common/CobbleDollarsImplementation;)V", "init", "Lnet/minecraft/server/MinecraftServer;", "server", "saveSchedule", "(Lnet/minecraft/server/MinecraftServer;)V", "registerArgumentTypes", "", "MOD_ID", "Ljava/lang/String;", "Lorg/apache/logging/log4j/Logger;", "LOGGER", "Lorg/apache/logging/log4j/Logger;", "getLOGGER", "()Lorg/apache/logging/log4j/Logger;", "Lfr/harmex/cobbledollars/common/CobbleDollarsImplementation;", "getImplementation", "()Lfr/harmex/cobbledollars/common/CobbleDollarsImplementation;", "setImplementation", "Lfr/harmex/cobbledollars/common/config/CommonConfig;", "config", "Lfr/harmex/cobbledollars/common/config/CommonConfig;", "getConfig", "()Lfr/harmex/cobbledollars/common/config/CommonConfig;", "setConfig", "(Lfr/harmex/cobbledollars/common/config/CommonConfig;)V", "Lfr/harmex/cobbledollars/common/config/ShopConfig;", "shopConfig", "Lfr/harmex/cobbledollars/common/config/ShopConfig;", "getShopConfig", "()Lfr/harmex/cobbledollars/common/config/ShopConfig;", "setShopConfig", "(Lfr/harmex/cobbledollars/common/config/ShopConfig;)V", "Lfr/harmex/cobbledollars/common/config/BankConfig;", "bankConfig", "Lfr/harmex/cobbledollars/common/config/BankConfig;", "getBankConfig", "()Lfr/harmex/cobbledollars/common/config/BankConfig;", "setBankConfig", "(Lfr/harmex/cobbledollars/common/config/BankConfig;)V", "Ljava/util/concurrent/ScheduledExecutorService;", "saveExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "getSaveExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "setSaveExecutor", "(Ljava/util/concurrent/ScheduledExecutorService;)V", "Ljava/time/LocalDateTime;", "nextSaveDateTime", "Ljava/time/LocalDateTime;", "getNextSaveDateTime", "()Ljava/time/LocalDateTime;", "setNextSaveDateTime", "(Ljava/time/LocalDateTime;)V", "", "Lfr/harmex/cobbledollars/common/world/cobbledollars/CobbleDollarsAccount;", "cobbleDollarsAccounts", "Ljava/util/List;", "getCobbleDollarsAccounts", "()Ljava/util/List;", "setCobbleDollarsAccounts", "(Ljava/util/List;)V", "common"})
/*     */ @SourceDebugExtension({"SMAP\nCobbleDollars.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CobbleDollars.kt\nfr/harmex/cobbledollars/common/CobbleDollars\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,107:1\n1863#2,2:108\n1863#2,2:110\n126#3:112\n153#3,3:113\n*S KotlinDebug\n*F\n+ 1 CobbleDollars.kt\nfr/harmex/cobbledollars/common/CobbleDollars\n*L\n66#1:108,2\n96#1:110,2\n97#1:112\n97#1:113,3\n*E\n"})
/*     */ public final class CobbleDollars {
/*     */   @NotNull
/*  33 */   public static final CobbleDollars INSTANCE = new CobbleDollars();
/*     */   
/*     */   @NotNull
/*     */   public static final String MOD_ID = "cobbledollars";
/*     */   
/*     */   @NotNull
/*  33 */   private static final Logger LOGGER = LogManager.getLogger("CobbleDollars");
/*     */   
/*     */   public static CobbleDollarsImplementation implementation;
/*     */   
/*     */   public static CommonConfig config;
/*     */   
/*     */   public static ShopConfig shopConfig;
/*     */   
/*     */   public static BankConfig bankConfig;
/*     */   
/*     */   public static ScheduledExecutorService saveExecutor;
/*     */   
/*     */   public static LocalDateTime nextSaveDateTime;
/*     */   
/*     */   @NotNull
/*     */   public final Logger getLOGGER() {
/*  33 */     return LOGGER;
/*     */   }
/*     */   
/*     */   static {
/*  33 */     Intrinsics.checkNotNullExpressionValue(LogManager.getLogger("CobbleDollars"), "getLogger(...)");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final CobbleDollarsImplementation getImplementation() {
/*  34 */     if (implementation != null)
/*  34 */       return implementation; 
/*  34 */     Intrinsics.throwUninitializedPropertyAccessException("implementation");
/*  34 */     return null;
/*     */   }
/*     */   
/*     */   public final void setImplementation(@NotNull CobbleDollarsImplementation <set-?>) {
/*  34 */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*  34 */     implementation = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final CommonConfig getConfig() {
/*  35 */     if (config != null)
/*  35 */       return config; 
/*  35 */     Intrinsics.throwUninitializedPropertyAccessException("config");
/*  35 */     return null;
/*     */   }
/*     */   
/*     */   public final void setConfig(@NotNull CommonConfig <set-?>) {
/*  35 */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*  35 */     config = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ShopConfig getShopConfig() {
/*  36 */     if (shopConfig != null)
/*  36 */       return shopConfig; 
/*  36 */     Intrinsics.throwUninitializedPropertyAccessException("shopConfig");
/*  36 */     return null;
/*     */   }
/*     */   
/*     */   public final void setShopConfig(@NotNull ShopConfig <set-?>) {
/*  36 */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*  36 */     shopConfig = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final BankConfig getBankConfig() {
/*  37 */     if (bankConfig != null)
/*  37 */       return bankConfig; 
/*  37 */     Intrinsics.throwUninitializedPropertyAccessException("bankConfig");
/*  37 */     return null;
/*     */   }
/*     */   
/*     */   public final void setBankConfig(@NotNull BankConfig <set-?>) {
/*  37 */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*  37 */     bankConfig = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ScheduledExecutorService getSaveExecutor() {
/*  38 */     if (saveExecutor != null)
/*  38 */       return saveExecutor; 
/*  38 */     Intrinsics.throwUninitializedPropertyAccessException("saveExecutor");
/*  38 */     return null;
/*     */   }
/*     */   
/*     */   public final void setSaveExecutor(@NotNull ScheduledExecutorService <set-?>) {
/*  38 */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*  38 */     saveExecutor = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final LocalDateTime getNextSaveDateTime() {
/*  39 */     if (nextSaveDateTime != null)
/*  39 */       return nextSaveDateTime; 
/*  39 */     Intrinsics.throwUninitializedPropertyAccessException("nextSaveDateTime");
/*  39 */     return null;
/*     */   }
/*     */   
/*     */   public final void setNextSaveDateTime(@NotNull LocalDateTime <set-?>) {
/*  39 */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*  39 */     nextSaveDateTime = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*  40 */   private static List<CobbleDollarsAccount> cobbleDollarsAccounts = CollectionsKt.emptyList();
/*     */   
/*     */   @NotNull
/*     */   public final List<CobbleDollarsAccount> getCobbleDollarsAccounts() {
/*  40 */     return cobbleDollarsAccounts;
/*     */   }
/*     */   
/*     */   public final void setCobbleDollarsAccounts(@NotNull List<CobbleDollarsAccount> <set-?>) {
/*  40 */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*  40 */     cobbleDollarsAccounts = <set-?>;
/*     */   }
/*     */   
/*     */   public final void preInit(@NotNull CobbleDollarsImplementation implementation) {
/*  43 */     Intrinsics.checkNotNullParameter(implementation, "implementation");
/*  43 */     setImplementation(implementation);
/*  45 */     implementation.registerItems();
/*  46 */     implementation.registerEntityTypes();
/*  47 */     implementation.registerEntityAttributes();
/*  48 */     implementation.registerVillagers();
/*  49 */     implementation.registerMenus();
/*  51 */     registerArgumentTypes();
/*     */   }
/*     */   
/*     */   public final void init() {
/*  55 */     Observable.DefaultImpls.subscribe$default((Observable)PlatformEvents.SERVER_STARTING, null, CobbleDollars::init$lambda$0, 1, null);
/*  61 */     Observable.DefaultImpls.subscribe$default((Observable)PlatformEvents.SERVER_STARTED, null, CobbleDollars::init$lambda$1, 1, null);
/*  65 */     Observable.DefaultImpls.subscribe$default((Observable)PlatformEvents.SERVER_STOPPING, null, CobbleDollars::init$lambda$3, 1, null);
/*  70 */     if (getImplementation().isModLoaded("gts"))
/*  71 */       Observable.DefaultImpls.subscribe$default((Observable)PlatformEvents.SERVER_STARTED, null, CobbleDollars::init$lambda$4, 1, null); 
/*  77 */     Observable.DefaultImpls.subscribe$default((Observable)PlatformEvents.SERVER_PLAYER_LOGIN, null, CobbleDollars::init$lambda$5, 1, null);
/*  82 */     Observable.DefaultImpls.subscribe$default((Observable)PlatformEvents.SERVER_PLAYER_LOGOUT, null, CobbleDollars::init$lambda$6, 1, null);
/*  86 */     Observable.DefaultImpls.subscribe$default((Observable)CobblemonEvents.BATTLE_VICTORY, null, CobbleDollars$init$7.INSTANCE, 1, null);
/*     */   }
/*     */   
/*     */   private static final Unit init$lambda$0(ServerEvent.Starting it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     CommonConfig.Companion.load();
/*     */     ShopConfig.Companion.load();
/*     */     BankConfig.Companion.load();
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit init$lambda$1(ServerEvent.Started it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     INSTANCE.saveSchedule(it.getServer());
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit init$lambda$3(ServerEvent.Stopping it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     Intrinsics.checkNotNullExpressionValue(it.getServer().method_3760().method_14571(), "getPlayers(...)");
/*     */     Iterable $this$forEach$iv = it.getServer().method_3760().method_14571();
/*     */     int $i$f$forEach = 0;
/* 108 */     Iterator iterator = $this$forEach$iv.iterator();
/* 108 */     if (iterator.hasNext()) {
/* 108 */       Object element$iv = iterator.next();
/* 108 */       class_3222 serverPlayer = (class_3222)element$iv;
/* 108 */       int $i$a$-forEach-CobbleDollars$init$3$1 = 0;
/*     */       Intrinsics.checkNotNull(serverPlayer);
/*     */       PlayerExtensionKt.updateCobbleDollarsAccount(serverPlayer);
/*     */     } 
/*     */     INSTANCE.getSaveExecutor().close();
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit init$lambda$4(ServerEvent.Started it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     GTSImplementation.Companion.setServer(it.getServer());
/*     */     GtsEconomyProvider.putEconomy(Priority.HIGHEST, (GtsEconomy)new GTSImplementation());
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit init$lambda$5(ServerPlayerEvent.Login it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     PlayerExtensionKt.loginCobbleDollarsAccount(it.getPlayer());
/*     */     CobbleDollarsNetwork.INSTANCE.sendPacket(it.getPlayer(), (NetworkPacket)new SyncShopConfigPacket(INSTANCE.getShopConfig().getDefaultShop(), INSTANCE.getBankConfig().getBank()));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit init$lambda$6(ServerPlayerEvent.Logout it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     PlayerExtensionKt.logoutCobbleDollarsAccount(it.getPlayer());
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   public final void saveSchedule(@NotNull MinecraftServer server) {
/*     */     Intrinsics.checkNotNullParameter(server, "server");
/*     */     ThreadFactory threadFactory = CobbleDollars::saveSchedule$lambda$7;
/*     */     setSaveExecutor(Executors.newSingleThreadScheduledExecutor(threadFactory));
/*     */     getSaveExecutor().scheduleAtFixedRate(server::saveSchedule$lambda$10, 0L, getConfig().getPlayerDataSaveFrequency(), TimeUnit.MINUTES);
/*     */   }
/*     */   
/*     */   private static final Thread saveSchedule$lambda$7(Runnable runnable) {
/*     */     return new Thread(runnable, "CobbleDollars Save Scheduler");
/*     */   }
/*     */   
/*     */   private static final void saveSchedule$lambda$10(MinecraftServer $server) {
/*     */     Intrinsics.checkNotNullParameter($server, "$server");
/*     */     Intrinsics.checkNotNullExpressionValue($server.method_3760().method_14571(), "getPlayers(...)");
/*     */     Iterable $this$forEach$iv = $server.method_3760().method_14571();
/*     */     int $i$f$forEach = 0;
/* 110 */     Iterator iterator = $this$forEach$iv.iterator();
/* 110 */     if (iterator.hasNext()) {
/* 110 */       Object element$iv = iterator.next();
/* 110 */       class_3222 serverPlayer = (class_3222)element$iv;
/* 110 */       int $i$a$-forEach-CobbleDollars$saveSchedule$1$1 = 0;
/*     */       Intrinsics.checkNotNull(serverPlayer);
/*     */       PlayerExtensionKt.updateCobbleDollarsAccount(serverPlayer);
/*     */     } 
/*     */     Map $this$map$iv = PlayerExtensionKt.getAllPlayerCobbleDollars($server);
/*     */     int $i$f$map = 0;
/* 112 */     Map map1 = $this$map$iv;
/* 112 */     Collection<CobbleDollarsAccount> destination$iv$iv = new ArrayList($this$map$iv.size());
/* 112 */     int $i$f$mapTo = 0;
/* 113 */     for (Map.Entry item$iv$iv : map1.entrySet()) {
/* 114 */       Map.Entry entry1 = item$iv$iv;
/* 114 */       Collection<CobbleDollarsAccount> collection = destination$iv$iv;
/* 114 */       int $i$a$-map-CobbleDollars$saveSchedule$1$2 = 0;
/*     */       String playerName = (String)entry1.getKey();
/*     */       BigInteger balance = (BigInteger)entry1.getValue();
/* 114 */       collection.add(new CobbleDollarsAccount(playerName, balance));
/*     */     } 
/* 115 */     cobbleDollarsAccounts = (List<CobbleDollarsAccount>)destination$iv$iv;
/*     */     INSTANCE.setNextSaveDateTime(LocalDateTime.now().plusMinutes(INSTANCE.getConfig().getPlayerDataSaveFrequency()));
/*     */   }
/*     */   
/*     */   private final void registerArgumentTypes() {
/*     */     Intrinsics.checkNotNullExpressionValue(class_2319.method_41999(BigIntegerArgumentType.Companion::bigInt), "contextFree(...)");
/*     */     getImplementation().registerCommandArgument(MiscUtilsKt.cobbleDollarsResource("big_integer"), Reflection.getOrCreateKotlinClass(BigIntegerArgumentType.class), (class_2314<ArgumentType<?>, class_2314.class_7217<ArgumentType<?>>>)class_2319.method_41999(BigIntegerArgumentType.Companion::bigInt));
/*     */   }
/*     */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\CobbleDollars.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */