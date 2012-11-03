# -*- coding: utf-8 -*-

from __future__ import division
from __future__ import print_function
from _ast import operator
from future_builtins import *

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
import unittest
from pprint import pprint
from StringIO import StringIO

__author__ = 'Aphrodite'


class Prime(object):
    def __init__(self, n):
        '''build prime numbers in range [0..n]'''
        self._prime = [False, False] + [True] * (n - 1)
        for i in range(2, int(n ** 0.5) + 1):
            if self._prime[i]:
                for j in range(i * i, n + 1, i):
                    self._prime[j] = False

    def is_prime(self, x):
        '''check if x is prime'''
        return self._prime[x]

    def get_all_primes(self):
        '''get prime numbers less or equal then n'''
        return [idx for idx, value in enumerate(self._prime) if value]

    def get_primes(self, m):
        '''get prime numbers less or equal then m'''
        return [idx for idx, value in enumerate(self._prime[:m + 1]) if value]

    def get_prime_expression(self, m):
        '''m = p1^k1 * p2^k2 * p3^k3
           return [(p1, k1), (p2, k2), (p3, k3)]
        '''
        res = []
        for x in self.get_primes(m):
            if m % x == 0:
                aux, cnt = m, 0
                while aux % x == 0:
                    aux //= x
                    cnt += 1
                res.append((x, cnt))
        return res


def memo(func):
    cache = {}
    @functools.wraps(func)
    def _memo(*args):
        if args not in cache:
            cache[args] = func(*args)
        return cache[args]
    return _memo


@memo
def func(n, p):
    expression = p.get_prime_expression(n)
    if not expression:
        return 1
    return reduce(lambda a, b: a * b, (q + 1 for p, q in expression))


def main():
    iterator = itertools.imap(str.rstrip, sys.stdin.readlines())
    a, b, c = map(int, next(iterator).split())
    p = Prime(100)
    res = 0
    for i in range(1, a + 1):
        for j in range(1, b + 1):
            for k in range(1, c + 1):
                res = (res + func(i * j * k, p)) % 1073741824
    print(res)


if __name__ == '__main__':
    main()
