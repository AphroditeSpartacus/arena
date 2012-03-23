import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-2-26
 * Time: AM12:11
 */

public class P154B {
  public static void main(String[] args) {
    new P154B().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), m = in.nextInt();
    int[] a = new int[n + 1], b = new int[n + 1];
    for (int i = 0; i < m; i++) {
//      System.out.println(Arrays.toString(b));
      String s = in.next();
      int x = in.nextInt();
      if (s.equals("+")) {
        if (a[x] == 1) {
          System.out.println("Already on");
        } else {
          boolean ok = true;
          int res = 0;
          for (int j = 2; j * j <= x; j++) {
            if (x % j == 0) {
              if (b[j] > 0) {
                ok = false;
                res = b[j];
                break;
              }
              if (b[x / j] > 0) {
                ok = false;
                res = b[x / j];
                break;
              }
            }
          }
          if (x > 1 && b[x] != 0) {
            ok = false;
            res = b[x];
          }
          if (!ok) {
            System.out.println("Conflict with " + res);
          } else {
            System.out.println("Success");
            for (int j = 2; j * j <= x; j++) {
              if (x % j == 0) {
                b[j] = b[x / j] = x;
              }
            }
            if (x > 1) {
              b[x] = x;
            }
            a[x] = 1;
          }
        }
      } else {
        if (a[x] == 0) {
          System.out.println("Already off");
        } else {
          System.out.println("Success");
          for (int j = 2; j * j <= x; j++) {
            if (x % j == 0) {
              b[j] = b[x / j] = 0;
            }
          }
          if (x > 1) {
            b[x] = 0;
          }
          a[x] = 0;
        }
      }
    }
  }
}
