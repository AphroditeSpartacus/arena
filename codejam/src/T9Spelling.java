import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-13
 * Time: PM10:17
 */

public class T9Spelling {
  public static void main(String[] args) {
    new T9Spelling().solve();
  }

  public void solve() {
    Map<Character, String> map = new HashMap<Character, String>();
    map.put('a', "2"); map.put('b', "22"); map.put('c', "222");
    map.put('d', "3"); map.put('e', "33"); map.put('f', "333");
    map.put('g', "4"); map.put('h', "44"); map.put('i', "444");
    map.put('j', "5"); map.put('k', "55"); map.put('l', "555");
    map.put('m', "6"); map.put('n', "66"); map.put('o', "666");
    map.put('p', "7"); map.put('q', "77"); map.put('r', "777"); map.put('s', "7777");
    map.put('t', "8"); map.put('u', "88"); map.put('v', "888");
    map.put('w', "9"); map.put('x', "99"); map.put('y', "999"); map.put('z', "9999");
    map.put(' ', "0");
    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    in.nextLine();
    for (int t = 1; t <= test; t++) {
      String s = in.nextLine();
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        sb.append(map.get(c));
        if (i < s.length() - 1) {
          char c2 = s.charAt(i + 1);
//          System.out.println(c + " " + c2);
          if (map.get(c).charAt(0) == map.get(c2).charAt(0)) {
            sb.append(' ');
          }
        }
      }
      System.out.println("Case #" + t + ": " + sb);
    }
  }
}