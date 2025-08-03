/*     */ package fr.harmex.cobbledollars.common.world.entity;
/*     */ 
/*     */ import com.cobblemon.mod.common.api.tags.CobblemonItemTags;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import fr.harmex.cobbledollars.common.CobbleDollars;
/*     */ import fr.harmex.cobbledollars.common.utils.extensions.CompoundTagExtensionKt;
/*     */ import fr.harmex.cobbledollars.common.utils.extensions.PlayerExtensionKt;
/*     */ import fr.harmex.cobbledollars.common.world.entity.villager.CobbleDollarsProfessions;
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.CobbleDollarsShopHolder;
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Category;
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Offer;
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Shop;
/*     */ import java.util.ArrayList;
/*     */ import java.util.LinkedHashSet;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
/*     */ import java.util.function.Predicate;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.class_1266;
/*     */ import net.minecraft.class_1268;
/*     */ import net.minecraft.class_1269;
/*     */ import net.minecraft.class_1282;
/*     */ import net.minecraft.class_1299;
/*     */ import net.minecraft.class_1308;
/*     */ import net.minecraft.class_1314;
/*     */ import net.minecraft.class_1315;
/*     */ import net.minecraft.class_1347;
/*     */ import net.minecraft.class_1352;
/*     */ import net.minecraft.class_1361;
/*     */ import net.minecraft.class_1374;
/*     */ import net.minecraft.class_1376;
/*     */ import net.minecraft.class_1391;
/*     */ import net.minecraft.class_1394;
/*     */ import net.minecraft.class_1409;
/*     */ import net.minecraft.class_1655;
/*     */ import net.minecraft.class_1657;
/*     */ import net.minecraft.class_1799;
/*     */ import net.minecraft.class_1802;
/*     */ import net.minecraft.class_1856;
/*     */ import net.minecraft.class_1935;
/*     */ import net.minecraft.class_1937;
/*     */ import net.minecraft.class_2487;
/*     */ import net.minecraft.class_2509;
/*     */ import net.minecraft.class_2520;
/*     */ import net.minecraft.class_2940;
/*     */ import net.minecraft.class_2943;
/*     */ import net.minecraft.class_2945;
/*     */ import net.minecraft.class_3414;
/*     */ import net.minecraft.class_3417;
/*     */ import net.minecraft.class_3730;
/*     */ import net.minecraft.class_3850;
/*     */ import net.minecraft.class_3851;
/*     */ import net.minecraft.class_3854;
/*     */ import net.minecraft.class_5132;
/*     */ import net.minecraft.class_5134;
/*     */ import net.minecraft.class_5425;
/*     */ import net.minecraft.class_7;
/*     */ import net.minecraft.class_9296;
/*     */ import net.minecraft.class_9334;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000¤\001\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\006\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\006\n\002\020#\n\002\b\b\030\000 O2\0020\0012\0020\0022\0020\0032\0020\004:\001OB\037\022\016\b\002\020\006\032\b\022\004\022\0020\0000\005\022\006\020\b\032\0020\007¢\006\004\b\t\020\nJ\017\020\f\032\0020\013H\024¢\006\004\b\f\020\rJ!\020\023\032\004\030\0010\0222\006\020\017\032\0020\0162\006\020\021\032\0020\020H\024¢\006\004\b\023\020\024J\027\020\027\032\0020\0132\006\020\026\032\0020\025H\024¢\006\004\b\027\020\030J\027\020\033\032\0020\0132\006\020\032\032\0020\031H\026¢\006\004\b\033\020\034J\027\020\035\032\0020\0132\006\020\032\032\0020\031H\026¢\006\004\b\035\020\034J\027\020!\032\0020 2\006\020\037\032\0020\036H\026¢\006\004\b!\020\"J\017\020$\032\0020#H\026¢\006\004\b$\020%J\027\020'\032\0020\0132\006\020&\032\0020#H\026¢\006\004\b'\020(J\017\020*\032\0020)H\024¢\006\004\b*\020+J\027\020.\032\0020)2\006\020-\032\0020,H\024¢\006\004\b.\020/J\021\0200\032\004\030\0010)H\024¢\006\004\b0\020+J3\0208\032\004\030\001062\006\020\b\032\002012\006\0203\032\002022\006\0205\032\002042\b\0207\032\004\030\00106H\026¢\006\004\b8\0209R$\020;\032\004\030\0010:8\026@\026X\016¢\006\022\n\004\b;\020<\032\004\b=\020>\"\004\b?\020@R\"\020B\032\0020A8V@\026X\016¢\006\022\n\004\bB\020C\032\004\bD\020E\"\004\bF\020GR(\020I\032\b\022\004\022\0020\0160H8\026@\026X\016¢\006\022\n\004\bI\020J\032\004\bK\020L\"\004\bM\020N¨\006P"}, d2 = {"Lfr/harmex/cobbledollars/common/world/entity/CobbleMerchant;", "Lnet/minecraft/class_1314;", "Lfr/harmex/cobbledollars/common/world/item/trading/CobbleDollarsShopHolder;", "Lnet/minecraft/class_3851;", "Lnet/minecraft/class_1655;", "Lnet/minecraft/class_1299;", "type", "Lnet/minecraft/class_1937;", "level", "<init>", "(Lnet/minecraft/class_1299;Lnet/minecraft/class_1937;)V", "", "registerGoals", "()V", "Lnet/minecraft/class_1657;", "player", "Lnet/minecraft/class_1268;", "hand", "Lnet/minecraft/class_1269;", "mobInteract", "(Lnet/minecraft/class_1657;Lnet/minecraft/class_1268;)Lnet/minecraft/class_1269;", "Lnet/minecraft/class_2945$class_9222;", "builder", "defineSynchedData", "(Lnet/minecraft/class_2945$class_9222;)V", "Lnet/minecraft/class_2487;", "compound", "addAdditionalSaveData", "(Lnet/minecraft/class_2487;)V", "readAdditionalSaveData", "", "distanceToClosestPlayer", "", "removeWhenFarAway", "(D)Z", "Lnet/minecraft/class_3850;", "getVillagerData", "()Lnet/minecraft/class_3850;", "villagerData", "setVillagerData", "(Lnet/minecraft/class_3850;)V", "Lnet/minecraft/class_3414;", "getAmbientSound", "()Lnet/minecraft/class_3414;", "Lnet/minecraft/class_1282;", "damageSource", "getHurtSound", "(Lnet/minecraft/class_1282;)Lnet/minecraft/class_3414;", "getDeathSound", "Lnet/minecraft/class_5425;", "Lnet/minecraft/class_1266;", "difficulty", "Lnet/minecraft/class_3730;", "spawnType", "Lnet/minecraft/class_1315;", "spawnGroupData", "finalizeSpawn", "(Lnet/minecraft/class_5425;Lnet/minecraft/class_1266;Lnet/minecraft/class_3730;Lnet/minecraft/class_1315;)Lnet/minecraft/class_1315;", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "shop", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "getShop", "()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "setShop", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;)V", "Ljava/util/UUID;", "merchantUUID", "Ljava/util/UUID;", "getMerchantUUID", "()Ljava/util/UUID;", "setMerchantUUID", "(Ljava/util/UUID;)V", "", "tradingPlayers", "Ljava/util/Set;", "getTradingPlayers", "()Ljava/util/Set;", "setTradingPlayers", "(Ljava/util/Set;)V", "Companion", "common"})
/*     */ public final class CobbleMerchant extends class_1314 implements CobbleDollarsShopHolder, class_3851, class_1655 {
/*     */   public CobbleMerchant(@NotNull class_1299 type, @NotNull class_1937 level) {
/*  53 */     super(type, level);
/*  60 */     this.shop = new Shop();
/*  61 */     Intrinsics.checkNotNullExpressionValue(UUID.randomUUID(), "randomUUID(...)");
/*  61 */     this.merchantUUID = UUID.randomUUID();
/*  63 */     this.tradingPlayers = new LinkedHashSet<>();
/*  66 */     method_5941(class_7.field_9, 16.0F);
/*  67 */     method_5941(class_7.field_3, -1.0F);
/*  68 */     Intrinsics.checkNotNull(method_5942(), "null cannot be cast to non-null type net.minecraft.world.entity.ai.navigation.GroundPathNavigation");
/*  68 */     ((class_1409)method_5942()).method_6363(true);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\r\020\005\032\0020\004¢\006\004\b\005\020\006R\035\020\t\032\b\022\004\022\0020\b0\0078\006¢\006\f\n\004\b\t\020\n\032\004\b\013\020\f¨\006\r"}, d2 = {"Lfr/harmex/cobbledollars/common/world/entity/CobbleMerchant$Companion;", "", "<init>", "()V", "Lnet/minecraft/class_5132$class_5133;", "createAttributes", "()Lnet/minecraft/class_5132$class_5133;", "Lnet/minecraft/class_2940;", "Lnet/minecraft/class_3850;", "DATA_VILLAGER_DATA", "Lnet/minecraft/class_2940;", "getDATA_VILLAGER_DATA", "()Lnet/minecraft/class_2940;", "common"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final class_2940<class_3850> getDATA_VILLAGER_DATA() {
/*     */       return CobbleMerchant.DATA_VILLAGER_DATA;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final class_5132.class_5133 createAttributes() {
/*     */       Intrinsics.checkNotNullExpressionValue(class_1314.method_26828().method_26868(class_5134.field_23719, 0.25D).method_26868(class_5134.field_23717, 48.0D), "add(...)");
/*     */       return class_1314.method_26828().method_26868(class_5134.field_23719, 0.25D).method_26868(class_5134.field_23717, 48.0D);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   
/*     */   @Nullable
/*     */   private Shop shop;
/*     */   
/*     */   @NotNull
/*     */   private UUID merchantUUID;
/*     */   
/*     */   @NotNull
/*     */   private Set<class_1657> tradingPlayers;
/*     */   
/*     */   @NotNull
/*     */   private static final class_2940<class_3850> DATA_VILLAGER_DATA = class_2945.method_12791(CobbleMerchant.class, class_2943.field_17207);
/*     */   
/*     */   static {
/*     */     Intrinsics.checkNotNullExpressionValue(class_2945.method_12791(CobbleMerchant.class, class_2943.field_17207), "defineId(...)");
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Shop getShop() {
/*     */     return this.shop;
/*     */   }
/*     */   
/*     */   public void setShop(@Nullable Shop <set-?>) {
/*     */     this.shop = <set-?>;
/*     */   }
/*     */   
/*     */   public void setMerchantUUID(@NotNull UUID <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.merchantUUID = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public UUID getMerchantUUID() {
/*     */     Intrinsics.checkNotNullExpressionValue(this.field_6021, "uuid");
/*     */     return this.field_6021;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Set<class_1657> getTradingPlayers() {
/*     */     return this.tradingPlayers;
/*     */   }
/*     */   
/*     */   public void setTradingPlayers(@NotNull Set<class_1657> <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.tradingPlayers = <set-?>;
/*     */   }
/*     */   
/*     */   protected void method_5959() {
/*  72 */     this.field_6201.method_6277(0, (class_1352)new class_1347((class_1308)this));
/*  73 */     this.field_6201.method_6277(1, (class_1352)new class_1374(this, 1.5D));
/*  74 */     this.field_6201.method_6277(2, (class_1352)new class_1391(this, 1.25D, (Predicate)class_1856.method_8106(CobblemonItemTags.POKE_BALLS), false));
/*  75 */     this.field_6201.method_6277(3, (class_1352)new class_1394(this, 1.0D));
/*  76 */     this.field_6201.method_6277(4, (class_1352)new class_1361((class_1308)this, class_1657.class, 6.0F));
/*  77 */     this.field_6201.method_6277(5, (class_1352)new class_1376((class_1308)this));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected class_1269 method_5992(@NotNull class_1657 player, @NotNull class_1268 hand) {
/*  81 */     Intrinsics.checkNotNullParameter(player, "player");
/*  81 */     Intrinsics.checkNotNullParameter(hand, "hand");
/*  81 */     if (method_5805() && !(method_37908()).field_9236)
/*  82 */       if (player.method_5715()) {
/*  83 */         PlayerExtensionKt.openBank(player, this);
/*     */       } else {
/*  85 */         PlayerExtensionKt.openShop$default(player, this, false, 2, null);
/*  86 */         getTradingPlayers().add(player);
/*     */       }  
/*  89 */     return class_1269.method_29236((method_37908()).field_9236);
/*     */   }
/*     */   
/*     */   protected void method_5693(@NotNull class_2945.class_9222 builder) {
/*  93 */     Intrinsics.checkNotNullParameter(builder, "builder");
/*  93 */     super.method_5693(builder);
/*  94 */     builder.method_56912(DATA_VILLAGER_DATA, new class_3850(class_3854.field_17073, CobbleDollarsProfessions.COBBLE_MERCHANT, 1));
/*     */   }
/*     */   
/*     */   public void method_5652(@NotNull class_2487 compound) {
/*  98 */     Intrinsics.checkNotNullParameter(compound, "compound");
/*  98 */     super.method_5652(compound);
/*  99 */     class_3850.field_24669.encodeStart((DynamicOps)class_2509.field_11560, method_7231())
/* 100 */       .resultOrPartial(CobbleDollars.INSTANCE.getLOGGER()::error).ifPresent(compound::addAdditionalSaveData$lambda$0::addAdditionalSaveData$lambda$1);
/* 103 */     if (getShop() != null) {
/* 104 */       Intrinsics.checkNotNull(getShop());
/* 104 */       Intrinsics.checkNotNullExpressionValue(method_56673(), "registryAccess(...)");
/* 104 */       CompoundTagExtensionKt.putShop(compound, getShop(), method_56673());
/*     */     } 
/*     */   }
/*     */   
/*     */   private static final void addAdditionalSaveData$lambda$1(Function1 $tmp0, Object p0) {
/*     */     Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
/*     */     $tmp0.invoke(p0);
/*     */   }
/*     */   
/*     */   private static final Unit addAdditionalSaveData$lambda$0(class_2487 $compound, class_2520 it) {
/*     */     Intrinsics.checkNotNullParameter($compound, "$compound");
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     $compound.method_10566("VillagerData", it);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   public void method_5749(@NotNull class_2487 compound) {
/* 109 */     Intrinsics.checkNotNullParameter(compound, "compound");
/* 109 */     super.method_5749(compound);
/* 110 */     if (compound.method_10573("VillagerData", 10))
/* 111 */       class_3850.field_24669
/* 112 */         .parse((DynamicOps)class_2509.field_11560, compound.method_10580("VillagerData"))
/* 113 */         .resultOrPartial(CobbleDollars.INSTANCE.getLOGGER()::error)
/* 114 */         .ifPresent(new CobbleMerchant$readAdditionalSaveData$2(this)::readAdditionalSaveData$lambda$2); 
/* 116 */     if (compound.method_10573("CobbleMerchantShop", 9)) {
/* 117 */       Intrinsics.checkNotNullExpressionValue(method_56673(), "registryAccess(...)");
/* 117 */       setShop(CompoundTagExtensionKt.getShop(compound, method_56673()));
/*     */     } 
/*     */   }
/*     */   
/*     */   private static final void readAdditionalSaveData$lambda$2(Function1 $tmp0, Object p0) {
/*     */     Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
/*     */     $tmp0.invoke(p0);
/*     */   }
/*     */   
/*     */   public boolean method_5974(double distanceToClosestPlayer) {
/* 122 */     return false;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public class_3850 method_7231() {
/* 126 */     Intrinsics.checkNotNullExpressionValue(this.field_6011.method_12789(DATA_VILLAGER_DATA), "get(...)");
/* 126 */     return (class_3850)this.field_6011.method_12789(DATA_VILLAGER_DATA);
/*     */   }
/*     */   
/*     */   public void method_7195(@NotNull class_3850 villagerData) {
/* 130 */     Intrinsics.checkNotNullParameter(villagerData, "villagerData");
/* 130 */     this.field_6011.method_12778(DATA_VILLAGER_DATA, villagerData);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected class_3414 method_5994() {
/* 134 */     Intrinsics.checkNotNullExpressionValue(class_3417.field_15175, "VILLAGER_AMBIENT");
/* 134 */     return class_3417.field_15175;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected class_3414 method_6011(@NotNull class_1282 damageSource) {
/* 138 */     Intrinsics.checkNotNullParameter(damageSource, "damageSource");
/* 138 */     Intrinsics.checkNotNullExpressionValue(class_3417.field_15139, "VILLAGER_HURT");
/* 138 */     return class_3417.field_15139;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected class_3414 method_6002() {
/* 142 */     return class_3417.field_15225;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public class_1315 method_5943(@NotNull class_5425 level, @NotNull class_1266 difficulty, @NotNull class_3730 spawnType, @Nullable class_1315 spawnGroupData) {
/* 146 */     Intrinsics.checkNotNullParameter(level, "level");
/* 146 */     Intrinsics.checkNotNullParameter(difficulty, "difficulty");
/* 146 */     Intrinsics.checkNotNullParameter(spawnType, "spawnType");
/* 146 */     if (spawnType == class_3730.field_16462 || 
/* 147 */       spawnType == class_3730.field_16465 || 
/* 148 */       spawnType == class_3730.field_16469 || 
/* 149 */       spawnType == class_3730.field_16470 || 
/* 150 */       spawnType == class_3730.field_16474) {
/* 152 */       method_7195(method_7231().method_16922(class_3854.method_16930(level.method_23753(method_24515()))).method_16921(
/* 153 */             CobbleDollarsProfessions.COBBLE_MERCHANT));
/* 155 */       if (this.field_5974.method_43057() < 2.0E-4D) {
/* 156 */         Shop easterEggShop = new Shop();
/* 157 */         Category easterEggCategory = new Category("Easter Egg", new ArrayList());
/* 158 */         class_1799 authorPlayerHead = new class_1799((class_1935)class_1802.field_8575);
/* 159 */         authorPlayerHead.method_57379(class_9334.field_49617, new class_9296(new GameProfile(UUID.fromString("15c43c0b-bd8a-4637-a9ac-682ec8240b97"), "Harmex")));
/* 160 */         easterEggCategory.getOffers().add(new Offer(authorPlayerHead, 1000000, 0, 4, null));
/* 161 */         easterEggShop.add(easterEggCategory);
/* 162 */         setShop(easterEggShop);
/*     */       } 
/*     */     } 
/* 165 */     return super.method_5943(level, difficulty, spawnType, spawnGroupData);
/*     */   }
/*     */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\world\entity\CobbleMerchant.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */