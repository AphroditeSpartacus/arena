import collections
import functools
import itertools
import math
import operator
import re
import sys
from pprint import pprint


def main():
    test_case = int(raw_input())
    for test in xrange(test_case):
        dump = raw_input()
        n, m = map(int, raw_input().split())
        na, ma = map(int, raw_input().split()), map(int, raw_input().split())
        n_max, m_max = max(na), max(ma)
        if n_max >= m_max:
            print 'Godzilla'
        else:
            print 'MechaGodzilla'


if __name__ == '__main__':
    main()
