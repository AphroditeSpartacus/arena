import operator

def rev(x):
    return int(''.join(reversed(list(str(x)))))


def main():
    n = int(raw_input())
    for x in xrange(n):
        a, b = map(int, raw_input().split())
        print rev(rev(a) + rev(b))


if __name__ == '__main__':
    main()
