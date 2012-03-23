import java.util.Arrays;
import java.util.Scanner;

/**
 * User: Aphrodite
 * Date: 12-3-6
 * Time: PM11:19
 */

public class T160C_2 {
  public static void main(String[] args) {
    new T160C_2().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    long n = in.nextLong(), k = in.nextLong();
    int[] a = new int[(int)n];
    for (int i = 0; i < a.length; i++) {
      a[i] = in.nextInt();
    }
    Arrays.sort(a);
    int cnt = 0;
    int[] b = new int[(int) n], c = new int[(int) n];
    for (int i = 0; i < a.length; i++) {
      if (i == 0 || a[i] != a[i - 1]) {
        b[cnt] = a[i];
        c[cnt] = 1;
        cnt++;
      } else {
        c[cnt - 1]++;
      }
    }
//    System.out.println(Arrays.toString(b));
//    System.out.println(Arrays.toString(c));
    long sum = 0;
    int idx1 = 0;
    while (idx1 < cnt && sum + c[idx1] * n < k) {
      sum += c[idx1] * n;
      idx1++;
    }
    int idx2 = 0;
    while (idx2 < cnt && sum + c[idx1] * c[idx2] < k) {
      sum += c[idx1] * c[idx2];
      idx2++;
    }
    System.out.println(b[idx1] + " " + b[idx2]);
  }
}