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


def main():
    cur = 1
    res = cur
    for i in range(3, 1002, 2):
        step = i - 1
        for _ in range(4):
            cur += step
            res += cur
    print(res)


if __name__ == '__main__':
    main()
