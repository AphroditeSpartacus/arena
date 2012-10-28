def topsort(G):
    count = dict((u, 0) for u in G) # The in-degree for each node
    for u in G:
        for v in G[u]:
            count[v] += 1 # Count every in-edge
    Q = [u for u in G if count[u] == 0] # Valid initial nodes
    S = [] # The result
    while Q: # While we have start nodes...
        u = Q.pop() # Pick one
        S.append(u) # Use it as first of the rest
        for v in G[u]:
            count[v] -= 1 # "Uncount" its out-edges
            if count[v] == 0: # New valid start nodes?
                Q.append(v) # Deal with them next
    return S


def dfs_topsort(G):
    S, res = set(), [] # History and result
    def recurse(u): # Traversal subroutine
        if u in S:
            return # Ignore visited nodes
        S.add(u) # Otherwise: Add to history
        for v in G[u]:
            recurse(v) # Recurse through neighbors
        res.append(u) # Finished with u: Append it
    for u in G:
        recurse(u) # Cover entire graph
    res.reverse() # It's all backward so far
    return res