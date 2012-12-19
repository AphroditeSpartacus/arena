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
import string
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
    a = next(iterator)
    b = next(iterator)
    d1 = dict((x, 0) for x in string.uppercase)
    d2 = d1.copy()
    for x in a:
        d1[x] = d1.get(x, 0) + 1
    for x in b:
        d2[x] = d2.get(x, 0) + 1
#    print(d1, d2)
#    d3 = dict((x, d1[x] - d2[x]) for x in string.uppercase)
#    s = sum(d1[x] for x in d3 if d3[x] > 0)
#    print(s, '==========')
    t = dict((x, 0) for x in string.uppercase)
    for x in string.uppercase:
        if d1[x] > d2[x]:
            t[x] += d1[x] - d2[x]
    res = []
    cnt = 0
    for x in a:
#        print(x)
#        print(d1[x], d2[x])
        if d1[x] > d2[x]:
#            print('-----')
            for k in string.uppercase:
                if d2[k] > d1[k]:
                    if k < x or t[x] < 1:
                        cnt += 1
                        res.append(k)
                        d1[x] -= 1
                        d1[k] += 1
                    else:
                        t[x] -= 1
                        res.append(x)
                    break
        else:
            res.append(x)
    print(cnt)
    print(''.join(res))




if __name__ == '__main__':
    main()
