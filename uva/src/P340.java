import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-18
 * Time: PM7:03
 */

public class P340 {
  public static void main(String[] args) {
    new P340().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int idx = 1;
    while (true) {
      int n = in.nextInt();
      if (n == 0) {
        break;
      }
      System.out.println("Game " + idx++ + ":");
      int[] code = new int[n];
      for (int i = 0; i < n; i++) {
        code[i] = in.nextInt();
      }
      int[] a = new int[10];
      for (int i = 0; i < code.length; i++) {
        a[code[i]]++;
      }
      while (true) {
        int[] guess = new int[n];
        for (int i = 0; i < n; i++) {
          guess[i] = in.nextInt();
        }
        if (guess[0] == 0) {
          break;
        }
        int[] b = new int[10];
        for (int i = 0; i < guess.length; i++) {
          b[guess[i]]++;
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
          sum += Math.min(a[i], b[i]);
        }
        int strong = 0;
        for (int i = 0; i < n; i++) {
          if (code[i] == guess[i]) {
            strong++;
          }
        }
        System.out.println("    (" + strong + "," + (sum - strong) + ")");
      }
    }
  }
}