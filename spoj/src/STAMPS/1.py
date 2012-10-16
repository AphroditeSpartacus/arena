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
    test_case = int(next(iterator))
    for case in range(test_case):
        n, m = map(int, next(iterator).split())
        a = map(int, next(iterator).split())
        a.sort(reverse=True)
        print('Scenario #' + str(case + 1) + ':')
        for i in range(m):
            n -= a[i]
            if n <= 0:
                print(i + 1)
                break
        else:
            print('impossible')
        print()


if __name__ == '__main__':
    main()
