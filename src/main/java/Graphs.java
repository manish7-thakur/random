import java.util.*;
import static java.util.stream.Collectors.*;
public class Graphs {
  static public GraphNode cloneGraph(GraphNode node) {
    Map<GraphNode, GraphNode> map = new HashMap<>();
    if(node == null) return null;
    return cloneGraphRec(node, map);
  }
  static GraphNode cloneGraphRec(GraphNode node, Map<GraphNode, GraphNode> map) {
    if(map.containsKey(node)) return map.get(node);
    GraphNode clone = new GraphNode(node.val);
    map.put(node, clone);
    List<GraphNode> clonedneighbors = node.neighbors.stream().map(n -> cloneGraphRec(n , map)).collect(toList());
    clone.neighbors.addAll(clonedneighbors);
    return clone;
  }
  static public boolean canFinish(int numCourses, int[][] prerequisites) {
    Map<Integer, Set<Integer>> map = Arrays.stream(prerequisites).collect(groupingBy(arr -> arr[0], mapping(arr -> arr[1], toSet())));
    boolean[] visited = new boolean[numCourses];
    Boolean[] finished = new Boolean[numCourses];
    for(int[] p : prerequisites) {
      if(!canFinishRec(p[0], map, visited, finished)) return false;
    }
    return true;
  }
  static boolean canFinishRec(int course, Map<Integer, Set<Integer>> map, boolean[] visited, Boolean[] finished) {
    if(map.get(course) == null) return true;
    if(finished[course] != null) return finished[course];
    if(visited[course]) return false;
    visited[course] = true;
    for(int c : map.get(course)) {
      if(!canFinishRec(c, map, visited, finished)) return false;
      else finished[c] = true;
    }
    visited[course] = false;
    return true;
  }
}
