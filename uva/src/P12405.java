import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-31
 * Time: PM8:46
 */

public class P12405 {
  public static void main(String[] args) {
    new P12405().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    for (int t = 0; t < test; t++) {
      int n = in.nextInt();
      int[] a = new int[n + 5];
      String s = in.next();
      int res = 0;
      int idx = 0;
      while (idx < n) {
        if (a[idx] == 0 && s.charAt(idx) == '.') {
          res++;
          a[idx] = a[idx + 1] = a[idx + 2] = 1;
        }
        idx++;
      }
      System.out.println("Case " + (t + 1) + ": " + res);
    }
  }
}