package tests;

import dataStructures.Graph;

public class GraphTests {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex("apple");
        graph.addVertex("banana");
        graph.addEdge("apple", "banana");


    }
}
