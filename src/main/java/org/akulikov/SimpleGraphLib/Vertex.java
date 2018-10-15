package org.akulikov.SimpleGraphLib;

public class Vertex<T> {
    static int VERTEX_COUNTER=0;

    private int ID;
    private T value;

    public T getValue(){
        return value;
    }

    public int getID(){
        return this.ID;
    }

    public Vertex(){
        this.ID=VERTEX_COUNTER++;
    }

    public Vertex(T value){
        this.ID=VERTEX_COUNTER++;
        this.value=value;
    }

    @Override
    public int hashCode(){
        return this.ID;
    }
}
