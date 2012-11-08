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


def fib(n):
    return reduce(operator.mul, range(1, n + 1))

def main():
    x = fib(100)
    print(sum(map(int, list(str(x)))))


if __name__ == '__main__':
    main()
