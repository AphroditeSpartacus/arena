import collections
import functools
import itertools
import math
import operator
import re
import sys


def main():
    k = int(raw_input())
    s = raw_input()
    d = collections.defaultdict(int)
    for x in s:
        d[x] += 1
    res = ''
    for key, value in d.items():
        if value % k != 0:
            print -1
            return
        res += key * (value / k)
    print res * k


if __name__ == '__main__':
    main()