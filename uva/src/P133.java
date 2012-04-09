import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-5
 * Time: PM11:58
 */

public class P133 {
  public static void main(String[] args) {
    new P133().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    while (true) {
      int n = in.nextInt(), k = in.nextInt(), m = in.nextInt();
      if (n == 0) {
        break;
      }
//      k %= n;
//      m %= n;
      int[] a = new int[n];
      for (int i = 0; i < a.length; i++) {
        a[i] = i + 1;
      }
      int p = 0, q = n - 1;
      int idx = 0;
      while (n > 0) {
        if (idx > 0) {
          System.out.print(",");
        }
        idx++;
        int x = k, y = m;
//        int x = k % n, y = m % n;
//        if (x == 0) {
//          x = n;
//        }
//        if (y == 0) {
//          y = n;
//        }
        while (x > 1) {
          if (a[p] != 0) {
            x--;
          }
          do {
            p = (p + 1) % a.length;
          } while (a[p] == 0);
        }
        while (y > 1) {
          if (a[q] != 0) {
            y--;
          }
          do {
            q = (q + a.length - 1) % a.length;
          } while (a[q] == 0);
        }
        if (p == q) {
          n--;
          System.out.printf("%3d", a[p]);
          a[p] = 0;
        } else {
          n -= 2;
          System.out.printf("%3d%3d", a[p], a[q]);
          a[p] = a[q] = 0;
        }
        if (n > 0) {
          do {
            p = (p + 1) % a.length;
          } while (a[p] == 0);
          do {
            q = (q + a.length - 1) % a.length;
          } while (a[q] == 0);
        }
      }
      System.out.println();
    }
  }
}