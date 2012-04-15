import java.math.BigInteger;
import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-9
 * Time: PM9:51
 */

public class P123 {
  public static void main(String[] args) {
    new P123().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    BigInteger[] a = new BigInteger[50];
    a[0] = BigInteger.ZERO;
    a[1] = BigInteger.ONE;
    for (int i = 2; i < a.length; i++) {
      a[i] = a[i - 1].add(a[i - 2]);
    }
    BigInteger res = BigInteger.ZERO;
    for (int i = 1; i <= n; i++) {
      res = res.add(a[i]);
    }
    System.out.println(res);
  }
}