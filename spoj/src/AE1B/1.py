import collections
import functools
import itertools
import math
import operator
import re
import sys
from pprint import pprint


def main():
    n, k, s = map(int, raw_input().split())
    a = map(int, raw_input().split())
    a.sort(reverse=True)
    sum = k * s
    for i in xrange(n):
        sum -= a[i]
        if sum <= 0:
            break
    print i + 1


if __name__ == '__main__':
    main()
