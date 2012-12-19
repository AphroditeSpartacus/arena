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
#from __future__ import print_function
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
    if n < 3:
        print(-1)
        return
    x = 2 * 3 * 5 * 7
    if n == 3:
        print(x)
        return
    k = n - 3
    res = int('1' + '0' * k + '2' + '0')
    while True:
        if res % 7 == 0:
#            print res
            break
        res += 30


if __name__ == '__main__':
    main()
