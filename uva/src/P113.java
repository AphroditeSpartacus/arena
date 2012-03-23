import java.math.BigInteger;
import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-21
 * Time: PM10:20
 */

public class P113 {
  public static void main(String[] args) {
    new P113().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      int n = in.nextInt();
      BigInteger p = new BigInteger(in.next());
      BigInteger low = BigInteger.ZERO, high = p.add(BigInteger.ONE);
      BigInteger two = BigInteger.ONE.add(BigInteger.ONE);
      while (low.compareTo(high) < 0) {
        BigInteger mid = low.add(high).divide(two);
        BigInteger res = mid.pow(n);
        if (res.equals(p)) {
          System.out.println(mid);
          break;
        } else if (res.compareTo(p) < 0) {
          low = mid;
        } else {
          high = mid;
        }
      }
    }
  }
}