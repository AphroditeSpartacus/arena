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

class MarbleDecoration
{
public:
  int maxLength(int R, int G, int B);
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
			int R                     = 0;
			int G                     = 0;
			int B                     = 0;
			int expected__            = 0;

			clock_t start__           = clock();
			int received__            = MarbleDecoration().maxLength(R, G, B);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 1: {
			int R                     = 3;
			int G                     = 0;
			int B                     = 0;
			int expected__            = 1;

			clock_t start__           = clock();
			int received__            = MarbleDecoration().maxLength(R, G, B);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 2: {
			int R                     = 5;
			int G                     = 1;
			int B                     = 2;
			int expected__            = 5;

			clock_t start__           = clock();
			int received__            = MarbleDecoration().maxLength(R, G, B);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 3: {
			int R                     = 7;
			int G                     = 7;
			int B                     = 4;
			int expected__            = 14;

			clock_t start__           = clock();
			int received__            = MarbleDecoration().maxLength(R, G, B);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 4: {
			int R                     = 2;
			int G                     = 3;
			int B                     = 5;
			int expected__            = 7;

			clock_t start__           = clock();
			int received__            = MarbleDecoration().maxLength(R, G, B);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 5: {
			int R                     = 13;
			int G                     = 13;
			int B                     = 13;
			int expected__            = 26;

			clock_t start__           = clock();
			int received__            = MarbleDecoration().maxLength(R, G, B);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}

		// custom cases

/*      case 6: {
			int R                     = ;
			int G                     = ;
			int B                     = ;
			int expected__            = ;

			clock_t start__           = clock();
			int received__            = MarbleDecoration().maxLength(R, G, B);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}*/
/*      case 7: {
			int R                     = ;
			int G                     = ;
			int B                     = ;
			int expected__            = ;

			clock_t start__           = clock();
			int received__            = MarbleDecoration().maxLength(R, G, B);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}*/
/*      case 8: {
			int R                     = ;
			int G                     = ;
			int B                     = ;
			int expected__            = ;

			clock_t start__           = clock();
			int received__            = MarbleDecoration().maxLength(R, G, B);
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


int func(int a, int b)
{
    if (a == 0 && b == 0) {
        return 0;
    } else if (a == 0 || b == 0) {
        return 1;
    }
    int x = min(a, b);
    int y = 0;
    if (a > x || b > x) {
        y = 1;
    }
    return x * 2 + y;
}

int MarbleDecoration::maxLength(int R, int G, int B)
{
    int res = func(R, G);
    res = max(res, func(R, B));
    res = max(res, func(G, B));
    return res;
}
