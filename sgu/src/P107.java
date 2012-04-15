import java.math.BigInteger;
import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-12
 * Time: PM11:01
 */

public class P107 {
  public static void main(String[] args) {
    new P107().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    if (n < 9) {
      System.out.println(0);
      System.exit(0);
    }
    if (n == 9) {
      System.out.println(8);
      System.exit(0);
    }
    System.out.print("72");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n - 10; i++) {
      sb.append("0");
    }
    System.out.println(sb);
  }
}
