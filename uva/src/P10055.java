import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-17
 * Time: PM2:49
 */

public class P10055 {
  public static void main(String[] args) {
    new P10055().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      System.out.println(Math.abs(in.nextLong() - in.nextLong()));
    }
  }
}