/*    */ package fr.harmex.cobbledollars.common.client.config;
/*    */ 
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ import fr.harmex.cobbledollars.common.client.utils.OverlayPosition;
/*    */ import fr.harmex.cobbledollars.common.utils.adapters.OverlayPositionAdapter;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\b\030\000 \0132\0020\001:\001\013B\007¢\006\004\b\002\020\003R\"\020\005\032\0020\0048\006@\006X\016¢\006\022\n\004\b\005\020\006\032\004\b\007\020\b\"\004\b\t\020\n¨\006\f"}, d2 = {"Lfr/harmex/cobbledollars/common/client/config/ClientConfig;", "", "<init>", "()V", "Lfr/harmex/cobbledollars/common/client/utils/OverlayPosition;", "overlayPosition", "Lfr/harmex/cobbledollars/common/client/utils/OverlayPosition;", "getOverlayPosition", "()Lfr/harmex/cobbledollars/common/client/utils/OverlayPosition;", "setOverlayPosition", "(Lfr/harmex/cobbledollars/common/client/utils/OverlayPosition;)V", "Companion", "common"})
/*    */ public final class ClientConfig {
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\005\032\0020\0048\006¢\006\f\n\004\b\005\020\006\032\004\b\007\020\b¨\006\t"}, d2 = {"Lfr/harmex/cobbledollars/common/client/config/ClientConfig$Companion;", "", "<init>", "()V", "Lcom/google/gson/Gson;", "GSON", "Lcom/google/gson/Gson;", "getGSON", "()Lcom/google/gson/Gson;", "common"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final Gson getGSON() {
/* 10 */       return ClientConfig.GSON;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/* 14 */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @NotNull
/* 14 */   private static final Gson GSON = (new GsonBuilder()).disableHtmlEscaping().setPrettyPrinting().registerTypeAdapter(OverlayPosition.class, new OverlayPositionAdapter()).create();
/*    */   
/*    */   static {
/* 14 */     Intrinsics.checkNotNullExpressionValue((new GsonBuilder()).disableHtmlEscaping().setPrettyPrinting().registerTypeAdapter(OverlayPosition.class, new OverlayPositionAdapter()).create(), "create(...)");
/*    */   }
/*    */   
/*    */   @NotNull
/* 17 */   private OverlayPosition overlayPosition = OverlayPosition.BOTTOM_RIGHT;
/*    */   
/*    */   @NotNull
/*    */   public final OverlayPosition getOverlayPosition() {
/* 17 */     return this.overlayPosition;
/*    */   }
/*    */   
/*    */   public final void setOverlayPosition(@NotNull OverlayPosition <set-?>) {
/* 17 */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/* 17 */     this.overlayPosition = <set-?>;
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\client\config\ClientConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */