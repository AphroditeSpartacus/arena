import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-2-20
 * Time: PM5:01
 */

public class P129A {
  public static void main(String[] args) {
    new P129A().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int even = 0, odd = 0, sum = 0;
    for (int i = 0; i < n; i++) {
      int x = in.nextInt();
      sum += x;
      if (x % 2 == 0) {
        even++;
      } else {
        odd++;
      }
    }

    System.out.println(sum % 2 == 0 ? even : odd);
  }
}