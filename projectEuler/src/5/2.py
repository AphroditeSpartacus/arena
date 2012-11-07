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
#    print(int(reduce(lambda x, y: x * y / __import__('fractions').gcd(x, y), range(1, 21))))
    print(int(reduce(lambda x, y: x * y / fractions.gcd(x, y), range(1, 21))))

if __name__ == '__main__':
    main()
