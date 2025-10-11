package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<Integer, List<Integer>> adjlist;

    public Graph(){
        adjlist = new HashMap<>();
    }

    public void advertex(int ver){
        adjlist.putIfAbsent(ver, new ArrayList<>());
    }

    public void addedge(int src,int dest){
        adjlist.putIfAbsent(src, new ArrayList<>());
        adjlist.putIfAbsent(dest,new ArrayList<>());
        adjlist.get(src).add(dest);
        adjlist.get(dest).add(src);
    }

    public void printGraph() {
        for (int vertex : adjlist.keySet()) {
            System.out.println(vertex + " -> " + adjlist.get(vertex));
        }
    }
}
