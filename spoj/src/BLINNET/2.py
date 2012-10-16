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


def prim(graph, source):
    tree, queue = {}, [(0, None, source)]
    while queue:
        _, p, u = heapq.heappop(queue)
        if u in tree:
            continue
        tree[u] = p
        for v, weight in graph[u].items():
            heapq.heappush(queue, (weight, u, v))
    return tree


def main():
    iterator = itertools.imap(str.rstrip, sys.stdin.readlines())
    test_case = int(next(iterator))
    for case in range(test_case):
        next(iterator)
        n = int(next(iterator))
        graph = {i:{} for i in range(n)}
        for city in range(n):
            next(iterator)
            neighbor_num = int(next(iterator))
            for i in range(neighbor_num):
                neighbor, cost = map(int, next(iterator).split())
                graph[city][neighbor - 1] = cost
        tree = prim(graph, 0)
        res = sum(graph[u][tree[u]] for u in tree if tree[u] is not None)
        print(res)


if __name__ == '__main__':
    main()
