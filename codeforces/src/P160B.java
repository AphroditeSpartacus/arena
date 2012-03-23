import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-6
 * Time: PM11:11
 */

public class P160B {
  public static void main(String[] args) {
    new P160B().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    char[] a = in.next().toCharArray();
    char[] x = Arrays.copyOfRange(a, 0, n), y = Arrays.copyOfRange(a, n, 2 * n);
    Arrays.sort(x);
    Arrays.sort(y);
    if (check(x, y) || check(y, x)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

  boolean check(char[] a, char[] b) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] >= b[i]) {
        return false;
      }
    }
    return true;
  }
}