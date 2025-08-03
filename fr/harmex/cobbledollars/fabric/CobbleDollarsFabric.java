/*    */ package fr.harmex.cobbledollars.fabric;
/*    */ 
/*    */ import com.cobblemon.mod.common.NetworkManager;
/*    */ import fr.harmex.cobbledollars.common.CobbleDollars;
/*    */ import fr.harmex.cobbledollars.common.CobbleDollarsImplementation;
/*    */ import fr.harmex.cobbledollars.common.command.CobbleDollarsCommands;
/*    */ import fr.harmex.cobbledollars.common.network.serializers.CobbleDollarsEntityDataSerializers;
/*    */ import fr.harmex.cobbledollars.common.world.CobbleDollarsStructures;
/*    */ import fr.harmex.cobbledollars.common.world.entity.CobbleDollarsEntities;
/*    */ import fr.harmex.cobbledollars.common.world.entity.villager.CobbleDollarsPoiTypes;
/*    */ import fr.harmex.cobbledollars.common.world.entity.villager.CobbleDollarsProfessions;
/*    */ import fr.harmex.cobbledollars.common.world.inventory.CobbleDollarsMenus;
/*    */ import fr.harmex.cobbledollars.common.world.item.CobbleDollarsItems;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.JvmClassMappingKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.reflect.KClass;
/*    */ import net.fabricmc.fabric.api.command.v2.ArgumentTypeRegistry;
/*    */ import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
/*    */ import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
/*    */ import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
/*    */ import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
/*    */ import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
/*    */ import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
/*    */ import net.fabricmc.loader.api.FabricLoader;
/*    */ import net.minecraft.class_1299;
/*    */ import net.minecraft.class_1792;
/*    */ import net.minecraft.class_1935;
/*    */ import net.minecraft.class_2314;
/*    */ import net.minecraft.class_2378;
/*    */ import net.minecraft.class_2943;
/*    */ import net.minecraft.class_2960;
/*    */ import net.minecraft.class_3852;
/*    */ import net.minecraft.class_3917;
/*    */ import net.minecraft.class_4158;
/*    */ import net.minecraft.class_5132;
/*    */ import net.minecraft.class_7706;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\r\020\005\032\0020\004¢\006\004\b\005\020\003J\017\020\006\032\0020\004H\026¢\006\004\b\006\020\003J\017\020\007\032\0020\004H\026¢\006\004\b\007\020\003J\017\020\b\032\0020\004H\026¢\006\004\b\b\020\003J\017\020\t\032\0020\004H\026¢\006\004\b\t\020\003J\017\020\n\032\0020\004H\026¢\006\004\b\n\020\003J\017\020\013\032\0020\004H\026¢\006\004\b\013\020\003JW\020\026\032\0020\004\"\f\b\000\020\r*\006\022\002\b\0030\f\"\016\b\001\020\017*\b\022\004\022\0028\0000\0162\006\020\021\032\0020\0202\f\020\023\032\b\022\004\022\0028\0000\0222\022\020\025\032\016\022\004\022\0028\000\022\004\022\0028\0010\024H\026¢\006\004\b\026\020\027J\027\020\033\032\0020\0322\006\020\031\032\0020\030H\026¢\006\004\b\033\020\034R\032\020\036\032\0020\0358\026X\004¢\006\f\n\004\b\036\020\037\032\004\b \020!¨\006\""}, d2 = {"Lfr/harmex/cobbledollars/fabric/CobbleDollarsFabric;", "Lfr/harmex/cobbledollars/common/CobbleDollarsImplementation;", "<init>", "()V", "", "init", "registerEntityDataSerializers", "registerItems", "registerEntityTypes", "registerEntityAttributes", "registerVillagers", "registerMenus", "Lcom/mojang/brigadier/arguments/ArgumentType;", "A", "Lnet/minecraft/class_2314$class_7217;", "T", "Lnet/minecraft/class_2960;", "location", "Lkotlin/reflect/KClass;", "argumentClass", "Lnet/minecraft/class_2314;", "serializer", "registerCommandArgument", "(Lnet/minecraft/class_2960;Lkotlin/reflect/KClass;Lnet/minecraft/class_2314;)V", "", "modID", "", "isModLoaded", "(Ljava/lang/String;)Z", "Lfr/harmex/cobbledollars/fabric/CobbleDollarsFabricNetworkManager;", "networkManager", "Lfr/harmex/cobbledollars/fabric/CobbleDollarsFabricNetworkManager;", "getNetworkManager", "()Lfr/harmex/cobbledollars/fabric/CobbleDollarsFabricNetworkManager;", "fabric"})
/*    */ public final class CobbleDollarsFabric implements CobbleDollarsImplementation {
/*    */   @NotNull
/* 29 */   public static final CobbleDollarsFabric INSTANCE = new CobbleDollarsFabric();
/*    */   
/*    */   @NotNull
/* 29 */   private static final CobbleDollarsFabricNetworkManager networkManager = CobbleDollarsFabricNetworkManager.INSTANCE;
/*    */   
/*    */   @NotNull
/*    */   public CobbleDollarsFabricNetworkManager getNetworkManager() {
/* 29 */     return networkManager;
/*    */   }
/*    */   
/*    */   public final void init() {
/* 32 */     CobbleDollars.INSTANCE.preInit(this);
/* 34 */     CobbleDollars.INSTANCE.init();
/* 35 */     getNetworkManager().registerMessages();
/* 36 */     getNetworkManager().registerServerHandlers();
/* 38 */     ServerLifecycleEvents.SERVER_STARTING.register(CobbleDollarsFabric::init$lambda$0);
/* 42 */     CommandRegistrationCallback.EVENT.register(CobbleDollarsCommands.INSTANCE::register);
/*    */   }
/*    */   
/*    */   private static final void init$lambda$0(MinecraftServer it) {
/*    */     Intrinsics.checkNotNull(it);
/*    */     CobbleDollarsStructures.INSTANCE.register(it);
/*    */   }
/*    */   
/*    */   public void registerEntityDataSerializers() {
/* 46 */     class_2943.method_12720(CobbleDollarsEntityDataSerializers.INSTANCE.getBIG_INT());
/*    */   }
/*    */   
/*    */   public void registerItems() {
/* 50 */     CobbleDollarsItems.INSTANCE.register(CobbleDollarsFabric::registerItems$lambda$1);
/* 52 */     ItemGroupEvents.modifyEntriesEvent(class_7706.field_40205).register(CobbleDollarsFabric::registerItems$lambda$2);
/*    */   }
/*    */   
/*    */   private static final Unit registerItems$lambda$1(class_2960 location, class_1792 item) {
/*    */     Intrinsics.checkNotNullParameter(location, "location");
/*    */     Intrinsics.checkNotNullParameter(item, "item");
/*    */     class_2378.method_10230(CobbleDollarsItems.INSTANCE.getRegistry(), location, item);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final void registerItems$lambda$2(FabricItemGroupEntries it) {
/* 53 */     it.method_45421((class_1935)CobbleDollarsItems.COBBLE_MERCHANT_SPAWN_EGG);
/*    */   }
/*    */   
/*    */   public void registerEntityTypes() {
/* 58 */     CobbleDollarsEntities.INSTANCE.register(CobbleDollarsFabric::registerEntityTypes$lambda$3);
/*    */   }
/*    */   
/*    */   private static final Unit registerEntityTypes$lambda$3(class_2960 location, class_1299 entity) {
/* 58 */     Intrinsics.checkNotNullParameter(location, "location");
/* 58 */     Intrinsics.checkNotNullParameter(entity, "entity");
/* 58 */     class_2378.method_10230(CobbleDollarsEntities.INSTANCE.getRegistry(), location, entity);
/* 58 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   public void registerEntityAttributes() {
/* 62 */     CobbleDollarsEntities.INSTANCE.registerAttributes(CobbleDollarsFabric::registerEntityAttributes$lambda$4);
/*    */   }
/*    */   
/*    */   private static final Unit registerEntityAttributes$lambda$4(class_1299 entity, class_5132.class_5133 builder) {
/* 62 */     Intrinsics.checkNotNullParameter(entity, "entity");
/* 62 */     Intrinsics.checkNotNullParameter(builder, "builder");
/* 62 */     FabricDefaultAttributeRegistry.register(entity, builder);
/* 62 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   public void registerVillagers() {
/* 66 */     CobbleDollarsPoiTypes.INSTANCE.register(CobbleDollarsFabric::registerVillagers$lambda$5);
/* 67 */     CobbleDollarsProfessions.INSTANCE.register(CobbleDollarsFabric::registerVillagers$lambda$6);
/*    */   }
/*    */   
/*    */   private static final Unit registerVillagers$lambda$5(class_2960 location, class_4158 poi) {
/*    */     Intrinsics.checkNotNullParameter(location, "location");
/*    */     Intrinsics.checkNotNullParameter(poi, "poi");
/*    */     PointOfInterestHelper.register(location, poi.comp_816(), poi.comp_817(), poi.comp_815());
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit registerVillagers$lambda$6(class_2960 location, class_3852 profession) {
/* 67 */     Intrinsics.checkNotNullParameter(location, "location");
/* 67 */     Intrinsics.checkNotNullParameter(profession, "profession");
/* 67 */     class_2378.method_10230(CobbleDollarsProfessions.INSTANCE.getRegistry(), location, profession);
/* 67 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   public void registerMenus() {
/* 71 */     CobbleDollarsMenus.INSTANCE.register(CobbleDollarsFabric::registerMenus$lambda$7);
/*    */   }
/*    */   
/*    */   private static final Unit registerMenus$lambda$7(class_2960 location, class_3917 menu) {
/* 71 */     Intrinsics.checkNotNullParameter(location, "location");
/* 71 */     Intrinsics.checkNotNullParameter(menu, "menu");
/* 71 */     class_2378.method_10230(CobbleDollarsMenus.INSTANCE.getRegistry(), location, menu);
/* 71 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   public <A extends com.mojang.brigadier.arguments.ArgumentType<?>, T extends class_2314.class_7217<A>> void registerCommandArgument(@NotNull class_2960 location, @NotNull KClass argumentClass, @NotNull class_2314 serializer) {
/* 75 */     Intrinsics.checkNotNullParameter(location, "location");
/* 75 */     Intrinsics.checkNotNullParameter(argumentClass, "argumentClass");
/* 75 */     Intrinsics.checkNotNullParameter(serializer, "serializer");
/* 75 */     ArgumentTypeRegistry.registerArgumentType(location, JvmClassMappingKt.getJavaClass(argumentClass), serializer);
/*    */   }
/*    */   
/*    */   public boolean isModLoaded(@NotNull String modID) {
/* 78 */     Intrinsics.checkNotNullParameter(modID, "modID");
/* 78 */     return FabricLoader.getInstance().isModLoaded(modID);
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\fabric\CobbleDollarsFabric.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */