/*   */ package fr.harmex.cobbledollars.common.world.cobbledollars;
/*   */ 
/*   */ import java.math.BigInteger;
/*   */ import kotlin.Metadata;
/*   */ import kotlin.jvm.internal.Intrinsics;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ import org.jetbrains.annotations.Nullable;
/*   */ 
/*   */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\020\016\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\b\b\b\030\0002\0020\001B\027\022\006\020\003\032\0020\002\022\006\020\005\032\0020\004¢\006\004\b\006\020\007J\020\020\b\032\0020\002HÆ\003¢\006\004\b\b\020\tJ\020\020\n\032\0020\004HÆ\003¢\006\004\b\n\020\013J$\020\f\032\0020\0002\b\b\002\020\003\032\0020\0022\b\b\002\020\005\032\0020\004HÆ\001¢\006\004\b\f\020\rJ\032\020\020\032\0020\0172\b\020\016\032\004\030\0010\001HÖ\003¢\006\004\b\020\020\021J\020\020\023\032\0020\022HÖ\001¢\006\004\b\023\020\024J\020\020\025\032\0020\002HÖ\001¢\006\004\b\025\020\tR\027\020\003\032\0020\0028\006¢\006\f\n\004\b\003\020\026\032\004\b\027\020\tR\027\020\005\032\0020\0048\006¢\006\f\n\004\b\005\020\030\032\004\b\031\020\013¨\006\032"}, d2 = {"Lfr/harmex/cobbledollars/common/world/cobbledollars/CobbleDollarsAccount;", "", "", "playerName", "Ljava/math/BigInteger;", "balance", "<init>", "(Ljava/lang/String;Ljava/math/BigInteger;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/math/BigInteger;", "copy", "(Ljava/lang/String;Ljava/math/BigInteger;)Lfr/harmex/cobbledollars/common/world/cobbledollars/CobbleDollarsAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPlayerName", "Ljava/math/BigInteger;", "getBalance", "common"})
/*   */ public final class CobbleDollarsAccount {
/*   */   @NotNull
/*   */   private final String playerName;
/*   */   
/*   */   @NotNull
/*   */   private final BigInteger balance;
/*   */   
/*   */   public CobbleDollarsAccount(@NotNull String playerName, @NotNull BigInteger balance) {
/* 5 */     this.playerName = playerName;
/* 5 */     this.balance = balance;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String getPlayerName() {
/* 5 */     return this.playerName;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final BigInteger getBalance() {
/* 5 */     return this.balance;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String component1() {
/*   */     return this.playerName;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final BigInteger component2() {
/*   */     return this.balance;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final CobbleDollarsAccount copy(@NotNull String playerName, @NotNull BigInteger balance) {
/*   */     Intrinsics.checkNotNullParameter(playerName, "playerName");
/*   */     Intrinsics.checkNotNullParameter(balance, "balance");
/*   */     return new CobbleDollarsAccount(playerName, balance);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "CobbleDollarsAccount(playerName=" + this.playerName + ", balance=" + this.balance + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = this.playerName.hashCode();
/*   */     return result * 31 + this.balance.hashCode();
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof CobbleDollarsAccount))
/*   */       return false; 
/*   */     CobbleDollarsAccount cobbleDollarsAccount = (CobbleDollarsAccount)other;
/*   */     return !Intrinsics.areEqual(this.playerName, cobbleDollarsAccount.playerName) ? false : (!!Intrinsics.areEqual(this.balance, cobbleDollarsAccount.balance));
/*   */   }
/*   */ }


/* Location:              P:\Arclight\mods\CobbleDollars-fabric-2.0.0+Beta-5.1+1.21.1.jar!\fr\harmex\cobbledollars\common\world\cobbledollars\CobbleDollarsAccount.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */