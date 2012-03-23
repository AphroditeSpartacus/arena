import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-18
 * Time: AM12:36
 */

public class P490 {
  public static void main(String[] args) {
    new P490().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    List<String> list = new ArrayList<String>();
    while (in.hasNext()) {
      list.add(in.nextLine());
    }
    int maxLength = 0;
    for (String s : list) {
      maxLength = Math.max(maxLength, s.length());
    }
//    System.out.println(list);
    int n = list.size();
    for (int i = 0; i < maxLength; i++) {
      for (int j = n - 1; j >= 0; j--) {
        if (list.get(j).length() < i + 1) {
          System.out.print(' ');
        } else {
          System.out.print(list.get(j).charAt(i));
        }
      }
      System.out.println();
    }
  }
}