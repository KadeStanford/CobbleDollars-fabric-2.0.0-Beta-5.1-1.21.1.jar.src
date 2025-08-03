/*     */ package fr.harmex.cobbledollars.common.world.item.trading.shop;
/*     */ 
/*     */ import com.cobblemon.mod.common.api.text.TextKt;
/*     */ import fr.harmex.cobbledollars.common.utils.CobbleDollarsPlayer;
/*     */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*     */ import fr.harmex.cobbledollars.common.utils.extensions.BigIntegerExtensionsKt;
/*     */ import java.math.BigInteger;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.class_124;
/*     */ import net.minecraft.class_1657;
/*     */ import net.minecraft.class_1792;
/*     */ import net.minecraft.class_1799;
/*     */ import net.minecraft.class_1836;
/*     */ import net.minecraft.class_2561;
/*     */ import net.minecraft.class_2564;
/*     */ import net.minecraft.class_310;
/*     */ import net.minecraft.class_332;
/*     */ import net.minecraft.class_5244;
/*     */ import net.minecraft.class_5250;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\003\n\002\020\013\n\002\b\033\030\000 72\0020\001:\0017B!\022\006\020\003\032\0020\002\022\006\020\005\032\0020\004\022\b\b\002\020\007\032\0020\006¢\006\004\b\b\020\tB#\b\026\022\006\020\003\032\0020\002\022\006\020\005\032\0020\006\022\b\b\002\020\007\032\0020\006¢\006\004\b\b\020\nJ\027\020\016\032\0020\r2\b\020\f\032\004\030\0010\013¢\006\004\b\016\020\017J\027\020\021\032\0020\0202\b\020\f\032\004\030\0010\013¢\006\004\b\021\020\022J-\020\032\032\0020\0312\006\020\024\032\0020\0232\006\020\026\032\0020\0252\006\020\027\032\0020\0062\006\020\030\032\0020\006¢\006\004\b\032\020\033J\025\020\036\032\0020\0352\006\020\034\032\0020\002¢\006\004\b\036\020\037J\r\020 \032\0020\000¢\006\004\b \020!J\017\020\"\032\0020\006H\026¢\006\004\b\"\020#J\032\020%\032\0020\0352\b\020$\032\004\030\0010\001H\002¢\006\004\b%\020&J\027\020'\032\0020\0352\b\020$\032\004\030\0010\000¢\006\004\b'\020(R\"\020\003\032\0020\0028\006@\006X\016¢\006\022\n\004\b\003\020)\032\004\b*\020+\"\004\b,\020-R\"\020\005\032\0020\0048\006@\006X\016¢\006\022\n\004\b\005\020.\032\004\b/\0200\"\004\b1\0202R\"\020\007\032\0020\0068\006@\006X\016¢\006\022\n\004\b\007\0203\032\004\b4\020#\"\004\b5\0206¨\0068"}, d2 = {"Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;", "", "Lnet/minecraft/class_1799;", "item", "Ljava/math/BigInteger;", "price", "", "stock", "<init>", "(Lnet/minecraft/class_1799;Ljava/math/BigInteger;I)V", "(Lnet/minecraft/class_1799;II)V", "Lnet/minecraft/class_1657;", "player", "Lnet/minecraft/class_2561;", "getHoverName", "(Lnet/minecraft/class_1657;)Lnet/minecraft/class_2561;", "Lnet/minecraft/class_5250;", "getDisplayName", "(Lnet/minecraft/class_1657;)Lnet/minecraft/class_5250;", "Lnet/minecraft/class_310;", "minecraft", "Lnet/minecraft/class_332;", "guiGraphics", "mouseX", "mouseY", "", "renderTooltip", "(Lnet/minecraft/class_310;Lnet/minecraft/class_332;II)V", "itemStack", "", "isItem", "(Lnet/minecraft/class_1799;)Z", "copy", "()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "equalsWithoutStock", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;)Z", "Lnet/minecraft/class_1799;", "getItem", "()Lnet/minecraft/class_1799;", "setItem", "(Lnet/minecraft/class_1799;)V", "Ljava/math/BigInteger;", "getPrice", "()Ljava/math/BigInteger;", "setPrice", "(Ljava/math/BigInteger;)V", "I", "getStock", "setStock", "(I)V", "Companion", "common"})
/*     */ public final class Offer {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   
/*     */   @NotNull
/*     */   private class_1799 item;
/*     */   
/*     */   @NotNull
/*     */   private BigInteger price;
/*     */   
/*     */   private int stock;
/*     */   
/*     */   public Offer(@NotNull class_1799 item, @NotNull BigInteger price, int stock) {
/*  24 */     this.item = item;
/*  24 */     this.price = price;
/*  24 */     this.stock = stock;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final class_1799 getItem() {
/*  24 */     return this.item;
/*     */   }
/*     */   
/*     */   public final void setItem(@NotNull class_1799 <set-?>) {
/*  24 */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*  24 */     this.item = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final BigInteger getPrice() {
/*  24 */     return this.price;
/*     */   }
/*     */   
/*     */   public final void setPrice(@NotNull BigInteger <set-?>) {
/*  24 */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*  24 */     this.price = <set-?>;
/*     */   }
/*     */   
/*     */   public final int getStock() {
/*  24 */     return this.stock;
/*     */   }
/*     */   
/*     */   public final void setStock(int <set-?>) {
/*  24 */     this.stock = <set-?>;
/*     */   }
/*     */   
/*     */   public Offer(@NotNull class_1799 item, int price, int stock) {
/*  25 */     this(item, BigInteger.valueOf(price), stock);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\027\020\007\032\0020\0062\b\020\005\032\004\030\0010\004¢\006\004\b\007\020\b¨\006\t"}, d2 = {"Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer$Companion;", "", "<init>", "()V", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;", "offer", "", "hashItemAndPrice", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;)I", "common"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     public final int hashItemAndPrice(@Nullable Offer offer) {
/*  29 */       if (offer == null)
/*  29 */         return 0; 
/*  30 */       int hash = 31 + class_1799.method_57355(offer.getItem());
/*  31 */       hash = 31 * hash + offer.getPrice().hashCode();
/*  32 */       return hash;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final class_2561 getHoverName(@Nullable class_1657 player) {
/*  37 */     class_124 color = class_124.field_1060;
/*  38 */     if (player instanceof CobbleDollarsPlayer)
/*  39 */       color = (((CobbleDollarsPlayer)player).cobbleDollars$getCobbleDollars().compareTo(this.price) >= 0) ? class_124.field_1060 : class_124.field_1061; 
/*  42 */     class_5250 name = class_2561.method_43473()
/*  43 */       .method_10852((class_2561)this.item.method_7964().method_27661()).method_27692(this.item.method_7932().method_58413())
/*  44 */       .method_10852(class_5244.field_41874)
/*  45 */       .method_10852((class_2561)BigIntegerExtensionsKt.formatFull$default(this.price, false, 1, null).method_27692(color));
/*  47 */     if (this.stock == 0) {
/*  48 */       Intrinsics.checkNotNullExpressionValue(class_2561.method_43470(" Out of Stock!"), "literal(...)");
/*  48 */       name.method_10852((class_2561)TextKt.red(class_2561.method_43470(" Out of Stock!")));
/*     */     } 
/*  51 */     Intrinsics.checkNotNull(name);
/*  51 */     return (class_2561)name;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final class_5250 getDisplayName(@Nullable class_1657 player) {
/*  54 */     Intrinsics.checkNotNullExpressionValue(class_2564.method_10885((class_2561)this.item.method_7964().method_27661().method_10852((class_2561)MiscUtilsKt.toComponent(" ")).method_10852((class_2561)TextKt.green(BigIntegerExtensionsKt.format$default(this.price, false, 1, null)))), "wrapInSquareBrackets(...)");
/*  54 */     return TextKt.onHover(class_2564.method_10885((class_2561)this.item.method_7964().method_27661().method_10852((class_2561)MiscUtilsKt.toComponent(" ")).method_10852((class_2561)TextKt.green(BigIntegerExtensionsKt.format$default(this.price, false, 1, null)))), getHoverName(player));
/*     */   }
/*     */   
/*     */   public final void renderTooltip(@NotNull class_310 minecraft, @NotNull class_332 guiGraphics, int mouseX, int mouseY) {
/*  57 */     Intrinsics.checkNotNullParameter(minecraft, "minecraft");
/*  57 */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/*  57 */     List<class_2561> tooltipLines = this.item.method_7950(
/*  58 */         class_1792.class_9635.method_59528((minecraft.field_1724 != null) ? minecraft.field_1724.method_37908() : null), 
/*  59 */         (class_1657)minecraft.field_1724, 
/*  60 */         minecraft.field_1690.field_1827 ? (class_1836)class_1836.field_41071 : (class_1836)class_1836.field_41070);
/*  62 */     tooltipLines.set(0, getHoverName((class_1657)minecraft.field_1724));
/*  64 */     guiGraphics.method_51437(minecraft.field_1772, tooltipLines, Optional.empty(), mouseX, mouseY);
/*     */   }
/*     */   
/*     */   public final boolean isItem(@NotNull class_1799 itemStack) {
/*  67 */     Intrinsics.checkNotNullParameter(itemStack, "itemStack");
/*  67 */     return MiscUtilsKt.isSame(this.item, itemStack);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Offer copy() {
/*  69 */     return new Offer(this.item, this.price, this.stock);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*  72 */     int result = this.stock;
/*  73 */     result = 31 * result + class_1799.method_57355(this.item);
/*  74 */     result = 31 * result + this.price.hashCode();
/*  75 */     return result;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*  79 */     if (this == other)
/*  79 */       return true; 
/*  80 */     if (hashCode() == ((other != null) ? other.hashCode() : 0))
/*  80 */       return true; 
/*  81 */     if (!Intrinsics.areEqual(getClass(), (other != null) ? other.getClass() : null))
/*  81 */       return false; 
/*  83 */     Intrinsics.checkNotNull(other, "null cannot be cast to non-null type fr.harmex.cobbledollars.common.world.item.trading.shop.Offer");
/*  83 */     (Offer)other;
/*  85 */     if (this.stock != ((Offer)other).stock)
/*  85 */       return false; 
/*  86 */     if (!class_1799.method_31577(this.item, ((Offer)other).item))
/*  86 */       return false; 
/*  87 */     if (!Intrinsics.areEqual(this.price, ((Offer)other).price))
/*  87 */       return false; 
/*  89 */     return true;
/*     */   }
/*     */   
/*     */   public final boolean equalsWithoutStock(@Nullable Offer other) {
/*  93 */     if (this == other)
/*  93 */       return true; 
/*  94 */     if (Companion.hashItemAndPrice(this) == Companion.hashItemAndPrice(other))
/*  94 */       return true; 
/*  96 */     if (other == null)
/*  96 */       return false; 
/*  97 */     if (!class_1799.method_31577(this.item, other.item))
/*  97 */       return false; 
/*  98 */     if (!Intrinsics.areEqual(this.price, other.price))
/*  98 */       return false; 
/* 100 */     return true;
/*     */   }
/*     */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\world\item\trading\shop\Offer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */