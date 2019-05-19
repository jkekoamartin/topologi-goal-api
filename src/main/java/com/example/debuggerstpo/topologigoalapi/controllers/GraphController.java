package com.example.debuggerstpo.topologigoalapi.controllers;

import com.example.debuggerstpo.topologigoalapi.ds.TGGraph;
import com.example.debuggerstpo.topologigoalapi.models.SteppingStone;
import com.example.debuggerstpo.topologigoalapi.models.Stone;
import com.example.debuggerstpo.topologigoalapi.services.TGGraphService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GraphController {

//    private TGGraphService tgGraphService;
//
//    @Autowired
//    public GraphController(TGGraphService tgGraphService) {
//        this.tgGraphService = tgGraphService;
//    }


//    @RequestMapping({"", "/", "index", "index.html"})
//    public String index(){
//
//        return "index";
//    }

    @RequestMapping(value = "/graph", method = RequestMethod.GET, produces = "application/json")
    public JSONObject getGraph() {

        List<Stone> stones = new ArrayList<>();

        Stone s1 = new SteppingStone("stone1", "My stone");
        Stone s2 = new SteppingStone("stone2", "My stone");

        stones.add(s1);
        stones.add(s2);

        JSONObject jsonObject = new JSONObject();


        jsonObject.append("Stones", stones.toArray());

        // get one of users graphs, they should able to make multiple.

        // It may be too complex, but it would be cool if graph could intersect. Each graph could be a 'view' of the
        // super graph. If user kept up with tracking their goals, they could have an impressively huge graph as
        // testament their progress and accomplishments

        return jsonObject;
    }

}
