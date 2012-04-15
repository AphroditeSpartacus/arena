import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-13
 * Time: PM9:45
 */

public class StoreCredit {
  public static void main(String[] args) {
    new StoreCredit().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    int[] a = new int[2005];
    int[] b = new int[1005];
    out:
    for (int t = 0; t < test; t++) {
      int c = in.nextInt();
      int l = in.nextInt();
      Arrays.fill(b, 0);
      for (int i = 1; i <= l; i++) {
        a[i] = in.nextInt();
        b[a[i]] = i;
      }
      for (int i = 1; i <= l; i++) {
        int k = c - a[i];
        if (k >= 0) {
          int idx = b[c - a[i]];
          if (idx != i && idx != 0) {
            System.out.println("Case #" + (t + 1) + ": " + i + " " + idx);
            continue out;
          }
        }
      }
    }
  }
}