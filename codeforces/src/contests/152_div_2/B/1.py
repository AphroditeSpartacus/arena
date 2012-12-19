# -*- coding: utf-8 -*-

############################################################################
#                                                                          #
#                To see the world in a grain of sand,                      #
#                And a heaven in a wild flower;                            #
#                Hold infinity in the palm of your hand,                   #
#                And eternity in an hour.                                  #
#                                                                          #
############################################################################

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

s = set()
res = float('inf')

def dfs(a, b, c, d, x, n):
    print(a, b, c, d, x)
    global res
    if len(str(x)) == n and x < res:
        res = x
        return
    if len(str(x)) > n:
        return
    s.add((a, b, c, d))
    if (a + 1, b, c, d) not in s:
        dfs(a + 1, b, c, d, x * 2, n)
    if (a, b + 1, c, d) not in s:
        dfs(a, b + 1, c, d, x * 3, n)
    if (a, b, c + 1, d) not in s:
        dfs(a, b, c + 1, d, x * 5, n)
    if (a, b, c, d + 1) not in s:
        dfs(a, b, c, d + 1, x * 7, n)



def main():
    iterator = itertools.imap(str.rstrip, sys.stdin.readlines())
    n = int(next(iterator))
    if n < 3:
        print(-1)
        return
    x = 2 * 3 * 5 * 7
    while len(str(x)) < n - 2:
        x *= 2
#    dfs(1, 1, 1, 1, 2 * 3 * 5 * 7, n)
    dfs(1, 1, 1, 1, x, n)
    print(res)


if __name__ == '__main__':
    main()
