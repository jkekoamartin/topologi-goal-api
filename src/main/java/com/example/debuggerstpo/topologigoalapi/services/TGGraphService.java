package com.example.debuggerstpo.topologigoalapi.services;

import com.example.debuggerstpo.topologigoalapi.ds.TGGraph;
import com.example.debuggerstpo.topologigoalapi.models.Stone;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class TGGraphService {


//    TODO: need to build graph from DB? How should we go about it?

    public TGGraph<Stone> getGraphByName(String graphName) {

        return null;
    }
}
