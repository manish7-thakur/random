import java.util.*;
import static java.util.stream.Collectors.*;
public class Graphs {
  static public GraphNode cloneGraph(GraphNode node) {
    Map<GraphNode, GraphNode> map = new HashMap<>();
    return cloneGraphRec(node, map);
  }
  static GraphNode cloneGraphRec(GraphNode node, Map<GraphNode, GraphNode> map) {
    if(map.containsKey(node)) return map.get(node);
    GraphNode clone = new GraphNode(node._val);
    map.put(node, clone);
    List<GraphNode> cloned_neighbours = node._neighbours.stream().map(n -> cloneGraphRec(n , map)).collect(toList());
    clone._neighbours.addAll(cloned_neighbours);
    return clone;
  }
}
