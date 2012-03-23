import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-2-21
 * Time: PM5:45
 */

public class P131A {
  public static void main(String[] args) {
    new P131A().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    if (isAllUpper(s) || isAllUpper(s.substring(1))) {
      String res = "";
      for (int i = 0; i < s.length(); i++) {
        res += Character.isUpperCase(s.charAt(i)) ? Character.toLowerCase(s.charAt(i)) : Character.toUpperCase(s.charAt(i));
      }
      System.out.println(res);
    } else {
      System.out.println(s);
    }
  }

  boolean isAllUpper(String s) {
    for (int i = 0; i < s.length(); i++) {
      if (Character.isLowerCase(s.charAt(i))) {
        return false;
      }
    }
    return true;
  }
}