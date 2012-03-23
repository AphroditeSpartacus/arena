import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-6
 * Time: PM11:19
 */

public class T160C {
  public static void main(String[] args) {
    new T160C().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    long k = in.nextLong() - 1;
    int[] a = new int[n];
    for (int i = 0; i < a.length; i++) {
      a[i] = in.nextInt();
    }
    Arrays.sort(a);
    int idx1 = (int) (k / n);
//    System.out.println(a[idx1]);
    int cnt = 0;
    for (int i = idx1; i < n && a[i] == a[idx1]; i++) {
      cnt++;
    }
    int idx2 = (int) ((k - idx1 * n) / cnt);
//    System.out.println(idx1 + " " + idx2);
    System.out.println(a[idx1] + " " + a[idx2]);
  }
}