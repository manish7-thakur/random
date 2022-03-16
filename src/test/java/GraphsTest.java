import org.junit.*;
import java.util.*;
import static java.util.stream.Collectors.*;

public class GraphsTest {
  @Test
  public void cloneGraphWithGivenNode() {
    GraphNode node1 = new GraphNode(1);
    GraphNode actual = Graphs.cloneGraph(node1);
    Assert.assertEquals(node1.val, actual.val);
    Assert.assertNotSame(node1, actual);

    node1 = new GraphNode(1, List.of(new GraphNode(2)));
    actual = Graphs.cloneGraph(node1);
    Assert.assertEquals(node1.val, actual.val);
    Assert.assertNotSame(node1, actual);
    Assert.assertNotSame(node1.neighbours, actual.neighbours);
    Assert.assertEquals(node1.neighbours.get(0).val, actual.neighbours.get(0).val);

    GraphNode node2 = new GraphNode(2);
    node1 = new GraphNode(1, List.of(node2));
    node2.neighbours.add(node1);
    actual = Graphs.cloneGraph(node1);
    Assert.assertEquals(node1.val, actual.val);
    Assert.assertNotSame(node1, actual);
    Assert.assertEquals(2, actual.neighbours.get(0).val);
    Assert.assertEquals(1, actual.neighbours.get(0).neighbours.get(0).val);

    GraphNode node3 = new GraphNode(3);
    node1 = new GraphNode(1);
    node2 = new GraphNode(2);
    node1.neighbours.addAll(List.of(node2, node3));
    node2.neighbours.addAll(List.of(node1, node3));
    node3.neighbours.addAll(List.of(node1, node2));
    actual = Graphs.cloneGraph(node1);
    Assert.assertEquals(node1.val, actual.val);
    Assert.assertNotSame(node1, actual);
    Assert.assertEquals(List.of(2, 3), actual.neighbours.stream().map(n -> n.val).collect(toList()));
    Assert.assertEquals(List.of(1, 3), actual.neighbours.get(0).neighbours.stream().map(n -> n.val).collect(toList()));
    Assert.assertEquals(List.of(1, 2), actual.neighbours.get(1).neighbours.stream().map(n -> n.val).collect(toList()));
  }
}
