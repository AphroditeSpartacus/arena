import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-12
 * Time: PM2:46
 */

public class P105 {
  public static void main(String[] args) {
    new P105().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    long n = in.nextLong();
    System.out.println(n * 2 / 3);
  }
}