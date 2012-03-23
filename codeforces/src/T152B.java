import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-2-21
 * Time: AM12:11
 */

public class T152B {
  public static void main(String[] args) {
    new T152B().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), m = in.nextInt(), x = in.nextInt(), y = in.nextInt();
    int k = in.nextInt();
    long res = 0;
    for (int i = 0; i < k; i++) {
      int dx = in.nextInt(), dy = in.nextInt();
      int t = check(x, y, dx, dy, n, m);
//      System.out.println(t);
      res += t;
      x += dx * t;
      y += dy * t;
//      System.out.println(x + " " + y);
    }
    System.out.println(res);
  }

  int check(int x, int y, int dx, int dy, int n, int m) {
    int p = 0, q = 0;
    if (dx > 0) {
      p = (n - x) / dx;
    } else if (dx < 0) {
      p = (x - 1) / -dx;
    } else {
      p = Integer.MAX_VALUE;
    }
    if (dy > 0) {
      q = (m - y) / dy;
    } else if (dy < 0) {
      q = (y - 1) / -dy;
    } else {
      q = Integer.MAX_VALUE;
    }
    return Math.min(p, q);
  }
}