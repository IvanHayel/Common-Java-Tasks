package field.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BreadthFirstSearch {
  private final int v;
  private final LinkedList<Integer>[] adjacents;

  public BreadthFirstSearch(int v) {
    if (v < 0) {
      throw new IllegalArgumentException();
    }
    this.v = v;
    adjacents = new LinkedList[v];
    for (int i = 0; i < v; i++) {
      adjacents[i] = new LinkedList<>();
    }
  }

  public void addEdge(int v, int w) {
    adjacents[v].add(w);
  }

  public List<Integer> search(int start) {
    List<Integer> data = new ArrayList<>();
    boolean[] visited = new boolean[v];
    LinkedList<Integer> queue = new LinkedList<>();
    visited[start] = true;
    queue.add(start);
    while (!queue.isEmpty()) {
      start = queue.poll();
      data.add(start);
      for (int next : adjacents[start]) {
        if (!visited[next]) {
          visited[next] = true;
          queue.add(next);
        }
      }
    }
    return data;
  }
}
