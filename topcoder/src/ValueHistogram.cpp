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

class ValueHistogram
{
public:
  vector <string> build(vector <int> values);
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

	template<typename T> ostream& operator<<(ostream &os, const vector<T> &v) { os << "{"; for (typename vector<T>::const_iterator vi=v.begin(); vi!=v.end(); ++vi) { if (vi != v.begin()) os << ","; os << " " << *vi; } os << " }"; return os; }
	template<> ostream& operator<<(ostream &os, const vector<string> &v) { os << "{"; for (vector<string>::const_iterator vi=v.begin(); vi!=v.end(); ++vi) { if (vi != v.begin()) os << ","; os << " \"" << *vi << "\""; } os << " }"; return os; }

	int verify_case(int casenum, const vector <string> &expected, const vector <string> &received, clock_t elapsed) {
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
			int values[]              = {2, 3, 5, 5, 5, 2, 0, 8};
			string expected__[]       = {"..........", ".....X....", "..X..X....", "X.XX.X..X." };

			clock_t start__           = clock();
			vector <string> received__ = ValueHistogram().build(vector <int>(values, values + (sizeof values / sizeof values[0])));
			return verify_case(casenum__, vector <string>(expected__, expected__ + (sizeof expected__ / sizeof expected__[0])), received__, clock()-start__);
		}
		case 1: {
			int values[]              = {9, 9, 9, 9};
			string expected__[]       = {"..........", ".........X", ".........X", ".........X", ".........X" };

			clock_t start__           = clock();
			vector <string> received__ = ValueHistogram().build(vector <int>(values, values + (sizeof values / sizeof values[0])));
			return verify_case(casenum__, vector <string>(expected__, expected__ + (sizeof expected__ / sizeof expected__[0])), received__, clock()-start__);
		}
		case 2: {
			int values[]              = {6, 4, 0, 0, 3, 9, 8, 8};
			string expected__[]       = {"..........", "X.......X.", "X..XX.X.XX" };

			clock_t start__           = clock();
			vector <string> received__ = ValueHistogram().build(vector <int>(values, values + (sizeof values / sizeof values[0])));
			return verify_case(casenum__, vector <string>(expected__, expected__ + (sizeof expected__ / sizeof expected__[0])), received__, clock()-start__);
		}
		case 3: {
			int values[]              = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
			string expected__[]       = {"..........", "XXXXXXXXXX" };

			clock_t start__           = clock();
			vector <string> received__ = ValueHistogram().build(vector <int>(values, values + (sizeof values / sizeof values[0])));
			return verify_case(casenum__, vector <string>(expected__, expected__ + (sizeof expected__ / sizeof expected__[0])), received__, clock()-start__);
		}
		case 4: {
			int values[]              = {6, 2, 3, 3, 3, 7, 8, 1, 0, 9, 2, 2, 4, 3};
			string expected__[]       = {"..........", "...X......", "..XX......", "..XX......", "XXXXX.XXXX" };

			clock_t start__           = clock();
			vector <string> received__ = ValueHistogram().build(vector <int>(values, values + (sizeof values / sizeof values[0])));
			return verify_case(casenum__, vector <string>(expected__, expected__ + (sizeof expected__ / sizeof expected__[0])), received__, clock()-start__);
		}

		// custom cases

/*      case 5: {
			int values[]              = ;
			string expected__[]       = ;

			clock_t start__           = clock();
			vector <string> received__ = ValueHistogram().build(vector <int>(values, values + (sizeof values / sizeof values[0])));
			return verify_case(casenum__, vector <string>(expected__, expected__ + (sizeof expected__ / sizeof expected__[0])), received__, clock()-start__);
		}*/
/*      case 6: {
			int values[]              = ;
			string expected__[]       = ;

			clock_t start__           = clock();
			vector <string> received__ = ValueHistogram().build(vector <int>(values, values + (sizeof values / sizeof values[0])));
			return verify_case(casenum__, vector <string>(expected__, expected__ + (sizeof expected__ / sizeof expected__[0])), received__, clock()-start__);
		}*/
/*      case 7: {
			int values[]              = ;
			string expected__[]       = ;

			clock_t start__           = clock();
			vector <string> received__ = ValueHistogram().build(vector <int>(values, values + (sizeof values / sizeof values[0])));
			return verify_case(casenum__, vector <string>(expected__, expected__ + (sizeof expected__ / sizeof expected__[0])), received__, clock()-start__);
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


vector <string> ValueHistogram::build(vector <int> values)
{
  vector<int> cnt(10);
  for (size_t i = 0; i < (values).size(); ++i) {
    cnt[values[i]]++;
  }
  int m = *max_element((cnt).begin(), (cnt).end());
  #ifdef DEBUG
  cout << m << endl;
#endif
  vector<string> v(m + 1, string(10, '.'));
  #ifdef DEBUG
  print(v);
#endif
  for (int i = 0; i < 10; ++i) {
    for (int j = 0; j < cnt[i]; ++j) {
      v[m - j][i] = 'X';
    }
  }
  return v;
}
