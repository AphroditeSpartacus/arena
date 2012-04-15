import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-9
 * Time: PM10:19
 */

public class P142 {
  public static void main(String[] args) {
    new P142().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String s = in.next();
    int len = 1;
    while (true) {
      int cnt = (int) Math.pow(2, len);
//      System.out.println(cnt + "---" + len);
      Set<Integer> set = new TreeSet<Integer>();
      for (int i = 0; i + len <= s.length(); i++) {
        String sub = s.substring(i, i + len);
        int x = stringToInteger(sub);
        set.add(x);
        if (set.size() == cnt) {
          break;
        }
      }
//      System.out.println(set);
      if (set.size() < cnt) {
        int cur = 0;
        for (Integer integer : set) {
          if (integer != cur) {
            System.out.println(len);
            System.out.println(integerToString(cur, len));
            System.exit(0);
          }
          cur++;
        }
        System.out.println(len);
        System.out.println(integerToString(cur, len));
        System.exit(0);
      } else {
        len++;
      }
    }
  }

  int stringToInteger(String s) {
    int res = 0;
    for (int i = 0; i < s.length(); i++) {
      res = (res << 1) + (s.charAt(i) == 'a' ? 0 : 1);
    }
    return res;
  }

  String integerToString(int n, int len) {
    StringBuffer sb = new StringBuffer();
    while (sb.length() < len) {
      sb.append(n % 2 == 0 ? 'a' : 'b');
      n /= 2;
    }
    return sb.reverse().toString();
  }
}