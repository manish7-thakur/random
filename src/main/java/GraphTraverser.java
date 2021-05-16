import java.util.*;

public class GraphTraverser {
    static ArrayList<Character> dfs(Map<Vertex, ArrayList<Vertex>> adjList) {
        ArrayList<Character> vertices = new ArrayList<>();
        for (Map.Entry<Vertex, ArrayList<Vertex>> entry : adjList.entrySet()) {
            dfsVisit(entry.getKey(), vertices, adjList);
        }
        return vertices;
    }

    private static void dfsVisit(Vertex ver, ArrayList<Character> list, Map<Vertex, ArrayList<Vertex>> adjList) {
        if (!ver.isVisited()) {
            ver.setVisited(true);
            for (Vertex v : adjList.getOrDefault(ver, new ArrayList<>())) {
                dfsVisit(v, list, adjList);
            }
            list.add(ver.getName());
        }
    }

    static List<Character> topSort(Map<Vertex, ArrayList<Vertex>> adjList) {
        LinkedList<Character> vertices = new LinkedList<>();
        for (Map.Entry<Vertex, ArrayList<Vertex>> entry : adjList.entrySet()) {
            dfsVisitTopSort(entry.getKey(), vertices, adjList);
        }
        return vertices;
    }

    private static void dfsVisitTopSort(Vertex ver, LinkedList<Character> list, Map<Vertex, ArrayList<Vertex>> adjList) {
        if (!ver.isVisited()) {
            ver.setVisited(true);
            for (Vertex v : adjList.getOrDefault(ver, new ArrayList<>())) {
                dfsVisitTopSort(v, list, adjList);
            }
            list.addFirst(ver.getName());
        }
    }

    public static List<Character> findOrder(int numCourses, char[][] prerequisites) {
        Map<Vertex, ArrayList<Vertex>> map = new HashMap<>();
        Map<Character, Vertex> uniqueVertices = new HashMap<>();
        for (char[] arr : prerequisites) {
            Vertex v1 = uniqueVertices.getOrDefault(arr[1], new Vertex(arr[1], false));
            uniqueVertices.put(arr[1], v1);
            Vertex v2 = uniqueVertices.getOrDefault(arr[0], new Vertex(arr[0], false));
            uniqueVertices.put(arr[0], v2);
            ArrayList<Vertex> list = map.getOrDefault(v1, new ArrayList<>(numCourses));
            list.add(v2);
            map.put(v1, list);
        }
        return topSort(map);
    }
}