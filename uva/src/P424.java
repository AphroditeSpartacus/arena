import java.math.BigInteger;
import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-18
 * Time: PM5:52
 */

public class P424 {
  public static void main(String[] args) {
    new P424().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    BigInteger sum = BigInteger.ZERO;
    while (true) {
      String s = in.next();
      if (s.equals("0")) {
        System.out.println(sum);
        break;
      }
      sum = sum.add(new BigInteger(s));
    }
  }
}