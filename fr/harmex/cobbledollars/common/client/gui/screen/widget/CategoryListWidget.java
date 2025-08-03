/*     */ package fr.harmex.cobbledollars.common.client.gui.screen.widget;
/*     */ 
/*     */ import com.cobblemon.mod.common.api.gui.GuiUtilsKt;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import fr.harmex.cobbledollars.common.client.gui.screen.ShopScreen;
/*     */ import fr.harmex.cobbledollars.common.client.utils.GuiUtilsKt;
/*     */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*     */ import fr.harmex.cobbledollars.common.world.inventory.ShopMenu;
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Category;
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Shop;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import kotlin.text.StringsKt;
/*     */ import net.minecraft.class_2561;
/*     */ import net.minecraft.class_2960;
/*     */ import net.minecraft.class_310;
/*     */ import net.minecraft.class_332;
/*     */ import net.minecraft.class_350;
/*     */ import net.minecraft.class_364;
/*     */ import net.minecraft.class_4280;
/*     */ import net.minecraft.class_5250;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\020\002\n\002\b\002\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\022\n\002\020\007\n\002\b\017\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\005\030\000 B2\f\022\b\022\0060\002R\0020\0000\001:\002BCB\037\022\006\020\004\032\0020\003\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005¢\006\004\b\b\020\tJ\r\020\013\032\0020\n¢\006\004\b\013\020\fJ\025\020\017\032\0020\n2\006\020\016\032\0020\r¢\006\004\b\017\020\020J\025\020\021\032\0020\n2\006\020\016\032\0020\r¢\006\004\b\021\020\020J\027\020\024\032\0020\n2\006\020\023\032\0020\022H\024¢\006\004\b\024\020\025J'\020\030\032\0020\n2\006\020\023\032\0020\0222\006\020\026\032\0020\0052\006\020\027\032\0020\005H\024¢\006\004\b\030\020\031J\027\020\032\032\0020\n2\006\020\023\032\0020\022H\024¢\006\004\b\032\020\025J?\020 \032\0020\n2\006\020\023\032\0020\0222\006\020\033\032\0020\0052\006\020\034\032\0020\0052\006\020\035\032\0020\0052\006\020\036\032\0020\0052\006\020\037\032\0020\005H\024¢\006\004\b \020!J'\020$\032\0020\n2\006\020\023\032\0020\0222\006\020\"\032\0020\0052\006\020#\032\0020\005H\024¢\006\004\b$\020\031J/\020'\032\0020\n2\006\020\023\032\0020\0222\006\020\"\032\0020\0052\006\020#\032\0020\0052\006\020&\032\0020%H\026¢\006\004\b'\020(J\033\020*\032\0020\0052\n\020)\032\0060\002R\0020\000H\024¢\006\004\b*\020+J\017\020,\032\0020\005H\026¢\006\004\b,\020-J\017\020.\032\0020\005H\026¢\006\004\b.\020-J\017\020/\032\0020\005H\026¢\006\004\b/\020-J\027\0201\032\0020\0052\006\0200\032\0020\005H\024¢\006\004\b1\0202J\027\0203\032\0020\0052\006\0200\032\0020\005H\024¢\006\004\b3\0202J\017\0204\032\0020\005H\024¢\006\004\b4\020-J\031\0207\032\0020\n2\b\0206\032\004\030\00105H\026¢\006\004\b7\0208R\027\020\004\032\0020\0038\006¢\006\f\n\004\b\004\0209\032\004\b:\020;R\026\020<\032\0020\r8\002@\002X\016¢\006\006\n\004\b<\020=R\026\020>\032\0020\r8\002@\002X\016¢\006\006\n\004\b>\020=R\026\020@\032\0020?8\002@\002X\016¢\006\006\n\004\b@\020A¨\006D"}, d2 = {"Lfr/harmex/cobbledollars/common/client/gui/screen/widget/CategoryListWidget;", "Lnet/minecraft/class_4280;", "Lfr/harmex/cobbledollars/common/client/gui/screen/widget/CategoryListWidget$CategoryEntry;", "Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;", "shopScreen", "", "listX", "listY", "<init>", "(Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;II)V", "", "createCategoryEntries", "()V", "", "filter", "search", "(Ljava/lang/String;)V", "editCategoryName", "Lnet/minecraft/class_332;", "guiGraphics", "renderListBackground", "(Lnet/minecraft/class_332;)V", "x", "y", "renderHeader", "(Lnet/minecraft/class_332;II)V", "renderListSeparators", "top", "width", "height", "outerColor", "innerColor", "renderSelection", "(Lnet/minecraft/class_332;IIIII)V", "mouseX", "mouseY", "renderDecorations", "", "partialTick", "renderWidget", "(Lnet/minecraft/class_332;IIF)V", "entry", "addEntry", "(Lfr/harmex/cobbledollars/common/client/gui/screen/widget/CategoryListWidget$CategoryEntry;)I", "getRowWidth", "()I", "getRowLeft", "getRowRight", "index", "getRowTop", "(I)I", "getRowBottom", "getScrollbarPosition", "Lnet/minecraft/class_364;", "focused", "setFocused", "(Lnet/minecraft/class_364;)V", "Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;", "getShopScreen", "()Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;", "lastCategoryName", "Ljava/lang/String;", "lastSearch", "", "categoriesCreated", "Z", "Companion", "CategoryEntry", "common"})
/*     */ @SourceDebugExtension({"SMAP\nCategoryListWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryListWidget.kt\nfr/harmex/cobbledollars/common/client/gui/screen/widget/CategoryListWidget\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,247:1\n1557#2:248\n1628#2,3:249\n1863#2,2:252\n774#2:255\n865#2,2:256\n1557#2:258\n1628#2,3:259\n1863#2,2:262\n1#3:254\n*S KotlinDebug\n*F\n+ 1 CategoryListWidget.kt\nfr/harmex/cobbledollars/common/client/gui/screen/widget/CategoryListWidget\n*L\n49#1:248\n49#1:249,3\n53#1:252,2\n63#1:255\n63#1:256,2\n63#1:258\n63#1:259,3\n67#1:262,2\n*E\n"})
/*     */ public final class CategoryListWidget extends class_4280<CategoryListWidget.CategoryEntry> {
/*     */   @NotNull
/*     */   public final ShopScreen getShopScreen() {
/*  18 */     return this.shopScreen;
/*     */   }
/*     */   
/*     */   public CategoryListWidget(@NotNull ShopScreen shopScreen, int listX, int listY) {
/*  21 */     super(
/*  22 */         class_310.method_1551(), 
/*  23 */         78, 
/*  24 */         75, 
/*  25 */         listY, 
/*  26 */         13);
/*     */     this.shopScreen = shopScreen;
/*  39 */     method_46421(listX);
/*  40 */     method_46419(listY);
/*  42 */     this.lastCategoryName = "";
/*  43 */     this.lastSearch = "";
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\005\n\002\030\002\n\002\b\006\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\024\020\005\032\0020\0048\006XT¢\006\006\n\004\b\005\020\006R\024\020\007\032\0020\0048\006XT¢\006\006\n\004\b\007\020\006R\024\020\b\032\0020\0048\006XT¢\006\006\n\004\b\b\020\006R\024\020\t\032\0020\0048\006XT¢\006\006\n\004\b\t\020\006R\024\020\013\032\0020\n8\002X\004¢\006\006\n\004\b\013\020\fR\024\020\r\032\0020\n8\002X\004¢\006\006\n\004\b\r\020\fR\024\020\016\032\0020\n8\002X\004¢\006\006\n\004\b\016\020\fR\024\020\017\032\0020\n8\002X\004¢\006\006\n\004\b\017\020\f¨\006\020"}, d2 = {"Lfr/harmex/cobbledollars/common/client/gui/screen/widget/CategoryListWidget$Companion;", "", "<init>", "()V", "", "WIDTH", "I", "HEIGHT", "ENTRY_WIDTH", "ENTRY_HEIGHT", "Lnet/minecraft/class_2960;", "CATEGORY_BACKGROUND_LOCATION", "Lnet/minecraft/class_2960;", "CATEGORY_BACKGROUND_SHORT_LOCATION", "CATEGORY_OUTLINE_LOCATION", "CATEGORY_OUTLINE_SHORT_LOCATION", "common"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   
/*     */   @NotNull
/*     */   private final ShopScreen shopScreen;
/*     */   
/*     */   @NotNull
/*     */   private String lastCategoryName;
/*     */   
/*     */   @NotNull
/*     */   private String lastSearch;
/*     */   
/*     */   private boolean categoriesCreated;
/*     */   
/*     */   public static final int WIDTH = 78;
/*     */   
/*     */   public static final int HEIGHT = 75;
/*     */   
/*     */   public static final int ENTRY_WIDTH = 71;
/*     */   
/*     */   public static final int ENTRY_HEIGHT = 13;
/*     */   
/*     */   @NotNull
/*     */   private static final class_2960 CATEGORY_BACKGROUND_LOCATION = MiscUtilsKt.cobbleDollarsResource("textures/gui/shop/category_background.png");
/*     */   
/*     */   @NotNull
/*     */   private static final class_2960 CATEGORY_BACKGROUND_SHORT_LOCATION = MiscUtilsKt.cobbleDollarsResource("textures/gui/shop/category_background_short.png");
/*     */   
/*     */   @NotNull
/*     */   private static final class_2960 CATEGORY_OUTLINE_LOCATION = MiscUtilsKt.cobbleDollarsResource("textures/gui/shop/category_outline.png");
/*     */   
/*     */   @NotNull
/*     */   private static final class_2960 CATEGORY_OUTLINE_SHORT_LOCATION = MiscUtilsKt.cobbleDollarsResource("textures/gui/shop/category_outline_short.png");
/*     */   
/*     */   public final void createCategoryEntries() {
/*  47 */     ((CategoryEntry)method_25334()).getListIndex();
/*  47 */     int selectedIndex = ((CategoryEntry)method_25334() != null && ((CategoryEntry)method_25334()).getListIndex() != null) ? ((CategoryEntry)method_25334()).getListIndex().intValue() : 0;
/*  48 */     method_25339();
/*  49 */     Iterable $this$map$iv = (Iterable)((ShopMenu)this.shopScreen.method_17577()).getShop();
/*  49 */     int $i$f$map = 0;
/* 248 */     Iterable iterable1 = $this$map$iv;
/* 248 */     Collection<CategoryEntry> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
/* 248 */     int $i$f$mapTo = 0;
/* 249 */     for (Object item$iv$iv : iterable1) {
/* 250 */       Category category = (Category)item$iv$iv;
/* 250 */       Collection<CategoryEntry> collection = destination$iv$iv;
/* 250 */       int $i$a$-map-CategoryListWidget$createCategoryEntries$1 = 0;
/*     */       CategoryEntry entry = new CategoryEntry(category, false, 2, null);
/*     */       entry.setCategoryIndex(Integer.valueOf(((ShopMenu)this.shopScreen.method_17577()).getShop().indexOf(category)));
/* 250 */       collection.add(entry);
/*     */     } 
/* 251 */     $this$map$iv = destination$iv$iv;
/*     */     int $i$f$forEach = 0;
/* 252 */     Iterator iterator = $this$map$iv.iterator();
/* 252 */     if (iterator.hasNext()) {
/* 252 */       Object element$iv = iterator.next();
/* 252 */       CategoryEntry p0 = (CategoryEntry)element$iv;
/* 252 */       int $i$a$-forEach-CategoryListWidget$createCategoryEntries$2 = 0;
/*     */       addEntry(p0);
/*     */     } 
/*     */     if (this.shopScreen.isEditMode())
/*     */       addEntry(new CategoryEntry(null, true)); 
/*     */     method_25307(RangesKt.coerceAtMost(method_25341(), method_25331()));
/*     */     Intrinsics.checkNotNullExpressionValue(method_25396(), "children(...)");
/*     */     Iterable<class_364> $this$forEach$iv = method_25396();
/*     */     $i$f$forEach = selectedIndex;
/* 254 */     CategoryListWidget categoryListWidget = this;
/* 254 */     int $i$a$-getOrElse-CategoryListWidget$createCategoryEntries$3 = 0;
/*     */     Intrinsics.checkNotNullExpressionValue(method_25396(), "children(...)");
/*     */     categoryListWidget.method_25395(((0 <= selectedIndex) ? ((selectedIndex < $this$forEach$iv.size())) : false) ? $this$forEach$iv.get(selectedIndex) : (class_364)CollectionsKt.firstOrNull(method_25396()));
/*     */     this.categoriesCreated = true;
/*     */   }
/*     */   
/*     */   public final void search(@NotNull String filter) {
/*     */     Iterator iterator;
/*     */     Intrinsics.checkNotNullParameter(filter, "filter");
/*     */     if (!Intrinsics.areEqual(filter, this.lastSearch)) {
/*     */       method_25339();
/*     */       Iterable $this$filter$iv = (Iterable)((ShopMenu)this.shopScreen.method_17577()).getShop();
/*     */       int $i$f$filter = 0;
/* 255 */       Iterable iterable1 = $this$filter$iv;
/* 255 */       Collection<Object> collection = new ArrayList();
/* 255 */       int $i$f$filterTo = 0;
/* 256 */       for (Object element$iv$iv : iterable1) {
/* 256 */         Category it = (Category)element$iv$iv;
/* 256 */         int $i$a$-filter-CategoryListWidget$search$1 = 0;
/*     */         if (StringsKt.contains(it.getName(), filter, true))
/* 256 */           collection.add(element$iv$iv); 
/*     */       } 
/* 257 */       $this$filter$iv = collection;
/*     */       int $i$f$map = 0;
/* 258 */       Iterable $this$filterTo$iv$iv = $this$filter$iv;
/* 258 */       Collection<CategoryEntry> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10));
/* 258 */       int $i$f$mapTo = 0;
/* 259 */       for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 260 */         Category category = (Category)item$iv$iv;
/* 260 */         Collection<CategoryEntry> collection1 = destination$iv$iv;
/* 260 */         int $i$a$-map-CategoryListWidget$search$2 = 0;
/*     */         CategoryEntry entry = new CategoryEntry(category, false, 2, null);
/*     */         entry.setCategoryIndex(Integer.valueOf(((ShopMenu)this.shopScreen.method_17577()).getShop().indexOf(category)));
/* 260 */         collection1.add(entry);
/*     */       } 
/* 261 */       Iterable $this$map$iv = destination$iv$iv;
/*     */       int $i$f$forEach = 0;
/* 262 */       iterator = $this$map$iv.iterator();
/*     */     } else {
/*     */       return;
/*     */     } 
/* 262 */     if (iterator.hasNext()) {
/* 262 */       Object element$iv = iterator.next();
/* 262 */       CategoryEntry p0 = (CategoryEntry)element$iv;
/* 262 */       int $i$a$-forEach-CategoryListWidget$search$3 = 0;
/*     */       addEntry(p0);
/*     */     } 
/*     */     if (this.shopScreen.isEditMode())
/*     */       addEntry(new CategoryEntry(null, true)); 
/*     */     method_25307((method_25341() > method_25331()) ? method_25331() : method_25341());
/*     */     this.lastSearch = filter;
/*     */   }
/*     */   
/*     */   public final void editCategoryName(@NotNull String filter) {
/*     */     Intrinsics.checkNotNullParameter(filter, "filter");
/*     */     if (this.shopScreen.isEditMode() && !Intrinsics.areEqual(filter, this.lastCategoryName) && method_25334() != null) {
/*     */       (CategoryEntry)method_25334();
/*     */       if (((CategoryEntry)method_25334() != null) ? (!((CategoryEntry)method_25334()).isAddCategory()) : false) {
/*     */         (CategoryEntry)method_25334();
/*     */         if ((((CategoryEntry)method_25334() != null) ? ((CategoryEntry)method_25334()).getCategoryIndex() : null) != null) {
/*     */           Intrinsics.checkNotNull(method_25334());
/*     */           Intrinsics.checkNotNull(((CategoryEntry)method_25334()).getCategoryIndex());
/*     */           ((Category)((ShopMenu)this.shopScreen.method_17577()).getShop().get(((CategoryEntry)method_25334()).getCategoryIndex().intValue())).setName(filter);
/*     */           Intrinsics.checkNotNull(method_25334());
/*     */           if (((CategoryEntry)method_25334()).getCategory() != null) {
/*     */             ((CategoryEntry)method_25334()).getCategory().setName(filter);
/*     */           } else {
/*     */             ((CategoryEntry)method_25334()).getCategory();
/*     */           } 
/*     */           this.lastCategoryName = filter;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void method_57715(@NotNull class_332 guiGraphics) {
/*     */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/*     */   }
/*     */   
/*     */   protected void method_25312(@NotNull class_332 guiGraphics, int x, int y) {
/*     */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/*     */   }
/*     */   
/*     */   protected void method_57713(@NotNull class_332 guiGraphics) {
/*     */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/*     */   }
/*     */   
/*     */   protected void method_44398(@NotNull class_332 guiGraphics, int top, int width, int height, int outerColor, int innerColor) {
/*     */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/*     */   }
/*     */   
/*     */   protected void method_25320(@NotNull class_332 guiGraphics, int mouseX, int mouseY) {
/*     */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/*     */     guiGraphics.method_25296(method_46426() + (method_57717() ? 6 : 0), method_46427(), method_55442() - 3, method_46427() + 4, -2147483648, 0);
/*     */     guiGraphics.method_25296(method_46426() + (method_57717() ? 6 : 0), method_55443() - 4, method_55442() - 3, method_55443(), 0, -2147483648);
/*     */     if (!method_57717()) {
/*     */       guiGraphics.method_25301(method_46426(), method_46427(), method_46427(), -10000537);
/*     */       guiGraphics.method_25301(method_46426(), method_55443() - 1, method_55443() - 1, -10000537);
/*     */     } 
/*     */     guiGraphics.method_25301(method_55442() - 4, method_46427(), method_46427(), -10000537);
/*     */     guiGraphics.method_25301(method_55442() - 4, method_55443() - 1, method_55443() - 1, -10000537);
/*     */   }
/*     */   
/*     */   public void method_48579(@NotNull class_332 guiGraphics, int mouseX, int mouseY, float partialTick) {
/*     */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/*     */     if (this.categoriesCreated)
/*     */       super.method_48579(guiGraphics, mouseX, mouseY, partialTick); 
/*     */   }
/*     */   
/*     */   protected int addEntry(@NotNull CategoryEntry entry) {
/*     */     Intrinsics.checkNotNullParameter(entry, "entry");
/*     */     return super.method_25321((class_350.class_351)entry);
/*     */   }
/*     */   
/*     */   public int method_25322() {
/*     */     return 71 - (method_57717() ? 6 : 0);
/*     */   }
/*     */   
/*     */   public int method_25342() {
/*     */     return method_46426() + (method_57717() ? 8 : 2);
/*     */   }
/*     */   
/*     */   public int method_31383() {
/*     */     return method_25342() + method_25322();
/*     */   }
/*     */   
/*     */   protected int method_25337(int index) {
/*     */     return (int)((method_46427() + 2) - method_25341() + (index * this.field_22741));
/*     */   }
/*     */   
/*     */   protected int method_25319(int index) {
/*     */     return method_25337(index) + this.field_22741;
/*     */   }
/*     */   
/*     */   protected int method_25329() {
/*     */     return method_46426();
/*     */   }
/*     */   
/*     */   public void method_25395(@Nullable class_364 focused) {
/*     */     CategoryEntry lastSelected = (CategoryEntry)method_25334();
/*     */     (focused instanceof CategoryEntry) ? focused : null;
/*     */     super.method_25395(((((focused instanceof CategoryEntry) ? focused : null) != null) ? (!((focused instanceof CategoryEntry) ? focused : null).isAddCategory()) : false) ? focused : null);
/*     */     if (!Intrinsics.areEqual(method_25334(), lastSelected)) {
/*     */       if (method_25334() != null && this.shopScreen.isEditMode()) {
/*     */         if ((CategoryEntry)method_25334() == null || ((CategoryEntry)method_25334()).getCategory() == null || ((CategoryEntry)method_25334()).getCategory().getName() == null)
/*     */           ((CategoryEntry)method_25334()).getCategory().getName(); 
/*     */         ((CategoryEntry)method_25334()).getCategory().getName().method_1852("");
/*     */         this.shopScreen.toggleEditCategoryNameBox(true);
/*     */         this.shopScreen.method_25395((class_364)this.shopScreen.getEditCategoryNameBox());
/*     */         this.shopScreen.getEditCategoryNameBox().method_25365(true);
/*     */       } else {
/*     */         this.shopScreen.toggleEditCategoryNameBox(false);
/*     */         this.shopScreen.getEditCategoryNameBox().method_46421(0);
/*     */         this.shopScreen.getEditCategoryNameBox().method_46419(0);
/*     */       } 
/*     */       this.shopScreen.getSearchOfferBox().method_1852("");
/*     */       (CategoryEntry)method_25334();
/*     */       this.shopScreen.getOfferList().createOfferEntries(((CategoryEntry)method_25334() != null) ? ((CategoryEntry)method_25334()).getCategory() : null);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\006\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\007\n\002\020\007\n\000\n\002\020\002\n\002\b\036\b\004\030\0002\f\022\b\022\0060\000R\0020\0020\001B\033\022\b\020\004\032\004\030\0010\003\022\b\b\002\020\006\032\0020\005¢\006\004\b\007\020\bJ\017\020\n\032\0020\tH\026¢\006\004\b\n\020\013J'\020\021\032\0020\0052\006\020\r\032\0020\f2\006\020\016\032\0020\f2\006\020\020\032\0020\017H\026¢\006\004\b\021\020\022J_\020\036\032\0020\0352\006\020\024\032\0020\0232\006\020\025\032\0020\0172\006\020\026\032\0020\0172\006\020\027\032\0020\0172\006\020\030\032\0020\0172\006\020\031\032\0020\0172\006\020\r\032\0020\0172\006\020\016\032\0020\0172\006\020\032\032\0020\0052\006\020\034\032\0020\033H\026¢\006\004\b\036\020\037J\035\020 \032\0020\0052\006\020\r\032\0020\0172\006\020\016\032\0020\017¢\006\004\b \020!J_\020#\032\0020\0352\006\020\024\032\0020\0232\006\020\025\032\0020\0172\006\020\026\032\0020\0172\006\020\027\032\0020\0172\006\020\030\032\0020\0172\006\020\031\032\0020\0172\006\020\r\032\0020\0172\006\020\016\032\0020\0172\006\020\"\032\0020\0052\006\020\034\032\0020\033H\026¢\006\004\b#\020\037R\031\020\004\032\004\030\0010\0038\006¢\006\f\n\004\b\004\020$\032\004\b%\020&R\027\020\006\032\0020\0058\006¢\006\f\n\004\b\006\020'\032\004\b\006\020(R$\020)\032\004\030\0010\0178\006@\006X\016¢\006\022\n\004\b)\020*\032\004\b+\020,\"\004\b-\020.R$\020/\032\004\030\0010\0178\006@\006X\016¢\006\022\n\004\b/\020*\032\004\b0\020,\"\004\b1\020.R\"\0202\032\0020\0178\006@\006X\016¢\006\022\n\004\b2\0203\032\004\b4\0205\"\004\b6\0207R\"\0208\032\0020\0178\006@\006X\016¢\006\022\n\004\b8\0203\032\004\b9\0205\"\004\b:\0207¨\006;"}, d2 = {"Lfr/harmex/cobbledollars/common/client/gui/screen/widget/CategoryListWidget$CategoryEntry;", "Lnet/minecraft/class_4280$class_4281;", "Lfr/harmex/cobbledollars/common/client/gui/screen/widget/CategoryListWidget;", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;", "category", "", "isAddCategory", "<init>", "(Lfr/harmex/cobbledollars/common/client/gui/screen/widget/CategoryListWidget;Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;Z)V", "Lnet/minecraft/class_5250;", "getNarration", "()Lnet/minecraft/class_5250;", "", "mouseX", "mouseY", "", "button", "mouseClicked", "(DDI)Z", "Lnet/minecraft/class_332;", "guiGraphics", "index", "top", "left", "width", "height", "hovering", "", "partialTick", "", "render", "(Lnet/minecraft/class_332;IIIIIIIZF)V", "isMouseOverCross", "(II)Z", "isMouseOver", "renderBack", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;", "getCategory", "()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;", "Z", "()Z", "categoryIndex", "Ljava/lang/Integer;", "getCategoryIndex", "()Ljava/lang/Integer;", "setCategoryIndex", "(Ljava/lang/Integer;)V", "listIndex", "getListIndex", "setListIndex", "x", "I", "getX", "()I", "setX", "(I)V", "y", "getY", "setY", "common"})
/*     */   public final class CategoryEntry extends class_4280.class_4281<CategoryEntry> {
/*     */     @Nullable
/*     */     private final Category category;
/*     */     
/*     */     private final boolean isAddCategory;
/*     */     
/*     */     @Nullable
/*     */     private Integer categoryIndex;
/*     */     
/*     */     @Nullable
/*     */     private Integer listIndex;
/*     */     
/*     */     private int x;
/*     */     
/*     */     private int y;
/*     */     
/*     */     public CategoryEntry(Category category, boolean isAddCategory) {
/*     */       this.category = category;
/*     */       this.isAddCategory = isAddCategory;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Category getCategory() {
/*     */       return this.category;
/*     */     }
/*     */     
/*     */     public final boolean isAddCategory() {
/*     */       return this.isAddCategory;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public class_5250 getNarration() {
/*     */       if (this.category == null || this.category.getName() == null)
/*     */         this.category.getName(); 
/*     */       Intrinsics.checkNotNullExpressionValue(class_2561.method_43470(""), "literal(...)");
/*     */       return class_2561.method_43470("");
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Integer getCategoryIndex() {
/*     */       return this.categoryIndex;
/*     */     }
/*     */     
/*     */     public final void setCategoryIndex(@Nullable Integer <set-?>) {
/*     */       this.categoryIndex = <set-?>;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Integer getListIndex() {
/*     */       return this.listIndex;
/*     */     }
/*     */     
/*     */     public final void setListIndex(@Nullable Integer <set-?>) {
/*     */       this.listIndex = <set-?>;
/*     */     }
/*     */     
/*     */     public final int getX() {
/*     */       return this.x;
/*     */     }
/*     */     
/*     */     public final void setX(int <set-?>) {
/*     */       this.x = <set-?>;
/*     */     }
/*     */     
/*     */     public final int getY() {
/*     */       return this.y;
/*     */     }
/*     */     
/*     */     public final void setY(int <set-?>) {
/*     */       this.y = <set-?>;
/*     */     }
/*     */     
/*     */     public boolean method_25402(double mouseX, double mouseY, int button) {
/*     */       if (this.isAddCategory) {
/*     */         Shop.addCategory$default(((ShopMenu)CategoryListWidget.this.getShopScreen().method_17577()).getShop(), new Category("", new ArrayList()), null, 2, null);
/*     */         CategoryListWidget.this.createCategoryEntries();
/*     */         CategoryListWidget.this.method_25395((class_364)CategoryListWidget.access$getEntryAtPosition(CategoryListWidget.this, mouseX, mouseY));
/*     */       } else if (CategoryListWidget.this.getShopScreen().isEditMode() && Intrinsics.areEqual(CategoryListWidget.this.method_25334(), this) && isMouseOverCross((int)mouseX, (int)mouseY) && this.categoryIndex != null) {
/*     */         Intrinsics.checkNotNull(this.categoryIndex);
/*     */         ((ShopMenu)CategoryListWidget.this.getShopScreen().method_17577()).getShop().remove(this.categoryIndex.intValue());
/*     */         CategoryListWidget.this.createCategoryEntries();
/*     */         CategoryListWidget.this.method_25395((class_364)CategoryListWidget.access$getEntryAtPosition(CategoryListWidget.this, mouseX, mouseY));
/*     */       } 
/*     */       return !this.isAddCategory;
/*     */     }
/*     */     
/*     */     public void method_25343(@NotNull class_332 guiGraphics, int index, int top, int left, int width, int height, int mouseX, int mouseY, boolean hovering, float partialTick) {
/*     */       Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/*     */       this.listIndex = Integer.valueOf(index);
/*     */       this.x = left;
/*     */       this.y = top;
/*     */       if (this.isAddCategory) {
/*     */         guiGraphics.method_25300(CategoryListWidget.this.field_22740.field_1772, "+", left + width / 2, top + 3, -1);
/*     */       } else if (CategoryListWidget.this.getShopScreen().isEditMode() && Intrinsics.areEqual(CategoryListWidget.this.method_25334(), this)) {
/*     */         CategoryListWidget.this.getShopScreen().getEditCategoryNameBox().method_46421(this.x + 3);
/*     */         CategoryListWidget.this.getShopScreen().getEditCategoryNameBox().method_46419(this.y + 3);
/*     */         CategoryListWidget.this.getShopScreen().getEditCategoryNameBox().method_25394(guiGraphics, mouseX, mouseY, partialTick);
/*     */       } else {
/*     */         guiGraphics.method_25303(CategoryListWidget.this.field_22740.field_1772, (this.category != null) ? this.category.getName() : null, left + 3, top + 3, -1);
/*     */       } 
/*     */       if (CategoryListWidget.this.getShopScreen().isEditMode() && Intrinsics.areEqual(CategoryListWidget.this.method_25334(), this)) {
/*     */         Intrinsics.checkNotNullExpressionValue(guiGraphics.method_51448(), "pose(...)");
/*     */         GuiUtilsKt.blitk$default(guiGraphics.method_51448(), GuiUtilsKt.getCROSS_LOCATION(), Integer.valueOf(left + 59), Integer.valueOf(top + 4), Integer.valueOf(5), Integer.valueOf(5), null, null, null, null, null, Double.valueOf(!isMouseOverCross(mouseX, mouseY) ? 0.4D : 0.82D), Double.valueOf(!isMouseOverCross(mouseX, mouseY) ? 0.4D : 0.24D), Double.valueOf(!isMouseOverCross(mouseX, mouseY) ? 0.4D : 0.24D), null, false, 0.0F, 116672, null);
/*     */       } 
/*     */     }
/*     */     
/*     */     public final boolean isMouseOverCross(int mouseX, int mouseY) {
/*     */       int i = this.x + 59;
/*     */       if ((mouseX < this.x + 64) ? ((i <= mouseX)) : false) {
/*     */         i = this.y + 4;
/*     */         if ((mouseY < this.y + 9) ? ((i <= mouseY)) : false);
/*     */       } 
/*     */       return false;
/*     */     }
/*     */     
/*     */     public void method_49568(@NotNull class_332 guiGraphics, int index, int top, int left, int width, int height, int mouseX, int mouseY, boolean isMouseOver, float partialTick) {
/*     */       Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/*     */       if (CategoryListWidget.this.method_57717()) {
/*     */         guiGraphics.method_25290(CategoryListWidget.CATEGORY_BACKGROUND_SHORT_LOCATION, left + 1, top + 1, 0.0F, 0.0F, 63, 11, 63, 11);
/*     */       } else {
/*     */         guiGraphics.method_25290(CategoryListWidget.CATEGORY_BACKGROUND_LOCATION, left + 1, top + 1, 0.0F, 0.0F, 69, 11, 69, 11);
/*     */       } 
/*     */       if (isMouseOver) {
/*     */         RenderSystem.enableBlend();
/*     */         guiGraphics.method_25294(left + 1, top + 1, left + width - 1, top + CategoryListWidget.this.field_22741 - 1, 553648127);
/*     */         RenderSystem.disableBlend();
/*     */       } 
/*     */       if (CategoryListWidget.this.method_25332(index))
/*     */         if (CategoryListWidget.this.method_57717()) {
/*     */           guiGraphics.method_25290(CategoryListWidget.CATEGORY_OUTLINE_SHORT_LOCATION, left, top - 3, 0.0F, 0.0F, 70, 19, 70, 19);
/*     */         } else {
/*     */           guiGraphics.method_25290(CategoryListWidget.CATEGORY_OUTLINE_LOCATION, left, top - 3, 0.0F, 0.0F, 76, 19, 76, 19);
/*     */         }  
/*     */     }
/*     */   }
/*     */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\client\gui\screen\widget\CategoryListWidget.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */