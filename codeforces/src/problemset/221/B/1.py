import collections
import functools
import itertools
import math
import operator
import re
import sys
from pprint import pprint


def check(n, x):
    return bool(set(str(n)).intersection(set(str(x))))

def main():
    n = int(raw_input())
    res = 0
    for x in xrange(1, int(n ** 0.5) + 1):
        if n % x == 0:
            res += check(n, x)
            if n / x != x:
                res += check(n, n / x)
    print res


if __name__ == '__main__':
    main()
