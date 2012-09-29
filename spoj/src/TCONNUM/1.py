import collections
import functools
import itertools
import math
import operator
import re
import sys
from pprint import pprint

def base_convert(s, from_base, to_base=10):
    import string
    bases = string.digits + string.uppercase
    n = int(s, from_base)
    res = []
    while n > 0:
        res.append(bases[n % to_base])
        n /= to_base
    return ''.join(reversed(res)) if res else '0'


def main():
    n = int(raw_input())
    for i in xrange(n):
        s, a, b = raw_input().split()
        a, b = int(a), int(b)
        print base_convert(s, a, b)


if __name__ == '__main__':
    main()
