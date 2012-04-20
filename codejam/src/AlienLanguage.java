import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-17
 * Time: PM8:37
 */

public class AlienLanguage {
  private int idx;

  public static void main(String[] args) {
    new AlienLanguage().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int L = in.nextInt(), D = in.nextInt(), N = in.nextInt();
    String[] a = new String[D];
    for (int i = 0; i < a.length; i++) {
      a[i] = in.next();
    }
    boolean[] flag = new boolean[D];
    for (int t = 1; t <= N; t++) {
      String s = in.next();
      Arrays.fill(flag, true);
      idx = 0;
//      System.out.println("/////////////");

      for (int i = 0; i < L; i++) {
        String candidate = func(s);
//        System.out.println(candidate);

        for (int k = 0; k < flag.length; k++) {
          boolean ok = false;
          for (int j = 0; j < candidate.length(); j++) {
            if (a[k].charAt(i) == candidate.charAt(j)) {
              ok = true;
            }
          }
          if (!ok) {
            flag[k] = false;
          }
        }
      }

      int cnt = 0;
      for (int i = 0; i < flag.length; i++) {
        if (flag[i]) {
          cnt++;
        }
      }
      System.out.println("Case #" + t + ": " + cnt);
    }
  }

  String func(String s) {
    int orig = idx;
    if (s.charAt(idx) == '(') {
      int j = idx + 1;
      while (s.charAt(j) != ')') {
        j++;
      }
      idx = j + 1;
      return s.substring(orig + 1, j);
    } else {
      idx = idx + 1;
      return s.substring(orig, orig + 1);
    }
  }
}