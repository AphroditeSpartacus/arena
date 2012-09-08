import collections
import functools
import itertools
import math
import operator
import re
import sys

k = 'ABCD'

def func(x, y, z=None):
    for p in k:
        if p != x and p != y and p != z:
            return p

def main():
    n = int(raw_input())
    s = raw_input()
    res = []
    res.append(func(s[0], s[1]))
    for i in xrange(1, 2 * n):
        if i % 2 == 0:
            res.append(func(s[i], s[i + 1], res[-1]))
        else:
            res.append(func(s[i], s[i - 1], res[-1]))
    print ''.join(res)


if __name__ == '__main__':
    main()