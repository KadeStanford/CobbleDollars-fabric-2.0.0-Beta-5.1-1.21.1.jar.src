/*     */ package fr.harmex.cobbledollars.common.client.gui.screen.widget;
/*     */ 
/*     */ import com.cobblemon.mod.common.api.gui.GuiUtilsKt;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import fr.harmex.cobbledollars.common.client.utils.Context;
/*     */ import fr.harmex.cobbledollars.common.client.utils.GuiUtilsKt;
/*     */ import fr.harmex.cobbledollars.common.utils.extensions.PlayerExtensionKt;
/*     */ import fr.harmex.cobbledollars.common.world.inventory.ShopMenu;
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Category;
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Offer;
/*     */ import java.math.BigInteger;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.class_1657;
/*     */ import net.minecraft.class_1799;
/*     */ import net.minecraft.class_2561;
/*     */ import net.minecraft.class_332;
/*     */ import net.minecraft.class_364;
/*     */ import net.minecraft.class_4280;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\006\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\007\n\002\020\007\n\000\n\002\020\002\n\002\b\013\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\033\b\004\030\0002\f\022\b\022\0060\000R\0020\0020\001B\033\022\b\b\002\020\004\032\0020\003\022\b\b\002\020\006\032\0020\005¢\006\004\b\007\020\bJ\017\020\n\032\0020\tH\026¢\006\004\b\n\020\013J'\020\021\032\0020\0052\006\020\r\032\0020\f2\006\020\016\032\0020\f2\006\020\020\032\0020\017H\026¢\006\004\b\021\020\022J_\020\036\032\0020\0352\006\020\024\032\0020\0232\006\020\025\032\0020\0172\006\020\026\032\0020\0172\006\020\027\032\0020\0172\006\020\030\032\0020\0172\006\020\031\032\0020\0172\006\020\r\032\0020\0172\006\020\016\032\0020\0172\006\020\032\032\0020\0052\006\020\034\032\0020\033H\026¢\006\004\b\036\020\037J\035\020 \032\0020\0052\006\020\r\032\0020\0172\006\020\016\032\0020\017¢\006\004\b \020!J_\020#\032\0020\0352\006\020\024\032\0020\0232\006\020\025\032\0020\0172\006\020\026\032\0020\0172\006\020\027\032\0020\0172\006\020\030\032\0020\0172\006\020\031\032\0020\0172\006\020\r\032\0020\0172\006\020\016\032\0020\0172\006\020\"\032\0020\0052\006\020\034\032\0020\033H\026¢\006\004\b#\020\037R\027\020\004\032\0020\0038\006¢\006\f\n\004\b\004\020$\032\004\b%\020&R\027\020\006\032\0020\0058\006¢\006\f\n\004\b\006\020'\032\004\b\006\020(R$\020/\032\0020)2\006\020*\032\0020)8F@FX\016¢\006\f\032\004\b+\020,\"\004\b-\020.R$\0205\032\002002\006\020*\032\002008F@FX\016¢\006\f\032\004\b1\0202\"\004\b3\0204R$\020:\032\0020\0172\006\020*\032\0020\0178F@FX\016¢\006\f\032\004\b6\0207\"\004\b8\0209R$\020;\032\004\030\0010\0178\006@\006X\016¢\006\022\n\004\b;\020<\032\004\b=\020>\"\004\b?\020@R$\020A\032\004\030\0010\0178\006@\006X\016¢\006\022\n\004\bA\020<\032\004\bB\020>\"\004\bC\020@R\"\020D\032\0020\0178\006@\006X\016¢\006\022\n\004\bD\020E\032\004\bF\0207\"\004\bG\0209R\"\020H\032\0020\0178\006@\006X\016¢\006\022\n\004\bH\020E\032\004\bI\0207\"\004\bJ\0209¨\006K"}, d2 = {"Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry;", "Lnet/minecraft/class_4280$class_4281;", "Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget;", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;", "offer", "", "isAddOffer", "<init>", "(Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget;Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;Z)V", "Lnet/minecraft/class_2561;", "getNarration", "()Lnet/minecraft/class_2561;", "", "mouseX", "mouseY", "", "button", "mouseClicked", "(DDI)Z", "Lnet/minecraft/class_332;", "guiGraphics", "index", "top", "left", "width", "height", "hovering", "", "partialTick", "", "render", "(Lnet/minecraft/class_332;IIIIIIIZF)V", "isMouseOverCross", "(II)Z", "isMouseOver", "renderBack", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;", "getOffer", "()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;", "Z", "()Z", "Lnet/minecraft/class_1799;", "value", "getItem", "()Lnet/minecraft/class_1799;", "setItem", "(Lnet/minecraft/class_1799;)V", "item", "Ljava/math/BigInteger;", "getPrice", "()Ljava/math/BigInteger;", "setPrice", "(Ljava/math/BigInteger;)V", "price", "getStock", "()I", "setStock", "(I)V", "stock", "offerIndex", "Ljava/lang/Integer;", "getOfferIndex", "()Ljava/lang/Integer;", "setOfferIndex", "(Ljava/lang/Integer;)V", "listIndex", "getListIndex", "setListIndex", "x", "I", "getX", "setX", "y", "getY", "setY", "common"})
/*     */ public final class OfferEntry extends class_4280.class_4281<OfferListWidget.OfferEntry> {
/*     */   @NotNull
/*     */   private final Offer offer;
/*     */   
/*     */   private final boolean isAddOffer;
/*     */   
/*     */   @Nullable
/*     */   private Integer offerIndex;
/*     */   
/*     */   @Nullable
/*     */   private Integer listIndex;
/*     */   
/*     */   private int x;
/*     */   
/*     */   private int y;
/*     */   
/*     */   public OfferEntry(Offer offer, boolean isAddOffer) {
/* 164 */     this.offer = offer;
/* 164 */     this.isAddOffer = isAddOffer;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Offer getOffer() {
/* 164 */     return this.offer;
/*     */   }
/*     */   
/*     */   public final boolean isAddOffer() {
/* 164 */     return this.isAddOffer;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final class_1799 getItem() {
/* 166 */     return this.offer.getItem();
/*     */   }
/*     */   
/*     */   public final void setItem(@NotNull class_1799 value) {
/* 168 */     Intrinsics.checkNotNullParameter(value, "value");
/* 168 */     this.offer.setItem(value);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final BigInteger getPrice() {
/* 171 */     return this.offer.getPrice();
/*     */   }
/*     */   
/*     */   public final void setPrice(@NotNull BigInteger value) {
/* 173 */     Intrinsics.checkNotNullParameter(value, "value");
/* 173 */     this.offer.setPrice(value);
/*     */   }
/*     */   
/*     */   public final int getStock() {
/* 176 */     return this.offer.getStock();
/*     */   }
/*     */   
/*     */   public final void setStock(int value) {
/* 178 */     this.offer.setStock(value);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public class_2561 method_37006() {
/* 180 */     Intrinsics.checkNotNullExpressionValue(getItem().method_7964(), "getHoverName(...)");
/* 180 */     return getItem().method_7964();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Integer getOfferIndex() {
/* 181 */     return this.offerIndex;
/*     */   }
/*     */   
/*     */   public final void setOfferIndex(@Nullable Integer <set-?>) {
/* 181 */     this.offerIndex = <set-?>;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Integer getListIndex() {
/* 182 */     return this.listIndex;
/*     */   }
/*     */   
/*     */   public final void setListIndex(@Nullable Integer <set-?>) {
/* 182 */     this.listIndex = <set-?>;
/*     */   }
/*     */   
/*     */   public final int getX() {
/* 183 */     return this.x;
/*     */   }
/*     */   
/*     */   public final void setX(int <set-?>) {
/* 183 */     this.x = <set-?>;
/*     */   }
/*     */   
/*     */   public final int getY() {
/* 184 */     return this.y;
/*     */   }
/*     */   
/*     */   public final void setY(int <set-?>) {
/* 184 */     this.y = <set-?>;
/*     */   }
/*     */   
/*     */   public boolean method_25402(double mouseX, double mouseY, int button) {
/* 187 */     if (this.isAddOffer) {
/* 188 */       class_1799 itemStack = ((ShopMenu)OfferListWidget.this.getShopScreen().method_17577()).method_34255().method_7972();
/* 189 */       if (!itemStack.method_7960()) {
/* 190 */         itemStack.method_7939(1);
/* 191 */         if (OfferListWidget.this.getShopScreen().getCategoryList().method_25334() != null) {
/* 192 */           Intrinsics.checkNotNull(OfferListWidget.this.getShopScreen().getCategoryList().method_25334());
/* 192 */           Intrinsics.checkNotNull(((CategoryListWidget.CategoryEntry)OfferListWidget.this.getShopScreen().getCategoryList().method_25334()).getCategoryIndex());
/* 192 */           Intrinsics.checkNotNull(itemStack);
/* 192 */           Intrinsics.checkNotNullExpressionValue(BigInteger.ZERO, "ZERO");
/* 192 */           ((Category)((ShopMenu)OfferListWidget.this.getShopScreen().method_17577()).getShop().get(((CategoryListWidget.CategoryEntry)OfferListWidget.this.getShopScreen().getCategoryList().method_25334()).getCategoryIndex().intValue())).add(itemStack, BigInteger.ZERO);
/* 194 */           (CategoryListWidget.CategoryEntry)OfferListWidget.this.getShopScreen().getCategoryList().method_25334();
/* 194 */           OfferListWidget.this.createOfferEntries(((CategoryListWidget.CategoryEntry)OfferListWidget.this.getShopScreen().getCategoryList().method_25334() != null) ? ((CategoryListWidget.CategoryEntry)OfferListWidget.this.getShopScreen().getCategoryList().method_25334()).getCategory() : null);
/* 195 */           OfferListWidget.this.method_25395((class_364)OfferListWidget.access$getEntryAtPosition(OfferListWidget.this, mouseX, mouseY));
/*     */         } 
/*     */       } 
/* 198 */     } else if (OfferListWidget.this.getShopScreen().isEditMode() && Intrinsics.areEqual(OfferListWidget.this.method_25334(), this) && isMouseOverCross((int)mouseX, (int)mouseY) && OfferListWidget.this.getShopScreen().getCategoryList().method_25334() != null && this.offerIndex != null) {
/* 199 */       Intrinsics.checkNotNull(OfferListWidget.this.getShopScreen().getCategoryList().method_25334());
/* 199 */       Intrinsics.checkNotNull(((CategoryListWidget.CategoryEntry)OfferListWidget.this.getShopScreen().getCategoryList().method_25334()).getCategoryIndex());
/* 199 */       Intrinsics.checkNotNull(this.offerIndex);
/* 199 */       ((Category)((ShopMenu)OfferListWidget.this.getShopScreen().method_17577()).getShop().get(((CategoryListWidget.CategoryEntry)OfferListWidget.this.getShopScreen().getCategoryList().method_25334()).getCategoryIndex().intValue())).getOffers().remove(this.offerIndex.intValue());
/* 201 */       (CategoryListWidget.CategoryEntry)OfferListWidget.this.getShopScreen().getCategoryList().method_25334();
/* 201 */       OfferListWidget.this.createOfferEntries(((CategoryListWidget.CategoryEntry)OfferListWidget.this.getShopScreen().getCategoryList().method_25334() != null) ? ((CategoryListWidget.CategoryEntry)OfferListWidget.this.getShopScreen().getCategoryList().method_25334()).getCategory() : null);
/* 202 */       OfferListWidget.this.method_25395((class_364)OfferListWidget.access$getEntryAtPosition(OfferListWidget.this, mouseX, mouseY));
/*     */     } 
/* 204 */     return !this.isAddOffer;
/*     */   }
/*     */   
/*     */   public void method_25343(@NotNull class_332 guiGraphics, int index, int top, int left, int width, int height, int mouseX, int mouseY, boolean hovering, float partialTick) {
/* 219 */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/* 219 */     this.listIndex = Integer.valueOf(index);
/* 220 */     this.x = left;
/* 221 */     this.y = top;
/* 223 */     if (this.isAddOffer) {
/* 224 */       guiGraphics.method_25300((OfferListWidget.access$getMinecraft$p(OfferListWidget.this)).field_1772, "+", left + 37, top + 5, -1);
/*     */     } else {
/* 226 */       guiGraphics.method_51427(getItem(), left + 1, top + 1);
/* 227 */       guiGraphics.method_51431((OfferListWidget.access$getMinecraft$p(OfferListWidget.this)).field_1772, getItem(), left + 1, top + 1);
/* 229 */       boolean drawAmount = true;
/* 230 */       if (OfferListWidget.this.getShopScreen().isEditMode() && Intrinsics.areEqual(OfferListWidget.this.method_25334(), this)) {
/* 231 */         OfferListWidget.this.getShopScreen().getEditOfferPriceBox().method_46421(this.x + 24);
/* 232 */         OfferListWidget.this.getShopScreen().getEditOfferPriceBox().method_46419(this.y + 5);
/* 233 */         OfferListWidget.this.getShopScreen().getEditOfferPriceBox().method_25394(guiGraphics, mouseX, mouseY, partialTick);
/* 234 */         drawAmount = false;
/*     */       } 
/* 237 */       Intrinsics.checkNotNull((OfferListWidget.access$getMinecraft$p(OfferListWidget.this)).field_1724);
/* 237 */       int color = (getStock() == 0 || PlayerExtensionKt.getCobbleDollars((class_1657)(OfferListWidget.access$getMinecraft$p(OfferListWidget.this)).field_1724).compareTo(getPrice()) < 0) ? 11149344 : 16777215;
/* 238 */       GuiUtilsKt.renderCobbleDollarsElement$default(guiGraphics, 
/* 239 */           left + 19, 
/* 240 */           top + 2, 
/* 241 */           drawAmount, 
/* 242 */           getPrice(), false, 
/* 243 */           Context.SHOP, 
/* 244 */           Integer.valueOf(color), 16, null);
/*     */     } 
/* 248 */     if (OfferListWidget.this.getShopScreen().isEditMode() && Intrinsics.areEqual(OfferListWidget.this.method_25334(), this)) {
/* 250 */       Intrinsics.checkNotNullExpressionValue(guiGraphics.method_51448(), "pose(...)");
/* 250 */       GuiUtilsKt.blitk$default(guiGraphics.method_51448(), 
/* 251 */           GuiUtilsKt.getCROSS_LOCATION(), 
/* 252 */           Integer.valueOf(left + 67), 
/* 253 */           Integer.valueOf(top + 3), 
/* 254 */           Integer.valueOf(5), 
/* 255 */           Integer.valueOf(5), null, null, null, null, null, 
/* 256 */           Double.valueOf(!isMouseOverCross(mouseX, mouseY) ? 0.4D : 0.82D), 
/* 257 */           Double.valueOf(!isMouseOverCross(mouseX, mouseY) ? 0.4D : 0.24D), 
/* 258 */           Double.valueOf(!isMouseOverCross(mouseX, mouseY) ? 0.4D : 0.24D), null, false, 0.0F, 116672, null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final boolean isMouseOverCross(int mouseX, int mouseY) {
/* 264 */     int i = this.x + 67;
/* 264 */     if ((mouseX < this.x + 72) ? ((i <= mouseX)) : false) {
/* 264 */       i = this.y + 3;
/* 264 */       if ((mouseY < this.y + 8) ? ((i <= mouseY)) : false);
/*     */     } 
/* 264 */     return false;
/*     */   }
/*     */   
/*     */   public void method_49568(@NotNull class_332 guiGraphics, int index, int top, int left, int width, int height, int mouseX, int mouseY, boolean isMouseOver, float partialTick) {
/* 279 */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/* 279 */     guiGraphics.method_25290(OfferListWidget.access$getOFFER_BACKGROUND_LOCATION$cp(), left + 1, top + 1, 0.0F, 0.0F, 73, 16, 73, 16);
/* 281 */     if (isMouseOver || OfferListWidget.access$isSelectedItem(OfferListWidget.this, index)) {
/* 282 */       RenderSystem.enableBlend();
/* 283 */       guiGraphics.method_25294(left + 1, top + 1, left + width - 1, top + OfferListWidget.access$getItemHeight$p(OfferListWidget.this) - 1, 553648127);
/* 284 */       RenderSystem.disableBlend();
/* 285 */       guiGraphics.method_25290(OfferListWidget.access$getOFFER_OUTLINE_LOCATION$cp(), left, top, 0.0F, 0.0F, 75, 18, 75, 18);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\client\gui\screen\widget\OfferListWidget$OfferEntry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */