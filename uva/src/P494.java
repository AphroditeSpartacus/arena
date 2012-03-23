import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-17
 * Time: PM11:20
 */

public class P494 {
  public static void main(String[] args) {
    new P494().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      String s = in.nextLine();
      String[] a = s.split("[^a-zA-Z]+");
//      System.out.println(Arrays.toString(a));
      int cnt = 0;
      for (int i = 0; i < a.length; i++) {
        if (!a[i].isEmpty()) {
          cnt++;
        }
      }
      System.out.println(cnt);
    }
  }
}