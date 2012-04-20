import java.util.*;

/****************************************************************************
 *                                                                          *
 *                To see the world in a grain of sand,                      *
 *                And a heaven in a wild flower;                            *
 *                Hold infinity in the palm of your hand,                   *
 *                And eternity in an hour.                                  *
 *                                                                          *
 ***************************************************************************/

public class PlatypusPaternity {
  public int maxFamily(String[] femaleCompatibility, String[] maleCompatibility, String[] siblingGroups) {
    int res = 0;
    for (int i = 0; i < femaleCompatibility.length; i++) {
      for (int j = 0; j < maleCompatibility.length; j++) {
        out:
        for (int k = 0; k < siblingGroups.length; k++) {
          int cnt = 0;
          for (int l = 0; l < siblingGroups[k].length(); l++) {
            if (siblingGroups[k].charAt(l) == 'Y') {
              if (femaleCompatibility[i].charAt(l) == 'Y' && maleCompatibility[j].charAt(l) == 'Y') {
                cnt++;
              } else {
                continue out;
              }
            }
          }
          res = Math.max(res, cnt);
        }
      }
    }
    if (res > 0) {
      res += 2;
    }
    return res;
  }


// BEGIN CUT HERE
  public static void main(String[] args) {
		if (args.length == 0) {
			PlatypusPaternityHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				PlatypusPaternityHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class PlatypusPaternityHarness {
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
			String[] femaleCompatibility = {"YYYY", "YYYY"};
			String[] maleCompatibility = {"NNYN", "YYYN"};
			String[] siblingGroups    = {"YYYN", "NNNY"};
			int expected__            = 5;

			return verifyCase(casenum__, expected__, new PlatypusPaternity().maxFamily(femaleCompatibility, maleCompatibility, siblingGroups));
		}
		case 1: {
			String[] femaleCompatibility = {"NNYYY"};
			String[] maleCompatibility = {"YYNNN"};
			String[] siblingGroups    = {"YYNNN", "NNYYY"};
			int expected__            = 0;

			return verifyCase(casenum__, expected__, new PlatypusPaternity().maxFamily(femaleCompatibility, maleCompatibility, siblingGroups));
		}
		case 2: {
			String[] femaleCompatibility = {"YYYYYYYYN"};
			String[] maleCompatibility = {"YYYYYYYYY"};
			String[] siblingGroups    = {"YNYNYNYNY",
 "NNNYNYNNN",
 "NYNNNNNYN"};
			int expected__            = 4;

			return verifyCase(casenum__, expected__, new PlatypusPaternity().maxFamily(femaleCompatibility, maleCompatibility, siblingGroups));
		}
		case 3: {
			String[] femaleCompatibility = {"YY"};
			String[] maleCompatibility = {"YY"};
			String[] siblingGroups    = {"YN", "NY"};
			int expected__            = 3;

			return verifyCase(casenum__, expected__, new PlatypusPaternity().maxFamily(femaleCompatibility, maleCompatibility, siblingGroups));
		}
		case 4: {
			String[] femaleCompatibility = {"YYNNYYNNYYNN",
 "YNYNYNYNYNYN",
 "YYYNNNYYYNNN"};
			String[] maleCompatibility = {"NYYNNYYNNYYN",
 "YYNYYYNYYYNY",
 "NNNNNNYYYYYY"};
			String[] siblingGroups    = {"NYNNNYNNNNNN",
 "NNNNNNNNYNNN",
 "NNYNNNNNNNYN",
 "YNNNNNNYNNNN",
 "NNNNNNNNNYNY",
 "NNNYYNYNNNNN"};
			int expected__            = 4;

			return verifyCase(casenum__, expected__, new PlatypusPaternity().maxFamily(femaleCompatibility, maleCompatibility, siblingGroups));
		}

		// custom cases

/*      case 5: {
			String[] femaleCompatibility = ;
			String[] maleCompatibility = ;
			String[] siblingGroups    = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new PlatypusPaternity().maxFamily(femaleCompatibility, maleCompatibility, siblingGroups));
		}*/
/*      case 6: {
			String[] femaleCompatibility = ;
			String[] maleCompatibility = ;
			String[] siblingGroups    = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new PlatypusPaternity().maxFamily(femaleCompatibility, maleCompatibility, siblingGroups));
		}*/
/*      case 7: {
			String[] femaleCompatibility = ;
			String[] maleCompatibility = ;
			String[] siblingGroups    = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new PlatypusPaternity().maxFamily(femaleCompatibility, maleCompatibility, siblingGroups));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
