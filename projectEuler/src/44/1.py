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
    'n * (3 * n - 1) / 2'
    class FoundException(Exception): pass
    n = 10000
    a = [x * (3 * x - 1) / 2 for x in range(1, n + 1)]
    sa = set(a)
    try:
        for dist in range(1, n):
            for i in range(n - dist):
                j = i + dist
#                print(i, j, len(a))
                if a[i] + a[j] in sa and a[j] - a[i] in sa:
                    raise FoundException
    except FoundException:
        print(dist)


if __name__ == '__main__':
    main()
