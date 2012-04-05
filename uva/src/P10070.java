import java.math.BigInteger;
import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-29
 * Time: PM9:05
 */

public class P10070 {
  public static void main(String[] args) {
    new P10070().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int idx = 0;
    while (in.hasNext()) {
      if (idx > 0) {
        System.out.println();
      }
      idx++;
      String s = in.next();
      boolean flag = false;
      if (isLeap(s)) {
        System.out.println("This is leap year.");
        flag = true;
      }
      if (isHuluculu(s)) {
        System.out.println("This is huluculu festival year.");
        flag = true;
      }
      if (isBulukulu(s)) {
        System.out.println("This is bulukulu festival year.");
        flag = true;
      }
      if (flag == false) {
        System.out.println("This is an ordinary year.");
      }
    }
  }

  boolean isLeap(String s) {
    BigInteger n = new BigInteger(s);
    if (n.mod(BigInteger.valueOf(400)) == BigInteger.ZERO ||
        (n.mod(BigInteger.valueOf(4)) == BigInteger.ZERO && n.mod(BigInteger.valueOf(100)) != BigInteger.ZERO)) {
      return true;
    } else {
      return false;
    }
  }

  boolean isHuluculu(String s) {
    BigInteger n = new BigInteger(s);
    if (n.mod(BigInteger.valueOf(15)) == BigInteger.ZERO) {
      return true;
    } else {
      return false;
    }
  }

  boolean isBulukulu(String s) {
    BigInteger n = new BigInteger(s);
    if (isLeap(s) && n.mod(BigInteger.valueOf(55)) == BigInteger.ZERO) {
      return true;
    } else {
      return false;
    }
  }
}