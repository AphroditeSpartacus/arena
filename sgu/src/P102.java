import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-7
 * Time: PM3:00
 */

public class P102 {
  public static void main(String[] args) {
    new P102().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int res = 0;
    for (int i = 1; i <= n; i++) {
      if (gcd(i, n) == 1) {
        res++;
      }
    }
    System.out.println(res);
  }

  int gcd(int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return gcd(b, a % b);
    }
  }
}