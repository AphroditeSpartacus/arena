# -*- coding: utf-8 -*-

from __future__ import absolute_import
from __future__ import division
from __future__ import generators
from __future__ import nested_scopes
from __future__ import print_function
from __future__ import unicode_literals
from __future__ import with_statement

import bisect
import collections
import functools
import heapq
import itertools
import math
import operator
import re
import random
import sys
from pprint import pprint

__author__ = 'Aphrodite'


def main():
    iterator = itertools.imap(str.rstrip, sys.stdin.readlines())
    a, b, c = map(int, next(iterator).split())
    print(int(4 * ((a * b / c) ** 0.5 + (a * c / b) ** 0.5 + (b * c / a) ** 0.5)))


if __name__ == '__main__':
    main()
