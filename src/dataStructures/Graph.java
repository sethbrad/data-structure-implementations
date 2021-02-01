package dataStructures;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    class Vertex {
        String label;

        public Vertex(String label) {
            this.label = label;
        }
    }

    private HashMap<Vertex, ArrayList<Vertex>> graph;
    private int numVertices;

    public Graph() {
        graph = new HashMap<Vertex, ArrayList<Vertex>>();
        numVertices = 0;
    }

    public void addVertex(String label) {
        graph.putIfAbsent(new Vertex(label), new ArrayList<Vertex>());
        numVertices++;
    }

    public void addEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);

        graph.get(v1).add(v2);
        graph.get(v2).add(v1);
    }

    public ArrayList<Vertex> getNeighbors(String label) {
        return graph.get(new Vertex(label));
    }

    public int[][] adjMatrix() {
        //TODO
        int[][] matrix = new int[numVertices][numVertices];
        return matrix;
    }

    public LinkedList[] adjList() {
        //TODO
        LinkedList[] list = new LinkedList[numVertices];
        return list;
    }

}
