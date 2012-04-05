import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-24
 * Time: PM1:20
 */

public class P572 {
  public static void main(String[] args) {
    new P572().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    while (true) {
      int m = in.nextInt(), n = in.nextInt();
      if (m == 0) {
        break;
      }
      String[] g = new String[m];
      for (int i = 0; i < m; i++) {
        g[i] = in.next();
      }
      int[][] a = new int[m][n];
      int res = 0;
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          if (a[i][j] == 0 && g[i].charAt(j) == '@') {
            res++;
            dfs(g, a, i, j, res);
          }
        }
      }
      System.out.println(res);
    }
  }

  void dfs(String[] g, int[][] a, int x, int y, int res) {
    a[x][y] = res;
    for (int i = -1; i <= 1; i++) {
      for (int j = -1; j <= 1; j++) {
        int nextX = x + i, nextY = y + j;
        if (nextX >= 0 && nextX < a.length && nextY >= 0 && nextY < a[0].length &&
            a[nextX][nextY] == 0 && g[nextX].charAt(nextY) == '@') {
          dfs(g, a, nextX, nextY, res);
        }
      }
    }
  }
}