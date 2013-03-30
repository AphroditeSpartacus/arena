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

class BallsSeparating
{
public:
  int minOperations(vector <int> red, vector <int> green, vector <int> blue);
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
			int red[]                 = {1, 1, 1};
			int green[]               = {1, 1, 1};
			int blue[]                = {1, 1, 1};
			int expected__            = 6;

			clock_t start__           = clock();
			int received__            = BallsSeparating().minOperations(vector <int>(red, red + (sizeof red / sizeof red[0])), vector <int>(green, green + (sizeof green / sizeof green[0])), vector <int>(blue, blue + (sizeof blue / sizeof blue[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 1: {
			int red[]                 = {5};
			int green[]               = {6};
			int blue[]                = {8};
			int expected__            = -1;

			clock_t start__           = clock();
			int received__            = BallsSeparating().minOperations(vector <int>(red, red + (sizeof red / sizeof red[0])), vector <int>(green, green + (sizeof green / sizeof green[0])), vector <int>(blue, blue + (sizeof blue / sizeof blue[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 2: {
			int red[]                 = {4, 6, 5, 7};
			int green[]               = {7, 4, 6, 3};
			int blue[]                = {6, 5, 3, 8};
			int expected__            = 37;

			clock_t start__           = clock();
			int received__            = BallsSeparating().minOperations(vector <int>(red, red + (sizeof red / sizeof red[0])), vector <int>(green, green + (sizeof green / sizeof green[0])), vector <int>(blue, blue + (sizeof blue / sizeof blue[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 3: {
			int red[]                 = {7, 12, 9, 9, 7};
			int green[]               = {7, 10, 8, 8, 9};
			int blue[]                = {8, 9, 5, 6, 13};
			int expected__            = 77;

			clock_t start__           = clock();
			int received__            = BallsSeparating().minOperations(vector <int>(red, red + (sizeof red / sizeof red[0])), vector <int>(green, green + (sizeof green / sizeof green[0])), vector <int>(blue, blue + (sizeof blue / sizeof blue[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 4: {
			int red[]                 = {842398, 491273, 958925, 849859, 771363, 67803, 184892, 391907, 256150, 75799};
			int green[]               = {268944, 342402, 894352, 228640, 903885, 908656, 414271, 292588, 852057, 889141};
			int blue[]                = {662939, 340220, 600081, 390298, 376707, 372199, 435097, 40266, 145590, 505103};
			int expected__            = 7230607;

			clock_t start__           = clock();
			int received__            = BallsSeparating().minOperations(vector <int>(red, red + (sizeof red / sizeof red[0])), vector <int>(green, green + (sizeof green / sizeof green[0])), vector <int>(blue, blue + (sizeof blue / sizeof blue[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}

		// custom cases

/*      case 5: {
			int red[]                 = ;
			int green[]               = ;
			int blue[]                = ;
			int expected__            = ;

			clock_t start__           = clock();
			int received__            = BallsSeparating().minOperations(vector <int>(red, red + (sizeof red / sizeof red[0])), vector <int>(green, green + (sizeof green / sizeof green[0])), vector <int>(blue, blue + (sizeof blue / sizeof blue[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}*/
/*      case 6: {
			int red[]                 = ;
			int green[]               = ;
			int blue[]                = ;
			int expected__            = ;

			clock_t start__           = clock();
			int received__            = BallsSeparating().minOperations(vector <int>(red, red + (sizeof red / sizeof red[0])), vector <int>(green, green + (sizeof green / sizeof green[0])), vector <int>(blue, blue + (sizeof blue / sizeof blue[0])));
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}*/
/*      case 7: {
			int red[]                 = ;
			int green[]               = ;
			int blue[]                = ;
			int expected__            = ;

			clock_t start__           = clock();
			int received__            = BallsSeparating().minOperations(vector <int>(red, red + (sizeof red / sizeof red[0])), vector <int>(green, green + (sizeof green / sizeof green[0])), vector <int>(blue, blue + (sizeof blue / sizeof blue[0])));
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

void dfs(int n, int a, int b, int c,
         const vector<int> &red, const vector<int> &green,
         const vector<int> &blue, int &res)
{
  // cout << a << " " << b << " " << c << endl;

  if (a == -1) {
    for (int i = 0; i < n; ++i) {
      dfs(n, i, b, c, red, green, blue, res);
    }
  } else if (b == -1) {
    for (int i = 0; i < n; ++i) {
      if (i == a) {
        continue;
      }
      dfs(n, a, i, c, red, green, blue, res);
    }
  } else if (c == -1) {
    for (int i = 0; i < n; ++i) {
      if (i == a || i == b) {
        continue;
      }
      dfs(n, a, b, i, red, green, blue, res);
    }
  } else {
    int tmp = 0;
    for (int i = 0; i < n; ++i) {
      int sum = red[i] + green[i] + blue[i];
      if (i == a) {
        tmp += sum - red[i];
      } else if (i == b) {
        tmp += sum - green[i];
      } else if (i == c) {
        tmp += sum - blue[i];
      } else {
        int m = max(red[i], max(green[i], blue[i]));
        tmp += sum - m;
      }
    }
    res = min(res, tmp);
  }
}

int BallsSeparating::minOperations(vector <int> red, vector <int> green, vector <int> blue)
{
  int cnt = 0;
  int n = static_cast<int>((red).size());

  if (accumulate((red).begin(), (red).end(), 0)) {
    ++cnt;
  }
  if (accumulate((green).begin(), (green).end(), 0)) {
    ++cnt;
  }
  if (accumulate((blue).begin(), (blue).end(), 0)) {
    ++cnt;
  }
  if (cnt > n) {
    return -1;
  }
  int res = INT_MAX;

  dfs(n, -1, -1, -1, red, green, blue, res);

  // int res = 0;
  // for (int i = 0; i < n; ++i) {
  //   int sum = red[i] + green[i] + blue[i];
  //   int m = max(red[i], max(green[i], blue[i]));
  //   res += sum - m;
  // }
  return res;

}
