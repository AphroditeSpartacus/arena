/*
  ID:   ph_rock2
  LANG: C++
  PROG: beads
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

ifstream fin("beads.in");
ofstream fout("beads.out");
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


int func(string s, int idx)
{
  int res = 0;

  char color = 'w';
  for (int k = idx; k < static_cast<int>((s).size()); ++k) {
    if (s[k] == 'w' || color == 'w' || (s[k] == color)) {
      if (s[k] != 'w') {
        color = s[k];
      }
      res++;
    } else {
      break;
    }
  }
  return res;
}

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
  string s;
  cin >> s;
  s = s + s;
  string t = s;
  reverse((t).begin(), (t).end());
  int res = 0;
  for (int i = 0; i < n; ++i) {
    int j = n - i;
    int tmp = 0;

    tmp += func(s, i);
    tmp += func(t, j);
    // cout << i << " " << tmp << " " << func(s, i) << " " << func(t, j) << endl;

    res = max(res, tmp);
  }
  cout << min(res, n) << endl;

}
