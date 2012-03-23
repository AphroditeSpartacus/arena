import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-2-21
 * Time: PM4:57
 */

public class P125A {
  public static void main(String[] args) {
    new P125A().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    int inch = Math.round((float)x / 3);
    System.out.println(inch / 12 + " " + inch % 12);
  }
}