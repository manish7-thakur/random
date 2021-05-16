public class Vertex {
    private char name;
    private boolean visited;

    public Vertex(char name, boolean visited) {
        this.name = name;
        this.visited = visited;
    }

    public char getName() {
        return name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean value) {
        visited = value;
    }

    @Override
    public int hashCode() {
        return name;
    }

    @Override
    public boolean equals(Object other) {
        Vertex v = (Vertex) other;
        return this.name == v.name;
    }
}