import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-22
 * Time: PM7:22
 */

public class P10110 {
  public static void main(String[] args) {
    new P10110().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    while (true) {
      long n = in.nextLong();
      if (n == 0) {
        break;
      }
      long x = (long) Math.sqrt(n);
      if (x * x == n) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
  }
}