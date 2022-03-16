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
}
