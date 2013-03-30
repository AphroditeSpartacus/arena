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

class DistanceBetweenStrings
{
public:
  int getDistance(string a, string b, string letterSet);
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
			string a                  = "topcoder";
			string b                  = "contest";
			string letterSet          = "tcp";
			int expected__            = 2;

			clock_t start__           = clock();
			int received__            = DistanceBetweenStrings().getDistance(a, b, letterSet);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 1: {
			string a                  = "abcdef";
			string b                  = "fedcba";
			string letterSet          = "fed";
			int expected__            = 0;

			clock_t start__           = clock();
			int received__            = DistanceBetweenStrings().getDistance(a, b, letterSet);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 2: {
			string a                  = "aaaaa";
			string b                  = "bbbbb";
			string letterSet          = "a";
			int expected__            = 25;

			clock_t start__           = clock();
			int received__            = DistanceBetweenStrings().getDistance(a, b, letterSet);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 3: {
			string a                  = "aaAaB";
			string b                  = "BbaAa";
			string letterSet          = "ab";
			int expected__            = 2;

			clock_t start__           = clock();
			int received__            = DistanceBetweenStrings().getDistance(a, b, letterSet);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 4: {
			string a                  = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
			string b                  = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
			string letterSet          = "ba";
			int expected__            = 5000;

			clock_t start__           = clock();
			int received__            = DistanceBetweenStrings().getDistance(a, b, letterSet);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 5: {
			string a                  = "ToPcOdEr";
			string b                  = "tOpCoDeR";
			string letterSet          = "wxyz";
			int expected__            = 0;

			clock_t start__           = clock();
			int received__            = DistanceBetweenStrings().getDistance(a, b, letterSet);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}

		// custom cases

/*      case 6: {
			string a                  = ;
			string b                  = ;
			string letterSet          = ;
			int expected__            = ;

			clock_t start__           = clock();
			int received__            = DistanceBetweenStrings().getDistance(a, b, letterSet);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}*/
/*      case 7: {
			string a                  = ;
			string b                  = ;
			string letterSet          = ;
			int expected__            = ;

			clock_t start__           = clock();
			int received__            = DistanceBetweenStrings().getDistance(a, b, letterSet);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}*/
/*      case 8: {
			string a                  = ;
			string b                  = ;
			string letterSet          = ;
			int expected__            = ;

			clock_t start__           = clock();
			int received__            = DistanceBetweenStrings().getDistance(a, b, letterSet);
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


int DistanceBetweenStrings::getDistance(string a, string b, string letterSet)
{
    for (size_t i = 0; i < (a).size(); ++i) {
        a[i] = tolower(a[i]);
    }
    for (size_t i = 0; i < (b).size(); ++i) {
        b[i] = tolower(b[i]);
    }
    map<char, int> ma, mb;
    for (size_t i = 0; i < (a).size(); ++i) {
        ++ma[a[i]];
    }
    for (size_t i = 0; i < (b).size(); ++i) {
        ++mb[b[i]];
    }
    #ifdef DEBUG
    printp(ma);
    printp(mb);
#endif
    int res = 0;
    for (size_t i = 0; i < (letterSet).size(); ++i) {
        int tmp = ma[letterSet[i]] - mb[letterSet[i]];
        res += tmp * tmp;
    }
    return res;
}
