/*    */ package fr.harmex.cobbledollars.common.client.gui.screen;
/*    */ 
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import fr.harmex.cobbledollars.common.client.CobbleDollarsClient;
/*    */ import fr.harmex.cobbledollars.common.client.utils.OverlayPosition;
/*    */ import java.util.Collection;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1921;
/*    */ import net.minecraft.class_2561;
/*    */ import net.minecraft.class_332;
/*    */ import net.minecraft.class_437;
/*    */ import net.minecraft.class_5676;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\020\006\n\002\b\002\n\002\020\b\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\020\007\n\002\b\n\n\002\030\002\n\002\030\002\n\002\b\006\030\0002\0020\001B\017\022\006\020\002\032\0020\001¢\006\004\b\003\020\004J\017\020\006\032\0020\005H\024¢\006\004\b\006\020\007J'\020\016\032\0020\r2\006\020\t\032\0020\b2\006\020\n\032\0020\b2\006\020\f\032\0020\013H\026¢\006\004\b\016\020\017J/\020\024\032\0020\0052\006\020\021\032\0020\0202\006\020\t\032\0020\0132\006\020\n\032\0020\0132\006\020\023\032\0020\022H\026¢\006\004\b\024\020\025J\027\020\026\032\0020\0052\006\020\021\032\0020\020H\002¢\006\004\b\026\020\027J\027\020\030\032\0020\0052\006\020\021\032\0020\020H\002¢\006\004\b\030\020\027J\017\020\031\032\0020\005H\026¢\006\004\b\031\020\007J\017\020\032\032\0020\rH\026¢\006\004\b\032\020\033R\024\020\002\032\0020\0018\002X\004¢\006\006\n\004\b\002\020\034R\034\020\037\032\b\022\004\022\0020\0360\0358\002@\002X.¢\006\006\n\004\b\037\020 R\026\020!\032\0020\0138\002@\002X\016¢\006\006\n\004\b!\020\"R\026\020#\032\0020\0138\002@\002X\016¢\006\006\n\004\b#\020\"¨\006$"}, d2 = {"Lfr/harmex/cobbledollars/common/client/gui/screen/ClientConfigScreen;", "Lnet/minecraft/class_437;", "parent", "<init>", "(Lnet/minecraft/class_437;)V", "", "init", "()V", "", "mouseX", "mouseY", "", "button", "", "mouseClicked", "(DDI)Z", "Lnet/minecraft/class_332;", "guiGraphics", "", "partialTick", "render", "(Lnet/minecraft/class_332;IIF)V", "renderListBackground", "(Lnet/minecraft/class_332;)V", "renderListSeparators", "onClose", "isPauseScreen", "()Z", "Lnet/minecraft/class_437;", "Lnet/minecraft/class_5676;", "Lfr/harmex/cobbledollars/common/client/utils/OverlayPosition;", "overlayPositionButton", "Lnet/minecraft/class_5676;", "centerX", "I", "centerY", "common"})
/*    */ public final class ClientConfigScreen extends class_437 {
/*    */   @NotNull
/*    */   private final class_437 parent;
/*    */   
/*    */   private class_5676<OverlayPosition> overlayPositionButton;
/*    */   
/*    */   private int centerX;
/*    */   
/*    */   private int centerY;
/*    */   
/*    */   public ClientConfigScreen(@NotNull class_437 parent) {
/* 12 */     super((class_2561)class_2561.method_43470("CobbleDollars Client Config"));
/* 12 */     this.parent = parent;
/*    */   }
/*    */   
/*    */   protected void method_25426() {
/* 18 */     this.centerX = this.field_22789 / 2;
/* 19 */     this.centerY = this.field_22790 / 2;
/* 21 */     this.overlayPositionButton = class_5676.method_32606(OverlayPosition::getDisplayName)
/* 22 */       .method_32620((Collection)OverlayPosition.getEntries())
/* 23 */       .method_32619(CobbleDollarsClient.INSTANCE.getConfig().getOverlayPosition())
/* 24 */       .method_32617(this.centerX - 100, this.centerY - 10, 200, 20, (class_2561)class_2561.method_43470("Overlay Position"), ClientConfigScreen::init$lambda$0);
/*    */   }
/*    */   
/*    */   private static final void init$lambda$0(class_5676 button, OverlayPosition overlayPosition) {
/* 24 */     CobbleDollarsClient.INSTANCE.getConfig().setOverlayPosition(overlayPosition);
/*    */   }
/*    */   
/*    */   public boolean method_25402(double mouseX, double mouseY, int button) {
/* 28 */     if (this.overlayPositionButton == null)
/* 28 */       Intrinsics.throwUninitializedPropertyAccessException("overlayPositionButton"); 
/* 28 */     if (!null.method_25402(mouseX, mouseY, button)) {
/* 28 */       if (this.overlayPositionButton == null)
/* 28 */         Intrinsics.throwUninitializedPropertyAccessException("overlayPositionButton"); 
/* 28 */       null.method_25365(false);
/*    */     } 
/* 29 */     return super.method_25402(mouseX, mouseY, button);
/*    */   }
/*    */   
/*    */   public void method_25394(@NotNull class_332 guiGraphics, int mouseX, int mouseY, float partialTick) {
/* 33 */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/* 33 */     super.method_25394(guiGraphics, mouseX, mouseY, partialTick);
/* 34 */     renderListBackground(guiGraphics);
/* 35 */     renderListSeparators(guiGraphics);
/* 37 */     if (this.overlayPositionButton == null)
/* 37 */       Intrinsics.throwUninitializedPropertyAccessException("overlayPositionButton"); 
/* 37 */     null.method_25394(guiGraphics, mouseX, mouseY, partialTick);
/* 39 */     guiGraphics.method_27534(this.field_22793, this.field_22785, this.field_22789 / 2, 15, 16777215);
/*    */   }
/*    */   
/*    */   private final void renderListBackground(class_332 guiGraphics) {
/* 44 */     RenderSystem.enableBlend();
/* 45 */     guiGraphics.method_51739(
/* 46 */         class_1921.method_51784(), 
/* 47 */         0, 
/* 48 */         39, 
/* 49 */         this.field_22789, 
/* 50 */         this.field_22790 - 38, 
/* 51 */         1879048192);
/* 53 */     RenderSystem.disableBlend();
/*    */   }
/*    */   
/*    */   private final void renderListSeparators(class_332 guiGraphics) {
/* 57 */     RenderSystem.enableBlend();
/* 58 */     guiGraphics.method_25292(0, this.field_22789, 37, 872415231);
/* 59 */     guiGraphics.method_25292(0, this.field_22789, 38, -1090519040);
/* 61 */     guiGraphics.method_25292(0, this.field_22789, this.field_22790 - 38, -1090519040);
/* 62 */     guiGraphics.method_25292(0, this.field_22789, this.field_22790 - 37, 872415231);
/* 63 */     RenderSystem.disableBlend();
/*    */   }
/*    */   
/*    */   public void method_25419() {
/* 67 */     CobbleDollarsClient.INSTANCE.saveConfig();
/* 68 */     Intrinsics.checkNotNull(this.field_22787);
/* 68 */     this.field_22787.method_1507(this.parent);
/*    */   }
/*    */   
/*    */   public boolean method_25421() {
/* 72 */     return true;
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\client\gui\screen\ClientConfigScreen.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */