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
    print(sum(range(1, n + 1)) ** 2 - sum(map(lambda x: x ** 2, range(1, n + 1))))

def main():
    func(10)
    func(100)


if __name__ == '__main__':
    main()
