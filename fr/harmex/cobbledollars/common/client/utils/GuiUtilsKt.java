/*    */ package fr.harmex.cobbledollars.common.client.utils;
/*    */ 
/*    */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*    */ import fr.harmex.cobbledollars.common.utils.extensions.BigIntegerExtensionsKt;
/*    */ import fr.harmex.cobbledollars.common.utils.extensions.PlayerExtensionKt;
/*    */ import java.math.BigInteger;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_2960;
/*    */ import net.minecraft.class_310;
/*    */ import net.minecraft.class_332;
/*    */ import net.minecraft.class_5250;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\0002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\020\b\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\r\032\r\020\001\032\0020\000¢\006\004\b\001\020\002\032U\020\017\032\0020\000*\0020\0032\006\020\005\032\0020\0042\006\020\006\032\0020\0042\b\b\002\020\b\032\0020\0072\b\b\002\020\n\032\0020\t2\b\b\002\020\013\032\0020\0072\b\b\002\020\r\032\0020\f2\n\b\002\020\016\032\004\030\0010\004¢\006\004\b\017\020\020\0327\020\024\032\0020\0002\006\020\021\032\0020\0032\006\020\022\032\0020\t2\006\020\005\032\0020\0042\006\020\006\032\0020\0042\006\020\023\032\0020\007H\002¢\006\004\b\024\020\025\"\027\020\027\032\0020\0268\006¢\006\f\n\004\b\027\020\030\032\004\b\031\020\032\"\024\020\033\032\0020\0268\002X\004¢\006\006\n\004\b\033\020\030\"\024\020\034\032\0020\0048\006XT¢\006\006\n\004\b\034\020\035\"\024\020\036\032\0020\0048\006XT¢\006\006\n\004\b\036\020\035\"\026\020\001\032\0020\0048\002@\002X\016¢\006\006\n\004\b\001\020\035\"\036\020 \032\n \037*\004\030\0010\t0\t8\002@\002X\016¢\006\006\n\004\b \020!\"\036\020\"\032\n \037*\004\030\0010\t0\t8\002@\002X\016¢\006\006\n\004\b\"\020!¨\006#"}, d2 = {"", "tick", "()V", "Lnet/minecraft/class_332;", "", "x", "y", "", "drawAmount", "Ljava/math/BigInteger;", "amount", "animationUp", "Lfr/harmex/cobbledollars/common/client/utils/Context;", "context", "color", "renderCobbleDollarsElement", "(Lnet/minecraft/class_332;IIZLjava/math/BigInteger;ZLfr/harmex/cobbledollars/common/client/utils/Context;Ljava/lang/Integer;)V", "guiGraphics", "playerCobbleDollars", "up", "renderAnimation", "(Lnet/minecraft/class_332;Ljava/math/BigInteger;IIZ)V", "Lnet/minecraft/class_2960;", "CROSS_LOCATION", "Lnet/minecraft/class_2960;", "getCROSS_LOCATION", "()Lnet/minecraft/class_2960;", "textureLocation", "TEXTURE_WIDTH", "I", "TEXTURE_HEIGHT", "kotlin.jvm.PlatformType", "lastAmount", "Ljava/math/BigInteger;", "lastAmountDifference", "common"})
/*    */ public final class GuiUtilsKt {
/*    */   @NotNull
/* 16 */   private static final class_2960 CROSS_LOCATION = MiscUtilsKt.cobbleDollarsResource("textures/gui/cross.png");
/*    */   
/*    */   @NotNull
/*    */   public static final class_2960 getCROSS_LOCATION() {
/* 16 */     return CROSS_LOCATION;
/*    */   }
/*    */   
/*    */   @NotNull
/* 18 */   private static final class_2960 textureLocation = MiscUtilsKt.cobbleDollarsResource("textures/gui/cobbledollars_background.png");
/*    */   
/*    */   public static final int TEXTURE_WIDTH = 54;
/*    */   
/*    */   public static final int TEXTURE_HEIGHT = 14;
/*    */   
/*    */   private static int tick;
/*    */   
/* 22 */   private static BigInteger lastAmount = BigInteger.ZERO;
/*    */   
/* 23 */   private static BigInteger lastAmountDifference = BigInteger.ZERO;
/*    */   
/*    */   public static final void tick() {
/* 26 */     int i = tick;
/* 26 */     tick = i + 1;
/*    */   }
/*    */   
/*    */   public static final void renderCobbleDollarsElement(@NotNull class_332 $this$renderCobbleDollarsElement, int x, int y, boolean drawAmount, @NotNull BigInteger amount, boolean animationUp, @NotNull Context context, @Nullable Integer color) {
/* 38 */     Intrinsics.checkNotNullParameter($this$renderCobbleDollarsElement, "<this>");
/* 38 */     Intrinsics.checkNotNullParameter(amount, "amount");
/* 38 */     Intrinsics.checkNotNullParameter(context, "context");
/* 38 */     Intrinsics.checkNotNull((class_310.method_1551()).field_1724);
/* 38 */     BigInteger playerCobbleDollars = PlayerExtensionKt.getCobbleDollars((class_1657)(class_310.method_1551()).field_1724);
/* 39 */     class_5250 displayText = (context == Context.PLAYER) ? BigIntegerExtensionsKt.format(playerCobbleDollars, false) : BigIntegerExtensionsKt.format(amount, false);
/* 40 */     int textColor = (color != null) ? color.intValue() : ((context == Context.BANK) ? 2140704 : ((context == Context.SHOP && playerCobbleDollars.compareTo(amount) < 0) ? 11149344 : 16777215));
/* 42 */     if (context == Context.PLAYER)
/* 43 */       renderAnimation($this$renderCobbleDollarsElement, playerCobbleDollars, x, y, animationUp); 
/* 47 */     Intrinsics.checkNotNullExpressionValue($this$renderCobbleDollarsElement.method_51448(), "pose(...)");
/* 47 */     com.cobblemon.mod.common.api.gui.GuiUtilsKt.blitk$default($this$renderCobbleDollarsElement.method_51448(), 
/* 48 */         textureLocation, 
/* 49 */         Integer.valueOf(x), 
/* 50 */         Integer.valueOf(y), 
/* 51 */         Integer.valueOf(14), 
/* 52 */         Integer.valueOf(54), null, null, null, null, null, null, null, null, null, false, 0.0F, 131008, null);
/* 55 */     if (drawAmount)
/* 56 */       com.cobblemon.mod.common.api.gui.GuiUtilsKt.drawTextJustifiedRight$default(
/* 57 */           $this$renderCobbleDollarsElement, null, 
/* 58 */           displayText, 
/* 59 */           Integer.valueOf(x + 29), 
/* 60 */           Integer.valueOf(y + 3), 
/* 61 */           textColor, false, 66, null); 
/*    */   }
/*    */   
/*    */   private static final void renderAnimation(class_332 guiGraphics, BigInteger playerCobbleDollars, int x, int y, boolean up) {
/* 67 */     if (!Intrinsics.areEqual(lastAmount, playerCobbleDollars)) {
/* 68 */       BigInteger bigInteger1 = playerCobbleDollars;
/* 68 */       Intrinsics.checkNotNullExpressionValue(lastAmount, "lastAmount");
/* 68 */       Intrinsics.checkNotNullExpressionValue(bigInteger1.subtract(lastAmount), "subtract(...)");
/* 68 */       BigInteger amountDifference = bigInteger1.subtract(lastAmount);
/* 69 */       if (!Intrinsics.areEqual(lastAmountDifference, amountDifference))
/* 70 */         tick = 0; 
/* 72 */       lastAmountDifference = amountDifference;
/* 73 */       class_5250 differenceText = BigIntegerExtensionsKt.format(amountDifference, false);
/* 74 */       if (amountDifference.compareTo(BigInteger.ZERO) >= 0)
/* 75 */         differenceText = MiscUtilsKt.prepend(differenceText, MiscUtilsKt.toComponent("+")); 
/* 77 */       int animationColor = (amountDifference.compareTo(BigInteger.ZERO) < 0) ? 11149344 : 2140704;
/* 78 */       if (tick <= 30) {
/* 79 */         com.cobblemon.mod.common.api.gui.GuiUtilsKt.drawTextJustifiedRight$default(
/* 80 */             guiGraphics, null, 
/* 81 */             differenceText, 
/* 82 */             Integer.valueOf(x + 29), 
/* 83 */             Integer.valueOf(y + (up ? -9 : 15)), 
/* 84 */             animationColor, false, 66, null);
/*    */       } else {
/* 87 */         tick = 0;
/* 88 */         lastAmount = playerCobbleDollars;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\clien\\utils\GuiUtilsKt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */