package org.akulikov.SimpleGraphLib;

import java.util.*;

public class DirectedGraph extends AbstractGraph {

    public synchronized void addEdge(Vertex source, Vertex target) {
        adjacentList.get(source).add(target);
    }

}
