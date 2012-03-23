import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-20
 * Time: PM7:50
 */

public class P120 {
  public static void main(String[] args) {
    new P120().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      String orig = in.nextLine();
      System.out.println(orig);
      String[] s = orig.split(" ");
      int[] a = new int[s.length];
      for (int i = 0; i < s.length; i++) {
        a[i] = Integer.parseInt(s[i]);
      }
      List<Integer> res = func(a);
      for (int i = 0; i < res.size(); i++) {
        if (i > 0) {
          System.out.print(" ");
        }
        System.out.print(res.get(i));
      }
      System.out.println();
    }
  }

  List<Integer> func(int[] a) {
    List<Integer> list = new ArrayList<Integer>();
    for (int i = a.length - 1; i >= 0; i--) {
      helper(list, a, i);
    }
    list.add(0);
    return list;
  }

  void helper(List<Integer> list, int[] a, int cur) {
    int idx = 0, max = a[idx];
    for (int i = 0; i <= cur; i++) {
      if (a[i] >= max) {
        max = a[i];
        idx = i;
      }
    }
    if (idx == cur) {
      return;
    }
    reverse(a, 0, idx);
    reverse(a, 0, cur);
    if (idx != 0) {
      list.add(a.length - idx);
    }
    list.add(a.length - cur);
  }

  void reverse(int[] a, int start, int end) {
    while (start < end) {
      int tmp = a[start];
      a[start] = a[end];
      a[end] = tmp;
      start++;
      end--;
    }
  }
}