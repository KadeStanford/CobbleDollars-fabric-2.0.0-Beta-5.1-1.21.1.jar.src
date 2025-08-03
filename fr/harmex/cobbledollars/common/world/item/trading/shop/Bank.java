/*    */ package fr.harmex.cobbledollars.common.world.item.trading.shop;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import net.minecraft.class_1799;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\021\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\005\030\0002\022\022\004\022\0020\0020\001j\b\022\004\022\0020\002`\003B\007¢\006\004\b\004\020\005B!\b\026\022\026\020\006\032\022\022\004\022\0020\0020\001j\b\022\004\022\0020\002`\003¢\006\004\b\004\020\007B\035\b\026\022\022\020\t\032\n\022\006\b\001\022\0020\0020\b\"\0020\002¢\006\004\b\004\020\nJ\025\020\016\032\0020\r2\006\020\f\032\0020\013¢\006\004\b\016\020\017J\027\020\020\032\004\030\0010\0022\006\020\f\032\0020\013¢\006\004\b\020\020\021¨\006\022"}, d2 = {"Lfr/harmex/cobbledollars/common/world/item/trading/shop/Bank;", "Ljava/util/ArrayList;", "Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;", "Lkotlin/collections/ArrayList;", "<init>", "()V", "offers", "(Ljava/util/ArrayList;)V", "", "offer", "([Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;)V", "Lnet/minecraft/class_1799;", "itemStack", "", "contains", "(Lnet/minecraft/class_1799;)Z", "get", "(Lnet/minecraft/class_1799;)Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;", "common"})
/*    */ @SourceDebugExtension({"SMAP\nBank.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bank.kt\nfr/harmex/cobbledollars/common/world/item/trading/shop/Bank\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,16:1\n1755#2,3:17\n295#2,2:20\n*S KotlinDebug\n*F\n+ 1 Bank.kt\nfr/harmex/cobbledollars/common/world/item/trading/shop/Bank\n*L\n13#1:17,3\n15#1:20,2\n*E\n"})
/*    */ public final class Bank extends ArrayList<Offer> {
/*    */   public Bank() {}
/*    */   
/*    */   public Bank(@NotNull ArrayList<? extends Offer> offers) {
/*  6 */     this();
/*  7 */     addAll(offers);
/*    */   }
/*    */   
/*    */   public Bank(@NotNull Offer... offer) {
/*  9 */     this();
/* 10 */     CollectionsKt.addAll(this, (Object[])offer);
/*    */   }
/*    */   
/*    */   public final boolean contains(@NotNull class_1799 itemStack) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'itemStack'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: checkcast java/lang/Iterable
/*    */     //   10: astore_2
/*    */     //   11: iconst_0
/*    */     //   12: istore_3
/*    */     //   13: aload_2
/*    */     //   14: instanceof java/util/Collection
/*    */     //   17: ifeq -> 36
/*    */     //   20: aload_2
/*    */     //   21: checkcast java/util/Collection
/*    */     //   24: invokeinterface isEmpty : ()Z
/*    */     //   29: ifeq -> 36
/*    */     //   32: iconst_0
/*    */     //   33: goto -> 87
/*    */     //   36: aload_2
/*    */     //   37: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   42: astore #4
/*    */     //   44: aload #4
/*    */     //   46: invokeinterface hasNext : ()Z
/*    */     //   51: ifeq -> 86
/*    */     //   54: aload #4
/*    */     //   56: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   61: astore #5
/*    */     //   63: aload #5
/*    */     //   65: checkcast fr/harmex/cobbledollars/common/world/item/trading/shop/Offer
/*    */     //   68: astore #6
/*    */     //   70: iconst_0
/*    */     //   71: istore #7
/*    */     //   73: aload #6
/*    */     //   75: aload_1
/*    */     //   76: invokevirtual isItem : (Lnet/minecraft/class_1799;)Z
/*    */     //   79: ifeq -> 44
/*    */     //   82: iconst_1
/*    */     //   83: goto -> 87
/*    */     //   86: iconst_0
/*    */     //   87: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 6
/*    */     //   #17	-> 13
/*    */     //   #18	-> 36
/*    */     //   #13	-> 73
/*    */     //   #18	-> 79
/*    */     //   #19	-> 86
/*    */     //   #13	-> 87
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   73	6	7	$i$a$-any-Bank$contains$1	I
/*    */     //   70	9	6	it	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;
/*    */     //   63	23	5	element$iv	Ljava/lang/Object;
/*    */     //   13	74	3	$i$f$any	I
/*    */     //   11	76	2	$this$any$iv	Ljava/lang/Iterable;
/*    */     //   0	88	0	this	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Bank;
/*    */     //   0	88	1	itemStack	Lnet/minecraft/class_1799;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Offer get(@NotNull class_1799 itemStack) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'itemStack'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: checkcast java/lang/Iterable
/*    */     //   10: astore_2
/*    */     //   11: iconst_0
/*    */     //   12: istore_3
/*    */     //   13: aload_2
/*    */     //   14: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   19: astore #4
/*    */     //   21: aload #4
/*    */     //   23: invokeinterface hasNext : ()Z
/*    */     //   28: ifeq -> 64
/*    */     //   31: aload #4
/*    */     //   33: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   38: astore #5
/*    */     //   40: aload #5
/*    */     //   42: checkcast fr/harmex/cobbledollars/common/world/item/trading/shop/Offer
/*    */     //   45: astore #6
/*    */     //   47: iconst_0
/*    */     //   48: istore #7
/*    */     //   50: aload #6
/*    */     //   52: aload_1
/*    */     //   53: invokevirtual isItem : (Lnet/minecraft/class_1799;)Z
/*    */     //   56: ifeq -> 21
/*    */     //   59: aload #5
/*    */     //   61: goto -> 65
/*    */     //   64: aconst_null
/*    */     //   65: checkcast fr/harmex/cobbledollars/common/world/item/trading/shop/Offer
/*    */     //   68: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 6
/*    */     //   #20	-> 13
/*    */     //   #15	-> 50
/*    */     //   #20	-> 56
/*    */     //   #21	-> 64
/*    */     //   #15	-> 68
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   50	6	7	$i$a$-firstOrNull-Bank$get$1	I
/*    */     //   47	9	6	it	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Offer;
/*    */     //   40	24	5	element$iv	Ljava/lang/Object;
/*    */     //   13	52	3	$i$f$firstOrNull	I
/*    */     //   11	54	2	$this$firstOrNull$iv	Ljava/lang/Iterable;
/*    */     //   0	69	0	this	Lfr/harmex/cobbledollars/common/world/item/trading/shop/Bank;
/*    */     //   0	69	1	itemStack	Lnet/minecraft/class_1799;
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\world\item\trading\shop\Bank.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */