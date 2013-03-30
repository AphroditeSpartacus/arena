#include <algorithm>
#include <bitset>
#include <cctype>
#include <climits>
#include <cmath>
#include <cstddef>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <deque>
#include <fstream>
#include <iomanip>
#include <iostream>
#include <list>
#include <map>
#include <numeric>
#include <queue>
#include <set>
#include <sstream>
#include <stack>
#include <string>
#include <utility>
#include <vector>
using namespace std;

class CasketOfStar
{
public:
  int maxEnergy(vector <int> weight);
};
// BEGIN CUT HERE
/////////////////////////////////////////////////////////////////////////////
#ifdef DEBUG
#include "/Users/Aphrodite/program/arena/libs/src/cpp/print/print.cpp"
#endif

namespace moj_harness {
	int run_test_case(int);
	void run_test(int casenum = -1, bool quiet = false) {
		if (casenum != -1) {
			if (run_test_case(casenum) == -1 && !quiet) {
				cerr << "Illegal input! Test case " << casenum << " does not exist." << endl;
			}
			return;
		}

		int correct = 0, total = 0;
		for (int i=0;; ++i) {
			int x = run_test_case(i);
			if (x == -1) {
				if (i >= 100) break;
				continue;
			}
			correct += x;
			++total;
		}

		if (total == 0) {
			cerr << "No test cases run." << endl;
		} else if (correct < total) {
			cerr << "Some cases FAILED (passed " << correct << " of " << total << ")." << endl;
		} else {
			cerr << "All " << total << " tests passed!" << endl;
		}
	}

	int verify_case(int casenum, const int &expected, const int &received, clock_t elapsed) {
		cerr << "Example " << casenum << "... ";

		string verdict;
		vector<string> info;
		char buf[100];

		if (elapsed > CLOCKS_PER_SEC / 200) {
			sprintf(buf, "time %.2fs", elapsed * (1.0/CLOCKS_PER_SEC));
			info.push_back(buf);
		}

		if (expected == received) {
			verdict = "PASSED";
		} else {
			verdict = "FAILED";
		}

		cerr << verdict;
		if (!info.empty()) {
			cerr << " (";
			for (int i=0; i<(int)info.size(); ++i) {
				if (i > 0) cerr << ", ";
				cerr << info[i];
			}
			cerr << ")";
		}
		cerr << endl;

		if (verdict == "FAILED") {
			cerr << "    Expected: " << expected << endl;
			cerr << "    Received: " << received << endl;
		}

		return verdict == "PASSED";
	}

	int run_test_case(int casenum__) {
		switch (casenum__) {
		case 0: {
			int weight[]              = {1,2,3,4};
			int expected__            = 12;

			clock_t start__           = clock();
			int received__            = CasketOfStar().maxEnergy(vector <int>(weight, weight + (sizeof weight / sizeof weight[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 1: {
			int weight[]              = {100,2,1,3,100};
			int expected__            = 10400;

			clock_t start__           = clock();
			int received__            = CasketOfStar().maxEnergy(vector <int>(weight, weight + (sizeof weight / sizeof weight[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 2: {
			int weight[]              = {2,2,7,6,90,5,9};
			int expected__            = 1818;

			clock_t start__           = clock();
			int received__            = CasketOfStar().maxEnergy(vector <int>(weight, weight + (sizeof weight / sizeof weight[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 3: {
			int weight[]              = {477,744,474,777,447,747,777,474};
			int expected__            = 2937051;

			clock_t start__           = clock();
			int received__            = CasketOfStar().maxEnergy(vector <int>(weight, weight + (sizeof weight / sizeof weight[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 4: {
			int weight[]              = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
			int expected__            = 13;

			clock_t start__           = clock();
			int received__            = CasketOfStar().maxEnergy(vector <int>(weight, weight + (sizeof weight / sizeof weight[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}

		// custom cases

/*      case 5: {
			int weight[]              = ;
			int expected__            = ;

			clock_t start__           = clock();
			int received__            = CasketOfStar().maxEnergy(vector <int>(weight, weight + (sizeof weight / sizeof weight[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}*/
/*      case 6: {
			int weight[]              = ;
			int expected__            = ;

			clock_t start__           = clock();
			int received__            = CasketOfStar().maxEnergy(vector <int>(weight, weight + (sizeof weight / sizeof weight[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}*/
/*      case 7: {
			int weight[]              = ;
			int expected__            = ;

			clock_t start__           = clock();
			int received__            = CasketOfStar().maxEnergy(vector <int>(weight, weight + (sizeof weight / sizeof weight[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}*/
		default:
			return -1;
		}
	}
}


int main(int argc, char *argv[]) {
	if (argc == 1) {
		moj_harness::run_test();
	} else {
		for (int i=1; i<argc; ++i)
			moj_harness::run_test(atoi(argv[i]));
	}
}
/////////////////////////////////////////////////////////////////////////////
// END CUT HERE

/****************************************************************************
 *                                                                          *
 *                To see the world in a grain of sand,                      *
 *                And a heaven in a wild flower;                            *
 *                Hold infinity in the palm of your hand,                   *
 *                And eternity in an hour.                                  *
 *                                                                          *
 ***************************************************************************/


int CasketOfStar::maxEnergy(vector <int> weight)
{
  int n = static_cast<int>((weight).size());
  vector< vector<int> > dp(n, vector<int>(n));
  // for (int len = 3; len <= n; ++len) {
  //   for (int i = 0; i + len <= n; ++i) {
  //     int tmp = 0;
  //     for (int j = i + 1; j < i + len; ++j) {
  //       tmp = max(tmp, weight[i] * weight[i + len - 1] + dp[i][j] + dp[j][i + len - 1]);
  //     }
  //     dp[i][i + len - 1] = tmp;
  //   }
  // }

  for (int dist = 1; dist < n; ++dist) {
    for (int i = 0; i + dist < n; ++i) {
      for (int k = i + 1; k < i + dist; ++k) {
        dp[i][i + dist] = max(dp[i][i + dist], dp[i][k] + dp[k][i + dist] + weight[i] * weight[i + dist]);
      }
    }
  }
  return dp[0][n - 1];
}
