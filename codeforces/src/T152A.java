import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-2-21
 * Time: AM12:02
 */

public class T152A {
  public static void main(String[] args) {
    new T152A().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), m = in.nextInt();
    int[][] a = new int[n][m];
    for (int i = 0; i < n; i++) {
      String s = in.next();
      for (int j = 0; j < m; j++) {
        int x = s.charAt(j) - '0';
        a[i][j] = x;
      }
    }
    int[] best = new int[m];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        best[i] = Math.max(best[i], a[j][i]);
      }
    }
    int res = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (a[i][j] == best[j]) {
          res++;
          break;
        }
      }
    }
    System.out.println(res);
  }
}