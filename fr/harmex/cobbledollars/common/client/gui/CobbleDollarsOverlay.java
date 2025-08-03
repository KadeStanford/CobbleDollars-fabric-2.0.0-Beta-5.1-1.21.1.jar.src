/*    */ package fr.harmex.cobbledollars.common.client.gui;
/*    */ 
/*    */ import fr.harmex.cobbledollars.common.client.CobbleDollarsClient;
/*    */ import fr.harmex.cobbledollars.common.client.gui.screen.ClientConfigScreen;
/*    */ import fr.harmex.cobbledollars.common.client.utils.Context;
/*    */ import fr.harmex.cobbledollars.common.client.utils.GuiUtilsKt;
/*    */ import fr.harmex.cobbledollars.common.client.utils.OverlayPosition;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.NoWhenBranchMatchedException;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_310;
/*    */ import net.minecraft.class_329;
/*    */ import net.minecraft.class_332;
/*    */ import net.minecraft.class_408;
/*    */ import net.minecraft.class_437;
/*    */ import net.minecraft.class_481;
/*    */ import net.minecraft.class_490;
/*    */ import net.minecraft.class_9779;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\002\020\003J\037\020\t\032\0020\b2\006\020\005\032\0020\0042\006\020\007\032\0020\006H\026¢\006\004\b\t\020\nR\"\020\016\032\020\022\f\022\n\022\006\b\001\022\0020\r0\f0\0138\002X\004¢\006\006\n\004\b\016\020\017¨\006\020"}, d2 = {"Lfr/harmex/cobbledollars/common/client/gui/CobbleDollarsOverlay;", "Lnet/minecraft/class_329;", "<init>", "()V", "Lnet/minecraft/class_332;", "guiGraphics", "Lnet/minecraft/class_9779;", "deltaTracker", "", "render", "(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V", "", "Ljava/lang/Class;", "Lnet/minecraft/class_437;", "screenException", "Ljava/util/List;", "common"})
/*    */ public final class CobbleDollarsOverlay extends class_329 {
/*    */   @NotNull
/*    */   private final List<Class<? extends class_437>> screenException;
/*    */   
/*    */   public CobbleDollarsOverlay() {
/* 15 */     super(class_310.method_1551());
/* 17 */     Class[] arrayOfClass = new Class[4];
/* 17 */     arrayOfClass[0] = class_408.class;
/* 17 */     arrayOfClass[1] = 
/* 18 */       class_490.class;
/* 19 */     arrayOfClass[2] = class_481.class;
/* 20 */     arrayOfClass[3] = ClientConfigScreen.class;
/*    */     this.screenException = CollectionsKt.listOf((Object[])arrayOfClass);
/*    */   }
/*    */   
/*    */   public void method_1753(@NotNull class_332 guiGraphics, @NotNull class_9779 deltaTracker) {
/* 24 */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/* 24 */     Intrinsics.checkNotNullParameter(deltaTracker, "deltaTracker");
/* 24 */     class_310 minecraft = class_310.method_1551();
/* 27 */     if (minecraft.field_1755 != null) {
/* 29 */       Intrinsics.checkNotNull(minecraft.field_1755);
/* 29 */       Intrinsics.checkNotNull(minecraft.field_1755.getClass(), "null cannot be cast to non-null type java.lang.Class<out net.minecraft.client.gui.screens.Screen>");
/* 29 */       if (!this.screenException.contains(minecraft.field_1755.getClass()))
/*    */         return; 
/*    */     } 
/* 34 */     if (minecraft.method_53526().method_53536())
/*    */       return; 
/* 38 */     int x = guiGraphics.method_51421() - 4 - 54;
/* 39 */     int y = guiGraphics.method_51443() - 4 - 14;
/* 40 */     boolean animationUp = true;
/* 41 */     switch (WhenMappings.$EnumSwitchMapping$0[CobbleDollarsClient.INSTANCE.getConfig().getOverlayPosition().ordinal()]) {
/*    */       case 1:
/* 43 */         x = 4;
/* 44 */         y = 4;
/* 45 */         animationUp = false;
/*    */         break;
/*    */       case 2:
/* 48 */         x = guiGraphics.method_51421() - 4 - 54;
/* 49 */         y = 4;
/* 50 */         animationUp = false;
/*    */         break;
/*    */       case 3:
/* 53 */         x = 4;
/* 54 */         y = guiGraphics.method_51443() - 4 - 14;
/* 55 */         animationUp = true;
/*    */         break;
/*    */       case 4:
/* 58 */         x = guiGraphics.method_51421() - 4 - 54;
/* 59 */         y = guiGraphics.method_51443() - 4 - 14;
/* 60 */         animationUp = true;
/*    */         break;
/*    */       case 5:
/*    */         return;
/*    */       default:
/*    */         throw new NoWhenBranchMatchedException();
/*    */     } 
/* 65 */     GuiUtilsKt.renderCobbleDollarsElement$default(guiGraphics, 
/* 66 */         x, 
/* 67 */         y, false, null, 
/* 68 */         animationUp, 
/* 69 */         Context.PLAYER, null, 76, null);
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\client\gui\CobbleDollarsOverlay.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */