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

    private HashMap<Vertex, ArrayList<Vertex>> edges;

    public Graph() {
        edges = new HashMap<Vertex, ArrayList<Vertex>>();
    }
}
