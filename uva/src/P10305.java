import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-5-11
 * Time: PM11:29
 */

public class P10305 {
  public static void main(String[] args) {
    new P10305().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    while (true) {
      int n = in.nextInt();
      int m = in.nextInt();
      if (n == 0) {
        break;
      }
      int[][] a = new int[n + 1][n + 1];
      int[] pre = new int[n + 1];
      for (int i = 0; i < m; i++) {
        int x = in.nextInt(), y = in.nextInt();
        if (a[x][y] == 0) {
          a[x][y] = 1;
          pre[y]++;
        }
      }
      List<Integer> list = new ArrayList<Integer>();
      boolean[] check = new boolean[n + 1];
      while (list.size() < n) {
        for (int i = 1; i <= n; i++) {
          if (check[i] == false && pre[i] == 0) {
            list.add(i);
            check[i] = true;
            for (int j = 1; j <= n; j++) {
              if (a[i][j] == 1) {
                pre[j]--;
              }
            }
            break;
          }
        }
      }
//      System.out.println(list);
      for (int i = 0; i < list.size(); i++) {
        if (i > 0) {
          System.out.print(" ");
        }
        System.out.print(list.get(i));
      }
      System.out.println();
    }
  }
}