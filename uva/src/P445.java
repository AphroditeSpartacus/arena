import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-18
 * Time: PM2:22
 */

public class P445 {
  public static void main(String[] args) {
    new P445().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      String s = in.nextLine();
      System.out.println(func(s));
    }
  }

  String func(String s) {
    StringBuilder sb = new StringBuilder();
    int cnt = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (Character.isDigit(c)) {
        cnt += c - '0';
      } else {
        int rep = cnt == 0 ? 1 : cnt;
        cnt = 0;
        if (c == '!') {
          c = '\n';
        } else if (c == 'b') {
          c = ' ';
        }
        for (int j = 0; j < rep; j++) {
          sb.append(c);
        }
      }
    }
    return sb.toString();
  }
}