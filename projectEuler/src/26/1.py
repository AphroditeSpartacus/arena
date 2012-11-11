# -*- coding: utf-8 -*-

from __future__ import division
from __future__ import print_function
from future_builtins import *

import bisect
import collections
import copy
import fractions
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
from pprint import pprint
from StringIO import StringIO

__author__ = 'Aphrodite'


def fraction_expression(numerator, denominator, base=10):
    '''return (divisor, digits_before_cycle, digits_of_cycle)'''
    divisor, remainder = divmod(numerator, denominator)
    digits, cache= [], {}
    while remainder != 0 and remainder not in cache:
        cache[remainder] = len(digits)
        d, remainder = divmod(remainder * base, denominator)
        digits.append(d)
    if remainder == 0:
        digits_before_cycle, digits_of_cycle = digits, []
    else:
        digits_before_cycle, digits_of_cycle = digits[:cache[remainder]], digits[cache[remainder]:]
    return divisor, digits_before_cycle, digits_of_cycle

def main():
    print(max((len(fraction_expression(1, i)[2]), i) for i in range(1, 1000))[1])


if __name__ == '__main__':
    main()
