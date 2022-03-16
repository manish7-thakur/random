import java.util.*;

public class GraphNode {
  public int val;
  public List<GraphNode> neighbors;
  public Node() {
      val = 0;
      neighbors = new ArrayList<GraphNode>();
  }
  public Node(int _val) {
      val = _val;
      neighbors = new ArrayList<GraphNode>();
  }
  public Node(int _val, ArrayList<GraphNode> _neighbors) {
      val = _val;
      neighbors = _neighbors;
  }
}
