import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-18
 * Time: PM5:31
 */

public class P10815 {
  public static void main(String[] args) {
    new P10815().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    Set<String> set = new TreeSet<String>();
    while (in.hasNext()) {
      String s = in.nextLine();
      String[] a = s.split("[^a-zA-Z]+");
      for (int i = 0; i < a.length; i++) {
        String aux = func(a[i]);
        if (!aux.isEmpty()) {
          set.add(aux);
        }
      }
    }
    for (String s : set) {
      System.out.println(s);
    }
  }

  String func(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      sb.append(Character.toLowerCase(s.charAt(i)));
    }
    return sb.toString();
  }
}