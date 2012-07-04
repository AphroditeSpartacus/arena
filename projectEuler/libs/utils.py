__author__ = 'Aphrodite'

def isPrime(n):
    if n < 2:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    for x in range(3, int(n ** 0.5 + 1), 2):
        if n % x == 0:
            return False
    return True


def isPalindromicString(s):
    i, j = 0, len(s) - 1
    while i < j:
        if s[i] != s[j]:
            return False
        i += 1
        j -= 1
    return True

if __name__ == '__main__':
    print(isPrime(97))
    print(isPalindromicString('abaa'))