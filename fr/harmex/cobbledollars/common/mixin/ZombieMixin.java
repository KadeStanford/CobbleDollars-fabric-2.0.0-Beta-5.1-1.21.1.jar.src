/*    */ package fr.harmex.cobbledollars.common.mixin;
/*    */ 
/*    */ import com.llamalad7.mixinextras.sugar.Local;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.CobbleDollarsShopHolder;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_1641;
/*    */ import net.minecraft.class_1642;
/*    */ import net.minecraft.class_1646;
/*    */ import net.minecraft.class_3218;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ @Mixin({class_1642.class})
/*    */ public class ZombieMixin {
/*    */   @Inject(method = {"killedEntity"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/world/entity/monster/ZombieVillager;setVillagerData(Lnet/minecraft/world/entity/npc/VillagerData;)V", shift = At.Shift.AFTER)})
/*    */   private void transferCobbleMerchantShop(class_3218 level, class_1309 entity, CallbackInfoReturnable<Boolean> cir, @Local class_1646 villager, @Local class_1641 zombieVillager) {
/* 20 */     ((CobbleDollarsShopHolder)zombieVillager).setShop(((CobbleDollarsShopHolder)villager).getShop());
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\mixin\ZombieMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */