import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-31
 * Time: PM9:17
 */

public class P492 {
  public static void main(String[] args) {
    new P492().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      String s = in.nextLine();
      if (s.isEmpty()) {
        break;
      }
      func(s);
    }
  }

  void func(String s) {
    StringBuilder sb = new StringBuilder();
    int i, j;
    i = 0;
    while (i < s.length()) {
      if (Character.isUpperCase(s.charAt(i)) || Character.isLowerCase(s.charAt(i))) {
        j = i;
        while (j < s.length() && (Character.isUpperCase(s.charAt(j)) || Character.isLowerCase(s.charAt(j)))) {
          j++;
        }
        sb.append(change(s.substring(i, j)));
        i = j;
      } else {
        sb.append(s.charAt(i));
        i++;
      }
    }
    System.out.println(sb);
  }

  String change(String s) {
    char c = Character.toLowerCase(s.charAt(0));
    if ("aeiou".indexOf(c) != -1) {
      return s + "ay";
    } else {
      return s.substring(1) + s.charAt(0) + "ay";
    }
  }
}