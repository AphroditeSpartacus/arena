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


class Prime(object):
    def __init__(self, n):
        '''build prime numbers in range [0..n]'''
        self._prime = [False, False] + [True] * (n - 1)
        for i in range(2, int(n ** 0.5) + 1):
            if self._prime[i]:
                for j in range(i * i, n + 1, i):
                    self._prime[j] = False
        self._all_primes = [idx for idx, value in enumerate(self._prime) if value]

    def is_prime(self, x):
        '''check if x is prime'''
        return self._prime[x]

    def get_all_primes(self):
        '''get prime numbers less or equal then n'''
        return self._all_primes

    def get_primes(self, m):
        '''get prime numbers less or equal then m'''
        return self._all_primes[:bisect.bisect(self._all_primes, m)]

    def get_prime_expression(self, m):
        '''m = p1^k1 * p2^k2 * p3^k3
           return [(p1, k1), (p2, k2), (p3, k3)]
        '''
        res = []
        for x in self._all_primes:
            if x > m:
                break
            if m % x == 0:
                aux, cnt = m, 0
                while aux % x == 0:
                    aux //= x
                    cnt += 1
                res.append((x, cnt))
        return res

def check(n, prime):
    if n < 10:
        return False
    a = list(str(n))
    for i in range(1, len(a)):
        if not prime.is_prime(int(''.join(a[i:]))) or not prime.is_prime(int(''.join(a[:-i]))):
            return False
#    print(n)
    return True

def main():
    p = Prime(10 ** 6)
    print(sum(filter(functools.partial(check, prime=p), p.get_all_primes())))


if __name__ == '__main__':
    main()
