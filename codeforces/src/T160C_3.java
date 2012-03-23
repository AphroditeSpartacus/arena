import java.util.Arrays;
import java.util.Scanner;

/**
 * User: Aphrodite
 * Date: 12-3-6
 * Time: PM11:19
 */

public class T160C_3 {
  public static void main(String[] args) {
    new T160C_3().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    long n = in.nextLong(), k = in.nextLong();
    int[] a = new int[(int)n];
    for (int i = 0; i < a.length; i++) {
      a[i] = in.nextInt();
    }
    Arrays.sort(a);
    Integer[] b = new Integer[5];
    int x = 0;
    long sum = 0;
    while (x < a.length) {
      int y = x + 1;
      while (y < a.length && a[y] == a[x]) {
        y++;
      }
      int len = y - x;
      if (sum + len * n >= k) {
        for (int z = 0; z < a.length; z++) {
          if (sum + len >= k) {
            System.out.println(a[x] + " " + a[z]);
            System.exit(0);
          }
          sum += len;
        }
      } else {
        x = y;
        sum += len * n;
      }
    }
  }
}