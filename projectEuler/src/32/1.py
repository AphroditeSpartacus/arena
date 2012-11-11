# -*- coding: utf-8 -*-

from __future__ import division
from __future__ import print_function
from future_builtins import *

import bisect
import collections
import copy
import fractions
import functools
import heapq
import itertools
import math
import operator
import os
import re
import random
import subprocess
import sys
import unittest
from pprint import pprint
from StringIO import StringIO

__author__ = 'Aphrodite'


def check(i, j, k):
    a, b, c = list(str(i)), list(str(j)), list(str(k))
    sa, sb, sc = set(a), set(b), set(c)
#    print(sa, sb, sc)
    dest = set(map(str, range(1, 10)))
    if len(sa) != len(a) or len(sb) != len(b) or len(sc) != len(c):
        return False
    if not sa & sb and not sa & sc and not sb & sc and sa | sb | sc == dest:
        return True
    else:
        return False


def main():
#    1 digit * 4 digits or 2 digits * 3 digits
    res = set()
    for i in range(1, 10):
        for j in range(1000, 10000):
            k = i * j
            if check(i, j, k):
                res.add(k)
    for i in range(10, 100):
        for j in range(100, 1000):
            k = i * j
            if check(i, j, k):
                res.add(k)
    print(sum(res))
#    print(check(39, 186, 7254))

if __name__ == '__main__':
    main()
