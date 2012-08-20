import collections
import itertools
import math
import operator
import re


def all_primes(n):
    candidates = [True] * n
    candidates[0] = candidates[1] = False
    for x in xrange(2, int(n ** 0.5) + 1):
        if not candidates[x]:
            continue
        for y in xrange(x * x, n, x):
            candidates[y] = False
    return [x for x in xrange(n) if candidates[x]]

def main():
    primes = all_primes(int(1000000000 ** 0.5))
    test_case = int(raw_input())
    for i in xrange(test_case):
        m, n = map(int, raw_input().split())
        for x in xrange(max(m, 2), n + 1):
            ok = True
            for p in primes:
                if p >= x:
                    break;
                if x % p == 0:
                    ok = False
                    break;
            if ok:
                print x
        if i < test_case - 1:
            print

if __name__ == '__main__':
    main()