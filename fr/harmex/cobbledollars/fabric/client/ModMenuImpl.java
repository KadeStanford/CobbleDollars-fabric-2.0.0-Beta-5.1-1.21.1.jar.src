/*   */ package fr.harmex.cobbledollars.fabric.client;
/*   */ 
/*   */ import com.terraformersmc.modmenu.api.ConfigScreenFactory;
/*   */ import com.terraformersmc.modmenu.api.ModMenuApi;
/*   */ import kotlin.Metadata;
/*   */ import org.jetbrains.annotations.Nullable;
/*   */ 
/*   */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\002\020\003J\025\020\005\032\b\022\002\b\003\030\0010\004H\026¢\006\004\b\005\020\006¨\006\007"}, d2 = {"Lfr/harmex/cobbledollars/fabric/client/ModMenuImpl;", "Lcom/terraformersmc/modmenu/api/ModMenuApi;", "<init>", "()V", "Lcom/terraformersmc/modmenu/api/ConfigScreenFactory;", "getModConfigScreenFactory", "()Lcom/terraformersmc/modmenu/api/ConfigScreenFactory;", "fabric"})
/*   */ public final class ModMenuImpl implements ModMenuApi {
/*   */   @Nullable
/*   */   public ConfigScreenFactory<?> getModConfigScreenFactory() {
/* 9 */     return fr.harmex.cobbledollars.common.client.gui.screen.ClientConfigScreen::new;
/*   */   }
/*   */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\fabric\client\ModMenuImpl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */