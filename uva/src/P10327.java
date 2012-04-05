import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-29
 * Time: PM9:27
 */

public class P10327 {
  public static void main(String[] args) {
    new P10327().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      int n = in.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = in.nextInt();
      }
      int cnt = 0;
      for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
          if (a[i] > a[j]) {
            cnt++;
          }
        }
      }
      System.out.println("Minimum exchange operations : " + cnt);
    }
  }
}