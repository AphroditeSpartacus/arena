import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-22
 * Time: PM7:11
 */

public class P575 {
  public static void main(String[] args) {
    new P575().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    while (true) {
      String s = in.next();
      if (s.equals("0")) {
        break;
      }
      System.out.println(func(s));
    }
  }

  long func(String s) {
    long res = 0;
    long m = 2;
    for (int i = 0; i < s.length(); i++) {
      int x = s.charAt(s.length() - i - 1) - '0';
      res += x * (m - 1);
      m <<= 1;
    }
    return res;
  }
}