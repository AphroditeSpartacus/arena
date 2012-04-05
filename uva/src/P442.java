import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * User: Aphrodite
 * Date: 12-4-4
 * Time: PM5:30
 */

public class P442 {
  public static void main(String[] args) {
    new P442().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Map<Character, Point> map = new HashMap<Character, Point>();
    for (int i = 0; i < n; i++) {
      String s = in.next();
      Point p = new Point();
      p.x = in.nextInt();
      p.y = in.nextInt();
      map.put(s.charAt(0), p);
    }
    out:
    while (in.hasNext()) {
      String s = in.next();
      LinkedList<Point> list = new LinkedList<Point>();
      int res = 0;
      for (int i = 0; i < s.length(); i++) {
        if (Character.isUpperCase(s.charAt(i))) {
          list.addLast(map.get(s.charAt(i)));
        } else if (s.charAt(i) == ')') {
          if (list.size() < 2) {
            System.out.println("error");
            continue out;
          }
          Point a = list.removeLast();
          Point b = list.removeLast();
          if (a.x != b.y) {
            System.out.println("error");
            continue out;
          }
          res += a.x * a.y * b.x;
          list.addLast(new Point(b.x, a.y));
        }
      }
      System.out.println(res);
    }
  }
}