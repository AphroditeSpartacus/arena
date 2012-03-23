import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-2-20
 * Time: AM10:47
 */

public class P134A {
  public static void main(String[] args) {
    new P134A().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    int sum = 0;
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
      sum += a[i];
    }
    if (sum % n == 0) {
      int[] res = new int[200005];
      int cnt = 0;
      for (int i = 0; i < a.length; i++) {
        if (a[i] == sum / n) {
          res[cnt++] = i + 1;
        }
      }
      System.out.println(cnt);
      for (int i = 0; i < cnt; i++) {
        System.out.print(res[i] + " ");
      }
      System.out.println();
    } else {
      System.out.println(0);
    }
  }
}