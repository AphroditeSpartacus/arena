# -*- coding: utf-8 -*-

from __future__ import division
from __future__ import print_function
from future_builtins import *

import bisect
import collections
import copy
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
    iterator = itertools.imap(str.rstrip, sys.stdin.readlines())
    y, k, n = map(int, next(iterator).split())
    start = k - y % k
    ok = False
    while start + y <= n:
        ok = True
        print(start, end=' ')
        start += k
    if not ok:
        print(-1)


if __name__ == '__main__':
    main()
