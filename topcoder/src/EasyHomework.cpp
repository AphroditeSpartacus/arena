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

class EasyHomework
{
public:
  string determineSign(vector <int> A);
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

	int verify_case(int casenum, const string &expected, const string &received, clock_t elapsed) {
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
			cerr << "    Expected: \"" << expected << "\"" << endl;
			cerr << "    Received: \"" << received << "\"" << endl;
		}

		return verdict == "PASSED";
	}

	int run_test_case(int casenum__) {
		switch (casenum__) {
		case 0: {
			int A[]                   = {5, 7, 2};
			string expected__         = "POSITIVE";

			clock_t start__           = clock();
			string received__         = EasyHomework().determineSign(vector <int>(A, A + (sizeof A / sizeof A[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 1: {
			int A[]                   = {-5, 7, 2};
			string expected__         = "NEGATIVE";

			clock_t start__           = clock();
			string received__         = EasyHomework().determineSign(vector <int>(A, A + (sizeof A / sizeof A[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 2: {
			int A[]                   = {5, 7, 2, 0};
			string expected__         = "ZERO";

			clock_t start__           = clock();
			string received__         = EasyHomework().determineSign(vector <int>(A, A + (sizeof A / sizeof A[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 3: {
			int A[]                   = {3, -14, 159, -26};
			string expected__         = "POSITIVE";

			clock_t start__           = clock();
			string received__         = EasyHomework().determineSign(vector <int>(A, A + (sizeof A / sizeof A[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 4: {
			int A[]                   = {-1000000000};
			string expected__         = "NEGATIVE";

			clock_t start__           = clock();
			string received__         = EasyHomework().determineSign(vector <int>(A, A + (sizeof A / sizeof A[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 5: {
			int A[]                   = {123, -456, 789, -101112, 131415, 161718, 192021, 222324, 252627, 282930, 313233, 343536, 373839, 404142, 434445, 464748, 495051, 525354, 555657};
			string expected__         = "POSITIVE";

			clock_t start__           = clock();
			string received__         = EasyHomework().determineSign(vector <int>(A, A + (sizeof A / sizeof A[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}

		// custom cases

/*      case 6: {
			int A[]                   = ;
			string expected__         = ;

			clock_t start__           = clock();
			string received__         = EasyHomework().determineSign(vector <int>(A, A + (sizeof A / sizeof A[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}*/
/*      case 7: {
			int A[]                   = ;
			string expected__         = ;

			clock_t start__           = clock();
			string received__         = EasyHomework().determineSign(vector <int>(A, A + (sizeof A / sizeof A[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}*/
/*      case 8: {
			int A[]                   = ;
			string expected__         = ;

			clock_t start__           = clock();
			string received__         = EasyHomework().determineSign(vector <int>(A, A + (sizeof A / sizeof A[0])));
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


string EasyHomework::determineSign(vector <int> A)
{
    int cnt = 0;
    for (size_t i = 0; i < (A).size(); ++i) {
        if (A[i] == 0) {
            return "ZERO";
        }
        if (A[i] < 0) {
            ++cnt;
        }
    }
    return cnt % 2 == 0 ? "POSITIVE" : "NEGATIVE";
}
