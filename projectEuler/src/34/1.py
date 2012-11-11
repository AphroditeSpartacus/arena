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


def check(n, factorial):
    a = list(map(int, list(str(n))))
    return n == sum(factorial[x] for x in a)

def main():
    factorial = [1]
    any(factorial.append(factorial[-1] * i) for i in range(1, 10))
#    print(factorial)
    print(sum(i for i in range(10, factorial[-1]) if check(i, factorial)))

if __name__ == '__main__':
    main()
