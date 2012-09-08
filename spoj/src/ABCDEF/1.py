import collections
import functools
import itertools
import math
import operator
import re
import sys


def main():
    n = int(raw_input())
    S = [int(raw_input()) for x in xrange(n)]
    # a * b
    D1 = collections.defaultdict(int)
    # e + f
    D2 = collections.defaultdict(int)
    for i in xrange(n):
        for j in xrange(i, n):
            if i == j:
                D1[S[i] * S[j]] += 1
                D2[S[i] + S[j]] += 1
            else:
                D1[S[i] * S[j]] += 2
                D2[S[i] + S[j]] += 2
    # a * b + c
    D3 = collections.defaultdict(int)
    for x in D1:
        for y in S:
            D3[x + y] += D1[x]
    # (a * b + c) / d
    D4 = collections.defaultdict(int)
    for x in D3:
        for y in S:
            if y and x % y == 0:
                D4[x / y] += D3[x]
    # print D1
    # print D2
    # print D3
    # print D4
    res = sum(D2[x] * D4[x] for x in D4 if x in D2)
    print res


if __name__ == '__main__':
    main()