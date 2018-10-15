package org.akulikov.SimpleGraphLib;

public class Edge {
    Vertex source;
    Vertex target;

    public Edge(Vertex source, Vertex target) {
        this.source=source;
        this.target=target;
    }

    @Override
    public String toString(){
        return "("+source.getID()+", "+target.getID()+")";
    }
}
