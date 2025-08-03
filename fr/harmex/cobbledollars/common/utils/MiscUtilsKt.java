/*    */ package fr.harmex.cobbledollars.common.utils;
/*    */ 
/*    */ import java.math.BigInteger;
/*    */ import java.util.Arrays;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import net.minecraft.class_1799;
/*    */ import net.minecraft.class_2561;
/*    */ import net.minecraft.class_2960;
/*    */ import net.minecraft.class_5250;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\0006\n\002\020\016\n\000\n\002\030\002\n\002\b\004\n\002\020\021\n\002\020\000\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\020\013\n\002\b\003\032\025\020\003\032\0020\0022\006\020\001\032\0020\000¢\006\004\b\003\020\004\0321\020\013\032\0020\n2\006\020\005\032\0020\0002\006\020\006\032\0020\0002\022\020\t\032\n\022\006\b\001\022\0020\b0\007\"\0020\b¢\006\004\b\013\020\f\032\025\020\r\032\0020\n2\006\020\006\032\0020\000¢\006\004\b\r\020\016\032)\020\017\032\0020\n2\006\020\006\032\0020\0002\022\020\t\032\n\022\006\b\001\022\0020\b0\007\"\0020\b¢\006\004\b\017\020\020\032)\020\021\032\0020\n2\006\020\006\032\0020\0002\022\020\t\032\n\022\006\b\001\022\0020\b0\007\"\0020\b¢\006\004\b\021\020\020\032\021\020\022\032\0020\n*\0020\000¢\006\004\b\022\020\016\032\023\020\024\032\004\030\0010\023*\0020\000¢\006\004\b\024\020\025\032\031\020\027\032\0020\n*\0020\n2\006\020\026\032\0020\n¢\006\004\b\027\020\030\032\031\020\034\032\0020\033*\0020\0312\006\020\032\032\0020\031¢\006\004\b\034\020\035¨\006\036"}, d2 = {"", "string", "Lnet/minecraft/class_2960;", "cobbleDollarsResource", "(Ljava/lang/String;)Lnet/minecraft/class_2960;", "key", "name", "", "", "objects", "Lnet/minecraft/class_5250;", "cobbleDollarsLang", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Lnet/minecraft/class_5250;", "cobbleDollarsScreen", "(Ljava/lang/String;)Lnet/minecraft/class_5250;", "cobbleDollarsCommand", "(Ljava/lang/String;[Ljava/lang/Object;)Lnet/minecraft/class_5250;", "cobbleDollarsArgument", "toComponent", "Ljava/math/BigInteger;", "parseBigIntegerOrNull", "(Ljava/lang/String;)Ljava/math/BigInteger;", "component", "prepend", "(Lnet/minecraft/class_5250;Lnet/minecraft/class_5250;)Lnet/minecraft/class_5250;", "Lnet/minecraft/class_1799;", "other", "", "isSame", "(Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Z", "common"})
/*    */ @SourceDebugExtension({"SMAP\nMiscUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiscUtils.kt\nfr/harmex/cobbledollars/common/utils/MiscUtilsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,39:1\n648#2,5:40\n413#2,4:45\n11102#3:49\n11437#3,3:50\n1682#3,6:53\n*S KotlinDebug\n*F\n+ 1 MiscUtils.kt\nfr/harmex/cobbledollars/common/utils/MiscUtilsKt\n*L\n25#1:40,5\n26#1:45,4\n31#1:49\n31#1:50,3\n31#1:53,6\n*E\n"})
/*    */ public final class MiscUtilsKt {
/*    */   @NotNull
/*    */   public static final class_2960 cobbleDollarsResource(@NotNull String string) {
/* 13 */     Intrinsics.checkNotNullParameter(string, "string");
/* 13 */     Intrinsics.checkNotNullExpressionValue(class_2960.method_60655("cobbledollars", string), "fromNamespaceAndPath(...)");
/* 13 */     return class_2960.method_60655("cobbledollars", string);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final class_5250 cobbleDollarsLang(@NotNull String key, @NotNull String name, @NotNull Object... objects) {
/* 16 */     Intrinsics.checkNotNullParameter(key, "key");
/* 16 */     Intrinsics.checkNotNullParameter(name, "name");
/* 16 */     Intrinsics.checkNotNullParameter(objects, "objects");
/* 16 */     Intrinsics.checkNotNullExpressionValue(com.cobblemon.mod.common.util.MiscUtilsKt.asTranslated(key + ".cobbledollars." + key, Arrays.copyOf(objects, objects.length)), "asTranslated(...)");
/* 16 */     return com.cobblemon.mod.common.util.MiscUtilsKt.asTranslated(key + ".cobbledollars." + key, Arrays.copyOf(objects, objects.length));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final class_5250 cobbleDollarsScreen(@NotNull String name) {
/* 18 */     Intrinsics.checkNotNullParameter(name, "name");
/* 18 */     return cobbleDollarsLang("screen", name, new Object[0]);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final class_5250 cobbleDollarsCommand(@NotNull String name, @NotNull Object... objects) {
/* 19 */     Intrinsics.checkNotNullParameter(name, "name");
/* 19 */     Intrinsics.checkNotNullParameter(objects, "objects");
/* 19 */     return cobbleDollarsLang("command", name, Arrays.copyOf(objects, objects.length));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final class_5250 cobbleDollarsArgument(@NotNull String name, @NotNull Object... objects) {
/* 20 */     Intrinsics.checkNotNullParameter(name, "name");
/* 20 */     Intrinsics.checkNotNullParameter(objects, "objects");
/* 20 */     return cobbleDollarsLang("argument", name, Arrays.copyOf(objects, objects.length));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final class_5250 toComponent(@NotNull String $this$toComponent) {
/* 22 */     Intrinsics.checkNotNullParameter($this$toComponent, "<this>");
/* 22 */     Intrinsics.checkNotNullExpressionValue(class_2561.method_43470($this$toComponent), "literal(...)");
/* 22 */     return class_2561.method_43470($this$toComponent);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static final BigInteger parseBigIntegerOrNull(@NotNull String $this$parseBigIntegerOrNull) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc '<this>'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: bipush #21
/*    */     //   8: anewarray java/lang/String
/*    */     //   11: astore_2
/*    */     //   12: aload_2
/*    */     //   13: iconst_0
/*    */     //   14: ldc 'K'
/*    */     //   16: aastore
/*    */     //   17: aload_2
/*    */     //   18: iconst_1
/*    */     //   19: ldc 'M'
/*    */     //   21: aastore
/*    */     //   22: aload_2
/*    */     //   23: iconst_2
/*    */     //   24: ldc 'B'
/*    */     //   26: aastore
/*    */     //   27: aload_2
/*    */     //   28: iconst_3
/*    */     //   29: ldc 'T'
/*    */     //   31: aastore
/*    */     //   32: aload_2
/*    */     //   33: iconst_4
/*    */     //   34: ldc 'Q'
/*    */     //   36: aastore
/*    */     //   37: aload_2
/*    */     //   38: iconst_5
/*    */     //   39: ldc 'Qi'
/*    */     //   41: aastore
/*    */     //   42: aload_2
/*    */     //   43: bipush #6
/*    */     //   45: ldc 'Sx'
/*    */     //   47: aastore
/*    */     //   48: aload_2
/*    */     //   49: bipush #7
/*    */     //   51: ldc 'Sp'
/*    */     //   53: aastore
/*    */     //   54: aload_2
/*    */     //   55: bipush #8
/*    */     //   57: ldc 'O'
/*    */     //   59: aastore
/*    */     //   60: aload_2
/*    */     //   61: bipush #9
/*    */     //   63: ldc 'N'
/*    */     //   65: aastore
/*    */     //   66: aload_2
/*    */     //   67: bipush #10
/*    */     //   69: ldc 'D'
/*    */     //   71: aastore
/*    */     //   72: aload_2
/*    */     //   73: bipush #11
/*    */     //   75: ldc 'UD'
/*    */     //   77: aastore
/*    */     //   78: aload_2
/*    */     //   79: bipush #12
/*    */     //   81: ldc 'DD'
/*    */     //   83: aastore
/*    */     //   84: aload_2
/*    */     //   85: bipush #13
/*    */     //   87: ldc 'TD'
/*    */     //   89: aastore
/*    */     //   90: aload_2
/*    */     //   91: bipush #14
/*    */     //   93: ldc 'QD'
/*    */     //   95: aastore
/*    */     //   96: aload_2
/*    */     //   97: bipush #15
/*    */     //   99: ldc 'QiD'
/*    */     //   101: aastore
/*    */     //   102: aload_2
/*    */     //   103: bipush #16
/*    */     //   105: ldc 'SxD'
/*    */     //   107: aastore
/*    */     //   108: aload_2
/*    */     //   109: bipush #17
/*    */     //   111: ldc 'SpD'
/*    */     //   113: aastore
/*    */     //   114: aload_2
/*    */     //   115: bipush #18
/*    */     //   117: ldc 'OcD'
/*    */     //   119: aastore
/*    */     //   120: aload_2
/*    */     //   121: bipush #19
/*    */     //   123: ldc 'ND'
/*    */     //   125: aastore
/*    */     //   126: aload_2
/*    */     //   127: bipush #20
/*    */     //   129: ldc 'Vg'
/*    */     //   131: aastore
/*    */     //   132: aload_2
/*    */     //   133: astore_1
/*    */     //   134: aload_0
/*    */     //   135: astore_3
/*    */     //   136: iconst_0
/*    */     //   137: istore #4
/*    */     //   139: iconst_0
/*    */     //   140: istore #5
/*    */     //   142: aload_3
/*    */     //   143: invokevirtual length : ()I
/*    */     //   146: istore #6
/*    */     //   148: iload #5
/*    */     //   150: iload #6
/*    */     //   152: if_icmpge -> 219
/*    */     //   155: aload_3
/*    */     //   156: iload #5
/*    */     //   158: invokevirtual charAt : (I)C
/*    */     //   161: istore #7
/*    */     //   163: iconst_0
/*    */     //   164: istore #8
/*    */     //   166: iload #7
/*    */     //   168: invokestatic isDigit : (C)Z
/*    */     //   171: ifne -> 181
/*    */     //   174: iload #7
/*    */     //   176: bipush #46
/*    */     //   178: if_icmpne -> 185
/*    */     //   181: iconst_1
/*    */     //   182: goto -> 186
/*    */     //   185: iconst_0
/*    */     //   186: ifne -> 213
/*    */     //   189: aload_3
/*    */     //   190: astore #7
/*    */     //   192: iconst_0
/*    */     //   193: istore #8
/*    */     //   195: aload #7
/*    */     //   197: iload #8
/*    */     //   199: iload #5
/*    */     //   201: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   204: dup
/*    */     //   205: ldc 'substring(...)'
/*    */     //   207: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   210: goto -> 220
/*    */     //   213: iinc #5, 1
/*    */     //   216: goto -> 148
/*    */     //   219: aload_3
/*    */     //   220: invokestatic toBigDecimalOrNull : (Ljava/lang/String;)Ljava/math/BigDecimal;
/*    */     //   223: astore_2
/*    */     //   224: aload_0
/*    */     //   225: astore #4
/*    */     //   227: iconst_0
/*    */     //   228: istore #5
/*    */     //   230: iconst_0
/*    */     //   231: istore #6
/*    */     //   233: aload #4
/*    */     //   235: checkcast java/lang/CharSequence
/*    */     //   238: invokeinterface length : ()I
/*    */     //   243: istore #7
/*    */     //   245: iload #6
/*    */     //   247: iload #7
/*    */     //   249: if_icmpge -> 309
/*    */     //   252: aload #4
/*    */     //   254: iload #6
/*    */     //   256: invokevirtual charAt : (I)C
/*    */     //   259: istore #8
/*    */     //   261: iconst_0
/*    */     //   262: istore #9
/*    */     //   264: iload #8
/*    */     //   266: invokestatic isDigit : (C)Z
/*    */     //   269: ifne -> 279
/*    */     //   272: iload #8
/*    */     //   274: bipush #46
/*    */     //   276: if_icmpne -> 283
/*    */     //   279: iconst_1
/*    */     //   280: goto -> 284
/*    */     //   283: iconst_0
/*    */     //   284: ifne -> 303
/*    */     //   287: aload #4
/*    */     //   289: iload #6
/*    */     //   291: invokevirtual substring : (I)Ljava/lang/String;
/*    */     //   294: dup
/*    */     //   295: ldc 'substring(...)'
/*    */     //   297: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   300: goto -> 311
/*    */     //   303: iinc #6, 1
/*    */     //   306: goto -> 245
/*    */     //   309: ldc ''
/*    */     //   311: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */     //   314: invokevirtual toUpperCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   317: dup
/*    */     //   318: ldc 'toUpperCase(...)'
/*    */     //   320: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   323: astore_3
/*    */     //   324: nop
/*    */     //   325: aload_2
/*    */     //   326: ifnonnull -> 333
/*    */     //   329: aconst_null
/*    */     //   330: goto -> 578
/*    */     //   333: aload_3
/*    */     //   334: checkcast java/lang/CharSequence
/*    */     //   337: invokeinterface length : ()I
/*    */     //   342: ifne -> 349
/*    */     //   345: iconst_1
/*    */     //   346: goto -> 350
/*    */     //   349: iconst_0
/*    */     //   350: ifeq -> 360
/*    */     //   353: aload_2
/*    */     //   354: invokevirtual toBigInteger : ()Ljava/math/BigInteger;
/*    */     //   357: goto -> 578
/*    */     //   360: aload_1
/*    */     //   361: astore #4
/*    */     //   363: iconst_0
/*    */     //   364: istore #5
/*    */     //   366: aload #4
/*    */     //   368: astore #6
/*    */     //   370: new java/util/ArrayList
/*    */     //   373: dup
/*    */     //   374: aload #4
/*    */     //   376: arraylength
/*    */     //   377: invokespecial <init> : (I)V
/*    */     //   380: checkcast java/util/Collection
/*    */     //   383: astore #7
/*    */     //   385: iconst_0
/*    */     //   386: istore #8
/*    */     //   388: iconst_0
/*    */     //   389: istore #9
/*    */     //   391: aload #6
/*    */     //   393: arraylength
/*    */     //   394: istore #10
/*    */     //   396: iload #9
/*    */     //   398: iload #10
/*    */     //   400: if_icmpge -> 451
/*    */     //   403: aload #6
/*    */     //   405: iload #9
/*    */     //   407: aaload
/*    */     //   408: astore #11
/*    */     //   410: aload #7
/*    */     //   412: aload #11
/*    */     //   414: astore #12
/*    */     //   416: astore #14
/*    */     //   418: iconst_0
/*    */     //   419: istore #13
/*    */     //   421: aload #12
/*    */     //   423: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */     //   426: invokevirtual toUpperCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   429: dup
/*    */     //   430: ldc 'toUpperCase(...)'
/*    */     //   432: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   435: nop
/*    */     //   436: aload #14
/*    */     //   438: swap
/*    */     //   439: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   444: pop
/*    */     //   445: iinc #9, 1
/*    */     //   448: goto -> 396
/*    */     //   451: aload #7
/*    */     //   453: checkcast java/util/List
/*    */     //   456: nop
/*    */     //   457: aload_3
/*    */     //   458: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */     //   463: ifeq -> 577
/*    */     //   466: aload_2
/*    */     //   467: astore #4
/*    */     //   469: ldc2_w 10.0
/*    */     //   472: dstore #5
/*    */     //   474: aload_1
/*    */     //   475: astore #7
/*    */     //   477: iconst_0
/*    */     //   478: istore #8
/*    */     //   480: iconst_0
/*    */     //   481: istore #9
/*    */     //   483: aload #7
/*    */     //   485: arraylength
/*    */     //   486: istore #10
/*    */     //   488: iload #9
/*    */     //   490: iload #10
/*    */     //   492: if_icmpge -> 526
/*    */     //   495: aload #7
/*    */     //   497: iload #9
/*    */     //   499: aaload
/*    */     //   500: astore #11
/*    */     //   502: iconst_0
/*    */     //   503: istore #12
/*    */     //   505: aload #11
/*    */     //   507: aload_3
/*    */     //   508: iconst_1
/*    */     //   509: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
/*    */     //   512: ifeq -> 520
/*    */     //   515: iload #9
/*    */     //   517: goto -> 527
/*    */     //   520: iinc #9, 1
/*    */     //   523: goto -> 488
/*    */     //   526: iconst_m1
/*    */     //   527: iconst_1
/*    */     //   528: iadd
/*    */     //   529: iconst_3
/*    */     //   530: imul
/*    */     //   531: istore #7
/*    */     //   533: dload #5
/*    */     //   535: iload #7
/*    */     //   537: i2d
/*    */     //   538: invokestatic pow : (DD)D
/*    */     //   541: dstore #5
/*    */     //   543: new java/math/BigDecimal
/*    */     //   546: dup
/*    */     //   547: dload #5
/*    */     //   549: invokestatic valueOf : (D)Ljava/lang/String;
/*    */     //   552: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   555: astore #5
/*    */     //   557: aload #4
/*    */     //   559: aload #5
/*    */     //   561: invokevirtual multiply : (Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
/*    */     //   564: dup
/*    */     //   565: ldc_w 'multiply(...)'
/*    */     //   568: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   571: invokevirtual toBigInteger : ()Ljava/math/BigInteger;
/*    */     //   574: goto -> 578
/*    */     //   577: aconst_null
/*    */     //   578: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 6
/*    */     //   #25	-> 134
/*    */     //   #40	-> 139
/*    */     //   #41	-> 155
/*    */     //   #25	-> 166
/*    */     //   #25	-> 171
/*    */     //   #41	-> 186
/*    */     //   #42	-> 189
/*    */     //   #42	-> 210
/*    */     //   #40	-> 213
/*    */     //   #44	-> 219
/*    */     //   #25	-> 220
/*    */     //   #26	-> 224
/*    */     //   #45	-> 230
/*    */     //   #46	-> 252
/*    */     //   #26	-> 264
/*    */     //   #26	-> 269
/*    */     //   #46	-> 284
/*    */     //   #47	-> 287
/*    */     //   #47	-> 300
/*    */     //   #45	-> 303
/*    */     //   #48	-> 309
/*    */     //   #26	-> 311
/*    */     //   #26	-> 323
/*    */     //   #28	-> 324
/*    */     //   #29	-> 325
/*    */     //   #30	-> 333
/*    */     //   #30	-> 350
/*    */     //   #31	-> 360
/*    */     //   #49	-> 366
/*    */     //   #50	-> 388
/*    */     //   #51	-> 410
/*    */     //   #31	-> 421
/*    */     //   #31	-> 435
/*    */     //   #51	-> 439
/*    */     //   #50	-> 445
/*    */     //   #52	-> 451
/*    */     //   #49	-> 456
/*    */     //   #31	-> 457
/*    */     //   #53	-> 480
/*    */     //   #54	-> 495
/*    */     //   #31	-> 505
/*    */     //   #54	-> 512
/*    */     //   #55	-> 515
/*    */     //   #53	-> 520
/*    */     //   #58	-> 526
/*    */     //   #31	-> 527
/*    */     //   #31	-> 543
/*    */     //   #31	-> 557
/*    */     //   #31	-> 571
/*    */     //   #32	-> 577
/*    */     //   #28	-> 578
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   166	20	8	$i$a$-takeWhile-MiscUtilsKt$parseBigIntegerOrNull$number$1	I
/*    */     //   163	23	7	it	C
/*    */     //   142	77	5	index$iv	I
/*    */     //   139	81	4	$i$f$takeWhile	I
/*    */     //   136	84	3	$this$takeWhile$iv	Ljava/lang/String;
/*    */     //   264	20	9	$i$a$-dropWhile-MiscUtilsKt$parseBigIntegerOrNull$suffix$1	I
/*    */     //   261	23	8	it	C
/*    */     //   233	76	6	index$iv	I
/*    */     //   230	81	5	$i$f$dropWhile	I
/*    */     //   227	84	4	$this$dropWhile$iv	Ljava/lang/String;
/*    */     //   421	15	13	$i$a$-map-MiscUtilsKt$parseBigIntegerOrNull$1	I
/*    */     //   418	18	12	it	Ljava/lang/String;
/*    */     //   410	35	11	item$iv$iv	Ljava/lang/Object;
/*    */     //   388	65	8	$i$f$mapTo	I
/*    */     //   385	68	6	$this$mapTo$iv$iv	[Ljava/lang/Object;
/*    */     //   385	68	7	destination$iv$iv	Ljava/util/Collection;
/*    */     //   366	91	5	$i$f$map	I
/*    */     //   363	94	4	$this$map$iv	[Ljava/lang/Object;
/*    */     //   505	7	12	$i$a$-indexOfFirst-MiscUtilsKt$parseBigIntegerOrNull$2	I
/*    */     //   502	10	11	it	Ljava/lang/String;
/*    */     //   483	43	9	index$iv	I
/*    */     //   480	47	8	$i$f$indexOfFirst	I
/*    */     //   477	50	7	$this$indexOfFirst$iv	[Ljava/lang/Object;
/*    */     //   134	445	1	suffixes	[Ljava/lang/String;
/*    */     //   224	355	2	number	Ljava/math/BigDecimal;
/*    */     //   324	255	3	suffix	Ljava/lang/String;
/*    */     //   0	579	0	$this$parseBigIntegerOrNull	Ljava/lang/String;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final class_5250 prepend(@NotNull class_5250 $this$prepend, @NotNull class_5250 component) {
/* 36 */     Intrinsics.checkNotNullParameter($this$prepend, "<this>");
/* 36 */     Intrinsics.checkNotNullParameter(component, "component");
/* 36 */     Intrinsics.checkNotNullExpressionValue(component.method_10852((class_2561)$this$prepend), "append(...)");
/* 36 */     return component.method_10852((class_2561)$this$prepend);
/*    */   }
/*    */   
/*    */   public static final boolean isSame(@NotNull class_1799 $this$isSame, @NotNull class_1799 other) {
/* 38 */     Intrinsics.checkNotNullParameter($this$isSame, "<this>");
/* 38 */     Intrinsics.checkNotNullParameter(other, "other");
/* 38 */     return (Intrinsics.areEqual($this$isSame.method_7909(), other.method_7909()) && Intrinsics.areEqual($this$isSame.method_57353(), other.method_57353()));
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\commo\\utils\MiscUtilsKt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */