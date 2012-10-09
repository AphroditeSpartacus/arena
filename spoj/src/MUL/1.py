import bisect
import collections
import functools
import heapq
import itertools
import math
import operator
import re
import sys
from pprint import pprint


def main():
    test_case = int(raw_input())
    for test in xrange(test_case):
        a, b = map(int, raw_input().split())
        print a * b


if __name__ == '__main__':
    main()
