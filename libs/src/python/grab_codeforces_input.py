from __future__ import division
from __future__ import print_function
from future_builtins import *

import bisect
import collections
import copy
import functools
import heapq
import itertools
import math
import operator
import os
import re
import random
import subprocess
import sys
import unittest
import urllib
from pprint import pprint
from StringIO import StringIO

__author__ = 'Aphrodite'


def get_page_source(url):
    source = urllib.urlopen(url).read()
    return source

def main(url):
    src = get_page_source(url)
    input_pattern = r'<div class="input"><div class="title">Input</div><pre>(.*?)</pre></div>'
    input_result = re.findall(input_pattern, src)
    for idx, val in enumerate(input_result):
        input_result[idx] = val.replace('<br />', '\n')
        # dump_file = '/Users/Aphrodite/program/arena/tmp/input-{0}'.format(idx + 1)
        dump_file = '/tmp/input-{0}'.format(idx + 1)
        print(dump_file)
        print(input_result[idx])
        with open(dump_file, mode='w') as f:
            print(input_result[idx], file=f)

if __name__ == '__main__':
#    url = 'http://www.codeforces.com/problemset/problem/237/A'
    url = sys.argv[1]
    main(url)
