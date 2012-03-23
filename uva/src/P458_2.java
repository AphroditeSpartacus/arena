import java.util.Scanner;

/**
 * User: Aphrodite
 * Date: 12-3-17
 * Time: PM3:47
 */

public class P458_2 {
  public static void main(String[] args) {
    new P458_2().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    in.useDelimiter("~~~");
    String s = in.next();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      sb.append(s.charAt(i) == '\n' ? '\n' : (char) (s.charAt(i) - 7));
    }
    System.out.println(sb.toString());
  }
}