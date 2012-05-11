import java.util.BitSet;

class Prime {
  public Prime(int n) {
    max = n;
    bitSet = new BitSet(max + 1);
    if (max > 1){
      bitSet.set(0, 2, false);
      bitSet.set(2, max + 1, true);
      for (long i = 2; i * i <= max; ++i) {
        if (isPrime((int) i)) {
          for (long j = i * i; j <= max; j += i) {
            bitSet.set((int) j, false);
          }
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