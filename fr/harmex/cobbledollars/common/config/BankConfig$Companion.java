/*    */ package fr.harmex.cobbledollars.common.config;
/*    */ 
/*    */ import com.google.gson.Gson;
/*    */ import fr.harmex.cobbledollars.common.CobbleDollars;
/*    */ import java.io.File;
/*    */ import java.io.FileReader;
/*    */ import java.io.FileWriter;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\r\020\005\032\0020\004¢\006\004\b\005\020\003J\r\020\006\032\0020\004¢\006\004\b\006\020\003R\024\020\b\032\0020\0078\006XT¢\006\006\n\004\b\b\020\tR\027\020\013\032\0020\n8\006¢\006\f\n\004\b\013\020\f\032\004\b\r\020\016¨\006\017"}, d2 = {"Lfr/harmex/cobbledollars/common/config/BankConfig$Companion;", "", "<init>", "()V", "", "load", "save", "", "PATH", "Ljava/lang/String;", "Lcom/google/gson/Gson;", "GSON", "Lcom/google/gson/Gson;", "getGSON", "()Lcom/google/gson/Gson;", "common"})
/*    */ public final class Companion {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final Gson getGSON() {
/* 21 */     return BankConfig.access$getGSON$cp();
/*    */   }
/*    */   
/*    */   public final void load() {
/* 28 */     CobbleDollars.INSTANCE.getLOGGER().info("Loading bank config...");
/* 29 */     File configFile = new File("config/cobbledollars/bank.json");
/* 30 */     configFile.getParentFile().mkdirs();
/* 32 */     if (configFile.exists()) {
/*    */       try {
/* 34 */         FileReader reader = new FileReader(configFile);
/* 35 */         CobbleDollars.INSTANCE.setBankConfig((BankConfig)getGSON().fromJson(reader, BankConfig.class));
/* 36 */         reader.close();
/* 37 */         CobbleDollars.INSTANCE.getLOGGER().info("Bank config loaded!");
/* 38 */       } catch (Exception exception) {
/* 39 */         CobbleDollars.INSTANCE.setBankConfig(new BankConfig());
/* 40 */         CobbleDollars.INSTANCE.getLOGGER().error("Failed to load the bank config! Using default config until the following has been addressed:");
/* 41 */         exception.printStackTrace();
/*    */       } 
/*    */     } else {
/* 44 */       CobbleDollars.INSTANCE.setBankConfig(new BankConfig());
/* 45 */       save();
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void save() {
/*    */     try {
/* 51 */       CobbleDollars.INSTANCE.getLOGGER().info("Creating bank config...");
/* 52 */       File configFile = new File("config/cobbledollars/bank.json");
/* 53 */       FileWriter writer = new FileWriter(configFile);
/* 54 */       getGSON().toJson(CobbleDollars.INSTANCE.getBankConfig(), writer);
/* 55 */       writer.close();
/* 56 */       CobbleDollars.INSTANCE.getLOGGER().info("Bank config created!");
/* 57 */     } catch (Exception exception) {
/* 58 */       CobbleDollars.INSTANCE.getLOGGER().error("Failed to create the bank config! Please consult the following stack trace:");
/* 59 */       exception.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\config\BankConfig$Companion.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */