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
  int n, k;
  cin >> n >> k;
  vector<int> res;
  for (int i = 0; i < k; ++i) {
    res.push_back(n - i);
  }
  for (int i = 1; i <= n - k; ++i) {
    res.push_back(i);
  }
  for (size_t i = 0; i < (res).size(); ++i) {
    if (i > 0) {
      cout << " ";
    }
    cout << res[i];
  }
  cout << endl;
}
