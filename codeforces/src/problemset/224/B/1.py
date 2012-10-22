# -*- coding: utf-8 -*-

from __future__ import absolute_import
from __future__ import division
from __future__ import generators
from __future__ import nested_scopes
from __future__ import print_function
from __future__ import unicode_literals
from __future__ import with_statement

import bisect
import collections
import functools
import heapq
import itertools
import math
import operator
import re
import random
import sys
from pprint import pprint

__author__ = 'Aphrodite'


def main():
    iterator = itertools.imap(str.rstrip, sys.stdin.readlines())
    n, k = map(int, next(iterator).split())
    a = map(int, next(iterator).split())
    d = collections.defaultdict(set)
#    d = {}
    for length in range(1, n + 1):
        for start in range(0, n - length + 1):
            end = start + length - 1
#            print(start, end - 1)
#            print(d[(start, end - 1)])
#            print({a[end]})
#            print(d[(start, end - 1)] & {a[end]})
            d[(start, end)] = d[(start, end - 1)] | {a[end]}
#            print(d)
#            if d.has_key((start, end)):
#                d[(start,end)].add(a[end])
#            else:
#                d[(start,end)] = set()
#            d[(start, end)].add(a[end])
##            print(d)
#            d[5] = {1, 2, 3}
#            d[5].add(3)
#            print(d[5])
#            print(len())
#            print(len(d[5]))
            if len(d[(start, end)]) == k:
                print(start + 1, end + 1)
                return
#            print(d)
    else:
        print(-1, -1)


if __name__ == '__main__':
    main()
