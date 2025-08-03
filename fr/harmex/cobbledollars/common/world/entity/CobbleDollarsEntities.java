/*    */ package fr.harmex.cobbledollars.common.world.entity;
/*    */ 
/*    */ import com.cobblemon.mod.common.platform.PlatformRegistry;
/*    */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1299;
/*    */ import net.minecraft.class_1311;
/*    */ import net.minecraft.class_2378;
/*    */ import net.minecraft.class_2960;
/*    */ import net.minecraft.class_5321;
/*    */ import net.minecraft.class_7923;
/*    */ import net.minecraft.class_7924;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\013\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\bÆ\002\030\00022\022\016\022\f\022\b\022\006\022\002\b\0030\0030\002\022\024\022\022\022\016\022\f\022\b\022\006\022\002\b\0030\0030\0020\004\022\b\022\006\022\002\b\0030\0030\001B\t\b\002¢\006\004\b\005\020\006J/\020\f\032\0020\n2 \020\013\032\034\022\f\022\n\022\006\b\001\022\0020\b0\003\022\004\022\0020\t\022\004\022\0020\n0\007¢\006\004\b\f\020\rR$\020\016\032\f\022\b\022\006\022\002\b\0030\0030\0028\026X\004¢\006\f\n\004\b\016\020\017\032\004\b\020\020\021R*\020\022\032\022\022\016\022\f\022\b\022\006\022\002\b\0030\0030\0020\0048\026X\004¢\006\f\n\004\b\022\020\023\032\004\b\024\020\025R\024\020\027\032\0020\0268\006X\004¢\006\006\n\004\b\027\020\030R8\020\033\032&\022\f\022\n \032*\004\030\0010\0310\031 \032*\022\022\f\022\n \032*\004\030\0010\0310\031\030\0010\0030\0038\006X\004¢\006\006\n\004\b\033\020\034¨\006\035"}, d2 = {"Lfr/harmex/cobbledollars/common/world/entity/CobbleDollarsEntities;", "Lcom/cobblemon/mod/common/platform/PlatformRegistry;", "Lnet/minecraft/class_2378;", "Lnet/minecraft/class_1299;", "Lnet/minecraft/class_5321;", "<init>", "()V", "Lkotlin/Function2;", "Lnet/minecraft/class_1309;", "Lnet/minecraft/class_5132$class_5133;", "", "consumer", "registerAttributes", "(Lkotlin/jvm/functions/Function2;)V", "registry", "Lnet/minecraft/class_2378;", "getRegistry", "()Lnet/minecraft/class_2378;", "resourceKey", "Lnet/minecraft/class_5321;", "getResourceKey", "()Lnet/minecraft/class_5321;", "Lnet/minecraft/class_2960;", "COBBLE_MERCHANT_KEY", "Lnet/minecraft/class_2960;", "Lfr/harmex/cobbledollars/common/world/entity/CobbleMerchant;", "kotlin.jvm.PlatformType", "COBBLE_MERCHANT", "Lnet/minecraft/class_1299;", "common"})
/*    */ public final class CobbleDollarsEntities extends PlatformRegistry<class_2378<class_1299<?>>, class_5321<class_2378<class_1299<?>>>, class_1299<?>> {
/*    */   @NotNull
/* 15 */   public static final CobbleDollarsEntities INSTANCE = new CobbleDollarsEntities();
/*    */   
/*    */   @NotNull
/* 15 */   private static final class_2378<class_1299<?>> registry = (class_2378<class_1299<?>>)class_7923.field_41177;
/*    */   
/*    */   @NotNull
/*    */   public class_2378<class_1299<?>> getRegistry() {
/* 15 */     return registry;
/*    */   }
/*    */   
/*    */   static {
/* 15 */     Intrinsics.checkNotNullExpressionValue(class_7923.field_41177, "ENTITY_TYPE");
/*    */   }
/*    */   
/*    */   @NotNull
/* 16 */   private static final class_5321<class_2378<class_1299<?>>> resourceKey = class_7924.field_41266;
/*    */   
/*    */   @NotNull
/*    */   public class_5321<class_2378<class_1299<?>>> getResourceKey() {
/* 16 */     return resourceKey;
/*    */   }
/*    */   
/*    */   static {
/* 16 */     Intrinsics.checkNotNullExpressionValue(class_7924.field_41266, "ENTITY_TYPE");
/*    */   }
/*    */   
/*    */   @JvmField
/*    */   @NotNull
/* 19 */   public static final class_2960 COBBLE_MERCHANT_KEY = MiscUtilsKt.cobbleDollarsResource("cobble_merchant");
/*    */   
/*    */   @JvmField
/* 22 */   public static final class_1299<CobbleMerchant> COBBLE_MERCHANT = (class_1299<CobbleMerchant>)INSTANCE.create(
/* 23 */       COBBLE_MERCHANT_KEY, 
/* 24 */       class_1299.class_1300.method_5903(CobbleMerchant::new, class_1311.field_17715)
/* 25 */       .method_17687(0.6F, 1.95F)
/* 26 */       .method_55687(1.62F)
/* 27 */       .method_27299(10)
/* 28 */       .method_5905(COBBLE_MERCHANT_KEY.toString()));
/*    */   
/*    */   static {
/* 28 */     Intrinsics.checkNotNullExpressionValue(class_1299.class_1300.method_5903(CobbleMerchant::new, class_1311.field_17715).method_17687(0.6F, 1.95F).method_55687(1.62F).method_27299(10).method_5905(COBBLE_MERCHANT_KEY.toString()), "build(...)");
/*    */   }
/*    */   
/*    */   public final void registerAttributes(@NotNull Function2 consumer) {
/* 32 */     Intrinsics.checkNotNullParameter(consumer, "consumer");
/* 32 */     Intrinsics.checkNotNullExpressionValue(COBBLE_MERCHANT, "COBBLE_MERCHANT");
/* 32 */     consumer.invoke(COBBLE_MERCHANT, CobbleMerchant.Companion.createAttributes());
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\world\entity\CobbleDollarsEntities.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */