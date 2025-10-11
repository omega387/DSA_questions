package Graph;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph();
        g.advertex(2);
        g.addedge(2,3);
        g.addedge(2,4);
        g.printGraph();
    }
}
