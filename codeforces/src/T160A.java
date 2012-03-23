import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-6
 * Time: PM11:03
 */

public class T160A {
  public static void main(String[] args) {
    new T160A().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Integer[] a = new Integer[n];
    int sum = 0;
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
      sum += a[i];
    }
    Arrays.sort(a, Collections.reverseOrder());
    int cnt = 0;
    for (int i = 0; i < a.length; i++) {
      cnt += a[i];
      if (cnt > sum - cnt) {
        System.out.println(i + 1);
        break;
      }
    }
  }
}