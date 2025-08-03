package fr.harmex.cobbledollars.common;

import com.cobblemon.mod.common.NetworkManager;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import net.minecraft.class_2314;
import net.minecraft.class_2960;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\002\020\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\004\bf\030\0002\0020\001J\017\020\003\032\0020\002H&¢\006\004\b\003\020\004J\017\020\005\032\0020\002H&¢\006\004\b\005\020\004J\017\020\006\032\0020\002H&¢\006\004\b\006\020\004J\017\020\007\032\0020\002H&¢\006\004\b\007\020\004J\017\020\b\032\0020\002H&¢\006\004\b\b\020\004J\017\020\t\032\0020\002H&¢\006\004\b\t\020\004JW\020\024\032\0020\002\"\f\b\000\020\013*\006\022\002\b\0030\n\"\016\b\001\020\r*\b\022\004\022\0028\0000\f2\006\020\017\032\0020\0162\f\020\021\032\b\022\004\022\0028\0000\0202\022\020\023\032\016\022\004\022\0028\000\022\004\022\0028\0010\022H&¢\006\004\b\024\020\025J\027\020\031\032\0020\0302\006\020\027\032\0020\026H&¢\006\004\b\031\020\032R\024\020\036\032\0020\0338&X¦\004¢\006\006\032\004\b\034\020\035¨\006\037"}, d2 = {"Lfr/harmex/cobbledollars/common/CobbleDollarsImplementation;", "", "", "registerEntityDataSerializers", "()V", "registerItems", "registerEntityTypes", "registerEntityAttributes", "registerVillagers", "registerMenus", "Lcom/mojang/brigadier/arguments/ArgumentType;", "A", "Lnet/minecraft/class_2314$class_7217;", "T", "Lnet/minecraft/class_2960;", "location", "Lkotlin/reflect/KClass;", "argumentClass", "Lnet/minecraft/class_2314;", "serializer", "registerCommandArgument", "(Lnet/minecraft/class_2960;Lkotlin/reflect/KClass;Lnet/minecraft/class_2314;)V", "", "modID", "", "isModLoaded", "(Ljava/lang/String;)Z", "Lcom/cobblemon/mod/common/NetworkManager;", "getNetworkManager", "()Lcom/cobblemon/mod/common/NetworkManager;", "networkManager", "common"})
public interface CobbleDollarsImplementation {
  @NotNull
  NetworkManager getNetworkManager();
  
  void registerEntityDataSerializers();
  
  void registerItems();
  
  void registerEntityTypes();
  
  void registerEntityAttributes();
  
  void registerVillagers();
  
  void registerMenus();
  
  <A extends com.mojang.brigadier.arguments.ArgumentType<?>, T extends class_2314.class_7217<A>> void registerCommandArgument(@NotNull class_2960 paramclass_2960, @NotNull KClass<A> paramKClass, @NotNull class_2314<A, T> paramclass_2314);
  
  boolean isModLoaded(@NotNull String paramString);
}


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\CobbleDollarsImplementation.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */