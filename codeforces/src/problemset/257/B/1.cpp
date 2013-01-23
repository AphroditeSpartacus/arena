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


pair<int, int> func(const vector<int> &v)
{
  pair<int, int> res;
  for (size_t i = 1; i < (v).size(); ++i) {
    if (v[i] == v[i - 1]) {
      ++res.first;
    } else {
      ++res.second;
    }
  }
  return res;
}

int main()
{
  int n, m;
  cin >> n >> m;
  map<int, int> mp;

  vector< pair<int, int> > res;

  for (int t = 0; t < 2; ++t) {
    vector<int> v;
    mp[0] = n;
    mp[1] = m;

    if (t == 0) {
      v.push_back(0);
      --mp[0];
    } else {
      v.push_back(1);
      --mp[1];
    }

    for (int i = 1; i < n + m; ++i) {
      int x = i % 2 == 0 ? v[i - 1] : 1 - v[i - 1];
      if (mp[x] == 0) {
        x = 1 - x;
      }
      v.push_back(x);
      --mp[x];
    }
    #ifdef DEBUG
    print(v);
#endif
    res.push_back(func(v));
  }
  sort((res).begin(), (res).end());
  cout << res[1].first << " " << res[1].second << endl;
}
