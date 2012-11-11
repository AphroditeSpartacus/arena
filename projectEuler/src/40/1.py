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


def main():
    a = []
    cur = 1
    while len(a) < 10 ** 6:
        a.extend(map(int, list(str(cur))))
        cur += 1
    k = [1]
    any(k.append(10 * k[-1]) for _ in range(6))
    print(reduce(operator.mul, (a[p - 1] for p in k)))


if __name__ == '__main__':
    main()
