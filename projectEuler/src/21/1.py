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


def func(n):
    sq = int(n ** 0.5)
    res = sum(i + n // i for i in range(1, sq + 1) if n % i == 0)
    if sq ** 2 == n:
        res -= sq
    res -= n
    return res

def main():
#    print(func(220))
#    print(func(func(220)))
#    print(sum(i for i in range(1, 10000) if i == func(func(i)) and func(i) != i))
    print(sum(p for p, q in ((i, func(i)) for i in range(1, 10000)) if p != q and p == func(q)))

if __name__ == '__main__':
    main()
