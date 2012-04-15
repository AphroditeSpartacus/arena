import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-12
 * Time: PM11:33
 */

public class P184 {
  public static void main(String[] args) {
    new P184().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
    int x = in.nextInt(), y = in.nextInt(), z = in.nextInt();
    System.out.println(Math.min(a / x, Math.min(b / y, c / z)));
  }
}