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


int main()
{
    int n = 1000000;
    vector<int> v(n);
    v[1] = 1;
    for (int i = 2; i < n; ++i) {
        // cout << i << endl;
    // for (int i = 2; i < 10; ++i) {
        long long j = i;
        int cnt = 0;
        while (j >= i) {
            ++cnt;
            if (j % 2 == 0) {
                j /= 2;
            } else {
                j = j * 3 + 1;
            }
        }
        v[i] = v[j] + cnt;
    }
    int i, j;
    while (cin >> i >> j) {
        cout << i << " " << j << " ";
        if (i > j) {
            swap(i, j);
        }
        cout << *max_element(v.begin() + i, v.begin() + j + 1) << endl;
    }
}
