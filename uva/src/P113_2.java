import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * User: Aphrodite
 * Date: 12-3-21
 * Time: PM10:20
 */

public class P113_2 {
  public static void main(String[] args) {
    new P113_2().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      double n = in.nextDouble(), p = in.nextDouble();
      System.out.println(Math.round(Math.pow(p, 1 / n)));
    }
  }
}