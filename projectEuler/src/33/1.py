# -*- coding: utf-8 -*-

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


def check(a, b):
    p, q = list(map(int, list(str(a)))), list(map(int, list(str(b))))
    if p[0] == q[1] and p[0] != 0 and a * q[0] == b * p[1]:
        return True, a, b
    if p[1] == q[0] and p[1] != 0 and a * q[1] == b * p[0]:
        return True, a, b
    return False, None, None

def main():
    res = 1
    for a in range(10, 100):
        for b in range(a + 1, 100):
            ok, x, y = check(a, b)
            if ok:
                res *= fractions.Fraction(a, b)
    print(res.denominator)


if __name__ == '__main__':
    main()
