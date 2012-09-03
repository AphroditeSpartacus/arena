from libs.utils import *

__author__ = 'Aphrodite'

def findLargestPrimeFactor(n):
    if isPrime(n):
        return n
    res = None
    for x in range(1, n):
        if x * x > n:
            break
        if n % x == 0 and isPrime(x):
            res = x
    return res

#print(findLargestPrimeFactor(13195))
print(findLargestPrimeFactor(600851475143))