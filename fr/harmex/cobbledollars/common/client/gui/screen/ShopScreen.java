/*     */ package fr.harmex.cobbledollars.common.client.gui.screen;
/*     */ 
/*     */ import com.cobblemon.mod.common.api.net.NetworkPacket;
/*     */ import com.cobblemon.mod.common.api.text.TextKt;
/*     */ import fr.harmex.cobbledollars.common.client.gui.screen.widget.AmountButton;
/*     */ import fr.harmex.cobbledollars.common.client.gui.screen.widget.BankButton;
/*     */ import fr.harmex.cobbledollars.common.client.gui.screen.widget.BuyButton;
/*     */ import fr.harmex.cobbledollars.common.client.gui.screen.widget.CategoryListWidget;
/*     */ import fr.harmex.cobbledollars.common.client.gui.screen.widget.OfferListWidget;
/*     */ import fr.harmex.cobbledollars.common.network.CobbleDollarsNetwork;
/*     */ import fr.harmex.cobbledollars.common.network.packets.c2s.BuyPacket;
/*     */ import fr.harmex.cobbledollars.common.network.packets.c2s.CloseShopPacket;
/*     */ import fr.harmex.cobbledollars.common.network.packets.c2s.OpenBankPacket;
/*     */ import fr.harmex.cobbledollars.common.network.packets.c2s.UpdateMerchantShopPacket;
/*     */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*     */ import fr.harmex.cobbledollars.common.utils.extensions.PlayerExtensionKt;
/*     */ import fr.harmex.cobbledollars.common.world.inventory.ShopMenu;
/*     */ import java.math.BigInteger;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import kotlin.text.StringsKt;
/*     */ import net.minecraft.class_124;
/*     */ import net.minecraft.class_1657;
/*     */ import net.minecraft.class_1661;
/*     */ import net.minecraft.class_1703;
/*     */ import net.minecraft.class_2561;
/*     */ import net.minecraft.class_2960;
/*     */ import net.minecraft.class_310;
/*     */ import net.minecraft.class_332;
/*     */ import net.minecraft.class_342;
/*     */ import net.minecraft.class_364;
/*     */ import net.minecraft.class_4185;
/*     */ import net.minecraft.class_465;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\020\013\n\002\b\013\n\002\020\016\n\002\b\005\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\020\007\n\002\b\005\n\002\030\002\n\002\b\n\n\002\020\006\n\002\b\020\n\002\030\002\n\002\b\f\n\002\030\002\n\002\b\022\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\r\n\002\030\002\n\002\b\n\030\0002\b\022\004\022\0020\0020\001B\037\022\006\020\003\032\0020\002\022\006\020\005\032\0020\004\022\006\020\007\032\0020\006¢\006\004\b\b\020\tJ\017\020\013\032\0020\nH\024¢\006\004\b\013\020\fJ\025\020\017\032\0020\n2\006\020\016\032\0020\r¢\006\004\b\017\020\020J\025\020\021\032\0020\n2\006\020\016\032\0020\r¢\006\004\b\021\020\020J\025\020\022\032\0020\n2\006\020\016\032\0020\r¢\006\004\b\022\020\020J\025\020\024\032\0020\n2\006\020\023\032\0020\r¢\006\004\b\024\020\020J\r\020\025\032\0020\n¢\006\004\b\025\020\fJ\r\020\026\032\0020\r¢\006\004\b\026\020\027J\r\020\030\032\0020\n¢\006\004\b\030\020\fJ\025\020\033\032\0020\n2\006\020\032\032\0020\031¢\006\004\b\033\020\034J\r\020\035\032\0020\n¢\006\004\b\035\020\fJ\r\020\036\032\0020\n¢\006\004\b\036\020\fJ'\020$\032\0020\n2\006\020 \032\0020\0372\006\020\"\032\0020!2\006\020#\032\0020!H\024¢\006\004\b$\020%J/\020(\032\0020\n2\006\020 \032\0020\0372\006\020'\032\0020&2\006\020\"\032\0020!2\006\020#\032\0020!H\024¢\006\004\b(\020)J/\020*\032\0020\n2\006\020 \032\0020\0372\006\020\"\032\0020!2\006\020#\032\0020!2\006\020'\032\0020&H\026¢\006\004\b*\020+J'\0200\032\0020\n2\006\020-\032\0020,2\006\020.\032\0020!2\006\020/\032\0020!H\026¢\006\004\b0\0201J'\0205\032\0020\r2\006\0202\032\0020!2\006\0203\032\0020!2\006\0204\032\0020!H\026¢\006\004\b5\0206J/\020:\032\0020\r2\006\020\"\032\002072\006\020#\032\002072\006\0208\032\002072\006\0209\032\00207H\026¢\006\004\b:\020;J'\020=\032\0020\r2\006\020\"\032\002072\006\020#\032\002072\006\020<\032\0020!H\026¢\006\004\b=\020>J7\020A\032\0020\r2\006\020\"\032\002072\006\020#\032\002072\006\020<\032\0020!2\006\020?\032\002072\006\020@\032\00207H\026¢\006\004\bA\020BJ'\020C\032\0020\r2\006\020\"\032\002072\006\020#\032\002072\006\020<\032\0020!H\026¢\006\004\bC\020>J\017\020D\032\0020\nH\026¢\006\004\bD\020\fR\"\020E\032\0020\r8\006@\006X\016¢\006\022\n\004\bE\020F\032\004\bE\020\027\"\004\bG\020\020R\"\020I\032\0020H8\006@\006X.¢\006\022\n\004\bI\020J\032\004\bK\020L\"\004\bM\020NR\"\020O\032\0020H8\006@\006X.¢\006\022\n\004\bO\020J\032\004\bP\020L\"\004\bQ\020NR\"\020R\032\0020H8\006@\006X.¢\006\022\n\004\bR\020J\032\004\bS\020L\"\004\bT\020NR\027\020V\032\0020U8\006¢\006\f\n\004\bV\020W\032\004\bX\020YR\027\020Z\032\0020U8\006¢\006\f\n\004\bZ\020W\032\004\b[\020YR\"\020\\\032\0020!8\006@\006X\016¢\006\022\n\004\b\\\020]\032\004\b^\020_\"\004\b`\020aR\"\020b\032\0020!8\006@\006X\016¢\006\022\n\004\bb\020]\032\004\bc\020_\"\004\bd\020aR\"\020e\032\0020\r8\006@\006X\016¢\006\022\n\004\be\020F\032\004\bf\020\027\"\004\bg\020\020R\027\020i\032\0020h8\006¢\006\f\n\004\bi\020j\032\004\bk\020lR\027\020n\032\0020m8\006¢\006\f\n\004\bn\020o\032\004\bp\020qR\"\020r\032\0020H8\006@\006X.¢\006\022\n\004\br\020J\032\004\bs\020L\"\004\bt\020NR\"\020u\032\0020H8\006@\006X.¢\006\022\n\004\bu\020J\032\004\bv\020L\"\004\bw\020NR\"\020x\032\0020H8\006@\006X.¢\006\022\n\004\bx\020J\032\004\by\020L\"\004\bz\020NR$\020|\032\0020{8\006@\006X.¢\006\024\n\004\b|\020}\032\004\b~\020\"\006\b\001\020\001R&\020\001\032\0020!8\006@\006X\016¢\006\025\n\005\b\001\020]\032\005\b\001\020_\"\005\b\001\020a¨\006\001"}, d2 = {"Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;", "Lnet/minecraft/class_465;", "Lfr/harmex/cobbledollars/common/world/inventory/ShopMenu;", "menu", "Lnet/minecraft/class_1661;", "playerInventory", "Lnet/minecraft/class_2561;", "title", "<init>", "(Lfr/harmex/cobbledollars/common/world/inventory/ShopMenu;Lnet/minecraft/class_1661;Lnet/minecraft/class_2561;)V", "", "init", "()V", "", "state", "toggleEditCategoryNameBox", "(Z)V", "toggleEditOfferPriceBox", "toggleEditOfferStockBox", "increment", "amountButtonClick", "buy", "canBuy", "()Z", "syncShop", "", "filter", "updateBuyAmount", "(Ljava/lang/String;)V", "updateWidgetPos", "syncShopToServer", "Lnet/minecraft/class_332;", "guiGraphics", "", "mouseX", "mouseY", "renderLabels", "(Lnet/minecraft/class_332;II)V", "", "partialTick", "renderBg", "(Lnet/minecraft/class_332;FII)V", "render", "(Lnet/minecraft/class_332;IIF)V", "Lnet/minecraft/class_310;", "minecraft", "width", "height", "resize", "(Lnet/minecraft/class_310;II)V", "keyCode", "scanCode", "modifiers", "keyPressed", "(III)Z", "", "scrollX", "scrollY", "mouseScrolled", "(DDDD)Z", "button", "mouseClicked", "(DDI)Z", "dragX", "dragY", "mouseDragged", "(DDIDD)Z", "mouseReleased", "onClose", "isEditMode", "Z", "setEditMode", "Lnet/minecraft/class_342;", "editCategoryNameBox", "Lnet/minecraft/class_342;", "getEditCategoryNameBox", "()Lnet/minecraft/class_342;", "setEditCategoryNameBox", "(Lnet/minecraft/class_342;)V", "editOfferPriceBox", "getEditOfferPriceBox", "setEditOfferPriceBox", "editOfferStockBox", "getEditOfferStockBox", "setEditOfferStockBox", "Lnet/minecraft/class_2960;", "bgLocation", "Lnet/minecraft/class_2960;", "getBgLocation", "()Lnet/minecraft/class_2960;", "stockLocation", "getStockLocation", "x", "I", "getX", "()I", "setX", "(I)V", "y", "getY", "setY", "shopSynced", "getShopSynced", "setShopSynced", "Lfr/harmex/cobbledollars/common/client/gui/screen/widget/CategoryListWidget;", "categoryList", "Lfr/harmex/cobbledollars/common/client/gui/screen/widget/CategoryListWidget;", "getCategoryList", "()Lfr/harmex/cobbledollars/common/client/gui/screen/widget/CategoryListWidget;", "Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget;", "offerList", "Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget;", "getOfferList", "()Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget;", "searchCategoryBox", "getSearchCategoryBox", "setSearchCategoryBox", "searchOfferBox", "getSearchOfferBox", "setSearchOfferBox", "buyAmountBox", "getBuyAmountBox", "setBuyAmountBox", "Lfr/harmex/cobbledollars/common/client/gui/screen/widget/BuyButton;", "buyButton", "Lfr/harmex/cobbledollars/common/client/gui/screen/widget/BuyButton;", "getBuyButton", "()Lfr/harmex/cobbledollars/common/client/gui/screen/widget/BuyButton;", "setBuyButton", "(Lfr/harmex/cobbledollars/common/client/gui/screen/widget/BuyButton;)V", "buyAmount", "getBuyAmount", "setBuyAmount", "common"})
/*     */ @SourceDebugExtension({"SMAP\nShopScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShopScreen.kt\nfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,437:1\n1863#2,2:438\n*S KotlinDebug\n*F\n+ 1 ShopScreen.kt\nfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen\n*L\n349#1:438,2\n*E\n"})
/*     */ public final class ShopScreen extends class_465<ShopMenu> {
/*     */   private boolean isEditMode;
/*     */   
/*     */   public class_342 editCategoryNameBox;
/*     */   
/*     */   public class_342 editOfferPriceBox;
/*     */   
/*     */   public class_342 editOfferStockBox;
/*     */   
/*     */   @NotNull
/*     */   private final class_2960 bgLocation;
/*     */   
/*     */   @NotNull
/*     */   private final class_2960 stockLocation;
/*     */   
/*     */   private int x;
/*     */   
/*     */   private int y;
/*     */   
/*     */   private boolean shopSynced;
/*     */   
/*     */   @NotNull
/*     */   private final CategoryListWidget categoryList;
/*     */   
/*     */   @NotNull
/*     */   private final OfferListWidget offerList;
/*     */   
/*     */   public class_342 searchCategoryBox;
/*     */   
/*     */   public class_342 searchOfferBox;
/*     */   
/*     */   public class_342 buyAmountBox;
/*     */   
/*     */   public BuyButton buyButton;
/*     */   
/*     */   private int buyAmount;
/*     */   
/*     */   public ShopScreen(@NotNull ShopMenu menu, @NotNull class_1661 playerInventory, @NotNull class_2561 title) {
/*  39 */     super(
/*  40 */         (class_1703)menu, 
/*  41 */         playerInventory, 
/*  42 */         title);
/*  48 */     this.bgLocation = MiscUtilsKt.cobbleDollarsResource("textures/gui/shop/shop_base.png");
/*  49 */     this.stockLocation = MiscUtilsKt.cobbleDollarsResource("textures/gui/shop/stock.png");
/*  53 */     this.categoryList = new CategoryListWidget(this, 0, 0);
/*  54 */     this.offerList = new OfferListWidget(this, 0, 0);
/*  61 */     this.field_2792 = 252;
/*  62 */     this.field_2779 = 196;
/*     */   }
/*     */   
/*     */   public final boolean isEditMode() {
/*     */     return this.isEditMode;
/*     */   }
/*     */   
/*     */   public final void setEditMode(boolean <set-?>) {
/*     */     this.isEditMode = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final class_342 getEditCategoryNameBox() {
/*     */     if (this.editCategoryNameBox != null)
/*     */       return this.editCategoryNameBox; 
/*     */     Intrinsics.throwUninitializedPropertyAccessException("editCategoryNameBox");
/*     */     return null;
/*     */   }
/*     */   
/*     */   public final void setEditCategoryNameBox(@NotNull class_342 <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.editCategoryNameBox = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final class_342 getEditOfferPriceBox() {
/*     */     if (this.editOfferPriceBox != null)
/*     */       return this.editOfferPriceBox; 
/*     */     Intrinsics.throwUninitializedPropertyAccessException("editOfferPriceBox");
/*     */     return null;
/*     */   }
/*     */   
/*     */   public final void setEditOfferPriceBox(@NotNull class_342 <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.editOfferPriceBox = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final class_342 getEditOfferStockBox() {
/*     */     if (this.editOfferStockBox != null)
/*     */       return this.editOfferStockBox; 
/*     */     Intrinsics.throwUninitializedPropertyAccessException("editOfferStockBox");
/*     */     return null;
/*     */   }
/*     */   
/*     */   public final void setEditOfferStockBox(@NotNull class_342 <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.editOfferStockBox = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final class_2960 getBgLocation() {
/*     */     return this.bgLocation;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final class_2960 getStockLocation() {
/*     */     return this.stockLocation;
/*     */   }
/*     */   
/*     */   public final int getX() {
/*     */     return this.x;
/*     */   }
/*     */   
/*     */   public final void setX(int <set-?>) {
/*     */     this.x = <set-?>;
/*     */   }
/*     */   
/*     */   public final int getY() {
/*     */     return this.y;
/*     */   }
/*     */   
/*     */   public final void setY(int <set-?>) {
/*     */     this.y = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getShopSynced() {
/*     */     return this.shopSynced;
/*     */   }
/*     */   
/*     */   public final void setShopSynced(boolean <set-?>) {
/*     */     this.shopSynced = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final CategoryListWidget getCategoryList() {
/*     */     return this.categoryList;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final OfferListWidget getOfferList() {
/*     */     return this.offerList;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final class_342 getSearchCategoryBox() {
/*     */     if (this.searchCategoryBox != null)
/*     */       return this.searchCategoryBox; 
/*     */     Intrinsics.throwUninitializedPropertyAccessException("searchCategoryBox");
/*     */     return null;
/*     */   }
/*     */   
/*     */   public final void setSearchCategoryBox(@NotNull class_342 <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.searchCategoryBox = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final class_342 getSearchOfferBox() {
/*     */     if (this.searchOfferBox != null)
/*     */       return this.searchOfferBox; 
/*     */     Intrinsics.throwUninitializedPropertyAccessException("searchOfferBox");
/*     */     return null;
/*     */   }
/*     */   
/*     */   public final void setSearchOfferBox(@NotNull class_342 <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.searchOfferBox = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final class_342 getBuyAmountBox() {
/*     */     if (this.buyAmountBox != null)
/*     */       return this.buyAmountBox; 
/*     */     Intrinsics.throwUninitializedPropertyAccessException("buyAmountBox");
/*     */     return null;
/*     */   }
/*     */   
/*     */   public final void setBuyAmountBox(@NotNull class_342 <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.buyAmountBox = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final BuyButton getBuyButton() {
/*     */     if (this.buyButton != null)
/*     */       return this.buyButton; 
/*     */     Intrinsics.throwUninitializedPropertyAccessException("buyButton");
/*     */     return null;
/*     */   }
/*     */   
/*     */   public final void setBuyButton(@NotNull BuyButton <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.buyButton = <set-?>;
/*     */   }
/*     */   
/*     */   public final int getBuyAmount() {
/*     */     return this.buyAmount;
/*     */   }
/*     */   
/*     */   public final void setBuyAmount(int <set-?>) {
/*     */     this.buyAmount = <set-?>;
/*     */   }
/*     */   
/*     */   protected void method_25426() {
/*  66 */     this.x = (this.field_22789 - this.field_2792) / 2;
/*  67 */     this.y = (this.field_22790 - this.field_2779) / 2;
/*  69 */     setEditCategoryNameBox(new class_342(this.field_22793, this.x + 99, this.y + 21, 71, 13, (class_2561)class_2561.method_43470("Edit Category Name")));
/*  70 */     getEditCategoryNameBox().method_1858(false);
/*  71 */     getEditCategoryNameBox().method_1863(this.categoryList::editCategoryName);
/*  73 */     setEditOfferPriceBox(new class_342(this.field_22793, this.x + 130, this.y + 21, 75, 18, (class_2561)class_2561.method_43470("Edit Offer Price")));
/*  74 */     getEditOfferPriceBox().method_1858(false);
/*  75 */     Intrinsics.checkNotNull(class_124.field_1068.method_532());
/*  75 */     getEditOfferPriceBox().method_1868(class_124.field_1068.method_532().intValue());
/*  76 */     getEditOfferPriceBox().method_1863(this.offerList::editOfferPrice);
/*  78 */     setEditOfferStockBox(new class_342(this.field_22793, this.x + 4, this.y + 24, 32, 13, (class_2561)class_2561.method_43470("Edit Offer Stock")));
/*  79 */     getEditOfferStockBox().method_1858(false);
/*  80 */     Intrinsics.checkNotNull(class_124.field_1080.method_532());
/*  80 */     getEditOfferStockBox().method_1868(class_124.field_1080.method_532().intValue());
/*  81 */     getEditOfferStockBox().method_1863(this.offerList::editOfferStock);
/*  83 */     setSearchCategoryBox(new class_342(this.field_22793, this.x + 97, this.y + 5, 69, 9, (class_2561)class_2561.method_43470("Search Category")));
/*  84 */     Intrinsics.checkNotNullExpressionValue(class_2561.method_43470("Categories..."), "literal(...)");
/*  84 */     getSearchCategoryBox().method_47404((class_2561)TextKt.gray(class_2561.method_43470("Categories...")));
/*  85 */     getSearchCategoryBox().method_1858(false);
/*  86 */     getSearchCategoryBox().method_1863(this.categoryList::search);
/*  87 */     method_37063((class_364)getSearchCategoryBox());
/*  89 */     setSearchOfferBox(new class_342(this.field_22793, this.x + 175, this.y + 5, 73, 9, (class_2561)class_2561.method_43470("Search Offer")));
/*  90 */     Intrinsics.checkNotNullExpressionValue(class_2561.method_43470("Offers..."), "literal(...)");
/*  90 */     getSearchOfferBox().method_47404((class_2561)TextKt.gray(class_2561.method_43470("Offers...")));
/*  91 */     getSearchOfferBox().method_1858(false);
/*  92 */     getSearchOfferBox().method_1863(this.offerList::search);
/*  93 */     method_37063((class_364)getSearchOfferBox());
/*  95 */     setBuyAmountBox(new class_342(this.field_22793, this.x + 37, this.y + 64, 24, 9, (class_2561)class_2561.method_43470("Amount to Buy")));
/*  96 */     Intrinsics.checkNotNullExpressionValue(class_2561.method_43470("Qty"), "literal(...)");
/*  96 */     getBuyAmountBox().method_47404((class_2561)TextKt.gray(class_2561.method_43470("Qty")));
/*  97 */     getBuyAmountBox().method_1858(false);
/*  98 */     getBuyAmountBox().method_1863(this::updateBuyAmount);
/*  99 */     method_37063((class_364)getBuyAmountBox());
/* 101 */     method_37063(
/* 102 */         (class_364)new AmountButton(this.x + 64, this.y + 62, true, this::init$lambda$0));
/* 104 */     method_37063(
/* 105 */         (class_364)new AmountButton(this.x + 64, this.y + 68, false, this::init$lambda$1));
/* 108 */     setBuyButton(new BuyButton(this.x + 58, this.y + 75, this, this::init$lambda$2));
/* 109 */     method_37063((class_364)getBuyButton());
/* 111 */     if (!this.isEditMode)
/* 112 */       method_37063(
/* 113 */           (class_364)new BankButton(this.x + 16, this.y + 181, this::init$lambda$3)); 
/* 119 */     super.method_25426();
/*     */   }
/*     */   
/*     */   private static final void init$lambda$0(ShopScreen this$0, class_4185 it) {
/*     */     Intrinsics.checkNotNullParameter(this$0, "this$0");
/*     */     this$0.amountButtonClick(true);
/*     */   }
/*     */   
/*     */   private static final void init$lambda$1(ShopScreen this$0, class_4185 it) {
/*     */     Intrinsics.checkNotNullParameter(this$0, "this$0");
/*     */     this$0.amountButtonClick(false);
/*     */   }
/*     */   
/*     */   private static final void init$lambda$2(ShopScreen this$0, class_4185 it) {
/*     */     Intrinsics.checkNotNullParameter(this$0, "this$0");
/*     */     this$0.buy();
/*     */   }
/*     */   
/*     */   private static final void init$lambda$3(ShopScreen this$0, class_4185 it) {
/*     */     Intrinsics.checkNotNullParameter(this$0, "this$0");
/*     */     this$0.method_25419();
/*     */     CobbleDollarsNetwork.INSTANCE.sendToServer((NetworkPacket)new OpenBankPacket(((ShopMenu)this$0.field_2797).getCobbleMerchant().getMerchantUUID()));
/*     */   }
/*     */   
/*     */   public final void toggleEditCategoryNameBox(boolean state) {
/* 123 */     if (state) {
/* 123 */       method_25429((class_364)getEditCategoryNameBox());
/*     */     } else {
/* 123 */       method_37066((class_364)getEditCategoryNameBox());
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void toggleEditOfferPriceBox(boolean state) {
/* 127 */     if (state) {
/* 127 */       method_25429((class_364)getEditOfferPriceBox());
/*     */     } else {
/* 127 */       method_37066((class_364)getEditOfferPriceBox());
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void toggleEditOfferStockBox(boolean state) {
/* 131 */     if (state) {
/* 131 */       method_25429((class_364)getEditOfferStockBox());
/*     */     } else {
/* 131 */       method_37066((class_364)getEditOfferStockBox());
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void amountButtonClick(boolean increment) {
/* 135 */     OfferListWidget.OfferEntry offer = (OfferListWidget.OfferEntry)this.offerList.method_25334();
/* 135 */     int $i$a$-let-ShopScreen$amountButtonClick$1 = 0;
/* 136 */     Intrinsics.checkNotNullExpressionValue(getBuyAmountBox().method_1882(), "getValue(...)");
/* 136 */     int amount = StringsKt.toIntOrNull(getBuyAmountBox().method_1882()).intValue(), $i$a$-let-ShopScreen$amountButtonClick$1$1 = 0;
/* 137 */     int maxStock = (offer.getStock() < 0) ? 9999 : RangesKt.coerceAtMost(offer.getStock(), 9999);
/* 138 */     if (increment) {
/* 140 */       Intrinsics.checkNotNull(this.field_22787);
/* 140 */       Intrinsics.checkNotNull(this.field_22787.field_1724);
/* 140 */       getBuyAmountBox().method_1852(class_465.method_25441() ? String.valueOf(RangesKt.coerceAtMost(PlayerExtensionKt.getMaxAmountPurchasable((class_1657)this.field_22787.field_1724, offer.getPrice()), maxStock)) : (
/* 141 */           class_465.method_25442() ? 
/* 142 */           String.valueOf(RangesKt.coerceAtMost(amount + offer.getItem().method_7914() - ((amount == 1 && offer.getItem().method_7914() != 1) ? 1 : 0), maxStock)) : 
/*     */           
/* 144 */           String.valueOf(RangesKt.coerceAtMost(amount + 1, maxStock))));
/*     */     } else {
/* 147 */       getBuyAmountBox().method_1852(class_465.method_25441() ? 
/* 148 */           "1" : (
/* 149 */           class_465.method_25442() ? 
/* 150 */           String.valueOf(RangesKt.coerceAtLeast(amount - offer.getItem().method_7914(), 1)) : 
/*     */           
/* 152 */           String.valueOf(RangesKt.coerceAtLeast(amount - 1, 1))));
/*     */     } 
/*     */     StringsKt.toIntOrNull(getBuyAmountBox().method_1882());
/*     */     (OfferListWidget.OfferEntry)this.offerList.method_25334();
/*     */   }
/*     */   
/*     */   public final void buy() {
/* 160 */     CategoryListWidget.CategoryEntry category = (CategoryListWidget.CategoryEntry)this.categoryList.method_25334();
/* 160 */     int $i$a$-let-ShopScreen$buy$1 = 0;
/* 161 */     OfferListWidget.OfferEntry offer = (OfferListWidget.OfferEntry)this.offerList.method_25334();
/* 161 */     int $i$a$-let-ShopScreen$buy$1$1 = 0;
/* 162 */     if (canBuy()) {
/* 163 */       int realBuyAmount = (offer.getStock() < 0) ? this.buyAmount : RangesKt.coerceAtMost(this.buyAmount, offer.getStock());
/* 164 */       Intrinsics.checkNotNull(this.field_22787);
/* 164 */       Intrinsics.checkNotNull(this.field_22787.field_1724);
/* 164 */       realBuyAmount = RangesKt.coerceAtMost(realBuyAmount, PlayerExtensionKt.getMaxAmountObtainable((class_1657)this.field_22787.field_1724, offer.getItem()));
/* 169 */       Intrinsics.checkNotNull(category.getCategoryIndex());
/* 170 */       Intrinsics.checkNotNull(offer.getOfferIndex());
/* 170 */       CobbleDollarsNetwork.INSTANCE.sendToServer((NetworkPacket)new BuyPacket(offer.getOffer().copy(), category.getCategoryIndex().intValue(), offer.getOfferIndex().intValue(), 
/* 171 */             this.buyAmount, (
/* 172 */             (ShopMenu)this.field_2797).getHasMerchant(), (
/* 173 */             (ShopMenu)this.field_2797).getCobbleMerchant().getMerchantUUID()));
/* 178 */       if (offer.getStock() > 0)
/* 179 */         offer.setStock(offer.getStock() - realBuyAmount); 
/*     */     } 
/*     */     (OfferListWidget.OfferEntry)this.offerList.method_25334();
/*     */     (CategoryListWidget.CategoryEntry)this.categoryList.method_25334();
/*     */   }
/*     */   
/*     */   public final boolean canBuy() {
/* 187 */     boolean canBuy = false;
/* 189 */     OfferListWidget.OfferEntry offer = (OfferListWidget.OfferEntry)this.offerList.method_25334();
/* 189 */     int $i$a$-let-ShopScreen$canBuy$1 = 0;
/* 190 */     int maxAmount = (offer.getStock() < 0) ? 9999 : RangesKt.coerceAtMost(offer.getStock(), 9999);
/* 191 */     Intrinsics.checkNotNullExpressionValue(BigInteger.valueOf(RangesKt.coerceAtMost(this.buyAmount, maxAmount)), "valueOf(...)");
/* 191 */     Intrinsics.checkNotNullExpressionValue(offer.getPrice().multiply(BigInteger.valueOf(RangesKt.coerceAtMost(this.buyAmount, maxAmount))), "multiply(...)");
/* 191 */     canBuy = (((this.field_22787 != null && this.field_22787.field_1724 != null) ? ((PlayerExtensionKt.canBuy((class_1657)this.field_22787.field_1724, offer.getPrice().multiply(BigInteger.valueOf(RangesKt.coerceAtMost(this.buyAmount, maxAmount)))) == true)) : false) && 
/* 192 */       offer.getStock() != 0 && 
/* 193 */       maxAmount > 0 && 
/* 194 */       !this.isEditMode);
/*     */     (OfferListWidget.OfferEntry)this.offerList.method_25334();
/* 197 */     return canBuy;
/*     */   }
/*     */   
/*     */   public final void syncShop() {
/* 201 */     this.categoryList.createCategoryEntries();
/* 202 */     this.shopSynced = true;
/*     */   }
/*     */   
/*     */   public final void updateBuyAmount(@NotNull String filter) {
/* 206 */     Intrinsics.checkNotNullParameter(filter, "filter");
/* 206 */     if (Intrinsics.areEqual(filter, "")) {
/* 207 */       getBuyAmountBox().method_1852("1");
/* 208 */     } else if (StringsKt.toIntOrNull(filter) == null) {
/* 209 */       getBuyAmountBox().method_1852(String.valueOf(this.buyAmount));
/*     */     } else {
/* 211 */       OfferListWidget.OfferEntry offerEntry = (OfferListWidget.OfferEntry)this.offerList.method_25334();
/* 211 */       int $i$a$-let-ShopScreen$updateBuyAmount$1 = 0;
/* 212 */       int amount = StringsKt.toIntOrNull(filter).intValue(), $i$a$-let-ShopScreen$updateBuyAmount$1$1 = 0;
/* 213 */       if (amount < 1) {
/* 213 */         getBuyAmountBox().method_1852("1");
/* 214 */       } else if (amount > 9999) {
/* 214 */         getBuyAmountBox().method_1852("9999");
/*     */       } 
/* 215 */       this.buyAmount = RangesKt.coerceAtMost(RangesKt.coerceAtLeast(amount, 1), 9999);
/*     */       StringsKt.toIntOrNull(filter);
/*     */       (OfferListWidget.OfferEntry)this.offerList.method_25334();
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void updateWidgetPos() {
/* 222 */     this.categoryList.method_46421(this.x + 94);
/* 223 */     this.categoryList.method_46419(this.y + 16);
/* 225 */     this.offerList.method_46421(this.x + 172);
/* 226 */     this.offerList.method_46419(this.y + 16);
/*     */   }
/*     */   
/*     */   public final void syncShopToServer() {
/* 230 */     CobbleDollarsNetwork.INSTANCE.sendToServer((NetworkPacket)new UpdateMerchantShopPacket(((ShopMenu)this.field_2797).getShop(), ((ShopMenu)this.field_2797).getCobbleMerchant().getMerchantUUID()));
/*     */   }
/*     */   
/*     */   protected void method_2388(@NotNull class_332 guiGraphics, int mouseX, int mouseY) {
/* 233 */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/*     */   }
/*     */   
/*     */   protected void method_2389(@NotNull class_332 guiGraphics, float partialTick, int mouseX, int mouseY) {
/* 236 */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/* 236 */     this.x = (this.field_22789 - this.field_2792) / 2;
/* 237 */     this.y = (this.field_22790 - this.field_2779) / 2;
/* 239 */     updateWidgetPos();
/* 241 */     guiGraphics.method_25290(this.bgLocation, this.x, this.y, 0.0F, 0.0F, this.field_2792, this.field_2779, this.field_2792, this.field_2779);
/*     */   }
/*     */   
/*     */   public void method_25394(@NotNull class_332 guiGraphics, int mouseX, int mouseY, float partialTick) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'guiGraphics'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_0
/*     */     //   8: aload_1
/*     */     //   9: iload_2
/*     */     //   10: iload_3
/*     */     //   11: fload #4
/*     */     //   13: invokespecial method_25394 : (Lnet/minecraft/class_332;IIF)V
/*     */     //   16: aload_0
/*     */     //   17: getfield shopSynced : Z
/*     */     //   20: ifeq -> 47
/*     */     //   23: aload_0
/*     */     //   24: getfield categoryList : Lfr/harmex/cobbledollars/common/client/gui/screen/widget/CategoryListWidget;
/*     */     //   27: aload_1
/*     */     //   28: iload_2
/*     */     //   29: iload_3
/*     */     //   30: fload #4
/*     */     //   32: invokevirtual method_25394 : (Lnet/minecraft/class_332;IIF)V
/*     */     //   35: aload_0
/*     */     //   36: getfield offerList : Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget;
/*     */     //   39: aload_1
/*     */     //   40: iload_2
/*     */     //   41: iload_3
/*     */     //   42: fload #4
/*     */     //   44: invokevirtual method_25394 : (Lnet/minecraft/class_332;IIF)V
/*     */     //   47: aload_1
/*     */     //   48: aload_0
/*     */     //   49: getfield x : I
/*     */     //   52: aload_0
/*     */     //   53: getfield field_2792 : I
/*     */     //   56: bipush #82
/*     */     //   58: isub
/*     */     //   59: iconst_2
/*     */     //   60: idiv
/*     */     //   61: iadd
/*     */     //   62: bipush #27
/*     */     //   64: isub
/*     */     //   65: aload_0
/*     */     //   66: getfield y : I
/*     */     //   69: aload_0
/*     */     //   70: getfield field_2779 : I
/*     */     //   73: iadd
/*     */     //   74: bipush #15
/*     */     //   76: isub
/*     */     //   77: iconst_0
/*     */     //   78: aconst_null
/*     */     //   79: iconst_0
/*     */     //   80: aconst_null
/*     */     //   81: aconst_null
/*     */     //   82: bipush #108
/*     */     //   84: aconst_null
/*     */     //   85: invokestatic renderCobbleDollarsElement$default : (Lnet/minecraft/class_332;IIZLjava/math/BigInteger;ZLfr/harmex/cobbledollars/common/client/utils/Context;Ljava/lang/Integer;ILjava/lang/Object;)V
/*     */     //   88: aload_0
/*     */     //   89: getfield offerList : Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget;
/*     */     //   92: invokevirtual method_25334 : ()Lnet/minecraft/class_350$class_351;
/*     */     //   95: checkcast fr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry
/*     */     //   98: dup
/*     */     //   99: ifnull -> 1017
/*     */     //   102: astore #7
/*     */     //   104: iconst_0
/*     */     //   105: istore #8
/*     */     //   107: aload_1
/*     */     //   108: invokevirtual method_51448 : ()Lnet/minecraft/class_4587;
/*     */     //   111: invokevirtual method_22903 : ()V
/*     */     //   114: aload_1
/*     */     //   115: invokevirtual method_51448 : ()Lnet/minecraft/class_4587;
/*     */     //   118: fconst_2
/*     */     //   119: fconst_2
/*     */     //   120: fconst_1
/*     */     //   121: invokevirtual method_22905 : (FFF)V
/*     */     //   124: aload_1
/*     */     //   125: aload #7
/*     */     //   127: invokevirtual getItem : ()Lnet/minecraft/class_1799;
/*     */     //   130: aload_0
/*     */     //   131: getfield x : I
/*     */     //   134: i2f
/*     */     //   135: ldc_w 4.0
/*     */     //   138: fadd
/*     */     //   139: fconst_2
/*     */     //   140: fdiv
/*     */     //   141: f2d
/*     */     //   142: invokestatic rint : (D)D
/*     */     //   145: d2f
/*     */     //   146: f2i
/*     */     //   147: aload_0
/*     */     //   148: getfield y : I
/*     */     //   151: i2f
/*     */     //   152: ldc_w 40.0
/*     */     //   155: fadd
/*     */     //   156: fconst_2
/*     */     //   157: fdiv
/*     */     //   158: f2d
/*     */     //   159: invokestatic rint : (D)D
/*     */     //   162: d2f
/*     */     //   163: f2i
/*     */     //   164: invokevirtual method_51445 : (Lnet/minecraft/class_1799;II)V
/*     */     //   167: aload_1
/*     */     //   168: invokevirtual method_51448 : ()Lnet/minecraft/class_4587;
/*     */     //   171: invokevirtual method_22909 : ()V
/*     */     //   174: aload_0
/*     */     //   175: getfield x : I
/*     */     //   178: iconst_4
/*     */     //   179: iadd
/*     */     //   180: istore #9
/*     */     //   182: iload_2
/*     */     //   183: aload_0
/*     */     //   184: getfield x : I
/*     */     //   187: bipush #36
/*     */     //   189: iadd
/*     */     //   190: if_icmpgt -> 207
/*     */     //   193: iload #9
/*     */     //   195: iload_2
/*     */     //   196: if_icmpgt -> 203
/*     */     //   199: iconst_1
/*     */     //   200: goto -> 208
/*     */     //   203: iconst_0
/*     */     //   204: goto -> 208
/*     */     //   207: iconst_0
/*     */     //   208: ifeq -> 264
/*     */     //   211: aload_0
/*     */     //   212: getfield y : I
/*     */     //   215: bipush #40
/*     */     //   217: iadd
/*     */     //   218: istore #9
/*     */     //   220: iload_3
/*     */     //   221: aload_0
/*     */     //   222: getfield y : I
/*     */     //   225: bipush #72
/*     */     //   227: iadd
/*     */     //   228: if_icmpgt -> 245
/*     */     //   231: iload #9
/*     */     //   233: iload_3
/*     */     //   234: if_icmpgt -> 241
/*     */     //   237: iconst_1
/*     */     //   238: goto -> 246
/*     */     //   241: iconst_0
/*     */     //   242: goto -> 246
/*     */     //   245: iconst_0
/*     */     //   246: ifeq -> 264
/*     */     //   249: aload_1
/*     */     //   250: aload_0
/*     */     //   251: getfield field_22793 : Lnet/minecraft/class_327;
/*     */     //   254: aload #7
/*     */     //   256: invokevirtual getItem : ()Lnet/minecraft/class_1799;
/*     */     //   259: iload_2
/*     */     //   260: iload_3
/*     */     //   261: invokevirtual method_51446 : (Lnet/minecraft/class_327;Lnet/minecraft/class_1799;II)V
/*     */     //   264: aload #7
/*     */     //   266: invokevirtual getStock : ()I
/*     */     //   269: ifge -> 279
/*     */     //   272: aload_0
/*     */     //   273: getfield isEditMode : Z
/*     */     //   276: ifeq -> 542
/*     */     //   279: aload_1
/*     */     //   280: invokevirtual method_51448 : ()Lnet/minecraft/class_4587;
/*     */     //   283: dup
/*     */     //   284: ldc_w 'pose(...)'
/*     */     //   287: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   290: aload_0
/*     */     //   291: getfield stockLocation : Lnet/minecraft/class_2960;
/*     */     //   294: aload_0
/*     */     //   295: getfield x : I
/*     */     //   298: bipush #7
/*     */     //   300: isub
/*     */     //   301: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   304: checkcast java/lang/Number
/*     */     //   307: aload_0
/*     */     //   308: getfield y : I
/*     */     //   311: bipush #8
/*     */     //   313: iadd
/*     */     //   314: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   317: checkcast java/lang/Number
/*     */     //   320: bipush #27
/*     */     //   322: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   325: checkcast java/lang/Number
/*     */     //   328: bipush #54
/*     */     //   330: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   333: checkcast java/lang/Number
/*     */     //   336: aconst_null
/*     */     //   337: aconst_null
/*     */     //   338: aconst_null
/*     */     //   339: aconst_null
/*     */     //   340: aconst_null
/*     */     //   341: aconst_null
/*     */     //   342: aconst_null
/*     */     //   343: aconst_null
/*     */     //   344: aconst_null
/*     */     //   345: iconst_0
/*     */     //   346: fconst_0
/*     */     //   347: ldc_w 131008
/*     */     //   350: aconst_null
/*     */     //   351: invokestatic blitk$default : (Lnet/minecraft/class_4587;Lnet/minecraft/class_2960;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;ZFILjava/lang/Object;)V
/*     */     //   354: aload_1
/*     */     //   355: aconst_null
/*     */     //   356: ldc_w 'Stock'
/*     */     //   359: invokestatic method_43470 : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   362: dup
/*     */     //   363: ldc_w 'literal(...)'
/*     */     //   366: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   369: checkcast net/minecraft/class_2561
/*     */     //   372: aload_0
/*     */     //   373: getfield x : I
/*     */     //   376: bipush #20
/*     */     //   378: iadd
/*     */     //   379: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   382: checkcast java/lang/Number
/*     */     //   385: aload_0
/*     */     //   386: getfield y : I
/*     */     //   389: bipush #11
/*     */     //   391: iadd
/*     */     //   392: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   395: checkcast java/lang/Number
/*     */     //   398: getstatic net/minecraft/class_124.field_1068 : Lnet/minecraft/class_124;
/*     */     //   401: invokevirtual method_532 : ()Ljava/lang/Integer;
/*     */     //   404: dup
/*     */     //   405: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   408: invokevirtual intValue : ()I
/*     */     //   411: iconst_0
/*     */     //   412: bipush #66
/*     */     //   414: aconst_null
/*     */     //   415: invokestatic drawCenteredText$default : (Lnet/minecraft/class_332;Lnet/minecraft/class_2960;Lnet/minecraft/class_2561;Ljava/lang/Number;Ljava/lang/Number;IZILjava/lang/Object;)V
/*     */     //   418: aload_0
/*     */     //   419: invokevirtual getEditOfferStockBox : ()Lnet/minecraft/class_342;
/*     */     //   422: invokevirtual method_25370 : ()Z
/*     */     //   425: ifne -> 530
/*     */     //   428: aload #7
/*     */     //   430: invokevirtual getStock : ()I
/*     */     //   433: ifne -> 452
/*     */     //   436: getstatic net/minecraft/class_124.field_1079 : Lnet/minecraft/class_124;
/*     */     //   439: invokevirtual method_532 : ()Ljava/lang/Integer;
/*     */     //   442: dup
/*     */     //   443: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   446: invokevirtual intValue : ()I
/*     */     //   449: goto -> 465
/*     */     //   452: getstatic net/minecraft/class_124.field_1077 : Lnet/minecraft/class_124;
/*     */     //   455: invokevirtual method_532 : ()Ljava/lang/Integer;
/*     */     //   458: dup
/*     */     //   459: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   462: invokevirtual intValue : ()I
/*     */     //   465: istore #9
/*     */     //   467: aload_1
/*     */     //   468: aconst_null
/*     */     //   469: aload #7
/*     */     //   471: invokevirtual getStock : ()I
/*     */     //   474: i2l
/*     */     //   475: invokestatic valueOf : (J)Ljava/math/BigInteger;
/*     */     //   478: dup
/*     */     //   479: ldc_w 'valueOf(...)'
/*     */     //   482: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   485: iconst_0
/*     */     //   486: invokestatic format : (Ljava/math/BigInteger;Z)Lnet/minecraft/class_5250;
/*     */     //   489: checkcast net/minecraft/class_2561
/*     */     //   492: aload_0
/*     */     //   493: getfield x : I
/*     */     //   496: bipush #20
/*     */     //   498: iadd
/*     */     //   499: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   502: checkcast java/lang/Number
/*     */     //   505: aload_0
/*     */     //   506: getfield y : I
/*     */     //   509: bipush #24
/*     */     //   511: iadd
/*     */     //   512: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   515: checkcast java/lang/Number
/*     */     //   518: iload #9
/*     */     //   520: iconst_0
/*     */     //   521: bipush #66
/*     */     //   523: aconst_null
/*     */     //   524: invokestatic drawCenteredText$default : (Lnet/minecraft/class_332;Lnet/minecraft/class_2960;Lnet/minecraft/class_2561;Ljava/lang/Number;Ljava/lang/Number;IZILjava/lang/Object;)V
/*     */     //   527: goto -> 542
/*     */     //   530: aload_0
/*     */     //   531: invokevirtual getEditOfferStockBox : ()Lnet/minecraft/class_342;
/*     */     //   534: aload_1
/*     */     //   535: iload_2
/*     */     //   536: iload_3
/*     */     //   537: fload #4
/*     */     //   539: invokevirtual method_25394 : (Lnet/minecraft/class_332;IIF)V
/*     */     //   542: aload_1
/*     */     //   543: aload_0
/*     */     //   544: getfield x : I
/*     */     //   547: iconst_3
/*     */     //   548: iadd
/*     */     //   549: aload_0
/*     */     //   550: getfield y : I
/*     */     //   553: bipush #75
/*     */     //   555: iadd
/*     */     //   556: iconst_0
/*     */     //   557: nop
/*     */     //   558: aload #7
/*     */     //   560: invokevirtual getPrice : ()Ljava/math/BigInteger;
/*     */     //   563: aload_0
/*     */     //   564: getfield buyAmount : I
/*     */     //   567: i2l
/*     */     //   568: invokestatic valueOf : (J)Ljava/math/BigInteger;
/*     */     //   571: dup
/*     */     //   572: ldc_w 'valueOf(...)'
/*     */     //   575: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   578: invokevirtual multiply : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
/*     */     //   581: dup
/*     */     //   582: ldc_w 'multiply(...)'
/*     */     //   585: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   588: iconst_0
/*     */     //   589: getstatic fr/harmex/cobbledollars/common/client/utils/Context.SHOP : Lfr/harmex/cobbledollars/common/client/utils/Context;
/*     */     //   592: aconst_null
/*     */     //   593: bipush #84
/*     */     //   595: aconst_null
/*     */     //   596: invokestatic renderCobbleDollarsElement$default : (Lnet/minecraft/class_332;IIZLjava/math/BigInteger;ZLfr/harmex/cobbledollars/common/client/utils/Context;Ljava/lang/Integer;ILjava/lang/Object;)V
/*     */     //   599: aload_0
/*     */     //   600: invokevirtual getBuyButton : ()Lfr/harmex/cobbledollars/common/client/gui/screen/widget/BuyButton;
/*     */     //   603: iload_2
/*     */     //   604: i2d
/*     */     //   605: iload_3
/*     */     //   606: i2d
/*     */     //   607: invokevirtual method_25405 : (DD)Z
/*     */     //   610: ifeq -> 1013
/*     */     //   613: aload #7
/*     */     //   615: invokevirtual getStock : ()I
/*     */     //   618: ifle -> 779
/*     */     //   621: aload #7
/*     */     //   623: invokevirtual getStock : ()I
/*     */     //   626: aload_0
/*     */     //   627: getfield buyAmount : I
/*     */     //   630: if_icmpge -> 779
/*     */     //   633: aload #7
/*     */     //   635: invokevirtual getStock : ()I
/*     */     //   638: invokestatic valueOf : (I)Ljava/lang/String;
/*     */     //   641: invokestatic toComponent : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   644: invokestatic darkGreen : (Lnet/minecraft/class_5250;)Lnet/minecraft/class_5250;
/*     */     //   647: astore #9
/*     */     //   649: nop
/*     */     //   650: aload #7
/*     */     //   652: invokevirtual getPrice : ()Ljava/math/BigInteger;
/*     */     //   655: aload #7
/*     */     //   657: invokevirtual getStock : ()I
/*     */     //   660: i2l
/*     */     //   661: invokestatic valueOf : (J)Ljava/math/BigInteger;
/*     */     //   664: dup
/*     */     //   665: ldc_w 'valueOf(...)'
/*     */     //   668: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   671: invokevirtual multiply : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
/*     */     //   674: dup
/*     */     //   675: ldc_w 'multiply(...)'
/*     */     //   678: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   681: iconst_0
/*     */     //   682: iconst_1
/*     */     //   683: aconst_null
/*     */     //   684: invokestatic format$default : (Ljava/math/BigInteger;ZILjava/lang/Object;)Lnet/minecraft/class_5250;
/*     */     //   687: invokestatic darkGreen : (Lnet/minecraft/class_5250;)Lnet/minecraft/class_5250;
/*     */     //   690: astore #10
/*     */     //   692: aload_1
/*     */     //   693: aload_0
/*     */     //   694: getfield field_22793 : Lnet/minecraft/class_327;
/*     */     //   697: iconst_2
/*     */     //   698: anewarray net/minecraft/class_2561
/*     */     //   701: astore #11
/*     */     //   703: aload #11
/*     */     //   705: iconst_0
/*     */     //   706: ldc_w 'Not Enough Stock!'
/*     */     //   709: invokestatic toComponent : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   712: invokestatic red : (Lnet/minecraft/class_5250;)Lnet/minecraft/class_5250;
/*     */     //   715: aastore
/*     */     //   716: aload #11
/*     */     //   718: iconst_1
/*     */     //   719: ldc_w 'Will buy '
/*     */     //   722: invokestatic toComponent : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   725: invokestatic gray : (Lnet/minecraft/class_5250;)Lnet/minecraft/class_5250;
/*     */     //   728: aload #9
/*     */     //   730: checkcast net/minecraft/class_2561
/*     */     //   733: invokevirtual method_10852 : (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
/*     */     //   736: ldc_w ' for '
/*     */     //   739: invokestatic toComponent : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   742: invokestatic gray : (Lnet/minecraft/class_5250;)Lnet/minecraft/class_5250;
/*     */     //   745: checkcast net/minecraft/class_2561
/*     */     //   748: invokevirtual method_10852 : (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
/*     */     //   751: aload #10
/*     */     //   753: checkcast net/minecraft/class_2561
/*     */     //   756: invokevirtual method_10852 : (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
/*     */     //   759: aastore
/*     */     //   760: aload #11
/*     */     //   762: invokestatic arrayListOf : ([Ljava/lang/Object;)Ljava/util/ArrayList;
/*     */     //   765: checkcast java/util/List
/*     */     //   768: invokestatic empty : ()Ljava/util/Optional;
/*     */     //   771: iload_2
/*     */     //   772: iload_3
/*     */     //   773: invokevirtual method_51437 : (Lnet/minecraft/class_327;Ljava/util/List;Ljava/util/Optional;II)V
/*     */     //   776: goto -> 1013
/*     */     //   779: aload #7
/*     */     //   781: invokevirtual getStock : ()I
/*     */     //   784: ifne -> 830
/*     */     //   787: aload_1
/*     */     //   788: aload_0
/*     */     //   789: getfield field_22793 : Lnet/minecraft/class_327;
/*     */     //   792: iconst_1
/*     */     //   793: anewarray net/minecraft/class_2561
/*     */     //   796: astore #9
/*     */     //   798: aload #9
/*     */     //   800: iconst_0
/*     */     //   801: ldc_w 'Out of Stock!'
/*     */     //   804: invokestatic toComponent : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   807: invokestatic red : (Lnet/minecraft/class_5250;)Lnet/minecraft/class_5250;
/*     */     //   810: aastore
/*     */     //   811: aload #9
/*     */     //   813: invokestatic arrayListOf : ([Ljava/lang/Object;)Ljava/util/ArrayList;
/*     */     //   816: checkcast java/util/List
/*     */     //   819: invokestatic empty : ()Ljava/util/Optional;
/*     */     //   822: iload_2
/*     */     //   823: iload_3
/*     */     //   824: invokevirtual method_51437 : (Lnet/minecraft/class_327;Ljava/util/List;Ljava/util/Optional;II)V
/*     */     //   827: goto -> 1013
/*     */     //   830: aload_0
/*     */     //   831: getfield field_22787 : Lnet/minecraft/class_310;
/*     */     //   834: dup
/*     */     //   835: ifnull -> 1011
/*     */     //   838: getfield field_1724 : Lnet/minecraft/class_746;
/*     */     //   841: dup
/*     */     //   842: ifnull -> 1011
/*     */     //   845: checkcast net/minecraft/class_1657
/*     */     //   848: aload #7
/*     */     //   850: invokevirtual getItem : ()Lnet/minecraft/class_1799;
/*     */     //   853: invokestatic getMaxAmountObtainable : (Lnet/minecraft/class_1657;Lnet/minecraft/class_1799;)I
/*     */     //   856: istore #12
/*     */     //   858: iconst_0
/*     */     //   859: istore #13
/*     */     //   861: iload #12
/*     */     //   863: aload_0
/*     */     //   864: getfield buyAmount : I
/*     */     //   867: if_icmpge -> 1007
/*     */     //   870: iload #12
/*     */     //   872: invokestatic valueOf : (I)Ljava/lang/String;
/*     */     //   875: invokestatic toComponent : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   878: invokestatic darkGreen : (Lnet/minecraft/class_5250;)Lnet/minecraft/class_5250;
/*     */     //   881: astore #14
/*     */     //   883: nop
/*     */     //   884: aload #7
/*     */     //   886: invokevirtual getPrice : ()Ljava/math/BigInteger;
/*     */     //   889: iload #12
/*     */     //   891: i2l
/*     */     //   892: invokestatic valueOf : (J)Ljava/math/BigInteger;
/*     */     //   895: dup
/*     */     //   896: ldc_w 'valueOf(...)'
/*     */     //   899: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   902: invokevirtual multiply : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
/*     */     //   905: dup
/*     */     //   906: ldc_w 'multiply(...)'
/*     */     //   909: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   912: iconst_0
/*     */     //   913: iconst_1
/*     */     //   914: aconst_null
/*     */     //   915: invokestatic format$default : (Ljava/math/BigInteger;ZILjava/lang/Object;)Lnet/minecraft/class_5250;
/*     */     //   918: invokestatic darkGreen : (Lnet/minecraft/class_5250;)Lnet/minecraft/class_5250;
/*     */     //   921: astore #15
/*     */     //   923: aload_1
/*     */     //   924: aload_0
/*     */     //   925: getfield field_22793 : Lnet/minecraft/class_327;
/*     */     //   928: iconst_2
/*     */     //   929: anewarray net/minecraft/class_2561
/*     */     //   932: astore #16
/*     */     //   934: aload #16
/*     */     //   936: iconst_0
/*     */     //   937: ldc_w 'Not Enough Inventory Space!'
/*     */     //   940: invokestatic toComponent : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   943: invokestatic red : (Lnet/minecraft/class_5250;)Lnet/minecraft/class_5250;
/*     */     //   946: aastore
/*     */     //   947: aload #16
/*     */     //   949: iconst_1
/*     */     //   950: ldc_w 'Will buy '
/*     */     //   953: invokestatic toComponent : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   956: invokestatic gray : (Lnet/minecraft/class_5250;)Lnet/minecraft/class_5250;
/*     */     //   959: aload #14
/*     */     //   961: checkcast net/minecraft/class_2561
/*     */     //   964: invokevirtual method_10852 : (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
/*     */     //   967: ldc_w ' for '
/*     */     //   970: invokestatic toComponent : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   973: invokestatic gray : (Lnet/minecraft/class_5250;)Lnet/minecraft/class_5250;
/*     */     //   976: checkcast net/minecraft/class_2561
/*     */     //   979: invokevirtual method_10852 : (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
/*     */     //   982: aload #15
/*     */     //   984: checkcast net/minecraft/class_2561
/*     */     //   987: invokevirtual method_10852 : (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
/*     */     //   990: aastore
/*     */     //   991: aload #16
/*     */     //   993: invokestatic arrayListOf : ([Ljava/lang/Object;)Ljava/util/ArrayList;
/*     */     //   996: checkcast java/util/List
/*     */     //   999: invokestatic empty : ()Ljava/util/Optional;
/*     */     //   1002: iload_2
/*     */     //   1003: iload_3
/*     */     //   1004: invokevirtual method_51437 : (Lnet/minecraft/class_327;Ljava/util/List;Ljava/util/Optional;II)V
/*     */     //   1007: nop
/*     */     //   1008: goto -> 1013
/*     */     //   1011: pop
/*     */     //   1012: nop
/*     */     //   1013: nop
/*     */     //   1014: goto -> 1019
/*     */     //   1017: pop
/*     */     //   1018: nop
/*     */     //   1019: aload_0
/*     */     //   1020: getfield offerList : Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget;
/*     */     //   1023: iload_2
/*     */     //   1024: i2d
/*     */     //   1025: iload_3
/*     */     //   1026: i2d
/*     */     //   1027: invokevirtual method_25405 : (DD)Z
/*     */     //   1030: ifeq -> 1264
/*     */     //   1033: aload_0
/*     */     //   1034: getfield offerList : Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget;
/*     */     //   1037: invokevirtual method_25396 : ()Ljava/util/List;
/*     */     //   1040: dup
/*     */     //   1041: ldc_w 'children(...)'
/*     */     //   1044: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1047: checkcast java/lang/Iterable
/*     */     //   1050: astore #5
/*     */     //   1052: iconst_0
/*     */     //   1053: istore #6
/*     */     //   1055: aload #5
/*     */     //   1057: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1062: astore #7
/*     */     //   1064: aload #7
/*     */     //   1066: invokeinterface hasNext : ()Z
/*     */     //   1071: ifeq -> 1263
/*     */     //   1074: aload #7
/*     */     //   1076: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1081: astore #8
/*     */     //   1083: aload #8
/*     */     //   1085: checkcast fr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry
/*     */     //   1088: astore #9
/*     */     //   1090: iconst_0
/*     */     //   1091: istore #10
/*     */     //   1093: aload #9
/*     */     //   1095: iload_2
/*     */     //   1096: i2d
/*     */     //   1097: iload_3
/*     */     //   1098: i2d
/*     */     //   1099: invokevirtual method_25405 : (DD)Z
/*     */     //   1102: ifeq -> 1258
/*     */     //   1105: aload #9
/*     */     //   1107: invokevirtual isAddOffer : ()Z
/*     */     //   1110: ifeq -> 1207
/*     */     //   1113: aload_0
/*     */     //   1114: getfield field_2797 : Lnet/minecraft/class_1703;
/*     */     //   1117: checkcast fr/harmex/cobbledollars/common/world/inventory/ShopMenu
/*     */     //   1120: invokevirtual method_34255 : ()Lnet/minecraft/class_1799;
/*     */     //   1123: invokevirtual method_7960 : ()Z
/*     */     //   1126: ifne -> 1182
/*     */     //   1129: aload_1
/*     */     //   1130: aload_0
/*     */     //   1131: getfield field_22793 : Lnet/minecraft/class_327;
/*     */     //   1134: ldc_w 'gui'
/*     */     //   1137: ldc_w 'add_offer'
/*     */     //   1140: iconst_1
/*     */     //   1141: anewarray java/lang/Object
/*     */     //   1144: astore #11
/*     */     //   1146: aload #11
/*     */     //   1148: iconst_0
/*     */     //   1149: aload_0
/*     */     //   1150: getfield field_2797 : Lnet/minecraft/class_1703;
/*     */     //   1153: checkcast fr/harmex/cobbledollars/common/world/inventory/ShopMenu
/*     */     //   1156: invokevirtual method_34255 : ()Lnet/minecraft/class_1799;
/*     */     //   1159: invokevirtual method_7954 : ()Lnet/minecraft/class_2561;
/*     */     //   1162: aastore
/*     */     //   1163: aload #11
/*     */     //   1165: invokestatic cobbleDollarsLang : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Lnet/minecraft/class_5250;
/*     */     //   1168: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   1171: invokestatic empty : ()Ljava/util/Optional;
/*     */     //   1174: iload_2
/*     */     //   1175: iload_3
/*     */     //   1176: invokevirtual method_51437 : (Lnet/minecraft/class_327;Ljava/util/List;Ljava/util/Optional;II)V
/*     */     //   1179: goto -> 1258
/*     */     //   1182: aload_1
/*     */     //   1183: aload_0
/*     */     //   1184: getfield field_22793 : Lnet/minecraft/class_327;
/*     */     //   1187: ldc_w 'Click with an item to add the offer'
/*     */     //   1190: invokestatic method_43470 : (Ljava/lang/String;)Lnet/minecraft/class_5250;
/*     */     //   1193: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   1196: invokestatic empty : ()Ljava/util/Optional;
/*     */     //   1199: iload_2
/*     */     //   1200: iload_3
/*     */     //   1201: invokevirtual method_51437 : (Lnet/minecraft/class_327;Ljava/util/List;Ljava/util/Optional;II)V
/*     */     //   1204: goto -> 1258
/*     */     //   1207: aload_0
/*     */     //   1208: getfield isEditMode : Z
/*     */     //   1211: ifeq -> 1239
/*     */     //   1214: aload_0
/*     */     //   1215: getfield offerList : Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget;
/*     */     //   1218: invokevirtual method_25334 : ()Lnet/minecraft/class_350$class_351;
/*     */     //   1221: aload #9
/*     */     //   1223: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1226: ifeq -> 1239
/*     */     //   1229: aload #9
/*     */     //   1231: iload_2
/*     */     //   1232: iload_3
/*     */     //   1233: invokevirtual isMouseOverCross : (II)Z
/*     */     //   1236: ifne -> 1258
/*     */     //   1239: aload #9
/*     */     //   1241: invokevirtual getOffer : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;
/*     */     //   1244: aload_0
/*     */     //   1245: getfield field_22787 : Lnet/minecraft/class_310;
/*     */     //   1248: dup
/*     */     //   1249: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   1252: aload_1
/*     */     //   1253: iload_2
/*     */     //   1254: iload_3
/*     */     //   1255: invokevirtual renderTooltip : (Lnet/minecraft/class_310;Lnet/minecraft/class_332;II)V
/*     */     //   1258: nop
/*     */     //   1259: nop
/*     */     //   1260: goto -> 1064
/*     */     //   1263: nop
/*     */     //   1264: aload_0
/*     */     //   1265: aload_1
/*     */     //   1266: iload_2
/*     */     //   1267: iload_3
/*     */     //   1268: invokevirtual method_2380 : (Lnet/minecraft/class_332;II)V
/*     */     //   1271: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #245	-> 8
/*     */     //   #248	-> 16
/*     */     //   #249	-> 23
/*     */     //   #250	-> 35
/*     */     //   #254	-> 47
/*     */     //   #255	-> 48
/*     */     //   #256	-> 65
/*     */     //   #254	-> 77
/*     */     //   #257	-> 79
/*     */     //   #254	-> 80
/*     */     //   #261	-> 88
/*     */     //   #263	-> 107
/*     */     //   #264	-> 114
/*     */     //   #265	-> 124
/*     */     //   #265	-> 146
/*     */     //   #265	-> 163
/*     */     //   #266	-> 167
/*     */     //   #267	-> 174
/*     */     //   #268	-> 249
/*     */     //   #272	-> 264
/*     */     //   #274	-> 279
/*     */     //   #275	-> 290
/*     */     //   #276	-> 294
/*     */     //   #277	-> 307
/*     */     //   #278	-> 320
/*     */     //   #279	-> 328
/*     */     //   #273	-> 336
/*     */     //   #282	-> 354
/*     */     //   #281	-> 355
/*     */     //   #283	-> 356
/*     */     //   #284	-> 372
/*     */     //   #285	-> 385
/*     */     //   #286	-> 398
/*     */     //   #281	-> 411
/*     */     //   #288	-> 418
/*     */     //   #289	-> 428
/*     */     //   #291	-> 467
/*     */     //   #290	-> 468
/*     */     //   #292	-> 469
/*     */     //   #292	-> 485
/*     */     //   #293	-> 492
/*     */     //   #294	-> 505
/*     */     //   #295	-> 518
/*     */     //   #290	-> 520
/*     */     //   #298	-> 530
/*     */     //   #303	-> 542
/*     */     //   #304	-> 543
/*     */     //   #305	-> 549
/*     */     //   #303	-> 556
/*     */     //   #306	-> 557
/*     */     //   #306	-> 558
/*     */     //   #303	-> 588
/*     */     //   #307	-> 589
/*     */     //   #303	-> 592
/*     */     //   #311	-> 599
/*     */     //   #313	-> 613
/*     */     //   #314	-> 633
/*     */     //   #315	-> 649
/*     */     //   #315	-> 650
/*     */     //   #315	-> 681
/*     */     //   #316	-> 692
/*     */     //   #317	-> 697
/*     */     //   #318	-> 719
/*     */     //   #319	-> 728
/*     */     //   #320	-> 736
/*     */     //   #321	-> 751
/*     */     //   #317	-> 760
/*     */     //   #316	-> 762
/*     */     //   #322	-> 768
/*     */     //   #316	-> 773
/*     */     //   #324	-> 779
/*     */     //   #325	-> 787
/*     */     //   #326	-> 792
/*     */     //   #325	-> 813
/*     */     //   #327	-> 819
/*     */     //   #325	-> 824
/*     */     //   #329	-> 830
/*     */     //   #331	-> 861
/*     */     //   #332	-> 870
/*     */     //   #333	-> 883
/*     */     //   #333	-> 884
/*     */     //   #333	-> 912
/*     */     //   #334	-> 923
/*     */     //   #335	-> 928
/*     */     //   #336	-> 950
/*     */     //   #337	-> 959
/*     */     //   #338	-> 967
/*     */     //   #339	-> 982
/*     */     //   #335	-> 991
/*     */     //   #334	-> 993
/*     */     //   #340	-> 999
/*     */     //   #334	-> 1004
/*     */     //   #342	-> 1007
/*     */     //   #329	-> 1008
/*     */     //   #329	-> 1011
/*     */     //   #345	-> 1013
/*     */     //   #261	-> 1014
/*     */     //   #261	-> 1017
/*     */     //   #348	-> 1019
/*     */     //   #349	-> 1033
/*     */     //   #438	-> 1055
/*     */     //   #350	-> 1093
/*     */     //   #351	-> 1105
/*     */     //   #352	-> 1113
/*     */     //   #353	-> 1129
/*     */     //   #355	-> 1182
/*     */     //   #357	-> 1207
/*     */     //   #358	-> 1239
/*     */     //   #361	-> 1258
/*     */     //   #438	-> 1259
/*     */     //   #439	-> 1263
/*     */     //   #365	-> 1264
/*     */     //   #366	-> 1271
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   467	60	9	color	I
/*     */     //   649	127	9	maxAmountComponent	Lnet/minecraft/class_5250;
/*     */     //   692	84	10	priceComponent	Lnet/minecraft/class_5250;
/*     */     //   883	124	14	maxAmountComponent	Lnet/minecraft/class_5250;
/*     */     //   923	84	15	priceComponent	Lnet/minecraft/class_5250;
/*     */     //   861	147	13	$i$a$-let-ShopScreen$render$1$1	I
/*     */     //   858	150	12	maxAmount	I
/*     */     //   107	907	8	$i$a$-let-ShopScreen$render$1	I
/*     */     //   104	910	7	offerEntry	Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry;
/*     */     //   1093	166	10	$i$a$-forEach-ShopScreen$render$2	I
/*     */     //   1090	169	9	it	Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry;
/*     */     //   1083	177	8	element$iv	Ljava/lang/Object;
/*     */     //   1055	209	6	$i$f$forEach	I
/*     */     //   1052	212	5	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   0	1272	0	this	Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;
/*     */     //   0	1272	1	guiGraphics	Lnet/minecraft/class_332;
/*     */     //   0	1272	2	mouseX	I
/*     */     //   0	1272	3	mouseY	I
/*     */     //   0	1272	4	partialTick	F
/*     */   }
/*     */   
/*     */   public void method_25410(@NotNull class_310 minecraft, int width, int height) {
/* 369 */     Intrinsics.checkNotNullParameter(minecraft, "minecraft");
/* 369 */     String editCategoryNameValue = getEditCategoryNameBox().method_1882();
/* 370 */     String editOfferPriceValue = getEditOfferPriceBox().method_1882();
/* 371 */     String editOfferStockValue = getEditOfferStockBox().method_1882();
/* 372 */     String searchedCategory = getSearchCategoryBox().method_1882();
/* 373 */     String searchedOffer = getSearchOfferBox().method_1882();
/* 374 */     String buyAmountSet = getBuyAmountBox().method_1882();
/* 374 */     super
/* 375 */       .method_25410(minecraft, width, height);
/* 376 */     getEditCategoryNameBox().method_1852(editCategoryNameValue);
/* 377 */     getEditOfferPriceBox().method_1852(editOfferPriceValue);
/* 378 */     getEditOfferStockBox().method_1852(editOfferStockValue);
/* 379 */     getSearchCategoryBox().method_1852(searchedCategory);
/* 380 */     getSearchOfferBox().method_1852(searchedOffer);
/* 381 */     getBuyAmountBox().method_1852(buyAmountSet);
/*     */   }
/*     */   
/*     */   public boolean method_25404(int keyCode, int scanCode, int modifiers) {
/* 385 */     return 
/* 386 */       (keyCode == 256) ? super.method_25404(keyCode, scanCode, modifiers) : (
/* 387 */       getEditCategoryNameBox().method_20315() ? getEditCategoryNameBox().method_25404(keyCode, scanCode, modifiers) : (
/* 388 */       getEditOfferPriceBox().method_20315() ? getEditOfferPriceBox().method_25404(keyCode, scanCode, modifiers) : (
/* 389 */       getEditOfferStockBox().method_20315() ? getEditOfferStockBox().method_25404(keyCode, scanCode, modifiers) : (
/* 390 */       getSearchCategoryBox().method_20315() ? getSearchCategoryBox().method_25404(keyCode, scanCode, modifiers) : (
/* 391 */       getSearchOfferBox().method_20315() ? getSearchOfferBox().method_25404(keyCode, scanCode, modifiers) : (
/* 392 */       getBuyAmountBox().method_20315() ? getBuyAmountBox().method_25404(keyCode, scanCode, modifiers) : super
/* 393 */       .method_25404(keyCode, scanCode, modifiers)))))));
/*     */   }
/*     */   
/*     */   public boolean method_25401(double mouseX, double mouseY, double scrollX, double scrollY) {
/* 398 */     if (this.categoryList.method_25405(mouseX, mouseY))
/* 398 */       this.categoryList.method_25401(mouseX, mouseY, scrollX, scrollY); 
/* 399 */     if (this.offerList.method_25405(mouseX, mouseY))
/* 399 */       this.offerList.method_25401(mouseX, mouseY, scrollX, scrollY); 
/* 400 */     return super.method_25401(mouseX, mouseY, scrollX, scrollY);
/*     */   }
/*     */   
/*     */   public boolean method_25402(double mouseX, double mouseY, int button) {
/* 404 */     if (!getEditCategoryNameBox().method_25402(mouseX, mouseY, button))
/* 404 */       getEditCategoryNameBox().method_25365(false); 
/* 405 */     if (!getEditOfferPriceBox().method_25402(mouseX, mouseY, button))
/* 405 */       getEditOfferPriceBox().method_25365(false); 
/* 406 */     if (!getEditOfferStockBox().method_25402(mouseX, mouseY, button))
/* 406 */       getEditOfferStockBox().method_25365(false); 
/* 408 */     this.categoryList.method_25402(mouseX, mouseY, button);
/* 409 */     this.offerList.method_25402(mouseX, mouseY, button);
/* 411 */     if (!getSearchCategoryBox().method_25402(mouseX, mouseY, button))
/* 411 */       getSearchCategoryBox().method_25365(false); 
/* 412 */     if (!getSearchOfferBox().method_25402(mouseX, mouseY, button))
/* 412 */       getSearchOfferBox().method_25365(false); 
/* 413 */     if (!getBuyAmountBox().method_25402(mouseX, mouseY, button))
/* 413 */       getBuyAmountBox().method_25365(false); 
/* 414 */     return super.method_25402(mouseX, mouseY, button);
/*     */   }
/*     */   
/*     */   public boolean method_25403(double mouseX, double mouseY, int button, double dragX, double dragY) {
/* 418 */     this.categoryList.method_25403(mouseX, mouseY, button, dragX, dragY);
/* 419 */     this.offerList.method_25403(mouseX, mouseY, button, dragX, dragY);
/* 420 */     return super.method_25403(mouseX, mouseY, button, dragX, dragY);
/*     */   }
/*     */   
/*     */   public boolean method_25406(double mouseX, double mouseY, int button) {
/* 424 */     this.categoryList.method_25406(mouseX, mouseY, button);
/* 425 */     this.offerList.method_25406(mouseX, mouseY, button);
/* 426 */     return super.method_25406(mouseX, mouseY, button);
/*     */   }
/*     */   
/*     */   public void method_25419() {
/* 431 */     if (this.isEditMode)
/* 431 */       syncShopToServer(); 
/* 434 */     CobbleDollarsNetwork.INSTANCE.sendToServer((NetworkPacket)new CloseShopPacket(((ShopMenu)this.field_2797).getCobbleMerchant().getMerchantUUID()));
/* 434 */     super
/* 435 */       .method_25419();
/*     */   }
/*     */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\client\gui\screen\ShopScreen.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */