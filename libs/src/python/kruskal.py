def kruskal(graph):
    def find(components, u):
        if components[u] != u:
            components[u] = find(components, components[u])
        return components[u]

    def union(components, ranks, u, v):
        u, v = find(components, u), find(components, v)
        if ranks[u] > ranks[v]:
            components[v] = u
        elif ranks[u] < ranks[v]:
            components[u] = v
        else:
            components[u] = v
            ranks[v] += 1

    edges = [(graph[u][v], u, v) for u in graph for v in graph[u]]
    tree = set()
    components = {u:u for u in graph}
    ranks = {u: 0 for u in graph}
    for _, u, v in sorted(edges):
        if find(components, u) != find(components, v):
            tree.add((u, v))
            union(components, ranks, u, v)
    return tree
