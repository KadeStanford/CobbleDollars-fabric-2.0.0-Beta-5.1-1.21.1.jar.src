/*    */ package fr.harmex.cobbledollars.common.command.permission;
/*    */ 
/*    */ import com.cobblemon.mod.common.api.permission.Permission;
/*    */ import com.cobblemon.mod.common.api.permission.PermissionLevel;
/*    */ import fr.harmex.cobbledollars.common.utils.MiscUtilsKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_2960;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\020\016\n\000\n\002\030\002\n\002\b\t\n\002\020\000\n\000\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\006\n\002\030\002\n\002\b\007\b\b\030\0002\0020\001B\027\022\006\020\003\032\0020\002\022\006\020\005\032\0020\004¢\006\004\b\006\020\007J\020\020\b\032\0020\002HÂ\003¢\006\004\b\b\020\tJ\020\020\n\032\0020\004HÆ\003¢\006\004\b\n\020\013J$\020\f\032\0020\0002\b\b\002\020\003\032\0020\0022\b\b\002\020\005\032\0020\004HÆ\001¢\006\004\b\f\020\rJ\032\020\021\032\0020\0202\b\020\017\032\004\030\0010\016HÖ\003¢\006\004\b\021\020\022J\020\020\024\032\0020\023HÖ\001¢\006\004\b\024\020\025J\020\020\026\032\0020\002HÖ\001¢\006\004\b\026\020\tR\024\020\003\032\0020\0028\002X\004¢\006\006\n\004\b\003\020\027R\032\020\005\032\0020\0048\026X\004¢\006\f\n\004\b\005\020\030\032\004\b\031\020\013R\032\020\033\032\0020\0328\026X\004¢\006\f\n\004\b\033\020\034\032\004\b\035\020\036R\032\020\037\032\0020\0028\026X\004¢\006\f\n\004\b\037\020\027\032\004\b \020\t¨\006!"}, d2 = {"Lfr/harmex/cobbledollars/common/command/permission/CobbleDollarsPermission;", "Lcom/cobblemon/mod/common/api/permission/Permission;", "", "node", "Lcom/cobblemon/mod/common/api/permission/PermissionLevel;", "level", "<init>", "(Ljava/lang/String;Lcom/cobblemon/mod/common/api/permission/PermissionLevel;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/cobblemon/mod/common/api/permission/PermissionLevel;", "copy", "(Ljava/lang/String;Lcom/cobblemon/mod/common/api/permission/PermissionLevel;)Lfr/harmex/cobbledollars/common/command/permission/CobbleDollarsPermission;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "Lcom/cobblemon/mod/common/api/permission/PermissionLevel;", "getLevel", "Lnet/minecraft/class_2960;", "identifier", "Lnet/minecraft/class_2960;", "getIdentifier", "()Lnet/minecraft/class_2960;", "literal", "getLiteral", "common"})
/*    */ public final class CobbleDollarsPermission implements Permission {
/*    */   @NotNull
/*    */   private final String node;
/*    */   
/*    */   @NotNull
/*    */   private final PermissionLevel level;
/*    */   
/*    */   @NotNull
/*    */   private final class_2960 identifier;
/*    */   
/*    */   @NotNull
/*    */   private final String literal;
/*    */   
/*    */   public CobbleDollarsPermission(@NotNull String node, @NotNull PermissionLevel level) {
/*  9 */     this.node = node;
/* 10 */     this.level = level;
/* 12 */     this.identifier = MiscUtilsKt.cobbleDollarsResource(this.node);
/* 13 */     this.literal = "cobbledollars." + this.node;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public PermissionLevel getLevel() {
/*    */     return this.level;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public class_2960 getIdentifier() {
/*    */     return this.identifier;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String getLiteral() {
/* 13 */     return this.literal;
/*    */   }
/*    */   
/*    */   private final String component1() {
/*    */     return this.node;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final PermissionLevel component2() {
/*    */     return this.level;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CobbleDollarsPermission copy(@NotNull String node, @NotNull PermissionLevel level) {
/*    */     Intrinsics.checkNotNullParameter(node, "node");
/*    */     Intrinsics.checkNotNullParameter(level, "level");
/*    */     return new CobbleDollarsPermission(node, level);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "CobbleDollarsPermission(node=" + this.node + ", level=" + this.level + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.node.hashCode();
/*    */     return result * 31 + this.level.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof CobbleDollarsPermission))
/*    */       return false; 
/*    */     CobbleDollarsPermission cobbleDollarsPermission = (CobbleDollarsPermission)other;
/*    */     return !Intrinsics.areEqual(this.node, cobbleDollarsPermission.node) ? false : (!(this.level != cobbleDollarsPermission.level));
/*    */   }
/*    */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\command\permission\CobbleDollarsPermission.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */