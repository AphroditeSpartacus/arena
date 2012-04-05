import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-2
 * Time: PM10:14
 */

public class P10323 {
  public static void main(String[] args) {
    new P10323().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    long a[] = new long[16];
    a[0] = 1;
    for (int i = 1; i < a.length; i++) {
      a[i] = i * a[i - 1];
    }
//    System.out.println(Arrays.toString(a));
    while (in.hasNext()) {
      int n = in.nextInt();
      if (n < 0) {
        if (n % 2 == 0) {
          System.out.println("Underflow!");
        } else {
          System.out.println("Overflow!");
        }
        continue;
      }
      if (n >= 16 || a[n] > 6227020800L) {
        System.out.println("Overflow!");
      } else if (a[n] < 10000) {
        System.out.println("Underflow!");
      } else {
        System.out.println(a[n]);
      }
    }
  }
}