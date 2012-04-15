import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-12
 * Time: PM3:12
 */

public class P135 {
  public static void main(String[] args) {
    new P135().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    long n = in.nextInt();
    System.out.println(n * (n + 1) / 2 + 1);
  }
}