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
  long long a, b;
  int cnt = 0;
  while (cin >> a >> b) {
    if (a < 0) {
      break;
    }
    cout << "Case " << ++cnt << ": A = " << a << ", limit = " << b << ", number of terms = ";
    int res = 1;
    while (a > 1) {
      if (a % 2 == 0) {
        a /= 2;
      } else {
        a = a * 3 + 1;
        if (a > b) {
          break;
        }
      }
      ++res;
    }
    cout << res << endl;
  }
}
