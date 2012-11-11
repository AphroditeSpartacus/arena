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
    return sum(1 for i in range(1, n // 3 + 1) for j in range(i, (n - i) // 2 + 1) if n - j - i > j and i ** 2 + j ** 2 == (n - j - i) ** 2), n

def main():
    print(max(map(func, range(1, 1001)))[1])


if __name__ == '__main__':
    main()
