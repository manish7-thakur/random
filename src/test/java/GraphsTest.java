import org.junit.*;
import java.util.*;
import static java.util.stream.Collectors.*;

public class GraphsTest {
  @Test
  public void cloneGraphWithGivenNode() {
    GraphNode node1 = new GraphNode(1);
    GraphNode actual = Graphs.cloneGraph(node1);
    Assert.assertEquals(node1._val, actual._val);
    Assert.assertNotSame(node1, actual);

    node1 = new GraphNode(1, List.of(new GraphNode(2)));
    actual = Graphs.cloneGraph(node1);
    Assert.assertEquals(node1._val, actual._val);
    Assert.assertNotSame(node1, actual);
    Assert.assertNotSame(node1._neighbours, actual._neighbours);
    Assert.assertEquals(node1._neighbours.get(0)._val, actual._neighbours.get(0)._val);

    GraphNode node2 = new GraphNode(2);
    node1 = new GraphNode(1, List.of(node2));
    node2._neighbours.add(node1);
    actual = Graphs.cloneGraph(node1);
    Assert.assertEquals(node1._val, actual._val);
    Assert.assertNotSame(node1, actual);
    Assert.assertEquals(2, actual._neighbours.get(0)._val);
    Assert.assertEquals(1, actual._neighbours.get(0)._neighbours.get(0)._val);

    GraphNode node3 = new GraphNode(3);
    node1 = new GraphNode(1);
    node2 = new GraphNode(2);
    node1._neighbours.addAll(List.of(node2, node3));
    node2._neighbours.addAll(List.of(node1, node3));
    node3._neighbours.addAll(List.of(node1, node2));
    actual = Graphs.cloneGraph(node1);
    Assert.assertEquals(node1._val, actual._val);
    Assert.assertNotSame(node1, actual);
    Assert.assertEquals(List.of(2, 3), actual._neighbours.stream().map(n -> n._val).collect(toList()));
    Assert.assertEquals(List.of(1, 3), actual._neighbours.get(0)._neighbours.stream().map(n -> n._val).collect(toList()));
    Assert.assertEquals(List.of(1, 2), actual._neighbours.get(1)._neighbours.stream().map(n -> n._val).collect(toList()));
  }
}
