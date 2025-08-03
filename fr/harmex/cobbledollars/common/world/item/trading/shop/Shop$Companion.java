/*    */ package fr.harmex.cobbledollars.common.world.item.trading.shop;
/*    */ 
/*    */ import fr.harmex.cobbledollars.common.utils.extensions.CompoundTagExtensionKt;
/*    */ import java.math.BigInteger;
/*    */ import java.util.ArrayList;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.optionals.OptionalsKt;
/*    */ import net.minecraft.class_1799;
/*    */ import net.minecraft.class_2487;
/*    */ import net.minecraft.class_2499;
/*    */ import net.minecraft.class_2520;
/*    */ import net.minecraft.class_5455;
/*    */ import net.minecraft.class_7225;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\035\020\t\032\0020\b2\006\020\005\032\0020\0042\006\020\007\032\0020\006¢\006\004\b\t\020\n¨\006\013"}, d2 = {"Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop$Companion;", "", "<init>", "()V", "Lnet/minecraft/class_5455;", "registryAccess", "Lnet/minecraft/class_2499;", "listTag", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "read", "(Lnet/minecraft/class_5455;Lnet/minecraft/class_2499;)Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "common"})
/*    */ public final class Companion {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final Shop read(@NotNull class_5455 registryAccess, @NotNull class_2499 listTag) {
/* 16 */     Intrinsics.checkNotNullParameter(registryAccess, "registryAccess");
/* 16 */     Intrinsics.checkNotNullParameter(listTag, "listTag");
/* 16 */     Shop shop = new Shop();
/* 17 */     Intrinsics.checkNotNullExpressionValue(listTag.iterator(), "iterator(...)");
/* 17 */     for (class_2520 categoryCompound : listTag) {
/* 18 */       ArrayList<Offer> offerList = new ArrayList();
/* 19 */       Intrinsics.checkNotNull(categoryCompound, "null cannot be cast to non-null type net.minecraft.nbt.CompoundTag");
/* 19 */       Intrinsics.checkNotNullExpressionValue(((class_2487)categoryCompound).method_10554("Offers", 10).iterator(), "iterator(...)");
/* 19 */       for (class_2520 offerTag : ((class_2487)categoryCompound).method_10554("Offers", 10)) {
/* 20 */         Intrinsics.checkNotNull(offerTag, "null cannot be cast to non-null type net.minecraft.nbt.CompoundTag");
/* 20 */         class_2487 offerCompound = (class_2487)offerTag;
/* 21 */         Intrinsics.checkNotNullExpressionValue(class_1799.method_57360((class_7225.class_7874)registryAccess, (class_2520)offerCompound.method_10562("Item")), "parse(...)");
/* 21 */         class_1799 offerItem = (class_1799)OptionalsKt.getOrDefault(class_1799.method_57360((class_7225.class_7874)registryAccess, (class_2520)offerCompound.method_10562("Item")), class_1799.field_8037);
/* 22 */         if (!offerItem.method_7960()) {
/* 23 */           BigInteger offerPrice = CompoundTagExtensionKt.getBigInt(offerCompound, "Price");
/* 24 */           int offerStock = offerCompound.method_10545("Stock") ? 
/* 25 */             offerCompound.method_10550("Stock") : 
/* 26 */             -1;
/* 27 */           Intrinsics.checkNotNull(offerItem);
/* 27 */           offerList.add(new Offer(offerItem, offerPrice, offerStock));
/*    */         } 
/*    */       } 
/* 30 */       Intrinsics.checkNotNullExpressionValue(((class_2487)categoryCompound).method_10558("Category"), "getString(...)");
/* 30 */       Category category = new Category(((class_2487)categoryCompound).method_10558("Category"), offerList);
/* 31 */       shop.add(category);
/*    */     } 
/* 33 */     return shop;
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\world\item\trading\shop\Shop$Companion.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */