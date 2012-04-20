import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-17
 * Time: PM9:26
 */

public class RopeIntranet {
  public static void main(String[] args) {
    new RopeIntranet().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    for (int t = 1; t <= test; t++) {
      int n = in.nextInt();
      int[][] a = new int[n][2];
      for (int i = 0; i < a.length; i++) {
        a[i][0] = in.nextInt();
        a[i][1] = in.nextInt();
      }
      Arrays.sort(a, new Comparator<int[]>() {
        @Override
        public int compare(int[] p, int[] q) {
          return p[0] - q[0];
        }
      });
      int res = 0;
      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < i; j++) {
          if (a[i][1] < a[j][1]) {
            res++;
          }
        }
      }
      System.out.println("Case #" + t + ": " + res);
    }
  }
}