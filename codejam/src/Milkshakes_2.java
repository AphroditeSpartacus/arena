import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-15
 * Time: AM11:38
 */

public class Milkshakes_2 {
  private int m;
  private int n;
  private int[][] a;
  private int[] b;
  private boolean[] malted;
  private boolean[] satisfy;

  public static void main(String[] args) {
    new Milkshakes_2().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    out:
    for (int t = 1; t <= test; t++) {
      System.out.print("Case #" + t + ":");
      n = in.nextInt();
      m = in.nextInt();
      a = new int[m][n];
      b = new int[m];
      Arrays.fill(b, -1);
      for (int i = 0; i < m; i++) {
        int k = in.nextInt();
        for (int j = 0; j < k; j++) {
          int x = in.nextInt(), y = in.nextInt();
          if (y == 1) {
            a[i][x - 1] = 2;
            b[i] = x - 1;
          } else {
            a[i][x - 1] = 1;
          }
        }
      }
      malted = new boolean[n];
      satisfy = new boolean[m];
      while (true) {
        int idx = check();
        if (idx == -1) {
          break;
        }
        if (b[idx] == -1 || malted[b[idx]]) {
          System.out.println(" IMPOSSIBLE");
          continue out;
        }
        malted[b[idx]] = true;
        continue;
      }
      for (int i = 0; i < n; i++) {
        System.out.print(" " + (malted[i] ? 1 : 0));
      }
      System.out.println();
    }
  }

  int check() {
    for (int i = 0; i < m; i++) {
      boolean ok = false;
      for (int j = 0; j < n; j++) {
        if ((a[i][j] == 1 && malted[j] == false) ||
            (a[i][j] == 2 && malted[j] == true)) {
          ok = true;
          break;
        }
      }
      if (!ok) {
        return i;
      }
    }
    return -1;
  }
}