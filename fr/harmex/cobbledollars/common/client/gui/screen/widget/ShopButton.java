/*    */ package fr.harmex.cobbledollars.common.client.gui.screen.widget;
/*    */ 
/*    */ import com.cobblemon.mod.common.CobblemonSounds;
/*    */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1109;
/*    */ import net.minecraft.class_1113;
/*    */ import net.minecraft.class_1144;
/*    */ import net.minecraft.class_2561;
/*    */ import net.minecraft.class_2960;
/*    */ import net.minecraft.class_310;
/*    */ import net.minecraft.class_332;
/*    */ import net.minecraft.class_4185;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\007\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\005\030\000 \0262\0020\001:\001\026B\037\022\006\020\003\032\0020\002\022\006\020\004\032\0020\002\022\006\020\006\032\0020\005¢\006\004\b\007\020\bJ/\020\020\032\0020\0172\006\020\n\032\0020\t2\006\020\013\032\0020\0022\006\020\f\032\0020\0022\006\020\016\032\0020\rH\024¢\006\004\b\020\020\021J\027\020\024\032\0020\0172\006\020\023\032\0020\022H\026¢\006\004\b\024\020\025¨\006\027"}, d2 = {"Lfr/harmex/cobbledollars/common/client/gui/screen/widget/ShopButton;", "Lnet/minecraft/class_4185;", "", "x", "y", "Lnet/minecraft/class_4185$class_4241;", "onPress", "<init>", "(IILnet/minecraft/class_4185$class_4241;)V", "Lnet/minecraft/class_332;", "guiGraphics", "mouseX", "mouseY", "", "partialTick", "", "renderWidget", "(Lnet/minecraft/class_332;IIF)V", "Lnet/minecraft/class_1144;", "handler", "playDownSound", "(Lnet/minecraft/class_1144;)V", "Companion", "common"})
/*    */ public final class ShopButton extends class_4185 {
/*    */   public ShopButton(int x, int y, @NotNull class_4185.class_4241 onPress) {
/* 15 */     super(x, y, 31, 14, (class_2561)class_2561.method_43470("Bank"), onPress, class_4185.field_40754);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\024\020\005\032\0020\0048\002XT¢\006\006\n\004\b\005\020\006R\024\020\007\032\0020\0048\002XT¢\006\006\n\004\b\007\020\006R\024\020\t\032\0020\b8\002X\004¢\006\006\n\004\b\t\020\n¨\006\013"}, d2 = {"Lfr/harmex/cobbledollars/common/client/gui/screen/widget/ShopButton$Companion;", "", "<init>", "()V", "", "WIDTH", "I", "HEIGHT", "Lnet/minecraft/class_2960;", "TEXTURE_LOCATION", "Lnet/minecraft/class_2960;", "common"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */   
/*    */   @NotNull
/* 19 */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   private static final int WIDTH = 31;
/*    */   
/*    */   private static final int HEIGHT = 14;
/*    */   
/*    */   @NotNull
/* 19 */   private static final class_2960 TEXTURE_LOCATION = MiscUtilsKt.cobbleDollarsResource("textures/gui/shop/bank_button.png");
/*    */   
/*    */   protected void method_48579(@NotNull class_332 guiGraphics, int mouseX, int mouseY, float partialTick) {
/* 23 */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/* 23 */     guiGraphics.method_25290(
/* 24 */         TEXTURE_LOCATION, 
/* 25 */         method_46426(), 
/* 26 */         method_46427(), 
/* 27 */         0.0F, 
/* 28 */         this.field_22762 ? 14.0F : 0.0F, 
/* 29 */         31, 
/* 30 */         14, 
/* 31 */         31, 
/* 32 */         42);
/* 34 */     guiGraphics.method_25300((class_310.method_1551()).field_1772, "Shop", method_46426() + 15, method_46427() + 3, 16777215);
/*    */   }
/*    */   
/*    */   public void method_25354(@NotNull class_1144 handler) {
/* 38 */     Intrinsics.checkNotNullParameter(handler, "handler");
/* 38 */     handler.method_4873((class_1113)class_1109.method_4758(CobblemonSounds.GUI_CLICK, 1.0F));
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\client\gui\screen\widget\ShopButton.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */