import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-15
 * Time: AM11:16
 */

public class MinimumScalarProduct {
  public static void main(String[] args) {
    new MinimumScalarProduct().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    for (int t = 1; t <= test; t++) {
      int n = in.nextInt();
      Long[] a = new Long[n];
      Long[] b = new Long[n];
      for (int i = 0; i < n; i++) {
        a[i] = in.nextLong();
      }
      for (int i = 0; i < n; i++) {
        b[i] = in.nextLong();
      }
      Arrays.sort(a);
      Arrays.sort(b, Collections.reverseOrder());
      long sum = 0;
      for (int i = 0; i < n; i++) {
        sum += a[i] * b[i];
      }
      System.out.println("Case #" + t + ": " + sum);
    }
  }
}