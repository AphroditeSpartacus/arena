import collections
import functools
import itertools
import math
import operator
import re
import sys


def main():
    x, t, a, b, da, db = map(int, raw_input().split())
    for t1 in xrange(t + 1):
        for t2 in xrange(t + 1):
            p = a - da * t1 if t1 < t else 0
            q = b - db * t2 if t2 < t else 0
            if x == p + q:
                print 'YES'
                return
    print 'NO'


if __name__ == '__main__':
    main()