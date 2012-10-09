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
        m, n = map(int, raw_input().split())
        if m == 0:
            break
        print m ** n


if __name__ == '__main__':
    main()
