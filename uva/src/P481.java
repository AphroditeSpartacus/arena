import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-7
 * Time: PM5:19
 */

public class P481 {
  public static void main(String[] args) {
    new P481().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    while (in.hasNext()) {
      list.add(in.nextInt());
    }
    int n = list.size();
    int[] dp = new int[n];
    int[] back = new int[n];
    Arrays.fill(dp, 1);
    Arrays.fill(back, -1);
    for (int i = 0; i < list.size(); i++) {
      for (int j = i - 1; j >= 0; j--) {
        if (list.get(j) < list.get(i) && (dp[j] + 1 > dp[i])) {
          dp[i] = dp[j] + 1;
          back[i] = j;
        }
      }
    }
    int max = 0;
    for (int i = 0; i < dp.length; i++) {
      max = Math.max(max, dp[i]);
    }
    int start = 0, last = 0;
    for (int i = 0; i < dp.length; i++) {
      if (dp[i] == max) {
        int idx = i;
        while (back[idx] != -1) {
          idx = back[idx];
        }
        if (idx >= start) {
          start = idx;
          last = i;
        }
      }
    }
    System.out.println(max);
    System.out.println("-");
    List<Integer> res = new ArrayList<Integer>();
    while (last != -1) {
      res.add(list.get(last));
      last = back[last];
    }
    for (int i = res.size() - 1; i >= 0; i--) {
      System.out.println(res.get(i));
    }
  }
}