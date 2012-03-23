import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-2-25
 * Time: PM10:06
 */

public class P154A {
  public static void main(String[] args) {
    new P154A().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    int n = in.nextInt();
    int res = 0;
    int[] p = new int[2];
    for (int i = 0; i < n; i++) {
      String tmp = in.next();
      for (int j = 0; j < s.length(); j++) {
        if (s.charAt(j) == tmp.charAt(0)) {
          p[0]++;
        } else if (s.charAt(j) == tmp.charAt(1)) {
          p[1]++;
        } else {
          res += Math.min(p[0], p[1]);
          Arrays.fill(p, 0);
        }
      }
    }
    res += Math.min(p[0], p[1]);
    System.out.println(res);
  }
}