import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-17
 * Time: PM3:23
 */

public class P10071 {
  public static void main(String[] args) {
    new P10071().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      int v = in.nextInt(), t = in.nextInt();
      System.out.println(v * t * 2);
    }
  }
}