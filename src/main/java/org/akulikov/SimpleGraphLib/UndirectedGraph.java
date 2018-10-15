package org.akulikov.SimpleGraphLib;

import java.util.*;

public class UndirectedGraph extends AbstractGraph {


    public synchronized void addEdge(Vertex source, Vertex target) {
        adjacentList.get(source).add(target);
        adjacentList.get(target).add(source);
    }

}
