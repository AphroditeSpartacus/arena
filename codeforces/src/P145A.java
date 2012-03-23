import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-2-21
 * Time: PM9:17
 */

public class P145A {
  public static void main(String[] args) {
    new P145A().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    String a = in.next(), b = in.next();
    int a4 = 0, a7 = 0, b4 = 0, b7 = 0;
    int n = a.length();
    for (int i = 0; i < n; i++) {
      if (a.charAt(i) == '4') {
        a4++;
      }
      if (b.charAt(i) == '4') {
        b4++;
      }
    }
    a7 = n - a4;
    b7 = n - b4;
    boolean c4, c7;
    int cnt = Math.min(Math.abs(a4 - b4), Math.abs(a7 - b7));
    int res = cnt;
    int diff = 0;
    for (int i = 0; i < n; i++) {
      if (a.charAt(i) != b.charAt(i)) {
        if (cnt > 0) {
          cnt--;
        } else {
          diff++;
        }
      }
    }
    res += diff / 2;
    System.out.println(res);
  }
}