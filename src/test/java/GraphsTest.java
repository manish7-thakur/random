import org.junit.*;
import java.util.*;
import static java.util.stream.Collectors.*;

public class GraphsTest {
  @Test
  public void cloneGraphWithGivenNode() {
    GraphNode actual = Graphs.cloneGraph(null);
    Assert.assertNull(actual);

    GraphNode node1 = new GraphNode(1);
    actual = Graphs.cloneGraph(node1);
    Assert.assertEquals(node1.val, actual.val);
    Assert.assertNotSame(node1, actual);

    node1 = new GraphNode(1, List.of(new GraphNode(2)));
    actual = Graphs.cloneGraph(node1);
    Assert.assertEquals(node1.val, actual.val);
    Assert.assertNotSame(node1, actual);
    Assert.assertNotSame(node1.neighbors, actual.neighbors);
    Assert.assertEquals(node1.neighbors.get(0).val, actual.neighbors.get(0).val);

    GraphNode node2 = new GraphNode(2);
    node1 = new GraphNode(1, List.of(node2));
    node2.neighbors.add(node1);
    actual = Graphs.cloneGraph(node1);
    Assert.assertEquals(node1.val, actual.val);
    Assert.assertNotSame(node1, actual);
    Assert.assertEquals(2, actual.neighbors.get(0).val);
    Assert.assertEquals(1, actual.neighbors.get(0).neighbors.get(0).val);

    GraphNode node3 = new GraphNode(3);
    node1 = new GraphNode(1);
    node2 = new GraphNode(2);
    node1.neighbors.addAll(List.of(node2, node3));
    node2.neighbors.addAll(List.of(node1, node3));
    node3.neighbors.addAll(List.of(node1, node2));
    actual = Graphs.cloneGraph(node1);
    Assert.assertEquals(node1.val, actual.val);
    Assert.assertNotSame(node1, actual);
    Assert.assertEquals(List.of(2, 3), actual.neighbors.stream().map(n -> n.val).collect(toList()));
    Assert.assertEquals(List.of(1, 3), actual.neighbors.get(0).neighbors.stream().map(n -> n.val).collect(toList()));
    Assert.assertEquals(List.of(1, 2), actual.neighbors.get(1).neighbors.stream().map(n -> n.val).collect(toList()));
  }
}
