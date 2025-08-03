/*     */ package fr.harmex.cobbledollars.common.config;
/*     */ 
/*     */ import com.cobblemon.mod.common.CobblemonItems;
/*     */ import com.cobblemon.mod.common.api.text.TextKt;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import fr.harmex.cobbledollars.common.CobbleDollars;
/*     */ import fr.harmex.cobbledollars.common.utils.adapters.ShopAdapter;
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Category;
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Offer;
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Shop;
/*     */ import java.io.File;
/*     */ import java.io.FileReader;
/*     */ import java.io.FileWriter;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.class_1322;
/*     */ import net.minecraft.class_1799;
/*     */ import net.minecraft.class_1802;
/*     */ import net.minecraft.class_1814;
/*     */ import net.minecraft.class_1935;
/*     */ import net.minecraft.class_2561;
/*     */ import net.minecraft.class_2960;
/*     */ import net.minecraft.class_4174;
/*     */ import net.minecraft.class_5134;
/*     */ import net.minecraft.class_9274;
/*     */ import net.minecraft.class_9285;
/*     */ import net.minecraft.class_9334;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\b\030\000 \0162\0020\001:\001\016B\007¢\006\004\b\002\020\003J\r\020\005\032\0020\004¢\006\004\b\005\020\006R\"\020\b\032\0020\0078\006@\006X\016¢\006\022\n\004\b\b\020\t\032\004\b\n\020\013\"\004\b\f\020\r¨\006\017"}, d2 = {"Lfr/harmex/cobbledollars/common/config/ShopConfig;", "", "<init>", "()V", "Lnet/minecraft/class_1799;", "stick", "()Lnet/minecraft/class_1799;", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "defaultShop", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "getDefaultShop", "()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "setDefaultShop", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;)V", "Companion", "common"})
/*     */ public final class ShopConfig {
/*     */   public ShopConfig() {
/*  87 */     Category[] arrayOfCategory = new Category[2];
/*  89 */     Offer[] arrayOfOffer = new Offer[48];
/*  89 */     arrayOfOffer[0] = new Offer(new class_1799((class_1935)CobblemonItems.POKE_BALL), 2000, 0, 4, null);
/*  89 */     arrayOfOffer[1] = 
/*  90 */       new Offer(new class_1799((class_1935)CobblemonItems.CITRINE_BALL), 2000, 0, 4, null);
/*  91 */     arrayOfOffer[2] = new Offer(new class_1799((class_1935)CobblemonItems.VERDANT_BALL), 2000, 0, 4, null);
/*  92 */     arrayOfOffer[3] = new Offer(new class_1799((class_1935)CobblemonItems.AZURE_BALL), 2000, 0, 4, null);
/*  93 */     arrayOfOffer[4] = new Offer(new class_1799((class_1935)CobblemonItems.ROSEATE_BALL), 2000, 0, 4, null);
/*  94 */     arrayOfOffer[5] = new Offer(new class_1799((class_1935)CobblemonItems.SLATE_BALL), 2000, 0, 4, null);
/*  95 */     arrayOfOffer[6] = new Offer(new class_1799((class_1935)CobblemonItems.PREMIER_BALL), 2000, 0, 4, null);
/*  96 */     arrayOfOffer[7] = new Offer(new class_1799((class_1935)CobblemonItems.GREAT_BALL), 6000, 0, 4, null);
/*  97 */     arrayOfOffer[8] = new Offer(new class_1799((class_1935)CobblemonItems.ULTRA_BALL), 8000, 0, 4, null);
/*  98 */     arrayOfOffer[9] = new Offer(new class_1799((class_1935)CobblemonItems.SAFARI_BALL), 6000, 0, 4, null);
/*  99 */     arrayOfOffer[10] = new Offer(new class_1799((class_1935)CobblemonItems.FAST_BALL), 6000, 0, 4, null);
/* 100 */     arrayOfOffer[11] = new Offer(new class_1799((class_1935)CobblemonItems.LEVEL_BALL), 6000, 0, 4, null);
/* 101 */     arrayOfOffer[12] = new Offer(new class_1799((class_1935)CobblemonItems.LURE_BALL), 6000, 0, 4, null);
/* 102 */     arrayOfOffer[13] = new Offer(new class_1799((class_1935)CobblemonItems.HEAVY_BALL), 6000, 0, 4, null);
/* 103 */     arrayOfOffer[14] = new Offer(new class_1799((class_1935)CobblemonItems.LOVE_BALL), 6000, 0, 4, null);
/* 104 */     arrayOfOffer[15] = new Offer(new class_1799((class_1935)CobblemonItems.FRIEND_BALL), 6000, 0, 4, null);
/* 105 */     arrayOfOffer[16] = new Offer(new class_1799((class_1935)CobblemonItems.MOON_BALL), 6000, 0, 4, null);
/* 106 */     arrayOfOffer[17] = new Offer(new class_1799((class_1935)CobblemonItems.SPORT_BALL), 6000, 0, 4, null);
/* 107 */     arrayOfOffer[18] = new Offer(new class_1799((class_1935)CobblemonItems.PARK_BALL), 6000, 0, 4, null);
/* 108 */     arrayOfOffer[19] = new Offer(new class_1799((class_1935)CobblemonItems.NET_BALL), 10000, 0, 4, null);
/* 109 */     arrayOfOffer[20] = new Offer(new class_1799((class_1935)CobblemonItems.DIVE_BALL), 10000, 0, 4, null);
/* 110 */     arrayOfOffer[21] = new Offer(new class_1799((class_1935)CobblemonItems.NEST_BALL), 10000, 0, 4, null);
/* 111 */     arrayOfOffer[22] = new Offer(new class_1799((class_1935)CobblemonItems.REPEAT_BALL), 10000, 0, 4, null);
/* 112 */     arrayOfOffer[23] = new Offer(new class_1799((class_1935)CobblemonItems.TIMER_BALL), 10000, 0, 4, null);
/* 113 */     arrayOfOffer[24] = new Offer(new class_1799((class_1935)CobblemonItems.LUXURY_BALL), 30000, 0, 4, null);
/* 114 */     arrayOfOffer[25] = new Offer(new class_1799((class_1935)CobblemonItems.DUSK_BALL), 10000, 0, 4, null);
/* 115 */     arrayOfOffer[26] = new Offer(new class_1799((class_1935)CobblemonItems.HEAL_BALL), 3000, 0, 4, null);
/* 116 */     arrayOfOffer[27] = new Offer(new class_1799((class_1935)CobblemonItems.QUICK_BALL), 10000, 0, 4, null);
/* 117 */     arrayOfOffer[28] = new Offer(new class_1799((class_1935)CobblemonItems.DREAM_BALL), 6000, 0, 4, null);
/* 118 */     arrayOfOffer[29] = new Offer(new class_1799((class_1935)CobblemonItems.BEAST_BALL), 50000, 0, 4, null);
/* 119 */     arrayOfOffer[30] = new Offer(new class_1799((class_1935)CobblemonItems.MASTER_BALL), 500000, 0, 4, null);
/* 120 */     arrayOfOffer[31] = new Offer(new class_1799((class_1935)CobblemonItems.CHERISH_BALL), 2000, 0, 4, null);
/* 121 */     arrayOfOffer[32] = new Offer(new class_1799((class_1935)CobblemonItems.ANCIENT_POKE_BALL), 2000, 0, 4, null);
/* 122 */     arrayOfOffer[33] = new Offer(new class_1799((class_1935)CobblemonItems.ANCIENT_CITRINE_BALL), 2000, 0, 4, null);
/* 123 */     arrayOfOffer[34] = new Offer(new class_1799((class_1935)CobblemonItems.ANCIENT_VERDANT_BALL), 2000, 0, 4, null);
/* 124 */     arrayOfOffer[35] = new Offer(new class_1799((class_1935)CobblemonItems.ANCIENT_AZURE_BALL), 2000, 0, 4, null);
/* 125 */     arrayOfOffer[36] = new Offer(new class_1799((class_1935)CobblemonItems.ANCIENT_ROSEATE_BALL), 2000, 0, 4, null);
/* 126 */     arrayOfOffer[37] = new Offer(new class_1799((class_1935)CobblemonItems.ANCIENT_SLATE_BALL), 2000, 0, 4, null);
/* 127 */     arrayOfOffer[38] = new Offer(new class_1799((class_1935)CobblemonItems.ANCIENT_IVORY_BALL), 2000, 0, 4, null);
/* 128 */     arrayOfOffer[39] = new Offer(new class_1799((class_1935)CobblemonItems.ANCIENT_GREAT_BALL), 6000, 0, 4, null);
/* 129 */     arrayOfOffer[40] = new Offer(new class_1799((class_1935)CobblemonItems.ANCIENT_ULTRA_BALL), 8000, 0, 4, null);
/* 130 */     arrayOfOffer[41] = new Offer(new class_1799((class_1935)CobblemonItems.ANCIENT_FEATHER_BALL), 2000, 0, 4, null);
/* 131 */     arrayOfOffer[42] = new Offer(new class_1799((class_1935)CobblemonItems.ANCIENT_WING_BALL), 6000, 0, 4, null);
/* 132 */     arrayOfOffer[43] = new Offer(new class_1799((class_1935)CobblemonItems.ANCIENT_JET_BALL), 8000, 0, 4, null);
/* 133 */     arrayOfOffer[44] = new Offer(new class_1799((class_1935)CobblemonItems.ANCIENT_HEAVY_BALL), 2000, 0, 4, null);
/* 134 */     arrayOfOffer[45] = new Offer(new class_1799((class_1935)CobblemonItems.ANCIENT_LEADEN_BALL), 6000, 0, 4, null);
/* 135 */     arrayOfOffer[46] = new Offer(new class_1799((class_1935)CobblemonItems.ANCIENT_GIGATON_BALL), 8000, 0, 4, null);
/* 136 */     arrayOfOffer[47] = new Offer(new class_1799((class_1935)CobblemonItems.ANCIENT_ORIGIN_BALL), 500000, 0, 4, null);
/*     */     arrayOfCategory[0] = new Category("Poké Balls", CollectionsKt.arrayListOf((Object[])arrayOfOffer));
/* 139 */     arrayOfOffer = new Offer[7];
/* 139 */     arrayOfOffer[0] = new Offer(new class_1799((class_1935)CobblemonItems.EXPERIENCE_CANDY_XS), 500, 0, 4, null);
/* 139 */     arrayOfOffer[1] = 
/* 140 */       new Offer(new class_1799((class_1935)CobblemonItems.EXPERIENCE_CANDY_S), 4000, 0, 4, null);
/* 141 */     arrayOfOffer[2] = new Offer(new class_1799((class_1935)CobblemonItems.EXPERIENCE_CANDY_M), 15000, 0, 4, null);
/* 142 */     arrayOfOffer[3] = new Offer(new class_1799((class_1935)CobblemonItems.EXPERIENCE_CANDY_L), 50000, 0, 4, null);
/* 143 */     arrayOfOffer[4] = new Offer(new class_1799((class_1935)CobblemonItems.EXPERIENCE_CANDY_XL), 150000, 0, 4, null);
/* 144 */     arrayOfOffer[5] = new Offer(new class_1799((class_1935)CobblemonItems.RARE_CANDY), 100000, 0, 4, null);
/* 145 */     arrayOfOffer[6] = new Offer(new class_1799((class_1935)CobblemonItems.EXP_SHARE), 250000, 0, 4, null);
/*     */     arrayOfCategory[1] = new Category("Exp", CollectionsKt.arrayListOf((Object[])arrayOfOffer));
/*     */     this.defaultShop = new Shop(arrayOfCategory);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\r\020\005\032\0020\004¢\006\004\b\005\020\003J\r\020\006\032\0020\004¢\006\004\b\006\020\003R\024\020\b\032\0020\0078\006XT¢\006\006\n\004\b\b\020\tR\027\020\013\032\0020\n8\006¢\006\f\n\004\b\013\020\f\032\004\b\r\020\016¨\006\017"}, d2 = {"Lfr/harmex/cobbledollars/common/config/ShopConfig$Companion;", "", "<init>", "()V", "", "load", "save", "", "PATH", "Ljava/lang/String;", "Lcom/google/gson/Gson;", "GSON", "Lcom/google/gson/Gson;", "getGSON", "()Lcom/google/gson/Gson;", "common"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final Gson getGSON() {
/*     */       return ShopConfig.GSON;
/*     */     }
/*     */     
/*     */     public final void load() {
/*     */       CobbleDollars.INSTANCE.getLOGGER().info("Loading default shop config...");
/*     */       File configFile = new File("config/cobbledollars/default_shop.json");
/*     */       configFile.getParentFile().mkdirs();
/*     */       if (configFile.exists()) {
/*     */         try {
/*     */           FileReader reader = new FileReader(configFile);
/*     */           CobbleDollars.INSTANCE.setShopConfig((ShopConfig)getGSON().fromJson(reader, ShopConfig.class));
/*     */           reader.close();
/*     */           CobbleDollars.INSTANCE.getLOGGER().info("Default shop config loaded!");
/*     */         } catch (Exception exception) {
/*     */           CobbleDollars.INSTANCE.setShopConfig(new ShopConfig());
/*     */           CobbleDollars.INSTANCE.getLOGGER().error("Failed to load the default shop config! Using default config until the following has been addressed:");
/*     */           exception.printStackTrace();
/*     */         } 
/*     */       } else {
/*     */         CobbleDollars.INSTANCE.setShopConfig(new ShopConfig());
/*     */         save();
/*     */       } 
/*     */     }
/*     */     
/*     */     public final void save() {
/*     */       try {
/*     */         CobbleDollars.INSTANCE.getLOGGER().info("Creating default shop config...");
/*     */         File configFile = new File("config/cobbledollars/default_shop.json");
/*     */         FileWriter writer = new FileWriter(configFile);
/*     */         getGSON().toJson(CobbleDollars.INSTANCE.getShopConfig(), writer);
/*     */         writer.close();
/*     */         CobbleDollars.INSTANCE.getLOGGER().info("Default shop config created!");
/*     */       } catch (Exception exception) {
/*     */         CobbleDollars.INSTANCE.getLOGGER().error("Failed to create the default shop config! Please consult the following stack trace:");
/*     */         exception.printStackTrace();
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   
/*     */   @NotNull
/*     */   private Shop defaultShop;
/*     */   
/*     */   @NotNull
/*     */   public static final String PATH = "config/cobbledollars/default_shop.json";
/*     */   
/*     */   @NotNull
/*     */   private static final Gson GSON = (new GsonBuilder()).disableHtmlEscaping().setPrettyPrinting().registerTypeAdapter(Shop.class, new ShopAdapter()).create();
/*     */   
/*     */   static {
/*     */     Intrinsics.checkNotNullExpressionValue((new GsonBuilder()).disableHtmlEscaping().setPrettyPrinting().registerTypeAdapter(Shop.class, new ShopAdapter()).create(), "create(...)");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final class_1799 stick() {
/*     */     class_1799 stickItem = new class_1799((class_1935)class_1802.field_8600);
/*     */     Intrinsics.checkNotNullExpressionValue(class_2561.method_43470("TEST"), "literal(...)");
/*     */     stickItem.method_57379(class_9334.field_50239, TextKt.gold(class_2561.method_43470("TEST")));
/*     */     stickItem.method_57379(class_9334.field_50073, class_1814.field_8904);
/*     */     stickItem.method_57379(class_9334.field_49636, class_9285.method_57480().method_57487(class_5134.field_23719, new class_1322(class_2960.method_60655("test", "stick"), 5.0D, class_1322.class_1323.field_6330), class_9274.field_49217).method_57486());
/*     */     stickItem.method_57379(class_9334.field_50075, (new class_4174.class_4175()).method_19238(3).method_19237(0.3F).method_19242());
/*     */     return stickItem;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Shop getDefaultShop() {
/*     */     return this.defaultShop;
/*     */   }
/*     */   
/*     */   public final void setDefaultShop(@NotNull Shop <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.defaultShop = <set-?>;
/*     */   }
/*     */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\config\ShopConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */