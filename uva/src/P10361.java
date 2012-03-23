import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-18
 * Time: PM4:59
 */

public class P10361 {
  public static void main(String[] args) {
    new P10361().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    int test = Integer.parseInt(s);
    for (int t = 0; t < test; t++) {
      String a = in.nextLine(), b = in.nextLine();
      a = a + "$";
      String[] p = a.split("[<>]");
      p[4] = p[4].substring(0, p[4].length() - 1);
      for (int i = 0; i < p.length; i++) {
        System.out.print(p[i]);
      }
      System.out.println();
//      System.out.println(Arrays.toString(p));
      System.out.print(b.substring(0, b.length() - 3));
      System.out.print(p[3] + p[2] + p[1] + p[4]);
      System.out.println();
    }
  }
}