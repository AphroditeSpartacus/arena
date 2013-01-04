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


int dfs(map<int, int>& mp, int x)
{
    if (((mp).find(x) != (mp).end())) {
        return mp[x];
    }
    if (x % 2 == 0) {
        return mp[x] = dfs(mp, x / 2) + 1;
    } else {
        return mp[x] = dfs(mp, x * 3 + 1) + 1;
    }
}

int main()
{
    map<int, int> mp;
    mp[1] = 1;
    for (int i = 2; i < 1000000; ++i) {
    // for (int i = 2; i < 10; ++i) {
        dfs(mp, i);
    }
    #ifdef DEBUG
    // for (__typeof((mp).begin()) i = (mp).begin(); i != (mp).end(); ++i) {
    //     cout << i->first << " " << i->second << endl;
    // }
    cout << mp.size() << endl;
#endif
    int i, j;
    while (cin >> i >> j) {
        cout << i << " " << j << " ";

    }
}
