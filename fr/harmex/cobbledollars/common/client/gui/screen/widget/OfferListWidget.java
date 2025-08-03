/*     */ package fr.harmex.cobbledollars.common.client.gui.screen.widget;
/*     */ 
/*     */ import com.cobblemon.mod.common.api.gui.GuiUtilsKt;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import fr.harmex.cobbledollars.common.client.gui.screen.ShopScreen;
/*     */ import fr.harmex.cobbledollars.common.client.utils.Context;
/*     */ import fr.harmex.cobbledollars.common.client.utils.GuiUtilsKt;
/*     */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*     */ import fr.harmex.cobbledollars.common.utils.extensions.PlayerExtensionKt;
/*     */ import fr.harmex.cobbledollars.common.world.inventory.ShopMenu;
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Category;
/*     */ import fr.harmex.cobbledollars.common.world.item.trading.shop.Offer;
/*     */ import java.math.BigInteger;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import net.minecraft.class_1657;
/*     */ import net.minecraft.class_1799;
/*     */ import net.minecraft.class_2561;
/*     */ import net.minecraft.class_2960;
/*     */ import net.minecraft.class_310;
/*     */ import net.minecraft.class_332;
/*     */ import net.minecraft.class_350;
/*     */ import net.minecraft.class_364;
/*     */ import net.minecraft.class_4280;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000`\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\020\016\n\002\b\005\n\002\030\002\n\002\b\022\n\002\020\007\n\002\b\017\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\030\000 L2\f\022\b\022\0060\002R\0020\0000\001:\002LMB\037\022\006\020\004\032\0020\003\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005¢\006\004\b\b\020\tJ\027\020\r\032\0020\f2\b\020\013\032\004\030\0010\n¢\006\004\b\r\020\016J\025\020\021\032\0020\f2\006\020\020\032\0020\017¢\006\004\b\021\020\022J\025\020\023\032\0020\f2\006\020\020\032\0020\017¢\006\004\b\023\020\022J\025\020\024\032\0020\f2\006\020\020\032\0020\017¢\006\004\b\024\020\022J\027\020\027\032\0020\f2\006\020\026\032\0020\025H\024¢\006\004\b\027\020\030J'\020\033\032\0020\f2\006\020\026\032\0020\0252\006\020\031\032\0020\0052\006\020\032\032\0020\005H\024¢\006\004\b\033\020\034J\027\020\035\032\0020\f2\006\020\026\032\0020\025H\024¢\006\004\b\035\020\030J?\020#\032\0020\f2\006\020\026\032\0020\0252\006\020\036\032\0020\0052\006\020\037\032\0020\0052\006\020 \032\0020\0052\006\020!\032\0020\0052\006\020\"\032\0020\005H\024¢\006\004\b#\020$J'\020'\032\0020\f2\006\020\026\032\0020\0252\006\020%\032\0020\0052\006\020&\032\0020\005H\024¢\006\004\b'\020\034J/\020*\032\0020\f2\006\020\026\032\0020\0252\006\020%\032\0020\0052\006\020&\032\0020\0052\006\020)\032\0020(H\026¢\006\004\b*\020+J\033\020-\032\0020\0052\n\020,\032\0060\002R\0020\000H\024¢\006\004\b-\020.J\017\020/\032\0020\005H\026¢\006\004\b/\0200J\017\0201\032\0020\005H\026¢\006\004\b1\0200J\017\0202\032\0020\005H\026¢\006\004\b2\0200J\027\0204\032\0020\0052\006\0203\032\0020\005H\024¢\006\004\b4\0205J\027\0206\032\0020\0052\006\0203\032\0020\005H\024¢\006\004\b6\0205J\017\0207\032\0020\005H\024¢\006\004\b7\0200J\031\020:\032\0020\f2\b\0209\032\004\030\00108H\026¢\006\004\b:\020;R\027\020\004\032\0020\0038\006¢\006\f\n\004\b\004\020<\032\004\b=\020>R\026\020?\032\0020\0178\002@\002X\016¢\006\006\n\004\b?\020@R\026\020A\032\0020\0178\002@\002X\016¢\006\006\n\004\bA\020@R\026\020B\032\0020\0178\002@\002X\016¢\006\006\n\004\bB\020@R\026\020D\032\0020C8\002@\002X\016¢\006\006\n\004\bD\020ER\030\020\013\032\004\030\0010\n8\002@\002X\016¢\006\006\n\004\b\013\020FR&\020J\032\022\022\004\022\0020H0Gj\b\022\004\022\0020H`I8\002@\002X\016¢\006\006\n\004\bJ\020K¨\006N"}, d2 = {"Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget;", "Lnet/minecraft/class_4280;", "Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry;", "Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;", "shopScreen", "", "listX", "listY", "<init>", "(Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;II)V", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;", "category", "", "createOfferEntries", "(Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;)V", "", "filter", "search", "(Ljava/lang/String;)V", "editOfferPrice", "editOfferStock", "Lnet/minecraft/class_332;", "guiGraphics", "renderListBackground", "(Lnet/minecraft/class_332;)V", "x", "y", "renderHeader", "(Lnet/minecraft/class_332;II)V", "renderListSeparators", "top", "width", "height", "outerColor", "innerColor", "renderSelection", "(Lnet/minecraft/class_332;IIIII)V", "mouseX", "mouseY", "renderDecorations", "", "partialTick", "renderWidget", "(Lnet/minecraft/class_332;IIF)V", "entry", "addEntry", "(Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry;)I", "getRowWidth", "()I", "getRowLeft", "getRowRight", "index", "getRowTop", "(I)I", "getRowBottom", "getScrollbarPosition", "Lnet/minecraft/class_364;", "focused", "setFocused", "(Lnet/minecraft/class_364;)V", "Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;", "getShopScreen", "()Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;", "lastOfferPrice", "Ljava/lang/String;", "lastOfferStock", "lastSearch", "", "offersCreated", "Z", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;", "Ljava/util/ArrayList;", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;", "Lkotlin/collections/ArrayList;", "offers", "Ljava/util/ArrayList;", "Companion", "OfferEntry", "common"})
/*     */ @SourceDebugExtension({"SMAP\nOfferListWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfferListWidget.kt\nfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,289:1\n1053#2:290\n1557#2:291\n1628#2,3:292\n1863#2,2:295\n360#2,7:297\n774#2:305\n865#2,2:306\n1053#2:308\n1557#2:309\n1628#2,3:310\n1863#2,2:313\n1#3:304\n*S KotlinDebug\n*F\n+ 1 OfferListWidget.kt\nfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget\n*L\n61#1:290\n61#1:291\n61#1:292,3\n65#1:295,2\n68#1:297,7\n76#1:305\n76#1:306,2\n76#1:308\n76#1:309\n76#1:310,3\n80#1:313,2\n*E\n"})
/*     */ public final class OfferListWidget extends class_4280<OfferListWidget.OfferEntry> {
/*     */   @NotNull
/*     */   public final ShopScreen getShopScreen() {
/*  25 */     return this.shopScreen;
/*     */   }
/*     */   
/*     */   public OfferListWidget(@NotNull ShopScreen shopScreen, int listX, int listY) {
/*  28 */     super(
/*  29 */         class_310.method_1551(), 
/*  30 */         79, 
/*  31 */         173, 
/*  32 */         listY, 
/*  33 */         18);
/*     */     this.shopScreen = shopScreen;
/*  44 */     method_46421(listX);
/*  45 */     method_46419(listY);
/*  47 */     this.lastOfferPrice = "";
/*  48 */     this.lastOfferStock = "";
/*  49 */     this.lastSearch = "";
/*  52 */     this.offers = new ArrayList<>();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\005\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\024\020\005\032\0020\0048\006XT¢\006\006\n\004\b\005\020\006R\024\020\007\032\0020\0048\006XT¢\006\006\n\004\b\007\020\006R\024\020\b\032\0020\0048\006XT¢\006\006\n\004\b\b\020\006R\024\020\t\032\0020\0048\006XT¢\006\006\n\004\b\t\020\006R\024\020\013\032\0020\n8\002X\004¢\006\006\n\004\b\013\020\fR\024\020\r\032\0020\n8\002X\004¢\006\006\n\004\b\r\020\f¨\006\016"}, d2 = {"Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$Companion;", "", "<init>", "()V", "", "WIDTH", "I", "HEIGHT", "ENTRY_WIDTH", "ENTRY_HEIGHT", "Lnet/minecraft/class_2960;", "OFFER_BACKGROUND_LOCATION", "Lnet/minecraft/class_2960;", "OFFER_OUTLINE_LOCATION", "common"})
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
/*     */   private String lastOfferPrice;
/*     */   
/*     */   @NotNull
/*     */   private String lastOfferStock;
/*     */   
/*     */   @NotNull
/*     */   private String lastSearch;
/*     */   
/*     */   private boolean offersCreated;
/*     */   
/*     */   @Nullable
/*     */   private Category category;
/*     */   
/*     */   @NotNull
/*     */   private ArrayList<Offer> offers;
/*     */   
/*     */   public static final int WIDTH = 79;
/*     */   
/*     */   public static final int HEIGHT = 173;
/*     */   
/*     */   public static final int ENTRY_WIDTH = 75;
/*     */   
/*     */   public static final int ENTRY_HEIGHT = 18;
/*     */   
/*     */   @NotNull
/*     */   private static final class_2960 OFFER_BACKGROUND_LOCATION = MiscUtilsKt.cobbleDollarsResource("textures/gui/shop/offer_background.png");
/*     */   
/*     */   @NotNull
/*     */   private static final class_2960 OFFER_OUTLINE_LOCATION = MiscUtilsKt.cobbleDollarsResource("textures/gui/shop/offer_outline.png");
/*     */   
/*     */   public final void createOfferEntries(@Nullable Category category) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual method_25334 : ()Lnet/minecraft/class_350$class_351;
/*     */     //   4: checkcast fr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry
/*     */     //   7: dup
/*     */     //   8: ifnull -> 24
/*     */     //   11: invokevirtual getListIndex : ()Ljava/lang/Integer;
/*     */     //   14: dup
/*     */     //   15: ifnull -> 24
/*     */     //   18: invokevirtual intValue : ()I
/*     */     //   21: goto -> 26
/*     */     //   24: pop
/*     */     //   25: iconst_0
/*     */     //   26: istore_2
/*     */     //   27: aload_0
/*     */     //   28: invokevirtual method_25334 : ()Lnet/minecraft/class_350$class_351;
/*     */     //   31: checkcast fr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry
/*     */     //   34: dup
/*     */     //   35: ifnull -> 44
/*     */     //   38: invokevirtual getOffer : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;
/*     */     //   41: goto -> 46
/*     */     //   44: pop
/*     */     //   45: aconst_null
/*     */     //   46: astore_3
/*     */     //   47: aload_0
/*     */     //   48: invokevirtual method_25339 : ()V
/*     */     //   51: aload_0
/*     */     //   52: aload_1
/*     */     //   53: putfield category : Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;
/*     */     //   56: aload_1
/*     */     //   57: dup
/*     */     //   58: ifnull -> 526
/*     */     //   61: astore #4
/*     */     //   63: iconst_0
/*     */     //   64: istore #5
/*     */     //   66: aload_0
/*     */     //   67: aload #4
/*     */     //   69: invokevirtual getOffers : ()Ljava/util/ArrayList;
/*     */     //   72: putfield offers : Ljava/util/ArrayList;
/*     */     //   75: aload #4
/*     */     //   77: invokevirtual getOffers : ()Ljava/util/ArrayList;
/*     */     //   80: checkcast java/lang/Iterable
/*     */     //   83: astore #6
/*     */     //   85: iconst_0
/*     */     //   86: istore #7
/*     */     //   88: aload #6
/*     */     //   90: new fr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$createOfferEntries$lambda$4$$inlined$sortedBy$1
/*     */     //   93: dup
/*     */     //   94: invokespecial <init> : ()V
/*     */     //   97: checkcast java/util/Comparator
/*     */     //   100: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
/*     */     //   103: checkcast java/lang/Iterable
/*     */     //   106: astore #6
/*     */     //   108: nop
/*     */     //   109: iconst_0
/*     */     //   110: istore #7
/*     */     //   112: aload #6
/*     */     //   114: astore #8
/*     */     //   116: new java/util/ArrayList
/*     */     //   119: dup
/*     */     //   120: aload #6
/*     */     //   122: bipush #10
/*     */     //   124: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   127: invokespecial <init> : (I)V
/*     */     //   130: checkcast java/util/Collection
/*     */     //   133: astore #9
/*     */     //   135: iconst_0
/*     */     //   136: istore #10
/*     */     //   138: aload #8
/*     */     //   140: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   145: astore #11
/*     */     //   147: aload #11
/*     */     //   149: invokeinterface hasNext : ()Z
/*     */     //   154: ifeq -> 227
/*     */     //   157: aload #11
/*     */     //   159: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   164: astore #12
/*     */     //   166: aload #9
/*     */     //   168: aload #12
/*     */     //   170: checkcast fr/harmex/cobbledollars/common/world/item/trading/shop/Offer
/*     */     //   173: astore #13
/*     */     //   175: astore #14
/*     */     //   177: iconst_0
/*     */     //   178: istore #15
/*     */     //   180: new fr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry
/*     */     //   183: dup
/*     */     //   184: aload_0
/*     */     //   185: aload #13
/*     */     //   187: iconst_0
/*     */     //   188: iconst_2
/*     */     //   189: aconst_null
/*     */     //   190: invokespecial <init> : (Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget;Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   193: astore #16
/*     */     //   195: aload #16
/*     */     //   197: aload #4
/*     */     //   199: invokevirtual getOffers : ()Ljava/util/ArrayList;
/*     */     //   202: aload #13
/*     */     //   204: invokevirtual indexOf : (Ljava/lang/Object;)I
/*     */     //   207: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   210: invokevirtual setOfferIndex : (Ljava/lang/Integer;)V
/*     */     //   213: aload #16
/*     */     //   215: aload #14
/*     */     //   217: swap
/*     */     //   218: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   223: pop
/*     */     //   224: goto -> 147
/*     */     //   227: aload #9
/*     */     //   229: checkcast java/util/List
/*     */     //   232: nop
/*     */     //   233: checkcast java/lang/Iterable
/*     */     //   236: astore #6
/*     */     //   238: nop
/*     */     //   239: iconst_0
/*     */     //   240: istore #7
/*     */     //   242: aload #6
/*     */     //   244: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   249: astore #8
/*     */     //   251: aload #8
/*     */     //   253: invokeinterface hasNext : ()Z
/*     */     //   258: ifeq -> 291
/*     */     //   261: aload #8
/*     */     //   263: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   268: astore #9
/*     */     //   270: aload #9
/*     */     //   272: checkcast fr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry
/*     */     //   275: astore #10
/*     */     //   277: iconst_0
/*     */     //   278: istore #11
/*     */     //   280: aload_0
/*     */     //   281: aload #10
/*     */     //   283: invokevirtual addEntry : (Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry;)I
/*     */     //   286: pop
/*     */     //   287: nop
/*     */     //   288: goto -> 251
/*     */     //   291: nop
/*     */     //   292: aload_0
/*     */     //   293: getfield shopScreen : Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;
/*     */     //   296: invokevirtual isEditMode : ()Z
/*     */     //   299: ifeq -> 319
/*     */     //   302: aload_0
/*     */     //   303: new fr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry
/*     */     //   306: dup
/*     */     //   307: aload_0
/*     */     //   308: aconst_null
/*     */     //   309: iconst_1
/*     */     //   310: iconst_1
/*     */     //   311: aconst_null
/*     */     //   312: invokespecial <init> : (Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget;Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   315: invokevirtual addEntry : (Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry;)I
/*     */     //   318: pop
/*     */     //   319: aload_0
/*     */     //   320: aload_0
/*     */     //   321: invokevirtual method_25341 : ()D
/*     */     //   324: aload_0
/*     */     //   325: invokevirtual method_25331 : ()I
/*     */     //   328: i2d
/*     */     //   329: invokestatic coerceAtMost : (DD)D
/*     */     //   332: invokevirtual method_25307 : (D)V
/*     */     //   335: aload_0
/*     */     //   336: aload_0
/*     */     //   337: invokevirtual method_25396 : ()Ljava/util/List;
/*     */     //   340: dup
/*     */     //   341: ldc_w 'children(...)'
/*     */     //   344: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   347: astore #6
/*     */     //   349: aload_0
/*     */     //   350: invokevirtual method_25396 : ()Ljava/util/List;
/*     */     //   353: dup
/*     */     //   354: ldc_w 'children(...)'
/*     */     //   357: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   360: astore #7
/*     */     //   362: astore #14
/*     */     //   364: iconst_0
/*     */     //   365: istore #8
/*     */     //   367: iconst_0
/*     */     //   368: istore #9
/*     */     //   370: aload #7
/*     */     //   372: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   377: astore #10
/*     */     //   379: aload #10
/*     */     //   381: invokeinterface hasNext : ()Z
/*     */     //   386: ifeq -> 431
/*     */     //   389: aload #10
/*     */     //   391: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   396: astore #11
/*     */     //   398: aload #11
/*     */     //   400: checkcast fr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry
/*     */     //   403: astore #12
/*     */     //   405: iconst_0
/*     */     //   406: istore #13
/*     */     //   408: aload #12
/*     */     //   410: invokevirtual getOffer : ()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;
/*     */     //   413: aload_3
/*     */     //   414: invokevirtual equalsWithoutStock : (Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;)Z
/*     */     //   417: ifeq -> 425
/*     */     //   420: iload #9
/*     */     //   422: goto -> 432
/*     */     //   425: iinc #9, 1
/*     */     //   428: goto -> 379
/*     */     //   431: iconst_m1
/*     */     //   432: istore #17
/*     */     //   434: aload #14
/*     */     //   436: iload #17
/*     */     //   438: istore #7
/*     */     //   440: iconst_0
/*     */     //   441: iload #7
/*     */     //   443: if_icmpgt -> 466
/*     */     //   446: iload #7
/*     */     //   448: aload #6
/*     */     //   450: invokeinterface size : ()I
/*     */     //   455: if_icmpge -> 462
/*     */     //   458: iconst_1
/*     */     //   459: goto -> 467
/*     */     //   462: iconst_0
/*     */     //   463: goto -> 467
/*     */     //   466: iconst_0
/*     */     //   467: ifeq -> 482
/*     */     //   470: aload #6
/*     */     //   472: iload #7
/*     */     //   474: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   479: goto -> 511
/*     */     //   482: iload #7
/*     */     //   484: istore #8
/*     */     //   486: astore #14
/*     */     //   488: iconst_0
/*     */     //   489: istore #9
/*     */     //   491: aload_0
/*     */     //   492: invokevirtual method_25396 : ()Ljava/util/List;
/*     */     //   495: dup
/*     */     //   496: ldc_w 'children(...)'
/*     */     //   499: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   502: invokestatic firstOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   505: checkcast fr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry
/*     */     //   508: aload #14
/*     */     //   510: swap
/*     */     //   511: checkcast net/minecraft/class_364
/*     */     //   514: invokevirtual method_25395 : (Lnet/minecraft/class_364;)V
/*     */     //   517: aload_0
/*     */     //   518: iconst_1
/*     */     //   519: putfield offersCreated : Z
/*     */     //   522: nop
/*     */     //   523: goto -> 528
/*     */     //   526: pop
/*     */     //   527: nop
/*     */     //   528: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #55	-> 0
/*     */     //   #56	-> 27
/*     */     //   #57	-> 47
/*     */     //   #58	-> 51
/*     */     //   #59	-> 56
/*     */     //   #60	-> 66
/*     */     //   #61	-> 75
/*     */     //   #290	-> 88
/*     */     //   #290	-> 100
/*     */     //   #61	-> 108
/*     */     //   #291	-> 112
/*     */     //   #292	-> 138
/*     */     //   #293	-> 166
/*     */     //   #62	-> 180
/*     */     //   #63	-> 195
/*     */     //   #64	-> 213
/*     */     //   #293	-> 218
/*     */     //   #294	-> 227
/*     */     //   #291	-> 232
/*     */     //   #65	-> 238
/*     */     //   #295	-> 242
/*     */     //   #65	-> 280
/*     */     //   #295	-> 287
/*     */     //   #296	-> 291
/*     */     //   #66	-> 292
/*     */     //   #67	-> 319
/*     */     //   #68	-> 335
/*     */     //   #297	-> 367
/*     */     //   #298	-> 370
/*     */     //   #299	-> 398
/*     */     //   #68	-> 408
/*     */     //   #299	-> 417
/*     */     //   #300	-> 420
/*     */     //   #301	-> 425
/*     */     //   #303	-> 431
/*     */     //   #68	-> 440
/*     */     //   #304	-> 486
/*     */     //   #68	-> 491
/*     */     //   #68	-> 511
/*     */     //   #68	-> 514
/*     */     //   #69	-> 517
/*     */     //   #70	-> 522
/*     */     //   #59	-> 523
/*     */     //   #59	-> 526
/*     */     //   #71	-> 528
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   88	15	7	$i$f$sortedBy	I
/*     */     //   85	18	6	$this$sortedBy$iv	Ljava/lang/Iterable;
/*     */     //   180	35	15	$i$a$-map-OfferListWidget$createOfferEntries$1$2	I
/*     */     //   195	20	16	entry	Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry;
/*     */     //   177	38	13	it	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;
/*     */     //   166	58	12	item$iv$iv	Ljava/lang/Object;
/*     */     //   138	91	10	$i$f$mapTo	I
/*     */     //   135	94	8	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   135	94	9	destination$iv$iv	Ljava/util/Collection;
/*     */     //   112	121	7	$i$f$map	I
/*     */     //   109	124	6	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   280	7	11	$i$a$-forEach-OfferListWidget$createOfferEntries$1$3	I
/*     */     //   277	10	10	p0	Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry;
/*     */     //   270	18	9	element$iv	Ljava/lang/Object;
/*     */     //   242	50	7	$i$f$forEach	I
/*     */     //   239	53	6	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   408	9	13	$i$a$-indexOfFirst-OfferListWidget$createOfferEntries$1$4	I
/*     */     //   405	12	12	it	Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry;
/*     */     //   398	30	11	item$iv	Ljava/lang/Object;
/*     */     //   367	65	8	$i$f$indexOfFirst	I
/*     */     //   370	62	9	index$iv	I
/*     */     //   364	68	7	$this$indexOfFirst$iv	Ljava/util/List;
/*     */     //   491	17	9	$i$a$-getOrElse-OfferListWidget$createOfferEntries$1$5	I
/*     */     //   488	20	8	it	I
/*     */     //   66	457	5	$i$a$-let-OfferListWidget$createOfferEntries$1	I
/*     */     //   63	460	4	category	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;
/*     */     //   27	502	2	selectedIndex	I
/*     */     //   47	482	3	oldOffer	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;
/*     */     //   0	529	0	this	Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget;
/*     */     //   0	529	1	category	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Category;
/*     */   }
/*     */   
/*     */   public final void search(@NotNull String filter) {
/*     */     Iterator iterator;
/*  74 */     Intrinsics.checkNotNullParameter(filter, "filter");
/*  74 */     if (!Intrinsics.areEqual(filter, this.lastSearch)) {
/*  75 */       method_25339();
/*  76 */       Iterable<Offer> $this$filter$iv = this.offers;
/*  76 */       int $i$f$filter = 0;
/* 305 */       Iterable<Offer> iterable1 = $this$filter$iv;
/* 305 */       Collection<Object> collection = new ArrayList();
/* 305 */       int $i$f$filterTo = 0;
/* 306 */       for (Offer element$iv$iv : iterable1) {
/* 306 */         Offer it = element$iv$iv;
/* 306 */         int $i$a$-filter-OfferListWidget$search$1 = 0;
/*     */         Intrinsics.checkNotNullExpressionValue(it.getItem().method_7964().getString(), "getString(...)");
/*     */         Intrinsics.checkNotNullExpressionValue(it.getItem().method_7909().method_7854().method_7964().getString(), "getString(...)");
/*     */         if ((StringsKt.contains(it.getItem().method_7964().getString(), filter, true) || StringsKt.contains(it.getItem().method_7909().method_7854().method_7964().getString(), filter, true)))
/* 306 */           collection.add(element$iv$iv); 
/*     */       } 
/* 307 */       $this$filter$iv = collection;
/*     */       int $i$f$sortedBy = 0;
/* 308 */       Iterable $this$sortedBy$iv = CollectionsKt.sortedWith($this$filter$iv, new OfferListWidget$search$$inlined$sortedBy$1());
/*     */       int $i$f$map = 0;
/* 309 */       Iterable $this$filterTo$iv$iv = $this$sortedBy$iv;
/* 309 */       Collection<OfferEntry> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$sortedBy$iv, 10));
/* 309 */       int $i$f$mapTo = 0;
/* 310 */       for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 311 */         Offer offer = (Offer)item$iv$iv;
/* 311 */         Collection<OfferEntry> collection1 = destination$iv$iv;
/* 311 */         int $i$a$-map-OfferListWidget$search$3 = 0;
/*     */         OfferEntry entry = new OfferEntry(offer, false, 2, null);
/*     */         entry.setOfferIndex(Integer.valueOf(((Category)((ShopMenu)this.shopScreen.method_17577()).getShop().get(CollectionsKt.indexOf((List)((ShopMenu)this.shopScreen.method_17577()).getShop(), this.category))).getOffers().indexOf(offer)));
/* 311 */         collection1.add(entry);
/*     */       } 
/* 312 */       Iterable $this$map$iv = destination$iv$iv;
/*     */       int $i$f$forEach = 0;
/* 313 */       iterator = $this$map$iv.iterator();
/*     */     } else {
/*     */       return;
/*     */     } 
/* 313 */     if (iterator.hasNext()) {
/* 313 */       Object element$iv = iterator.next();
/* 313 */       OfferEntry p0 = (OfferEntry)element$iv;
/* 313 */       int $i$a$-forEach-OfferListWidget$search$4 = 0;
/*     */       addEntry(p0);
/*     */     } 
/*     */     if (this.shopScreen.isEditMode())
/*     */       addEntry(new OfferEntry(null, true, 1, null)); 
/*     */     method_25307((method_25341() > method_25331()) ? method_25331() : method_25341());
/*     */     this.lastSearch = filter;
/*     */   }
/*     */   
/*     */   public final void editOfferPrice(@NotNull String filter) {
/*     */     Intrinsics.checkNotNullParameter(filter, "filter");
/*     */     if (this.shopScreen.isEditMode() && !Intrinsics.areEqual(filter, this.lastOfferPrice) && method_25334() != null) {
/*     */       (OfferEntry)method_25334();
/*     */       if (((OfferEntry)method_25334() != null) ? (!((OfferEntry)method_25334()).isAddOffer()) : false) {
/*     */         (OfferEntry)method_25334();
/*     */         if ((((OfferEntry)method_25334() != null) ? ((OfferEntry)method_25334()).getOfferIndex() : null) != null && MiscUtilsKt.parseBigIntegerOrNull(filter) != null) {
/*     */           Intrinsics.checkNotNull(method_25334());
/*     */           Intrinsics.checkNotNull(((OfferEntry)method_25334()).getOfferIndex());
/*     */           Intrinsics.checkNotNull(MiscUtilsKt.parseBigIntegerOrNull(filter));
/*     */           ((Offer)((Category)((ShopMenu)this.shopScreen.method_17577()).getShop().get(CollectionsKt.indexOf((List)((ShopMenu)this.shopScreen.method_17577()).getShop(), this.category))).getOffers().get(((OfferEntry)method_25334()).getOfferIndex().intValue())).setPrice(MiscUtilsKt.parseBigIntegerOrNull(filter));
/*     */           Intrinsics.checkNotNull(method_25334());
/*     */           Intrinsics.checkNotNull(MiscUtilsKt.parseBigIntegerOrNull(filter));
/*     */           ((OfferEntry)method_25334()).getOffer().setPrice(MiscUtilsKt.parseBigIntegerOrNull(filter));
/*     */           this.lastOfferPrice = filter;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void editOfferStock(@NotNull String filter) {
/*     */     Intrinsics.checkNotNullParameter(filter, "filter");
/*     */     if (this.shopScreen.isEditMode() && !Intrinsics.areEqual(filter, this.lastOfferStock) && method_25334() != null) {
/*     */       (OfferEntry)method_25334();
/*     */       if (((OfferEntry)method_25334() != null) ? (!((OfferEntry)method_25334()).isAddOffer()) : false) {
/*     */         (OfferEntry)method_25334();
/*     */         if ((((OfferEntry)method_25334() != null) ? ((OfferEntry)method_25334()).getOfferIndex() : null) != null && MiscUtilsKt.parseBigIntegerOrNull(filter) != null) {
/*     */           Intrinsics.checkNotNull(method_25334());
/*     */           Intrinsics.checkNotNull(((OfferEntry)method_25334()).getOfferIndex());
/*     */           Intrinsics.checkNotNull(MiscUtilsKt.parseBigIntegerOrNull(filter));
/*     */           ((Offer)((Category)((ShopMenu)this.shopScreen.method_17577()).getShop().get(CollectionsKt.indexOf((List)((ShopMenu)this.shopScreen.method_17577()).getShop(), this.category))).getOffers().get(((OfferEntry)method_25334()).getOfferIndex().intValue())).setStock(MiscUtilsKt.parseBigIntegerOrNull(filter).intValue());
/*     */           Intrinsics.checkNotNull(method_25334());
/*     */           Intrinsics.checkNotNull(MiscUtilsKt.parseBigIntegerOrNull(filter));
/*     */           ((OfferEntry)method_25334()).getOffer().setStock(MiscUtilsKt.parseBigIntegerOrNull(filter).intValue());
/*     */           this.lastOfferPrice = filter;
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
/*     */     guiGraphics.method_25296(method_46426(), method_46427(), method_55442(), method_46427() + 4, -2147483648, 0);
/*     */     guiGraphics.method_25296(method_46426(), method_55443() - 4, method_55442(), method_55443(), 0, -2147483648);
/*     */     guiGraphics.method_25301(method_55442() - 1, method_46427(), method_46427(), -10000537);
/*     */     guiGraphics.method_25301(method_55442() - 1, method_55443() - 1, method_55443() - 1, -10000537);
/*     */     guiGraphics.method_25301(method_46426(), method_46427(), method_46427(), -10000537);
/*     */     guiGraphics.method_25301(method_46426(), method_55443() - 1, method_55443() - 1, -10000537);
/*     */     if (method_57717()) {
/*     */       guiGraphics.method_25292(method_55442(), method_55442() + 6, method_46427() - 1, -7500403);
/*     */       guiGraphics.method_25301(method_55442() + 6, method_46427() - 1, method_55443(), -7500403);
/*     */       guiGraphics.method_25292(method_55442(), method_55442() + 6, method_55443(), -7500403);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void method_48579(@NotNull class_332 guiGraphics, int mouseX, int mouseY, float partialTick) {
/*     */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/*     */     if (this.offersCreated)
/*     */       super.method_48579(guiGraphics, mouseX, mouseY, partialTick); 
/*     */   }
/*     */   
/*     */   protected int addEntry(@NotNull OfferEntry entry) {
/*     */     Intrinsics.checkNotNullParameter(entry, "entry");
/*     */     return super.method_25321((class_350.class_351)entry);
/*     */   }
/*     */   
/*     */   public int method_25322() {
/*     */     return 75;
/*     */   }
/*     */   
/*     */   public int method_25342() {
/*     */     return method_46426() + 2;
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
/*     */     return method_46426() + this.field_22758;
/*     */   }
/*     */   
/*     */   public void method_25395(@Nullable class_364 focused) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual method_25334 : ()Lnet/minecraft/class_350$class_351;
/*     */     //   4: checkcast fr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry
/*     */     //   7: astore_2
/*     */     //   8: aload_0
/*     */     //   9: aload_1
/*     */     //   10: instanceof fr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry
/*     */     //   13: ifeq -> 23
/*     */     //   16: aload_1
/*     */     //   17: checkcast fr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry
/*     */     //   20: goto -> 24
/*     */     //   23: aconst_null
/*     */     //   24: dup
/*     */     //   25: ifnull -> 42
/*     */     //   28: invokevirtual isAddOffer : ()Z
/*     */     //   31: ifne -> 38
/*     */     //   34: iconst_1
/*     */     //   35: goto -> 44
/*     */     //   38: iconst_0
/*     */     //   39: goto -> 44
/*     */     //   42: pop
/*     */     //   43: iconst_0
/*     */     //   44: ifeq -> 54
/*     */     //   47: aload_1
/*     */     //   48: checkcast fr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry
/*     */     //   51: goto -> 55
/*     */     //   54: aconst_null
/*     */     //   55: checkcast net/minecraft/class_364
/*     */     //   58: invokespecial method_25395 : (Lnet/minecraft/class_364;)V
/*     */     //   61: aload_0
/*     */     //   62: invokevirtual method_25334 : ()Lnet/minecraft/class_350$class_351;
/*     */     //   65: aload_2
/*     */     //   66: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   69: ifne -> 286
/*     */     //   72: aload_0
/*     */     //   73: invokevirtual method_25334 : ()Lnet/minecraft/class_350$class_351;
/*     */     //   76: ifnull -> 235
/*     */     //   79: aload_0
/*     */     //   80: getfield shopScreen : Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;
/*     */     //   83: invokevirtual isEditMode : ()Z
/*     */     //   86: ifeq -> 235
/*     */     //   89: aload_0
/*     */     //   90: getfield shopScreen : Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;
/*     */     //   93: invokevirtual getEditOfferPriceBox : ()Lnet/minecraft/class_342;
/*     */     //   96: aload_0
/*     */     //   97: invokevirtual method_25334 : ()Lnet/minecraft/class_350$class_351;
/*     */     //   100: checkcast fr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry
/*     */     //   103: dup
/*     */     //   104: ifnull -> 128
/*     */     //   107: invokevirtual getPrice : ()Ljava/math/BigInteger;
/*     */     //   110: dup
/*     */     //   111: ifnull -> 128
/*     */     //   114: iconst_0
/*     */     //   115: invokestatic format : (Ljava/math/BigInteger;Z)Lnet/minecraft/class_5250;
/*     */     //   118: dup
/*     */     //   119: ifnull -> 128
/*     */     //   122: invokevirtual getString : ()Ljava/lang/String;
/*     */     //   125: goto -> 130
/*     */     //   128: pop
/*     */     //   129: aconst_null
/*     */     //   130: invokevirtual method_1852 : (Ljava/lang/String;)V
/*     */     //   133: aload_0
/*     */     //   134: getfield shopScreen : Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;
/*     */     //   137: iconst_1
/*     */     //   138: invokevirtual toggleEditOfferPriceBox : (Z)V
/*     */     //   141: aload_0
/*     */     //   142: getfield shopScreen : Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;
/*     */     //   145: aload_0
/*     */     //   146: getfield shopScreen : Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;
/*     */     //   149: invokevirtual getEditOfferPriceBox : ()Lnet/minecraft/class_342;
/*     */     //   152: checkcast net/minecraft/class_364
/*     */     //   155: invokevirtual method_25395 : (Lnet/minecraft/class_364;)V
/*     */     //   158: aload_0
/*     */     //   159: getfield shopScreen : Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;
/*     */     //   162: invokevirtual getEditOfferPriceBox : ()Lnet/minecraft/class_342;
/*     */     //   165: iconst_1
/*     */     //   166: invokevirtual method_25365 : (Z)V
/*     */     //   169: aload_0
/*     */     //   170: getfield shopScreen : Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;
/*     */     //   173: invokevirtual getEditOfferStockBox : ()Lnet/minecraft/class_342;
/*     */     //   176: aload_0
/*     */     //   177: invokevirtual method_25334 : ()Lnet/minecraft/class_350$class_351;
/*     */     //   180: checkcast fr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry
/*     */     //   183: dup
/*     */     //   184: ifnull -> 219
/*     */     //   187: invokevirtual getStock : ()I
/*     */     //   190: i2l
/*     */     //   191: invokestatic valueOf : (J)Ljava/math/BigInteger;
/*     */     //   194: dup
/*     */     //   195: ldc_w 'valueOf(...)'
/*     */     //   198: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   201: dup
/*     */     //   202: ifnull -> 219
/*     */     //   205: iconst_0
/*     */     //   206: invokestatic format : (Ljava/math/BigInteger;Z)Lnet/minecraft/class_5250;
/*     */     //   209: dup
/*     */     //   210: ifnull -> 219
/*     */     //   213: invokevirtual getString : ()Ljava/lang/String;
/*     */     //   216: goto -> 221
/*     */     //   219: pop
/*     */     //   220: aconst_null
/*     */     //   221: invokevirtual method_1852 : (Ljava/lang/String;)V
/*     */     //   224: aload_0
/*     */     //   225: getfield shopScreen : Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;
/*     */     //   228: iconst_1
/*     */     //   229: invokevirtual toggleEditOfferStockBox : (Z)V
/*     */     //   232: goto -> 273
/*     */     //   235: aload_0
/*     */     //   236: getfield shopScreen : Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;
/*     */     //   239: iconst_0
/*     */     //   240: invokevirtual toggleEditOfferPriceBox : (Z)V
/*     */     //   243: aload_0
/*     */     //   244: getfield shopScreen : Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;
/*     */     //   247: invokevirtual getEditOfferPriceBox : ()Lnet/minecraft/class_342;
/*     */     //   250: iconst_0
/*     */     //   251: invokevirtual method_46421 : (I)V
/*     */     //   254: aload_0
/*     */     //   255: getfield shopScreen : Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;
/*     */     //   258: invokevirtual getEditOfferPriceBox : ()Lnet/minecraft/class_342;
/*     */     //   261: iconst_0
/*     */     //   262: invokevirtual method_46419 : (I)V
/*     */     //   265: aload_0
/*     */     //   266: getfield shopScreen : Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;
/*     */     //   269: iconst_0
/*     */     //   270: invokevirtual toggleEditOfferStockBox : (Z)V
/*     */     //   273: aload_0
/*     */     //   274: getfield shopScreen : Lfr/harmex/cobbledollars/common/client/gui/screen/ShopScreen;
/*     */     //   277: invokevirtual getBuyAmountBox : ()Lnet/minecraft/class_342;
/*     */     //   280: ldc_w '1'
/*     */     //   283: invokevirtual method_1852 : (Ljava/lang/String;)V
/*     */     //   286: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #144	-> 0
/*     */     //   #145	-> 9
/*     */     //   #146	-> 61
/*     */     //   #147	-> 72
/*     */     //   #148	-> 89
/*     */     //   #149	-> 133
/*     */     //   #150	-> 141
/*     */     //   #151	-> 158
/*     */     //   #152	-> 169
/*     */     //   #152	-> 201
/*     */     //   #153	-> 224
/*     */     //   #155	-> 235
/*     */     //   #156	-> 243
/*     */     //   #157	-> 254
/*     */     //   #158	-> 265
/*     */     //   #160	-> 273
/*     */     //   #162	-> 286
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   8	279	2	lastSelected	Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry;
/*     */     //   0	287	0	this	Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget;
/*     */     //   0	287	1	focused	Lnet/minecraft/class_364;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\006\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\007\n\002\020\007\n\000\n\002\020\002\n\002\b\013\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\033\b\004\030\0002\f\022\b\022\0060\000R\0020\0020\001B\033\022\b\b\002\020\004\032\0020\003\022\b\b\002\020\006\032\0020\005¢\006\004\b\007\020\bJ\017\020\n\032\0020\tH\026¢\006\004\b\n\020\013J'\020\021\032\0020\0052\006\020\r\032\0020\f2\006\020\016\032\0020\f2\006\020\020\032\0020\017H\026¢\006\004\b\021\020\022J_\020\036\032\0020\0352\006\020\024\032\0020\0232\006\020\025\032\0020\0172\006\020\026\032\0020\0172\006\020\027\032\0020\0172\006\020\030\032\0020\0172\006\020\031\032\0020\0172\006\020\r\032\0020\0172\006\020\016\032\0020\0172\006\020\032\032\0020\0052\006\020\034\032\0020\033H\026¢\006\004\b\036\020\037J\035\020 \032\0020\0052\006\020\r\032\0020\0172\006\020\016\032\0020\017¢\006\004\b \020!J_\020#\032\0020\0352\006\020\024\032\0020\0232\006\020\025\032\0020\0172\006\020\026\032\0020\0172\006\020\027\032\0020\0172\006\020\030\032\0020\0172\006\020\031\032\0020\0172\006\020\r\032\0020\0172\006\020\016\032\0020\0172\006\020\"\032\0020\0052\006\020\034\032\0020\033H\026¢\006\004\b#\020\037R\027\020\004\032\0020\0038\006¢\006\f\n\004\b\004\020$\032\004\b%\020&R\027\020\006\032\0020\0058\006¢\006\f\n\004\b\006\020'\032\004\b\006\020(R$\020/\032\0020)2\006\020*\032\0020)8F@FX\016¢\006\f\032\004\b+\020,\"\004\b-\020.R$\0205\032\002002\006\020*\032\002008F@FX\016¢\006\f\032\004\b1\0202\"\004\b3\0204R$\020:\032\0020\0172\006\020*\032\0020\0178F@FX\016¢\006\f\032\004\b6\0207\"\004\b8\0209R$\020;\032\004\030\0010\0178\006@\006X\016¢\006\022\n\004\b;\020<\032\004\b=\020>\"\004\b?\020@R$\020A\032\004\030\0010\0178\006@\006X\016¢\006\022\n\004\bA\020<\032\004\bB\020>\"\004\bC\020@R\"\020D\032\0020\0178\006@\006X\016¢\006\022\n\004\bD\020E\032\004\bF\0207\"\004\bG\0209R\"\020H\032\0020\0178\006@\006X\016¢\006\022\n\004\bH\020E\032\004\bI\0207\"\004\bJ\0209¨\006K"}, d2 = {"Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget$OfferEntry;", "Lnet/minecraft/class_4280$class_4281;", "Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget;", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;", "offer", "", "isAddOffer", "<init>", "(Lfr/harmex/cobbledollars/common/client/gui/screen/widget/OfferListWidget;Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;Z)V", "Lnet/minecraft/class_2561;", "getNarration", "()Lnet/minecraft/class_2561;", "", "mouseX", "mouseY", "", "button", "mouseClicked", "(DDI)Z", "Lnet/minecraft/class_332;", "guiGraphics", "index", "top", "left", "width", "height", "hovering", "", "partialTick", "", "render", "(Lnet/minecraft/class_332;IIIIIIIZF)V", "isMouseOverCross", "(II)Z", "isMouseOver", "renderBack", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;", "getOffer", "()Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;", "Z", "()Z", "Lnet/minecraft/class_1799;", "value", "getItem", "()Lnet/minecraft/class_1799;", "setItem", "(Lnet/minecraft/class_1799;)V", "item", "Ljava/math/BigInteger;", "getPrice", "()Ljava/math/BigInteger;", "setPrice", "(Ljava/math/BigInteger;)V", "price", "getStock", "()I", "setStock", "(I)V", "stock", "offerIndex", "Ljava/lang/Integer;", "getOfferIndex", "()Ljava/lang/Integer;", "setOfferIndex", "(Ljava/lang/Integer;)V", "listIndex", "getListIndex", "setListIndex", "x", "I", "getX", "setX", "y", "getY", "setY", "common"})
/*     */   public final class OfferEntry extends class_4280.class_4281<OfferEntry> {
/*     */     @NotNull
/*     */     private final Offer offer;
/*     */     
/*     */     private final boolean isAddOffer;
/*     */     
/*     */     @Nullable
/*     */     private Integer offerIndex;
/*     */     
/*     */     @Nullable
/*     */     private Integer listIndex;
/*     */     
/*     */     private int x;
/*     */     
/*     */     private int y;
/*     */     
/*     */     public OfferEntry(Offer offer, boolean isAddOffer) {
/*     */       this.offer = offer;
/*     */       this.isAddOffer = isAddOffer;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Offer getOffer() {
/*     */       return this.offer;
/*     */     }
/*     */     
/*     */     public final boolean isAddOffer() {
/*     */       return this.isAddOffer;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final class_1799 getItem() {
/*     */       return this.offer.getItem();
/*     */     }
/*     */     
/*     */     public final void setItem(@NotNull class_1799 value) {
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       this.offer.setItem(value);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final BigInteger getPrice() {
/*     */       return this.offer.getPrice();
/*     */     }
/*     */     
/*     */     public final void setPrice(@NotNull BigInteger value) {
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       this.offer.setPrice(value);
/*     */     }
/*     */     
/*     */     public final int getStock() {
/*     */       return this.offer.getStock();
/*     */     }
/*     */     
/*     */     public final void setStock(int value) {
/*     */       this.offer.setStock(value);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public class_2561 method_37006() {
/*     */       Intrinsics.checkNotNullExpressionValue(getItem().method_7964(), "getHoverName(...)");
/*     */       return getItem().method_7964();
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Integer getOfferIndex() {
/*     */       return this.offerIndex;
/*     */     }
/*     */     
/*     */     public final void setOfferIndex(@Nullable Integer <set-?>) {
/*     */       this.offerIndex = <set-?>;
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
/*     */       if (this.isAddOffer) {
/*     */         class_1799 itemStack = ((ShopMenu)OfferListWidget.this.getShopScreen().method_17577()).method_34255().method_7972();
/*     */         if (!itemStack.method_7960()) {
/*     */           itemStack.method_7939(1);
/*     */           if (OfferListWidget.this.getShopScreen().getCategoryList().method_25334() != null) {
/*     */             Intrinsics.checkNotNull(OfferListWidget.this.getShopScreen().getCategoryList().method_25334());
/*     */             Intrinsics.checkNotNull(((CategoryListWidget.CategoryEntry)OfferListWidget.this.getShopScreen().getCategoryList().method_25334()).getCategoryIndex());
/*     */             Intrinsics.checkNotNull(itemStack);
/*     */             Intrinsics.checkNotNullExpressionValue(BigInteger.ZERO, "ZERO");
/*     */             ((Category)((ShopMenu)OfferListWidget.this.getShopScreen().method_17577()).getShop().get(((CategoryListWidget.CategoryEntry)OfferListWidget.this.getShopScreen().getCategoryList().method_25334()).getCategoryIndex().intValue())).add(itemStack, BigInteger.ZERO);
/*     */             (CategoryListWidget.CategoryEntry)OfferListWidget.this.getShopScreen().getCategoryList().method_25334();
/*     */             OfferListWidget.this.createOfferEntries(((CategoryListWidget.CategoryEntry)OfferListWidget.this.getShopScreen().getCategoryList().method_25334() != null) ? ((CategoryListWidget.CategoryEntry)OfferListWidget.this.getShopScreen().getCategoryList().method_25334()).getCategory() : null);
/*     */             OfferListWidget.this.method_25395((class_364)OfferListWidget.access$getEntryAtPosition(OfferListWidget.this, mouseX, mouseY));
/*     */           } 
/*     */         } 
/*     */       } else if (OfferListWidget.this.getShopScreen().isEditMode() && Intrinsics.areEqual(OfferListWidget.this.method_25334(), this) && isMouseOverCross((int)mouseX, (int)mouseY) && OfferListWidget.this.getShopScreen().getCategoryList().method_25334() != null && this.offerIndex != null) {
/*     */         Intrinsics.checkNotNull(OfferListWidget.this.getShopScreen().getCategoryList().method_25334());
/*     */         Intrinsics.checkNotNull(((CategoryListWidget.CategoryEntry)OfferListWidget.this.getShopScreen().getCategoryList().method_25334()).getCategoryIndex());
/*     */         Intrinsics.checkNotNull(this.offerIndex);
/*     */         ((Category)((ShopMenu)OfferListWidget.this.getShopScreen().method_17577()).getShop().get(((CategoryListWidget.CategoryEntry)OfferListWidget.this.getShopScreen().getCategoryList().method_25334()).getCategoryIndex().intValue())).getOffers().remove(this.offerIndex.intValue());
/*     */         (CategoryListWidget.CategoryEntry)OfferListWidget.this.getShopScreen().getCategoryList().method_25334();
/*     */         OfferListWidget.this.createOfferEntries(((CategoryListWidget.CategoryEntry)OfferListWidget.this.getShopScreen().getCategoryList().method_25334() != null) ? ((CategoryListWidget.CategoryEntry)OfferListWidget.this.getShopScreen().getCategoryList().method_25334()).getCategory() : null);
/*     */         OfferListWidget.this.method_25395((class_364)OfferListWidget.access$getEntryAtPosition(OfferListWidget.this, mouseX, mouseY));
/*     */       } 
/*     */       return !this.isAddOffer;
/*     */     }
/*     */     
/*     */     public void method_25343(@NotNull class_332 guiGraphics, int index, int top, int left, int width, int height, int mouseX, int mouseY, boolean hovering, float partialTick) {
/*     */       Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/*     */       this.listIndex = Integer.valueOf(index);
/*     */       this.x = left;
/*     */       this.y = top;
/*     */       if (this.isAddOffer) {
/*     */         guiGraphics.method_25300(OfferListWidget.this.field_22740.field_1772, "+", left + 37, top + 5, -1);
/*     */       } else {
/*     */         guiGraphics.method_51427(getItem(), left + 1, top + 1);
/*     */         guiGraphics.method_51431(OfferListWidget.this.field_22740.field_1772, getItem(), left + 1, top + 1);
/*     */         boolean drawAmount = true;
/*     */         if (OfferListWidget.this.getShopScreen().isEditMode() && Intrinsics.areEqual(OfferListWidget.this.method_25334(), this)) {
/*     */           OfferListWidget.this.getShopScreen().getEditOfferPriceBox().method_46421(this.x + 24);
/*     */           OfferListWidget.this.getShopScreen().getEditOfferPriceBox().method_46419(this.y + 5);
/*     */           OfferListWidget.this.getShopScreen().getEditOfferPriceBox().method_25394(guiGraphics, mouseX, mouseY, partialTick);
/*     */           drawAmount = false;
/*     */         } 
/*     */         Intrinsics.checkNotNull(OfferListWidget.this.field_22740.field_1724);
/*     */         int color = (getStock() == 0 || PlayerExtensionKt.getCobbleDollars((class_1657)OfferListWidget.this.field_22740.field_1724).compareTo(getPrice()) < 0) ? 11149344 : 16777215;
/*     */         GuiUtilsKt.renderCobbleDollarsElement$default(guiGraphics, left + 19, top + 2, drawAmount, getPrice(), false, Context.SHOP, Integer.valueOf(color), 16, null);
/*     */       } 
/*     */       if (OfferListWidget.this.getShopScreen().isEditMode() && Intrinsics.areEqual(OfferListWidget.this.method_25334(), this)) {
/*     */         Intrinsics.checkNotNullExpressionValue(guiGraphics.method_51448(), "pose(...)");
/*     */         GuiUtilsKt.blitk$default(guiGraphics.method_51448(), GuiUtilsKt.getCROSS_LOCATION(), Integer.valueOf(left + 67), Integer.valueOf(top + 3), Integer.valueOf(5), Integer.valueOf(5), null, null, null, null, null, Double.valueOf(!isMouseOverCross(mouseX, mouseY) ? 0.4D : 0.82D), Double.valueOf(!isMouseOverCross(mouseX, mouseY) ? 0.4D : 0.24D), Double.valueOf(!isMouseOverCross(mouseX, mouseY) ? 0.4D : 0.24D), null, false, 0.0F, 116672, null);
/*     */       } 
/*     */     }
/*     */     
/*     */     public final boolean isMouseOverCross(int mouseX, int mouseY) {
/*     */       int i = this.x + 67;
/*     */       if ((mouseX < this.x + 72) ? ((i <= mouseX)) : false) {
/*     */         i = this.y + 3;
/*     */         if ((mouseY < this.y + 8) ? ((i <= mouseY)) : false);
/*     */       } 
/*     */       return false;
/*     */     }
/*     */     
/*     */     public void method_49568(@NotNull class_332 guiGraphics, int index, int top, int left, int width, int height, int mouseX, int mouseY, boolean isMouseOver, float partialTick) {
/*     */       Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/*     */       guiGraphics.method_25290(OfferListWidget.OFFER_BACKGROUND_LOCATION, left + 1, top + 1, 0.0F, 0.0F, 73, 16, 73, 16);
/*     */       if (isMouseOver || OfferListWidget.this.method_25332(index)) {
/*     */         RenderSystem.enableBlend();
/*     */         guiGraphics.method_25294(left + 1, top + 1, left + width - 1, top + OfferListWidget.this.field_22741 - 1, 553648127);
/*     */         RenderSystem.disableBlend();
/*     */         guiGraphics.method_25290(OfferListWidget.OFFER_OUTLINE_LOCATION, left, top, 0.0F, 0.0F, 75, 18, 75, 18);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\client\gui\screen\widget\OfferListWidget.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */