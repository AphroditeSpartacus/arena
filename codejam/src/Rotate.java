import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-20
 * Time: PM9:54
 */

public class Rotate {
  public static void main(String[] args) {
    new Rotate().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    for (int t = 1; t <= test; t++) {
      int n = in.nextInt(), k = in.nextInt();
      String[] a = new String[n];
      for (int i = 0; i < a.length; i++) {
        a[i] = in.next();
      }
      String[] b = rotate(a);
//      System.out.println(Arrays.toString(b));
      boolean R = check(b, 'R', k), B = check(b, 'B', k);
      System.out.print("Case #" + t + ": ");
      if (R && !B) {
        System.out.println("Red");
      } else if (!R && B) {
        System.out.println("Blue");
      } else if (R && B) {
        System.out.println("Both");
      } else {
        System.out.println("Neither");
      }
    }
  }

  String[] rotate(String[] a) {
    int n = a.length;
    for (int i = 0; i < a.length; i++) {
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < a[i].length(); j++) {
        if (a[i].charAt(j) != '.') {
          sb.append(a[i].charAt(j));
        }
      }
      while (sb.length() < n) {
        sb.insert(0, '.');
      }
      a[i] = sb.toString();
    }
    String[] b = new String[n];
    for (int i = 0; i < b.length; i++) {
      StringBuilder sb = new StringBuilder();
      for (int j = n - 1; j >= 0; j--) {
        sb.append(a[j].charAt(i));
      }
      b[i] = sb.toString();
    }
    return b;
  }

  boolean check(String[] a, char c, int k) {
    int n = a.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (a[i].charAt(j) == c) {
          if (i + k <= n && j + k <= n) {
            boolean ok = true;
            for (int l = 0; l < k; l++) {
              if (a[i + l].charAt(j + l) != c) {
                ok = false;
                break;
              }
            }
            if (ok) {
              return true;
            }
          }
          if (i + k <= n && j - k + 1 >= 0) {
            boolean ok = true;
            for (int l = 0; l < k; l++) {
              if (a[i + l].charAt(j - l) != c) {
                ok = false;
                break;
              }
            }
            if (ok) {
              return true;
            }
          }
          if (i + k <= n) {
            boolean ok = true;
            for (int l = 0; l < k; l++) {
              if (a[i + l].charAt(j) != c) {
                ok = false;
                break;
              }
            }
            if (ok) {
              return true;
            }
          }
          if (j + k <= n) {
            boolean ok = true;
            for (int l = 0; l < k; l++) {
              if (a[i].charAt(j + l) != c) {
                ok = false;
                break;
              }
            }
            if (ok) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }
}