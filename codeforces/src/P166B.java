import java.awt.*;
import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-24
 * Time: PM2:12
 */

public class P166B {
  public static void main(String[] args) {
    new P166B().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    Point[] a = new Point[in.nextInt()];
    for (int i = 0; i < a.length; i++) {
      a[i] = new Point();
      a[i].x = in.nextInt();
      a[i].y = in.nextInt();
    }
    Point[] b = new Point[in.nextInt()];
    for (int i = 0; i < b.length; i++) {
      b[i] = new Point();
      b[i].x = in.nextInt();
      b[i].y = in.nextInt();
    }
    for (int i = 0; i < a.length; i++) {
      int x1 = a[i].x, y1 = a[i].y;
      int j = i == 0 ? a.length - 1 : i - 1;
      int x2 = a[j].x, y2 = a[j].y;
      int dir = crossMulti(x1, y1, x2, y2, b[0].x, b[0].y);
      if (dir == 0) {
        System.out.println("NO");
        System.exit(0);
      }
      for (int k = 1; k < b.length; k++) {
        int px = b[k].x, py = b[k].y;
        int dir2 = crossMulti(x1, y1, x2, y2, px, py);
        if (dir2 == 0 || dir2 != dir) {
          System.out.println("NO");
          System.exit(0);
        }
      }
    }
    System.out.println("YES");
  }

  int crossMulti(int x1, int y1, int x2, int y2, int px, int py) {
    int ux = x1 - x2, uy = y1 - y2, vx = x1 - px, vy = y1 - py;
    int aux = ux * vy - vx * uy;
    int res = aux > 0 ? 1 : aux == 0 ? 0 : -1;
    return res;
  }
}