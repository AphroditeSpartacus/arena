import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-13
 * Time: PM10:06
 */

public class ReverseWords {
  public static void main(String[] args) {
    new ReverseWords().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    in.nextLine();
    for (int t = 1; t <= test; t++) {
      String[] a = in.nextLine().split(" ");
      System.out.print("Case #" + t + ":");
      for (int i = a.length - 1; i >= 0; i--) {
        System.out.print(" " + a[i]);
      }
      System.out.println();
    }
  }
}