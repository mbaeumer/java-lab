package se.mbaeumer.javalab.java20.records;

import java.util.List;

public record Graph(List<Node> nodes, List<Edge> edges) {

    public void addObject(Object o){
        if (o instanceof Node(int id, String name)){
            nodes.add(new Node(id, name));
        }else if (o instanceof Edge(int id, int start, int end)){
            edges.add(new Edge(id, start, end));
        }

    }

}
