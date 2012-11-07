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

def sum_numbers(n):
    '''1 + 2 + ... + n = n * (n + 1) / 2'''
    return n * (n + 1) // 2

def sum_squares(n):
    '''1 ^ 2 + 2 ^ 2 + ... + n ^ 2 = n * (n + 1) * (2 * n + 1) / 6'''
    return n * (n + 1) * (2 * n + 1) // 6

def func(n):
    return sum_numbers(n) ** 2 - sum_squares(n)

def main():
    print(func(10))


if __name__ == '__main__':
    main()
