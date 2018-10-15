package org.akulikov.SimpleGraphLib;

import java.util.*;

abstract class AbstractGraph implements Graph{
    protected Map<Vertex,List<Vertex>> adjacentList= new HashMap<>();

    public synchronized Vertex addVertex() {
        Vertex v=new Vertex();
        adjacentList.put(v, new ArrayList<>());
        return v;
    }
    public abstract void addEdge(Vertex source, Vertex target);
    private Set<Vertex> used= new HashSet<>();
    public List<Vertex> dfs(Vertex source, Vertex target) {

        used.add(source);
        List<Vertex> result= new ArrayList<>();

        if(outNeighbors(source).contains(target))
        {
            result.add(target);
        }else{
            result.addAll(outNeighbors(source).stream()
                    .filter(v-> !used.contains(v))
                    .map(v-> dfs(v,target) )
                    .filter(l->l.size()>0)
                    .findFirst()
                    .orElse(new ArrayList<>()));
        }
        if(result.size()>0)result.add(0,source);
        return result;
    }

    public List<Edge> getPath(Vertex source, Vertex target) {

        List<Vertex> path= dfs(source, target);
        List<Edge> result=new ArrayList<>();
        for(int i=0;i<path.size()-1;i++){
            result.add(new Edge(path.get(i),path.get(i+1)));
        }
        used= new HashSet<>();
        return result;
    }

    public List<Vertex> outNeighbors(Vertex v) {
        return adjacentList.get(v);

    }

}