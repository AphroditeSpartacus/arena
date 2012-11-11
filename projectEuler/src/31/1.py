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
    a = [1, 2, 5, 10, 20, 50, 100, 200]
    dp = [0] * 201
    dp[0] = 1
    for x in a:
        for i in range(1, len(dp)):
            if i >= x:
                dp[i] += dp[i - x]
    print(dp[200])

if __name__ == '__main__':
    main()
