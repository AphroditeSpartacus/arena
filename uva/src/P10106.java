import java.math.BigInteger;
import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-18
 * Time: PM6:01
 */

public class P10106 {
  public static void main(String[] args) {
    new P10106().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      System.out.println(new BigInteger(in.next()).multiply(new BigInteger(in.next())));
    }
  }
}