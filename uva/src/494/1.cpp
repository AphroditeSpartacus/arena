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
#include <functional>
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

#ifdef DEBUG
#include "/Users/Aphrodite/program/arena/libs/src/cpp/debug.cpp"
#endif

/****************************************************************************
 *                                                                          *
 *                To see the world in a grain of sand,                      *
 *                And a heaven in a wild flower;                            *
 *                Hold infinity in the palm of your hand,                   *
 *                And eternity in an hour.                                  *
 *                                                                          *
 ***************************************************************************/


int main()
{
  string s;
  while (getline(cin, s)) {
    s = s + '.';
    bool ok = false;
    int cnt = 0;
    for (size_t i = 0; i < (s).size(); ++i) {
      if (isalpha(s[i])) {
        if (!ok) {
          ok = true;
        }
      } else {
        if (ok) {
          ok = false;
          ++cnt;
        }
      }
    }
    cout << cnt << endl;
  }
}
