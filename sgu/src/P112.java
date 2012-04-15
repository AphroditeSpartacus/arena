import java.math.BigInteger;
import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-9
 * Time: PM9:59
 */

public class P112 {
  public static void main(String[] args) {
    new P112().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt(), b = in.nextInt();
    System.out.println(BigInteger.valueOf(a).pow(b).subtract(BigInteger.valueOf(b).pow(a)));
  }
}