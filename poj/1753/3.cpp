#include <cctype>
#include <climits>
#include <cmath>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <algorithm>
#include <bitset>
#include <deque>
#include <fstream>
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


int func(int n, int m)
{
    int i = m / 4, j = m % 4;
    int next = n;
    next ^= 1 << (i * 4 + j);
    if (i > 0) {
        next ^= 1 << ((i - 1) * 4 + j);
    }
    if (i < 3) {
        next ^= 1 << ((i + 1) * 4 + j);
    }
    if (j > 0) {
        next ^= 1 << (i * 4 + (j - 1));
    }
    if (j < 3) {
        next ^= 1 << (i * 4 + (j + 1));
    }
    return next;
}

int main()
{
    int x = 0;
    for (int i = 0; i < 4; ++i) {
        string s;
        cin >> s;
        for (int j = 0; j < (int)(s).size(); ++j) {
            if (s[j] == 'w') {
                x |= 1 << (i * 4 + j);
            }
        }
    }
    int res = INT_MAX;
    for (int i = 0; i < (1 << 16); ++i) {
        int y = x;
        for (int j = 0; j < 16; ++j) {
            if (i & (1 << j)) {
                y = func(y, j);
            }
        }
        if (y == 0 || y == (1 << 16) - 1) {
            res = min(res, __builtin_popcount(i));
        }
    }
    if (res < INT_MAX) {
        cout << res << endl;
    } else {
        cout << "Impossible" << endl;
    }
}
