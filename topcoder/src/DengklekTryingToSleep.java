import java.util.*;

/****************************************************************************
 *                                                                          *
 *                To see the world in a grain of sand,                      *
 *                And a heaven in a wild flower;                            *
 *                Hold infinity in the palm of your hand,                   *
 *                And eternity in an hour.                                  *
 *                                                                          *
 ***************************************************************************/

public class DengklekTryingToSleep {
  public int minDucks(int[] ducks) {
    Arrays.sort(ducks);
    System.out.println(ducks.length - 1);
    return ducks[ducks.length - 1] - ducks[0] + 1 - ducks.length;
  }


// BEGIN CUT HERE
  public static void main(String[] args) {
		if (args.length == 0) {
			DengklekTryingToSleepHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				DengklekTryingToSleepHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class DengklekTryingToSleepHarness {
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
			int[] ducks               = {5, 3, 2};
			int expected__            = 1;

			return verifyCase(casenum__, expected__, new DengklekTryingToSleep().minDucks(ducks));
		}
		case 1: {
			int[] ducks               = {58};
			int expected__            = 0;

			return verifyCase(casenum__, expected__, new DengklekTryingToSleep().minDucks(ducks));
		}
		case 2: {
			int[] ducks               = {9, 3, 6, 4};
			int expected__            = 3;

			return verifyCase(casenum__, expected__, new DengklekTryingToSleep().minDucks(ducks));
		}
		case 3: {
			int[] ducks               = {7, 4, 77, 47, 74, 44};
			int expected__            = 68;

			return verifyCase(casenum__, expected__, new DengklekTryingToSleep().minDucks(ducks));
		}
		case 4: {
			int[] ducks               = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			int expected__            = 0;

			return verifyCase(casenum__, expected__, new DengklekTryingToSleep().minDucks(ducks));
		}

		// custom cases

/*      case 5: {
			int[] ducks               = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new DengklekTryingToSleep().minDucks(ducks));
		}*/
/*      case 6: {
			int[] ducks               = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new DengklekTryingToSleep().minDucks(ducks));
		}*/
/*      case 7: {
			int[] ducks               = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new DengklekTryingToSleep().minDucks(ducks));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
