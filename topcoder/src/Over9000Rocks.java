import java.util.*;

/****************************************************************************
 *                                                                          *
 *                To see the world in a grain of sand,                      *
 *                And a heaven in a wild flower;                            *
 *                Hold infinity in the palm of your hand,                   *
 *                And eternity in an hour.                                  *
 *                                                                          *
 ***************************************************************************/

public class Over9000Rocks {
  public int countPossibilities(int[] lowerBound, int[] upperBound) {
    List<int[]> list = new ArrayList<int[]>();
    int n = lowerBound.length;
    for (int i = 0; i < (1 << n); i++) {
      int low = 0, high = 0;
      for (int j = 0; j < n; j++) {
        if (((1 << j) & i) > 0) {
          low += lowerBound[j];
          high += upperBound[j];
        }
      }
      low = Math.max(9001, low);
      if (low <= high) {
        list.add(new int[]{low, high});
      }
    }
    Collections.sort(list, new Comparator<int[]>() {
      //      @Override
      public int compare(int[] ints, int[] ints1) {
        if (ints[0] == ints1[0]) {
          return ints[1] - ints1[1];
        } else {
          return ints[0] - ints1[0];
        }
      }
    });

    int start = 0;
    int res = 0;
    for (int[] ints : list) {
//      System.out.println(Arrays.toString(ints));
      start = Math.max(start, ints[0]);
      if (start <= ints[1]) {
        res += ints[1] - start + 1;
        start = ints[1] + 1;
      }
    }
    return res;
  }


// BEGIN CUT HERE
  public static void main(String[] args) {
		if (args.length == 0) {
			Over9000RocksHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				Over9000RocksHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class Over9000RocksHarness {
	public static void run_test(int casenum) {
		if (casenum != -1) {
			if (runTestCase(casenum) == -1)
				System.err.println("Illegal input! Test case " + casenum + " does not exist.");
			return;
		}
		
		int correct = 0, total = 0;
		for (int i=0;; ++i) {
			int x = runTestCase(i);
			if (x == -1) {
				if (i >= 100) break;
				continue;
			}
			correct += x;
			++total;
		}
		
		if (total == 0) {
			System.err.println("No test cases run.");
		} else if (correct < total) {
			System.err.println("Some cases FAILED (passed " + correct + " of " + total + ").");
		} else {
			System.err.println("All " + total + " tests passed!");
		}
	}
	
	static boolean compareOutput(int expected, int result) { return expected == result; }
	static String formatResult(int res) {
		return String.format("%d", res);
	}
	
	static int verifyCase(int casenum, int expected, int received) { 
		System.err.print("Example " + casenum + "... ");
		if (compareOutput(expected, received)) {
			System.err.println("PASSED");
			return 1;
		} else {
			System.err.println("FAILED");
			System.err.println("    Expected: " + formatResult(expected)); 
			System.err.println("    Received: " + formatResult(received)); 
			return 0;
		}
	}

	static int runTestCase(int casenum__) {
		switch(casenum__) {
		case 0: {
			int[] lowerBound          = {9000};
			int[] upperBound          = {9001};
			int expected__            = 1;

			return verifyCase(casenum__, expected__, new Over9000Rocks().countPossibilities(lowerBound, upperBound));
		}
		case 1: {
			int[] lowerBound          = {9000, 1, 10};
			int[] upperBound          = {9000, 2, 20};
			int expected__            = 15;

			return verifyCase(casenum__, expected__, new Over9000Rocks().countPossibilities(lowerBound, upperBound));
		}
		case 2: {
			int[] lowerBound          = {1001, 2001, 3001, 3001};
			int[] upperBound          = {1003, 2003, 3003, 3003};
			int expected__            = 9;

			return verifyCase(casenum__, expected__, new Over9000Rocks().countPossibilities(lowerBound, upperBound));
		}
		case 3: {
			int[] lowerBound          = {9000,90000,1,10};
			int[] upperBound          = {9000,90000,3,15};
			int expected__            = 38;

			return verifyCase(casenum__, expected__, new Over9000Rocks().countPossibilities(lowerBound, upperBound));
		}
		case 4: {
			int[] lowerBound          = {1,1,1,1,1,1};
			int[] upperBound          = {3,4,5,6,7,8};
			int expected__            = 0;

			return verifyCase(casenum__, expected__, new Over9000Rocks().countPossibilities(lowerBound, upperBound));
		}

		// custom cases

      case 5: {
			int[] lowerBound          = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
			int[] upperBound          = {1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000};
			int expected__            = 14991000;

			return verifyCase(casenum__, expected__, new Over9000Rocks().countPossibilities(lowerBound, upperBound));
		}
/*      case 6: {
			int[] lowerBound          = ;
			int[] upperBound          = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new Over9000Rocks().countPossibilities(lowerBound, upperBound));
		}*/
/*      case 7: {
			int[] lowerBound          = ;
			int[] upperBound          = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new Over9000Rocks().countPossibilities(lowerBound, upperBound));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
