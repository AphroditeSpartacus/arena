import collections
import functools
import itertools
import math
import operator
import re
import sys
import os

def main():
    n = int(input())
    s = input()
    res = []
    for i in range(n):
        d = dict(A=False, B=False, C=False, D=False)
        d[s[2 * i]] = d[s[2 * i + 1]] = True
        p = [x for x in 'ABCD' if not d[x]]
        if i > 0 and p[0] == res[-1]:
            p[0], p[1] = p[1], p[0]
        res.extend(p)
    print(''.join(res))


if __name__ == '__main__':
    main()