package org.akulikov.SimpleGraphLib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndirectedGraph implements Graph {
    Map<Vertex,List<Vertex>> adjList=new HashMap<Vertex, List<Vertex>>();
    public synchronized Vertex addVertex() {
        Vertex v=new Vertex();
        adjList.put(v, new ArrayList<Vertex>());
        return v;
    }

    public synchronized void addEdge(Vertex source, Vertex target) {
        adjList.get(source).add(target);
        adjList.get(target).add(source);

    }

    public List<Edge> getPath(Vertex source, Vertex target) {
        return null;
    }
    public List<Vertex> out_neighbors(Vertex v) {
        return adjList.get(v);

    }
}
