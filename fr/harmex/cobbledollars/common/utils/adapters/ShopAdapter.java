/*    */ package fr.harmex.cobbledollars.common.utils.adapters;
/*    */ 
/*    */ import com.google.gson.TypeAdapter;
/*    */ import com.google.gson.stream.JsonReader;
/*    */ import com.google.gson.stream.JsonWriter;
/*    */ import fr.harmex.cobbledollars.common.CobbleDollars;
/*    */ import fr.harmex.cobbledollars.common.utils.extensions.JsonExtensionsKt;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Category;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Offer;
/*    */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Shop;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Iterator;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\004\030\0002\b\022\004\022\0020\0020\001B\007¢\006\004\b\003\020\004J\037\020\t\032\0020\b2\006\020\006\032\0020\0052\006\020\007\032\0020\002H\026¢\006\004\b\t\020\nJ\027\020\r\032\0020\0022\006\020\f\032\0020\013H\026¢\006\004\b\r\020\016¨\006\017"}, d2 = {"Lfr/harmex/cobbledollars/common/utils/adapters/ShopAdapter;", "Lcom/google/gson/TypeAdapter;", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "<init>", "()V", "Lcom/google/gson/stream/JsonWriter;", "writer", "shop", "", "write", "(Lcom/google/gson/stream/JsonWriter;Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;)V", "Lcom/google/gson/stream/JsonReader;", "reader", "read", "(Lcom/google/gson/stream/JsonReader;)Lfr/harmex/cobbledollars/common/world/item/trading/shop/Shop;", "common"})
/*    */ public final class ShopAdapter extends TypeAdapter<Shop> {
/*    */   public void write(@NotNull JsonWriter writer, @NotNull Shop shop) {
/* 16 */     Intrinsics.checkNotNullParameter(writer, "writer");
/* 16 */     Intrinsics.checkNotNullParameter(shop, "shop");
/* 16 */     writer.beginArray();
/* 18 */     Intrinsics.checkNotNullExpressionValue(shop.iterator(), "iterator(...)");
/* 18 */     for (Iterator iterator = shop.iterator(); iterator.hasNext(); ) {
/* 18 */       Intrinsics.checkNotNullExpressionValue(iterator.next(), "next(...)");
/* 18 */       Category category = (Category)iterator.next();
/* 19 */       writer.beginObject();
/* 20 */       writer.name(category.getName());
/* 21 */       writer.beginArray();
/* 23 */       Intrinsics.checkNotNullExpressionValue(category.getOffers().iterator(), "iterator(...)");
/* 23 */       for (Iterator iterator1 = category.getOffers().iterator(); iterator1.hasNext(); ) {
/* 23 */         Intrinsics.checkNotNullExpressionValue(iterator1.next(), "next(...)");
/* 23 */         Offer offer = (Offer)iterator1.next();
/* 24 */         JsonExtensionsKt.writeOffer(writer, offer);
/*    */       } 
/* 27 */       writer.endArray();
/* 28 */       writer.endObject();
/*    */     } 
/* 31 */     writer.endArray();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Shop read(@NotNull JsonReader reader) {
/* 35 */     Intrinsics.checkNotNullParameter(reader, "reader");
/* 35 */     Shop shop = new Shop();
/* 37 */     reader.beginArray();
/* 39 */     while (reader.hasNext()) {
/* 40 */       reader.beginObject();
/* 42 */       String categoryName = reader.nextName();
/* 44 */       reader.beginArray();
/* 46 */       ArrayList offers = new ArrayList();
/* 47 */       while (reader.hasNext()) {
/*    */         try {
/* 49 */           offers.addAll(JsonExtensionsKt.readOffers(reader));
/* 50 */         } catch (Exception e) {
/* 51 */           CobbleDollars.INSTANCE.getLOGGER().error("Error(s) found in the category \"" + categoryName + "\":" + e.getMessage());
/*    */         } 
/*    */       } 
/* 55 */       Intrinsics.checkNotNull(categoryName);
/* 55 */       shop.add(new Category(categoryName, offers));
/* 56 */       reader.endArray();
/* 57 */       reader.endObject();
/*    */     } 
/* 60 */     reader.endArray();
/* 61 */     return shop;
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\commo\\utils\adapters\ShopAdapter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */