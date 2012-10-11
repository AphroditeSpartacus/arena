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

def quick_sort(seq):
    def partition(seq, begin, end):
        global count

        # import random
        # pivot = begin + random.randrange(end - begin)
        pivot = begin
        head, tail = begin, end - 1
        while head < tail:
            while head < pivot and seq[head] <= seq[pivot]:
                head += 1
            if head < pivot and seq[head] > seq[pivot]:
                seq[head], seq[pivot] = seq[pivot], seq[head]
                pivot = head
                count += 1
            while tail > pivot and seq[tail] >= seq[pivot]:
                tail -= 1
            if tail > pivot and seq[tail] < seq[pivot]:
                seq[tail], seq[pivot] = seq[pivot], seq[tail]
                pivot = tail
                count += 1
        return pivot

    def quick_sort_helper(seq, begin, end):
        if begin < end:
            pivot = partition(seq, begin, end)
            quick_sort_helper(seq, begin, pivot)
            quick_sort_helper(seq, pivot + 1, end)

    quick_sort_helper(seq, 0, len(seq))


def main():
    data = map(str.rstrip, sys.stdin.readlines())
    iterator = iter(data)
    test_case = int(next(iterator))
    for test in xrange(test_case):
        next(iterator)
        n = int(next(iterator))
        # seq = [next(iterator) for i in xrange(n)]
        seq = data[2:]
        # for x in xrange(n):
        #     data[x + 2] = int(next(iterator))
        print n
        # print seq
        # quick_sort(seq)
        global count
        print count
        count = 0
        # print seq

if __name__ == '__main__':
    main()
