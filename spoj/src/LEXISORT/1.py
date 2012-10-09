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
        cnt = [[] for x in xrange(52)]
        for idx in idxes:
            if a[idx][k].isupper():
                cnt[ord(a[idx][k]) - ord('A')].append(idx)
            else:
                cnt[ord(a[idx][k]) - ord('a') + 26].append(idx)
        idxes = list(itertools.chain(*cnt))
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
