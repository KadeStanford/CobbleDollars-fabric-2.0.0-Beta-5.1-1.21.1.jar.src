package fr.harmex.cobbledollars.common.world.item.trading;

import fr.harmex.cobbledollars.common.world.item.trading.shop.Shop;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import net.minecraft.class_1657;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\020#\n\002\030\002\n\002\b\006\bf\030\0002\0020\001R\036\020\007\032\004\030\0010\0028&@&X¦\016¢\006\f\032\004\b\003\020\004\"\004\b\005\020\006R\034\020\r\032\0020\b8&@&X¦\016¢\006\f\032\004\b\t\020\n\"\004\b\013\020\fR\"\020\024\032\b\022\004\022\0020\0170\0168&@&X¦\016¢\006\f\032\004\b\020\020\021\"\004\b\022\020\023¨\006\025"}, d2 = {"Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;", "", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "getShop", "()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "setShop", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;)V", "shop", "Ljava/util/UUID;", "getMerchantUUID", "()Ljava/util/UUID;", "setMerchantUUID", "(Ljava/util/UUID;)V", "merchantUUID", "", "Lnet/minecraft/class_1657;", "getTradingPlayers", "()Ljava/util/Set;", "setTradingPlayers", "(Ljava/util/Set;)V", "tradingPlayers", "common"})
public interface CobbleDollarsShopHolder {
  @Nullable
  Shop getShop();
  
  void setShop(@Nullable Shop paramShop);
  
  @NotNull
  UUID getMerchantUUID();
  
  void setMerchantUUID(@NotNull UUID paramUUID);
  
  @NotNull
  Set<class_1657> getTradingPlayers();
  
  void setTradingPlayers(@NotNull Set<class_1657> paramSet);
}


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\world\item\trading\CobbleDollarsShopHolder.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */