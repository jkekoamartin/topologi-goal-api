package com.example.debuggerstpo.topologigoalapi.controllers;

import com.example.debuggerstpo.topologigoalapi.ds.TGGraph;
import com.example.debuggerstpo.topologigoalapi.models.Stone;
import com.example.debuggerstpo.topologigoalapi.services.TGGraphService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GraphController {

    private TGGraphService tgGraphService;

    public GraphController(TGGraphService tgGraphService) {
        this.tgGraphService = tgGraphService;
    }

    @RequestMapping(value = "/graph/{graphName}")
    public TGGraph<Stone> getGraph(@PathVariable(name = "graphName") String graphName) {



        // get one of users graphs, they should able to make multiple.

        // It may be too complex, but it would be cool if graph could intersect. Each graph could be a 'view' of the
        // super graph. If user kept up with tracking their goals, they could have an impressively huge graph as
        // testament their progress and accomplishments
    return tgGraphService.getGraphByName(graphName);
    }

}
