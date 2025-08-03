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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\r\020\005\032\0020\004¢\006\004\b\005\020\003J\r\020\006\032\0020\004¢\006\004\b\006\020\003R\024\020\b\032\0020\0078\006XT¢\006\006\n\004\b\b\020\tR\027\020\013\032\0020\n8\006¢\006\f\n\004\b\013\020\f\032\004\b\r\020\016¨\006\017"}, d2 = {"Lfr/harmex/cobbledollars/common/config/CommonConfig$Companion;", "", "<init>", "()V", "", "load", "save", "", "PATH", "Ljava/lang/String;", "Lcom/google/gson/Gson;", "GSON", "Lcom/google/gson/Gson;", "getGSON", "()Lcom/google/gson/Gson;", "common"})
/*    */ public final class Companion {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final Gson getGSON() {
/* 15 */     return CommonConfig.access$getGSON$cp();
/*    */   }
/*    */   
/*    */   public final void load() {
/* 21 */     File configFile = new File("config/cobbledollars/common.json");
/* 22 */     configFile.getParentFile().mkdirs();
/* 24 */     if (configFile.exists()) {
/*    */       try {
/* 26 */         FileReader reader = new FileReader(configFile);
/* 27 */         CobbleDollars.INSTANCE.setConfig((CommonConfig)getGSON().fromJson(reader, CommonConfig.class));
/* 28 */         reader.close();
/* 29 */       } catch (Exception exception) {
/* 30 */         CobbleDollars.INSTANCE.setConfig(new CommonConfig());
/* 31 */         CobbleDollars.INSTANCE.getLOGGER().error("Failed to load the config! Using default config until the following has been addressed:");
/* 32 */         exception.printStackTrace();
/*    */       } 
/*    */     } else {
/* 35 */       CobbleDollars.INSTANCE.setConfig(new CommonConfig());
/* 36 */       save();
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void save() {
/*    */     try {
/* 42 */       File configFile = new File("config/cobbledollars/common.json");
/* 43 */       FileWriter writer = new FileWriter(configFile);
/* 44 */       getGSON().toJson(CobbleDollars.INSTANCE.getConfig(), writer);
/* 45 */       writer.close();
/* 46 */     } catch (Exception exception) {
/* 47 */       CobbleDollars.INSTANCE.getLOGGER().error("Failed to save the config! Please consult the following stack trace:");
/* 48 */       exception.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\config\CommonConfig$Companion.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */