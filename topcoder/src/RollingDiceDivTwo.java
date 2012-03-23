import java.util.*;

/****************************************************************************
 *                                                                          *
 *                To see the world in a grain of sand,                      *
 *                And a heaven in a wild flower;                            *
 *                Hold infinity in the palm of your hand,                   *
 *                And eternity in an hour.                                  *
 *                                                                          *
 ***************************************************************************/

public class RollingDiceDivTwo {
  public int minimumFaces(String[] rolls) {
    int[] a = new int[rolls[0].length()];
    for (int i = 0; i < rolls.length; i++) {
      char[] c = rolls[i].toCharArray();
      Arrays.sort(c);
      for (int j = 0; j < a.length; j++) {
        a[j] = Math.max(a[j], c[j] - '0');
      }
    }
    int res = 0;
    for (int i = 0; i < a.length; i++) {
      res += a[i];
    }
    return res;
  }


// BEGIN CUT HERE
  public static void main(String[] args) {
		if (args.length == 0) {
			RollingDiceDivTwoHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				RollingDiceDivTwoHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class RollingDiceDivTwoHarness {
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
			String[] rolls            = {"137", "364", "115", "724"};
			int expected__            = 14;

			return verifyCase(casenum__, expected__, new RollingDiceDivTwo().minimumFaces(rolls));
		}
		case 1: {
			String[] rolls            = {"1112", "1111", "1211", "1111"};
			int expected__            = 5;

			return verifyCase(casenum__, expected__, new RollingDiceDivTwo().minimumFaces(rolls));
		}
		case 2: {
			String[] rolls            = {"24412", "56316", "66666", "45625"};
			int expected__            = 30;

			return verifyCase(casenum__, expected__, new RollingDiceDivTwo().minimumFaces(rolls));
		}
		case 3: {
			String[] rolls            = {"931", "821", "156", "512", "129", "358", "555"};
			int expected__            = 19;

			return verifyCase(casenum__, expected__, new RollingDiceDivTwo().minimumFaces(rolls));
		}
		case 4: {
			String[] rolls            = {"3", "7", "4", "2", "4"};
			int expected__            = 7;

			return verifyCase(casenum__, expected__, new RollingDiceDivTwo().minimumFaces(rolls));
		}
		case 5: {
			String[] rolls            = {"281868247265686571829977999522", "611464285871136563343229916655", "716739845311113736768779647392", "779122814312329463718383927626",
"571573431548647653632439431183", "547362375338962625957869719518", "539263489892486347713288936885", "417131347396232733384379841536"};
			int expected__            = 176;

			return verifyCase(casenum__, expected__, new RollingDiceDivTwo().minimumFaces(rolls));
		}

		// custom cases

/*      case 6: {
			String[] rolls            = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new RollingDiceDivTwo().minimumFaces(rolls));
		}*/
/*      case 7: {
			String[] rolls            = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new RollingDiceDivTwo().minimumFaces(rolls));
		}*/
/*      case 8: {
			String[] rolls            = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new RollingDiceDivTwo().minimumFaces(rolls));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
