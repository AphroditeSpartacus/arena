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
        n = int(raw_input())
        a = [raw_input() for i in xrange(n)]
        for x in sorted(a):
            print x


if __name__ == '__main__':
    main()
