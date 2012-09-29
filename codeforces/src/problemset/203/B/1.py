import collections
import functools
import itertools
import math
import operator
import re
import sys
from pprint import pprint


def check(a, x, y):
    for i in xrange(3):
        for j in xrange(3):
            ok = True
            for p in xrange(3):
                for q in xrange(3):
                    if not a[x - i + p][y - j + q]:
                        ok = False
                        break
                if not ok:
                    break
            if ok:
                return True
    return False

def main():
    n, m = map(int, raw_input().split())
    a = [[False] * 2000 for i in xrange(2000)]
    for i in xrange(m):
        x, y = map(int, raw_input().split())
        x, y = x + 500, y + 500
        a[x][y] = True
        # print x, y
        # pprint(a)
        if check(a, x, y):
            print i + 1
            return
    print -1


if __name__ == '__main__':
    main()