# Simple Graph lib:
[![Build Status](https://travis-ci.org/arechesk/SimpleGraphLib.svg?branch=master)](https://travis-ci.org/arechesk/SimpleGraphLib)

Support 2 types of [graphs](src/main/java/org/akulikov/SimpleGraphLib/AbstractGraph.java) - [directed](src/main/java/org/akulikov/SimpleGraphLib/DirectedGraph.java) and [undirected](src/main/java/org/akulikov/SimpleGraphLib/UndirectedGraph.java) with 3 operations:

addVertex - adds vertex to the graph 
```java
   Vertex addVertex()
   ```

addEdge - adds edge to the graph
```java
   void addEdge(Vertex source,Vertex target)
   ```

getPath - returns a list of edges between 2 vertices (path doesn’t have to be optimal) 
```java
   List<Edge> getPath(Vertex source, Vertex target) 
   ```

## Example:
```java
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
```
