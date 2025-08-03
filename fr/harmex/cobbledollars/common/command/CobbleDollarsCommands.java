/*    */ package fr.harmex.cobbledollars.common.command;
/*    */ 
/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_2168;
/*    */ import net.minecraft.class_2170;
/*    */ import net.minecraft.class_7157;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\003\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J+\020\f\032\0020\0132\f\020\006\032\b\022\004\022\0020\0050\0042\006\020\b\032\0020\0072\006\020\n\032\0020\t¢\006\004\b\f\020\r¨\006\016"}, d2 = {"Lfr/harmex/cobbledollars/common/command/CobbleDollarsCommands;", "", "<init>", "()V", "Lcom/mojang/brigadier/CommandDispatcher;", "Lnet/minecraft/class_2168;", "dispatcher", "Lnet/minecraft/class_7157;", "buildContext", "Lnet/minecraft/class_2170$class_5364;", "commandSelection", "", "register", "(Lcom/mojang/brigadier/CommandDispatcher;Lnet/minecraft/class_7157;Lnet/minecraft/class_2170$class_5364;)V", "common"})
/*    */ public final class CobbleDollarsCommands {
/*    */   @NotNull
/*    */   public static final CobbleDollarsCommands INSTANCE = new CobbleDollarsCommands();
/*    */   
/*    */   public final void register(@NotNull CommandDispatcher<class_2168> dispatcher, @NotNull class_7157 buildContext, @NotNull class_2170.class_5364 commandSelection) {
/* 10 */     Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
/* 10 */     Intrinsics.checkNotNullParameter(buildContext, "buildContext");
/* 10 */     Intrinsics.checkNotNullParameter(commandSelection, "commandSelection");
/* 10 */     CobbleDollarsCommand.INSTANCE.register(dispatcher);
/* 11 */     CobbleMerchantCommand.INSTANCE.register(dispatcher, buildContext);
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\command\CobbleDollarsCommands.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */