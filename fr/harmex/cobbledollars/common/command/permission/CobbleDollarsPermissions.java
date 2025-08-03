/*    */ package fr.harmex.cobbledollars.common.command.permission;
/*    */ 
/*    */ import com.cobblemon.mod.common.api.permission.Permission;
/*    */ import com.cobblemon.mod.common.api.permission.PermissionLevel;
/*    */ import java.util.ArrayList;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\034\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b%\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\006\032\b\022\004\022\0020\0050\004¢\006\004\b\006\020\007J\037\020\f\032\0020\0052\006\020\t\032\0020\b2\006\020\013\032\0020\nH\002¢\006\004\b\f\020\rR\032\020\017\032\b\022\004\022\0020\0050\0168\002X\004¢\006\006\n\004\b\017\020\020R\024\020\021\032\0020\b8\002XT¢\006\006\n\004\b\021\020\022R\027\020\023\032\0020\0058\006¢\006\f\n\004\b\023\020\024\032\004\b\025\020\026R\027\020\027\032\0020\0058\006¢\006\f\n\004\b\027\020\024\032\004\b\030\020\026R\027\020\031\032\0020\0058\006¢\006\f\n\004\b\031\020\024\032\004\b\032\020\026R\027\020\033\032\0020\0058\006¢\006\f\n\004\b\033\020\024\032\004\b\034\020\026R\027\020\035\032\0020\0058\006¢\006\f\n\004\b\035\020\024\032\004\b\036\020\026R\027\020\037\032\0020\0058\006¢\006\f\n\004\b\037\020\024\032\004\b \020\026R\027\020!\032\0020\0058\006¢\006\f\n\004\b!\020\024\032\004\b\"\020\026R\027\020#\032\0020\0058\006¢\006\f\n\004\b#\020\024\032\004\b$\020\026R\027\020%\032\0020\0058\006¢\006\f\n\004\b%\020\024\032\004\b&\020\026R\024\020'\032\0020\b8\002XT¢\006\006\n\004\b'\020\022R\027\020(\032\0020\0058\006¢\006\f\n\004\b(\020\024\032\004\b)\020\026R\027\020*\032\0020\0058\006¢\006\f\n\004\b*\020\024\032\004\b+\020\026R\024\020,\032\0020\b8\002XT¢\006\006\n\004\b,\020\022R\027\020-\032\0020\0058\006¢\006\f\n\004\b-\020\024\032\004\b.\020\026R\027\020/\032\0020\0058\006¢\006\f\n\004\b/\020\024\032\004\b0\020\026R\027\0201\032\0020\0058\006¢\006\f\n\004\b1\020\024\032\004\b2\020\026¨\0063"}, d2 = {"Lfr/harmex/cobbledollars/common/command/permission/CobbleDollarsPermissions;", "", "<init>", "()V", "", "Lcom/cobblemon/mod/common/api/permission/Permission;", "all", "()Ljava/lang/Iterable;", "", "node", "Lcom/cobblemon/mod/common/api/permission/PermissionLevel;", "level", "create", "(Ljava/lang/String;Lcom/cobblemon/mod/common/api/permission/PermissionLevel;)Lcom/cobblemon/mod/common/api/permission/Permission;", "Ljava/util/ArrayList;", "permissions", "Ljava/util/ArrayList;", "COBBLE_DOLLARS_BASE", "Ljava/lang/String;", "COBBLE_DOLLARS", "Lcom/cobblemon/mod/common/api/permission/Permission;", "getCOBBLE_DOLLARS", "()Lcom/cobblemon/mod/common/api/permission/Permission;", "COBBLE_DOLLARS_PAY", "getCOBBLE_DOLLARS_PAY", "COBBLE_DOLLARS_QUERY", "getCOBBLE_DOLLARS_QUERY", "COBBLE_DOLLARS_GIVE", "getCOBBLE_DOLLARS_GIVE", "COBBLE_DOLLARS_REMOVE", "getCOBBLE_DOLLARS_REMOVE", "COBBLE_DOLLARS_SET", "getCOBBLE_DOLLARS_SET", "COBBLE_DOLLARS_RELOAD", "getCOBBLE_DOLLARS_RELOAD", "COBBLE_DOLLARS_LEADERBOARD", "getCOBBLE_DOLLARS_LEADERBOARD", "COBBLE_DOLLARS_LEADERBOARD_UPDATE", "getCOBBLE_DOLLARS_LEADERBOARD_UPDATE", "COBBLE_MERCHANT_BASE", "COBBLE_MERCHANT", "getCOBBLE_MERCHANT", "COBBLE_MERCHANT_EDIT", "getCOBBLE_MERCHANT_EDIT", "COBBLE_MERCHANT_OPEN_BASE", "COBBLE_MERCHANT_OPEN", "getCOBBLE_MERCHANT_OPEN", "COBBLE_MERCHANT_OPEN_SHOP", "getCOBBLE_MERCHANT_OPEN_SHOP", "COBBLE_MERCHANT_OPEN_BANK", "getCOBBLE_MERCHANT_OPEN_BANK", "common"})
/*    */ @SourceDebugExtension({"SMAP\nCobbleDollarsPermissions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CobbleDollarsPermissions.kt\nfr/harmex/cobbledollars/common/command/permission/CobbleDollarsPermissions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
/*    */ public final class CobbleDollarsPermissions {
/*    */   @NotNull
/*  7 */   public static final CobbleDollarsPermissions INSTANCE = new CobbleDollarsPermissions();
/*    */   
/*    */   @NotNull
/*  7 */   private static final ArrayList<Permission> permissions = new ArrayList<>();
/*    */   
/*    */   @NotNull
/*    */   private static final String COBBLE_DOLLARS_BASE = "cobbledollars";
/*    */   
/*    */   @NotNull
/* 10 */   private static final Permission COBBLE_DOLLARS = INSTANCE.create("cobbledollars", PermissionLevel.NONE);
/*    */   
/*    */   @NotNull
/*    */   public final Permission getCOBBLE_DOLLARS() {
/* 10 */     return COBBLE_DOLLARS;
/*    */   }
/*    */   
/*    */   @NotNull
/* 11 */   private static final Permission COBBLE_DOLLARS_PAY = INSTANCE.create("cobbledollars.pay", PermissionLevel.NONE);
/*    */   
/*    */   @NotNull
/*    */   public final Permission getCOBBLE_DOLLARS_PAY() {
/* 11 */     return COBBLE_DOLLARS_PAY;
/*    */   }
/*    */   
/*    */   @NotNull
/* 12 */   private static final Permission COBBLE_DOLLARS_QUERY = INSTANCE.create("cobbledollars.query", PermissionLevel.NONE);
/*    */   
/*    */   @NotNull
/*    */   public final Permission getCOBBLE_DOLLARS_QUERY() {
/* 12 */     return COBBLE_DOLLARS_QUERY;
/*    */   }
/*    */   
/*    */   @NotNull
/* 13 */   private static final Permission COBBLE_DOLLARS_GIVE = INSTANCE.create("cobbledollars.give", PermissionLevel.CHEAT_COMMANDS_AND_COMMAND_BLOCKS);
/*    */   
/*    */   @NotNull
/*    */   public final Permission getCOBBLE_DOLLARS_GIVE() {
/* 13 */     return COBBLE_DOLLARS_GIVE;
/*    */   }
/*    */   
/*    */   @NotNull
/* 14 */   private static final Permission COBBLE_DOLLARS_REMOVE = INSTANCE.create("cobbledollars.remove", PermissionLevel.CHEAT_COMMANDS_AND_COMMAND_BLOCKS);
/*    */   
/*    */   @NotNull
/*    */   public final Permission getCOBBLE_DOLLARS_REMOVE() {
/* 14 */     return COBBLE_DOLLARS_REMOVE;
/*    */   }
/*    */   
/*    */   @NotNull
/* 15 */   private static final Permission COBBLE_DOLLARS_SET = INSTANCE.create("cobbledollars.set", PermissionLevel.CHEAT_COMMANDS_AND_COMMAND_BLOCKS);
/*    */   
/*    */   @NotNull
/*    */   public final Permission getCOBBLE_DOLLARS_SET() {
/* 15 */     return COBBLE_DOLLARS_SET;
/*    */   }
/*    */   
/*    */   @NotNull
/* 17 */   private static final Permission COBBLE_DOLLARS_RELOAD = INSTANCE.create("reload", PermissionLevel.CHEAT_COMMANDS_AND_COMMAND_BLOCKS);
/*    */   
/*    */   @NotNull
/*    */   public final Permission getCOBBLE_DOLLARS_RELOAD() {
/* 17 */     return COBBLE_DOLLARS_RELOAD;
/*    */   }
/*    */   
/*    */   @NotNull
/* 18 */   private static final Permission COBBLE_DOLLARS_LEADERBOARD = INSTANCE.create("leaderboard", PermissionLevel.NONE);
/*    */   
/*    */   @NotNull
/*    */   public final Permission getCOBBLE_DOLLARS_LEADERBOARD() {
/* 18 */     return COBBLE_DOLLARS_LEADERBOARD;
/*    */   }
/*    */   
/*    */   @NotNull
/* 19 */   private static final Permission COBBLE_DOLLARS_LEADERBOARD_UPDATE = INSTANCE.create("leaderboard.update", PermissionLevel.CHEAT_COMMANDS_AND_COMMAND_BLOCKS);
/*    */   
/*    */   @NotNull
/*    */   private static final String COBBLE_MERCHANT_BASE = "cobblemerchant";
/*    */   
/*    */   @NotNull
/*    */   public final Permission getCOBBLE_DOLLARS_LEADERBOARD_UPDATE() {
/* 19 */     return COBBLE_DOLLARS_LEADERBOARD_UPDATE;
/*    */   }
/*    */   
/*    */   @NotNull
/* 22 */   private static final Permission COBBLE_MERCHANT = INSTANCE.create("cobblemerchant", PermissionLevel.NONE);
/*    */   
/*    */   @NotNull
/*    */   public final Permission getCOBBLE_MERCHANT() {
/* 22 */     return COBBLE_MERCHANT;
/*    */   }
/*    */   
/*    */   @NotNull
/* 23 */   private static final Permission COBBLE_MERCHANT_EDIT = INSTANCE.create("cobblemerchant.edit", PermissionLevel.CHEAT_COMMANDS_AND_COMMAND_BLOCKS);
/*    */   
/*    */   @NotNull
/*    */   private static final String COBBLE_MERCHANT_OPEN_BASE = "cobblemerchant.open";
/*    */   
/*    */   @NotNull
/*    */   public final Permission getCOBBLE_MERCHANT_EDIT() {
/* 23 */     return COBBLE_MERCHANT_EDIT;
/*    */   }
/*    */   
/*    */   @NotNull
/* 26 */   private static final Permission COBBLE_MERCHANT_OPEN = INSTANCE.create("cobblemerchant.open", PermissionLevel.CHEAT_COMMANDS_AND_COMMAND_BLOCKS);
/*    */   
/*    */   @NotNull
/*    */   public final Permission getCOBBLE_MERCHANT_OPEN() {
/* 26 */     return COBBLE_MERCHANT_OPEN;
/*    */   }
/*    */   
/*    */   @NotNull
/* 27 */   private static final Permission COBBLE_MERCHANT_OPEN_SHOP = INSTANCE.create("cobblemerchant.open.shop", PermissionLevel.CHEAT_COMMANDS_AND_COMMAND_BLOCKS);
/*    */   
/*    */   @NotNull
/*    */   public final Permission getCOBBLE_MERCHANT_OPEN_SHOP() {
/* 27 */     return COBBLE_MERCHANT_OPEN_SHOP;
/*    */   }
/*    */   
/*    */   @NotNull
/* 28 */   private static final Permission COBBLE_MERCHANT_OPEN_BANK = INSTANCE.create("cobblemerchant.open.bank", PermissionLevel.CHEAT_COMMANDS_AND_COMMAND_BLOCKS);
/*    */   
/*    */   @NotNull
/*    */   public final Permission getCOBBLE_MERCHANT_OPEN_BANK() {
/* 28 */     return COBBLE_MERCHANT_OPEN_BANK;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Iterable<Permission> all() {
/* 30 */     return permissions;
/*    */   }
/*    */   
/*    */   private final Permission create(String node, PermissionLevel level) {
/* 33 */     CobbleDollarsPermission cobbleDollarsPermission1 = new CobbleDollarsPermission(node, level), $this$create_u24lambda_u240 = cobbleDollarsPermission1;
/* 36 */     int $i$a$-apply-CobbleDollarsPermissions$create$1 = 0;
/*    */     permissions.add($this$create_u24lambda_u240);
/*    */     return cobbleDollarsPermission1;
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\command\permission\CobbleDollarsPermissions.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */