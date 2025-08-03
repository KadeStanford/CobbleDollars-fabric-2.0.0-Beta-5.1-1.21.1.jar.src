/*    */ package fr.harmex.cobbledollars.common.world.item.trading.shop;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import net.minecraft.class_1799;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\027\020\007\032\0020\0062\b\020\005\032\004\030\0010\004¢\006\004\b\007\020\b¨\006\t"}, d2 = {"Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer$Companion;", "", "<init>", "()V", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;", "offer", "", "hashItemAndPrice", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;)I", "common"})
/*    */ public final class Companion {
/*    */   private Companion() {}
/*    */   
/*    */   public final int hashItemAndPrice(@Nullable Offer offer) {
/* 29 */     if (offer == null)
/* 29 */       return 0; 
/* 30 */     int hash = 31 + class_1799.method_57355(offer.getItem());
/* 31 */     hash = 31 * hash + offer.getPrice().hashCode();
/* 32 */     return hash;
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\world\item\trading\shop\Offer$Companion.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */