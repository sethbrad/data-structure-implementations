package dataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
