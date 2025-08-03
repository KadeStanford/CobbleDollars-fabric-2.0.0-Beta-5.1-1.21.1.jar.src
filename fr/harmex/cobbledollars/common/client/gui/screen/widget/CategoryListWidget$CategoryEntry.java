/*     */ package fr.harmex.cobbledollars.common.client.gui.screen.widget;
/*     */ 
/*     */ import com.cobblemon.mod.common.api.gui.GuiUtilsKt;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import fr.harmex.cobbledollars.common.client.utils.GuiUtilsKt;
/*     */ import fr.harmex.cobbledollars.common.world.inventory.ShopMenu;
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Category;
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Shop;
/*     */ import java.util.ArrayList;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.class_2561;
/*     */ import net.minecraft.class_332;
/*     */ import net.minecraft.class_364;
/*     */ import net.minecraft.class_4280;
/*     */ import net.minecraft.class_5250;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\006\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\007\n\002\020\007\n\000\n\002\020\002\n\002\b\036\b\004\030\0002\f\022\b\022\0060\000R\0020\0020\001B\033\022\b\020\004\032\004\030\0010\003\022\b\b\002\020\006\032\0020\005¢\006\004\b\007\020\bJ\017\020\n\032\0020\tH\026¢\006\004\b\n\020\013J'\020\021\032\0020\0052\006\020\r\032\0020\f2\006\020\016\032\0020\f2\006\020\020\032\0020\017H\026¢\006\004\b\021\020\022J_\020\036\032\0020\0352\006\020\024\032\0020\0232\006\020\025\032\0020\0172\006\020\026\032\0020\0172\006\020\027\032\0020\0172\006\020\030\032\0020\0172\006\020\031\032\0020\0172\006\020\r\032\0020\0172\006\020\016\032\0020\0172\006\020\032\032\0020\0052\006\020\034\032\0020\033H\026¢\006\004\b\036\020\037J\035\020 \032\0020\0052\006\020\r\032\0020\0172\006\020\016\032\0020\017¢\006\004\b \020!J_\020#\032\0020\0352\006\020\024\032\0020\0232\006\020\025\032\0020\0172\006\020\026\032\0020\0172\006\020\027\032\0020\0172\006\020\030\032\0020\0172\006\020\031\032\0020\0172\006\020\r\032\0020\0172\006\020\016\032\0020\0172\006\020\"\032\0020\0052\006\020\034\032\0020\033H\026¢\006\004\b#\020\037R\031\020\004\032\004\030\0010\0038\006¢\006\f\n\004\b\004\020$\032\004\b%\020&R\027\020\006\032\0020\0058\006¢\006\f\n\004\b\006\020'\032\004\b\006\020(R$\020)\032\004\030\0010\0178\006@\006X\016¢\006\022\n\004\b)\020*\032\004\b+\020,\"\004\b-\020.R$\020/\032\004\030\0010\0178\006@\006X\016¢\006\022\n\004\b/\020*\032\004\b0\020,\"\004\b1\020.R\"\0202\032\0020\0178\006@\006X\016¢\006\022\n\004\b2\0203\032\004\b4\0205\"\004\b6\0207R\"\0208\032\0020\0178\006@\006X\016¢\006\022\n\004\b8\0203\032\004\b9\0205\"\004\b:\0207¨\006;"}, d2 = {"Lfr/harmex/cobbledollars/common/client/gui/screen/widget/CategoryListWidget$CategoryEntry;", "Lnet/minecraft/class_4280$class_4281;", "Lfr/harmex/cobbledollars/common/client/gui/screen/widget/CategoryListWidget;", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;", "category", "", "isAddCategory", "<init>", "(Lfr/harmex/cobbledollars/common/client/gui/screen/widget/CategoryListWidget;Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;Z)V", "Lnet/minecraft/class_5250;", "getNarration", "()Lnet/minecraft/class_5250;", "", "mouseX", "mouseY", "", "button", "mouseClicked", "(DDI)Z", "Lnet/minecraft/class_332;", "guiGraphics", "index", "top", "left", "width", "height", "hovering", "", "partialTick", "", "render", "(Lnet/minecraft/class_332;IIIIIIIZF)V", "isMouseOverCross", "(II)Z", "isMouseOver", "renderBack", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;", "getCategory", "()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;", "Z", "()Z", "categoryIndex", "Ljava/lang/Integer;", "getCategoryIndex", "()Ljava/lang/Integer;", "setCategoryIndex", "(Ljava/lang/Integer;)V", "listIndex", "getListIndex", "setListIndex", "x", "I", "getX", "()I", "setX", "(I)V", "y", "getY", "setY", "common"})
/*     */ public final class CategoryEntry extends class_4280.class_4281<CategoryListWidget.CategoryEntry> {
/*     */   @Nullable
/*     */   private final Category category;
/*     */   
/*     */   private final boolean isAddCategory;
/*     */   
/*     */   @Nullable
/*     */   private Integer categoryIndex;
/*     */   
/*     */   @Nullable
/*     */   private Integer listIndex;
/*     */   
/*     */   private int x;
/*     */   
/*     */   private int y;
/*     */   
/*     */   public CategoryEntry(Category category, boolean isAddCategory) {
/* 133 */     this.category = category;
/* 133 */     this.isAddCategory = isAddCategory;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Category getCategory() {
/* 133 */     return this.category;
/*     */   }
/*     */   
/*     */   public final boolean isAddCategory() {
/* 133 */     return this.isAddCategory;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public class_5250 getNarration() {
/* 134 */     if (this.category == null || this.category.getName() == null)
/* 134 */       this.category.getName(); 
/* 134 */     Intrinsics.checkNotNullExpressionValue(class_2561.method_43470(""), "literal(...)");
/* 134 */     return class_2561.method_43470("");
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Integer getCategoryIndex() {
/* 135 */     return this.categoryIndex;
/*     */   }
/*     */   
/*     */   public final void setCategoryIndex(@Nullable Integer <set-?>) {
/* 135 */     this.categoryIndex = <set-?>;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Integer getListIndex() {
/* 136 */     return this.listIndex;
/*     */   }
/*     */   
/*     */   public final void setListIndex(@Nullable Integer <set-?>) {
/* 136 */     this.listIndex = <set-?>;
/*     */   }
/*     */   
/*     */   public final int getX() {
/* 137 */     return this.x;
/*     */   }
/*     */   
/*     */   public final void setX(int <set-?>) {
/* 137 */     this.x = <set-?>;
/*     */   }
/*     */   
/*     */   public final int getY() {
/* 138 */     return this.y;
/*     */   }
/*     */   
/*     */   public final void setY(int <set-?>) {
/* 138 */     this.y = <set-?>;
/*     */   }
/*     */   
/*     */   public boolean method_25402(double mouseX, double mouseY, int button) {
/* 141 */     if (this.isAddCategory) {
/* 142 */       Shop.addCategory$default(((ShopMenu)CategoryListWidget.this.getShopScreen().method_17577()).getShop(), new Category("", new ArrayList()), null, 2, null);
/* 144 */       CategoryListWidget.this.createCategoryEntries();
/* 145 */       CategoryListWidget.this.method_25395((class_364)CategoryListWidget.access$getEntryAtPosition(CategoryListWidget.this, mouseX, mouseY));
/* 146 */     } else if (CategoryListWidget.this.getShopScreen().isEditMode() && Intrinsics.areEqual(CategoryListWidget.this.method_25334(), this) && isMouseOverCross((int)mouseX, (int)mouseY) && this.categoryIndex != null) {
/* 147 */       Intrinsics.checkNotNull(this.categoryIndex);
/* 147 */       ((ShopMenu)CategoryListWidget.this.getShopScreen().method_17577()).getShop().remove(this.categoryIndex.intValue());
/* 149 */       CategoryListWidget.this.createCategoryEntries();
/* 150 */       CategoryListWidget.this.method_25395((class_364)CategoryListWidget.access$getEntryAtPosition(CategoryListWidget.this, mouseX, mouseY));
/*     */     } 
/* 152 */     return !this.isAddCategory;
/*     */   }
/*     */   
/*     */   public void method_25343(@NotNull class_332 guiGraphics, int index, int top, int left, int width, int height, int mouseX, int mouseY, boolean hovering, float partialTick) {
/* 167 */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/* 167 */     this.listIndex = Integer.valueOf(index);
/* 168 */     this.x = left;
/* 169 */     this.y = top;
/* 171 */     if (this.isAddCategory) {
/* 172 */       guiGraphics.method_25300(
/* 173 */           (CategoryListWidget.access$getMinecraft$p(CategoryListWidget.this)).field_1772, 
/* 174 */           "+", 
/* 175 */           left + width / 2, 
/* 176 */           top + 3, 
/* 177 */           -1);
/* 180 */     } else if (CategoryListWidget.this.getShopScreen().isEditMode() && Intrinsics.areEqual(CategoryListWidget.this.method_25334(), this)) {
/* 181 */       CategoryListWidget.this.getShopScreen().getEditCategoryNameBox().method_46421(this.x + 3);
/* 182 */       CategoryListWidget.this.getShopScreen().getEditCategoryNameBox().method_46419(this.y + 3);
/* 183 */       CategoryListWidget.this.getShopScreen().getEditCategoryNameBox().method_25394(guiGraphics, mouseX, mouseY, partialTick);
/*     */     } else {
/* 185 */       guiGraphics.method_25303(
/* 186 */           (CategoryListWidget.access$getMinecraft$p(CategoryListWidget.this)).field_1772, 
/* 187 */           (this.category != null) ? this.category.getName() : null, 
/* 188 */           left + 3, 
/* 189 */           top + 3, 
/* 190 */           -1);
/*     */     } 
/* 195 */     if (CategoryListWidget.this.getShopScreen().isEditMode() && Intrinsics.areEqual(CategoryListWidget.this.method_25334(), this)) {
/* 197 */       Intrinsics.checkNotNullExpressionValue(guiGraphics.method_51448(), "pose(...)");
/* 197 */       GuiUtilsKt.blitk$default(guiGraphics.method_51448(), 
/* 198 */           GuiUtilsKt.getCROSS_LOCATION(), 
/* 199 */           Integer.valueOf(left + 59), 
/* 200 */           Integer.valueOf(top + 4), 
/* 201 */           Integer.valueOf(5), 
/* 202 */           Integer.valueOf(5), null, null, null, null, null, 
/* 203 */           Double.valueOf(!isMouseOverCross(mouseX, mouseY) ? 0.4D : 0.82D), 
/* 204 */           Double.valueOf(!isMouseOverCross(mouseX, mouseY) ? 0.4D : 0.24D), 
/* 205 */           Double.valueOf(!isMouseOverCross(mouseX, mouseY) ? 0.4D : 0.24D), null, false, 0.0F, 116672, null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final boolean isMouseOverCross(int mouseX, int mouseY) {
/* 211 */     int i = this.x + 59;
/* 211 */     if ((mouseX < this.x + 64) ? ((i <= mouseX)) : false) {
/* 211 */       i = this.y + 4;
/* 211 */       if ((mouseY < this.y + 9) ? ((i <= mouseY)) : false);
/*     */     } 
/* 211 */     return false;
/*     */   }
/*     */   
/*     */   public void method_49568(@NotNull class_332 guiGraphics, int index, int top, int left, int width, int height, int mouseX, int mouseY, boolean isMouseOver, float partialTick) {
/* 226 */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/* 226 */     if (CategoryListWidget.access$scrollbarVisible(CategoryListWidget.this)) {
/* 227 */       guiGraphics.method_25290(CategoryListWidget.access$getCATEGORY_BACKGROUND_SHORT_LOCATION$cp(), left + 1, top + 1, 0.0F, 0.0F, 63, 11, 63, 11);
/*     */     } else {
/* 229 */       guiGraphics.method_25290(CategoryListWidget.access$getCATEGORY_BACKGROUND_LOCATION$cp(), left + 1, top + 1, 0.0F, 0.0F, 69, 11, 69, 11);
/*     */     } 
/* 232 */     if (isMouseOver) {
/* 233 */       RenderSystem.enableBlend();
/* 234 */       guiGraphics.method_25294(left + 1, top + 1, left + width - 1, top + CategoryListWidget.access$getItemHeight$p(CategoryListWidget.this) - 1, 553648127);
/* 235 */       RenderSystem.disableBlend();
/*     */     } 
/* 238 */     if (CategoryListWidget.access$isSelectedItem(CategoryListWidget.this, index))
/* 239 */       if (CategoryListWidget.access$scrollbarVisible(CategoryListWidget.this)) {
/* 240 */         guiGraphics.method_25290(CategoryListWidget.access$getCATEGORY_OUTLINE_SHORT_LOCATION$cp(), left, top - 3, 0.0F, 0.0F, 70, 19, 70, 19);
/*     */       } else {
/* 242 */         guiGraphics.method_25290(CategoryListWidget.access$getCATEGORY_OUTLINE_LOCATION$cp(), left, top - 3, 0.0F, 0.0F, 76, 19, 76, 19);
/*     */       }  
/*     */   }
/*     */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\client\gui\screen\widget\CategoryListWidget$CategoryEntry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */