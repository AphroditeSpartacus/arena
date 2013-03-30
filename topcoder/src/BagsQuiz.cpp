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

class BagsQuiz
{
public:
  int checkIfProper(int n, vector <string> actions);
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
			int n                     = 2;
			string actions[]          = {"PUT 1 INSIDE 2"};
			int expected__            = 1;

			clock_t start__           = clock();
			int received__            = BagsQuiz().checkIfProper(n, vector <string>(actions, actions + (sizeof actions / sizeof actions[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 1: {
			int n                     = 2;
			string actions[]          = {"PUT 1 INSIDE 2", "SET 2 LOOSE"};
			int expected__            = 2;

			clock_t start__           = clock();
			int received__            = BagsQuiz().checkIfProper(n, vector <string>(actions, actions + (sizeof actions / sizeof actions[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 2: {
			int n                     = 2;
			string actions[]          = {"PUT 2 INSIDE 1"};
			int expected__            = -1;

			clock_t start__           = clock();
			int received__            = BagsQuiz().checkIfProper(n, vector <string>(actions, actions + (sizeof actions / sizeof actions[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 3: {
			int n                     = 4;
			string actions[]          = {"PUT 3 INSIDE 2", "SWAP 4 WITH 2", "PUT 2 INSIDE 4", "SET 1 LOOSE"};
			int expected__            = 2;

			clock_t start__           = clock();
			int received__            = BagsQuiz().checkIfProper(n, vector <string>(actions, actions + (sizeof actions / sizeof actions[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 4: {
			int n                     = 3;
			string actions[]          = {"PUT 1 INSIDE 2", "PUT 3 INSIDE 1"};
			int expected__            = -1;

			clock_t start__           = clock();
			int received__            = BagsQuiz().checkIfProper(n, vector <string>(actions, actions + (sizeof actions / sizeof actions[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}

		// custom cases

/*      case 5: {
			int n                     = ;
			string actions[]          = ;
			int expected__            = ;

			clock_t start__           = clock();
			int received__            = BagsQuiz().checkIfProper(n, vector <string>(actions, actions + (sizeof actions / sizeof actions[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}*/
/*      case 6: {
			int n                     = ;
			string actions[]          = ;
			int expected__            = ;

			clock_t start__           = clock();
			int received__            = BagsQuiz().checkIfProper(n, vector <string>(actions, actions + (sizeof actions / sizeof actions[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}*/
/*      case 7: {
			int n                     = ;
			string actions[]          = ;
			int expected__            = ;

			clock_t start__           = clock();
			int received__            = BagsQuiz().checkIfProper(n, vector <string>(actions, actions + (sizeof actions / sizeof actions[0])));
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


int BagsQuiz::checkIfProper(int n, vector <string> actions)
{
    vector<bool> onFloor(n, 1);
    vector< vector<int> > contain(n);
    for (size_t i = 0; i < (actions).size(); ++i) {
        cout << i << " " << actions[i] << endl;
        string s = actions[i];
        string dump;
        int a, b;
        stringstream is(s);
        if (s.substr(0, 3) == "PUT") {
            is >> dump >> a >> dump >> b;
            --a, --b;
            if (!onFloor[a] || !onFloor[b]) {
                return -1;
            }
            onFloor[a] = false;
            contain[b].push_back(a);
        } else if (s.substr(0, 3) == "SET") {
            is >> dump >> a >> dump;
            --a;
            if (!onFloor[a]) {
                return -1;
            }
            for (size_t j = 0; j < (contain[a]).size(); ++j) {
                onFloor[contain[a][j]] = true;
            }
            contain[a].clear();
        } else {
            is >> dump >> a >> dump >> b;
            --a, --b;
            if (!onFloor[a] || !onFloor[b]) {
                return -1;
            }
            swap(contain[a], contain[b]);
        }
    }
    #ifdef DEBUG
    print2(contain);
#endif
    for (int i = 0; i < n; ++i) {
        for (size_t j = 0; j < (contain[i]).size(); ++j) {
            int k = contain[i][j];
            if (k > i) {
                return -1;
            }
        }
    }
    int res = 0;
    for (size_t i = 0; i < (onFloor).size(); ++i) {
        if (onFloor[i]) {
            ++res;
        }
    }
    return res;
}
