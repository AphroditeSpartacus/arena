import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-18
 * Time: AM12:10
 */

public class P414 {
  public static void main(String[] args) {
    new P414().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    while (true) {
      int n = in.nextInt();
      if (n == 0) {
        break;
      }
      String dump = in.nextLine();
      String[] a = new String[n];
      for (int i = 0; i < a.length; i++) {
        a[i] = in.nextLine();
      }
      List<Integer> list = new ArrayList<Integer>();
      for (int i = 0; i < a.length; i++) {
        int cnt = 0;
        for (int j = 0; j < 25; j++) {
          if (a[i].charAt(j) == ' ') {
            cnt++;
          }
        }
        list.add(cnt);
      }
      int min = Collections.min(list);
      int sum = 0;
      for (Integer integer : list) {
        sum += integer;
      }
      System.out.println(sum - min * n);

    }
  }
}