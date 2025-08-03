/*    */ package fr.harmex.cobbledollars.common.world.entity.villager;
/*    */ 
/*    */ import com.cobblemon.mod.common.CobblemonBlocks;
/*    */ import com.cobblemon.mod.common.platform.PlatformRegistry;
/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*    */ import java.util.Collection;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_2248;
/*    */ import net.minecraft.class_2378;
/*    */ import net.minecraft.class_2680;
/*    */ import net.minecraft.class_4158;
/*    */ import net.minecraft.class_5321;
/*    */ import net.minecraft.class_7923;
/*    */ import net.minecraft.class_7924;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\020\"\n\002\030\002\n\002\b\016\bÆ\002\030\0002&\022\n\022\b\022\004\022\0020\0030\002\022\020\022\016\022\n\022\b\022\004\022\0020\0030\0020\004\022\004\022\0020\0030\001B\t\b\002¢\006\004\b\005\020\006J\035\020\t\032\b\022\004\022\0020\0030\0042\006\020\b\032\0020\007H\002¢\006\004\b\t\020\nJ\035\020\017\032\b\022\004\022\0020\0160\r2\006\020\f\032\0020\013H\002¢\006\004\b\017\020\020R \020\021\032\b\022\004\022\0020\0030\0028\026X\004¢\006\f\n\004\b\021\020\022\032\004\b\023\020\024R&\020\025\032\016\022\n\022\b\022\004\022\0020\0030\0020\0048\026X\004¢\006\f\n\004\b\025\020\026\032\004\b\027\020\030R\032\020\031\032\b\022\004\022\0020\0030\0048\006X\004¢\006\006\n\004\b\031\020\026R\024\020\032\032\0020\0038\006X\004¢\006\006\n\004\b\032\020\033¨\006\034"}, d2 = {"Lfr/harmex/cobbledollars/common/world/entity/villager/CobbleDollarsPoiTypes;", "Lcom/cobblemon/mod/common/platform/PlatformRegistry;", "Lnet/minecraft/class_2378;", "Lnet/minecraft/class_4158;", "Lnet/minecraft/class_5321;", "<init>", "()V", "", "string", "createKey", "(Ljava/lang/String;)Lnet/minecraft/class_5321;", "Lnet/minecraft/class_2248;", "block", "", "Lnet/minecraft/class_2680;", "getBlockStates", "(Lnet/minecraft/class_2248;)Ljava/util/Set;", "registry", "Lnet/minecraft/class_2378;", "getRegistry", "()Lnet/minecraft/class_2378;", "resourceKey", "Lnet/minecraft/class_5321;", "getResourceKey", "()Lnet/minecraft/class_5321;", "COBBLE_MERCHANT_KEY", "COBBLE_MERCHANT", "Lnet/minecraft/class_4158;", "common"})
/*    */ public final class CobbleDollarsPoiTypes extends PlatformRegistry<class_2378<class_4158>, class_5321<class_2378<class_4158>>, class_4158> {
/*    */   @NotNull
/* 16 */   public static final CobbleDollarsPoiTypes INSTANCE = new CobbleDollarsPoiTypes();
/*    */   
/*    */   @NotNull
/* 16 */   private static final class_2378<class_4158> registry = class_7923.field_41128;
/*    */   
/*    */   @NotNull
/*    */   public class_2378<class_4158> getRegistry() {
/* 16 */     return registry;
/*    */   }
/*    */   
/*    */   static {
/* 16 */     Intrinsics.checkNotNullExpressionValue(class_7923.field_41128, "POINT_OF_INTEREST_TYPE");
/*    */   }
/*    */   
/*    */   @NotNull
/* 17 */   private static final class_5321<class_2378<class_4158>> resourceKey = class_7924.field_41212;
/*    */   
/*    */   @NotNull
/*    */   public class_5321<class_2378<class_4158>> getResourceKey() {
/* 17 */     return resourceKey;
/*    */   }
/*    */   
/*    */   static {
/* 17 */     Intrinsics.checkNotNullExpressionValue(class_7924.field_41212, "POINT_OF_INTEREST_TYPE");
/*    */   }
/*    */   
/*    */   @JvmField
/*    */   @NotNull
/* 20 */   public static final class_5321<class_4158> COBBLE_MERCHANT_KEY = INSTANCE.createKey("cobble_merchant");
/*    */   
/*    */   @JvmField
/*    */   @NotNull
/* 23 */   public static final class_4158 COBBLE_MERCHANT = (class_4158)INSTANCE.create(COBBLE_MERCHANT_KEY.method_29177(), new class_4158(INSTANCE.getBlockStates((class_2248)CobblemonBlocks.DISPLAY_CASE), 1, 1));
/*    */   
/*    */   static {
/* 23 */     Intrinsics.checkNotNullExpressionValue(COBBLE_MERCHANT_KEY.method_29177(), "location(...)");
/*    */   }
/*    */   
/*    */   private final class_5321<class_4158> createKey(String string) {
/* 25 */     Intrinsics.checkNotNullExpressionValue(class_5321.method_29179(
/* 26 */           class_7924.field_41212, 
/* 27 */           MiscUtilsKt.cobbleDollarsResource(string)), "create(...)");
/* 27 */     return class_5321.method_29179(class_7924.field_41212, MiscUtilsKt.cobbleDollarsResource(string));
/*    */   }
/*    */   
/*    */   private final Set<class_2680> getBlockStates(class_2248 block) {
/* 30 */     Intrinsics.checkNotNullExpressionValue(ImmutableSet.copyOf((Collection)block.method_9595().method_11662()), "copyOf(...)");
/* 30 */     return (Set<class_2680>)ImmutableSet.copyOf((Collection)block.method_9595().method_11662());
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\world\entity\villager\CobbleDollarsPoiTypes.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */