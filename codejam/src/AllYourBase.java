import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-24
 * Time: PM9:10
 */

public class AllYourBase {
  public static void main(String[] args) {
    new AllYourBase().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    for (int t = 1; t <= test; t++) {
      String s = in.next();
      Set<Character> set = new HashSet<Character>();
      for (int i = 0; i < s.length(); i++) {
        set.add(s.charAt(i));
      }
      int base = set.size();
      base = Math.max(base, 2);
      Map<Character, Integer> map = new HashMap<Character, Integer>();
      int[] a = new int[base];
      for (int i = 0; i < a.length; i++) {
        a[i] = i;
      }
      a[0] = 1;
      a[1] = 0;
      int idx = 0;
      for (int i = 0; i < s.length(); i++) {
        if (!map.containsKey(s.charAt(i))) {
          map.put(s.charAt(i), a[idx++]);
        }
      }
      long res = 0;
      for (int i = 0; i < s.length(); i++) {
        res = res * base + map.get(s.charAt(i));
      }
      System.out.println("Case #" + t + ": " + res);
    }
  }
}