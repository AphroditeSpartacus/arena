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

class AlternateColors
{
public:
    string getColor(long long r, long long g, long long b, long long k);
};
// BEGIN CUT HERE
/////////////////////////////////////////////////////////////////////////////
#ifdef DEBUG
#include "/Users/Aphrodite/program/arena/libs/src/cpp/debug.cpp"
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
			long long r               = 1;
			long long g               = 1;
			long long b               = 1;
			long long k               = 3;
			string expected__         = "BLUE";

			clock_t start__           = clock();
			string received__         = AlternateColors().getColor(r, g, b, k);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 1: {
			long long r               = 3;
			long long g               = 4;
			long long b               = 5;
			long long k               = 4;
			string expected__         = "RED";

			clock_t start__           = clock();
			string received__         = AlternateColors().getColor(r, g, b, k);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 2: {
			long long r               = 7;
			long long g               = 7;
			long long b               = 1;
			long long k               = 7;
			string expected__         = "GREEN";

			clock_t start__           = clock();
			string received__         = AlternateColors().getColor(r, g, b, k);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 3: {
			long long r               = 1000000000000LL;
			long long g               = 1;
			long long b               = 1;
			long long k               = 1000000000002LL;
			string expected__         = "RED";

			clock_t start__           = clock();
			string received__         = AlternateColors().getColor(r, g, b, k);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 4: {
			long long r               = 653;
			long long g               = 32;
			long long b               = 1230;
			long long k               = 556;
			string expected__         = "BLUE";

			clock_t start__           = clock();
			string received__         = AlternateColors().getColor(r, g, b, k);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}

		// custom cases

/*      case 5: {
			long long r               = ;
			long long g               = ;
			long long b               = ;
			long long k               = ;
			string expected__         = ;

			clock_t start__           = clock();
			string received__         = AlternateColors().getColor(r, g, b, k);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}*/
/*      case 6: {
			long long r               = ;
			long long g               = ;
			long long b               = ;
			long long k               = ;
			string expected__         = ;

			clock_t start__           = clock();
			string received__         = AlternateColors().getColor(r, g, b, k);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}*/
/*      case 7: {
			long long r               = ;
			long long g               = ;
			long long b               = ;
			long long k               = ;
			string expected__         = ;

			clock_t start__           = clock();
			string received__         = AlternateColors().getColor(r, g, b, k);
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


string AlternateColors :: getColor(long long r, long long g, long long b, long long k)
{
    // long long a = min(r, min(g, b));
    // if (k <= a * 3) {
    //     if (k % 3 == 1) {
    //         return "RED";
    //     } else if (k % 3 == 2) {
    //         return "GREEN";
    //     } else {
    //         return "BLUE";
    //     }
    // }
    // r -= a;
    // g -= a;
    // b -= a;
    // k -= a * 3;

    // if (r == 0) {
    //     a = min(g, b);
    //     if (k <= a * 2) {
    //         if (k % 2 == 1) {
    //             return "GREEN";
    //         } else {
    //             return "BLUE";
    //         }
    //     } else {
    //         if (a == g) {
    //             return "BLUE";
    //         } else {
    //             return "GREEN";
    //         }
    //     }
    // }
    // if (g == 0) {
    //     a = min(r, b);
    //     if (k <= a * 2) {
    //         if (k % 2 == 1) {
    //             return "RED";
    //         } else {
    //             return "BLUE";
    //         }
    //     } else {
    //         if (a == r) {
    //             return "BLUE";
    //         } else {
    //             return "RED";
    //         }
    //     }
    // }
    // if (b == 0) {
    //     a = min(r, g);
    //     if (k <= a * 2) {
    //         if (k % 2 == 1) {
    //             return "RED";
    //         } else {
    //             return "GREEN";
    //         }
    //     } else {
    //         if (a == r) {
    //             return "GREEN";
    //         } else {
    //             return "RED";
    //         }
    //     }
    // }
    while (k > 0) {
        long long aux = 0;
        if (r > 0 && (r < aux || aux == 0)) {
            aux = r;
        }
        if (g > 0 && (g < aux || aux == 0)) {
            aux = g;
        }
        if (b > 0 && (b < aux || aux == 0)) {
            aux = b;
        }
        vector<string> v;
        if (r > 0) {
            v.push_back("RED");
        }
        if (g > 0) {
            v.push_back("GREEN");
        }
        if (b > 0) {
            v.push_back("BLUE");
        }
        if (k <= (v).size() * aux) {
            return v[(k - 1) % (int)(v).size()];
        }
        k -= (int)(v).size() * aux;
        if (r > 0) {
            r -= aux;
        }
        if (g > 0) {
            g -= aux;
        }
        if (b > 0) {
            b -= aux;
        }

    }
}
