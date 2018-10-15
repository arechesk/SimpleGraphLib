package org.akulikov.SimpleGraphLib;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class UndirectedGraphTest {

    @Test
    public void testPathExist(){
        Graph g=new UndirectedGraph();
        Vertex s=g.addVertex();
        Vertex n1=g.addVertex();
        Vertex t=g.addVertex();
        g.addEdge(s,n1);
        g.addEdge(n1,t);
        Assert.assertNotNull(g.getPath(s,t));
        Assert.assertEquals(2,g.getPath(s,t).size());
        Assert.assertEquals(2,g.getPath(t,s).size());

    }
    @Test
    public void testPathNotExist(){
        Graph g=new UndirectedGraph();
        Vertex s=g.addVertex();
        Vertex n1=g.addVertex();
        Vertex t=g.addVertex();
        g.addEdge(s,n1);

        Assert.assertNotNull(g.getPath(s,t));
        Assert.assertEquals(0,g.getPath(s,t).size());
        Assert.assertEquals(0,g.getPath(t,s).size());

    }

    @Test
    public void testPathExist2(){
        Graph g=new UndirectedGraph();
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
        Assert.assertEquals(4,g.getPath(s,t).size());
        Assert.assertEquals(4,g.getPath(t,s).size());

    }

}
