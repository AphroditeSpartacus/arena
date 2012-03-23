import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-18
 * Time: PM2:42
 */

public class P488 {
  public static void main(String[] args) {
    new P488().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    for (int t = 0; t < test; t++) {
      if (t > 0) {
        System.out.println();
      }
      func(in.nextInt(), in.nextInt());
    }
  }

  void func(int a, int b) {
    for (int i = 0; i < b; i++) {
      if (i > 0) {
        System.out.println();
      }
      print(a);
    }
  }

  void print(int a) {
    for (int i = 1; i <= a; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
    for (int i = a - 1; i >= 1; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}