class DisjointSet {
  public DisjointSet(int n) {
    root = new int[n + 1];
    for (int i = 0; i < root.length; i++) {
      root[i] = i;
    }
    rank = new int[n + 1];
  }

  public int find(int element) {
    if (root[element] != element) {
      root[element] = find(root[element]);
    }
    return root[element];
  }

  public void union(int x, int y) {
    if (x == y) {
      return;
    }
    x = find(x);
    y = find(y);
    if (rank[x] < rank[y]) {
      root[x] = y;
      rank[y]++;
    } else {
      root[y] = x;
      rank[x]++;
    }
  }

  private int[] root;
  private int[] rank;
}