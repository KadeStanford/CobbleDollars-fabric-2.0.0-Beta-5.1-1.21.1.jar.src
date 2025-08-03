/*    */ package fr.harmex.cobbledollars.common.world.entity.villager;
/*    */ 
/*    */ import com.cobblemon.mod.common.platform.PlatformRegistry;
/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_2378;
/*    */ import net.minecraft.class_3414;
/*    */ import net.minecraft.class_3417;
/*    */ import net.minecraft.class_3852;
/*    */ import net.minecraft.class_5321;
/*    */ import net.minecraft.class_6880;
/*    */ import net.minecraft.class_7923;
/*    */ import net.minecraft.class_7924;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\r\bÆ\002\030\0002&\022\n\022\b\022\004\022\0020\0030\002\022\020\022\016\022\n\022\b\022\004\022\0020\0030\0020\004\022\004\022\0020\0030\001B\t\b\002¢\006\004\b\005\020\006J'\020\013\032\0020\0032\f\020\b\032\b\022\004\022\0020\0070\0042\b\020\n\032\004\030\0010\tH\002¢\006\004\b\013\020\fR \020\r\032\b\022\004\022\0020\0030\0028\026X\004¢\006\f\n\004\b\r\020\016\032\004\b\017\020\020R&\020\b\032\016\022\n\022\b\022\004\022\0020\0030\0020\0048\026X\004¢\006\f\n\004\b\b\020\021\032\004\b\022\020\023R\024\020\024\032\0020\0038\006X\004¢\006\006\n\004\b\024\020\025¨\006\026"}, d2 = {"Lfr/harmex/cobbledollars/common/world/entity/villager/CobbleDollarsProfessions;", "Lcom/cobblemon/mod/common/platform/PlatformRegistry;", "Lnet/minecraft/class_2378;", "Lnet/minecraft/class_3852;", "Lnet/minecraft/class_5321;", "<init>", "()V", "Lnet/minecraft/class_4158;", "resourceKey", "Lnet/minecraft/class_3414;", "soundEvent", "profession", "(Lnet/minecraft/class_5321;Lnet/minecraft/class_3414;)Lnet/minecraft/class_3852;", "registry", "Lnet/minecraft/class_2378;", "getRegistry", "()Lnet/minecraft/class_2378;", "Lnet/minecraft/class_5321;", "getResourceKey", "()Lnet/minecraft/class_5321;", "COBBLE_MERCHANT", "Lnet/minecraft/class_3852;", "common"})
/*    */ public final class CobbleDollarsProfessions extends PlatformRegistry<class_2378<class_3852>, class_5321<class_2378<class_3852>>, class_3852> {
/*    */   @NotNull
/* 16 */   public static final CobbleDollarsProfessions INSTANCE = new CobbleDollarsProfessions();
/*    */   
/*    */   @NotNull
/* 16 */   private static final class_2378<class_3852> registry = (class_2378<class_3852>)class_7923.field_41195;
/*    */   
/*    */   @NotNull
/*    */   public class_2378<class_3852> getRegistry() {
/* 16 */     return registry;
/*    */   }
/*    */   
/*    */   static {
/* 16 */     Intrinsics.checkNotNullExpressionValue(class_7923.field_41195, "VILLAGER_PROFESSION");
/*    */   }
/*    */   
/*    */   @NotNull
/* 17 */   private static final class_5321<class_2378<class_3852>> resourceKey = class_7924.field_41234;
/*    */   
/*    */   @NotNull
/*    */   public class_5321<class_2378<class_3852>> getResourceKey() {
/* 17 */     return resourceKey;
/*    */   }
/*    */   
/*    */   static {
/* 17 */     Intrinsics.checkNotNullExpressionValue(class_7924.field_41234, "VILLAGER_PROFESSION");
/*    */   }
/*    */   
/*    */   @JvmField
/*    */   @NotNull
/* 20 */   public static final class_3852 COBBLE_MERCHANT = INSTANCE.profession(CobbleDollarsPoiTypes.COBBLE_MERCHANT_KEY, class_3417.field_42593);
/*    */   
/*    */   private final class_3852 profession(class_5321 resourceKey, class_3414 soundEvent) {
/* 24 */     Intrinsics.checkNotNullExpressionValue(resourceKey.method_29177(), "location(...)");
/* 24 */     return (class_3852)create(resourceKey.method_29177(), new class_3852(
/* 25 */           resourceKey.method_29177().toString(), resourceKey::profession$lambda$0, resourceKey::profession$lambda$1, 
/*    */           
/* 28 */           ImmutableSet.of(), ImmutableSet.of(), soundEvent));
/*    */   }
/*    */   
/*    */   private static final boolean profession$lambda$0(class_5321 $resourceKey, class_6880 holder) {
/*    */     Intrinsics.checkNotNullParameter($resourceKey, "$resourceKey");
/*    */     Intrinsics.checkNotNullParameter(holder, "holder");
/*    */     return holder.method_40225($resourceKey);
/*    */   }
/*    */   
/*    */   private static final boolean profession$lambda$1(class_5321 $resourceKey, class_6880 holder) {
/*    */     Intrinsics.checkNotNullParameter($resourceKey, "$resourceKey");
/*    */     Intrinsics.checkNotNullParameter(holder, "holder");
/*    */     return holder.method_40225($resourceKey);
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\world\entity\villager\CobbleDollarsProfessions.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */