import java.util.*;

/****************************************************************************
 *                                                                          *
 *                To see the world in a grain of sand,                      *
 *                And a heaven in a wild flower;                            *
 *                Hold infinity in the palm of your hand,                   *
 *                And eternity in an hour.                                  *
 *                                                                          *
 ***************************************************************************/

public class AntsMeet {
  public int countAnts(int[] x, int[] y, String direction) {
    int res = 0;
    int n = x.length;
    int total = n;
    int[] dirx = new int[n];
    int[] diry = new int[n];
    for (int i = 0; i < direction.length(); i++) {
      if (direction.charAt(i) == 'N') {
        diry[i] = 1;
      } else if (direction.charAt(i) == 'E') {
        dirx[i] = 1;
      } else if (direction.charAt(i) == 'S') {
        diry[i] = -1;
      } else {
        dirx[i] = -1;
      }
    }
    boolean[] exist = new boolean[n];
    Arrays.fill(exist, true);
    boolean[] disappear = new boolean[n];
//    System.out.println(Arrays.toString(dirx));
//    System.out.println(Arrays.toString(diry));
    while (total > 0) {
//      System.out.println(n + " " + res);
//      System.out.println(Arrays.toString(exist));
//      System.out.println(Arrays.toString(x));
//      System.out.println(Arrays.toString(y));
      Arrays.fill(disappear, false);
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (exist[i] && exist[j] && i != j && x[i] == x[j] && y[i] == y[j]) {
            disappear[i] = true;
            break;
          }
        }
      }
      for (int i = 0; i < n; i++) {
        if (disappear[i] && exist[i]) {
          exist[i] = false;
          total--;
        }
      }
      for (int i = 0; i < n; i++) {
        if (!exist[i]) {
          continue;
        }
        x[i] += dirx[i];
        y[i] += diry[i];
        if (x[i] > 1000 || x[i] < -1000 || y[i] > 1000 || y[i] < -1000) {
          res++;
          exist[i] = false;
          total--;
        }
      }
    }
    return res;
  }


// BEGIN CUT HERE
  public static void main(String[] args) {
		if (args.length == 0) {
			AntsMeetHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				AntsMeetHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class AntsMeetHarness {
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
			int[] x                   = {0,10,20,30};
			int[] y                   = {0,10,20,30};
			String direction          = "NWNE";
			int expected__            = 2;

			return verifyCase(casenum__, expected__, new AntsMeet().countAnts(x, y, direction));
		}
		case 1: {
			int[] x                   = {-10,0,0,10};
			int[] y                   = {0,-10,10,0};
			String direction          = "NEWS";
			int expected__            = 0;

			return verifyCase(casenum__, expected__, new AntsMeet().countAnts(x, y, direction));
		}
		case 2: {
			int[] x                   = {-1,-1,-1,0,0,0,1,1,1};
			int[] y                   = {-1,0,1,-1,0,1,-1,0,1};
			String direction          = "ESEWNNEWW";
			int expected__            = 4;

			return verifyCase(casenum__, expected__, new AntsMeet().countAnts(x, y, direction));
		}
		case 3: {
			int[] x                   = {4,7,6,2,6,5,7,7,8,4,7,8,8,8,5,4,8,9,1,5,9,3,4,0,0,1,0,7,2,6,9,6,3,0,5,5,1,2,0,4,9,7,7,1,8,1,9,2,7,3};
			int[] y                   = {2,3,0,6,8,4,9,0,5,0,2,4,3,8,1,5,0,7,3,7,0,9,8,1,9,4,7,8,1,1,6,6,6,2,8,5,1,9,0,1,1,1,7,0,2,5,4,7,5,3};
			String direction          = "SSNWSWSENSWSESWEWSWSENWNNNESWSWSWWSSWEEWWNWWWNWENN" ;
			int expected__            = 25;

			return verifyCase(casenum__, expected__, new AntsMeet().countAnts(x, y, direction));
		}
		case 4: {
			int[] x                   = {478,-664,759,434,-405,513,565,-396,311,-174,56,993,251,-341,993,-112,242,129,383,513,-78,-341,-148,129,423 ,493,434,-405,478,-148,929,251,56,242,929,-78,423,-664,802,251,759,383,-112,-591,-591,-248,660,660,735,493};
			int[] y                   = {-186,98,948,795,289,-678,948,-170,-195,290,-354,-424,289,-157,-166,150,706,-678,684,-294,-234,36,36,-294,-216 ,-234,427,945,265,-157,265,715,275,715,-186,337,798,-170,427,706,754,961,286,-216,798,286,961,684,-424,337};
			String direction          = "WNSNNSSWWWEENWESNSWSWSEWWEWEWWWNWESNSSNNSNNWWWNESE";
			int expected__            = 44;

			return verifyCase(casenum__, expected__, new AntsMeet().countAnts(x, y, direction));
		}

		// custom cases

/*      case 5: {
			int[] x                   = ;
			int[] y                   = ;
			String direction          = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new AntsMeet().countAnts(x, y, direction));
		}*/
/*      case 6: {
			int[] x                   = ;
			int[] y                   = ;
			String direction          = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new AntsMeet().countAnts(x, y, direction));
		}*/
/*      case 7: {
			int[] x                   = ;
			int[] y                   = ;
			String direction          = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new AntsMeet().countAnts(x, y, direction));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
