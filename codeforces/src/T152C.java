import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-2-21
 * Time: AM12:33
 */

public class T152C {
  public static void main(String[] args) {
    new T152C().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), m = in.nextInt();
    String[] a = new String[n];
    for (int i = 0; i < n; i++) {
      a[i] = in.next();
    }
    long res = 1;
    for (int i = 0; i < m; i++) {
      Set<Character> set = new HashSet<Character>();
      for (int j = 0; j < n; j++) {
        set.add(a[j].charAt(i));
      }
      res = res * set.size() % 1000000007;
    }
    System.out.println(res);
  }
}