import java.math.BigDecimal;
import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-18
 * Time: PM6:30
 */

public class P748 {
  public static void main(String[] args) {
    new P748().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      BigDecimal a = new BigDecimal(in.next());
      int b = in.nextInt();
      if (a.equals(BigDecimal.ZERO)) {
        System.out.println(0);
        continue;
      }
      System.out.println(a.pow(b).stripTrailingZeros());
//      StringBuilder sb  = new StringBuilder(a.pow(b).toString());
//      while (sb.length() > 1 && (sb.charAt(sb.length() - 1) == '0' || sb.charAt(sb.length() - 1) == '.')) {
//        sb.deleteCharAt(sb.length() - 1);
//      }
//      System.out.println(sb);
    }
  }
}