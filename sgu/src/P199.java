import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-5-17
 * Time: PM9:45
 */

public class P199 {
  public static void main(String[] args) {
    new P199().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[][] a = new int[n][3];
    for (int i = 0; i < a.length; i++) {
      a[i][0] = in.nextInt();
      a[i][1] = in.nextInt();
      a[i][2] = i + 1;
    }
    Arrays.sort(a, new Comparator<int[]>() {
      @Override
      public int compare(int[] ints, int[] ints1) {
        return ints[0] == ints1[0] ? ints[1] - ints1[1] : ints[0] - ints1[0];
      }
    });
    List<Integer> x = new ArrayList<Integer>();
    int p = a[0][0], q = a[0][1];
    x.add(a[0][2]);
    for (int i = 1; i < a.length; i++) {
      if (a[i][0] > p && a[i][1] > q) {
        x.add(a[i][2]);
        p = a[i][0];
        q = a[i][1];
      }
    }
    Arrays.sort(a, new Comparator<int[]>() {
      @Override
      public int compare(int[] ints1, int[] ints2) {
        return ints1[1] == ints2[1] ? ints1[0] - ints2[0] : ints1[1] - ints2[1];
      }
    });
    List<Integer> y = new ArrayList<Integer>();
    p = a[0][1];
    q = a[0][0];
    y.add(a[0][2]);
    for (int i = 1; i < a.length; i++) {
      if (a[i][1] > p && a[i][0] > q) {
        y.add(a[i][2]);
        p = a[i][1];
        q = a[i][0];
      }
    }
    List<Integer> res = x.size() > y.size() ? x : y;
    System.out.println(res.size());
    for (int i = 0; i < res.size(); i++) {
      if (i > 0) {
        System.out.print(" ");
      }
      System.out.print(res.get(i));
    }
    System.out.println();
  }
}