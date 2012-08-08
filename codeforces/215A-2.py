n = int(raw_input())
a = map(int, raw_input().split())
m = int(raw_input())
b = map(int, raw_input().split())

c = [y / x for x in a for y in b if y % x == 0]
k = max(c)
print len(filter(lambda x: x == k, c))
