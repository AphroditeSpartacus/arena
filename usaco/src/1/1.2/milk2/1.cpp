/*
  ID:   ph_rock2
  LANG: C++
  PROG: milk2
*/

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

ifstream fin("milk2.in");
ofstream fout("milk2.out");
streambuf *cin_buf = cin.rdbuf();
streambuf *cout_buf = cout.rdbuf();

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
  cin.rdbuf(fin.rdbuf());
  cout.rdbuf(fout.rdbuf());
#ifdef DEBUG
  cin.rdbuf(cin_buf);
  cout.rdbuf(cout_buf);
#endif
  /////////////////////////////////////////////////////////////////////////

  int n;
  cin >> n;
  vector< pair<int, int> > v(n);
  for (int i = 0; i < n; ++i) {
    cin >> v[i].first >> v[i].second;
  }
  sort((v).begin(), (v).end());
  int start = v[0].first, end = v[0].second;
  int x = end - start, y = 0;

  for (int i = 1; i < n; ++i) {
    if (v[i].first > end) {
      y = max(y, v[i].first - end);
      start = v[i].first;
      end = v[i].second;
    } else if (v[i].second > end) {
      end = v[i].second;
    }
    x = max(x, end - start);
  }

  cout << x << " " << y << endl;

}
