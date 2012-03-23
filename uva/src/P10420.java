import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-20
 * Time: PM7:02
 */

public class P10420 {
  public static void main(String[] args) {
    new P10420().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = Integer.parseInt(in.nextLine());
    Map<String, Integer> map = new TreeMap<String, Integer>();
    for (int i = 0; i < n; i++) {
      String s = in.nextLine();
      Scanner scan = new Scanner(s);
      String country = scan.next();
      if (map.containsKey(country)) {
        map.put(country, map.get(country) + 1);
      } else {
        map.put(country, 1);
      }
    }
    for (String s : map.keySet()) {
      System.out.println(s + " " + map.get(s));
    }
  }
}