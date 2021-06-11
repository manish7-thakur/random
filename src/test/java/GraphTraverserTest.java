//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.*;
//
//public class GraphTraverserTest {
//    @Test
//    public void dfsTraversal() {
//        Map<Vertex, ArrayList<Vertex>> adjList = new HashMap<>();
//        ArrayList<Vertex> listA = new ArrayList<Vertex>();
//        Vertex a = new Vertex('a', false);
//        Vertex b = new Vertex('b', false);
//        listA.add(b);
//        adjList.put(a, listA);
//        ArrayList<Character> actual = GraphTraverser.dfs(adjList);
//        List<Character> expected = Arrays.asList('b', 'a');
//        Assert.assertEquals(expected, actual);
//
//        a.setVisited(false);
//        b.setVisited(false);
//        Vertex c = new Vertex('c', false);
//        Vertex d = new Vertex('d', false);
//        ArrayList<Vertex> listC = new ArrayList<>(Arrays.asList(b, d));
//        adjList.put(c, listC);
//        actual = GraphTraverser.dfs(adjList);
//        expected = Arrays.asList('b', 'a', 'd', 'c');
//        Assert.assertEquals(expected, actual);
//
//
//        Vertex s = new Vertex('s', false);
//        Vertex t = new Vertex('t', false);
//        Vertex u = new Vertex('u', false);
//        Vertex v = new Vertex('v', false);
//        Vertex w = new Vertex('w', false);
//        Vertex x = new Vertex('x', false);
//        Vertex y = new Vertex('y', false);
//        Vertex z = new Vertex('z', false);
//        ArrayList<Vertex> listS = new ArrayList<>(Arrays.asList(z, w));
//        ArrayList<Vertex> listT = new ArrayList<>(Arrays.asList(u, v));
//        ArrayList<Vertex> listU = new ArrayList<>(Arrays.asList(v));
//        ArrayList<Vertex> listV = new ArrayList<>(Arrays.asList(s, w));
//        ArrayList<Vertex> listW = new ArrayList<>(Arrays.asList(x));
//        ArrayList<Vertex> listX = new ArrayList<>(Arrays.asList(z));
//        ArrayList<Vertex> listY = new ArrayList<>(Arrays.asList(x));
//        ArrayList<Vertex> listZ = new ArrayList<>(Arrays.asList(y, w));
//        adjList.clear();
//        adjList.put(s, listS);
//        adjList.put(t, listT);
//        adjList.put(u, listU);
//        adjList.put(v, listV);
//        adjList.put(w, listW);
//        adjList.put(x, listX);
//        adjList.put(y, listY);
//        adjList.put(z, listZ);
//        actual = GraphTraverser.dfs(adjList);
//        expected = Arrays.asList('x', 'y', 'w', 'z', 's', 'v', 'u', 't');
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void topologicalSort() {
//        Map<Vertex, ArrayList<Vertex>> adjList = new HashMap<>();
//        Vertex m = new Vertex('m', false);
//        Vertex n = new Vertex('n', false);
//        Vertex o = new Vertex('o', false);
//        Vertex p = new Vertex('p', false);
//        Vertex q = new Vertex('q', false);
//        Vertex r = new Vertex('r', false);
//        Vertex s = new Vertex('s', false);
//        Vertex t = new Vertex('t', false);
//        Vertex u = new Vertex('u', false);
//        Vertex v = new Vertex('v', false);
//        Vertex w = new Vertex('w', false);
//        Vertex x = new Vertex('x', false);
//        Vertex y = new Vertex('y', false);
//        Vertex z = new Vertex('z', false);
//        ArrayList<Vertex> listM = new ArrayList<>(Arrays.asList(r, q, x));
//        ArrayList<Vertex> listN = new ArrayList<>(Arrays.asList(o, u, q));
//        ArrayList<Vertex> listO = new ArrayList<>(Arrays.asList(s, r));
//        ArrayList<Vertex> listP = new ArrayList<>(Arrays.asList(o, s, z));
//        ArrayList<Vertex> listQ = new ArrayList<>(Arrays.asList(t));
//        ArrayList<Vertex> listR = new ArrayList<>(Arrays.asList(u, y));
//        ArrayList<Vertex> listS = new ArrayList<>(Arrays.asList(r));
//        ArrayList<Vertex> listU = new ArrayList<>(Arrays.asList(t));
//        ArrayList<Vertex> listV = new ArrayList<>(Arrays.asList(w, x));
//        ArrayList<Vertex> listW = new ArrayList<>(Arrays.asList(z));
//        ArrayList<Vertex> listY = new ArrayList<>(Arrays.asList(v));
//        adjList.put(m, listM);
//        adjList.put(n, listN);
//        adjList.put(o, listO);
//        adjList.put(p, listP);
//        adjList.put(q, listQ);
//        adjList.put(r, listR);
//        adjList.put(s, listS);
//        adjList.put(u, listU);
//        adjList.put(v, listV);
//        adjList.put(w, listW);
//        adjList.put(y, listY);
//        List<Character> actual = GraphTraverser.topSort(adjList);
//        List<Character> expected = Arrays.asList('n', 'm', 'q', 'p', 'o', 's', 'r', 'y', 'v', 'x', 'w', 'z', 'u', 't');
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void courseSchedule() {
//    	List<Character> actual = GraphTraverser.findOrder(1, new char[][]{});
//        List<Character> expected = Collections.emptyList();
//        Assert.assertEquals(actual, expected);
//
//        actual = GraphTraverser.findOrder(2, new char[][]{{'1', '0'}});
//        expected = List.of('0', '1');
//        Assert.assertEquals(actual, expected);
//
//        actual = GraphTraverser.findOrder(4, new char[][]{{'1', '0'}, {'2', '0'}, {'3', '1'}, {'3', '2'}});
//        expected = List.of('0', '2', '1', '3');
//        Assert.assertEquals(actual, expected);
//    }
//}