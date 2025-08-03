/*    */ package fr.harmex.cobbledollars.common.client.gui.screen.widget;
/*    */ 
/*    */ import com.cobblemon.mod.common.CobblemonSounds;
/*    */ import fr.harmex.cobbledollars.common.client.gui.screen.ShopScreen;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\007\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\b\030\000 \0332\0020\001:\001\033B'\022\006\020\003\032\0020\002\022\006\020\004\032\0020\002\022\006\020\006\032\0020\005\022\006\020\b\032\0020\007¢\006\004\b\t\020\nJ/\020\022\032\0020\0212\006\020\f\032\0020\0132\006\020\r\032\0020\0022\006\020\016\032\0020\0022\006\020\020\032\0020\017H\024¢\006\004\b\022\020\023J\027\020\026\032\0020\0212\006\020\025\032\0020\024H\026¢\006\004\b\026\020\027R\027\020\006\032\0020\0058\006¢\006\f\n\004\b\006\020\030\032\004\b\031\020\032¨\006\034"}, d2 = {"Lfr/harmex/cobbledollars/common/client/gui/screen/widget/BuyButton;", "Lnet/minecraft/class_4185;", "", "x", "y", "Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;", "shopScreen", "Lnet/minecraft/class_4185$class_4241;", "onPress", "<init>", "(IILfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;Lnet/minecraft/class_4185$class_4241;)V", "Lnet/minecraft/class_332;", "guiGraphics", "mouseX", "mouseY", "", "partialTick", "", "renderWidget", "(Lnet/minecraft/class_332;IIF)V", "Lnet/minecraft/class_1144;", "handler", "playDownSound", "(Lnet/minecraft/class_1144;)V", "Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;", "getShopScreen", "()Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;", "Companion", "common"})
/*    */ public final class BuyButton extends class_4185 {
/*    */   @NotNull
/*    */   public final ShopScreen getShopScreen() {
/* 15 */     return this.shopScreen;
/*    */   }
/*    */   
/*    */   public BuyButton(int x, int y, @NotNull ShopScreen shopScreen, @NotNull class_4185.class_4241 onPress) {
/* 17 */     super(x, y, 31, 14, (class_2561)class_2561.method_43470("Sell"), onPress, class_4185.field_40754);
/*    */     this.shopScreen = shopScreen;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\024\020\005\032\0020\0048\006XT¢\006\006\n\004\b\005\020\006R\024\020\007\032\0020\0048\006XT¢\006\006\n\004\b\007\020\006R\027\020\t\032\0020\b8\006¢\006\f\n\004\b\t\020\n\032\004\b\013\020\f¨\006\r"}, d2 = {"Lfr/harmex/cobbledollars/common/client/gui/screen/widget/BuyButton$Companion;", "", "<init>", "()V", "", "WIDTH", "I", "HEIGHT", "Lnet/minecraft/class_2960;", "TEXTURE_LOCATION", "Lnet/minecraft/class_2960;", "getTEXTURE_LOCATION", "()Lnet/minecraft/class_2960;", "common"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final class_2960 getTEXTURE_LOCATION() {
/* 21 */       return BuyButton.TEXTURE_LOCATION;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/* 21 */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @NotNull
/*    */   private final ShopScreen shopScreen;
/*    */   
/*    */   public static final int WIDTH = 31;
/*    */   
/*    */   public static final int HEIGHT = 14;
/*    */   
/*    */   @NotNull
/* 21 */   private static final class_2960 TEXTURE_LOCATION = MiscUtilsKt.cobbleDollarsResource("textures/gui/shop/buy_button.png");
/*    */   
/*    */   protected void method_48579(@NotNull class_332 guiGraphics, int mouseX, int mouseY, float partialTick) {
/* 25 */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/* 25 */     guiGraphics.method_25290(
/* 26 */         TEXTURE_LOCATION, 
/* 27 */         method_46426(), 
/* 28 */         method_46427(), 
/* 29 */         0.0F, 
/* 30 */         !this.shopScreen.canBuy() ? 28.0F : (this.field_22762 ? 14.0F : 0.0F), 
/* 31 */         31, 
/* 32 */         14, 
/* 33 */         31, 
/* 34 */         42);
/* 36 */     guiGraphics.method_25300((class_310.method_1551()).field_1772, "Buy", method_46426() + 15, method_46427() + 3, 16777215);
/*    */   }
/*    */   
/*    */   public void method_25354(@NotNull class_1144 handler) {
/* 40 */     Intrinsics.checkNotNullParameter(handler, "handler");
/* 40 */     if (this.shopScreen.canBuy())
/* 41 */       handler.method_4873((class_1113)class_1109.method_4758(CobblemonSounds.PC_CLICK, 1.0F)); 
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\client\gui\screen\widget\BuyButton.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */