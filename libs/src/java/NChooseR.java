import java.math.BigInteger;
import java.util.*;


class NChooseR {
  public NChooseR(int n) {
    ncr = new BigInteger[n + 1][n + 1];
    for (int i = 0; i < ncr.length; i++) {
      for (int j = 0; j < ncr[i].length; j++) {
        ncr[i][j] = i < j ? BigInteger.ZERO : j == 0 ? BigInteger.ONE : ncr[i - 1][j - 1].add(ncr[i - 1][j]);
      }
    }
  }

  public BigInteger get(int n, int r) {
    return ncr[n][r];
  }

  private BigInteger[][] ncr;
}