from functools import reduce
from operator import add, mul

__author__ = 'Aphrodite'

x = reduce(mul, range(1, 3))

for x in 'abc':
    print(x)
