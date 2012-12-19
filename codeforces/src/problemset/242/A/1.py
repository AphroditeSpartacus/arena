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
    x, y, a, b = map(int, next(iterator).split())
    res = []
    for p in range(a, x + 1):
        for q in range(b, y + 1):
            if p > q:
                res.append((p, q))
    print(len(res))
    for i in res:
        print(i[0], i[1])


if __name__ == '__main__':
    main()
