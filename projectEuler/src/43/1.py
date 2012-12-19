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

def check(a):
    p = [2, 3, 5, 7, 11, 13, 17]
    for i, x in enumerate(p):
        k = int(''.join(map(str, a[i + 1:i + 4])))
        if k % x != 0:
            return False
    return True

def main():
    print(sum(int(''.join(map(str, a))) for a in itertools.permutations(range(10)) if check(a)))


if __name__ == '__main__':
    main()
