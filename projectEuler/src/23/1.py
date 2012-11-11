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


def sum_of_divisors(n):
    sq = int(n ** 0.5)
    res = sum(i + n // i for i in range(1, sq + 1) if n % i == 0)
    if sq ** 2 == n:
        res -= sq
    res -= n
    return res


def main():
    n = 28123
    abundants = [i for i in range(1, n) if i < sum_of_divisors(i)]
    candidates = set(i + j for i in abundants for j in abundants)
#    print(len(candidates))
    print(sum(i for i in range(1, n) if i not in candidates))

if __name__ == '__main__':
    main()
