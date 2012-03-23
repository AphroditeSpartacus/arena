import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-2-21
 * Time: PM5:57
 */

public class P81A {
  public static void main(String[] args) {
    new P81A().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (sb.length() == 0 || sb.charAt(sb.length() - 1) != s.charAt(i)) {
        sb.append(s.charAt(i));
      } else {
        sb.deleteCharAt(sb.length() - 1);
      }
    }
    System.out.println(sb.toString());
  }
}