import collections
import functools
import itertools
import math
import operator
import re
import sys
from pprint import pprint

def radix_sort(a):
    n, m = len(a), len(a[0])
    idxes = range(n)
    for k in xrange(m - 1, -1, -1):
        d = collections.defaultdict(list)
        for idx in idxes:
            d[a[idx][k]].append(idx)
        idxes = list(itertools.chain(*(d[i] for i in sorted(d))))
    return [a[i] for i in idxes]


def main():
    test_case = int(raw_input())
    for test in xrange(test_case):
        n = int(raw_input())
        a = [raw_input() for i in xrange(n)]
        for x in radix_sort(a):
            print x


if __name__ == '__main__':
    main()
