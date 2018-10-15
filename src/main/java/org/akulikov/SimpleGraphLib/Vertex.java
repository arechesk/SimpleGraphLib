package org.akulikov.SimpleGraphLib;

public class Vertex {
    static int VERTEX_COUNTER=0;

    private int ID;

    public Vertex(){
        this.ID=VERTEX_COUNTER++;
    }

    @Override
    public int hashCode(){
        return this.ID;
    }
}
