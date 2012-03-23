import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-17
 * Time: PM3:47
 */

public class P458 {
  public static void main(String[] args) {
    new P458().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      String s = in.nextLine();
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
        sb.append((char)(s.charAt(i) - 7));
      }
      System.out.println(sb.toString());
    }
  }
}