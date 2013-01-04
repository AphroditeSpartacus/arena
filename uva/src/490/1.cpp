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
    vector<string> v;
    string s;
    while (getline(cin, s)) {
        v.push_back(s);
    }
    int len = 0;
    for (size_t i = 0; i < (v).size(); ++i) {
        len = max(len, static_cast<int>((v[i]).size()));
    }
    for (size_t i = 0; i < (v).size(); ++i) {
        while (static_cast<int>((v[i]).size()) < len) {
            v[i] += " ";
        }
    }

    for (int i = 0; i < len; ++i) {
        // cout << i << endl;
        for (int j = (v).size() - 1; j >= 0; --j) {
            // cout << i << " " << j << endl;
            cout << v[j][i];
        }
        cout << endl;
    }
    #ifdef DEBUG
    print(v);
#endif
}
