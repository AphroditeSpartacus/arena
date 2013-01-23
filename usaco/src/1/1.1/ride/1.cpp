/*
  ID:   ph_rock2
  LANG: C++
  PROG: ride
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

ifstream fin("ride.in");
ofstream fout("ride.out");
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


int func(string s)
{
  int sum = 1;
  for (size_t i = 0; i < (s).size(); ++i) {
    sum *= s[i] - 'A' + 1;
  }

  return sum % 47;
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

  string a, b;
  cin >> a >> b;
  cout << (func(a) == func(b) ? "GO" : "STAY") << endl;

}
