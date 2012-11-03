# -*- coding: utf-8 -*-

from __future__ import division
from __future__ import print_function
from future_builtins import *

import bisect
import collections
import copy
import functools
import heapq
import itertools
import math
import operator
import os
import re
import random
import sys
import unittest
from pprint import pprint
from StringIO import StringIO

__author__ = 'Aphrodite'

cache = {}

def func(a, b, c, d):
    p = tuple(sorted((a, b, c)))
    if p not in cache:
        cache[p] = len({i * j * k for i in d[a] for j in d[b] for k in d[c]})
    return cache[p]
#    return len({i * j * k for i in d[a] for j in d[b] for kf in d[c]})

def main():
    iterator = itertools.imap(str.rstrip, sys.stdin.readlines())
    a, b, c = map(int, next(iterator).split())
    d = {}
    for i in range(1, 101):
        d[i] = set()
        for j in range(1, i + 1):
            if i % j == 0:
                d[i].add(j)
    pprint(d)
    res = 0
    for i in range(1, a + 1):
        for j in range(1, b + 1):
            for k in range(1, c + 1):
                res = (res + func(i, j, k, d)) % 1073741824
#                res = (res + len(d[i] | d[j] | d[k] | {i * j, i * k, j * k, i * j * k})) % 1073741824
#                print(i, j, k, '--', len(d[i] | d[j] | d[k] | {i * j, i * k, j * k, i * j * k}))
    print(res)


if __name__ == '__main__':
    main()
