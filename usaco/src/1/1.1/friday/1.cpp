/*
  ID:   ph_rock2
  LANG: C++
  PROG: friday
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

ifstream fin("friday.in");
ofstream fout("friday.out");
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


bool is_leap_year(int n)
{
  if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
    return true;
  }
  return false;
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

  int days[2][12] = { {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
                      {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} };
  vector<int> res(7);
  int thirteenth = (1 + (13 - 1)) % 7;

  int n;
  cin >> n;
  for (int i = 0; i < n; ++i) {
    int year = 1900 + i;
    for (int j = 0; j < 12; ++j) {
      ++res[thirteenth];
      thirteenth = (thirteenth + days[is_leap_year(year)][j]) % 7;
    }
  }
  for (int i = 0; i < 7; ++i) {
    if (i) {
      cout << " ";
    }
    cout << res[(i + 6) % 7];
  }
  cout << endl;
}
