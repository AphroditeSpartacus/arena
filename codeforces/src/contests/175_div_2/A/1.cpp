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
    int n, k;
    cin >> n >> k;
    vector<int> v1;
    for (int i = 0; i < k; ++i) {
        v1.push_back(n - i);
    }
    for (int i = 0; i < n - k; ++i) {
        v1.push_back(i + 1);
    }
    for (size_t i = 0; i < (v1).size(); ++i) {
        if (i > 0) {
            cout << " ";
        }
        cout << v1[i];
    }
    cout << endl;
}
