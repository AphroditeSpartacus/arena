import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-3-18
 * Time: PM3:07
 */

public class P489 {
  public static void main(String[] args) {
    new P489().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    out:
    while (true) {
      int n = in.nextInt();
      if (n == -1) {
        break;
      }
      System.out.println("Round " + n);
      String result = in.next(), guess = in.next();
      int cnt = 7;
      Set<Character> set = new HashSet<Character>();
      for (int i = 0; i < result.length(); i++) {
        set.add(result.charAt(i));
      }
      Set<Character> orig = new HashSet<Character>(set);
      for (int i = 0; i < guess.length(); i++) {
        if (orig.contains(guess.charAt(i))) {
          set.remove(guess.charAt(i));
          if (set.isEmpty()) {
            System.out.println("You win.");
            continue out;
          }
        } else {
          cnt--;
          if (cnt == 0) {
            System.out.println("You lose.");
            continue out;
          }
        }
      }
      System.out.println("You chickened out.");
    }
  }
}