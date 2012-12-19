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


def is_prime(n):
    if n < 2:
        return False
    for x in range(2, int(n ** 0.5) + 1):
        if n % x == 0:
            return False
    return True

def main():
    a = []
    res = 0
    # range(1, 10), range(1, 9), the sum divied by 3.
    for i in range(1, 8):
        a.append(i)
        for x in itertools.permutations(a):
            n = int(''.join(map(str, x)))
            if n > res and is_prime(n):
                res = n
    print(res)



if __name__ == '__main__':
    main()
