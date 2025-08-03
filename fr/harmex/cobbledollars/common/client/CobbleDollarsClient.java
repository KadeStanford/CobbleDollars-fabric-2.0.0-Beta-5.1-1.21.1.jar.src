/*    */ package fr.harmex.cobbledollars.common.client;
/*    */ 
/*    */ import com.cobblemon.mod.common.api.reactive.Observable;
/*    */ import com.cobblemon.mod.common.platform.events.ClientTickEvent;
/*    */ import com.cobblemon.mod.common.platform.events.PlatformEvents;
/*    */ import fr.harmex.cobbledollars.common.CobbleDollars;
/*    */ import fr.harmex.cobbledollars.common.client.config.ClientConfig;
/*    */ import fr.harmex.cobbledollars.common.client.gui.CobbleDollarsOverlay;
/*    */ import fr.harmex.cobbledollars.common.client.utils.GuiUtilsKt;
/*    */ import fr.harmex.cobbledollars.common.world.entity.CobbleDollarsEntities;
/*    */ import java.io.File;
/*    */ import java.io.FileReader;
/*    */ import java.io.FileWriter;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_332;
/*    */ import net.minecraft.class_5617;
/*    */ import net.minecraft.class_9779;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\006\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\025\020\007\032\0020\0062\006\020\005\032\0020\004¢\006\004\b\007\020\bJ\r\020\t\032\0020\006¢\006\004\b\t\020\003J\035\020\016\032\0020\0062\006\020\013\032\0020\n2\006\020\r\032\0020\f¢\006\004\b\016\020\017J\r\020\020\032\0020\006¢\006\004\b\020\020\003J\r\020\021\032\0020\006¢\006\004\b\021\020\003R\"\020\005\032\0020\0048\006@\006X.¢\006\022\n\004\b\005\020\022\032\004\b\023\020\024\"\004\b\025\020\bR\024\020\027\032\0020\0268\002XT¢\006\006\n\004\b\027\020\030R\"\020\032\032\0020\0318\006@\006X.¢\006\022\n\004\b\032\020\033\032\004\b\034\020\035\"\004\b\036\020\037R\033\020%\032\0020 8FX\002¢\006\f\n\004\b!\020\"\032\004\b#\020$¨\006&"}, d2 = {"Lfr/harmex/cobbledollars/common/client/CobbleDollarsClient;", "", "<init>", "()V", "Lfr/harmex/cobbledollars/common/client/CobbleDollarsClientImplementation;", "implementation", "", "init", "(Lfr/harmex/cobbledollars/common/client/CobbleDollarsClientImplementation;)V", "registerEntityRenderers", "Lnet/minecraft/class_332;", "guiGraphics", "Lnet/minecraft/class_9779;", "deltaTracker", "beforeChatRender", "(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V", "loadConfig", "saveConfig", "Lfr/harmex/cobbledollars/common/client/CobbleDollarsClientImplementation;", "getImplementation", "()Lfr/harmex/cobbledollars/common/client/CobbleDollarsClientImplementation;", "setImplementation", "", "CONFIG_PATH", "Ljava/lang/String;", "Lfr/harmex/cobbledollars/common/client/config/ClientConfig;", "config", "Lfr/harmex/cobbledollars/common/client/config/ClientConfig;", "getConfig", "()Lfr/harmex/cobbledollars/common/client/config/ClientConfig;", "setConfig", "(Lfr/harmex/cobbledollars/common/client/config/ClientConfig;)V", "Lfr/harmex/cobbledollars/common/client/gui/CobbleDollarsOverlay;", "overlay$delegate", "Lkotlin/Lazy;", "getOverlay", "()Lfr/harmex/cobbledollars/common/client/gui/CobbleDollarsOverlay;", "overlay", "common"})
/*    */ public final class CobbleDollarsClient {
/*    */   @NotNull
/*    */   public final CobbleDollarsClientImplementation getImplementation() {
/* 18 */     if (implementation != null)
/* 18 */       return implementation; 
/* 18 */     Intrinsics.throwUninitializedPropertyAccessException("implementation");
/* 18 */     return null;
/*    */   }
/*    */   
/*    */   public final void setImplementation(@NotNull CobbleDollarsClientImplementation <set-?>) {
/* 18 */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/* 18 */     implementation = <set-?>;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ClientConfig getConfig() {
/* 20 */     if (config != null)
/* 20 */       return config; 
/* 20 */     Intrinsics.throwUninitializedPropertyAccessException("config");
/* 20 */     return null;
/*    */   }
/*    */   
/*    */   public final void setConfig(@NotNull ClientConfig <set-?>) {
/* 20 */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/* 20 */     config = <set-?>;
/*    */   }
/*    */   
/*    */   @NotNull
/* 21 */   public static final CobbleDollarsClient INSTANCE = new CobbleDollarsClient();
/*    */   
/*    */   public static CobbleDollarsClientImplementation implementation;
/*    */   
/*    */   @NotNull
/*    */   private static final String CONFIG_PATH = "config/cobbledollars/client.json";
/*    */   
/*    */   public static ClientConfig config;
/*    */   
/*    */   @NotNull
/* 21 */   private static final Lazy overlay$delegate = LazyKt.lazy(CobbleDollarsClient::overlay_delegate$lambda$0);
/*    */   
/*    */   @NotNull
/*    */   public final CobbleDollarsOverlay getOverlay() {
/* 21 */     Lazy lazy = overlay$delegate;
/* 21 */     return (CobbleDollarsOverlay)lazy.getValue();
/*    */   }
/*    */   
/*    */   private static final CobbleDollarsOverlay overlay_delegate$lambda$0() {
/* 21 */     return new CobbleDollarsOverlay();
/*    */   }
/*    */   
/*    */   public final void init(@NotNull CobbleDollarsClientImplementation implementation) {
/* 24 */     Intrinsics.checkNotNullParameter(implementation, "implementation");
/* 24 */     setImplementation(implementation);
/* 25 */     registerEntityRenderers();
/* 27 */     loadConfig();
/* 29 */     Observable.DefaultImpls.subscribe$default((Observable)PlatformEvents.CLIENT_TICK_PRE, null, CobbleDollarsClient::init$lambda$1, 1, null);
/*    */   }
/*    */   
/*    */   private static final Unit init$lambda$1(ClientTickEvent.Pre it) {
/* 30 */     Intrinsics.checkNotNullParameter(it, "it");
/* 30 */     GuiUtilsKt.tick();
/* 31 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   public final void registerEntityRenderers() {
/* 35 */     Intrinsics.checkNotNullExpressionValue(CobbleDollarsEntities.COBBLE_MERCHANT, "COBBLE_MERCHANT");
/* 35 */     getImplementation().registerEntityRenderer(CobbleDollarsEntities.COBBLE_MERCHANT, fr.harmex.cobbledollars.common.client.renderer.entity.CobbleMerchantRenderer::new);
/*    */   }
/*    */   
/*    */   public final void beforeChatRender(@NotNull class_332 guiGraphics, @NotNull class_9779 deltaTracker) {
/* 39 */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/* 39 */     Intrinsics.checkNotNullParameter(deltaTracker, "deltaTracker");
/* 39 */     getOverlay().method_1753(guiGraphics, deltaTracker);
/*    */   }
/*    */   
/*    */   public final void loadConfig() {
/* 43 */     File configFile = new File("config/cobbledollars/client.json");
/* 44 */     configFile.getParentFile().mkdirs();
/* 46 */     if (configFile.exists()) {
/*    */       try {
/* 48 */         FileReader reader = new FileReader(configFile);
/* 49 */         setConfig((ClientConfig)ClientConfig.Companion.getGSON().fromJson(reader, ClientConfig.class));
/* 50 */         reader.close();
/* 51 */       } catch (Exception exception) {
/* 52 */         setConfig(new ClientConfig());
/* 53 */         CobbleDollars.INSTANCE.getLOGGER().error("Failed to load the config! Using default config until the following has been addressed:");
/* 54 */         exception.printStackTrace();
/*    */       } 
/*    */     } else {
/* 57 */       setConfig(new ClientConfig());
/*    */     } 
/* 60 */     saveConfig();
/*    */   }
/*    */   
/*    */   public final void saveConfig() {
/*    */     try {
/* 65 */       File configFile = new File("config/cobbledollars/client.json");
/* 66 */       FileWriter writer = new FileWriter(configFile);
/* 67 */       ClientConfig.Companion.getGSON().toJson(getConfig(), writer);
/* 68 */       writer.close();
/* 69 */     } catch (Exception exception) {
/* 70 */       CobbleDollars.INSTANCE.getLOGGER().error("Failed to save the config! Please consult the following stack trace:");
/* 71 */       exception.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\client\CobbleDollarsClient.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */