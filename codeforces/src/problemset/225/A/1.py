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
import copy
import functools
import heapq
import itertools
import math
import operator
import os
import re
import random
import sys
from pprint import pprint

__author__ = 'Aphrodite'


def main():
    iterator = itertools.imap(str.rstrip, sys.stdin.readlines())
    n = int(next(iterator))
    top = int(next(iterator))
    for i in range(n):
        x, y = map(int, next(iterator).split())
        a = [x, y, 7 - x, 7 - y]
        if top in a:
            print('NO')
            return
    print('YES')


if __name__ == '__main__':
    main()
