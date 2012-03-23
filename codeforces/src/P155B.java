import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-2-25
 * Time: PM8:58
 */

public class P155B {
  public static void main(String[] args) {
    new P155B().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[][] a = new int[n][2];
    for (int i = 0; i < n; i++) {
      a[i][0] = in.nextInt();
      a[i][1] = in.nextInt();
    }
    Arrays.sort(a, new Comparator<int[]>() {
      @Override
      public int compare(int[] p, int[] q) {
        if (p[1] != q[1]) {
          return q[1] - p[1];
        } else {
          return q[0] - p[0];
        }
      }
    });
    int res = a[0][0], cnt = a[0][1], cur = 1;
    while (cur < n && cnt > 0) {
      res += a[cur][0];
      cnt += a[cur][1];
      cnt--;
      cur++;
    }
    System.out.println(res);
  }
}