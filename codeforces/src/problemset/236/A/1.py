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
import sys
import unittest
from pprint import pprint
from StringIO import StringIO

__author__ = 'Aphrodite'


def main():
    iterator = itertools.imap(str.rstrip, sys.stdin.readlines())
    s = next(iterator)
    c = set()
    for x in s:
        c.add(x)
    print('CHAT WITH HER!' if len(c) % 2 == 0 else 'IGNORE HIM!')


if __name__ == '__main__':
    main()
