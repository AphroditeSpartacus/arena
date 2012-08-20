import collections
import itertools
import math
import operator
import re


def build_all_primes(n):
    '''build all primes less then n'''
    candidates = [i for i in xrange(n)]
    candidates[0] = candidates[1] = 0

    for x in xrange(2, int(n ** 0.5) + 1):
        if candidates[x]:
            candidates[x * x::x] = [0] * (((len(candidates) - x * x) + (x - 1))/ x)

    return filter(None, candidates)


def build_range_primes(start, stop, meta_primes):
    '''build primes in range [start, stop) using meta_primes'''
    candidates = [start + i for i in xrange(stop - start)]
    for x in meta_primes:
        k = max(x * x, start + (-start % x))
        if k >= stop:
            continue
        k -= start
        candidates[k::x] = [0] * (((len(candidates) - k) + (x - 1)) / x)

    return filter(lambda x: x > 1, filter(None, candidates))


def main():
    MAX = int(1000000000 ** 0.5) + 1
    primes = build_all_primes(MAX)

    test_case = int(raw_input())
    for i in xrange(test_case):
        m, n = map(int, raw_input().split())
        res = build_range_primes(m, n + 1, primes)
        for x in res:
            print x

        if i < test_case - 1:
            print


if __name__ == '__main__':
    main()
