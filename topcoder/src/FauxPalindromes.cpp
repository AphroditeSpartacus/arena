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

class FauxPalindromes
{
public:
    string classifyIt(string word);
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
			string word               = "ANA";
			string expected__         = "PALINDROME";

			clock_t start__           = clock();
			string received__         = FauxPalindromes().classifyIt(word);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 1: {
			string word               = "AAAAANNAA";
			string expected__         = "FAUX";

			clock_t start__           = clock();
			string received__         = FauxPalindromes().classifyIt(word);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 2: {
			string word               = "LEGENDARY";
			string expected__         = "NOT EVEN FAUX";

			clock_t start__           = clock();
			string received__         = FauxPalindromes().classifyIt(word);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 3: {
			string word               = "XXXYTYYTTYX";
			string expected__         = "FAUX";

			clock_t start__           = clock();
			string received__         = FauxPalindromes().classifyIt(word);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 4: {
			string word               = "TOPCOODEREDOOCPOT";
			string expected__         = "PALINDROME";

			clock_t start__           = clock();
			string received__         = FauxPalindromes().classifyIt(word);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 5: {
			string word               = "TOPCODEREDOOCPOT";
			string expected__         = "FAUX";

			clock_t start__           = clock();
			string received__         = FauxPalindromes().classifyIt(word);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}
		case 6: {
			string word               = "XXXXYYYYYZZXXYYY";
			string expected__         = "NOT EVEN FAUX";

			clock_t start__           = clock();
			string received__         = FauxPalindromes().classifyIt(word);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}

		// custom cases

/*      case 7: {
			string word               = ;
			string expected__         = ;

			clock_t start__           = clock();
			string received__         = FauxPalindromes().classifyIt(word);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}*/
/*      case 8: {
			string word               = ;
			string expected__         = ;

			clock_t start__           = clock();
			string received__         = FauxPalindromes().classifyIt(word);
			return verify_case(casenum__, expected__, received__, clock()-start__);
		}*/
/*      case 9: {
			string word               = ;
			string expected__         = ;

			clock_t start__           = clock();
			string received__         = FauxPalindromes().classifyIt(word);
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


string FauxPalindromes :: classifyIt(string word)
{
    string aux = word;
    reverse((aux).begin(), (aux).end());
#ifdef DEBUG
    cout << aux << endl;
#endif
    if (aux == word) {
        return "PALINDROME";
    }

    aux = "";
    char pre = '*';
    for (size_t i = 0; i < (word).size(); ++i) {
        if (word[i] != pre) {
            aux += pre;
            pre = word[i];
        }
    }
    aux += pre;
    aux = aux.substr(1);
    word = aux;
    reverse((aux).begin(), (aux).end());
    #ifdef DEBUG
    cout << aux << endl;
#endif
    if (aux == word) {
        return "FAUX";
    }
    return "NOT EVEN FAUX";
}
