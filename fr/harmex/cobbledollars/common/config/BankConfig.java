/*    */ package fr.harmex.cobbledollars.common.config;
/*    */ 
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ import fr.harmex.cobbledollars.common.CobbleDollars;
/*    */ import fr.harmex.cobbledollars.common.utils.adapters.BankAdapter;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Bank;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Offer;
/*    */ import java.io.File;
/*    */ import java.io.FileReader;
/*    */ import java.io.FileWriter;
/*    */ import java.math.BigInteger;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1799;
/*    */ import net.minecraft.class_1802;
/*    */ import net.minecraft.class_1935;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\b\030\000 \0132\0020\001:\001\013B\007¢\006\004\b\002\020\003R\"\020\005\032\0020\0048\006@\006X\016¢\006\022\n\004\b\005\020\006\032\004\b\007\020\b\"\004\b\t\020\n¨\006\f"}, d2 = {"Lfr/harmex/cobbledollars/common/config/BankConfig;", "", "<init>", "()V", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Bank;", "bank", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Bank;", "getBank", "()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Bank;", "setBank", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Bank;)V", "Companion", "common"})
/*    */ public final class BankConfig {
/*    */   public BankConfig() {
/* 65 */     Offer[] arrayOfOffer = new Offer[1];
/* 65 */     arrayOfOffer[0] = new Offer(new class_1799((class_1935)class_1802.field_8687), new BigInteger("750"), 0, 4, null);
/* 65 */     this.bank = new Bank(arrayOfOffer);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\r\020\005\032\0020\004¢\006\004\b\005\020\003J\r\020\006\032\0020\004¢\006\004\b\006\020\003R\024\020\b\032\0020\0078\006XT¢\006\006\n\004\b\b\020\tR\027\020\013\032\0020\n8\006¢\006\f\n\004\b\013\020\f\032\004\b\r\020\016¨\006\017"}, d2 = {"Lfr/harmex/cobbledollars/common/config/BankConfig$Companion;", "", "<init>", "()V", "", "load", "save", "", "PATH", "Ljava/lang/String;", "Lcom/google/gson/Gson;", "GSON", "Lcom/google/gson/Gson;", "getGSON", "()Lcom/google/gson/Gson;", "common"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final Gson getGSON() {
/*    */       return BankConfig.GSON;
/*    */     }
/*    */     
/*    */     public final void load() {
/*    */       CobbleDollars.INSTANCE.getLOGGER().info("Loading bank config...");
/*    */       File configFile = new File("config/cobbledollars/bank.json");
/*    */       configFile.getParentFile().mkdirs();
/*    */       if (configFile.exists()) {
/*    */         try {
/*    */           FileReader reader = new FileReader(configFile);
/*    */           CobbleDollars.INSTANCE.setBankConfig((BankConfig)getGSON().fromJson(reader, BankConfig.class));
/*    */           reader.close();
/*    */           CobbleDollars.INSTANCE.getLOGGER().info("Bank config loaded!");
/*    */         } catch (Exception exception) {
/*    */           CobbleDollars.INSTANCE.setBankConfig(new BankConfig());
/*    */           CobbleDollars.INSTANCE.getLOGGER().error("Failed to load the bank config! Using default config until the following has been addressed:");
/*    */           exception.printStackTrace();
/*    */         } 
/*    */       } else {
/*    */         CobbleDollars.INSTANCE.setBankConfig(new BankConfig());
/*    */         save();
/*    */       } 
/*    */     }
/*    */     
/*    */     public final void save() {
/*    */       try {
/*    */         CobbleDollars.INSTANCE.getLOGGER().info("Creating bank config...");
/*    */         File configFile = new File("config/cobbledollars/bank.json");
/*    */         FileWriter writer = new FileWriter(configFile);
/*    */         getGSON().toJson(CobbleDollars.INSTANCE.getBankConfig(), writer);
/*    */         writer.close();
/*    */         CobbleDollars.INSTANCE.getLOGGER().info("Bank config created!");
/*    */       } catch (Exception exception) {
/*    */         CobbleDollars.INSTANCE.getLOGGER().error("Failed to create the bank config! Please consult the following stack trace:");
/*    */         exception.printStackTrace();
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @NotNull
/*    */   private Bank bank;
/*    */   
/*    */   @NotNull
/*    */   public static final String PATH = "config/cobbledollars/bank.json";
/*    */   
/*    */   @NotNull
/*    */   private static final Gson GSON = (new GsonBuilder()).disableHtmlEscaping().setPrettyPrinting().registerTypeAdapter(Bank.class, new BankAdapter()).create();
/*    */   
/*    */   static {
/*    */     Intrinsics.checkNotNullExpressionValue((new GsonBuilder()).disableHtmlEscaping().setPrettyPrinting().registerTypeAdapter(Bank.class, new BankAdapter()).create(), "create(...)");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Bank getBank() {
/*    */     return this.bank;
/*    */   }
/*    */   
/*    */   public final void setBank(@NotNull Bank <set-?>) {
/*    */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */     this.bank = <set-?>;
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\config\BankConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */