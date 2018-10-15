package org.akulikov.SimpleGraphLib;

import java.util.List;

public interface Graph {
    Vertex addVertex();
    void addEdge(Vertex source,Vertex target);
    List<Edge> getPath(Vertex source, Vertex target);
}
