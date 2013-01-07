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


bool is_palindrome(const string &s)
{
  string t = s;
  reverse((t).begin(), (t).end());
  for (size_t i = 0; i < (s).size(); ++i) {
    if (s[i] != t[i]) {
      return false;
    }
  }
  return true;
}

bool is_mirror(const string &s, const string &alpha_tab, const string &digit_tab)
{
  string t = s;
  reverse((t).begin(), (t).end());
  for (size_t i = 0; i < (s).size(); ++i) {
    char c;
    if (isalpha(s[i])) {
      c = alpha_tab[s[i] - 'A'];
    } else {
      c = digit_tab[s[i] - '0'];
    }
    if (c != t[i]) {
      return false;
    }
  }
  return true;
}

int main()
{
  // ................"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  string alpha_tab = "A...3..HIL.JM.O...2TUVWXY5";

  // ................"0123456789"
  string digit_tab = ".1SE.Z..8.";

  string s;
  while (cin >> s) {
    cout << s << " -- ";
    bool palindrome = is_palindrome(s), mirror = is_mirror(s, alpha_tab, digit_tab);
    if (palindrome && mirror) {
      cout << "is a mirrored palindrome." << endl;
    } else if (palindrome) {
      cout << "is a regular palindrome." << endl;
    } else if (mirror) {
      cout << "is a mirrored string." << endl;
    } else {
      cout << "is not a palindrome." << endl;
    }
    cout << endl;
  }
}
