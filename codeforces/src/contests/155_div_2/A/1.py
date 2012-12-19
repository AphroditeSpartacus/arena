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
#from future_builtins import *

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


def main():
    sys.stdin = open('input.txt')
    sys.stdout = open('output.txt', 'w')
    iterator = itertools.imap(str.rstrip, sys.stdin.readlines())
#    iterator = itertools.imap(str.rstrip, open('input.txt').readlines())
    n = int(next(iterator))
    a = list(map(int, next(iterator).split()))
#    print(a)
    a = list(zip(list(a), range(1, 2 * n + 1)))
#    print(a)
    a.sort()
#    print(a)
    for i in range(n):
        if a[i * 2][0] != a[i * 2 + 1][0]:
            print(-1)
            return
    for i in range(n):
        print(a[i * 2][1], a[i * 2 + 1][1])

if __name__ == '__main__':
    main()
