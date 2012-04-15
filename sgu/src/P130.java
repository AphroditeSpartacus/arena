import java.math.BigInteger;
import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-12
 * Time: PM3:34
 */

public class P130 {
  public static void main(String[] args) {
    new P130().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    BigInteger[] dp = new BigInteger[31];
    for (int i = 0; i < dp.length; i++) {
      dp[i] = BigInteger.ZERO;
    }
    dp[0] = BigInteger.ONE;
    for (int i = 1; i < dp.length; i++) {
      for (int j = 0; j < i; j++) {
        dp[i] = dp[i].add(dp[j].multiply(dp[i - j - 1]));
      }
    }
//    System.out.println(Arrays.toString(dp));
    System.out.println(dp[n] + " " + (n + 1));
  }
}