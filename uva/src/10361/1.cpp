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
  int n;
  cin >> n;
  string s;
  getline(cin, s);
  for (int i = 0; i < n; ++i) {
    string s1, s2;
    getline(cin, s1);
    getline(cin, s2);
    size_t idx = s1.find("<");
    string a1 = s1.substr(0, idx);
    int idx2 = s1.find(">", idx + 1);
    string a2 = s1.substr(idx + 1, idx2 - idx - 1);
    int idx3 = s1.find("<", idx2 + 1);
    string a3 = s1.substr(idx2 + 1, idx3 - idx2 - 1);
    int idx4 = s1.find(">", idx3 + 1);
    string a4 = s1.substr(idx3 + 1, idx4 - idx3 - 1);
    string a5 = s1.substr(idx4 + 1);

    // cout << "----------" << endl;
    // cout << a1 << endl << a2 << endl << a3 << endl << a4 << endl << a5 << endl;

    cout << a1 + a2 + a3 + a4 + a5 << endl;
    cout << s2.substr(0, static_cast<int>((s2).size()) - 3) + a4 + a3 + a2 + a5 << endl;
  }
}
