import java.math.BigInteger;
import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-8
 * Time: PM11:33
 */

public class NChooseR {
  public static void main(String[] args) {
    new NChooseR().solve();
  }

  public void solve() {
    int n = 1005;
    BigInteger[][] ncr = new BigInteger[n][n];
    for (int i = 0; i < ncr.length; i++) {
      for (int j = 0; j < ncr[i].length; j++) {
        ncr[i][j] = i < j ? BigInteger.ZERO : j == 0 ? BigInteger.ONE : ncr[i - 1][j - 1].add(ncr[i - 1][j]);
      }
    }
  }
}