/*
  ID:   ph_rock2
  LANG: C++
  PROG: gift1
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

ifstream fin("gift1.in");
ofstream fout("gift1.out");
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
  map<string, int> mp;
  vector<string> v(n);

  for (int i = 0; i < n; ++i) {
    string s;
    cin >> s;
    mp[s] = 0;
    v[i] = s;
  }
  for (int i = 0; i < n; ++i) {
    string s;
    cin >> s;
    int give, m;
    cin >> give >> m;
    if (!m) {
      continue;
    }
    int x = give / m;
    mp[s] -= x * m;
    for (int j = 0; j < m; ++j) {
      cin >> s;
      mp[s] += x;
    }
  }

  for (int i = 0; i < n; ++i) {
    cout << v[i] << " " << mp[v[i]] << endl;
  }
}
