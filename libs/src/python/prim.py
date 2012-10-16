def prim(graph, source):
    tree, queue = {}, [(0, None, source)]
    while queue:
        _, p, u = heapq.heappop(queue)
        if u in tree:
            continue
        tree[u] = p
        for v, weight in graph[u].items():
            heapq.heappush(queue, (weight, u, v))
    return tree
