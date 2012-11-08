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


d = {}

def func(n):
    if n in d:
        return d[n]
    if n % 2 == 0:
        m = n // 2
    else:
        m = 3 * n + 1
    d[n] = func(m) + 1
    return d[n]

def main():
    d[0], d[1] = 0, 1
    for i in range(10 ** 6):
        func(i)
    print(max(d.items(), key=operator.itemgetter(1))[0])

if __name__ == '__main__':
    main()
