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
    s = next(iterator)
    a = [x.strip('"') for x in s.split(',')]
#    print(a)
    triangle_numbers = set(x * (x + 1) // 2 for x in range(1, 100))
#    print(triangle_numbers)
    print(sum(1 for x in a if sum(ord(k) - ord('A') + 1 for k in x) in triangle_numbers))

if __name__ == '__main__':
    main()
