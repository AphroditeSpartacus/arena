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


def func(s):
    return sum(ord(x) - ord('A') + 1 for x in s)

def main():
    iterator = itertools.imap(str.rstrip, sys.stdin.readlines())
    a = sorted(x.strip('"') for x in next(iterator).split(','))
#    print(a)
    print(sum(func(x) * (idx + 1) for idx, x in enumerate(a)))

if __name__ == '__main__':
    main()
