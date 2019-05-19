package com.example.debuggerstpo.topologigoalapi.ds;

import org.springframework.stereotype.Component;


public class TGGraph<Stone> {

    // TODO: need to add guava to the project, so we can use it's graph data structure and methods
    
    // This can live in memory only I think -- trying to persist the entire object seems messy.
    // We will need to store the relationships between stones in the DB somehow, and then load it to this Graph.
    // Application will operate on the graph, then update modified objects in the DB.
    
    // To store the relationships, I think we can just store edges in the DB.
    
    // A --> B
    // B --> E
    // A --> E
    
    // To load into the object, we can query for all edges in a given graph, then iterate through each edge to build 
    // the graph. So the constructor fo the graph can be List<TGEdge>


    public TGGraph() {
        
        build();
    }

    private void build() {
    }
}
