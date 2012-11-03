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
    d = {}
    n = int(next(iterator))
    for i in range(n):
        a, b = map(int, next(iterator).split())
        d[a, b] = d.get((a, b), 0) + 1
    print(max(d.values()))

if __name__ == '__main__':
    main()
