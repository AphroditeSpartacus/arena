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


def fibonacci():
    a, b = 0, 1
    yield a
    yield b
    while True:
        a, b = b, a + b
        yield b

def main():
    x = fibonacci()
    cnt = 0
    while True:
        res = next(x)
        if len(str(res)) >= 1000:
            print(cnt)
            break
        cnt += 1


if __name__ == '__main__':
    main()
