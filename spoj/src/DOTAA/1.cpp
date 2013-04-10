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

void func()
{
  int n, m, D;
  cin >> n >> m >> D;
  vector<int> v(n);
  for (int i = 0; i < n; ++i) {
    cin >> v[i];
  }
  int cnt = 0;
  for (size_t i = 0; i < (v).size(); ++i) {
    // cnt += (v[i] + D - 1) / D;
    cnt += (v[i] - 1) / D;
  }
  cout << (cnt >= m ? "YES" : "NO") << endl;
}

int main()
{
  int test;
  cin >> test;
  for (int i = 0; i < test; ++i) {
    func();
  }
}
