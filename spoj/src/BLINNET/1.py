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


def kruskal(graph):
    def find(components, u):
        if components[u] != u:
            components[u] = find(components, components[u])
        return components[u]

    def union(components, ranks, u, v):
        u, v = find(components, u), find(components, v)
        if ranks[u] > ranks[v]:
            components[v] = u
        elif ranks[u] < ranks[v]:
            components[u] = v
        else:
            components[u] = v
            ranks[v] += 1

    edges = [(graph[u][v], u, v) for u in graph for v in graph[u]]
    tree = set()
    components = {u:u for u in graph}
    ranks = {u: 0 for u in graph}
    for _, u, v in sorted(edges):
        if find(components, u) != find(components, v):
            tree.add((u, v))
            union(components, ranks, u, v)
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
        tree = kruskal(graph)
        res = sum(graph[u][v] for u, v in tree)
        print(res)


if __name__ == '__main__':
    main()
