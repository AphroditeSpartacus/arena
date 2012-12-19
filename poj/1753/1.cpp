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
    queue< pair<int, int> > q;
    set<int> st;
    st.insert(x);
    q.push(make_pair(0, x));
    while (!q.empty()) {
        pair<int, int> front = q.front();
        q.pop();
        if (front.second == 0 || front.second == (1 << 16) - 1) {
            cout << front.first << endl;
            return 0;
        }
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                int next = front.second;
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
                if (!((st).find(next) != (st).end())) {
                    q.push(make_pair(front.first + 1, next));
                    st.insert(next);
                }
            }
        }
    }
    cout << "Impossible" << endl;
}
