import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-20
 * Time: PM7:32
 */

public class P299 {
  public static void main(String[] args) {
    new P299().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    for (int t = 0; t < test; t++) {
      int[] a = new int[in.nextInt()];
      for (int i = 0; i < a.length; i++) {
        a[i] = in.nextInt();
      }
      int res = func(a);
      System.out.println("Optimal train swapping takes " + res + " swaps.");
    }
  }

  int func(int[] a) {
    int res = 0;
//    System.out.println(Arrays.toString(a));
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] > a[j]) {
          res++;
        }
      }
    }
    return res;
  }
}