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

class SumsOfPerfectPowers
{
public:
  int howMany(int lowerBound, int upperBound);
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
			int lowerBound            = 0;
			int upperBound            = 1;
			int expected__            = 2;

			clock_t start__           = clock();
			int received__            = SumsOfPerfectPowers().howMany(lowerBound, upperBound);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 1: {
			int lowerBound            = 5;
			int upperBound            = 6;
			int expected__            = 1;

			clock_t start__           = clock();
			int received__            = SumsOfPerfectPowers().howMany(lowerBound, upperBound);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 2: {
			int lowerBound            = 25;
			int upperBound            = 30;
			int expected__            = 5;

			clock_t start__           = clock();
			int received__            = SumsOfPerfectPowers().howMany(lowerBound, upperBound);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 3: {
			int lowerBound            = 103;
			int upperBound            = 103;
			int expected__            = 0;

			clock_t start__           = clock();
			int received__            = SumsOfPerfectPowers().howMany(lowerBound, upperBound);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 4: {
			int lowerBound            = 1;
			int upperBound            = 100000;
			int expected__            = 33604;

			clock_t start__           = clock();
			int received__            = SumsOfPerfectPowers().howMany(lowerBound, upperBound);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}

		// custom cases

     case 5: {
			int lowerBound            = 0;
			int upperBound            = 5000000;
			int expected__            = 99;

			clock_t start__           = clock();
			int received__            = SumsOfPerfectPowers().howMany(lowerBound, upperBound);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
/*      case 6: {
			int lowerBound            = ;
			int upperBound            = ;
			int expected__            = ;

			clock_t start__           = clock();
			int received__            = SumsOfPerfectPowers().howMany(lowerBound, upperBound);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}*/
/*      case 7: {
			int lowerBound            = ;
			int upperBound            = ;
			int expected__            = ;

			clock_t start__           = clock();
			int received__            = SumsOfPerfectPowers().howMany(lowerBound, upperBound);
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


int SumsOfPerfectPowers::howMany(int lowerBound, int upperBound)
{
    int upper = sqrt(upperBound) + 1;
    set<long long> st;
    st.insert(0);
    st.insert(1);
    for (int i = 2; i < upper; ++i) {
        long long x = i * i;
        while (x <= upperBound) {
            st.insert(x);
            x *= i;
        }
    }
    #ifdef DEBUG
    cout << static_cast<int>((st).size()) << endl;
#endif

    vector<int> v((st).begin(), (st).end());
    set<int> res;
    bitset<5000005> bs;

    for (size_t i = 0; i < (v).size(); ++i) {
        for (size_t j = i; j < (v).size(); ++j) {
            int tmp = v[i] + v[j];
            if (tmp >= lowerBound && tmp <= upperBound) {
                bs[tmp] = 1;
            }
        }
    }


    // for (__typeof((st).begin()) i = (st).begin();
    //      i != (st).end(); ++i) {
    //     for (__typeof((st).begin()) j = (st).begin();
    //          j != (st).end(); ++j) {
    //         int tmp = *i + *j;
    //         if (tmp >= lowerBound && tmp <= upperBound) {
    //             res.insert(*i + *j);
    //         }
    //     }
    // }

    return bs.count();
}
