__author__ = 'Aphrodite'

def fib(n):
    x, y = 0, 1
    while y < n:
        yield y
        x, y = y, x + y

alist = list(fib(4000000))

print(sum([x for x in alist if x % 2 == 0]))