/*     */ package fr.harmex.cobbledollars.common.utils.extensions;
/*     */ 
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonNull;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.google.gson.stream.JsonReader;
/*     */ import com.google.gson.stream.JsonToken;
/*     */ import com.google.gson.stream.JsonWriter;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import com.mojang.serialization.JsonOps;
/*     */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Offer;
/*     */ import java.math.BigInteger;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import net.minecraft.class_1792;
/*     */ import net.minecraft.class_1799;
/*     */ import net.minecraft.class_1802;
/*     */ import net.minecraft.class_1856;
/*     */ import net.minecraft.class_1935;
/*     */ import net.minecraft.class_2960;
/*     */ import net.minecraft.class_6862;
/*     */ import net.minecraft.class_7923;
/*     */ import net.minecraft.class_7924;
/*     */ import net.minecraft.class_9326;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\020 \n\002\b\002\n\002\030\002\n\002\b\006\032\031\020\004\032\0020\003*\0020\0002\006\020\002\032\0020\001¢\006\004\b\004\020\005\032\027\020\b\032\b\022\004\022\0020\0010\007*\0020\006¢\006\004\b\b\020\t\032\031\020\f\032\0020\003*\0020\0002\006\020\013\032\0020\n¢\006\004\b\f\020\r\032\021\020\016\032\0020\n*\0020\006¢\006\004\b\016\020\017¨\006\020"}, d2 = {"Lcom/google/gson/stream/JsonWriter;", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;", "offer", "", "writeOffer", "(Lcom/google/gson/stream/JsonWriter;Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;)V", "Lcom/google/gson/stream/JsonReader;", "", "readOffers", "(Lcom/google/gson/stream/JsonReader;)Ljava/util/List;", "Lcom/google/gson/JsonElement;", "element", "writeJsonElement", "(Lcom/google/gson/stream/JsonWriter;Lcom/google/gson/JsonElement;)V", "readJsonElement", "(Lcom/google/gson/stream/JsonReader;)Lcom/google/gson/JsonElement;", "common"})
/*     */ @SourceDebugExtension({"SMAP\nJsonExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonExtensions.kt\nfr/harmex/cobbledollars/common/utils/extensions/JsonExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n13346#2:188\n13347#2:191\n1863#3,2:189\n1863#3,2:192\n*S KotlinDebug\n*F\n+ 1 JsonExtensions.kt\nfr/harmex/cobbledollars/common/utils/extensions/JsonExtensionsKt\n*L\n111#1:188\n111#1:191\n112#1:189,2\n122#1:192,2\n*E\n"})
/*     */ public final class JsonExtensionsKt {
/*     */   public static final void writeOffer(@NotNull JsonWriter $this$writeOffer, @NotNull Offer offer) {
/*  21 */     Intrinsics.checkNotNullParameter($this$writeOffer, "<this>");
/*  21 */     Intrinsics.checkNotNullParameter(offer, "offer");
/*  21 */     $this$writeOffer.beginObject();
/*  23 */     $this$writeOffer.name("item").value(class_7923.field_41178.method_10221(offer.getItem().method_7909()).toString());
/*  24 */     $this$writeOffer.name("price").value(offer.getPrice());
/*  25 */     class_9326 changedComponents = offer.getItem().method_57380();
/*  26 */     if (!changedComponents.method_57848()) {
/*  27 */       JsonElement componentsJson = (JsonElement)class_9326.field_49589.encodeStart((DynamicOps)JsonOps.INSTANCE, changedComponents).getOrThrow();
/*  28 */       Intrinsics.checkNotNullExpressionValue($this$writeOffer.name("components"), "name(...)");
/*  28 */       Intrinsics.checkNotNull(componentsJson);
/*  28 */       writeJsonElement($this$writeOffer.name("components"), componentsJson);
/*     */     } 
/*  31 */     $this$writeOffer.endObject();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final List<Offer> readOffers(@NotNull JsonReader $this$readOffers) {
/*     */     Object test;
/*     */     int $i$f$forEach;
/*     */     Iterator<String> iterator;
/*  35 */     Intrinsics.checkNotNullParameter($this$readOffers, "<this>");
/*  35 */     ArrayList<Offer> offers = new ArrayList();
/*  36 */     $this$readOffers.beginObject();
/*  38 */     ArrayList<String> errorMessage = new ArrayList();
/*  39 */     boolean hasError = false;
/*  41 */     class_1856 ingredient = class_1856.field_9017;
/*  42 */     Object customComponents = null;
/*  42 */     customComponents = class_9326.field_49588;
/*  43 */     Object price = null;
/*  43 */     price = BigInteger.ZERO;
/*  44 */     int stock = 0;
/*  44 */     stock = -1;
/*  46 */     while ($this$readOffers.hasNext()) {
/*  47 */       test = $this$readOffers.nextName();
/*  47 */       if (test != null) {
/*     */         String itemId;
/*     */         String priceString;
/*     */         String tagId;
/*     */         class_1792 item;
/*     */         BigInteger priceKey;
/*     */         class_1935[] arrayOfClass_1935;
/*  47 */         switch (test.hashCode()) {
/*     */           case 3242771:
/*  47 */             if (!test.equals("item"))
/*     */               continue; 
/*  49 */             itemId = $this$readOffers.nextString();
/*  50 */             Intrinsics.checkNotNullExpressionValue(class_7923.field_41178.method_10223(class_2960.method_12829(itemId)), "get(...)");
/*  50 */             item = (class_1792)class_7923.field_41178.method_10223(class_2960.method_12829(itemId));
/*  51 */             if (Intrinsics.areEqual(item, class_1802.field_8162)) {
/*  52 */               hasError = true;
/*  53 */               errorMessage.add(" - Incorrect item: \"" + itemId + "\" [" + $this$readOffers + "], skipping...");
/*     */               continue;
/*     */             } 
/*  55 */             arrayOfClass_1935 = new class_1935[1];
/*  55 */             arrayOfClass_1935[0] = (class_1935)item;
/*  55 */             ingredient = class_1856.method_8091(arrayOfClass_1935);
/*     */           case -447446250:
/*     */             if (!test.equals("components"))
/*     */               continue; 
/*     */             try {
/*  78 */               customComponents = class_9326.field_49589.parse((DynamicOps)JsonOps.INSTANCE, readJsonElement($this$readOffers)).getOrThrow();
/*  79 */             } catch (Exception e) {
/*     */               class_6862 tagKey;
/*  80 */               hasError = true;
/*  81 */               errorMessage.add(" - Incorrect components: " + tagKey.getMessage() + " [" + $this$readOffers + "], skipping...");
/*     */             } 
/*     */           case 106934601:
/*     */             if (!test.equals("price"))
/*     */               continue; 
/*  85 */             priceString = $this$readOffers.nextString();
/*  86 */             Intrinsics.checkNotNull(priceString);
/*  86 */             priceKey = MiscUtilsKt.parseBigIntegerOrNull(priceString);
/*  87 */             if (priceKey != null) {
/*  88 */               price = priceKey;
/*     */               continue;
/*     */             } 
/*  90 */             hasError = true;
/*  91 */             errorMessage.add(" - Incorrect price: \"" + priceString + "\" [" + $this$readOffers + "], skipping...");
/*     */           case 114586:
/*     */             if (!test.equals("tag"))
/*     */               continue; 
/*     */             tagId = $this$readOffers.nextString();
/*     */             try {
/*     */               Intrinsics.checkNotNull(tagId);
/*     */               class_6862 class_6862 = StringsKt.startsWith$default(tagId, "#", false, 2, null) ? (class_6862)class_6862.method_40093(class_7924.field_41197).parse((DynamicOps)JsonOps.INSTANCE, new JsonPrimitive(tagId)).getOrThrow() : (class_6862)class_6862.method_40090(class_7924.field_41197).parse((DynamicOps)JsonOps.INSTANCE, new JsonPrimitive(tagId)).getOrThrow();
/*     */               ingredient = class_1856.method_8106(class_6862);
/*     */             } catch (Exception e) {
/*     */               hasError = true;
/*     */               errorMessage.add(" - Error parsing tag \"" + tagId + "\": " + e.getMessage() + " [" + $this$readOffers + "], skipping...");
/*     */             } 
/*     */             Intrinsics.checkNotNullExpressionValue(ingredient.method_8105(), "getItems(...)");
/*     */             if ((((Object[])ingredient.method_8105()).length == 0)) {
/*     */               hasError = true;
/*     */               errorMessage.add(" - Incorrect tag: \"" + tagId + "\" [" + $this$readOffers + "], skipping...");
/*     */             } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 108 */     $this$readOffers.endObject();
/* 110 */     if (!hasError) {
/* 111 */       Intrinsics.checkNotNullExpressionValue(ingredient.method_8105(), "getItems(...)");
/* 111 */       Object[] $this$forEach$iv = (Object[])ingredient.method_8105();
/* 111 */       int i = 0;
/* 188 */       $i$f$forEach = 0;
/* 188 */       int j = $this$forEach$iv.length;
/*     */     } else {
/*     */       test = null;
/*     */       test = "";
/*     */       Iterable<String> $this$forEach$iv = errorMessage;
/*     */       $i$f$forEach = 0;
/* 192 */       iterator = $this$forEach$iv.iterator();
/* 192 */       if (iterator.hasNext()) {
/* 192 */         Object element$iv = iterator.next();
/* 192 */         String it = (String)element$iv;
/* 192 */         int $i$a$-forEach-JsonExtensionsKt$readOffers$2 = 0;
/*     */         test = "" + test + "\n" + test;
/*     */       } 
/*     */     } 
/*     */     if ($i$f$forEach < iterator) {
/*     */       Object element$iv = test[$i$f$forEach];
/*     */       class_1799 stack = (class_1799)element$iv;
/*     */       int $i$a$-forEach-JsonExtensionsKt$readOffers$1 = 0;
/*     */       Intrinsics.checkNotNullExpressionValue(((class_9326)customComponents).method_57846(), "entrySet(...)");
/*     */       Iterable $this$forEach$iv = ((class_9326)customComponents).method_57846();
/*     */       int i = 0;
/*     */       Iterator iterator1 = $this$forEach$iv.iterator();
/*     */     } 
/*     */     return offers;
/*     */   }
/*     */   
/*     */   public static final void writeJsonElement(@NotNull JsonWriter $this$writeJsonElement, @NotNull JsonElement element) {
/*     */     Intrinsics.checkNotNullParameter($this$writeJsonElement, "<this>");
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     if (element.isJsonNull()) {
/*     */       $this$writeJsonElement.nullValue();
/*     */     } else if (element.isJsonPrimitive()) {
/*     */       JsonPrimitive primitive = element.getAsJsonPrimitive();
/*     */       primitive.isBoolean() ? $this$writeJsonElement.value(primitive.getAsBoolean()) : (primitive.isNumber() ? $this$writeJsonElement.value(primitive.getAsNumber()) : $this$writeJsonElement.value(primitive.getAsString()));
/*     */     } else if (element.isJsonArray()) {
/*     */       $this$writeJsonElement.beginArray();
/*     */       Intrinsics.checkNotNullExpressionValue(element.getAsJsonArray().iterator(), "iterator(...)");
/*     */       for (JsonElement child : element.getAsJsonArray()) {
/*     */         Intrinsics.checkNotNull(child);
/*     */         writeJsonElement($this$writeJsonElement, child);
/*     */       } 
/*     */       $this$writeJsonElement.endArray();
/*     */     } else if (element.isJsonObject()) {
/*     */       $this$writeJsonElement.beginObject();
/*     */       for (Map.Entry entry : element.getAsJsonObject().entrySet()) {
/*     */         Intrinsics.checkNotNull(entry);
/*     */         String key = (String)entry.getKey();
/*     */         JsonElement value = (JsonElement)entry.getValue();
/*     */         $this$writeJsonElement.name(key);
/*     */         Intrinsics.checkNotNull(value);
/*     */         writeJsonElement($this$writeJsonElement, value);
/*     */       } 
/*     */       $this$writeJsonElement.endObject();
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final JsonElement readJsonElement(@NotNull JsonReader $this$readJsonElement) {
/*     */     JsonObject jsonObject;
/*     */     JsonArray jsonArray;
/*     */     JsonNull jsonNull;
/*     */     Intrinsics.checkNotNullParameter($this$readJsonElement, "<this>");
/*     */     $this$readJsonElement.peek();
/*     */     switch (($this$readJsonElement.peek() == null) ? -1 : WhenMappings.$EnumSwitchMapping$0[$this$readJsonElement.peek().ordinal()]) {
/*     */       case true:
/*     */         jsonObject = new JsonObject();
/*     */         $this$readJsonElement.beginObject();
/*     */         while ($this$readJsonElement.hasNext()) {
/*     */           String name = $this$readJsonElement.nextName();
/*     */           jsonObject.add(name, readJsonElement($this$readJsonElement));
/*     */         } 
/*     */         $this$readJsonElement.endObject();
/*     */       case true:
/*     */         jsonArray = new JsonArray();
/*     */         $this$readJsonElement.beginArray();
/*     */         while ($this$readJsonElement.hasNext())
/*     */           jsonArray.add(readJsonElement($this$readJsonElement)); 
/*     */         $this$readJsonElement.endArray();
/*     */       case true:
/*     */       
/*     */       case true:
/*     */       
/*     */       case true:
/*     */       
/*     */       case true:
/*     */         $this$readJsonElement.nextNull();
/*     */         jsonNull = JsonNull.INSTANCE;
/*     */         Intrinsics.checkNotNull(jsonNull);
/*     */     } 
/*     */     throw new IllegalStateException("Unexpected token: " + $this$readJsonElement.peek());
/*     */   }
/*     */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\commo\\utils\extensions\JsonExtensionsKt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */