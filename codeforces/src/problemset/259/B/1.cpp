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


bool check(const vector< vector<int> >& v)
{
    set<int> st;
    for (int i = 0; i < 3; ++i) {
        int sum = accumulate((v[i]).begin(), (v[i]).end(), 0);
        st.insert(sum);
    }
    st.insert(v[0][0] + v[1][1] + v[2][2]);
    if (static_cast<int>((st).size()) == 1) {
        return true;
    } else {
        return false;
    }
}

int main()
{
    vector< vector<int> > v(3, vector<int>(3));
    for (int i = 0; i < 3; ++i) {
        for (int j = 0; j < 3; ++j) {
            cin >> v[i][j];
        }
    }
    #ifdef DEBUG
    print2(v);
#endif

    for (int i = 1; i <= 100000; ++i) {
        v[0][0] = i;
        v[1][1] = v[0][0] + v[0][1] + v[0][2] - v[1][0] - v[1][2];
        v[2][2] = v[0][0] + v[0][1] + v[0][2] - v[2][0] - v[2][1];
        if (v[1][1] < 0 || v[1][1] > 100000 || v[2][2] < 0 || v[2][2] > 100000) {
            continue;
        }
        if (check(v)) {
            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 3; ++j) {
                    if (j) {
                        cout << " ";
                    }
                    cout << v[i][j];
                }
                cout << endl;
            }
            return 0;
        }
    }
}
