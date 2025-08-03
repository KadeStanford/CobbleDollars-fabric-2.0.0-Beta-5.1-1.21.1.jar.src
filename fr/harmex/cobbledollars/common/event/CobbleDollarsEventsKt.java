package fr.harmex.cobbledollars.common.event;

import com.cobblemon.mod.common.api.events.battles.BattleVictoryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\020\002\n\002\b\003\032\025\020\003\032\0020\0022\006\020\001\032\0020\000¢\006\004\b\003\020\004¨\006\005"}, d2 = {"Lcom/cobblemon/mod/common/api/events/battles/BattleVictoryEvent;", "event", "", "battleVictory", "(Lcom/cobblemon/mod/common/api/events/battles/BattleVictoryEvent;)V", "common"})
@SourceDebugExtension({"SMAP\nCobbleDollarsEvents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CobbleDollarsEvents.kt\nfr/harmex/cobbledollars/common/event/CobbleDollarsEventsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1368#2:45\n1454#2,2:46\n1611#2,9:48\n1863#2:57\n1864#2:59\n1620#2:60\n1456#2,3:61\n1863#2:64\n1863#2:65\n1863#2,2:66\n1864#2:68\n1864#2:69\n1#3:58\n*S KotlinDebug\n*F\n+ 1 CobbleDollarsEvents.kt\nfr/harmex/cobbledollars/common/event/CobbleDollarsEventsKt\n*L\n13#1:45\n13#1:46,2\n13#1:48,9\n13#1:57\n13#1:59\n13#1:60\n13#1:61,3\n15#1:64\n19#1:65\n27#1:66,2\n19#1:68\n15#1:69\n13#1:58\n*E\n"})
public final class CobbleDollarsEventsKt {
  public static final void battleVictory(@NotNull BattleVictoryEvent event) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'event'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: invokevirtual getBattle : ()Lcom/cobblemon/mod/common/api/battles/model/PokemonBattle;
    //   10: invokevirtual isPvP : ()Z
    //   13: ifeq -> 17
    //   16: return
    //   17: aload_0
    //   18: invokevirtual getWinners : ()Ljava/util/List;
    //   21: checkcast java/lang/Iterable
    //   24: astore_2
    //   25: iconst_0
    //   26: istore_3
    //   27: aload_2
    //   28: astore #4
    //   30: new java/util/ArrayList
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: checkcast java/util/Collection
    //   40: astore #5
    //   42: iconst_0
    //   43: istore #6
    //   45: aload #4
    //   47: invokeinterface iterator : ()Ljava/util/Iterator;
    //   52: astore #7
    //   54: aload #7
    //   56: invokeinterface hasNext : ()Z
    //   61: ifeq -> 220
    //   64: aload #7
    //   66: invokeinterface next : ()Ljava/lang/Object;
    //   71: astore #8
    //   73: aload #8
    //   75: checkcast com/cobblemon/mod/common/api/battles/model/actor/BattleActor
    //   78: astore #9
    //   80: iconst_0
    //   81: istore #10
    //   83: aload #9
    //   85: invokevirtual getPlayerUUIDs : ()Ljava/lang/Iterable;
    //   88: astore #11
    //   90: iconst_0
    //   91: istore #12
    //   93: aload #11
    //   95: astore #13
    //   97: new java/util/ArrayList
    //   100: dup
    //   101: invokespecial <init> : ()V
    //   104: checkcast java/util/Collection
    //   107: astore #14
    //   109: iconst_0
    //   110: istore #15
    //   112: aload #13
    //   114: astore #16
    //   116: iconst_0
    //   117: istore #17
    //   119: aload #16
    //   121: invokeinterface iterator : ()Ljava/util/Iterator;
    //   126: astore #18
    //   128: aload #18
    //   130: invokeinterface hasNext : ()Z
    //   135: ifeq -> 196
    //   138: aload #18
    //   140: invokeinterface next : ()Ljava/lang/Object;
    //   145: astore #19
    //   147: aload #19
    //   149: astore #20
    //   151: iconst_0
    //   152: istore #21
    //   154: aload #20
    //   156: checkcast java/util/UUID
    //   159: astore #22
    //   161: iconst_0
    //   162: istore #23
    //   164: aload #22
    //   166: invokestatic getPlayer : (Ljava/util/UUID;)Lnet/minecraft/class_3222;
    //   169: dup
    //   170: ifnull -> 191
    //   173: astore #24
    //   175: iconst_0
    //   176: istore #25
    //   178: aload #14
    //   180: aload #24
    //   182: invokeinterface add : (Ljava/lang/Object;)Z
    //   187: pop
    //   188: goto -> 192
    //   191: pop
    //   192: nop
    //   193: goto -> 128
    //   196: nop
    //   197: aload #14
    //   199: checkcast java/util/List
    //   202: nop
    //   203: checkcast java/lang/Iterable
    //   206: nop
    //   207: astore #9
    //   209: aload #5
    //   211: aload #9
    //   213: invokestatic addAll : (Ljava/util/Collection;Ljava/lang/Iterable;)Z
    //   216: pop
    //   217: goto -> 54
    //   220: aload #5
    //   222: checkcast java/util/List
    //   225: nop
    //   226: astore_1
    //   227: aload_1
    //   228: checkcast java/lang/Iterable
    //   231: astore_2
    //   232: iconst_0
    //   233: istore_3
    //   234: aload_2
    //   235: invokeinterface iterator : ()Ljava/util/Iterator;
    //   240: astore #4
    //   242: aload #4
    //   244: invokeinterface hasNext : ()Z
    //   249: ifeq -> 575
    //   252: aload #4
    //   254: invokeinterface next : ()Ljava/lang/Object;
    //   259: astore #5
    //   261: aload #5
    //   263: checkcast net/minecraft/class_3222
    //   266: astore #6
    //   268: iconst_0
    //   269: istore #7
    //   271: iconst_0
    //   272: istore #8
    //   274: aload_0
    //   275: invokevirtual getLosers : ()Ljava/util/List;
    //   278: checkcast java/lang/Iterable
    //   281: astore #9
    //   283: iconst_0
    //   284: istore #10
    //   286: aload #9
    //   288: invokeinterface iterator : ()Ljava/util/Iterator;
    //   293: astore #11
    //   295: aload #11
    //   297: invokeinterface hasNext : ()Z
    //   302: ifeq -> 507
    //   305: aload #11
    //   307: invokeinterface next : ()Ljava/lang/Object;
    //   312: astore #12
    //   314: aload #12
    //   316: checkcast com/cobblemon/mod/common/api/battles/model/actor/BattleActor
    //   319: astore #13
    //   321: iconst_0
    //   322: istore #14
    //   324: aload #13
    //   326: invokevirtual getType : ()Lcom/cobblemon/mod/common/api/battles/model/actor/ActorType;
    //   329: getstatic com/cobblemon/mod/common/api/battles/model/actor/ActorType.WILD : Lcom/cobblemon/mod/common/api/battles/model/actor/ActorType;
    //   332: if_acmpne -> 347
    //   335: getstatic fr/harmex/cobbledollars/common/CobbleDollars.INSTANCE : Lfr/harmex/cobbledollars/common/CobbleDollars;
    //   338: invokevirtual getConfig : ()Lfr/harmex/cobbledollars/common/config/CommonConfig;
    //   341: invokevirtual getEarnCobbleDollarsFromWildPokemon : ()Z
    //   344: ifne -> 370
    //   347: aload #13
    //   349: invokevirtual getType : ()Lcom/cobblemon/mod/common/api/battles/model/actor/ActorType;
    //   352: getstatic com/cobblemon/mod/common/api/battles/model/actor/ActorType.NPC : Lcom/cobblemon/mod/common/api/battles/model/actor/ActorType;
    //   355: if_acmpne -> 502
    //   358: getstatic fr/harmex/cobbledollars/common/CobbleDollars.INSTANCE : Lfr/harmex/cobbledollars/common/CobbleDollars;
    //   361: invokevirtual getConfig : ()Lfr/harmex/cobbledollars/common/config/CommonConfig;
    //   364: invokevirtual getEarnCobbleDollarsFromNPC : ()Z
    //   367: ifeq -> 502
    //   370: iconst_0
    //   371: istore #15
    //   373: dconst_0
    //   374: dstore #26
    //   376: aload #13
    //   378: invokevirtual getPokemonList : ()Ljava/util/List;
    //   381: checkcast java/lang/Iterable
    //   384: astore #17
    //   386: iconst_0
    //   387: istore #18
    //   389: aload #17
    //   391: invokeinterface iterator : ()Ljava/util/Iterator;
    //   396: astore #19
    //   398: aload #19
    //   400: invokeinterface hasNext : ()Z
    //   405: ifeq -> 463
    //   408: aload #19
    //   410: invokeinterface next : ()Ljava/lang/Object;
    //   415: astore #20
    //   417: aload #20
    //   419: checkcast com/cobblemon/mod/common/battles/pokemon/BattlePokemon
    //   422: astore #21
    //   424: iconst_0
    //   425: istore #22
    //   427: iload #15
    //   429: aload #21
    //   431: invokevirtual getEffectedPokemon : ()Lcom/cobblemon/mod/common/pokemon/Pokemon;
    //   434: invokevirtual getLevel : ()I
    //   437: iadd
    //   438: istore #15
    //   440: dload #26
    //   442: aload #21
    //   444: invokevirtual getEffectedPokemon : ()Lcom/cobblemon/mod/common/pokemon/Pokemon;
    //   447: invokevirtual getLevel : ()I
    //   450: i2d
    //   451: ldc2_w 50.0
    //   454: ddiv
    //   455: dadd
    //   456: dstore #26
    //   458: nop
    //   459: nop
    //   460: goto -> 398
    //   463: nop
    //   464: iload #15
    //   466: iconst_5
    //   467: imul
    //   468: i2d
    //   469: dload #26
    //   471: dmul
    //   472: d2i
    //   473: iconst_1
    //   474: invokestatic coerceAtLeast : (II)I
    //   477: istore #8
    //   479: iload #8
    //   481: aload #6
    //   483: invokevirtual method_59922 : ()Lnet/minecraft/class_5819;
    //   486: iload #8
    //   488: iconst_2
    //   489: idiv
    //   490: iload #8
    //   492: iconst_2
    //   493: imul
    //   494: invokeinterface method_43051 : (II)I
    //   499: iadd
    //   500: istore #8
    //   502: nop
    //   503: nop
    //   504: goto -> 295
    //   507: nop
    //   508: aload #6
    //   510: checkcast net/minecraft/class_1657
    //   513: aload #6
    //   515: checkcast net/minecraft/class_1657
    //   518: invokestatic getCobbleDollars : (Lnet/minecraft/class_1657;)Ljava/math/BigInteger;
    //   521: astore #9
    //   523: new java/math/BigDecimal
    //   526: dup
    //   527: iload #8
    //   529: i2d
    //   530: getstatic fr/harmex/cobbledollars/common/CobbleDollars.INSTANCE : Lfr/harmex/cobbledollars/common/CobbleDollars;
    //   533: invokevirtual getConfig : ()Lfr/harmex/cobbledollars/common/config/CommonConfig;
    //   536: invokevirtual getCobbleDollarsIncomeMultiplier : ()D
    //   539: dmul
    //   540: invokestatic valueOf : (D)Ljava/lang/String;
    //   543: invokespecial <init> : (Ljava/lang/String;)V
    //   546: invokevirtual toBigInteger : ()Ljava/math/BigInteger;
    //   549: dup
    //   550: ldc 'toBigInteger(...)'
    //   552: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   555: aload #9
    //   557: swap
    //   558: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   561: dup
    //   562: ldc 'add(...)'
    //   564: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   567: invokestatic setCobbleDollars : (Lnet/minecraft/class_1657;Ljava/math/BigInteger;)V
    //   570: nop
    //   571: nop
    //   572: goto -> 242
    //   575: nop
    //   576: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #11	-> 6
    //   #13	-> 17
    //   #45	-> 27
    //   #46	-> 45
    //   #47	-> 73
    //   #13	-> 83
    //   #48	-> 93
    //   #56	-> 112
    //   #57	-> 119
    //   #56	-> 154
    //   #13	-> 164
    //   #56	-> 169
    //   #58	-> 175
    //   #56	-> 178
    //   #56	-> 188
    //   #56	-> 191
    //   #57	-> 192
    //   #59	-> 196
    //   #60	-> 197
    //   #48	-> 202
    //   #13	-> 206
    //   #47	-> 207
    //   #61	-> 209
    //   #63	-> 220
    //   #45	-> 225
    //   #13	-> 226
    //   #15	-> 227
    //   #64	-> 234
    //   #17	-> 271
    //   #19	-> 274
    //   #65	-> 286
    //   #21	-> 324
    //   #22	-> 347
    //   #24	-> 370
    //   #25	-> 373
    //   #27	-> 376
    //   #66	-> 389
    //   #28	-> 427
    //   #29	-> 440
    //   #30	-> 458
    //   #66	-> 459
    //   #67	-> 463
    //   #31	-> 464
    //   #33	-> 479
    //   #34	-> 486
    //   #35	-> 490
    //   #33	-> 494
    //   #39	-> 502
    //   #65	-> 503
    //   #68	-> 507
    //   #41	-> 508
    //   #41	-> 546
    //   #41	-> 567
    //   #42	-> 570
    //   #64	-> 571
    //   #69	-> 575
    //   #43	-> 576
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   164	5	23	$i$a$-mapNotNull-CobbleDollarsEventsKt$battleVictory$winnersPlayers$1$1	I
    //   161	8	22	p0	Ljava/util/UUID;
    //   178	10	25	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
    //   175	13	24	it$iv$iv	Ljava/lang/Object;
    //   154	38	21	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
    //   151	41	20	element$iv$iv	Ljava/lang/Object;
    //   147	46	19	element$iv$iv$iv	Ljava/lang/Object;
    //   119	78	17	$i$f$forEach	I
    //   116	81	16	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
    //   112	87	15	$i$f$mapNotNullTo	I
    //   109	90	13	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
    //   109	90	14	destination$iv$iv	Ljava/util/Collection;
    //   93	110	12	$i$f$mapNotNull	I
    //   90	113	11	$this$mapNotNull$iv	Ljava/lang/Iterable;
    //   83	124	10	$i$a$-flatMap-CobbleDollarsEventsKt$battleVictory$winnersPlayers$1	I
    //   80	127	9	it	Lcom/cobblemon/mod/common/api/battles/model/actor/BattleActor;
    //   209	8	9	list$iv$iv	Ljava/lang/Iterable;
    //   73	144	8	element$iv$iv	Ljava/lang/Object;
    //   45	177	6	$i$f$flatMapTo	I
    //   42	180	4	$this$flatMapTo$iv$iv	Ljava/lang/Iterable;
    //   42	180	5	destination$iv$iv	Ljava/util/Collection;
    //   27	199	3	$i$f$flatMap	I
    //   25	201	2	$this$flatMap$iv	Ljava/lang/Iterable;
    //   427	32	22	$i$a$-forEach-CobbleDollarsEventsKt$battleVictory$1$1$1	I
    //   424	35	21	pokemon	Lcom/cobblemon/mod/common/battles/pokemon/BattlePokemon;
    //   417	43	20	element$iv	Ljava/lang/Object;
    //   389	75	18	$i$f$forEach	I
    //   386	78	17	$this$forEach$iv	Ljava/lang/Iterable;
    //   373	129	15	totalPokemonLevel	I
    //   376	126	26	totalLevelMultiplier	D
    //   324	179	14	$i$a$-forEach-CobbleDollarsEventsKt$battleVictory$1$1	I
    //   321	182	13	loser	Lcom/cobblemon/mod/common/api/battles/model/actor/BattleActor;
    //   314	190	12	element$iv	Ljava/lang/Object;
    //   286	222	10	$i$f$forEach	I
    //   283	225	9	$this$forEach$iv	Ljava/lang/Iterable;
    //   271	300	7	$i$a$-forEach-CobbleDollarsEventsKt$battleVictory$1	I
    //   274	297	8	cobbleDollarsAmount	I
    //   268	303	6	player	Lnet/minecraft/class_3222;
    //   261	311	5	element$iv	Ljava/lang/Object;
    //   234	342	3	$i$f$forEach	I
    //   232	344	2	$this$forEach$iv	Ljava/lang/Iterable;
    //   227	350	1	winnersPlayers	Ljava/util/List;
    //   0	577	0	event	Lcom/cobblemon/mod/common/api/events/battles/BattleVictoryEvent;
  }
}


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\event\CobbleDollarsEventsKt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */