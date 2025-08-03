/*     */ package fr.harmex.cobbledollars.common.client.utils;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.enums.EnumEntries;
/*     */ import kotlin.enums.EnumEntriesKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.class_2561;
/*     */ import net.minecraft.class_3542;
/*     */ import net.minecraft.class_5250;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\020\020\n\002\020\016\n\002\b\005\n\002\030\002\n\002\b\f\b\002\030\000 \0172\0020\0012\b\022\004\022\0020\0000\002:\001\017B\021\b\002\022\006\020\004\032\0020\003¢\006\004\b\005\020\006J\017\020\007\032\0020\003H\026¢\006\004\b\007\020\bJ\025\020\013\032\n \n*\004\030\0010\t0\t¢\006\004\b\013\020\fR\027\020\004\032\0020\0038\006¢\006\f\n\004\b\004\020\r\032\004\b\016\020\bj\002\b\020j\002\b\021j\002\b\022j\002\b\023j\002\b\024¨\006\025"}, d2 = {"Lfr/harmex/cobbledollars/common/client/utils/OverlayPosition;", "Lnet/minecraft/class_3542;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getSerializedName", "()Ljava/lang/String;", "Lnet/minecraft/class_5250;", "kotlin.jvm.PlatformType", "getDisplayName", "()Lnet/minecraft/class_5250;", "Ljava/lang/String;", "getKey", "Companion", "DISABLED", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_LEFT", "BOTTOM_RIGHT", "common"})
/*     */ public enum OverlayPosition implements class_3542 {
/* 100 */   DISABLED("disabled"),
/* 101 */   TOP_LEFT("top_left"),
/* 102 */   TOP_RIGHT("top_right"),
/* 103 */   BOTTOM_LEFT("bottom_left"),
/* 104 */   BOTTOM_RIGHT("bottom_right");
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion;
/*     */   
/*     */   @NotNull
/*     */   private final String key;
/*     */   
/*     */   private static final class_3542.class_7292<OverlayPosition> CODEC;
/*     */   
/*     */   OverlayPosition(String key) {
/*     */     this.key = key;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getKey() {
/*     */     return this.key;
/*     */   }
/*     */   
/*     */   static {
/* 104 */     Companion = new Companion(null);
/* 107 */     CODEC = class_3542.method_28140(OverlayPosition::values);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\027\020\007\032\004\030\0010\0062\006\020\005\032\0020\004¢\006\004\b\007\020\bR;\020\013\032&\022\f\022\n \n*\004\030\0010\0060\006 \n*\022\022\f\022\n \n*\004\030\0010\0060\006\030\0010\t0\t8\006¢\006\f\n\004\b\013\020\f\032\004\b\r\020\016¨\006\017"}, d2 = {"Lfr/harmex/cobbledollars/common/client/utils/OverlayPosition$Companion;", "", "<init>", "()V", "", "name", "Lfr/harmex/cobbledollars/common/client/utils/OverlayPosition;", "byName", "(Ljava/lang/String;)Lfr/harmex/cobbledollars/common/client/utils/OverlayPosition;", "Lnet/minecraft/class_3542$class_7292;", "kotlin.jvm.PlatformType", "CODEC", "Lnet/minecraft/class_3542$class_7292;", "getCODEC", "()Lnet/minecraft/class_3542$class_7292;", "common"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     public final class_3542.class_7292<OverlayPosition> getCODEC() {
/* 107 */       return OverlayPosition.CODEC;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final OverlayPosition byName(@NotNull String name) {
/* 108 */       Intrinsics.checkNotNullParameter(name, "name");
/* 108 */       return (OverlayPosition)getCODEC().method_42633(name);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String method_15434() {
/* 111 */     return this.key;
/*     */   }
/*     */   
/*     */   public final class_5250 getDisplayName() {
/* 113 */     return class_2561.method_43471("option.cobbledollars.overlay_position." + this.key);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static EnumEntries<OverlayPosition> getEntries() {
/* 114 */     return $ENTRIES;
/*     */   }
/*     */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\clien\\utils\OverlayPosition.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */