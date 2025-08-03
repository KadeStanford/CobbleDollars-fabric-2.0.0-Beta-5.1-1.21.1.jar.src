/*    */ package fr.harmex.cobbledollars.common.utils.adapters;
/*    */ 
/*    */ import com.google.gson.TypeAdapter;
/*    */ import com.google.gson.stream.JsonReader;
/*    */ import com.google.gson.stream.JsonWriter;
/*    */ import fr.harmex.cobbledollars.common.CobbleDollars;
/*    */ import fr.harmex.cobbledollars.common.utils.extensions.JsonExtensionsKt;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Bank;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Offer;
/*    */ import java.util.Iterator;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\004\030\0002\b\022\004\022\0020\0020\001B\007¢\006\004\b\003\020\004J\037\020\t\032\0020\b2\006\020\006\032\0020\0052\006\020\007\032\0020\002H\026¢\006\004\b\t\020\nJ\027\020\r\032\0020\0022\006\020\f\032\0020\013H\026¢\006\004\b\r\020\016¨\006\017"}, d2 = {"Lfr/harmex/cobbledollars/common/utils/adapters/BankAdapter;", "Lcom/google/gson/TypeAdapter;", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Bank;", "<init>", "()V", "Lcom/google/gson/stream/JsonWriter;", "writer", "bank", "", "write", "(Lcom/google/gson/stream/JsonWriter;Lfr/harmex/cobbledollars/common/world/item/trading/shop/Bank;)V", "Lcom/google/gson/stream/JsonReader;", "reader", "read", "(Lcom/google/gson/stream/JsonReader;)Lfr/harmex/cobbledollars/common/world/item/trading/shop/Bank;", "common"})
/*    */ public final class BankAdapter extends TypeAdapter<Bank> {
/*    */   public void write(@NotNull JsonWriter writer, @NotNull Bank bank) {
/* 13 */     Intrinsics.checkNotNullParameter(writer, "writer");
/* 13 */     Intrinsics.checkNotNullParameter(bank, "bank");
/* 13 */     writer.beginArray();
/* 15 */     Intrinsics.checkNotNullExpressionValue(bank.iterator(), "iterator(...)");
/* 15 */     for (Iterator iterator = bank.iterator(); iterator.hasNext(); ) {
/* 15 */       Intrinsics.checkNotNullExpressionValue(iterator.next(), "next(...)");
/* 15 */       Offer offer = (Offer)iterator.next();
/* 16 */       JsonExtensionsKt.writeOffer(writer, offer);
/*    */     } 
/* 19 */     writer.endArray();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Bank read(@NotNull JsonReader reader) {
/* 23 */     Intrinsics.checkNotNullParameter(reader, "reader");
/* 23 */     Bank bank = new Bank();
/* 25 */     reader.beginArray();
/* 27 */     while (reader.hasNext()) {
/*    */       try {
/* 29 */         bank.addAll(JsonExtensionsKt.readOffers(reader));
/* 30 */       } catch (Exception e) {
/* 31 */         CobbleDollars.INSTANCE.getLOGGER().error("Error(s) found:" + e.getMessage());
/*    */       } 
/*    */     } 
/* 35 */     reader.endArray();
/* 37 */     return bank;
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\commo\\utils\adapters\BankAdapter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */