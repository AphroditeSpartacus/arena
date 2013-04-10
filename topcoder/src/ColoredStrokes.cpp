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

class ColoredStrokes
{
public:
  int getLeast(vector <string> picture);
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
			string picture[]          = {"...",
 "..."};
			int expected__            = 0;

			clock_t start__           = clock();
			int received__            = ColoredStrokes().getLeast(vector <string>(picture, picture + (sizeof picture / sizeof picture[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 1: {
			string picture[]          = {"..B.",
 "..B."};
			int expected__            = 1;

			clock_t start__           = clock();
			int received__            = ColoredStrokes().getLeast(vector <string>(picture, picture + (sizeof picture / sizeof picture[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 2: {
			string picture[]          = {".BB."};
			int expected__            = 2;

			clock_t start__           = clock();
			int received__            = ColoredStrokes().getLeast(vector <string>(picture, picture + (sizeof picture / sizeof picture[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 3: {
			string picture[]          = {"...B..",
 ".BRGRR",
 ".B.B.."};
			int expected__            = 3;

			clock_t start__           = clock();
			int received__            = ColoredStrokes().getLeast(vector <string>(picture, picture + (sizeof picture / sizeof picture[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 4: {
			string picture[]          = {"...B..",
 ".BRBRR",
 ".B.B.."};
			int expected__            = 4;

			clock_t start__           = clock();
			int received__            = ColoredStrokes().getLeast(vector <string>(picture, picture + (sizeof picture / sizeof picture[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 5: {
			string picture[]          = {"GR",
 "BG"};
			int expected__            = 4;

			clock_t start__           = clock();
			int received__            = ColoredStrokes().getLeast(vector <string>(picture, picture + (sizeof picture / sizeof picture[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}

		// custom cases

/*      case 6: {
			string picture[]          = ;
			int expected__            = ;

			clock_t start__           = clock();
			int received__            = ColoredStrokes().getLeast(vector <string>(picture, picture + (sizeof picture / sizeof picture[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}*/
/*      case 7: {
			string picture[]          = ;
			int expected__            = ;

			clock_t start__           = clock();
			int received__            = ColoredStrokes().getLeast(vector <string>(picture, picture + (sizeof picture / sizeof picture[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}*/
/*      case 8: {
			string picture[]          = ;
			int expected__            = ;

			clock_t start__           = clock();
			int received__            = ColoredStrokes().getLeast(vector <string>(picture, picture + (sizeof picture / sizeof picture[0])));
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


int ColoredStrokes::getLeast(vector <string> picture)
{
  int h = static_cast<int>((picture).size());
  int w = static_cast<int>((picture[0]).size());
  int res = 0;
  for (int i = 0; i < h; ++i) {
    int count = 0;
    for (int j = 0; j < w; ++j) {
      if (picture[i][j] == 'R' || picture[i][j] == 'G') {
        if (count == 0) {
          count = 1;
          ++res;
        }
      } else {
        count = 0;
      }
    }
  }

  for (int i = 0; i < w; ++i) {
    bool count = 0;
    for (int j = 0; j < h; ++j) {
      if (picture[j][i] == 'B' || picture[j][i] == 'G') {
        if (!count) {
          count = true;
          ++res;
        }
      } else {
        count = false;
      }
    }
  }

  return res;
}
