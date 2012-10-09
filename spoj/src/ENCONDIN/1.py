import collections
import functools
import itertools
import math
import operator
import re
import sys
from pprint import pprint


def escape(x):
    return ''.join(k if k != '1' else '11' for k in x)

lost = ''

def encode(n, x):
    if not x or n == 0:
        return ''
    if n < 2:
        return '1%s1' % escape(x)
    elif n < 10:
        return '%s%s' % (n, x)
    else:
        p, q = n / 9, n % 9
        if q == 0 or q > 1:
            return p * encode(9, x) + encode(q, x)
        else:
            global lost
            lost = x
            return p * encode(9, x)


def main():
    while True:
        try:
            s = raw_input()
        except EOFError:
            break
        # print '======='
        res, tmp = '', ''
        for v, g in itertools.groupby(s):
            # print v, len(list(g))
            length = len(list(g))
            if length == 1:
                tmp += v
            else:
                res += encode(1, tmp) + encode(length, v)
                global lost
                tmp = '' if not lost else lost
                # print lost
                lost = ''
            # print tmp
        res += encode(1, tmp)
        print res

if __name__ == '__main__':
    main()
