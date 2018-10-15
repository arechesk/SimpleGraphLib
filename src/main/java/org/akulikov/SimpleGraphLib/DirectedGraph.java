package org.akulikov.SimpleGraphLib;

import java.util.*;

public class DirectedGraph implements Graph {
    Map<Vertex,List<Vertex>> adjList=new HashMap<Vertex, List<Vertex>>();
    public synchronized Vertex addVertex() {
        Vertex v=new Vertex();
        adjList.put(v, new ArrayList<Vertex>());
        return v;
    }

    public synchronized void addEdge(Vertex source, Vertex target) {
        adjList.get(source).add(target);

    }

    private Set<Vertex> used= new HashSet<>();
    public List<Vertex> dfs(Vertex source, Vertex target) {

        used.add(source);
        List<Vertex> result= new ArrayList<>();
        result.add(source);
        if(out_neighbors(source).contains(target))
        {
            result.add(target);
        }else{
            result.addAll(out_neighbors(source).stream().filter(v-> !used.contains(v)).map(v-> dfs(v,target) ).filter(l->l.size()>0).findFirst().get());
        }
        return result;
    }

    public List<Edge> getPath(Vertex source, Vertex target) {

        List<Vertex> path= dfs(source, target);
        List<Edge> result=new ArrayList<>();
        for(int i=0;i<path.size()-1;i++){
            result.add(new Edge(path.get(i),path.get(i+1)));
        }
        return result;
    }

    public List<Vertex> out_neighbors(Vertex v) {
        return adjList.get(v);

    }
}
