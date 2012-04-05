import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-24
 * Time: PM1:41
 */

public class P166A {
  public static void main(String[] args) {
    new P166A().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), k = in.nextInt();
    int[][] a = new int[n][2];
    for (int i = 0; i < n; i++) {
      a[i][0] = in.nextInt();
      a[i][1] = in.nextInt();
    }
    Arrays.sort(a, new Comparator<int[]>() {
      @Override
      public int compare(int[] p, int[] q) {
        if (p[0] != q[0]) {
          return q[0] - p[0];
        } else {
          return p[1] - q[1];
        }
      }
    });
    int u = a[k - 1][0], v = a[k - 1][1];
    int res = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i][0] == u && a[i][1] == v) {
        res++;
      }
    }
    System.out.println(res);
  }
}