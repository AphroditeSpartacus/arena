import java.math.BigInteger;
import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-31
 * Time: PM8:07
 */

public class P10198 {
  public static void main(String[] args) {
    new P10198().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = 1000;
    BigInteger [] dp = new BigInteger[n + 5];
    dp[1] = BigInteger.valueOf(2);
    dp[2] = BigInteger.valueOf(5);
    dp[3] = BigInteger.valueOf(13);
    for (int i = 4; i <= n; i++) {
      dp[i] = dp[i - 1].multiply(BigInteger.valueOf(2)).add(dp[i - 2]).add(dp[i - 3]);
    }
    while (in.hasNext()) {
      System.out.println(dp[in.nextInt()]);
    }
  }
}