import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-18
 * Time: PM4:05
 */

public class P401 {
  public static void main(String[] args) {
    new P401().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    map.put('A', 'A');
    map.put('E', '3');
    map.put('H', 'H');
    map.put('I', 'I');
    map.put('J', 'L');
    map.put('L', 'J');
    map.put('M', 'M');
    map.put('O', 'O');
    map.put('S', '2');
    map.put('T', 'T');
    map.put('U', 'U');
    map.put('V', 'V');
    map.put('W', 'W');
    map.put('X', 'X');
    map.put('Y', 'Y');
    map.put('Z', '5');
    map.put('1', '1');
    map.put('2', 'S');
    map.put('3', 'E');
    map.put('5', 'Z');
    map.put('8', '8');
    while (in.hasNext()) {
      String s = in.next();
      System.out.print(s);
      if (!isMirrored(s) && !isPalindrome(s)) {
        System.out.println(" -- is not a palindrome.");
      } else if (isMirrored(s) && !isPalindrome(s)) {
        System.out.println(" -- is a regular palindrome.");
      } else if (!isMirrored(s) && isPalindrome(s)) {
        System.out.println(" -- is a mirrored string.");
      } else {
        System.out.println(" -- is a mirrored palindrome.");
      }
      System.out.println();
    }
  }

  boolean isMirrored(String s) {
    int a = 0, b = s.length() - 1;
    while (a < b) {
      if (s.charAt(a) != s.charAt(b)) {
        return false;
      }
      a++;
      b--;
    }
    return true;
  }

  boolean isPalindrome(String s) {
    int a = 0, b = s.length() - 1;
    while (a <= b) {
      if (!map.containsKey(s.charAt(a)) || !map.containsKey(s.charAt(b)) || (s.charAt(a) != map.get(s.charAt(b)))) {
        return false;
      }
      a++;
      b--;
    }
    return true;
  }

  Map<Character, Character> map = new HashMap<Character, Character>();
}