import java.util.*;

/**
 * User: Aphrodite
 * Date: 11-4-19
 * Time: PM9:45
 */

public class FileFixIt {
  public static void main(String[] args) {
    new FileFixIt().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    for (int t = 1; t <= test; t++) {
      int n = in.nextInt();
      int m = in.nextInt();
      Set<String> set = new HashSet<String>();
      set.add("/");
      for (int i = 0; i < n; i++) {
        String s = in.next();
        String[] a = s.split("/");
        StringBuilder sb = new StringBuilder();
        for (int j = 1; j < a.length; j++) {
          sb.append("/");
          sb.append(a[j]);
          set.add(sb.toString());
        }
      }
//      System.out.println(set);
      int res = 0;
      for (int i = 0; i < m; i++) {
        String s = in.next();
        String[] a = s.split("/");
        StringBuilder sb = new StringBuilder();
        for (int j = 1; j < a.length; j++) {
          sb.append("/");
          sb.append(a[j]);
          if (!set.contains(sb.toString())) {
            res++;
            set.add(sb.toString());
          }
        }
      }
      System.out.println("Case #" + t + ": " + res);
    }
  }
}