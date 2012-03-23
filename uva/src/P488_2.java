import java.util.Scanner;

/**
 * User: Aphrodite
 * Date: 12-3-18
 * Time: PM2:42
 */

public class P488_2 {
  public static void main(String[] args) {
    new P488_2().solve();
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
    String s = funcHelper(a);
    for (int i = 0; i < b; i++) {
      if (i > 0) {
        System.out.println();
      }
      System.out.print(s);
    }
  }

  String funcHelper(int a) {
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= a; i++) {
      for (int j = 0; j < i; j++) {
        sb.append(i);
      }
      sb.append('\n');
    }
    for (int i = a - 1; i >= 1; i--) {
      for (int j = 0; j < i; j++) {
        sb.append(i);
      }
      sb.append('\n');
    }
    return sb.toString();
  }
}