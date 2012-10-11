import collections
import itertools

def radix_sort(a):
    n, m = len(a), len(a[0])
    idxes = range(n)
    for k in range(m - 1, -1, -1):
        d = collections.defaultdict(list)
        for idx in idxes:
            d[a[idx][k]].append(idx)
        idxes = list(itertools.chain(*(d[i] for i in sorted(d))))
    return [a[i] for i in idxes]
