package org.akulikov.SimpleGraphLib;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DirectedGraphTest {
    @Test
    public void testPathExist(){
        Graph g=new DirectedGraph();
        Vertex s=g.addVertex();
        Vertex n1=g.addVertex();
        Vertex t=g.addVertex();
        g.addEdge(s,n1);
        g.addEdge(n1,t);
        List<Edge> path= g.getPath(s,t);
        Assert.assertNotNull(path);
        Assert.assertEquals(2,path.size());

    }
    @Test
    public void testPathNotExist(){
        Graph g=new DirectedGraph();
        Vertex s=g.addVertex();
        Vertex n1=g.addVertex();
        Vertex t=g.addVertex();
        g.addEdge(s,n1);
        List<Edge> path= g.getPath(s,t);
        Assert.assertNotNull(path);
        Assert.assertEquals(0,path.size());

    }

    @Test
    public void testPathExist2(){
        Graph g=new DirectedGraph();
        Vertex s=g.addVertex();
        Vertex a=g.addVertex();
        Vertex b=g.addVertex();
        Vertex c=g.addVertex();
        Vertex d=g.addVertex();
        Vertex e=g.addVertex();
        Vertex t=g.addVertex();
        Vertex f=g.addVertex();
        g.addEdge(s,a);
        g.addEdge(s,b);
        g.addEdge(a,c);
        g.addEdge(c,d);
        g.addEdge(b,e);
        g.addEdge(e,f);
        g.addEdge(f,t);
        List<Edge> path= g.getPath(s,t);
        Assert.assertNotNull(path);
        Assert.assertEquals(4,path.size());

    }

    @Test
    public void t(){
        Graph graph = new DirectedGraph();
        Vertex v1 = graph.addVertex();
        Vertex v2 = graph.addVertex();
        Vertex v3 = graph.addVertex();
        Vertex v4 = graph.addVertex();
        Vertex v5 = graph.addVertex();
        Vertex v6 = graph.addVertex();

        graph.addEdge(v1, v2);
        graph.addEdge(v1, v5);
        graph.addEdge(v1, v6);
        graph.addEdge(v2, v3);
        graph.addEdge(v2, v5);
        graph.addEdge(v3, v4);
        graph.addEdge(v5, v4);

        graph.getPath(v1,v4);
    }

}