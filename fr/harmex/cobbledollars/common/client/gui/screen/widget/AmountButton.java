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
/*    */ import net.minecraft.class_332;
/*    */ import net.minecraft.class_4185;
/*    */ import net.minecraft.class_437;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\020\b\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\007\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\006\030\000 \0312\0020\001:\001\031B'\022\006\020\003\032\0020\002\022\006\020\004\032\0020\002\022\006\020\006\032\0020\005\022\006\020\b\032\0020\007¢\006\004\b\t\020\nJ/\020\022\032\0020\0212\006\020\f\032\0020\0132\006\020\r\032\0020\0022\006\020\016\032\0020\0022\006\020\020\032\0020\017H\024¢\006\004\b\022\020\023J\027\020\026\032\0020\0212\006\020\025\032\0020\024H\026¢\006\004\b\026\020\027R\024\020\006\032\0020\0058\002X\004¢\006\006\n\004\b\006\020\030¨\006\032"}, d2 = {"Lfr/harmex/cobbledollars/common/client/gui/screen/widget/AmountButton;", "Lnet/minecraft/class_4185;", "", "x", "y", "", "up", "Lnet/minecraft/class_4185$class_4241;", "onPress", "<init>", "(IIZLnet/minecraft/class_4185$class_4241;)V", "Lnet/minecraft/class_332;", "guiGraphics", "mouseX", "mouseY", "", "partialTick", "", "renderWidget", "(Lnet/minecraft/class_332;IIF)V", "Lnet/minecraft/class_1144;", "handler", "playDownSound", "(Lnet/minecraft/class_1144;)V", "Z", "Companion", "common"})
/*    */ public final class AmountButton extends class_4185 {
/*    */   public AmountButton(int x, int y, boolean up, @NotNull class_4185.class_4241 onPress) {
/* 16 */     super(x, y, 5, 5, (class_2561)class_2561.method_43470("Amount Selection"), onPress, class_4185.field_40754);
/*    */     this.up = up;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\024\020\005\032\0020\0048\002XT¢\006\006\n\004\b\005\020\006R\024\020\007\032\0020\0048\002XT¢\006\006\n\004\b\007\020\006R\024\020\t\032\0020\b8\002X\004¢\006\006\n\004\b\t\020\nR\024\020\013\032\0020\b8\002X\004¢\006\006\n\004\b\013\020\n¨\006\f"}, d2 = {"Lfr/harmex/cobbledollars/common/client/gui/screen/widget/AmountButton$Companion;", "", "<init>", "()V", "", "WIDTH", "I", "HEIGHT", "Lnet/minecraft/class_2960;", "UP_LOCATION", "Lnet/minecraft/class_2960;", "DOWN_LOCATION", "common"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */   
/*    */   @NotNull
/* 20 */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   private final boolean up;
/*    */   
/*    */   private static final int WIDTH = 5;
/*    */   
/*    */   private static final int HEIGHT = 5;
/*    */   
/*    */   @NotNull
/* 20 */   private static final class_2960 UP_LOCATION = MiscUtilsKt.cobbleDollarsResource("textures/gui/shop/amount_arrow_up.png");
/*    */   
/*    */   @NotNull
/* 21 */   private static final class_2960 DOWN_LOCATION = MiscUtilsKt.cobbleDollarsResource("textures/gui/shop/amount_arrow_down.png");
/*    */   
/*    */   protected void method_48579(@NotNull class_332 guiGraphics, int mouseX, int mouseY, float partialTick) {
/* 25 */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/* 25 */     int height = class_437.method_25441() ? 5 : (class_437.method_25442() ? 4 : 3);
/* 26 */     float vOffset = this.up ? (
/* 27 */       this.field_22762 ? 5.0F : 0.0F) : (
/*    */       
/* 29 */       this.field_22762 ? (
/* 30 */       class_437.method_25441() ? 5.0F : (
/* 31 */       class_437.method_25442() ? 6.0F : 
/* 32 */       7.0F)) : (
/*    */       
/* 34 */       class_437.method_25441() ? 0.0F : (
/* 35 */       class_437.method_25442() ? 1.0F : 
/* 36 */       2.0F)));
/* 39 */     int downYOffset = !this.up ? (
/* 40 */       class_437.method_25441() ? 0 : (
/* 41 */       class_437.method_25442() ? 1 : 
/* 42 */       2)) : 
/* 43 */       0;
/* 45 */     guiGraphics.method_25290(
/* 46 */         this.up ? UP_LOCATION : DOWN_LOCATION, 
/* 47 */         method_46426(), 
/* 48 */         method_46427() + downYOffset, 
/* 49 */         0.0F, 
/* 50 */         vOffset, 
/* 51 */         5, 
/* 52 */         height, 
/* 53 */         5, 
/* 54 */         10);
/*    */   }
/*    */   
/*    */   public void method_25354(@NotNull class_1144 handler) {
/* 59 */     Intrinsics.checkNotNullParameter(handler, "handler");
/* 59 */     handler.method_4873((class_1113)class_1109.method_4758(CobblemonSounds.PC_CLICK, 1.0F));
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\client\gui\screen\widget\AmountButton.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */