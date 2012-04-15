import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-13
 * Time: PM8:46
 */

public class P154 {
  public static void main(String[] args) {
    new P154().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    if (n == 0) {
      System.out.println(1);
      System.exit(0);
    }
    int low = 0, high = 5 * n;
    while (low + 1 < high) {
      int mid = low + (high - low) / 2;
      int cnt = countTailingZero(mid);
//      System.out.println(cnt);
      if (cnt >= n) {
        high = mid;
      } else if (cnt < n) {
        low = mid;
      }
    }
    if (countTailingZero(high) == n) {
      System.out.println(high);
    } else {
      System.out.println("No solution");
    }
  }

  int countTailingZero(int n) {
    int res = 0;
    while (n > 0) {
      res += n / 5;
      n /= 5;
    }
    return res;
  }
}