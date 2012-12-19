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
    iterator = itertools.imap(str.rstrip, sys.stdin.readlines())
    n = int(next(iterator))
    a = [tuple(map(int, next(iterator).split())) for _ in range(n)]
#    print(a)
    x, y = min(a, key=operator.itemgetter(0))[0], max(a, key = operator.itemgetter(1))[1]
#    print(x, y)
    for idx, val in enumerate(a):
        if val[0] <= x and val[1] >= y:
            print(idx + 1)
            break
    else:
        print(-1)


if __name__ == '__main__':
    main()
