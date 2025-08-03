/*    */ package fr.harmex.cobbledollars.common.world;
/*    */ 
/*    */ import com.cobblemon.mod.common.world.CobblemonStructures;
/*    */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_2378;
/*    */ import net.minecraft.class_2960;
/*    */ import net.minecraft.class_3785;
/*    */ import net.minecraft.class_5321;
/*    */ import net.minecraft.class_5497;
/*    */ import net.minecraft.class_7924;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\r\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\025\020\007\032\0020\0062\006\020\005\032\0020\004¢\006\004\b\007\020\bJ+\020\016\032\0020\0062\f\020\013\032\b\022\004\022\0020\n0\t2\f\020\r\032\b\022\004\022\0020\f0\tH\002¢\006\004\b\016\020\017R8\020\022\032&\022\f\022\n \021*\004\030\0010\f0\f \021*\022\022\f\022\n \021*\004\030\0010\f0\f\030\0010\0200\0208\002X\004¢\006\006\n\004\b\022\020\023R\024\020\025\032\0020\0248\002XT¢\006\006\n\004\b\025\020\026R\027\020\030\032\0020\0278\006¢\006\f\n\004\b\030\020\031\032\004\b\032\020\033R\027\020\034\032\0020\0278\006¢\006\f\n\004\b\034\020\031\032\004\b\035\020\033R\027\020\036\032\0020\0278\006¢\006\f\n\004\b\036\020\031\032\004\b\037\020\033R\027\020 \032\0020\0278\006¢\006\f\n\004\b \020\031\032\004\b!\020\033R\027\020\"\032\0020\0278\006¢\006\f\n\004\b\"\020\031\032\004\b#\020\033¨\006$"}, d2 = {"Lfr/harmex/cobbledollars/common/world/CobbleDollarsStructures;", "", "<init>", "()V", "Lnet/minecraft/server/MinecraftServer;", "server", "", "register", "(Lnet/minecraft/server/MinecraftServer;)V", "Lnet/minecraft/class_2378;", "Lnet/minecraft/class_3785;", "templatePoolRegistry", "Lnet/minecraft/class_5497;", "processorListRegistry", "addCobbleMerchants", "(Lnet/minecraft/class_2378;Lnet/minecraft/class_2378;)V", "Lnet/minecraft/class_5321;", "kotlin.jvm.PlatformType", "EMPTY_PROCESSOR_LIST_KEY", "Lnet/minecraft/class_5321;", "", "COBBLE_MERCHANT_WEIGHT", "I", "Lnet/minecraft/class_2960;", "desertVillagersPoolLocation", "Lnet/minecraft/class_2960;", "getDesertVillagersPoolLocation", "()Lnet/minecraft/class_2960;", "plainsVillagersPoolLocation", "getPlainsVillagersPoolLocation", "savannaVillagersPoolLocation", "getSavannaVillagersPoolLocation", "snowyVillagersPoolLocation", "getSnowyVillagersPoolLocation", "taigaVillagersPoolLocation", "getTaigaVillagersPoolLocation", "common"})
/*    */ public final class CobbleDollarsStructures {
/*    */   @NotNull
/* 14 */   public static final CobbleDollarsStructures INSTANCE = new CobbleDollarsStructures();
/*    */   
/* 14 */   private static final class_5321<class_5497> EMPTY_PROCESSOR_LIST_KEY = class_5321.method_29179(class_7924.field_41247, class_2960.method_60655("minecraft", "empty"));
/*    */   
/*    */   private static final int COBBLE_MERCHANT_WEIGHT = 1;
/*    */   
/*    */   @NotNull
/* 17 */   private static final class_2960 desertVillagersPoolLocation = class_2960.method_60656("village/desert/villagers");
/*    */   
/*    */   @NotNull
/*    */   public final class_2960 getDesertVillagersPoolLocation() {
/* 17 */     return desertVillagersPoolLocation;
/*    */   }
/*    */   
/*    */   static {
/* 17 */     Intrinsics.checkNotNullExpressionValue(class_2960.method_60656("village/desert/villagers"), "withDefaultNamespace(...)");
/*    */   }
/*    */   
/*    */   @NotNull
/* 18 */   private static final class_2960 plainsVillagersPoolLocation = class_2960.method_60656("village/plains/villagers");
/*    */   
/*    */   @NotNull
/*    */   public final class_2960 getPlainsVillagersPoolLocation() {
/* 18 */     return plainsVillagersPoolLocation;
/*    */   }
/*    */   
/*    */   static {
/* 18 */     Intrinsics.checkNotNullExpressionValue(class_2960.method_60656("village/plains/villagers"), "withDefaultNamespace(...)");
/*    */   }
/*    */   
/*    */   @NotNull
/* 19 */   private static final class_2960 savannaVillagersPoolLocation = class_2960.method_60656("village/savanna/villagers");
/*    */   
/*    */   @NotNull
/*    */   public final class_2960 getSavannaVillagersPoolLocation() {
/* 19 */     return savannaVillagersPoolLocation;
/*    */   }
/*    */   
/*    */   static {
/* 19 */     Intrinsics.checkNotNullExpressionValue(class_2960.method_60656("village/savanna/villagers"), "withDefaultNamespace(...)");
/*    */   }
/*    */   
/*    */   @NotNull
/* 20 */   private static final class_2960 snowyVillagersPoolLocation = class_2960.method_60656("village/snowy/villagers");
/*    */   
/*    */   @NotNull
/*    */   public final class_2960 getSnowyVillagersPoolLocation() {
/* 20 */     return snowyVillagersPoolLocation;
/*    */   }
/*    */   
/*    */   static {
/* 20 */     Intrinsics.checkNotNullExpressionValue(class_2960.method_60656("village/snowy/villagers"), "withDefaultNamespace(...)");
/*    */   }
/*    */   
/*    */   @NotNull
/* 21 */   private static final class_2960 taigaVillagersPoolLocation = class_2960.method_60656("village/taiga/villagers");
/*    */   
/*    */   @NotNull
/*    */   public final class_2960 getTaigaVillagersPoolLocation() {
/* 21 */     return taigaVillagersPoolLocation;
/*    */   }
/*    */   
/*    */   static {
/* 21 */     Intrinsics.checkNotNullExpressionValue(class_2960.method_60656("village/taiga/villagers"), "withDefaultNamespace(...)");
/*    */   }
/*    */   
/*    */   public final void register(@NotNull MinecraftServer server) {
/* 24 */     Intrinsics.checkNotNullParameter(server, "server");
/* 24 */     class_2378<class_3785> templatePoolRegistry = server.method_30611().method_30530(class_7924.field_41249);
/* 25 */     class_2378<class_5497> processorListRegistry = server.method_30611().method_30530(class_7924.field_41247);
/* 27 */     Intrinsics.checkNotNull(templatePoolRegistry);
/* 27 */     Intrinsics.checkNotNull(processorListRegistry);
/* 27 */     addCobbleMerchants(templatePoolRegistry, processorListRegistry);
/*    */   }
/*    */   
/*    */   private final void addCobbleMerchants(class_2378 templatePoolRegistry, class_2378 processorListRegistry) {
/* 41 */     Intrinsics.checkNotNullExpressionValue(EMPTY_PROCESSOR_LIST_KEY, "EMPTY_PROCESSOR_LIST_KEY");
/* 41 */     CobblemonStructures.addBuildingToPool$default(CobblemonStructures.INSTANCE, templatePoolRegistry, processorListRegistry, plainsVillagersPoolLocation, MiscUtilsKt.cobbleDollarsResource("cobble_merchant"), 1, class_3785.class_3786.field_16687, EMPTY_PROCESSOR_LIST_KEY, false, 128, null);
/* 51 */     Intrinsics.checkNotNullExpressionValue(EMPTY_PROCESSOR_LIST_KEY, "EMPTY_PROCESSOR_LIST_KEY");
/* 51 */     CobblemonStructures.addBuildingToPool$default(CobblemonStructures.INSTANCE, templatePoolRegistry, processorListRegistry, desertVillagersPoolLocation, MiscUtilsKt.cobbleDollarsResource("cobble_merchant"), 1, class_3785.class_3786.field_16687, EMPTY_PROCESSOR_LIST_KEY, false, 128, null);
/* 61 */     Intrinsics.checkNotNullExpressionValue(EMPTY_PROCESSOR_LIST_KEY, "EMPTY_PROCESSOR_LIST_KEY");
/* 61 */     CobblemonStructures.addBuildingToPool$default(CobblemonStructures.INSTANCE, templatePoolRegistry, processorListRegistry, savannaVillagersPoolLocation, MiscUtilsKt.cobbleDollarsResource("cobble_merchant"), 1, class_3785.class_3786.field_16687, EMPTY_PROCESSOR_LIST_KEY, false, 128, null);
/* 71 */     Intrinsics.checkNotNullExpressionValue(EMPTY_PROCESSOR_LIST_KEY, "EMPTY_PROCESSOR_LIST_KEY");
/* 71 */     CobblemonStructures.addBuildingToPool$default(CobblemonStructures.INSTANCE, templatePoolRegistry, processorListRegistry, snowyVillagersPoolLocation, MiscUtilsKt.cobbleDollarsResource("cobble_merchant"), 1, class_3785.class_3786.field_16687, EMPTY_PROCESSOR_LIST_KEY, false, 128, null);
/* 81 */     Intrinsics.checkNotNullExpressionValue(EMPTY_PROCESSOR_LIST_KEY, "EMPTY_PROCESSOR_LIST_KEY");
/* 81 */     CobblemonStructures.addBuildingToPool$default(CobblemonStructures.INSTANCE, templatePoolRegistry, processorListRegistry, taigaVillagersPoolLocation, MiscUtilsKt.cobbleDollarsResource("cobble_merchant"), 1, class_3785.class_3786.field_16687, EMPTY_PROCESSOR_LIST_KEY, false, 128, null);
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\world\CobbleDollarsStructures.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */