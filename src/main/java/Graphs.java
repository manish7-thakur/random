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
    for(int[] p : prerequisites) {
      if(!canFinishRec(p[0], map, new HashSet<>())) return false;
    }
    return true;
  }
  static boolean canFinishRec(int course, Map<Integer, Set<Integer>> map, Set<Integer> visited) {
    if(map.get(course) == null) return true;
    if(visited.contains(course)) return false;
    visited.add(course);
    for(int c : map.get(course)) {
      if(!canFinishRec(c, map, visited)) return false;
    }
    visited.remove(course);
    return true;
  }
}
