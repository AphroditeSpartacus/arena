import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-22
 * Time: PM7:38
 */

public class P112 {
  public static void main(String[] args) {
    new P112().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      long n = in.nextLong();
      StringBuilder sb = new StringBuilder();
      int symmetry = 0;
      do {
        String s = in.next();
        for (int i = 0; i < s.length(); i++) {
          if (s.charAt(i) == '(') {
            symmetry++;
          } else if (s.charAt(i) == ')') {
            symmetry--;
          }
        }
        sb.append(s);
      } while (symmetry > 0);
//      System.out.println(sb);
      if (find(sb.toString(), n)) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
  }

  boolean find(String s, long n) {
    if (s.isEmpty()) {
      if (n == 0) {
        return true;
      } else {
        return false;
      }
    }
    String[] a = func(s);
    long x = 0;
    if (a[0] != null) {
      x = Long.parseLong(a[0]);
    }
    if (x > n) {
      return false;
    }
    return find(a[1], n - x) || find(a[2], n - x);
  }

  String[] func(String s) {
    String[] res = new String[3];
    if (s.length() == 2) {
      res[1] = res[2] = "";
      return res;
    }
    int nidx = 1;
    while (Character.isDigit(s.charAt(nidx))) {
      nidx++;
    }
    res[0] = s.substring(1, nidx);
    int pidx = nidx, qidx = nidx;
    int symmetry = 0;
    do {
      if (s.charAt(qidx) == '(') {
        symmetry++;
      } else if (s.charAt(qidx) == ')') {
        symmetry--;
      }
      qidx++;
    } while (symmetry > 0);
    res[1] = s.substring(pidx, qidx);
    res[2] = s.substring(qidx, s.length() - 1);
    return res;
  }
}