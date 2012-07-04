from libs.utils import *

__author__ = 'Aphrodite'

def isPalindromicNumber(n):
    return isPalindromicString(str(n))

res = 0
for x in range(100, 1000):
    for y in range(x, 1000):
        if isPalindromicNumber(x * y):
            res = max(res, x * y)


print(res)