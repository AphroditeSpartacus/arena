import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-14
 * Time: PM11:47
 */

public class P113 {
  public static void main(String[] args) {
    new P113().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    Prime prime = new Prime(100000);
    int[] a = prime.getPrimeArray();
    int test = in.nextInt();
    out:
    for (int t = 0; t < test; t++) {
      int n = in.nextInt();
      for (int i = 0; i < a.length; i++) {
        if (n % a[i] == 0) {
          int x = n / a[i];
          if (isPrime(x)) {
            System.out.println("Yes");
            continue out;
          }
        }
      }
      System.out.println("No");
    }
  }

  boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}

class Prime {
  public Prime(int n) {
    max = n;
    bitSet = new BitSet(max + 1);
    bitSet.set(0, 2, false);
    bitSet.set(2, max, true);
    for (long i = 2; i * i <= max; ++i) {
      if (isPrime((int) i)) {
        for (long j = i * i; j <= max; j += i) {
          bitSet.set((int) j, false);
        }
      }
    }
    primeCount = bitSet.cardinality();
  }

  public boolean isPrime(int n) {
    return bitSet.get(n);
  }

  public int[] getPrimeArray(int n) {
    n = Math.min(n, primeCount);
    int[] primeNumber = new int[n];
    for (int idx = 0, i = 0; i <= max; ++i) {
      if (isPrime(i)) {
        primeNumber[idx++] = i;
        if (idx == n) {
          break;
        }
      }
    }
    return primeNumber;
  }

  public int[] getPrimeArray() {
    return getPrimeArray(primeCount);
  }

  public int getPrimeCount() {
    return primeCount;
  }

  private int max;
  private int primeCount;
  private BitSet bitSet;
}
