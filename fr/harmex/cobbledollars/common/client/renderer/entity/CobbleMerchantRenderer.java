/*    */ package fr.harmex.cobbledollars.common.client.renderer.entity;
/*    */ 
/*    */ import fr.harmex.cobbledollars.common.world.entity.CobbleMerchant;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1297;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_2960;
/*    */ import net.minecraft.class_3883;
/*    */ import net.minecraft.class_3885;
/*    */ import net.minecraft.class_3887;
/*    */ import net.minecraft.class_4587;
/*    */ import net.minecraft.class_5602;
/*    */ import net.minecraft.class_5617;
/*    */ import net.minecraft.class_583;
/*    */ import net.minecraft.class_620;
/*    */ import net.minecraft.class_927;
/*    */ import net.minecraft.class_976;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\007\n\000\n\002\020\002\n\002\b\004\030\000 \0242\024\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0020\0030\001:\001\024B\021\b\026\022\006\020\005\032\0020\004¢\006\004\b\006\020\007J\027\020\n\032\0020\t2\006\020\b\032\0020\002H\026¢\006\004\b\n\020\013J'\020\022\032\0020\0212\006\020\f\032\0020\0022\006\020\016\032\0020\r2\006\020\020\032\0020\017H\024¢\006\004\b\022\020\023¨\006\025"}, d2 = {"Lfr/harmex/cobbledollars/common/client/renderer/entity/CobbleMerchantRenderer;", "Lnet/minecraft/class_927;", "Lfr/harmex/cobbledollars/common/world/entity/CobbleMerchant;", "Lnet/minecraft/class_620;", "Lnet/minecraft/class_5617$class_5618;", "context", "<init>", "(Lnet/minecraft/class_5617$class_5618;)V", "entity", "Lnet/minecraft/class_2960;", "getTextureLocation", "(Lfr/harmex/cobbledollars/common/world/entity/CobbleMerchant;)Lnet/minecraft/class_2960;", "livingEntity", "Lnet/minecraft/class_4587;", "poseStack", "", "partialTickTime", "", "scale", "(Lfr/harmex/cobbledollars/common/world/entity/CobbleMerchant;Lnet/minecraft/class_4587;F)V", "Companion", "common"})
/*    */ public final class CobbleMerchantRenderer extends class_927<CobbleMerchant, class_620<CobbleMerchant>> {
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\024\020\005\032\0020\0048\002X\004¢\006\006\n\004\b\005\020\006¨\006\007"}, d2 = {"Lfr/harmex/cobbledollars/common/client/renderer/entity/CobbleMerchantRenderer$Companion;", "", "<init>", "()V", "Lnet/minecraft/class_2960;", "COBBLE_MERCHANT_BASE_SKIN", "Lnet/minecraft/class_2960;", "common"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */   
/*    */   @NotNull
/* 15 */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @NotNull
/* 15 */   private static final class_2960 COBBLE_MERCHANT_BASE_SKIN = class_2960.method_60656("textures/entity/villager/villager.png");
/*    */   
/*    */   static {
/* 15 */     Intrinsics.checkNotNullExpressionValue(class_2960.method_60656("textures/entity/villager/villager.png"), "withDefaultNamespace(...)");
/*    */   }
/*    */   
/*    */   public CobbleMerchantRenderer(@NotNull class_5617.class_5618 context) {
/* 18 */     super(context, (class_583)new class_620(context.method_32167(class_5602.field_27675)), 0.5F);
/* 19 */     method_4046((class_3887)new class_976((class_3883)this, context.method_32170(), context.method_43338()));
/* 20 */     method_4046((class_3887)new class_3885((class_3883)this, context.method_32169(), "villager"));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public class_2960 getTextureLocation(@NotNull CobbleMerchant entity) {
/* 24 */     Intrinsics.checkNotNullParameter(entity, "entity");
/* 24 */     return COBBLE_MERCHANT_BASE_SKIN;
/*    */   }
/*    */   
/*    */   protected void scale(@NotNull CobbleMerchant livingEntity, @NotNull class_4587 poseStack, float partialTickTime) {
/* 28 */     Intrinsics.checkNotNullParameter(livingEntity, "livingEntity");
/* 28 */     Intrinsics.checkNotNullParameter(poseStack, "poseStack");
/* 28 */     float scale = 0.9375F;
/* 29 */     poseStack.method_22905(scale, scale, scale);
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\client\renderer\entity\CobbleMerchantRenderer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */