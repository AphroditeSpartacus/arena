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
    n = 20
#    choose(2 * n, n)
    print(int(reduce(operator.mul, ((2 * n - k) / (k + 1) for k in range(n)))))


if __name__ == '__main__':
    main()
