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


def main():
    s={0:"",1:"one",2:"two",3:"three",4:"four",5:"five",6:"six"
        ,7:"seven",8:"eight",9:"nine",10:"ten",11:"eleven"
        ,12:"twelve",13:"thirteen",14:"fourteen",15:"fifteen"
        ,16:"sixteen",17:"seventeen",18:"eighteen",19:"nineteen"
        ,20:"twenty",30:"thirty",40:"forty",50:"fifty"
        ,60:"sixty",70:"seventy",80:"eighty",90:"ninety"}
#    print(s)
    for i in range(1,1000):
        if not i in s.keys():
            if i<100:
                s[i]=s[i//10*10]+s[i%10]
            else:
                s[i]=s[i//100]+"hundred"
                if i%100:
                    s[i]+="and"+s[i%100]
    s[1000]="onethousand"
    total=0
    for i in s.values():
        total+=len(i)
    print(total)


if __name__ == '__main__':
    main()
