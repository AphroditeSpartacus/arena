import java.util.*;

/****************************************************************************
 *                                                                          *
 *                To see the world in a grain of sand,                      *
 *                And a heaven in a wild flower;                            *
 *                Hold infinity in the palm of your hand,                   *
 *                And eternity in an hour.                                  *
 *                                                                          *
 ***************************************************************************/

public class AkariDaisukiDiv2 {
  public int countTuples(String S) {
    Set<String[]> set = new HashSet<String[]>();
    int n = S.length();
    for (int i = 1; i < n; i++) {
      String a = S.substring(0, i);
      for (int j = i + 1; j < n; j++) {
        String x = S.substring(i, j);
        for (int k = j + 1; k < n; k++) {
          String b = S.substring(j, k);
          for (int l = k + 1; l < n; l++) {
            String y = S.substring(k, l);
            if (!x.equals(y)) {
              continue;
            }
            String c = S.substring(l);
            String[] tmp = new String[4];
            tmp[0] = a;
            tmp[1] = b;
            tmp[2] = c;
            tmp[3] = x;
            set.add(tmp);
          }
        }
      }
    }
    return set.size();
  }


// BEGIN CUT HERE
  public static void main(String[] args) {
		if (args.length == 0) {
			AkariDaisukiDiv2Harness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				AkariDaisukiDiv2Harness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class AkariDaisukiDiv2Harness {
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
			String S                  = "topcoderdivtwo";
			int expected__            = 2;

			return verifyCase(casenum__, expected__, new AkariDaisukiDiv2().countTuples(S));
		}
		case 1: {
			String S                  = "foxciel";
			int expected__            = 0;

			return verifyCase(casenum__, expected__, new AkariDaisukiDiv2().countTuples(S));
		}
		case 2: {
			String S                  = "magicalgirl";
			int expected__            = 4;

			return verifyCase(casenum__, expected__, new AkariDaisukiDiv2().countTuples(S));
		}
		case 3: {
			String S                  = "waaiusushioakariusushiodaisuki";
			int expected__            = 75;

			return verifyCase(casenum__, expected__, new AkariDaisukiDiv2().countTuples(S));
		}
		case 4: {
			String S                  = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
			int expected__            = 8924;

			return verifyCase(casenum__, expected__, new AkariDaisukiDiv2().countTuples(S));
		}

		// custom cases

/*      case 5: {
			String S                  = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new AkariDaisukiDiv2().countTuples(S));
		}*/
/*      case 6: {
			String S                  = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new AkariDaisukiDiv2().countTuples(S));
		}*/
/*      case 7: {
			String S                  = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new AkariDaisukiDiv2().countTuples(S));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
