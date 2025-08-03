/*    */ package fr.harmex.cobbledollars.common.world.inventory;
/*    */ 
/*    */ import com.cobblemon.mod.common.platform.PlatformRegistry;
/*    */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1661;
/*    */ import net.minecraft.class_2378;
/*    */ import net.minecraft.class_3917;
/*    */ import net.minecraft.class_5321;
/*    */ import net.minecraft.class_7701;
/*    */ import net.minecraft.class_7923;
/*    */ import net.minecraft.class_7924;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\bÆ\002\030\00022\022\016\022\f\022\b\022\006\022\002\b\0030\0030\002\022\024\022\022\022\016\022\f\022\b\022\006\022\002\b\0030\0030\0020\004\022\b\022\006\022\002\b\0030\0030\001B\t\b\002¢\006\004\b\005\020\006R$\020\007\032\f\022\b\022\006\022\002\b\0030\0030\0028\026X\004¢\006\f\n\004\b\007\020\b\032\004\b\t\020\nR*\020\013\032\022\022\016\022\f\022\b\022\006\022\002\b\0030\0030\0020\0048\026X\004¢\006\f\n\004\b\013\020\f\032\004\b\r\020\016R\"\020\021\032\020\022\f\022\n \020*\004\030\0010\0170\0170\0038\006X\004¢\006\006\n\004\b\021\020\022R\"\020\024\032\020\022\f\022\n \020*\004\030\0010\0230\0230\0038\006X\004¢\006\006\n\004\b\024\020\022¨\006\025"}, d2 = {"Lfr/harmex/cobbledollars/common/world/inventory/CobbleDollarsMenus;", "Lcom/cobblemon/mod/common/platform/PlatformRegistry;", "Lnet/minecraft/class_2378;", "Lnet/minecraft/class_3917;", "Lnet/minecraft/class_5321;", "<init>", "()V", "registry", "Lnet/minecraft/class_2378;", "getRegistry", "()Lnet/minecraft/class_2378;", "resourceKey", "Lnet/minecraft/class_5321;", "getResourceKey", "()Lnet/minecraft/class_5321;", "Lfr/harmex/cobbledollars/common/world/inventory/ShopMenu;", "kotlin.jvm.PlatformType", "SHOP", "Lnet/minecraft/class_3917;", "Lfr/harmex/cobbledollars/common/world/inventory/BankMenu;", "BANK", "common"})
/*    */ public final class CobbleDollarsMenus extends PlatformRegistry<class_2378<class_3917<?>>, class_5321<class_2378<class_3917<?>>>, class_3917<?>> {
/*    */   @NotNull
/* 13 */   public static final CobbleDollarsMenus INSTANCE = new CobbleDollarsMenus();
/*    */   
/*    */   @NotNull
/* 13 */   private static final class_2378<class_3917<?>> registry = class_7923.field_41187;
/*    */   
/*    */   @NotNull
/*    */   public class_2378<class_3917<?>> getRegistry() {
/* 13 */     return registry;
/*    */   }
/*    */   
/*    */   static {
/* 13 */     Intrinsics.checkNotNullExpressionValue(class_7923.field_41187, "MENU");
/*    */   }
/*    */   
/*    */   @NotNull
/* 14 */   private static final class_5321<class_2378<class_3917<?>>> resourceKey = class_7924.field_41207;
/*    */   
/*    */   @JvmField
/*    */   @NotNull
/*    */   public static final class_3917<ShopMenu> SHOP;
/*    */   
/*    */   @JvmField
/*    */   @NotNull
/*    */   public static final class_3917<BankMenu> BANK;
/*    */   
/*    */   @NotNull
/*    */   public class_5321<class_2378<class_3917<?>>> getResourceKey() {
/* 14 */     return resourceKey;
/*    */   }
/*    */   
/*    */   static {
/* 14 */     Intrinsics.checkNotNullExpressionValue(class_7924.field_41207, "MENU");
/*    */   }
/*    */   
/*    */   static {
/* 17 */     SHOP = (class_3917<ShopMenu>)INSTANCE.create(
/* 18 */         MiscUtilsKt.cobbleDollarsResource("shop_menu"), 
/* 19 */         new class_3917((p0, p1) -> new ShopMenu(p0, p1, null, null, 12, null), class_7701.field_40182));
/* 23 */     BANK = (class_3917<BankMenu>)INSTANCE.create(
/* 24 */         MiscUtilsKt.cobbleDollarsResource("bank_menu"), 
/* 25 */         new class_3917((p0, p1) -> new BankMenu(p0, p1, null, null, 12, null), class_7701.field_40182));
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\world\inventory\CobbleDollarsMenus.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */