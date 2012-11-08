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

def factors(n):
    k = int(n ** 0.5)
    cnt = sum(2 for x in range(1, k + 1) if n % x == 0)
    if k ** 2 == n:
        cnt -= 1
    return cnt


def main():
    n = 1
    while True:
#        print(n)
        x = n * (n + 1) // 2
        if factors(x) > 500:
            print(x)
            break
        n += 1

if __name__ == '__main__':
    main()
