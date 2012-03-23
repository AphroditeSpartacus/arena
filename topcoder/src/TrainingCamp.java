import java.util.*;

/****************************************************************************
 *                                                                          *
 *                To see the world in a grain of sand,                      *
 *                And a heaven in a wild flower;                            *
 *                Hold infinity in the palm of your hand,                   *
 *                And eternity in an hour.                                  *
 *                                                                          *
 ***************************************************************************/

public class TrainingCamp {
  public String[] determineSolvers(String[] attendance, String[] problemTopics) {
    int n = attendance.length, m = attendance[0].length(), k = problemTopics.length;
    String[] res = new String[n];
    for (int i = 0; i < n; i++) {
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < k; j++) {
        boolean ok = true;
        for (int l = 0; l < m; l++) {
          if (attendance[i].charAt(l) != 'X' && problemTopics[j].charAt(l) == 'X') {
            ok = false;
          }
        }
        sb.append(ok ? 'X' : '-');
      }
      res[i] = sb.toString();
    }
    return res;
  }


// BEGIN CUT HERE
  public static void main(String[] args) {
		if (args.length == 0) {
			TrainingCampHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				TrainingCampHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class TrainingCampHarness {
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
	
	static boolean compareOutput(String[] expected, String[] result) { if (expected.length != result.length) return false; for (int i=0; i<expected.length; ++i) if (!expected[i].equals(result[i])) return false; return true; }

	static String formatResult(String[] res) {
		String ret = "";
		ret += "{";
		for (int i=0; i<res.length; ++i) {
			if (i > 0) ret += ",";
			ret += String.format(" \"%s\"", res[i]);
		}
		ret += " }";
		return ret;
	}
	
	static int verifyCase(int casenum, String[] expected, String[] received) { 
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
			String[] attendance       = {"XXX",
 "XXX",
 "XX-"};
			String[] problemTopics    = {"---",
 "XXX",
 "-XX",
 "XX-"};
			String[] expected__       = {"XXXX", "XXXX", "X--X" };

			return verifyCase(casenum__, expected__, new TrainingCamp().determineSolvers(attendance, problemTopics));
		}
		case 1: {
			String[] attendance       = {"-XXXX",
 "----X",
 "XXX--",
 "X-X-X"};
			String[] problemTopics    = {"X---X",
 "-X---",
 "XXX--",
 "--X--"};
			String[] expected__       = {"-X-X", "----", "-XXX", "X--X" };

			return verifyCase(casenum__, expected__, new TrainingCamp().determineSolvers(attendance, problemTopics));
		}
		case 2: {
			String[] attendance       = {"-----",
 "XXXXX"};
			String[] problemTopics    = {"XXXXX",
 "-----",
 "--X-X"};
			String[] expected__       = {"-X-", "XXX" };

			return verifyCase(casenum__, expected__, new TrainingCamp().determineSolvers(attendance, problemTopics));
		}
		case 3: {
			String[] attendance       = {"-",
 "X",
 "X",
 "-",
 "X"};
			String[] problemTopics    = {"-",
 "X"};
			String[] expected__       = {"X-", "XX", "XX", "X-", "XX" };

			return verifyCase(casenum__, expected__, new TrainingCamp().determineSolvers(attendance, problemTopics));
		}
		case 4: {
			String[] attendance       = {"X----X--X",
 "X--X-X---",
 "--X-X----",
 "XXXX-X-X-",
 "XXXX--XXX"};
			String[] problemTopics    = {"X----X-X-",
 "-----X---",
 "-X----X-X",
 "-X-X-X---",
 "-----X---",
 "X-------X"};
			String[] expected__       = {"-X--XX", "-X--X-", "------", "XX-XX-", "--X--X" };

			return verifyCase(casenum__, expected__, new TrainingCamp().determineSolvers(attendance, problemTopics));
		}

		// custom cases

/*      case 5: {
			String[] attendance       = ;
			String[] problemTopics    = ;
			String[] expected__       = ;

			return verifyCase(casenum__, expected__, new TrainingCamp().determineSolvers(attendance, problemTopics));
		}*/
/*      case 6: {
			String[] attendance       = ;
			String[] problemTopics    = ;
			String[] expected__       = ;

			return verifyCase(casenum__, expected__, new TrainingCamp().determineSolvers(attendance, problemTopics));
		}*/
/*      case 7: {
			String[] attendance       = ;
			String[] problemTopics    = ;
			String[] expected__       = ;

			return verifyCase(casenum__, expected__, new TrainingCamp().determineSolvers(attendance, problemTopics));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
