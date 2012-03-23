import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-21
 * Time: PM10:52
 */

public class P10161 {
  public static void main(String[] args) {
    new P10161().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    while (true) {
      long n = in.nextLong();
      if (n == 0) {
        break;
      }
      if (n == 1) {
        System.out.println("1 1");
        continue;
      } else if (n == 2) {
        System.out.println("1 2");
        continue;
      } else if (n == 3) {
        System.out.println("2 2");
        continue;
      }  else if (n == 4) {
        System.out.println("2 1");
        continue;
      }
      long x = 0;
      while (x * x <= n) {
        x += 2;
      }
      x -= 2;

      long diff = n - x * x;
//      System.out.println("~~~~~~~~~~~~~ x: " + x + " diff: " + diff);
      if (diff == 0) {
        System.out.println(x + " " + 1);
      } else if (diff <= x + 1) {
//        System.out.println("---- " + 1);
        System.out.println((x + 1) + " " + diff);
      } else if (diff <= x + 1 + x) {
//        System.out.println("---- " + 2);
        System.out.println((x + 1 - (diff - (x + 1))) + " " + (x + 1));
      } else if (diff <= x + 1 + x + 2 + x) {
//        System.out.println("---- " + 3);
        System.out.println((diff - (x + 1 + x)) + " " + (x + 2));
      } else {
//        System.out.println("---- " + 4);
        System.out.println((x + 2) + " " + ((x + 2) - (diff - (x + 1 + x + 2 + x))));
      }
    }
  }
}