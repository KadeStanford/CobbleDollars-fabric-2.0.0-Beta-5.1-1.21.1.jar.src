/*    */ package fr.harmex.cobbledollars.common.world.item;
/*    */ 
/*    */ import com.cobblemon.mod.common.platform.PlatformRegistry;
/*    */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*    */ import fr.harmex.cobbledollars.common.world.entity.CobbleDollarsEntities;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1792;
/*    */ import net.minecraft.class_1826;
/*    */ import net.minecraft.class_2378;
/*    */ import net.minecraft.class_5321;
/*    */ import net.minecraft.class_7923;
/*    */ import net.minecraft.class_7924;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\003\bÆ\002\030\0002&\022\n\022\b\022\004\022\0020\0030\002\022\020\022\016\022\n\022\b\022\004\022\0020\0030\0020\004\022\004\022\0020\0030\001B\t\b\002¢\006\004\b\005\020\006R \020\007\032\b\022\004\022\0020\0030\0028\026X\004¢\006\f\n\004\b\007\020\b\032\004\b\t\020\nR&\020\013\032\016\022\n\022\b\022\004\022\0020\0030\0020\0048\026X\004¢\006\f\n\004\b\013\020\f\032\004\b\r\020\016R\024\020\020\032\0020\0178\006X\004¢\006\006\n\004\b\020\020\021¨\006\022"}, d2 = {"Lfr/harmex/cobbledollars/common/world/item/CobbleDollarsItems;", "Lcom/cobblemon/mod/common/platform/PlatformRegistry;", "Lnet/minecraft/class_2378;", "Lnet/minecraft/class_1792;", "Lnet/minecraft/class_5321;", "<init>", "()V", "registry", "Lnet/minecraft/class_2378;", "getRegistry", "()Lnet/minecraft/class_2378;", "resourceKey", "Lnet/minecraft/class_5321;", "getResourceKey", "()Lnet/minecraft/class_5321;", "Lnet/minecraft/class_1826;", "COBBLE_MERCHANT_SPAWN_EGG", "Lnet/minecraft/class_1826;", "common"})
/*    */ public final class CobbleDollarsItems extends PlatformRegistry<class_2378<class_1792>, class_5321<class_2378<class_1792>>, class_1792> {
/*    */   @NotNull
/* 14 */   public static final CobbleDollarsItems INSTANCE = new CobbleDollarsItems();
/*    */   
/*    */   @NotNull
/* 14 */   private static final class_2378<class_1792> registry = (class_2378<class_1792>)class_7923.field_41178;
/*    */   
/*    */   @NotNull
/*    */   public class_2378<class_1792> getRegistry() {
/* 14 */     return registry;
/*    */   }
/*    */   
/*    */   static {
/* 14 */     Intrinsics.checkNotNullExpressionValue(class_7923.field_41178, "ITEM");
/*    */   }
/*    */   
/*    */   @NotNull
/* 15 */   private static final class_5321<class_2378<class_1792>> resourceKey = class_7924.field_41197;
/*    */   
/*    */   @NotNull
/*    */   public class_5321<class_2378<class_1792>> getResourceKey() {
/* 15 */     return resourceKey;
/*    */   }
/*    */   
/*    */   static {
/* 15 */     Intrinsics.checkNotNullExpressionValue(class_7924.field_41197, "ITEM");
/*    */   }
/*    */   
/*    */   @JvmField
/*    */   @NotNull
/* 18 */   public static final class_1826 COBBLE_MERCHANT_SPAWN_EGG = (class_1826)INSTANCE.create(MiscUtilsKt.cobbleDollarsResource("cobble_merchant_spawn_egg"), new class_1826(
/* 19 */         CobbleDollarsEntities.COBBLE_MERCHANT, 
/* 20 */         14737632, 10887447, 
/* 21 */         new class_1792.class_1793()));
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\world\item\CobbleDollarsItems.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */