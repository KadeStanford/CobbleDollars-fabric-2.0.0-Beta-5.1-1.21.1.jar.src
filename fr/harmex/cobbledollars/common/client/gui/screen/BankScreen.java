/*     */ package fr.harmex.cobbledollars.common.client.gui.screen;
/*     */ 
/*     */ import com.cobblemon.mod.common.api.net.NetworkPacket;
/*     */ import fr.harmex.cobbledollars.common.client.gui.screen.widget.SellButton;
/*     */ import fr.harmex.cobbledollars.common.client.gui.screen.widget.ShopButton;
/*     */ import fr.harmex.cobbledollars.common.client.utils.Context;
/*     */ import fr.harmex.cobbledollars.common.client.utils.GuiUtilsKt;
/*     */ import fr.harmex.cobbledollars.common.network.CobbleDollarsNetwork;
/*     */ import fr.harmex.cobbledollars.common.network.packets.c2s.OpenShopPacket;
/*     */ import fr.harmex.cobbledollars.common.network.packets.c2s.SellPacket;
/*     */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*     */ import fr.harmex.cobbledollars.common.utils.extensions.SimpleContainerExtensionsKt;
/*     */ import fr.harmex.cobbledollars.common.world.inventory.BankMenu;
/*     */ import java.math.BigInteger;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.class_1263;
/*     */ import net.minecraft.class_1265;
/*     */ import net.minecraft.class_1277;
/*     */ import net.minecraft.class_1661;
/*     */ import net.minecraft.class_1703;
/*     */ import net.minecraft.class_2561;
/*     */ import net.minecraft.class_2960;
/*     */ import net.minecraft.class_332;
/*     */ import net.minecraft.class_364;
/*     */ import net.minecraft.class_4185;
/*     */ import net.minecraft.class_465;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000f\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\003\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\020\007\n\002\b\006\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\r\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\007\030\0002\b\022\004\022\0020\0020\0012\0020\003B\037\022\006\020\004\032\0020\002\022\006\020\006\032\0020\005\022\006\020\b\032\0020\007¢\006\004\b\t\020\nJ\017\020\f\032\0020\013H\024¢\006\004\b\f\020\rJ\r\020\016\032\0020\013¢\006\004\b\016\020\rJ\r\020\020\032\0020\017¢\006\004\b\020\020\021J'\020\027\032\0020\0132\006\020\023\032\0020\0222\006\020\025\032\0020\0242\006\020\026\032\0020\024H\024¢\006\004\b\027\020\030J/\020\033\032\0020\0132\006\020\023\032\0020\0222\006\020\032\032\0020\0312\006\020\025\032\0020\0242\006\020\026\032\0020\024H\024¢\006\004\b\033\020\034J/\020\035\032\0020\0132\006\020\023\032\0020\0222\006\020\025\032\0020\0242\006\020\026\032\0020\0242\006\020\032\032\0020\031H\026¢\006\004\b\035\020\036J\017\020\037\032\0020\013H\026¢\006\004\b\037\020\rJ\027\020\"\032\0020\0132\006\020!\032\0020 H\026¢\006\004\b\"\020#R\027\020%\032\0020$8\006¢\006\f\n\004\b%\020&\032\004\b'\020(R\"\020)\032\0020\0248\006@\006X\016¢\006\022\n\004\b)\020*\032\004\b+\020,\"\004\b-\020.R\"\020/\032\0020\0248\006@\006X\016¢\006\022\n\004\b/\020*\032\004\b0\020,\"\004\b1\020.R\"\0203\032\002028\006@\006X.¢\006\022\n\004\b3\0204\032\004\b5\0206\"\004\b7\0208R\"\020:\032\002098\006@\006X\016¢\006\022\n\004\b:\020;\032\004\b<\020=\"\004\b>\020?¨\006@"}, d2 = {"Lfr/harmex/cobbledollars/common/client/gui/screen/BankScreen;", "Lnet/minecraft/class_465;", "Lfr/harmex/cobbledollars/common/world/inventory/BankMenu;", "Lnet/minecraft/class_1265;", "menu", "Lnet/minecraft/class_1661;", "playerInventory", "Lnet/minecraft/class_2561;", "title", "<init>", "(Lfr/harmex/cobbledollars/common/world/inventory/BankMenu;Lnet/minecraft/class_1661;Lnet/minecraft/class_2561;)V", "", "init", "()V", "sell", "", "canSell", "()Z", "Lnet/minecraft/class_332;", "guiGraphics", "", "mouseX", "mouseY", "renderLabels", "(Lnet/minecraft/class_332;II)V", "", "partialTick", "renderBg", "(Lnet/minecraft/class_332;FII)V", "render", "(Lnet/minecraft/class_332;IIF)V", "onClose", "Lnet/minecraft/class_1263;", "container", "containerChanged", "(Lnet/minecraft/class_1263;)V", "Lnet/minecraft/class_2960;", "bgLocation", "Lnet/minecraft/class_2960;", "getBgLocation", "()Lnet/minecraft/class_2960;", "x", "I", "getX", "()I", "setX", "(I)V", "y", "getY", "setY", "Lfr/harmex/cobbledollars/common/client/gui/screen/widget/SellButton;", "sellButton", "Lfr/harmex/cobbledollars/common/client/gui/screen/widget/SellButton;", "getSellButton", "()Lfr/harmex/cobbledollars/common/client/gui/screen/widget/SellButton;", "setSellButton", "(Lfr/harmex/cobbledollars/common/client/gui/screen/widget/SellButton;)V", "Ljava/math/BigInteger;", "sellPrice", "Ljava/math/BigInteger;", "getSellPrice", "()Ljava/math/BigInteger;", "setSellPrice", "(Ljava/math/BigInteger;)V", "common"})
/*     */ public final class BankScreen extends class_465<BankMenu> implements class_1265 {
/*     */   @NotNull
/*     */   private final class_2960 bgLocation;
/*     */   
/*     */   private int x;
/*     */   
/*     */   private int y;
/*     */   
/*     */   public SellButton sellButton;
/*     */   
/*     */   @NotNull
/*     */   private BigInteger sellPrice;
/*     */   
/*     */   public BankScreen(@NotNull BankMenu menu, @NotNull class_1661 playerInventory, @NotNull class_2561 title) {
/*  26 */     super(
/*  27 */         (class_1703)menu, 
/*  28 */         playerInventory, 
/*  29 */         title);
/*  31 */     this.bgLocation = MiscUtilsKt.cobbleDollarsResource("textures/gui/bank/bank_base.png");
/*  35 */     Intrinsics.checkNotNullExpressionValue(BigInteger.ZERO, "ZERO");
/*  35 */     this.sellPrice = BigInteger.ZERO;
/*  37 */     this.field_2792 = 170;
/*  38 */     this.field_2779 = 204;
/*  39 */     menu.getBankContainer().method_5489(this);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final class_2960 getBgLocation() {
/*     */     return this.bgLocation;
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
/*     */   @NotNull
/*     */   public final SellButton getSellButton() {
/*     */     if (this.sellButton != null)
/*     */       return this.sellButton; 
/*     */     Intrinsics.throwUninitializedPropertyAccessException("sellButton");
/*     */     return null;
/*     */   }
/*     */   
/*     */   public final void setSellButton(@NotNull SellButton <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.sellButton = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final BigInteger getSellPrice() {
/*     */     return this.sellPrice;
/*     */   }
/*     */   
/*     */   public final void setSellPrice(@NotNull BigInteger <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.sellPrice = <set-?>;
/*     */   }
/*     */   
/*     */   protected void method_25426() {
/*  43 */     this.x = (this.field_22789 - this.field_2792) / 2;
/*  44 */     this.y = (this.field_22790 - this.field_2779) / 2;
/*  46 */     setSellButton(new SellButton(this.x + this.field_2792 / 2 - 43, this.y + 1, this, this::init$lambda$0));
/*  47 */     method_37063((class_364)getSellButton());
/*  49 */     method_37063(
/*  50 */         (class_364)new ShopButton(this.x + 16, this.y + 189, this::init$lambda$1));
/*  55 */     super.method_25426();
/*     */   }
/*     */   
/*     */   private static final void init$lambda$0(BankScreen this$0, class_4185 it) {
/*     */     Intrinsics.checkNotNullParameter(this$0, "this$0");
/*     */     this$0.sell();
/*     */   }
/*     */   
/*     */   private static final void init$lambda$1(BankScreen this$0, class_4185 it) {
/*     */     Intrinsics.checkNotNullParameter(this$0, "this$0");
/*     */     CobbleDollarsNetwork.INSTANCE.sendToServer((NetworkPacket)new OpenShopPacket(((BankMenu)this$0.field_2797).getCobbleMerchant().getMerchantUUID()));
/*     */   }
/*     */   
/*     */   public final void sell() {
/*  59 */     if (canSell())
/*  60 */       CobbleDollarsNetwork.INSTANCE.sendToServer((NetworkPacket)new SellPacket()); 
/*     */   }
/*     */   
/*     */   public final boolean canSell() {
/*  67 */     return !Intrinsics.areEqual(this.sellPrice, BigInteger.ZERO);
/*     */   }
/*     */   
/*     */   protected void method_2388(@NotNull class_332 guiGraphics, int mouseX, int mouseY) {
/*  69 */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/*     */   }
/*     */   
/*     */   protected void method_2389(@NotNull class_332 guiGraphics, float partialTick, int mouseX, int mouseY) {
/*  72 */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/*  72 */     this.x = (this.field_22789 - this.field_2792) / 2;
/*  73 */     this.y = (this.field_22790 - this.field_2779) / 2;
/*  75 */     guiGraphics.method_25290(this.bgLocation, this.x, this.y, 0.0F, 0.0F, this.field_2792, this.field_2779, this.field_2792, this.field_2779);
/*     */   }
/*     */   
/*     */   public void method_25394(@NotNull class_332 guiGraphics, int mouseX, int mouseY, float partialTick) {
/*  79 */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics");
/*  79 */     super.method_25394(guiGraphics, mouseX, mouseY, partialTick);
/*  82 */     GuiUtilsKt.renderCobbleDollarsElement$default(guiGraphics, 
/*  83 */         this.x + this.field_2792 / 2 - 27, 
/*  84 */         this.y + this.field_2779 - 15, false, null, 
/*  85 */         false, null, null, 108, null);
/*  89 */     GuiUtilsKt.renderCobbleDollarsElement$default(guiGraphics, 
/*  90 */         this.x + this.field_2792 / 2 - 11, 
/*  91 */         this.y + 1, false, 
/*  92 */         this.sellPrice, false, 
/*  93 */         Context.BANK, null, 84, null);
/*  96 */     method_2380(guiGraphics, mouseX, mouseY);
/*     */   }
/*     */   
/*     */   public void method_25419() {
/* 100 */     ((BankMenu)this.field_2797).getBankContainer().method_5488(this);
/* 100 */     super
/* 101 */       .method_25419();
/*     */   }
/*     */   
/*     */   public void method_5453(@NotNull class_1263 container) {
/* 105 */     Intrinsics.checkNotNullParameter(container, "container");
/* 105 */     (class_1277)container;
/* 106 */     this.sellPrice = SimpleContainerExtensionsKt.calculateClientBankValue((class_1277)container);
/*     */   }
/*     */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\client\gui\screen\BankScreen.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */