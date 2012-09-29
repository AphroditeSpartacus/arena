import collections
import functools
import itertools
import math
import operator
import re
import sys
from pprint import pprint


def main():
    n = int(raw_input())
    a = [x + 1 for x in xrange(n)]
    a.insert(0, a.pop())
    print ' '.join(map(str, a))


if __name__ == '__main__':
    main()
