package se.mbaeumer.javalab.java20;

import se.mbaeumer.javalab.java20.records.Edge;
import se.mbaeumer.javalab.java20.records.Graph;
import se.mbaeumer.javalab.java20.records.Node;

import java.util.ArrayList;

// examples of some new features from Java 20 based on https://www.happycoders.eu/java/java-20-features/
public class Main {
    public static void main(String[] args){
        Graph graph = new Graph(new ArrayList<>(), new ArrayList<>());
        Edge edge = new Edge(1, 1, 2);
        graph.addObject(edge);
        Node node = new Node(1, "node1");
        graph.addObject(node);
        System.out.println("Number of nodes: " + graph.nodes().size());
        System.out.println("Number of edges: " + graph.edges().size());


    }
}
