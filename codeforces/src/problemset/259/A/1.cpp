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
#include "/Users/Aphrodite/program/arena/libs/src/cpp/debug.cpp"
#endif

/****************************************************************************
 *                                                                          *
 *                To see the world in a grain of sand,                      *
 *                And a heaven in a wild flower;                            *
 *                Hold infinity in the palm of your hand,                   *
 *                And eternity in an hour.                                  *
 *                                                                          *
 ***************************************************************************/


bool check(string& s)
{
    for (int i = 0; i < 8; ++i) {
        if (s == "WBWBWBWB") {
            return true;
        }
        rotate((s).rbegin(), s.rbegin() + 1, (s).rend());
    }
    return false;
}

int main()
{
    for (int i = 0; i < 8; ++i) {
        string s;
        cin >> s;
        if (!check(s)) {
            cout << "NO" << endl;
            return 0;
        }
    }
    cout << "YES" << endl;
}
