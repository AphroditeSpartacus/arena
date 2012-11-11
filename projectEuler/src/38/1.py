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
    s = set()
    res = []
    for i in itertools.count(1):
        a = list(str(n * i))
        b = set(a)
        if '0' in b:
            return -1
        if len(a) == len(b) and not s & b:
            s.update(b)
            res.extend(a)
            if i > 1 and len(s) == 9:
                return int(''.join(res))
        else:
            return -1


def main():
    print(max(map(func, range(1, 10 ** 5))))


if __name__ == '__main__':
    main()
