/*    */ package fr.harmex.cobbledollars.fabric.client;
/*    */ 
/*    */ import fr.harmex.cobbledollars.common.client.CobbleDollarsClient;
/*    */ import fr.harmex.cobbledollars.common.client.CobbleDollarsClientImplementation;
/*    */ import fr.harmex.cobbledollars.common.world.inventory.CobbleDollarsMenus;
/*    */ import fr.harmex.cobbledollars.fabric.CobbleDollarsFabric;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.fabricmc.api.ClientModInitializer;
/*    */ import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
/*    */ import net.minecraft.class_1299;
/*    */ import net.minecraft.class_3929;
/*    */ import net.minecraft.class_5617;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\030\0002\0020\0012\0020\002B\007¢\006\004\b\003\020\004J\017\020\006\032\0020\005H\026¢\006\004\b\006\020\004J7\020\r\032\0020\005\"\b\b\000\020\b*\0020\0072\016\020\n\032\n\022\006\b\001\022\0028\0000\t2\f\020\f\032\b\022\004\022\0028\0000\013H\026¢\006\004\b\r\020\016¨\006\017"}, d2 = {"Lfr/harmex/cobbledollars/fabric/client/CobbleDollarsFabricClient;", "Lnet/fabricmc/api/ClientModInitializer;", "Lfr/harmex/cobbledollars/common/client/CobbleDollarsClientImplementation;", "<init>", "()V", "", "onInitializeClient", "Lnet/minecraft/class_1297;", "T", "Lnet/minecraft/class_1299;", "type", "Lnet/minecraft/class_5617;", "factory", "registerEntityRenderer", "(Lnet/minecraft/class_1299;Lnet/minecraft/class_5617;)V", "fabric"})
/*    */ public final class CobbleDollarsFabricClient implements ClientModInitializer, CobbleDollarsClientImplementation {
/*    */   public void onInitializeClient() {
/* 19 */     CobbleDollarsClient.INSTANCE.init(this);
/* 20 */     class_3929.method_17542(CobbleDollarsMenus.SHOP, fr.harmex.cobbledollars.common.client.gui.screen.ShopScreen::new);
/* 21 */     class_3929.method_17542(CobbleDollarsMenus.BANK, fr.harmex.cobbledollars.common.client.gui.screen.BankScreen::new);
/* 23 */     CobbleDollarsFabric.INSTANCE.getNetworkManager().registerClientHandlers();
/*    */   }
/*    */   
/*    */   public <T extends net.minecraft.class_1297> void registerEntityRenderer(@NotNull class_1299 type, @NotNull class_5617 factory) {
/* 27 */     Intrinsics.checkNotNullParameter(type, "type");
/* 27 */     Intrinsics.checkNotNullParameter(factory, "factory");
/* 27 */     EntityRendererRegistry.register(type, factory);
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\fabric\client\CobbleDollarsFabricClient.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */