package org.akulikov.SimpleGraphLib;

import java.util.List;

public interface Graph {
    Vertex addVertex();
    Vertex addVertex(Vertex vertex);
    void addEdge(Vertex source,Vertex target);
    List<Edge> getPath(Vertex source, Vertex target);
}
