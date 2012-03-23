import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-17
 * Time: PM3:37
 */

public class P10300 {
  public static void main(String[] args) {
    new P10300().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    for (int t = 0; t < test; t++) {
      int n = in.nextInt();
      long sum = 0;
      for (int i = 0; i < n; i++) {
        long a = in.nextLong(), b = in.nextLong(), c = in.nextLong();
        sum += a * c;
      }
      System.out.println(sum);
    }
  }
}