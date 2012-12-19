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


def main():
    sys.stdin = open('input.txt')
    sys.stdout = open('output.txt', 'w')
    iterator = itertools.imap(str.rstrip, sys.stdin.readlines())
    n = int(next(iterator))
    a = map(int, next(iterator).split())
    tab = {}
    for idx, val in enumerate(a):
        tab.setdefault(val, []).append(idx + 1)
    for x in tab.values():
        if len(x) % 2 != 0:
            print(-1)
            return
    for x in tab.values():
        for i in range(0, len(x), 2):
            print(x[i], x[i + 1])

if __name__ == '__main__':
    main()
