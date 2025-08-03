/*    */ package fr.harmex.cobbledollars.common.mixin;
/*    */ 
/*    */ import fr.harmex.cobbledollars.common.world.entity.villager.CobbleDollarsProfessions;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_3851;
/*    */ import net.minecraft.class_3885;
/*    */ import net.minecraft.class_4587;
/*    */ import net.minecraft.class_4597;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({class_3885.class})
/*    */ public class VillagerProfessionLayerMixin<T extends class_1309 & class_3851> {
/*    */   @Inject(method = {"render(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;ILnet/minecraft/world/entity/LivingEntity;FFFFFF)V"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/layers/VillagerProfessionLayer;renderColoredCutoutModel(Lnet/minecraft/client/model/EntityModel;Lnet/minecraft/resources/ResourceLocation;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;ILnet/minecraft/world/entity/LivingEntity;I)V", ordinal = 1, shift = At.Shift.AFTER)}, cancellable = true)
/*    */   private void removeLevelLayer(class_4587 poseStack, class_4597 buffer, int packedLight, T livingEntity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, CallbackInfo ci) {
/* 20 */     if (((class_3851)livingEntity).method_7231().method_16924() == CobbleDollarsProfessions.COBBLE_MERCHANT)
/* 21 */       ci.cancel(); 
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\mixin\VillagerProfessionLayerMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */