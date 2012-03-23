import java.util.*;

/****************************************************************************
 *                                                                          *
 *                To see the world in a grain of sand,                      *
 *                And a heaven in a wild flower;                            *
 *                Hold infinity in the palm of your hand,                   *
 *                And eternity in an hour.                                  *
 *                                                                          *
 ***************************************************************************/

public class MergersDivTwo {
  public double findMaximum(int[] revenues, int k) {
    return 0;
  }


// BEGIN CUT HERE
  public static void main(String[] args) {
		if (args.length == 0) {
			MergersDivTwoHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				MergersDivTwoHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class MergersDivTwoHarness {
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
	
	static final double MAX_DOUBLE_ERROR = 1E-9;
	static boolean compareOutput(double expected, double result){ if(Double.isNaN(expected)){ return Double.isNaN(result); }else if(Double.isInfinite(expected)){ if(expected > 0){ return result > 0 && Double.isInfinite(result); }else{ return result < 0 && Double.isInfinite(result); } }else if(Double.isNaN(result) || Double.isInfinite(result)){ return false; }else if(Math.abs(result - expected) < MAX_DOUBLE_ERROR){ return true; }else{ double min = Math.min(expected * (1.0 - MAX_DOUBLE_ERROR), expected * (1.0 + MAX_DOUBLE_ERROR)); double max = Math.max(expected * (1.0 - MAX_DOUBLE_ERROR), expected * (1.0 + MAX_DOUBLE_ERROR)); return result > min && result < max; } }
	static double relativeError(double expected, double result) { if (Double.isNaN(expected) || Double.isInfinite(expected) || Double.isNaN(result) || Double.isInfinite(result) || expected == 0) return 0; return Math.abs(result-expected) / Math.abs(expected); }
	
	static String formatResult(double res) {
		return String.format("%.10g", res);
	}
	
	static int verifyCase(int casenum, double expected, double received) { 
		System.err.print("Example " + casenum + "... ");
		if (compareOutput(expected, received)) {
			System.err.print("PASSED");
			double rerr = relativeError(expected, received);
			if (rerr > 0) System.err.printf(" (relative error %g)", rerr);
			System.err.println();
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
			int[] revenues            = {5, -7, 3};
			int k                     = 2;
			double expected__         = 1.5;

			return verifyCase(casenum__, expected__, new MergersDivTwo().findMaximum(revenues, k));
		}
		case 1: {
			int[] revenues            = {5, -7, 3};
			int k                     = 3;
			double expected__         = 0.3333333333333333;

			return verifyCase(casenum__, expected__, new MergersDivTwo().findMaximum(revenues, k));
		}
		case 2: {
			int[] revenues            = {1, 2, 2, 3, -10, 7};
			int k                     = 3;
			double expected__         = 2.9166666666666665;

			return verifyCase(casenum__, expected__, new MergersDivTwo().findMaximum(revenues, k));
		}
		case 3: {
			int[] revenues            = {-100, -100, -100, -100, -100, 100};
			int k                     = 4;
			double expected__         = -66.66666666666667;

			return verifyCase(casenum__, expected__, new MergersDivTwo().findMaximum(revenues, k));
		}
		case 4: {
			int[] revenues            = {869, 857, -938, -290, 79, -901, 32, -907, 256, -167, 510, -965, -826, 808, 890, -233, -881, 255, -709, 506, 334, -184, 726, -406, 204, -912, 325, -445, 440, -368};
			int k                     = 7;
			double expected__         = 706.0369290573373;

			return verifyCase(casenum__, expected__, new MergersDivTwo().findMaximum(revenues, k));
		}

		// custom cases

/*      case 5: {
			int[] revenues            = ;
			int k                     = ;
			double expected__         = ;

			return verifyCase(casenum__, expected__, new MergersDivTwo().findMaximum(revenues, k));
		}*/
/*      case 6: {
			int[] revenues            = ;
			int k                     = ;
			double expected__         = ;

			return verifyCase(casenum__, expected__, new MergersDivTwo().findMaximum(revenues, k));
		}*/
/*      case 7: {
			int[] revenues            = ;
			int k                     = ;
			double expected__         = ;

			return verifyCase(casenum__, expected__, new MergersDivTwo().findMaximum(revenues, k));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
