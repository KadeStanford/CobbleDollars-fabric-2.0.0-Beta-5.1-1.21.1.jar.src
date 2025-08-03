/*   */ package fr.harmex.cobbledollars.fabric;
/*   */ 
/*   */ import kotlin.Metadata;
/*   */ import net.fabricmc.api.ModInitializer;
/*   */ 
/*   */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\017\020\005\032\0020\004H\026¢\006\004\b\005\020\003¨\006\006"}, d2 = {"Lfr/harmex/cobbledollars/fabric/FabricBootstrap;", "Lnet/fabricmc/api/ModInitializer;", "<init>", "()V", "", "onInitialize", "fabric"})
/*   */ public final class FabricBootstrap implements ModInitializer {
/*   */   public void onInitialize() {
/* 7 */     CobbleDollarsFabric.INSTANCE.init();
/*   */   }
/*   */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\fabric\FabricBootstrap.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */