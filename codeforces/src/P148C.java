import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-2-20
 * Time: PM8:10
 */

public class P148C {
  public static void main(String[] args) {
    new P148C().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), a = in.nextInt(), b = in.nextInt();
    int cur = 1;
    List<Integer> list = new ArrayList<Integer>();
    list.add(cur);

    for (int i = 0; i < b; i++) {
      cur = sum(list) + 1;
      if (cur > 50000) {
        System.out.println(-1);
        System.exit(0);
      }
      list.add(cur);
    }
    int sz = n - list.size() - a;
    for (int i = 0; i < sz; i++) {
      list.add(cur);
    }
    for (int i = 0; i < a; i++) {
      cur++;
      if (cur > sum(list)) {
        System.out.println(-1);
        System.exit(0);
      }
      list.add(cur);
    }

//    for (Integer integer : list) {
//      System.out.print(integer + " ");
//    }
    for (int i = 0; i < list.size(); i++) {
      Integer x = list.get(i);
      if (i != 0) {
        System.out.print(" ");
      }
      System.out.print(x);
    }
//    System.out.println();
  }

  int sum(List<Integer> list) {
    int res = 0;
    for (Integer integer : list) {
      res += integer;
    }
    return res;
  }
}