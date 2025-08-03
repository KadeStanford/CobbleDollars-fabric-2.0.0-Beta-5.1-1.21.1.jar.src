/*    */ package fr.harmex.cobbledollars.common.utils.adapters;
/*    */ 
/*    */ import com.google.gson.TypeAdapter;
/*    */ import com.google.gson.stream.JsonReader;
/*    */ import com.google.gson.stream.JsonWriter;
/*    */ import fr.harmex.cobbledollars.common.client.utils.OverlayPosition;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\004\030\0002\b\022\004\022\0020\0020\001B\007¢\006\004\b\003\020\004J\037\020\t\032\0020\b2\006\020\006\032\0020\0052\006\020\007\032\0020\002H\026¢\006\004\b\t\020\nJ\027\020\r\032\0020\0022\006\020\f\032\0020\013H\026¢\006\004\b\r\020\016¨\006\017"}, d2 = {"Lfr/harmex/cobbledollars/common/utils/adapters/OverlayPositionAdapter;", "Lcom/google/gson/TypeAdapter;", "Lfr/harmex/cobbledollars/common/client/utils/OverlayPosition;", "<init>", "()V", "Lcom/google/gson/stream/JsonWriter;", "writer", "overlayPosition", "", "write", "(Lcom/google/gson/stream/JsonWriter;Lfr/harmex/cobbledollars/common/client/utils/OverlayPosition;)V", "Lcom/google/gson/stream/JsonReader;", "reader", "read", "(Lcom/google/gson/stream/JsonReader;)Lfr/harmex/cobbledollars/common/client/utils/OverlayPosition;", "common"})
/*    */ public final class OverlayPositionAdapter extends TypeAdapter<OverlayPosition> {
/*    */   public void write(@NotNull JsonWriter writer, @NotNull OverlayPosition overlayPosition) {
/* 10 */     Intrinsics.checkNotNullParameter(writer, "writer");
/* 10 */     Intrinsics.checkNotNullParameter(overlayPosition, "overlayPosition");
/* 10 */     writer.value(overlayPosition.getKey());
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public OverlayPosition read(@NotNull JsonReader reader) {
/* 14 */     Intrinsics.checkNotNullParameter(reader, "reader");
/* 14 */     Intrinsics.checkNotNullExpressionValue(reader.nextString(), "nextString(...)");
/* 14 */     if (OverlayPosition.Companion.byName(reader.nextString()) == null)
/* 14 */       OverlayPosition.Companion.byName(reader.nextString()); 
/* 14 */     return OverlayPosition.BOTTOM_RIGHT;
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\commo\\utils\adapters\OverlayPositionAdapter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */