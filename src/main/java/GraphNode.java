import java.util.*;

public class GraphNode {
  public int val;
  public List<GraphNode> neighbours;
  public GraphNode() {
    val = 0;
    neighbours = new ArrayList<>();
  }
  public GraphNode(int val) {
    this.val = val;
    neighbours = new ArrayList<>();
  }
  public GraphNode(int val, List<GraphNode> neighbours) {
    this.val = val;
    this.neighbours = neighbours;
  }
}
