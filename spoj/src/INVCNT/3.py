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


count = 0

def merge_sort(seq):
    global count

    mid = len(seq) / 2 # Midpoint for division
    lft, rgt = seq[:mid], seq[mid:]
    if len(lft) > 1: lft = mergesort(lft) # Sort by halves
    if len(rgt) > 1: rgt = mergesort(rgt)
    res = []
    while lft and rgt: # Neither half is empty
        if lft[-1] >= rgt[-1]: # lft has greatest last value
            res.append(lft.pop()) # Append it
        else: # rgt has greatest last value
            res.append(rgt.pop()) # Append it
    res.reverse() # Result is backward
    return (lft or rgt) + res # Also add the remainder

def main():
    test_case = int(raw_input())
    for test in xrange(test_case):
        raw_input()
        n = int(raw_input())
        seq = [int(raw_input()) for i in xrange(n)]
        quick_sort(seq)
        global count
        print count
        count = 0

if __name__ == '__main__':
    main()
