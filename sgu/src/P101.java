import java.util.*;

/**
 * User: Aphrodite
 * Date: 12-4-7
 * Time: AM11:52
 */

public class P101 {
  public static void main(String[] args) {
    new P101().solve();
  }

  public void solve() {
    Scanner in = new Scanner(System.in);
    int[] node = new int[7];
    int[][] graph = new int[7][7];
    int n = in.nextInt();
    int[][] domino = new int[n + 1][2];
    for (int i = 1; i <= n; i++) {
      int x = in.nextInt(), y = in.nextInt();
      domino[i][0] = x;
      domino[i][1] = y;
      node[x]++;
      node[y]++;
      graph[x][y]++;
      graph[y][x]++;
    }
    if (check(graph, node) == false) {
      System.out.println("No solution");
    } else {
      int start = 0;
      while (node[start] == 0) {
        start++;
      }
      for (int i = 0; i < node.length; i++) {
        if (node[i] % 2 != 0) {
          start = i;
          break;
        }
      }
      List<Integer> path = new ArrayList<Integer>();
      eulerLoopPath(graph, start, path);
//      System.out.println(path);
      boolean[] used = new boolean[domino.length];
      for (int i = 1; i < path.size(); i++) {
        int x = path.get(i - 1), y = path.get(i);
        for (int j = 1; j < domino.length; j++) {
          if (used[j] == false && domino[j][0] == x && domino[j][1] == y) {
            used[j] = true;
            System.out.println(j + " +");
            break;
          } else if (used[j] == false && domino[j][0] == y && domino[j][1] == x) {
            used[j] = true;
            System.out.println(j + " -");
            break;
          }
        }
      }
    }
  }

  void eulerLoopPath(int[][] graph, int start, List<Integer> path) {
    for (int i = 0; i < graph.length; i++) {
      if (graph[start][i] > 0) {
        graph[start][i]--;
        graph[i][start]--;
        eulerLoopPath(graph, i, path);
      }
    }
    path.add(start);
  }

  boolean isConnected(int[][] graph, int[] node) {
    int start = 0;
    while (node[start] == 0) {
      start++;
    }
    boolean[] visited = new boolean[node.length];
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.addLast(start);
    while (list.isEmpty() == false) {
      Integer first = list.removeFirst();
      visited[first] = true;
      for (int i = 0; i < node.length; i++) {
        if (!visited[i] && graph[i][first] > 0) {
          list.addLast(i);
        }
      }
    }
    for (int i = 0; i < node.length; i++) {
      if (node[i] > 0 && visited[i] == false) {
        return false;
      }
    }
    return true;
  }

  boolean check(int[][] graph, int[] node) {
    if (isConnected(graph, node) == false) {
      return false;
    }
    int odd = 0;
    for (int i = 0; i < node.length; i++) {
      if (node[i] % 2 != 0) {
        odd++;
      }
    }
    if (odd == 2 || odd == 0) {
      return true;
    } else {
      return false;
    }
  }
}