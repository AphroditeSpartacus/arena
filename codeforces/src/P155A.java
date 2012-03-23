import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-2-25
 * Time: AM11:00
 */

public class P155A {
  public static void main(String[] args) {
    new P155A().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int min = 0, max = 0;
    int res = 0;
    for (int i = 0; i < n; i++) {
      int x = in.nextInt();
      if (i > 0) {
        if (x > max) {
          res++;
          max = x;
        } else if (x < min) {
          res++;
          min = x;
        }
      } else {
        min = max = x;
      }
    }
    System.out.println(res);
  }
}