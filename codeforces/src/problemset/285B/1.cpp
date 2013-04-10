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
#include "/Users/Aphrodite/program/arena/libs/src/cpp/print/print.cpp"
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
  int n, s, t;
  cin >> n >> s >> t;
  vector<int> a(n + 1), p(n + 1);
  for (int i = 1; i <= n; ++i) {
    int tmp;
    cin >> tmp;
    a[i] = tmp;
  }
  int res = 0;
  while (s != t) {
    s = a[s];
    // cout << s << endl;
    if (p[s] == 1) {
      cout << -1 << endl;
      return 0;
    }
    p[s] = 1;
    ++res;
  }
  cout << res << endl;
}
