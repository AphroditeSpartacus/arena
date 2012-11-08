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

import calendar

__author__ = 'Aphrodite'


def main():
    cnt = 0
    for year in range(1901, 2001):
        for month in range(1, 13):
#            print(calendar.monthcalendar(year, month))
            cnt += sum(1 for weeks in calendar.monthcalendar(year, month) for w, day in enumerate(weeks) if w == 6 and day == 1)
    print(cnt)

if __name__ == '__main__':
    main()
