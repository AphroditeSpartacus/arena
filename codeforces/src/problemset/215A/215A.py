n = int(raw_input())
a = map(int, raw_input().split())
m = int(raw_input())
b = map(int, raw_input().split())

m = 0
res = 0
for x in a:
    for y in b:
        if y % x == 0:
            k = y / x
            if k > m:
                res = 1
                m = k
            elif k == m:
                res += 1

print res