import collections
import functools
import itertools
import math
import operator
import re
import sys
from pprint import pprint


def main():
    while True:
        try:
            a = int(raw_input())
        except EOFError:
            break
        if a < 2:
            print a
        else:
            print 2 * a - 2


if __name__ == '__main__':
    main()
