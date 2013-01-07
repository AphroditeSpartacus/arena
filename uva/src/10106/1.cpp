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


template<size_t N>
class BigInteger
{
public:
  // BigInteger();
  BigInteger(int x);
  BigInteger(const string &s, int base);

  BigInteger &add(const BigInteger &rhs);
  BigInteger &subtract(const BigInteger &rhs);
  BigInteger &multiply(const BigInteger &rhs);
  BigInteger &leftShift(int offset);

  const bitset<N> &getData() const;

  void fromString(const string &s, int base);
  string toString(int base) const;

  BigInteger &operator+=(const BigInteger &rhs);
  BigInteger &operator-=(const BigInteger &rhs);
  BigInteger &operator*=(const BigInteger &rhs);

  static string translateBase(const string &s, int from_base, int to_base);
  static BigInteger max();
  static BigInteger min();

  bool isNegative() const;
  BigInteger &negate();

private:
  bitset<N> data;
};

// template<size_t N>
// BigInteger<N>::BigInteger() {}

template<size_t N>
BigInteger<N>::BigInteger(int x = 0)
{
  bool positive = true;
  if (x < 0) {
    positive = false;
  }
  for (size_t i = 0; i < N && x != 0; ++i, x /= 2) {
    if (x % 2 != 0) {
      data[i] = 1;
    }
  }
  if (!positive) {
    negate();
  }
}

template<size_t N>
BigInteger<N>::BigInteger(const string &s, int base = 10)
{
  fromString(s, base);
}

template<size_t N>
BigInteger<N> &BigInteger<N>::negate()
{
  data.flip();
  for (size_t i = 0; i < N; ++i) {
    data.flip(i);
    if (data[i] == 1) {
      break;
    }
  }
  return *this;
}

template<size_t N>
const bitset<N> &BigInteger<N>::getData() const
{
  return data;
}

template<size_t N>
BigInteger<N> &BigInteger<N>::add(const BigInteger &rhs)
{
  bool carry = false;
  for (size_t i = 0; i < N; ++i) {
    int aux = data[i] + rhs.data[i] + carry;
    carry = aux > 1 ? true : false;
    data[i] = aux % 2;
  }
  return *this;
}

template<size_t N>
BigInteger<N> &BigInteger<N>::subtract(const BigInteger &rhs)
{
  BigInteger aux(rhs);
  aux.negate();
  add(aux);
  return *this;
}

// template<size_t N>
// BigInteger<N> &BigInteger<N>::multiply(const BigInteger &rhs)
// {
//   BigInteger aux(*this);
//   data.reset();
//   int cur = 0;
//   for (size_t i = 0; i < N; ++i) {
//     if (rhs.getData()[i] == 1) {
//       aux.leftShift(i - cur);
//       cur = i;
//       add(aux);
//     }
//   }
//   return *this;
// }

template<size_t N>
BigInteger<N> &BigInteger<N>::multiply(const BigInteger &rhs)
{
  BigInteger aux(*this);
  data.reset();
  bool positive = !rhs.isNegative();
  const BigInteger &helper = positive ? rhs : BigInteger(rhs).negate();
  int cur = 0;
  for (size_t i = 0; i < N; ++i) {
    if (helper.getData()[i] == 1) {
      aux.leftShift(i - cur);
      cur = i;
      add(aux);
    }
  }
  if (!positive) {
    negate();
  }
  return *this;
}

template<size_t N>
BigInteger<N> &BigInteger<N>::leftShift(int offset)
{
  for (int i = N - 1; i >= offset; --i) {
    data[i] = data[i - offset];
  }
  for (int i = 0; i < offset; ++i) {
    data[i] = 0;
  }
  return *this;
}

template<size_t N>
string BigInteger<N>::translateBase(const string &s, int from_base, int to_base)
{
  string tab = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  map<char, int> tab_map;
  for (size_t i = 0; i < (tab).size(); ++i) {
    tab_map[tab[i]] = static_cast<int>(i);
  }
  string aux = s;
  string res;
  while (!aux.empty()) {
    int div = 0, mod = 0;
    string nextAux;
    for (size_t i = 0; i < (aux).size(); ++i) {
      int tmp = tab_map[aux[i]] + mod * from_base;
      div = tmp / to_base;
      mod = tmp % to_base;
      if (div > 0 || !nextAux.empty()) {
        nextAux.push_back(div + '0');
      }
    }
    res.push_back(tab[mod]);
    aux = nextAux;
  }
  reverse((res).begin(), (res).end());
  return res;
}

template<size_t N>
BigInteger<N> BigInteger<N>::max()
{
  BigInteger res(string(N - 1, '1'), 2);
  return res;
}

template<size_t N>
BigInteger<N> BigInteger<N>::min()
{
  BigInteger res("1" + string(N - 1, '0'), 2);
  return res;
}

template<size_t N>
bool BigInteger<N>::isNegative() const
{
  return data.test(N - 1);
}

template<size_t N>
void BigInteger<N>::fromString(const string &s, int base = 10)
{
  data.reset();
  string aux = s;
  bool positive = true;
  if (aux[0] == '-') {
    positive = false;
    aux = aux.substr(1);
  }
  for (size_t i = 0; i < (aux).size(); ++i) {
    aux[i] = toupper(aux[i]);
  }
  string res = translateBase(aux, base, 2);
  for (size_t i = 0; i < (res).size(); ++i) {
    if (res[res.size() - i - 1] == '1') {
      data[i] = 1;
    }
  }
  if (!positive) {
    negate();
  }
}

template<size_t N>
string BigInteger<N>::toString(int base = 10) const
{
  BigInteger<N> helper = *this;
  bool positive = true;
  if (helper.isNegative()) {
    helper.negate();
    positive = false;
  }
  string aux = helper.getData().to_string();
  string res = translateBase(aux, 2, base);
  if (!positive) {
    res = "-" + res;
  }
  return res;
}

template<size_t N>
BigInteger<N> &BigInteger<N>::operator+=(const BigInteger &rhs)
{
  add(rhs);
  return *this;
}

template<size_t N>
BigInteger<N> &BigInteger<N>::operator-=(const BigInteger &rhs)
{
  subtract(rhs);
  return *this;
}

template<size_t N>
BigInteger<N> &BigInteger<N>::operator*=(const BigInteger &rhs)
{
  multiply(rhs);
  return *this;
}

////////////////////////////////////////////////////////////

template<size_t N>
ostream &operator<<(ostream &os, const BigInteger<N> &bigInteger)
{
  os << bigInteger.toString();
  return os;
}

template<size_t N>
istream &operator>>(istream &is, BigInteger<N> &bigInteger)
{
  string s;
  is >> s;
  bigInteger.fromString(s);
  if (!is) {
    bigInteger = BigInteger<N>();
  }
  return is;
}

template<size_t N>
BigInteger<N> operator+(const BigInteger<N> &lhs, const BigInteger<N> &rhs)
{
  BigInteger<N> res(lhs);
  res += rhs;
  return res;
}

template<size_t N>
BigInteger<N> operator-(const BigInteger<N> &lhs, const BigInteger<N> &rhs)
{
  BigInteger<N> res(lhs);
  res -= rhs;
  return res;
}

template<size_t N>
BigInteger<N> operator*(const BigInteger<N> &lhs, const BigInteger<N> &rhs)
{
  BigInteger<N> res(lhs);
  res *= rhs;
  return res;
}

////////////////////////////////////////////////////////////

typedef BigInteger<2048> integer;

////////////////////////////////////////////////////////////

int main()
{
  string a, b;
  // cout << integer::max() << endl;
  while (cin >> a >> b) {
    cout << integer(a) * integer(b) << endl;
  }
}
