#!/usr/bin/env python

from __future__ import absolute_import
from __future__ import division
from __future__ import generators
from __future__ import nested_scopes
from __future__ import print_function
from __future__ import with_statement

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

def func(chocolates, maxSwaps, i, x):
    a = []
    p = 1
    for j in range(i + 1, len(chocolates)):
        if chocolates[j] == x:
            a.append(j - i - p)
            p += 1
    p = 1
    for j in range(i - 1, -1, -1):
        if chocolates[j] == x:
            a.append(i - j - p)
            p += 1
    a.sort()
    res = 1
    for k in a:
        if k <= maxSwaps:
            res += 1
            maxSwaps -= k
    return res

def maximumSpread(chocolates, maxSwaps):
    return max(func(copy.copy(chocolates), maxSwaps, i, x) for i, x in enumerate(chocolates))

if __name__ == '__main__':
    res = maximumSpread("ABCDCBC", 2)
    print(res)