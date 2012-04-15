import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-15
 * Time: AM11:38
 */

public class Milkshakes {
  public static void main(String[] args) {
    new Milkshakes().solve();
  }

  // just for small
  public void solve() {
    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    for (int t = 1; t <= test; t++) {
      int n = in.nextInt();
      int m = in.nextInt();
      int[][] a = new int[m][n];
      for (int i = 0; i < m; i++) {
        int k = in.nextInt();
        for (int j = 0; j < k; j++) {
          int x = in.nextInt(), y = in.nextInt();
          if (y == 1) {
            a[i][x - 1] = 2;
          } else {
            a[i][x - 1] = 1;
          }
        }
      }
      int res = 0;
      int resBit = 0;
      boolean found = false;
      for (int i = 0; i < (1 << n); i++) {
        if (check(a, i)) {
          if (!found) {
            found = true;
            res = i;
            resBit = Integer.bitCount(i);
          } else {
            if (Integer.bitCount(i) < resBit) {
              res = i;
              resBit = Integer.bitCount(i);
            }
          }
        }
      }
      System.out.print("Case #" + t + ":");
      if (found) {
        int[] tmp = new int[n];
        int idx = 0;
        while (res > 0) {
          if (res % 2 == 1) {
            tmp[idx] = 1;
          }
          res /= 2;
          idx++;
        }
        for (int i = 0; i < tmp.length; i++) {
          System.out.print(" " + tmp[i]);
        }
      } else {
        System.out.print(" IMPOSSIBLE");
      }
      System.out.println();
    }
  }

  private boolean check(int[][] a, int i) {
    int n = a[0].length;
    int[] tmp = new int[n];
    for (int j = 0; j < n; j++) {
      if (((1 << j) & i) != 0) {
        tmp[j] = 1;
      }
    }
    for (int j = 0; j < a.length; j++) {
      boolean ok = false;
      for (int k = 0; k < a[j].length; k++) {
        if (a[j][k] == 1 && tmp[k] == 0) {
          ok = true;
        } else if (a[j][k] == 2 && tmp[k] == 1) {
          ok = true;
        }
      }
      if (!ok) {
        return false;
      }
    }
    return true;
  }
}