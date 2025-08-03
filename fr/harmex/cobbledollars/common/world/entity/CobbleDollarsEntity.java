package fr.harmex.cobbledollars.common.world.entity;

import fr.harmex.cobbledollars.common.world.item.trading.shop.Shop;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\003\bf\030\0002\0020\001J\021\020\003\032\004\030\0010\002H&¢\006\004\b\003\020\004J\031\020\007\032\0020\0062\b\020\005\032\004\030\0010\002H&¢\006\004\b\007\020\b¨\006\t"}, d2 = {"Lfr/harmex/cobbledollars/common/world/entity/CobbleDollarsEntity;", "", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "getShop", "()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "shop", "", "setShop", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;)V", "common"})
public interface CobbleDollarsEntity {
  @Nullable
  Shop getShop();
  
  void setShop(@Nullable Shop paramShop);
}


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\world\entity\CobbleDollarsEntity.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */